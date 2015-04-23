lexer grammar La;

@header{package pp.block1.cc.antlr;}

TOKEN : ('\"') (~'\"' | '\"\"' )* '\"';

fragment LA : 'L' 'a'+ ' '*;
fragment LI : 'L' 'i'+ ' '*;

LATOKEN: 		LA;
LALATOKEN: 		LA LA;
LALALALITOKEN: 	LA LA LA LI;