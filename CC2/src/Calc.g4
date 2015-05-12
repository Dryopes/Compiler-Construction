grammar Calc;

import CalcVocab;

expr : expr TIMES expr 	# times
     | expr PLUS expr  	# plus
     | MINUS expr		# negate
     | LPAR expr RPAR  	# par
     | NUMBER          	# number
     ;
