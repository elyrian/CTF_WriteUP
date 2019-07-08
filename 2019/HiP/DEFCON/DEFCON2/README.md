## DEFCON2

### Description

DEFCON is the website controlling the security level of the room. The 5 different levels allows to warn the population of the risk of a potential nuclear war. Levels ranges from 5 (peacetime) to 1 (maximum alert). Try level 2.

### Details

- Categories : Reverse
- Validations : 6
- Url : http://defcon.challs.malice.fr/
- Points : 200

### Resolution

For this challenge, we have a look at the check2(pwd) function.

```
function check2(pwd) {
  return new Promise((resolve, reject) => {
    const timeout = setTimeout(() => reject(new Error('Timeout while executing JVM')), 200000);
    new Doppio.VM.JVM({
        doppioHomePath: '/sys',
        classpath: ['/sys/classes'],
      }, function (err, jvm) {
        if (err) {
          return reject(err);
        }

        const process = BrowserFS.BFSRequire('process');
        process.initializeTTYs();
        process.stdout.on('data', function (data) {
          const messageStr = data.toString();
          if (messageStr.startsWith('result=')) {
            process.removeAllListeners();
            process.stdout.removeAllListeners();
            resolve(messageStr.slice('result='.length) === 'true');
            clearTimeout(timeout);
          }
        });

        jvm.runClass('App', [pwd], function (exitCode) {
          console.log('JVM started successfully');
          if (exitCode !== 0) {
            reject(new Error('Script execution failed'));
          }
        });
      });
    });
  }
```

#### Preliminary Analysis

This challenge is much harder than the previous ones. It seems that there is a link with a JVM (Java Virtual Machine). I did not know about Doppio, so let’s google it ! Hmm, “Restaurant in Paris” ? Nope, let’s try “Doppio JS”... Much better ! Indeed, it implements a JVM 100% in javascript. So, the challenge should probably run a Java code to check the password.

The following piece of code seems pretty interesting:

```
jvm.runClass('App', [pwd], function (exitCode) {
  console.log('JVM started successfully');
  if (exitCode !== 0) {
    reject(new Error('Script execution failed'));
  }
});
```

It seems to run a java class named App, with a parameter [pwd], and checks the exitCode of the java class.

#### App.class

To retrieve the java code used to check the 2nd level password, it is necessary to intercept the files that are downloaded by your web browser. For example, you can use the Inspect element tool of the browser. The password checking for the 2nd level takes a few minutes, go get a coffee and come back. Many .jar files are downloaded, but also... A App.class file !

Many tools exist to decompile Java .class files. I choosed to use an online website (http://www.javadecompilers.com/) and obtained the code given in `App.java`.
The main function calls 10 functions and check if the base64-encoded result is equal to `ZvhdxFZGZaN/M1IvAD8qaJI9UQqPluT45250BfOZPygRl68GGZqZ7QS+GTFUGcONT8r7cEkTh8gSgELMXdcURGPb25wfCIrVG6ptrLr6GJ9IpBeLP40Gu1VKwZJtdw75ud+LNgXop0KE4CGm8cCx6eqwnAFioKvBkJQEjQ==`.

```
public static void main(String[] paramArrayOfString)
{
  byte[] arrayOfByte = paramArrayOfString[0].getBytes();
  arrayOfByte = base64_0(arrayOfByte);
  arrayOfByte = password_enchiffragement_1(arrayOfByte);
  arrayOfByte = base64_2(arrayOfByte);
  arrayOfByte = password_enchiffragement_3(arrayOfByte);
  arrayOfByte = base64_4(arrayOfByte);
  arrayOfByte = password_enchiffragement_5(arrayOfByte);
  arrayOfByte = base64_6(arrayOfByte);
  arrayOfByte = password_enchiffragement_7(arrayOfByte);
  arrayOfByte = password_enchiffragement_8(arrayOfByte);
  arrayOfByte = password_enchiffragement_9(arrayOfByte);
  boolean bool = java.util.Base64.getEncoder().encodeToString(arrayOfByte).equals("ZvhdxFZGZaN/M1IvAD8qaJI9UQqPluT45250BfOZPygRl68GGZqZ7QS+GTFUGcONT8r7cEkTh8gSgELMXdcURGPb25wfCIrVG6ptrLr6GJ9IpBeLP40Gu1VKwZJtdw75ud5+LNgXop0KE4CGm8cCx6eqwnAFioKvBkJQEjQ==");
  System.out.println("result=" + bool);
}
```

To retrieve the correct password, we have to reverse each transformation
function.

#### password_enchiffragement_ functions

The password enchiffragement functions are structured as follows:

```
public static byte[] password_enchiffragement_9(byte[] paramArrayOfByte)
{
  int i = 0;
  int j = 97;
  for (;;) {
    try {
      j = paramArrayOfByte[i];
    } catch (Exception localException) {
      break;
    }
    i++;
  }

  if (i * i * 40000L + i * 78L != 615049672L) {
    System.out.println("result=false");
    System.exit(0);
  }

  byte[] arrayOfByte = new byte[124];
  arrayOfByte[0] = ((byte)(paramArrayOfByte[5] ^ 0x8D));
  arrayOfByte[1] = ((byte)(paramArrayOfByte[98] ^ 0x4B));
  arrayOfByte[2] = ((byte)(paramArrayOfByte[123] ^ 0x36));
  ...
  arrayOfByte[123] = ((byte)(paramArrayOfByte[120] ^ 0x0));
  return arrayOfByte;
}
```

The first part of the code checks the length of the output. The second part creates a new byteArray of the same length, performs a xor on each byte, and shuffles them (in a deterministic way). To retrieve the input (paramArrayOfByte) from the output (arrayOfByte), it is neccessary to perform the reverse action. In the example above, it means:

```
input[5] = output[0] ^ 0x8D
input[98] = output[1] ^ 0x4B
input[123] = output[2] ^ 0x36
...
input[120] = output[123]
```

My solution is written in Python, so I had to transform the original code `arrayOfByte[Y] = ((byte)(paramArrayOfByte[X] ^ 0xZZ));` into the corresponding reverse python code `input[X] = output[Y] ^ 0xZZ`.
The following script has been used to automatically reverse these functions (`reverse_xors.py`):

```
file_in = "dechiffre_1.txt"
file_out = "code_dechiffre_1.py"

with open(file_in,'r') as f_in:
  lines = f_in.readlines()
  with open(file_out,'w') as f_out:
    for l in lines:
      fields = l.strip().split()
      a_index = fields[0].split('[')[1].split(']')[0]
      final_index = fields[2].split('[')[1].split(']')[0]
      xor_value = fields[4].split(')')[0]
      f_out.write("final[%s] = input_str[%s] ^ %s\n" % (final_index, a_index, xor_value))
```

#### base64_ functions

According to its name... These functions perform a base64 encoding. The structure of these functions is as follows:

```
public static byte[] base64_6(byte[] paramArrayOfByte)
{
  String str = "V-GCxZTakQFBs1oRUEtySWOiYJ0rwghfmpqub7394dejc58_AzIlDH6MNvLX2PnK";
  byte[] arrayOfByte1 = new byte[paramArrayOfByte.length + 3 - paramArrayOfByte.length % 3];

  // Copy each byte of paramArrayOfByte inside arrayOfByte1
  for (int i = 0; i < paramArrayOfByte.length; i++) {
    arrayOfByte1[i] = paramArrayOfByte[i];
  }

  byte[] arrayOfByte2 = new byte[arrayOfByte1.length * 4 / 3];
  // Loop over groups of 3 bytes
  for (int j = 0; j < arrayOfByte1.length; j += 3) {
    arrayOfByte2[(j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[j] & 0xFF) >> 2));
    arrayOfByte2[(1 + j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[j] & 0xFF & 0x3) << 4 | (arrayOfByte1[(j + 1)] & 0xFF) >> 4));
    arrayOfByte2[(2 + j * 4 / 3)] = ((byte)str.charAt((arrayOfByte1[(j + 1)] & 0xFF & 0xF) << 2 | (arrayOfByte1[(j + 2)] & 0xFF) >> 6));
    arrayOfByte2[(3 + j * 4 / 3)] = ((byte)str.charAt(arrayOfByte1[(j + 2)] & 0xFF & 0x3F));
  }

  return arrayOfByte2;
}
```

The code loops over groups of 3 bytes of the input, and transform then into 4 letters picked from the str variable. If the length of the input is not a multiple
of 3, a padding is added.
The 6-MSB of the 1st byte gives the index of the 1st letter, the 2-LSB of the 1st byte and the 4-MSB of the 2nd byte gives the index of the 2nd letter, the 4-LSB of the 2nd byte and the 2-MSB of the 3rd byte gives the index of the 3rd letter, and the 6-LSB of the 3rd byte gives the index of the 4th letter. So, this is actually a base64 encoding. However, the alphabet used is not conventional and is modified from a base64 function to another.
The following piece of code is used to perform the base64 decode given a specific alphabet .

```
def base64_6(input_str):
  std_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
  custom_alphabet = "V-GCxZTakQFBs1oRUEtySWOiYJ0rwghfmpqub7394dejc58_AzIlDH6MNvLX2PnK"
  DECODE_TRANS = str.maketrans(custom_alphabet, std_alphabet)
  aux = print_as_char(input_str).translate(DECODE_TRANS)
  print("aux = %s" % aux)
  final = base64.b64decode(aux)
  return str_to_intlist(final)
```

#### And... What about the Flag !?
To obtain the flag, the reverse functions have to be run in the reverse order, taking the final output as an input parameter. I first translated the base64 encoded final output into a list of integer to work on it.

```
final_final = [0x66,0xf8,0x5d,0xc4,0x56,0x46,0x65,0xa3,0x7f,0x33,0x52,0x2f,
0x00,0x3f,0x2a,0x68,0x92,0x3d,0x51,0x0a,0x8f,0x96,0xe4,0xf8,0xe7,0x6e,0x74,
0x05,0xf3,0x99,0x3f,0x28,0x11,0x97,0xaf,0x06,0x19,0x9a,0x99,0xed,0x04,0xbe,
0x19,0x31,0x54,0x19,0xc3,0x8d,0x4f,0xca,0xfb,0x70,0x49,0x13,0x87,0xc8,0x12,
0x80,0x42,0xcc,0x5d,0xd7,0x14,0x44,0x63,0xdb,0xdb,0x9c,0x1f,0x08,0x8a,0xd5,
0x1b,0xaa,0x6d,0xac,0xba,0xfa,0x18,0x9f,0x48,0xa4,0x17,0x8b,0x3f,0x8d,0x06,
0xbb,0x55,0x4a,0xc1,0x92,0x6d,0x77,0x0e,0xf9,0xb9,0xdf,0x8b,0x36,0x05,0xe8,
0xa7,0x42,0x84,0xe0,0x21,0xa6,0xf1,0xc0,0xb1,0xe9,0xea,0xb0,0x9c,0x01,0x62,
0xa0,0xab,0xc1,0x90,0x94,0x04,0x8d]

final_8 = dechiffre_9(final_final)
final_7 = dechiffre_8(final_8)
final_6 = dechiffre_7(final_7)
final_5 = base64_6(final_6)
final_4 = dechiffre_5(final_5[:-1])
final_3 = base64_4(final_4)
final_2 = dechiffre_3(final_3[:-1])
final_1 = base64_2(final_2)
final_0 = dechiffre_1(final_1)

flag = base64_0(final_0)
print("Flag :")
print_as_char(flag)
```

The complete code is available in `script.py`. It is not very clean, but.. It
works!
Oh, and here is the flag : “RuNn1n9J4v41NJ4v45Cr1Pt15th3fUtUR3” !


