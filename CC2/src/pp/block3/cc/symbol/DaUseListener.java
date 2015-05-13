package pp.block3.cc.symbol;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import pp.block3.cc.symbol.DeclUseParser.DeclContext;
import pp.block3.cc.symbol.DeclUseParser.ProgramContext;
import pp.block3.cc.symbol.DeclUseParser.SeriesContext;
import pp.block3.cc.symbol.DeclUseParser.UnitContext;
import pp.block3.cc.symbol.DeclUseParser.UseContext;
import pp.block3.cc.symbol.MySymbolTable;

public class DaUseListener implements DeclUseListener{
	
	MySymbolTable scopes = new MySymbolTable();
	List<String> errors = new ArrayList<String>();	
	
	public List<String> getErrors(){
		return errors;
	}

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
	public void enterProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSeries(SeriesContext ctx) {
		scopes.openScope();
	}

	@Override
	public void exitSeries(SeriesContext ctx) {
		scopes.closeScope();
	}

	@Override
	public void enterUnit(UnitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnit(UnitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDecl(DeclContext ctx) {
		if(!scopes.add(ctx.ID().getText())){
			errors.add("Variable " + ctx.ID().getText() + " was already declared at this scope level. Line " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}
	}

	@Override
	public void exitDecl(DeclContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUse(UseContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUse(UseContext ctx) {
		if(!scopes.contains(ctx.ID().getText())){
			errors.add("Variable " + ctx.ID().getText() + " is not declared (yet). Line " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}
	}

}
