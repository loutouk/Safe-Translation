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
	 * Enter a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterLetIn(MyLangParser.LetInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitLetIn(MyLangParser.LetInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listPushId}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterListPushId(MyLangParser.ListPushIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listPushId}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitListPushId(MyLangParser.ListPushIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(MyLangParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(MyLangParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listPushList}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterListPushList(MyLangParser.ListPushListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listPushList}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitListPushList(MyLangParser.ListPushListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code association}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterAssociation(MyLangParser.AssociationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code association}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitAssociation(MyLangParser.AssociationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substraction}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSubstraction(MyLangParser.SubstractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substraction}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSubstraction(MyLangParser.SubstractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDeclaration}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclaration(MyLangParser.FunDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDeclaration}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclaration(MyLangParser.FunDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MyLangParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MyLangParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pair}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterPair(MyLangParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pair}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitPair(MyLangParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterEqual(MyLangParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitEqual(MyLangParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSequence(MyLangParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSequence(MyLangParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code application}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterApplication(MyLangParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code application}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitApplication(MyLangParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTerm}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTerm(MyLangParser.SimpleTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTerm}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTerm(MyLangParser.SimpleTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(MyLangParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(MyLangParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterLet(MyLangParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitLet(MyLangParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listPopId}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterListPopId(MyLangParser.ListPopIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listPopId}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitListPopId(MyLangParser.ListPopIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listPopList}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterListPopList(MyLangParser.ListPopListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listPopList}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitListPopList(MyLangParser.ListPopListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(MyLangParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(MyLangParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterAddition(MyLangParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitAddition(MyLangParser.AdditionContext ctx);
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