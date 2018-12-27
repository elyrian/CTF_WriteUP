## Catalan Gift - Reverse 59 pts

ELF-64 bits
Ouverture dans ida-64bits --> Une fonction intéressante en 0x400556

Cette fonction prend trois arguments en entrée (edi, esi, edx), avec esi et edx qui valent systématiquement 0 (appel à l'adresse 0x40062D). En testant, on trouve les valeurs suivantes : 
  - func(0,0,0) = 1
  - func(1,0,0) = 1
  - func(2,0,0) = 2
  - func(3,0,0) = 5
  - func(4,0,0) = 14
  - func(5,0,0) = 42
Avec une recherche sur google "Suite numérique 1 1 2 5 14 42", on apprend que c'est la suite de Catalan, et on obtient une formule qui se calcule beaucoup plus rapidement que le code récursif utilisé dans le binaire:

```c
int catalan_2(int a){
  int res = 1;
  for (int i=0; i<a; i++) {
    res = res*2*(2*i+1)/(i+2);
  }
  return res;
}
```
  
(l'argument "a" correspond à la valeur entrée dans le registre edi)
On obtient bien le même résultat que ce qui est sorti par le binaire pour les quelques premières valeurs qu'il est capable de calculer.

==> Plus qu'à patcher le binaire pour remplacer le code de la fonction sub_400556 par un code plus rapide

1er essai : 
- Compilation du code c
- Remplacement dans le binaire, en hexa, du code de la fonction en 0x556 par le code de notre patch compilé
- Lancement et... du garbage Oo....

2ème essai :
En y regardant de plus près, les valeurs les plus grandes sont sur 64 bits, il faut donc remplacer le type du résultat par un "unsigned long long"
==> Compilation, patch, et... encore du garbage !

En testant sur l'ensemble des valeurs sorties par le programme, on repère une erreur pour catalan_2(34) et pour catalan_2(35) (test avec les valeurs données sur http://jm.davalan.org/mots/suites/catalan/index.html). On remplace le code avec deux cas particuliers : 

unsigned long long catalan_2(int a){
  unsigned long long res = 1;
  for (int i=1; i<a; i++) {
    res = res*2*(2*i+1)/(i+2);
  }
  if (a==34) { res = 812944042149730764LL; }
  if (a==35) { res = 3116285494907301262LL; }
  return res;
}

==> Compilation, patch, et... X-MAS{c474l4n_4nd_54n74_w3r3_600d_fr13nd5_1_7h1nk} !


