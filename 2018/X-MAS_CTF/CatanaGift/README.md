## Catana Gift - Reverse 59 pts

Here is a write up of the Catana Gift challenge from the X-MAS CTF 2018. Write-up by WAFU team !

### File analysis
```
$ file catana
```
The input file is an ELF-64 bits file. When open with IDA we can found:
- A double for loop :
    - Call the function stored at 0x400556
    - Several operations to construct a string using the results of the 0x400556 function
- A print of this string at the end of the program.

However we remark taht the execution of the program is far too long to arrive to this printf call. Indeed, the function at 0x400556 is recursive and makes the program running very slowly. Our goal will be to patch the main program with a faster function !

### Function 0x400556 analysis
The function is called with three arguments stored in the registers EDI, ESI, EDX. In the main function, the function is called at 0x40062D with the following parameters, and gives the following results (obtained through a debugger with a breakpoint at 0x40062D) : 
  - func(0,0,0) = 1
  - func(1,0,0) = 1
  - func(2,0,0) = 2
  - func(3,0,0) = 5
  - func(4,0,0) = 14
  - func(5,0,0) = 42

As everyone should know these results are the beginning of the Catalan Suite, and there is a much faster way to compute its nth terms :

```c
int catalan_2(int a){
  int res = 1;
  for (int i=0; i<a; i++) {
    res = res*2*(2*i+1)/(i+2);
  }
  return res;
}
```

The argument "a" correspond to the value entered in the EDI register. The consistency between our version and the original code can be checked for the first numbers !

### Patch the original code with the new function catalan_2
To patch the code, the function catalan_2 shall be compiled and its code directly injected at the 0x556 offset of the original program, using a hexadecimal editor like HxD.

1st try : Run the patched code and... The program outputs some garbage !

### Debug the patch !
In practice, we need to use 64-bits integer to compute some high values of the Catalan Suite (for example, the first 40 values are given there : http://jm.davalan.org/mots/suites/catalan/index.html). Using an "unsigned long long" instead of the "int" makes it works better, but not sufficiently for the catalan_2(34) and catalan_2(35). As a quick fix, two particular cases are added in the code for these two value:

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

Et voilà! The code is just short enough to do not erase the begining of the main function, which is at the offset 0x5D6 of the original program.

Running the version with the new patch gives the flag !
```
X-MAS{c474l4n_4nd_54n74_w3r3_600d_fr13nd5_1_7h1nk}
```

Elyrian,
WAFU Team ~~


