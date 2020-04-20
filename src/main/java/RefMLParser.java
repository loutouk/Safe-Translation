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
		RCUR=10, REF=11, UNIT=12, LET=13, REC=14, BANG=15, EQUAL=16, IN=17, ARROW=18, 
		LEQ=19, TIMES=20, SEQ=21, COLEQ=22, IF=23, THEN=24, ELSE=25, COMMA=26, 
		POP=27, PEEK=28, PUSH=29, ID=30, INT=31, SL_COMMENT=32, WS=33;
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
			"'{'", "'}'", "'ref'", "'()'", "'let'", "'rec'", "'!'", "'='", "'in'", 
			"'->'", "'<'", "'*'", "';'", "':='", "'if'", "'then'", "'else'", "','", 
			"'pop'", "'peek'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MINUS", "PLUS", "TRUE", "FALSE", "LPAR", "RPAR", "LBRA", "RBRA", 
			"LCUR", "RCUR", "REF", "UNIT", "LET", "REC", "BANG", "EQUAL", "IN", "ARROW", 
			"LEQ", "TIMES", "SEQ", "COLEQ", "IF", "THEN", "ELSE", "COMMA", "POP", 
			"PEEK", "PUSH", "ID", "INT", "SL_COMMENT", "WS"
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
		public TerminalNode LCUR() { return getToken(RefMLParser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(RefMLParser.RCUR, 0); }
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
		public TerminalNode BANG() { return getToken(RefMLParser.BANG, 0); }
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
	public static class ListPeekListContext extends ExprContext {
		public TerminalNode PEEK() { return getToken(RefMLParser.PEEK, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListPeekListContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterListPeekList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitListPeekList(this);
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
	public static class ListPeekIdContext extends ExprContext {
		public TerminalNode PEEK() { return getToken(RefMLParser.PEEK, 0); }
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public TerminalNode BANG() { return getToken(RefMLParser.BANG, 0); }
		public ListPeekIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).enterListPeekId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefMLListener ) ((RefMLListener)listener).exitListPeekId(this);
		}
	}
	public static class ListPushIdContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PUSH() { return getToken(RefMLParser.PUSH, 0); }
		public TerminalNode ID() { return getToken(RefMLParser.ID, 0); }
		public TerminalNode BANG() { return getToken(RefMLParser.BANG, 0); }
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				match(ID);
				setState(84);
				match(LCUR);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << LBRA) | (1L << UNIT) | (1L << BANG) | (1L << POP) | (1L << PEEK) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(85);
					exprList();
					}
				}

				setState(88);
				match(RCUR);
				}
				break;
			case 2:
				{
				_localctx = new BangContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(BANG);
				setState(90);
				expr(16);
				}
				break;
			case 3:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(LPAR);
				setState(93);
				expr(0);
				setState(94);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				consts();
				}
				break;
			case 6:
				{
				_localctx = new ListPopIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(POP);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BANG) {
					{
					setState(98);
					match(BANG);
					}
				}

				setState(101);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new ListPopListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(POP);
				setState(103);
				list();
				}
				break;
			case 8:
				{
				_localctx = new ListPeekIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(PEEK);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BANG) {
					{
					setState(105);
					match(BANG);
					}
				}

				setState(108);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ListPeekListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(PEEK);
				setState(110);
				list();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(114);
						match(TIMES);
						setState(115);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(117);
						match(PLUS);
						setState(118);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(120);
						match(MINUS);
						setState(121);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(123);
						match(EQUAL);
						setState(124);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new AssociationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(126);
						match(COLEQ);
						setState(127);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(129);
						match(LEQ);
						setState(130);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new ListPushIdContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(132);
						match(PUSH);
						setState(134);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==BANG) {
							{
							setState(133);
							match(BANG);
							}
						}

						setState(136);
						match(ID);
						}
						break;
					case 8:
						{
						_localctx = new ListPushListContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(138);
						match(PUSH);
						setState(139);
						list();
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(RefMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RefMLParser.COMMA, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			expr(0);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(146);
				match(COMMA);
				setState(147);
				expr(0);
				}
				}
				setState(152);
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
			setState(153);
			match(LBRA);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LBRA) | (1L << UNIT) | (1L << INT))) != 0)) {
				{
				setState(154);
				list_elements();
				}
			}

			setState(157);
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
			setState(159);
			list_element();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEQ) {
				{
				{
				setState(160);
				match(SEQ);
				setState(161);
				list_element();
				}
				}
				setState(166);
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
			setState(167);
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
		enterRule(_localctx, 22, RULE_consts);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				bool();
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(UNIT);
				}
				break;
			case LBRA:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
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
		enterRule(_localctx, 24, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\3\3\3\3\3"+
		"\5\3&\n\3\3\3\3\3\3\3\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\5\68\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7F\n\7\5\7H\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7\3\b\3"+
		"\b\3\b\3\b\5\bY\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bf\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\b\5\br\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0089\n\b\3\b\3\b\3\b\3\b\7\b\u008f\n\b\f\b\16\b\u0092\13\b\3\t\3\t\3"+
		"\t\7\t\u0097\n\t\f\t\16\t\u009a\13\t\3\n\3\n\5\n\u009e\n\n\3\n\3\n\3\13"+
		"\3\13\3\13\7\13\u00a5\n\13\f\13\16\13\u00a8\13\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\5\r\u00b0\n\r\3\16\3\16\3\16\2\4\f\16\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\3\3\2\5\6\2\u00cb\2\36\3\2\2\2\4\"\3\2\2\2\6*\3\2\2\2\b\61"+
		"\3\2\2\2\n\63\3\2\2\2\fG\3\2\2\2\16q\3\2\2\2\20\u0093\3\2\2\2\22\u009b"+
		"\3\2\2\2\24\u00a1\3\2\2\2\26\u00a9\3\2\2\2\30\u00af\3\2\2\2\32\u00b1\3"+
		"\2\2\2\34\37\5\4\3\2\35\37\5\n\6\2\36\34\3\2\2\2\36\35\3\2\2\2\37 \3\2"+
		"\2\2 \36\3\2\2\2 !\3\2\2\2!\3\3\2\2\2\"#\7\17\2\2#%\7 \2\2$&\5\6\4\2%"+
		"$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\24\2\2()\5\f\7\2)\5\3\2\2\2*.\5\b"+
		"\5\2+-\5\b\5\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\7\3\2\2\2\60"+
		".\3\2\2\2\61\62\7 \2\2\62\t\3\2\2\2\63\64\7\17\2\2\64\65\7 \2\2\65\67"+
		"\7\22\2\2\668\7\r\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\f\7\2:\13"+
		"\3\2\2\2;<\b\7\1\2<H\5\16\b\2=H\5\n\6\2>H\5\4\3\2?@\7\31\2\2@A\5\16\b"+
		"\2AB\7\32\2\2BE\5\f\7\2CD\7\33\2\2DF\5\f\7\2EC\3\2\2\2EF\3\2\2\2FH\3\2"+
		"\2\2G;\3\2\2\2G=\3\2\2\2G>\3\2\2\2G?\3\2\2\2HQ\3\2\2\2IJ\f\b\2\2JK\7\23"+
		"\2\2KP\5\f\7\tLM\f\7\2\2MN\7\27\2\2NP\5\f\7\bOI\3\2\2\2OL\3\2\2\2PS\3"+
		"\2\2\2QO\3\2\2\2QR\3\2\2\2R\r\3\2\2\2SQ\3\2\2\2TU\b\b\1\2UV\7 \2\2VX\7"+
		"\13\2\2WY\5\20\t\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Zr\7\f\2\2[\\\7\21\2\2"+
		"\\r\5\16\b\22]r\7 \2\2^_\7\7\2\2_`\5\16\b\2`a\7\b\2\2ar\3\2\2\2br\5\30"+
		"\r\2ce\7\35\2\2df\7\21\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gr\7 \2\2hi\7"+
		"\35\2\2ir\5\22\n\2jl\7\36\2\2km\7\21\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2"+
		"nr\7 \2\2op\7\36\2\2pr\5\22\n\2qT\3\2\2\2q[\3\2\2\2q]\3\2\2\2q^\3\2\2"+
		"\2qb\3\2\2\2qc\3\2\2\2qh\3\2\2\2qj\3\2\2\2qo\3\2\2\2r\u0090\3\2\2\2st"+
		"\f\21\2\2tu\7\26\2\2u\u008f\5\16\b\22vw\f\20\2\2wx\7\4\2\2x\u008f\5\16"+
		"\b\21yz\f\17\2\2z{\7\3\2\2{\u008f\5\16\b\20|}\f\16\2\2}~\7\22\2\2~\u008f"+
		"\5\16\b\17\177\u0080\f\r\2\2\u0080\u0081\7\30\2\2\u0081\u008f\5\16\b\16"+
		"\u0082\u0083\f\f\2\2\u0083\u0084\7\25\2\2\u0084\u008f\5\16\b\r\u0085\u0086"+
		"\f\4\2\2\u0086\u0088\7\37\2\2\u0087\u0089\7\21\2\2\u0088\u0087\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008f\7 \2\2\u008b\u008c"+
		"\f\3\2\2\u008c\u008d\7\37\2\2\u008d\u008f\5\22\n\2\u008es\3\2\2\2\u008e"+
		"v\3\2\2\2\u008ey\3\2\2\2\u008e|\3\2\2\2\u008e\177\3\2\2\2\u008e\u0082"+
		"\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\17\3\2\2\2\u0092\u0090\3\2\2"+
		"\2\u0093\u0098\5\16\b\2\u0094\u0095\7\34\2\2\u0095\u0097\5\16\b\2\u0096"+
		"\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\21\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\t\2\2\u009c\u009e"+
		"\5\24\13\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\u00a0\7\n\2\2\u00a0\23\3\2\2\2\u00a1\u00a6\5\26\f\2\u00a2\u00a3"+
		"\7\27\2\2\u00a3\u00a5\5\26\f\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\25\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9\u00aa\5\30\r\2\u00aa\27\3\2\2\2\u00ab\u00b0\7!\2\2\u00ac"+
		"\u00b0\5\32\16\2\u00ad\u00b0\7\16\2\2\u00ae\u00b0\5\22\n\2\u00af\u00ab"+
		"\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\31\3\2\2\2\u00b1\u00b2\t\2\2\2\u00b2\33\3\2\2\2\26\36 %.\67EGOQXelq\u0088"+
		"\u008e\u0090\u0098\u009d\u00a6\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}