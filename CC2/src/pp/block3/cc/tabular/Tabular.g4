grammar Tabular;

@header{package pp.block3.cc.tabular;}

latex	: begin arg tabLine* end;
begin	: '\\begin{' begType '}';
begType : 'tabular';
arg		: '{' ARGTYPE '}';
tabLine : tabEntry* '\\\\';
tabEntry: TEXT 				#text
		| '&'				#and;
end		: '\\end{' endType '}';
endType : 'tabular';

ARGTYPE : ('l' | 'c' | 'r')+;
TEXT: ([a-zA-Z0-9] | '.' | ' ' | '\t' | '')+;

WS : [\n\r]+ -> skip;
COMMENT : '%' (TEXT | '') -> skip;