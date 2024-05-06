// Generated from MontyPython.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MontyPythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MontyPythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MontyPythonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#progline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgline(MontyPythonParser.ProglineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MontyPythonParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MontyPythonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MontyPythonParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#deftipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeftipo(MontyPythonParser.DeftipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#funcheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncheader(MontyPythonParser.FuncheaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#funcreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncreturn(MontyPythonParser.FuncreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(MontyPythonParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#whilecycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilecycle(MontyPythonParser.WhilecycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#ifthenelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelse(MontyPythonParser.IfthenelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#forin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForin(MontyPythonParser.ForinContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#tlistint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTlistint(MontyPythonParser.TlistintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#tlistfloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTlistfloat(MontyPythonParser.TlistfloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#flsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlsize(MontyPythonParser.FlsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#fladd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFladd(MontyPythonParser.FladdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#flremove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlremove(MontyPythonParser.FlremoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#inputline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputline(MontyPythonParser.InputlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#printstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstat(MontyPythonParser.PrintstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#trange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrange(MontyPythonParser.TrangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MontyPythonParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#exprlogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlogic(MontyPythonParser.ExprlogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontyPythonParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(MontyPythonParser.FuncContext ctx);
}