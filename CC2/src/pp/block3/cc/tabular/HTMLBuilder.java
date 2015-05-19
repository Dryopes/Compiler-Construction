package pp.block3.cc.tabular;

import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import pp.block3.cc.tabular.TabularParser.AndContext;
import pp.block3.cc.tabular.TabularParser.ArgContext;
import pp.block3.cc.tabular.TabularParser.BegTypeContext;
import pp.block3.cc.tabular.TabularParser.BeginContext;
import pp.block3.cc.tabular.TabularParser.EndContext;
import pp.block3.cc.tabular.TabularParser.EndTypeContext;
import pp.block3.cc.tabular.TabularParser.LatexContext;
import pp.block3.cc.tabular.TabularParser.TabLineContext;
import pp.block3.cc.tabular.TabularParser.TextContext;

public class HTMLBuilder implements TabularListener{
	String html = "";
	
	

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLatex(LatexContext ctx) {
		html = html + "<html><body>";
	}

	@Override
	public void exitLatex(LatexContext ctx) {
		html = html + "</html></body>";
	
	}

	@Override
	public void enterBegin(BeginContext ctx) {
				
	}

	@Override
	public void exitBegin(BeginContext ctx) {
				
	}

	@Override
	public void enterBegType(BegTypeContext ctx) {
		html = html + "<table border=\"1\">";
		
	}

	@Override
	public void exitBegType(BegTypeContext ctx) {
		
	}

	@Override
	public void enterArg(ArgContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArg(ArgContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTabLine(TabLineContext ctx) {
		html = html + "<tr><td>";
		
		
	}

	@Override
	public void exitTabLine(TabLineContext ctx) {
		html = html + "</td></tr>";		
	}

	@Override
	public void enterText(TextContext ctx) {
		html = html + ctx.getText();		
	}

	@Override
	public void exitText(TextContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAnd(AndContext ctx) {
		html = html + "</td><td>";		
	}

	@Override
	public void exitAnd(AndContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnd(EndContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnd(EndContext ctx) {
		html = html + "</table>";
		
	}

	@Override
	public void enterEndType(EndTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEndType(EndTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
	private ParseTree init(String file){
		CharStream charstream;
		try {
			FileReader filereader = new FileReader(file);
			charstream = new ANTLRInputStream(filereader);
			Lexer lexer = new TabularLexer(charstream);
			lexer.removeErrorListeners();
			MyErrorListener errorListener = new MyErrorListener();
			lexer.addErrorListener(errorListener);
			TokenStream tokens = new CommonTokenStream(lexer);
			TabularParser parser = new TabularParser(tokens);
			
			parser.removeErrorListeners();
			parser.addErrorListener(errorListener);
	
			ParseTree tree =  parser.latex();
			
			MyErrorListener el = (MyErrorListener) lexer.getErrorListeners().get(0);
			MyErrorListener el2 = (MyErrorListener) parser.getErrorListeners().get(0);

			if(el.getErrors().size() > 0 || el2.getErrors().size()> 0){
				System.out.println("Errors found, no tree was built");
				return null;
			}else{
				return tree;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
	public String getHTML(){
		return this.html;
	}
	
	public static void main(String args[]){
		HTMLBuilder builder = new HTMLBuilder();
		ParseTreeWalker walker = new ParseTreeWalker();
		ParseTree tree = builder.init("tabular-1.tex");
//		ParseTree tree = builder.init("tabular-2.tex");
//		ParseTree tree = builder.init("tabular-3.tex");
//		ParseTree tree = builder.init("wrong tab.tex");
		
		if(tree != null){
			walker.walk(builder, tree);
			
			System.out.println(builder.getHTML());
			
			
		}
	}
	
}