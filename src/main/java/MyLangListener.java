// Generated from .\MyLang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLangParser}.
 */
public interface MyLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MyLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MyLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#simple_term}.
	 * @param ctx the parse tree
	 */
	void enterSimple_term(MyLangParser.Simple_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#simple_term}.
	 * @param ctx the parse tree
	 */
	void exitSimple_term(MyLangParser.Simple_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MyLangParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MyLangParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MyLangParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MyLangParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(MyLangParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(MyLangParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MyLangParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MyLangParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#list_elements}.
	 * @param ctx the parse tree
	 */
	void enterList_elements(MyLangParser.List_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#list_elements}.
	 * @param ctx the parse tree
	 */
	void exitList_elements(MyLangParser.List_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#list_element}.
	 * @param ctx the parse tree
	 */
	void enterList_element(MyLangParser.List_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#list_element}.
	 * @param ctx the parse tree
	 */
	void exitList_element(MyLangParser.List_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MyLangParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MyLangParser.ConstantContext ctx);
}