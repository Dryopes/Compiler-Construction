lexer grammar abc;

//@header{package pp.block2.cc.ll;}
A : 'a';
B : 'b';
C : 'c';

// ignore whitespace
WS : [ \t\n\r] -> skip;

