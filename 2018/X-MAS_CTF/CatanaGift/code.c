#include <stdio.h>

unsigned long long catalan_2(int a){
  unsigned long long res = 1;
  for (int i=1; i<a; i++) {
    res = res*2*(2*i+1)/(i+2);
  }
  if (a==34) { res = 812944042149730764LL; }
  if (a==35) { res = 3116285494907301262LL; }
  return res;
}

int main(){
  unsigned long long res;
  for (int i=0; i<=0x23; i++){
    res = catalan_2(i);
    printf("%i: %llu\n", i, res);
  }
  return 0;
}


/*
Code compilé = 

   0x000000000000064a <+0>:	push   rbp
   0x000000000000064b <+1>:	mov    rbp,rsp
   0x000000000000064e <+4>:	mov    DWORD PTR [rbp-0x14],edi
   0x0000000000000651 <+7>:	mov    QWORD PTR [rbp-0x8],0x1
   0x0000000000000659 <+15>:	mov    DWORD PTR [rbp-0xc],0x1
   0x0000000000000660 <+22>:	jmp    0x68d <catalan_2+67>
   0x0000000000000662 <+24>:	mov    eax,DWORD PTR [rbp-0xc]
   0x0000000000000665 <+27>:	add    eax,eax
   0x0000000000000667 <+29>:	add    eax,0x1
   0x000000000000066a <+32>:	cdqe   
   0x000000000000066c <+34>:	imul   rax,QWORD PTR [rbp-0x8]
   0x0000000000000671 <+39>:	add    rax,rax
   0x0000000000000674 <+42>:	mov    edx,DWORD PTR [rbp-0xc]
   0x0000000000000677 <+45>:	add    edx,0x2
   0x000000000000067a <+48>:	movsxd rcx,edx
   0x000000000000067d <+51>:	mov    edx,0x0
   0x0000000000000682 <+56>:	div    rcx
   0x0000000000000685 <+59>:	mov    QWORD PTR [rbp-0x8],rax
   0x0000000000000689 <+63>:	add    DWORD PTR [rbp-0xc],0x1
   0x000000000000068d <+67>:	mov    eax,DWORD PTR [rbp-0xc]
   0x0000000000000690 <+70>:	cmp    eax,DWORD PTR [rbp-0x14]
   0x0000000000000693 <+73>:	jl     0x662 <catalan_2+24>
   0x0000000000000695 <+75>:	cmp    DWORD PTR [rbp-0x14],0x22
   0x0000000000000699 <+79>:	jne    0x6a9 <catalan_2+95>
   0x000000000000069b <+81>:	movabs rax,0xb48284c969ad9cc
   0x00000000000006a5 <+91>:	mov    QWORD PTR [rbp-0x8],rax
   0x00000000000006a9 <+95>:	cmp    DWORD PTR [rbp-0x14],0x23
   0x00000000000006ad <+99>:	jne    0x6bd <catalan_2+115>
   0x00000000000006af <+101>:	movabs rax,0x2b3f452596a6ed8e
   0x00000000000006b9 <+111>:	mov    QWORD PTR [rbp-0x8],rax
   0x00000000000006bd <+115>:	mov    rax,QWORD PTR [rbp-0x8]
   0x00000000000006c1 <+119>:	pop    rbp
   0x00000000000006c2 <+120>:	ret

   */
