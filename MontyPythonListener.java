// Generated from MontyPython.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MontyPythonParser}.
 */
public interface MontyPythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MontyPythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MontyPythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#progline}.
	 * @param ctx the parse tree
	 */
	void enterProgline(MontyPythonParser.ProglineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#progline}.
	 * @param ctx the parse tree
	 */
	void exitProgline(MontyPythonParser.ProglineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MontyPythonParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MontyPythonParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MontyPythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MontyPythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MontyPythonParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MontyPythonParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#deftipo}.
	 * @param ctx the parse tree
	 */
	void enterDeftipo(MontyPythonParser.DeftipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#deftipo}.
	 * @param ctx the parse tree
	 */
	void exitDeftipo(MontyPythonParser.DeftipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#funcheader}.
	 * @param ctx the parse tree
	 */
	void enterFuncheader(MontyPythonParser.FuncheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#funcheader}.
	 * @param ctx the parse tree
	 */
	void exitFuncheader(MontyPythonParser.FuncheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#funcreturn}.
	 * @param ctx the parse tree
	 */
	void enterFuncreturn(MontyPythonParser.FuncreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#funcreturn}.
	 * @param ctx the parse tree
	 */
	void exitFuncreturn(MontyPythonParser.FuncreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(MontyPythonParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(MontyPythonParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#whilecycle}.
	 * @param ctx the parse tree
	 */
	void enterWhilecycle(MontyPythonParser.WhilecycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#whilecycle}.
	 * @param ctx the parse tree
	 */
	void exitWhilecycle(MontyPythonParser.WhilecycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#ifthenelse}.
	 * @param ctx the parse tree
	 */
	void enterIfthenelse(MontyPythonParser.IfthenelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#ifthenelse}.
	 * @param ctx the parse tree
	 */
	void exitIfthenelse(MontyPythonParser.IfthenelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#forin}.
	 * @param ctx the parse tree
	 */
	void enterForin(MontyPythonParser.ForinContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#forin}.
	 * @param ctx the parse tree
	 */
	void exitForin(MontyPythonParser.ForinContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#tlistint}.
	 * @param ctx the parse tree
	 */
	void enterTlistint(MontyPythonParser.TlistintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#tlistint}.
	 * @param ctx the parse tree
	 */
	void exitTlistint(MontyPythonParser.TlistintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#tlistfloat}.
	 * @param ctx the parse tree
	 */
	void enterTlistfloat(MontyPythonParser.TlistfloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#tlistfloat}.
	 * @param ctx the parse tree
	 */
	void exitTlistfloat(MontyPythonParser.TlistfloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#flsize}.
	 * @param ctx the parse tree
	 */
	void enterFlsize(MontyPythonParser.FlsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#flsize}.
	 * @param ctx the parse tree
	 */
	void exitFlsize(MontyPythonParser.FlsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#fladd}.
	 * @param ctx the parse tree
	 */
	void enterFladd(MontyPythonParser.FladdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#fladd}.
	 * @param ctx the parse tree
	 */
	void exitFladd(MontyPythonParser.FladdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#flremove}.
	 * @param ctx the parse tree
	 */
	void enterFlremove(MontyPythonParser.FlremoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#flremove}.
	 * @param ctx the parse tree
	 */
	void exitFlremove(MontyPythonParser.FlremoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#inputline}.
	 * @param ctx the parse tree
	 */
	void enterInputline(MontyPythonParser.InputlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#inputline}.
	 * @param ctx the parse tree
	 */
	void exitInputline(MontyPythonParser.InputlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#printstat}.
	 * @param ctx the parse tree
	 */
	void enterPrintstat(MontyPythonParser.PrintstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#printstat}.
	 * @param ctx the parse tree
	 */
	void exitPrintstat(MontyPythonParser.PrintstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#trange}.
	 * @param ctx the parse tree
	 */
	void enterTrange(MontyPythonParser.TrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#trange}.
	 * @param ctx the parse tree
	 */
	void exitTrange(MontyPythonParser.TrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MontyPythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MontyPythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#exprlogic}.
	 * @param ctx the parse tree
	 */
	void enterExprlogic(MontyPythonParser.ExprlogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#exprlogic}.
	 * @param ctx the parse tree
	 */
	void exitExprlogic(MontyPythonParser.ExprlogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontyPythonParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(MontyPythonParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontyPythonParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(MontyPythonParser.FuncContext ctx);
}