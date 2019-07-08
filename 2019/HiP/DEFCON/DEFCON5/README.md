## DEFCON5

### Description

DEFCON is the website controlling the security level of the room. The 5 different levels allows to warn the population of the risk of a potential nuclear war. Levels ranges from 5 (peacetime) to 1 (maximum alert). Try level 5.

### Details

- Categories : Reverse
- Validations : 31
- Url : http://defcon.challs.malice.fr/
- Points : 50

### Resolution

The web page source code includes several JS scripts :

```
<script type='text/javascript' src="/static/lib/browserfs.min.js"></script>
<script type='text/javascript' src="/static/java/doppio.js"></script>
<script type='text/javascript' src="/static/lib/libs.min.js"></script>
<script type='text/javascript' src="/static/js/planet.js"></script>
<script type='text/javascript' src="/static/js/scripts.js"></script>
<script type='text/javascript' src="/static/js/x.js"></script>
```

Let’s have a look at `scripts.js`. We found 5 interesting functions that seems to check the passwords entered through the DEFCON Level Console. Here is the 5th function:

```
function check5(pwd) {
  return pwd === "STRONGPASSWORD";
}
```

Easy ! Try this password “STRONGPASSWORD” and... Flag !
