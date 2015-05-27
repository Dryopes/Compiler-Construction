// Generated from ProcPascal.g4 by ANTLR 4.5
package pp.block5.cc.pascal;
package pp.block5.cc.pascal;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProcPascalParser}.
 */
public interface ProcPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code funcDecl}
	 * labeled alternative in {@link ProcPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(ProcPascalParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDecl}
	 * labeled alternative in {@link ProcPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(ProcPascalParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procDecl}
	 * labeled alternative in {@link ProcPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterProcDecl(ProcPascalParser.ProcDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procDecl}
	 * labeled alternative in {@link ProcPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitProcDecl(ProcPascalParser.ProcDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link ProcPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(ProcPascalParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link ProcPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(ProcPascalParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcPascalParser#pars}.
	 * @param ctx the parse tree
	 */
	void enterPars(ProcPascalParser.ParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcPascalParser#pars}.
	 * @param ctx the parse tree
	 */
	void exitPars(ProcPascalParser.ParsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssStat(ProcPascalParser.AssStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssStat(ProcPascalParser.AssStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(ProcPascalParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(ProcPascalParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(ProcPascalParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(ProcPascalParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(ProcPascalParser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(ProcPascalParser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInStat(ProcPascalParser.InStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInStat(ProcPascalParser.InStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOutStat(ProcPascalParser.OutStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOutStat(ProcPascalParser.OutStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCallStat(ProcPascalParser.CallStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCallStat(ProcPascalParser.CallStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exitStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExitStat(ProcPascalParser.ExitStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exitStat}
	 * labeled alternative in {@link ProcPascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExitStat(ProcPascalParser.ExitStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcPascalParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(ProcPascalParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcPascalParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(ProcPascalParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(ProcPascalParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(ProcPascalParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(ProcPascalParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(ProcPascalParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(ProcPascalParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(ProcPascalParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrfExpr(ProcPascalParser.PrfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrfExpr(ProcPascalParser.PrfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(ProcPascalParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(ProcPascalParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(ProcPascalParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(ProcPascalParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(ProcPascalParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(ProcPascalParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(ProcPascalParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(ProcPascalParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(ProcPascalParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(ProcPascalParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(ProcPascalParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ProcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(ProcPascalParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProcPascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProcPascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcPascalParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ProcPascalParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcPascalParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ProcPascalParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcPascalParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ProcPascalParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcPascalParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ProcPascalParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ProcPascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ProcPascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idTarget}
	 * labeled alternative in {@link ProcPascalParser#target}.
	 * @param ctx the parse tree
	 */
	void enterIdTarget(ProcPascalParser.IdTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idTarget}
	 * labeled alternative in {@link ProcPascalParser#target}.
	 * @param ctx the parse tree
	 */
	void exitIdTarget(ProcPascalParser.IdTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcPascalParser#prfOp}.
	 * @param ctx the parse tree
	 */
	void enterPrfOp(ProcPascalParser.PrfOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcPascalParser#prfOp}.
	 * @param ctx the parse tree
	 */
	void exitPrfOp(ProcPascalParser.PrfOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcPascalParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(ProcPascalParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcPascalParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(ProcPascalParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcPascalParser#plusOp}.
	 * @param ctx the parse tree
	 */
	void enterPlusOp(ProcPascalParser.PlusOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcPascalParser#plusOp}.
	 * @param ctx the parse tree
	 */
	void exitPlusOp(ProcPascalParser.PlusOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcPascalParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(ProcPascalParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcPascalParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(ProcPascalParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcPascalParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(ProcPascalParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcPascalParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(ProcPascalParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link ProcPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(ProcPascalParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link ProcPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(ProcPascalParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link ProcPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(ProcPascalParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link ProcPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(ProcPascalParser.BoolTypeContext ctx);
}