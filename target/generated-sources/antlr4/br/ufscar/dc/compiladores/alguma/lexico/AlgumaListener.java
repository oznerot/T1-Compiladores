// Generated from br/ufscar/dc/compiladores/alguma/lexico/Alguma.g4 by ANTLR 4.12.0
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(AlgumaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(AlgumaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AlgumaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AlgumaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AlgumaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AlgumaParser.TermoContext ctx);
}