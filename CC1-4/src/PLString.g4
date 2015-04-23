lexer grammar PLString;

@header{package pp.block1.cc.antlr;}

TOKEN : ('\"') (~'\"' | '\"\"' )* '\"';