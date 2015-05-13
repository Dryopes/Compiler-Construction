grammar PietAttr;

import PietVocab;

@header{
import pp.block3.cc.antlr.Type;
}

@members {
    private int getInt(String text) {
        return Integer.parseInt(text);
    }
    
    private boolean getBool(String text) {
    	return text.equals("true");
    }
    
    private String hat(String text, int num) {
    	String result = "";
    	for(int i = 0; i < num; i++) result += text;
    	return result;
    }
}

piet returns [Type type, boolean bval, int ival, String sval]
	: p0=piet HAT p1=piet
	{
		if($p0.type == Type.ERR || $p1.type == Type.ERR) {
			$type = Type.ERR;
		}
		else if($p1.type == Type.NUM) {
			if($p0.type == Type.NUM) {
				$type = Type.NUM;
				$ival = (int) Math.pow($p0.ival, $p1.ival);	
			}
			else if($p0.type == Type.STR) {
				$type = Type.STR;
				$sval = hat($p0.sval, $p1.ival);
			}
			else {
				$type = Type.ERR;
			}
		}
		else {
			$type = Type.ERR;
		}
	}
	| p0=piet PLUS p1=piet
	{
		if($p0.type == Type.ERR || $p1.type == Type.ERR) {
			$type = Type.ERR;
		}
		else if($p0.type == $p1.type){
			$type = $p0.type;
			if($p0.type == Type.BOOL) $bval = $p0.bval || $p1.bval;
			else if($p0.type == Type.NUM) $ival = $p0.ival + $p1.ival;
			else if($p0.type == Type.STR) $sval = $p0.sval + $p1.sval;
		}
		else {
			$type = Type.ERR;
		}
	}
	| p0=piet EQUAL p1=piet
	{
		if($p0.type == Type.ERR || $p1.type == Type.ERR) {
			$type = Type.ERR;
		}
		else if($p0.type == $p1.type){
			$type = Type.BOOL;
			if($p0.type == Type.BOOL) $bval = $p0.bval == $p1.bval;
			else if($p0.type == Type.NUM) $bval = $p0.ival == $p1.ival;
			else if($p0.type == Type.STR) $bval = $p0.sval.equals($p1.sval);
		}
		else {
			$type = Type.BOOL;
			$bval = false;
		}
	}
	| LPAR p=piet RPAR
	{
		$type = $p.type;
		$ival = $p.ival;
		$bval = $p.bval;
		$sval = $p.sval;
	}
	| NUM
	{$type = Type.NUM;  $ival  = getInt($NUM.text);}
	| BOOL
	{$type = Type.BOOL;  $bval  = getBool($BOOL.text);}
	| STR
	{$type = Type.STR;  $sval  = $STR.text;}
	;
