package pp.block3.cc.tabular;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;

public class MyErrorListener extends BaseErrorListener{
	
	List<String> errorList;
	BaseErrorListener errorListener;
	
	public MyErrorListener(){
		errorListener = new BaseErrorListener();
		errorList = new ArrayList<String>();
	}
	
	public List<String> getErrors(){
		return this.errorList;
	}	
	
	@Override
	public void syntaxError(Recognizer<?,?> recognizer,
            java.lang.Object offendingSymbol,
            int line,
            int charPositionInLine,
            java.lang.String msg,
            RecognitionException e){
		errorList.add("line "+":"+charPositionInLine+" " +msg);
	
	}
}
