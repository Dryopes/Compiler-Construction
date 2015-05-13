lexer grammar PietVocab;

@header{package pp.block3.cc.piet;}

HAT : '^';
PLUS : '+';
EQUAL : '=';
LPAR : '(';
RPAR : ')';

NUM : [0-9]+;
BOOL : 'true' | 'false';
STR: [a-zA-Z]+;

// ignore whitespace
WS : [ \t\n\r] -> skip;
