## Catana Gift - Reverse 59 pts

### File analysis
```
$ file catana
```
The file is an ELF-64 bits. Let's open it with IDA : A double loop call the function at 0x400556, then there is an operation to construct a string, and this string is printed at the end of the program. The execution of the program is far too long to arrive to this printf call.

Indeed, the function at 0x400556 is recursive and makes the program running very slowly. The goal of this challenge is to patch the main program with a faster function !

### Function 0x400556 analysis
The function is called with three arguments stored in the registers (EDI, ESI, EDX). In the main function, the function is called at 0x40062D with the following parameters, and gives the following results (obtained through a debugger with a breakpoint at 0x40062D) : 
  - func(0,0,0) = 1
  - func(1,0,0) = 1
  - func(2,0,0) = 2
  - func(3,0,0) = 5
  - func(4,0,0) = 14
  - func(5,0,0) = 42

With a quick research on internet with "Numerical suite 1 1 2 5 14 42", we learn that this is the Catalan Suite, and that there is a faster way to compute its nth terms :

```c
int catalan_2(int a){
  int res = 1;
  for (int i=0; i<a; i++) {
    res = res*2*(2*i+1)/(i+2);
  }
  return res;
}
```

The argument "a" correspond to the value entered in the EDI register. We obtain the same results than the original code for the first numbers !

### Patch the original code with the new function catalan_2
To patch the code, I compiled the function catalan_2 and copy its code directly at the 0x556 offset of the original program, using a hexadecimal editor like HxD.

1st try : Run the patched code and... The program outputs some garbage !

### Debug the patch !
In practice, we need to use 64-bits integer to compute some high values of the Catalan Suite (for example, the first 40 values are given there : http://jm.davalan.org/mots/suites/catalan/index.html). Using an "unsigned long long" instead of the "int" makes it works better, but not sufficiently for the catalan_2(34) and catalan_2(35). I added two particular cases inside the code for these two values:

```c
unsigned long long catalan_2(int a){
  unsigned long long res = 1;
  for (int i=1; i<a; i++) {
    res = res*2*(2*i+1)/(i+2);
  }
  if (a==34) { res = 812944042149730764LL; }
  if (a==35) { res = 3116285494907301262LL; }
  return res;
}
```

Fortunately, the code is just short enough to do not erase the begining of the main function, which is at the offset 0xXXX of the original program.

Running the version with the new patch gives the flag !
```
X-MAS{c474l4n_4nd_54n74_w3r3_600d_fr13nd5_1_7h1nk}
```


