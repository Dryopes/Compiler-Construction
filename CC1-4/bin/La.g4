lexer grammar La;

@header{package pp.block1.cc.antlr;}

fragment LA : 'L' 'a'+ ' '*;
fragment LI : 'Li' ' '*;

LATOKEN: 		LA;
LALATOKEN: 		LA LA;
LALALALITOKEN: 	LA LA LA LI;