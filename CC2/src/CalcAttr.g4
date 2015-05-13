grammar CalcAttr;

import CalcVocab;

@members {
    private int getValue(String text) {
        return Integer.parseInt(text);
    }
}

expr returns [ int val ]
     : //{ System.out.println("Multiplying"); }
     	e0=expr TIMES e1=expr
       	{ $val = $e0.val * $e1.val; }
     | //{ System.out.println("Adding"); }
     	e0=expr PLUS e1=expr
       	{ $val = $e0.val + $e1.val; }
     | { System.out.println("Negation"); }
     	MINUS e0=expr
     	{$val = $e0.val * -1; }
     | { System.out.println("Brackets"); }
     	LPAR e=expr RPAR
       	{ $val = $e.val; }
     | { System.out.println("Evaluating NUMBER"); }
       NUMBER
       { $val = getValue($NUMBER.text); }
     ;
