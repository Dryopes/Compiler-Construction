grammar Piet;

import PietVocab;

@header{package pp.block3.cc.piet;}

piet : piet HAT piet	# hat
	| piet PLUS piet	# plus
	| piet EQUAL piet	# equal
	| LPAR piet RPAR	# bracket
	| NUM				# number
	| BOOL				# boolean
	| STR				# string
	;