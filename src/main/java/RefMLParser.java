// Generated from ./RefML.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RefMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MINUS=1, PLUS=2, TRUE=3, FALSE=4, LPAR=5, RPAR=6, LBRA=7, RBRA=8, LCUR=9, 
		RCUR=10, REF=11, LET=12, REC=13, BANG=14, EQUAL=15, IN=16, ARROW=17, LEQ=18, 
		TIMES=19, SEQ=20, COLEQ=21, IF=22, THEN=23, ELSE=24, COMMA=25, ID=26, 
		INT=27, SL_COMMENT=28, WS=29;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_variableDecl = 2, RULE_functionDecl = 3, 
		RULE_formalParameters = 4, RULE_formalParameter = 5, RULE_statement = 6, 
		RULE_argList = 7, RULE_expr = 8, RULE_list = 9, RULE_list_elements = 10, 
		RULE_list_element = 11, RULE_consts = 12, RULE_bool = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "variableDecl", "functionDecl", "formalParameters", 
			"formalParameter", "statement", "argList", "expr", "list", "list_elements", 
			"list_element", "consts", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'+'", "'true'", "'false'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'ref'", "'let'", "'rec'", "'!'", "'='", "'in'", "'->'", 
			"'<'", "'*'", "';'", "':='", "'if'", "'then'", "'else'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MINUS", "PLUS", "TRUE", "FALSE", "LPAR", "RPAR", "LBRA", "RBRA", 
			"LCUR", "RCUR", "REF", "LET", "REC", "BANG", "EQUAL", "IN", "ARROW", 
			"LEQ", "TIMES", "SEQ", "COLEQ", "IF", "THEN", "ELSE", "COMMA", "ID", 
			"INT", "SL_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RefML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RefMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				declarations();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				variableDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				functionDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclContext extends ParserRuleContext {
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
	 
		public VariableDeclContext() { }
		public void copyFrom(VariableDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclContext extends VariableDeclContext {
		public TerminalNode LET() { return getToken(RefMLParser.LET, 0); }
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(RefMLParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode REF() { return getToken(RefMLParser.REF, 0); }
		public VarDeclContext(VariableDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitVarDecl(this);
		}
	}
	public static class VarDeclInContext extends VariableDeclContext {
		public TerminalNode LET() { return getToken(RefMLParser.LET, 0); }
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(RefMLParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IN() { return getToken(RefMLParser.IN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode REF() { return getToken(RefMLParser.REF, 0); }
		public VarDeclInContext(VariableDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterVarDeclIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitVarDeclIn(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDecl);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(LET);
				setState(38);
				match(ID);
				setState(39);
				match(EQUAL);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REF) {
					{
					setState(40);
					match(REF);
					}
				}

				setState(43);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarDeclInContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(LET);
				setState(45);
				match(ID);
				setState(46);
				match(EQUAL);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REF) {
					{
					setState(47);
					match(REF);
					}
				}

				setState(50);
				expr(0);
				setState(51);
				match(IN);
				setState(52);
				statement(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
	 
		public FunctionDeclContext() { }
		public void copyFrom(FunctionDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunDeclContext extends FunctionDeclContext {
		public TerminalNode LET() { return getToken(RefMLParser.LET, 0); }
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(RefMLParser.EQUAL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode REC() { return getToken(RefMLParser.REC, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunDeclContext(FunctionDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterFunDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitFunDecl(this);
		}
	}
	public static class FunDeclInContext extends FunctionDeclContext {
		public TerminalNode LET() { return getToken(RefMLParser.LET, 0); }
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(RefMLParser.EQUAL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IN() { return getToken(RefMLParser.IN, 0); }
		public TerminalNode REC() { return getToken(RefMLParser.REC, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunDeclInContext(FunctionDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterFunDeclIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitFunDeclIn(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDecl);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new FunDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(LET);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REC) {
					{
					setState(57);
					match(REC);
					}
				}

				setState(60);
				match(ID);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(61);
					formalParameters();
					}
				}

				setState(64);
				match(EQUAL);
				setState(65);
				statement(0);
				}
				break;
			case 2:
				_localctx = new FunDeclInContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(LET);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REC) {
					{
					setState(67);
					match(REC);
					}
				}

				setState(70);
				match(ID);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(71);
					formalParameters();
					}
				}

				setState(74);
				match(EQUAL);
				setState(75);
				statement(0);
				setState(76);
				match(IN);
				setState(77);
				statement(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			formalParameter();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(82);
				formalParameter();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarStatContext extends StatementContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public VarStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterVarStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitVarStat(this);
		}
	}
	public static class IfStatContext extends StatementContext {
		public TerminalNode IF() { return getToken(RefMLParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(RefMLParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(RefMLParser.ELSE, 0); }
		public IfStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitIfStat(this);
		}
	}
	public static class ExprStaContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterExprSta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitExprSta(this);
		}
	}
	public static class SeqStatContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SEQ() { return getToken(RefMLParser.SEQ, 0); }
		public SeqStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterSeqStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitSeqStat(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case TRUE:
			case FALSE:
			case LPAR:
			case LBRA:
			case BANG:
			case ID:
			case INT:
				{
				_localctx = new ExprStaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91);
				expr(0);
				}
				break;
			case LET:
				{
				_localctx = new VarStatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				declarations();
				}
				break;
			case IF:
				{
				_localctx = new IfStatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(IF);
				setState(94);
				expr(0);
				setState(95);
				match(THEN);
				setState(96);
				statement(0);
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(97);
					match(ELSE);
					setState(98);
					statement(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqStatContext(new StatementContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(103);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(104);
					match(SEQ);
					setState(105);
					statement(5);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			expr(0);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					expr(0);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(RefMLParser.PLUS, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitAdd(this);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitCall(this);
		}
	}
	public static class SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(RefMLParser.MINUS, 0); }
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitSub(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(RefMLParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(RefMLParser.RPAR, 0); }
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitParenthesis(this);
		}
	}
	public static class AssociationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COLEQ() { return getToken(RefMLParser.COLEQ, 0); }
		public AssociationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitAssociation(this);
		}
	}
	public static class MultContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(RefMLParser.TIMES, 0); }
		public MultContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitMult(this);
		}
	}
	public static class EqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(RefMLParser.EQUAL, 0); }
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitEqual(this);
		}
	}
	public static class VarContext extends ExprContext {
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitVar(this);
		}
	}
	public static class ConstantContext extends ExprContext {
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitConstant(this);
		}
	}
	public static class BangContext extends ExprContext {
		public TerminalNode BANG() { return getToken(RefMLParser.BANG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BangContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterBang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitBang(this);
		}
	}
	public static class LessEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LEQ() { return getToken(RefMLParser.LEQ, 0); }
		public LessEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitLessEqual(this);
		}
	}
	public static class NegateContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(RefMLParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitNegate(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new BangContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				match(BANG);
				setState(120);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(MINUS);
				setState(122);
				expr(8);
				}
				break;
			case 3:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(LPAR);
				setState(125);
				expr(0);
				setState(126);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				consts();
				}
				break;
			case 6:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(ID);
				setState(130);
				argList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(134);
						match(TIMES);
						setState(135);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(137);
						match(PLUS);
						setState(138);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(140);
						match(MINUS);
						setState(141);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(143);
						match(EQUAL);
						setState(144);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new AssociationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(146);
						match(COLEQ);
						setState(147);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(149);
						match(LEQ);
						setState(150);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRA() { return getToken(RefMLParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(RefMLParser.RBRA, 0); }
		public List_elementsContext list_elements() {
			return getRuleContext(List_elementsContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LBRA);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << LBRA) | (1L << INT))) != 0)) {
				{
				setState(157);
				list_elements();
				}
			}

			setState(160);
			match(RBRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_elementsContext extends ParserRuleContext {
		public List<List_elementContext> list_element() {
			return getRuleContexts(List_elementContext.class);
		}
		public List_elementContext list_element(int i) {
			return getRuleContext(List_elementContext.class,i);
		}
		public List<TerminalNode> SEQ() { return getTokens(RefMLParser.SEQ); }
		public TerminalNode SEQ(int i) {
			return getToken(RefMLParser.SEQ, i);
		}
		public List_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterList_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitList_elements(this);
		}
	}

	public final List_elementsContext list_elements() throws RecognitionException {
		List_elementsContext _localctx = new List_elementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			list_element();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEQ) {
				{
				{
				setState(163);
				match(SEQ);
				setState(164);
				list_element();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_elementContext extends ParserRuleContext {
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public List_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterList_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitList_element(this);
		}
	}

	public final List_elementContext list_element() throws RecognitionException {
		List_elementContext _localctx = new List_elementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			consts();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RefMLParser.INT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(RefMLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(RefMLParser.RPAR, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitConsts(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_consts);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				bool();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(LPAR);
				setState(175);
				match(RPAR);
				}
				break;
			case LBRA:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(RefMLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RefMLParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00b8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3"+
		"\3\5\3&\n\3\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3"+
		"\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\5\5=\n\5\3\5\3\5\5\5A\n\5\3\5\3\5\3\5"+
		"\3\5\5\5G\n\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\7"+
		"\6V\n\6\f\6\16\6Y\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"f\n\b\5\bh\n\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3\t\3\t\7\tt\n\t\f"+
		"\t\16\tw\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0086\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u009a\n\n\f\n\16\n\u009d\13\n\3\13\3\13\5\13\u00a1\n"+
		"\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a8\n\f\f\f\16\f\u00ab\13\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00b4\n\16\3\17\3\17\3\17\2\4\16\22\20\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\5\6\2\u00c9\2\37\3\2\2\2\4"+
		"%\3\2\2\2\68\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fZ\3\2\2\2\16g\3\2\2\2\20q"+
		"\3\2\2\2\22\u0085\3\2\2\2\24\u009e\3\2\2\2\26\u00a4\3\2\2\2\30\u00ac\3"+
		"\2\2\2\32\u00b3\3\2\2\2\34\u00b5\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3"+
		"\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#&\5\6\4\2$&\5\b\5\2%#\3\2\2"+
		"\2%$\3\2\2\2&\5\3\2\2\2\'(\7\16\2\2()\7\34\2\2)+\7\21\2\2*,\7\r\2\2+*"+
		"\3\2\2\2+,\3\2\2\2,-\3\2\2\2-9\5\22\n\2./\7\16\2\2/\60\7\34\2\2\60\62"+
		"\7\21\2\2\61\63\7\r\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65"+
		"\5\22\n\2\65\66\7\22\2\2\66\67\5\16\b\2\679\3\2\2\28\'\3\2\2\28.\3\2\2"+
		"\29\7\3\2\2\2:<\7\16\2\2;=\7\17\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>@\7"+
		"\34\2\2?A\5\n\6\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\21\2\2CR\5\16\b\2"+
		"DF\7\16\2\2EG\7\17\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HJ\7\34\2\2IK\5\n"+
		"\6\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\21\2\2MN\5\16\b\2NO\7\22\2\2OP"+
		"\5\16\b\2PR\3\2\2\2Q:\3\2\2\2QD\3\2\2\2R\t\3\2\2\2SW\5\f\7\2TV\5\f\7\2"+
		"UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\13\3\2\2\2YW\3\2\2\2Z[\7\34"+
		"\2\2[\r\3\2\2\2\\]\b\b\1\2]h\5\22\n\2^h\5\4\3\2_`\7\30\2\2`a\5\22\n\2"+
		"ab\7\31\2\2be\5\16\b\2cd\7\32\2\2df\5\16\b\2ec\3\2\2\2ef\3\2\2\2fh\3\2"+
		"\2\2g\\\3\2\2\2g^\3\2\2\2g_\3\2\2\2hn\3\2\2\2ij\f\6\2\2jk\7\26\2\2km\5"+
		"\16\b\7li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\17\3\2\2\2pn\3\2\2\2"+
		"qu\5\22\n\2rt\5\22\n\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\21\3\2"+
		"\2\2wu\3\2\2\2xy\b\n\1\2yz\7\20\2\2z\u0086\5\22\n\16{|\7\3\2\2|\u0086"+
		"\5\22\n\n}\u0086\7\34\2\2~\177\7\7\2\2\177\u0080\5\22\n\2\u0080\u0081"+
		"\7\b\2\2\u0081\u0086\3\2\2\2\u0082\u0086\5\32\16\2\u0083\u0084\7\34\2"+
		"\2\u0084\u0086\5\20\t\2\u0085x\3\2\2\2\u0085{\3\2\2\2\u0085}\3\2\2\2\u0085"+
		"~\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u009b\3\2\2\2"+
		"\u0087\u0088\f\r\2\2\u0088\u0089\7\25\2\2\u0089\u009a\5\22\n\16\u008a"+
		"\u008b\f\f\2\2\u008b\u008c\7\4\2\2\u008c\u009a\5\22\n\r\u008d\u008e\f"+
		"\13\2\2\u008e\u008f\7\3\2\2\u008f\u009a\5\22\n\f\u0090\u0091\f\t\2\2\u0091"+
		"\u0092\7\21\2\2\u0092\u009a\5\22\n\n\u0093\u0094\f\b\2\2\u0094\u0095\7"+
		"\27\2\2\u0095\u009a\5\22\n\t\u0096\u0097\f\7\2\2\u0097\u0098\7\24\2\2"+
		"\u0098\u009a\5\22\n\b\u0099\u0087\3\2\2\2\u0099\u008a\3\2\2\2\u0099\u008d"+
		"\3\2\2\2\u0099\u0090\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\23\3\2\2"+
		"\2\u009d\u009b\3\2\2\2\u009e\u00a0\7\t\2\2\u009f\u00a1\5\26\f\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\n"+
		"\2\2\u00a3\25\3\2\2\2\u00a4\u00a9\5\30\r\2\u00a5\u00a6\7\26\2\2\u00a6"+
		"\u00a8\5\30\r\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\5\32\16\2\u00ad\31\3\2\2\2\u00ae\u00b4\7\35\2\2\u00af\u00b4\5\34"+
		"\17\2\u00b0\u00b1\7\7\2\2\u00b1\u00b4\7\b\2\2\u00b2\u00b4\5\24\13\2\u00b3"+
		"\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b2\3\2"+
		"\2\2\u00b4\33\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6\35\3\2\2\2\27!%+\628<"+
		"@FJQWegnu\u0085\u0099\u009b\u00a0\u00a9\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}