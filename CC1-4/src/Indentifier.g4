lexer grammar Indentifier;

@header{package pp.block1.cc.antlr;}

fragment DIGIT : '0' ..'9';
fragment ALPHA : ('a' .. 'z' | 'A' .. 'Z');
fragment ALPHADIGIT : DIGIT | ALPHA;


 TOKEN : ALPHA ALPHADIGIT ALPHADIGIT ALPHADIGIT ALPHADIGIT ALPHADIGIT;

