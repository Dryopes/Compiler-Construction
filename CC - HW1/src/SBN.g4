grammar SBN;

number: sign list;
sign:	 '+'
		| '-'
		;
		
list: 	list bit
		|  bit
		;
		
bit:	'0'
		| '1'
		;
		
// ignore whitespace
WS : [ \t\n\r] -> skip;

// everything else is a typo
TYPO : [a-zA-Z]+;