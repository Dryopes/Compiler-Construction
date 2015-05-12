package pp.block2.cc.antlr;

public class Snippet {
	t returns [ Type type, int intVal, boolean boolVal, String strVal ]
		: t0=t HAT t1=t		{$type = $t0.type;  if($t0.type == Type.NUM && $t1.type == Type.NUM)
													$intVal = (int) Math.pow($t0.intVal, $t1.intVal);
												else if($t0.type == Type.STR && $t1.type == Type.NUM)
													$strVal = hat($t0.strVal, $t1.intVal);
		}
		| t0=t PLUS t1=t	{$type = $t0.type;  if($t0.type == Type.NUM)
													$intVal = $t0.intVal + $t1.intVal;
												else if($t0.type == Type.BOOL)
													$boolVal = $t0.boolVal | $t1.boolVal;
												else
													$strVal = $t0.strVal + $t1.strVal;
												}
		| t0=t EQUALS t1=t	{$type = Type.BOOL; if($t0.type == $t1.type){
													if($t0.type == Type.NUM)
														$boolVal = $t0.intVal == $t1.intVal;
													else if($t0.type == Type.BOOL)
														$boolVal = $t0.boolVal == $t1.boolVal;
													else
														$boolVal = $t0.strVal.equals($t1.strVal);
												}else
													$boolVal = false;
												}
		| LPAR t0=t RPAR	{$type = $t0.type;  if($t0.type == Type.NUM)
													$intVal = $t0.intVal;
												else if($t0.type == Type.BOOL)
													$boolVal = $t0.boolVal;
												else
													$strVal = '(' + $t0.strVal + ')';
												}
		| NUMBER			{$type = Type.NUM;  $intVal  = getValue($NUMBER.text);}
		| BOOL				{$type = Type.BOOL; $boolVal = getBoolValue($BOOL.text);}
		| STR				{$type = Type.STR;  $strVal  = $STR.text;}
		;
}

