lexer grammar Indentifier;

@header{package pp.block1.cc.antlr;}

fragment ALPHA : ('a' .. 'z' | 'A' .. 'Z');
fragment ALPHADIGIT : ('0' ..'9' | ALPHA);

 TOKEN : ALPHA ALPHADIGIT ALPHADIGIT ALPHADIGIT ALPHADIGIT ALPHADIGIT;

