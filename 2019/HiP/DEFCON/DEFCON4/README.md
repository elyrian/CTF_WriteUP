## DEFCON4

### Description

DEFCON is the website controlling the security level of the room. The 5 different levels allows to warn the population of the risk of a potential nuclear war. Levels ranges from 5 (peacetime) to 1 (maximum alert). Try level 4.

### Details

- Categories : Reverse
- Validations : 29
- Url : http://defcon.challs.malice.fr/
- Points : 100

### Resolution

The interesting function in scripts.js is the check4() function:

```JS
function check4(pwd) {
  var input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  var output = "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm";
  var index = x => input.indexOf(x);
  var translate = x => (index(x) > -1 ? output[index(x)] : x);
  return (
    pwd
    .split("")
    .map(translate)
    .join("") === "ebgEBGeBgEbgEBGEBgEBGEBGEBGebgeBgEbGebg"
  );
}
```

Two lists of letters are used in this function, input, a normal alphabet, and output, which is the normal alphabet with a rotation of 13 letters for each letter. e.g. A is translated in N, B in O, etc. The function translate take the index of the letter in input and return the corresponding letter in output. This is a basic ROT13 cipher.

The function checks if `translate(pwd) == “ebgEBGeBgEbgEBGEBgEBGE-
BGEBGebgeBgEbGebg”`. The application of the ROT13 on this string gives us
the flag : “rotROTrOtRotROTROtROTROTROTrotrOtRoTrot” (for example,
using online tool https://www.dcode.fr/chiffre-rot-13).
