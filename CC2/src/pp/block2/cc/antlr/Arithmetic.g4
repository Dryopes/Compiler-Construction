grammar Arithmetic;

@header{package pp.block2.cc.antlr;}

exp: '(' exp ')'
	| <assoc=right> exp '^' exp
	| exp ('*' | '/') exp
	| exp ('+' | '-') exp
	| '-' exp
	| NUM
	;

NUM: ('0' .. '9')+;

// ignore whitespace
WS : [ \t\n\r] -> skip;

// everything else is a typo
TYPO : [a-zA-Z]+;
