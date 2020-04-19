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
		MINUS=1, PLUS=2, TRUE=3, FALSE=4, LPAR=5, RPAR=6, LBRA=7, RBRA=8, REF=9, 
		UNIT=10, LET=11, REC=12, BANG=13, EQUAL=14, IN=15, ARROW=16, LEQ=17, TIMES=18, 
		SEQ=19, COLEQ=20, IF=21, THEN=22, ELSE=23, COMMA=24, POP=25, PUSH=26, 
		ID=27, INT=28, SL_COMMENT=29, WS=30;
	public static final int
		RULE_program = 0, RULE_functionDecl = 1, RULE_formalParameters = 2, RULE_formalParameter = 3, 
		RULE_varDecl = 4, RULE_statement = 5, RULE_expr = 6, RULE_exprList = 7, 
		RULE_list = 8, RULE_list_elements = 9, RULE_list_element = 10, RULE_consts = 11, 
		RULE_bool = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionDecl", "formalParameters", "formalParameter", "varDecl", 
			"statement", "expr", "exprList", "list", "list_elements", "list_element", 
			"consts", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'+'", "'TRUE'", "'FALSE'", "'('", "')'", "'['", "']'", 
			"'ref'", "'()'", "'let'", "'rec'", "'!'", "'='", "'in'", "'->'", "'<'", 
			"'*'", "';'", "':='", "'if'", "'then'", "'else'", "','", "'pop'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MINUS", "PLUS", "TRUE", "FALSE", "LPAR", "RPAR", "LBRA", "RBRA", 
			"REF", "UNIT", "LET", "REC", "BANG", "EQUAL", "IN", "ARROW", "LEQ", "TIMES", 
			"SEQ", "COLEQ", "IF", "THEN", "ELSE", "COMMA", "POP", "PUSH", "ID", "INT", 
			"SL_COMMENT", "WS"
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
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
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
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(28);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(26);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(27);
					varDecl();
					}
					break;
				}
				}
				setState(30); 
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(RefMLParser.LET, 0); }
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public TerminalNode ARROW() { return getToken(RefMLParser.ARROW, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(LET);
			setState(33);
			match(ID);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(34);
				formalParameters();
				}
			}

			setState(37);
			match(ARROW);
			setState(38);
			statement(0);
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
		enterRule(_localctx, 4, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			formalParameter();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(41);
				formalParameter();
				}
				}
				setState(46);
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
		enterRule(_localctx, 6, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(RefMLParser.LET, 0); }
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(RefMLParser.EQUAL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode REF() { return getToken(RefMLParser.REF, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(LET);
			setState(50);
			match(ID);
			setState(51);
			match(EQUAL);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(52);
				match(REF);
				}
			}

			setState(55);
			statement(0);
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
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
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
	public static class FuncStatContext extends StatementContext {
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public FuncStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterFuncStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitFuncStat(this);
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
	public static class InStatContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IN() { return getToken(RefMLParser.IN, 0); }
		public InStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterInStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitInStat(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ExprStaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				expr(0);
				}
				break;
			case 2:
				{
				_localctx = new VarStatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				varDecl();
				}
				break;
			case 3:
				{
				_localctx = new FuncStatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				functionDecl();
				}
				break;
			case 4:
				{
				_localctx = new IfStatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(IF);
				setState(62);
				expr(0);
				setState(63);
				match(THEN);
				setState(64);
				statement(0);
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(65);
					match(ELSE);
					setState(66);
					statement(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new InStatContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(71);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(72);
						match(IN);
						setState(73);
						statement(7);
						}
						break;
					case 2:
						{
						_localctx = new SeqStatContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(74);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(75);
						match(SEQ);
						setState(76);
						statement(6);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
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
	public static class ListPopListContext extends ExprContext {
		public TerminalNode POP() { return getToken(RefMLParser.POP, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListPopListContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterListPopList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitListPopList(this);
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
	public static class ListPopIdContext extends ExprContext {
		public TerminalNode POP() { return getToken(RefMLParser.POP, 0); }
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public ListPopIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterListPopId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitListPopId(this);
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
	public static class ListPushListContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PUSH() { return getToken(RefMLParser.PUSH, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListPushListContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterListPushList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitListPushList(this);
		}
	}
	public static class ListPushIdContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PUSH() { return getToken(RefMLParser.PUSH, 0); }
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public ListPushIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterListPushId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitListPushId(this);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				match(ID);
				setState(84);
				exprList();
				}
				break;
			case 2:
				{
				_localctx = new BangContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(BANG);
				setState(86);
				expr(14);
				}
				break;
			case 3:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(LPAR);
				setState(89);
				expr(0);
				setState(90);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				consts();
				}
				break;
			case 6:
				{
				_localctx = new ListPopIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(POP);
				setState(94);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new ListPopListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(POP);
				setState(96);
				list();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(100);
						match(TIMES);
						setState(101);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(103);
						match(PLUS);
						setState(104);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(106);
						match(MINUS);
						setState(107);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(109);
						match(EQUAL);
						setState(110);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new AssociationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(112);
						match(COLEQ);
						setState(113);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(115);
						match(LEQ);
						setState(116);
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ListPushIdContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(118);
						match(PUSH);
						setState(119);
						match(ID);
						}
						break;
					case 8:
						{
						_localctx = new ListPushListContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(121);
						match(PUSH);
						setState(122);
						list();
						}
						break;
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			expr(0);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					expr(0);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 16, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(LBRA);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << UNIT) | (1L << INT))) != 0)) {
				{
				setState(136);
				list_elements();
				}
			}

			setState(139);
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
		enterRule(_localctx, 18, RULE_list_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			list_element();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEQ) {
				{
				{
				setState(142);
				match(SEQ);
				setState(143);
				list_element();
				}
				}
				setState(148);
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
		enterRule(_localctx, 20, RULE_list_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		public TerminalNode UNIT() { return getToken(RefMLParser.UNIT, 0); }
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
		enterRule(_localctx, 22, RULE_consts);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				bool();
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(UNIT);
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
		enterRule(_localctx, 24, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		case 5:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\3\3\3\3\3"+
		"\5\3&\n\3\3\3\3\3\3\3\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\5\68\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7F\n\7\5\7H\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\3\t\3\t\7\t\u0085\n"+
		"\t\f\t\16\t\u0088\13\t\3\n\3\n\5\n\u008c\n\n\3\n\3\n\3\13\3\13\3\13\7"+
		"\13\u0093\n\13\f\13\16\13\u0096\13\13\3\f\3\f\3\r\3\r\3\r\5\r\u009d\n"+
		"\r\3\16\3\16\3\16\2\4\f\16\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2"+
		"\5\6\2\u00b1\2\36\3\2\2\2\4\"\3\2\2\2\6*\3\2\2\2\b\61\3\2\2\2\n\63\3\2"+
		"\2\2\fG\3\2\2\2\16c\3\2\2\2\20\u0082\3\2\2\2\22\u0089\3\2\2\2\24\u008f"+
		"\3\2\2\2\26\u0097\3\2\2\2\30\u009c\3\2\2\2\32\u009e\3\2\2\2\34\37\5\4"+
		"\3\2\35\37\5\n\6\2\36\34\3\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2"+
		" !\3\2\2\2!\3\3\2\2\2\"#\7\r\2\2#%\7\35\2\2$&\5\6\4\2%$\3\2\2\2%&\3\2"+
		"\2\2&\'\3\2\2\2\'(\7\22\2\2()\5\f\7\2)\5\3\2\2\2*.\5\b\5\2+-\5\b\5\2,"+
		"+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\7\3\2\2\2\60.\3\2\2\2\61\62"+
		"\7\35\2\2\62\t\3\2\2\2\63\64\7\r\2\2\64\65\7\35\2\2\65\67\7\20\2\2\66"+
		"8\7\13\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\f\7\2:\13\3\2\2\2;"+
		"<\b\7\1\2<H\5\16\b\2=H\5\n\6\2>H\5\4\3\2?@\7\27\2\2@A\5\16\b\2AB\7\30"+
		"\2\2BE\5\f\7\2CD\7\31\2\2DF\5\f\7\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2G;\3"+
		"\2\2\2G=\3\2\2\2G>\3\2\2\2G?\3\2\2\2HQ\3\2\2\2IJ\f\b\2\2JK\7\21\2\2KP"+
		"\5\f\7\tLM\f\7\2\2MN\7\25\2\2NP\5\f\7\bOI\3\2\2\2OL\3\2\2\2PS\3\2\2\2"+
		"QO\3\2\2\2QR\3\2\2\2R\r\3\2\2\2SQ\3\2\2\2TU\b\b\1\2UV\7\35\2\2Vd\5\20"+
		"\t\2WX\7\17\2\2Xd\5\16\b\20Yd\7\35\2\2Z[\7\7\2\2[\\\5\16\b\2\\]\7\b\2"+
		"\2]d\3\2\2\2^d\5\30\r\2_`\7\33\2\2`d\7\35\2\2ab\7\33\2\2bd\5\22\n\2cT"+
		"\3\2\2\2cW\3\2\2\2cY\3\2\2\2cZ\3\2\2\2c^\3\2\2\2c_\3\2\2\2ca\3\2\2\2d"+
		"\177\3\2\2\2ef\f\17\2\2fg\7\24\2\2g~\5\16\b\20hi\f\16\2\2ij\7\4\2\2j~"+
		"\5\16\b\17kl\f\r\2\2lm\7\3\2\2m~\5\16\b\16no\f\f\2\2op\7\20\2\2p~\5\16"+
		"\b\rqr\f\13\2\2rs\7\26\2\2s~\5\16\b\ftu\f\n\2\2uv\7\23\2\2v~\5\16\b\13"+
		"wx\f\4\2\2xy\7\34\2\2y~\7\35\2\2z{\f\3\2\2{|\7\34\2\2|~\5\22\n\2}e\3\2"+
		"\2\2}h\3\2\2\2}k\3\2\2\2}n\3\2\2\2}q\3\2\2\2}t\3\2\2\2}w\3\2\2\2}z\3\2"+
		"\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\17\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0082\u0086\5\16\b\2\u0083\u0085\5\16\b\2\u0084\u0083\3\2"+
		"\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\21\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7\t\2\2\u008a\u008c\5\24\13"+
		"\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\7\n\2\2\u008e\23\3\2\2\2\u008f\u0094\5\26\f\2\u0090\u0091\7\25\2\2\u0091"+
		"\u0093\5\26\f\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\25\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\5\30\r\2\u0098\27\3\2\2\2\u0099\u009d\7\36\2\2\u009a\u009d\5\32"+
		"\16\2\u009b\u009d\7\f\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\31\3\2\2\2\u009e\u009f\t\2\2\2\u009f\33\3\2\2\2\22"+
		"\36 %.\67EGOQc}\177\u0086\u008b\u0094\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}