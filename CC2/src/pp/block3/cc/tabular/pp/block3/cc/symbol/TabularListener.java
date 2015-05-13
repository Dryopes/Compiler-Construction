// Generated from Tabular.g4 by ANTLR 4.5
package pp.block3.cc.symbol;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TabularParser}.
 */
public interface TabularListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TabularParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(TabularParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabularParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(TabularParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabularParser#begintable}.
	 * @param ctx the parse tree
	 */
	void enterBegintable(TabularParser.BegintableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabularParser#begintable}.
	 * @param ctx the parse tree
	 */
	void exitBegintable(TabularParser.BegintableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabularParser#endtable}.
	 * @param ctx the parse tree
	 */
	void enterEndtable(TabularParser.EndtableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabularParser#endtable}.
	 * @param ctx the parse tree
	 */
	void exitEndtable(TabularParser.EndtableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabularParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(TabularParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabularParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(TabularParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabularParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(TabularParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabularParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(TabularParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabularParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(TabularParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabularParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(TabularParser.EntryContext ctx);
}