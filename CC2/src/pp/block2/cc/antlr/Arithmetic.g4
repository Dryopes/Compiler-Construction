grammar Arithmetic;

@header{package pp.block2.cc.antlr;}

exp: '(' exp ')'					#brac
	| <assoc=right> exp '^' exp		#op1
	| exp ('*' | '/') exp			#op2
	| exp ('+' | '-') exp			#op3
	| '-' exp						#negate
	| NUM							#number
	;
E: ;


NUM: ('0' .. '9')+;

// ignore whitespace
WS : [ \t\n\r] -> skip;

// everything else is a typo
TYPO : [a-zA-Z]+;
