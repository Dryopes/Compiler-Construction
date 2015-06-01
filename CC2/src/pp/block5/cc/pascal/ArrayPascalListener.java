// Generated from ArrayPascal.g4 by ANTLR 4.5
package pp.block5.cc.pascal;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayPascalParser}.
 */
public interface ArrayPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code idTarget}
	 * labeled alternative in {@link ArrayPascalParser#target}.
	 * @param ctx the parse tree
	 */
	void enterIdTarget(ArrayPascalParser.IdTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idTarget}
	 * labeled alternative in {@link ArrayPascalParser#target}.
	 * @param ctx the parse tree
	 */
	void exitIdTarget(ArrayPascalParser.IdTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTarget}
	 * labeled alternative in {@link ArrayPascalParser#target}.
	 * @param ctx the parse tree
	 */
	void enterArrayTarget(ArrayPascalParser.ArrayTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTarget}
	 * labeled alternative in {@link ArrayPascalParser#target}.
	 * @param ctx the parse tree
	 */
	void exitArrayTarget(ArrayPascalParser.ArrayTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(ArrayPascalParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(ArrayPascalParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(ArrayPascalParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(ArrayPascalParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(ArrayPascalParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(ArrayPascalParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(ArrayPascalParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(ArrayPascalParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(ArrayPascalParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(ArrayPascalParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrfExpr(ArrayPascalParser.PrfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrfExpr(ArrayPascalParser.PrfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(ArrayPascalParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(ArrayPascalParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(ArrayPascalParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(ArrayPascalParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(ArrayPascalParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(ArrayPascalParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(ArrayPascalParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(ArrayPascalParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(ArrayPascalParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ArrayPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(ArrayPascalParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link ArrayPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(ArrayPascalParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link ArrayPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(ArrayPascalParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link ArrayPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(ArrayPascalParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link ArrayPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(ArrayPascalParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link ArrayPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ArrayPascalParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link ArrayPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ArrayPascalParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayPascalParser#bound}.
	 * @param ctx the parse tree
	 */
	void enterBound(ArrayPascalParser.BoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayPascalParser#bound}.
	 * @param ctx the parse tree
	 */
	void exitBound(ArrayPascalParser.BoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ArrayPascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ArrayPascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayPascalParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ArrayPascalParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayPascalParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ArrayPascalParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link ArrayPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(ArrayPascalParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link ArrayPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(ArrayPascalParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayPascalParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ArrayPascalParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayPascalParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ArrayPascalParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ArrayPascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ArrayPascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssStat(ArrayPascalParser.AssStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssStat(ArrayPascalParser.AssStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(ArrayPascalParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(ArrayPascalParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(ArrayPascalParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(ArrayPascalParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(ArrayPascalParser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(ArrayPascalParser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInStat(ArrayPascalParser.InStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInStat(ArrayPascalParser.InStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOutStat(ArrayPascalParser.OutStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link ArrayPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOutStat(ArrayPascalParser.OutStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayPascalParser#prfOp}.
	 * @param ctx the parse tree
	 */
	void enterPrfOp(ArrayPascalParser.PrfOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayPascalParser#prfOp}.
	 * @param ctx the parse tree
	 */
	void exitPrfOp(ArrayPascalParser.PrfOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayPascalParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(ArrayPascalParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayPascalParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(ArrayPascalParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayPascalParser#plusOp}.
	 * @param ctx the parse tree
	 */
	void enterPlusOp(ArrayPascalParser.PlusOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayPascalParser#plusOp}.
	 * @param ctx the parse tree
	 */
	void exitPlusOp(ArrayPascalParser.PlusOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayPascalParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(ArrayPascalParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayPascalParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(ArrayPascalParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayPascalParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(ArrayPascalParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayPascalParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(ArrayPascalParser.CompOpContext ctx);
}