// Generated from SimplePascal.g4 by ANTLR 4.5
package pp.block5.cc.pascal;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplePascalParser}.
 */
public interface SimplePascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimplePascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimplePascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SimplePascalParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SimplePascalParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link SimplePascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(SimplePascalParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link SimplePascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(SimplePascalParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SimplePascalParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SimplePascalParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimplePascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimplePascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssStat(SimplePascalParser.AssStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssStat(SimplePascalParser.AssStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(SimplePascalParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(SimplePascalParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(SimplePascalParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(SimplePascalParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(SimplePascalParser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(SimplePascalParser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInStat(SimplePascalParser.InStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInStat(SimplePascalParser.InStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOutStat(SimplePascalParser.OutStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link SimplePascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOutStat(SimplePascalParser.OutStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idTarget}
	 * labeled alternative in {@link SimplePascalParser#target}.
	 * @param ctx the parse tree
	 */
	void enterIdTarget(SimplePascalParser.IdTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idTarget}
	 * labeled alternative in {@link SimplePascalParser#target}.
	 * @param ctx the parse tree
	 */
	void exitIdTarget(SimplePascalParser.IdTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(SimplePascalParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(SimplePascalParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(SimplePascalParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(SimplePascalParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(SimplePascalParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(SimplePascalParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrfExpr(SimplePascalParser.PrfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrfExpr(SimplePascalParser.PrfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(SimplePascalParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(SimplePascalParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(SimplePascalParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(SimplePascalParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(SimplePascalParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(SimplePascalParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(SimplePascalParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(SimplePascalParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(SimplePascalParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(SimplePascalParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(SimplePascalParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link SimplePascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(SimplePascalParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#prfOp}.
	 * @param ctx the parse tree
	 */
	void enterPrfOp(SimplePascalParser.PrfOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#prfOp}.
	 * @param ctx the parse tree
	 */
	void exitPrfOp(SimplePascalParser.PrfOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(SimplePascalParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(SimplePascalParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#plusOp}.
	 * @param ctx the parse tree
	 */
	void enterPlusOp(SimplePascalParser.PlusOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#plusOp}.
	 * @param ctx the parse tree
	 */
	void exitPlusOp(SimplePascalParser.PlusOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(SimplePascalParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(SimplePascalParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(SimplePascalParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(SimplePascalParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link SimplePascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(SimplePascalParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link SimplePascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(SimplePascalParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link SimplePascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(SimplePascalParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link SimplePascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(SimplePascalParser.BoolTypeContext ctx);
}