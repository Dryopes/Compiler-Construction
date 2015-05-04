lexer grammar abc;

//@header{package pp.block2.cc.ll;}
A : 'a';
B : 'b';
C : 'c';

R : A B A [B C]*;
Q : C A B A [B C]*;

L : (R A) | (Q B A);
