## DEFCON3


### Resolution

This challenge gave no points, but you know, saving people... 

Here is the code that checks the password for level 3:

```JS
function check3(pwd) {
  var score = 0;
  var final = 624986;
  var up = 0;
  var b = 0;
  if (pwd.length > 20) {
    return false;
  }
  for (i = 0; i < pwd.length; i++) {
    if (b % 10 === 0) {
      score = 0;
      b = b + 1;
      up = up + 1;
    } else if (up % 5 === 0) {
      score = score + 1;
      b = b + 1;
      up = up + 1;
    } else if (pwd.charAt(i) === "1") {
      score = score + 1;
      b = b + 1;
      up = up + 1;
    } else if (pwd.charAt(i) === "2") {
      score = score * 2;
      b = b + 1;
      up = up + 1;
    } else if (pwd.charAt(i) === "5") {
      score = score * 5;
      b = b + 1;
      up = up + 1;
    } else if (pwd.charAt(i) === "8") {
      b = b + 2;
    } else if (pwd.charAt(i) === "9") {
      up = up + 3;
    } else {
      score = score;
    }
  }
  return score === final + b;
}
```

The maximum length of the password is 20 characters. Each char of the
password have an impact on the three variables score, up and b. The function loops over 7 conditions:

1. **b%10==0**: Reset score, increment b and up
2. **up%5==0**: Increment score, b and up
3. **pwd.charAt(i)==“1”**: Increment score, b and up
4. **pwd.charAt(i)==“2”**: Multiply score by 2, increment b and up
5. **pwd.charAt(i)==“5”**: Multiply score by 5, increment b and up
6. **pwd.charAt(i)==“8”**: Increment b by 2
7. **pwd.charAt(i)==“9”**: Increment up by 3

At the end, the function checks if score == final + b. The value of final is constant and equal to 624986. The value of final is very close to `625000=5**7*2**3`. The final password should contain 7 times the character “5” and 3 times the character “2”. However, we don’t want to go into the 1st and 2nd condition. The characters “8” and “9” will be used to avoid them.

```
pwd[0]: Any key can be used, because the 1st condition is necessarily reached.
  score=0, b=1, up=1
pwd[1]: "1" to initialize the score
  score=1, b=2, up=2
pwd[2]: "5" (1st time)
  score=5, b=3, up=3
pwd[3]: "5" (2nd time)
  score=25, b=4, up=4
pwd[4]: "9" to avoid 2nd condition
  score=25, b=4, up=7
pwd[5]: "5" (3rd time)
  score=125, b=5, up=8
pwd[6]: "5" (4th time)
  score=625, b=6, up=9
pwd[7]: "9" to avoid 2nd condition
  score=625, b=6, up=12
pwd[8]: "5" (5th time)
  score=3125, b=7, up=13
pwd[9]: "5" (6th time)
  score=15625, b=8, up=14
pwd[10]: "9" to avoid 2nd condition
  score=15625, b=8, up=17
pwd[11]: "5" (7th time)
  score=78125, b=9, up=18
pwd[12]: "8" to avoid 1st condition
  score=78125, b=11, up=18
pwd[13]: "2" (1st time)
  score=156250, b=12, up=19
pwd[14]: "9" to avoid 2nd condition
  score=156250, b=12, up=22
pwd[15]: "2" (2nd time)
  score=312500, b=13, up=23
pwd[16]: "2" (3rd time)
  score=625000, b=14, up=24
```

The password **“01559559559582922”** leads to `score=625000` and `b=14`, so
`final+b==625000==score` ! No need to go further, here is the flag.

