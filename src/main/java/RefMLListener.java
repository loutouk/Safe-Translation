// Generated from ./RefML.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RefMLParser}.
 */
public interface RefMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RefMLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RefMLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefMLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RefMLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefMLParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(RefMLParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefMLParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(RefMLParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link RefMLParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(RefMLParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link RefMLParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(RefMLParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclIn}
	 * labeled alternative in {@link RefMLParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclIn(RefMLParser.VarDeclInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclIn}
	 * labeled alternative in {@link RefMLParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclIn(RefMLParser.VarDeclInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDecl}
	 * labeled alternative in {@link RefMLParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunDecl(RefMLParser.FunDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDecl}
	 * labeled alternative in {@link RefMLParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunDecl(RefMLParser.FunDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDeclIn}
	 * labeled alternative in {@link RefMLParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclIn(RefMLParser.FunDeclInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDeclIn}
	 * labeled alternative in {@link RefMLParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclIn(RefMLParser.FunDeclInContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefMLParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(RefMLParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefMLParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(RefMLParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefMLParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(RefMLParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefMLParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(RefMLParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarStat}
	 * labeled alternative in {@link RefMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarStat(RefMLParser.VarStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarStat}
	 * labeled alternative in {@link RefMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarStat(RefMLParser.VarStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link RefMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(RefMLParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link RefMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(RefMLParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSta}
	 * labeled alternative in {@link RefMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprSta(RefMLParser.ExprStaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSta}
	 * labeled alternative in {@link RefMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprSta(RefMLParser.ExprStaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SeqStat}
	 * labeled alternative in {@link RefMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSeqStat(RefMLParser.SeqStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SeqStat}
	 * labeled alternative in {@link RefMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSeqStat(RefMLParser.SeqStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefMLParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(RefMLParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefMLParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(RefMLParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(RefMLParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(RefMLParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(RefMLParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(RefMLParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(RefMLParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(RefMLParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListPopList}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListPopList(RefMLParser.ListPopListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListPopList}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListPopList(RefMLParser.ListPopListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(RefMLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(RefMLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(RefMLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(RefMLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bang}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBang(RefMLParser.BangContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bang}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBang(RefMLParser.BangContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListPopId}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListPopId(RefMLParser.ListPopIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListPopId}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListPopId(RefMLParser.ListPopIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListPeekList}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListPeekList(RefMLParser.ListPeekListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListPeekList}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListPeekList(RefMLParser.ListPeekListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEqual}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessEqual(RefMLParser.LessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEqual}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessEqual(RefMLParser.LessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListPushList}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListPushList(RefMLParser.ListPushListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListPushList}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListPushList(RefMLParser.ListPushListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListPeekId}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListPeekId(RefMLParser.ListPeekIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListPeekId}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListPeekId(RefMLParser.ListPeekIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListPushId}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListPushId(RefMLParser.ListPushIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListPushId}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListPushId(RefMLParser.ListPushIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(RefMLParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(RefMLParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Association}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssociation(RefMLParser.AssociationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Association}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssociation(RefMLParser.AssociationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(RefMLParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(RefMLParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(RefMLParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(RefMLParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(RefMLParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link RefMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(RefMLParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefMLParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(RefMLParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefMLParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(RefMLParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefMLParser#list_elements}.
	 * @param ctx the parse tree
	 */
	void enterList_elements(RefMLParser.List_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefMLParser#list_elements}.
	 * @param ctx the parse tree
	 */
	void exitList_elements(RefMLParser.List_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefMLParser#list_element}.
	 * @param ctx the parse tree
	 */
	void enterList_element(RefMLParser.List_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefMLParser#list_element}.
	 * @param ctx the parse tree
	 */
	void exitList_element(RefMLParser.List_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefMLParser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(RefMLParser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefMLParser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(RefMLParser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefMLParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(RefMLParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefMLParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(RefMLParser.BoolContext ctx);
}