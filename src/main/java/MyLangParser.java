// Generated from .\MyLang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUE=1, FALSE=2, LPAR=3, RPAR=4, LBRA=5, RBRA=6, REF=7, UNIT=8, LET=9, 
		REC=10, BANG=11, EQUAL=12, IN=13, ARROW=14, LEQ=15, TIMES=16, PLUS=17, 
		MINUS=18, SEQ=19, COLEQ=20, IF=21, THEN=22, ELSE=23, FUN=24, COMMA=25, 
		POP=26, PUSH=27, IDENT=28, INT=29, WS=30;
	public static final int
		RULE_program = 0, RULE_term = 1, RULE_simple_term = 2, RULE_parameters = 3, 
		RULE_parameter = 4, RULE_bool = 5, RULE_list = 6, RULE_list_elements = 7, 
		RULE_list_element = 8, RULE_constant = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "term", "simple_term", "parameters", "parameter", "bool", 
			"list", "list_elements", "list_element", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TRUE'", "'FALSE'", "'('", "')'", "'['", "']'", "'ref'", "'()'", 
			"'let'", "'rec'", "'!'", "'='", "'in'", "'->'", "'<'", "'*'", "'+'", 
			"'-'", "';'", "':='", "'if'", "'then'", "'else'", "'fun'", "','", "'pop'", 
			"'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRUE", "FALSE", "LPAR", "RPAR", "LBRA", "RBRA", "REF", "UNIT", 
			"LET", "REC", "BANG", "EQUAL", "IN", "ARROW", "LEQ", "TIMES", "PLUS", 
			"MINUS", "SEQ", "COLEQ", "IF", "THEN", "ELSE", "FUN", "COMMA", "POP", 
			"PUSH", "IDENT", "INT", "WS"
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
	public String getGrammarFileName() { return "MyLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				term(0);
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << LBRA) | (1L << REF) | (1L << UNIT) | (1L << LET) | (1L << BANG) | (1L << IF) | (1L << FUN) | (1L << POP) | (1L << IDENT) | (1L << INT))) != 0) );
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

	public static class TermContext extends ParserRuleContext {
		public List<Simple_termContext> simple_term() {
			return getRuleContexts(Simple_termContext.class);
		}
		public Simple_termContext simple_term(int i) {
			return getRuleContext(Simple_termContext.class,i);
		}
		public TerminalNode LET() { return getToken(MyLangParser.LET, 0); }
		public TerminalNode IDENT() { return getToken(MyLangParser.IDENT, 0); }
		public TerminalNode EQUAL() { return getToken(MyLangParser.EQUAL, 0); }
		public TerminalNode REF() { return getToken(MyLangParser.REF, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(MyLangParser.TIMES, 0); }
		public TerminalNode PLUS() { return getToken(MyLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MyLangParser.MINUS, 0); }
		public TerminalNode LEQ() { return getToken(MyLangParser.LEQ, 0); }
		public TerminalNode IF() { return getToken(MyLangParser.IF, 0); }
		public TerminalNode THEN() { return getToken(MyLangParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(MyLangParser.ELSE, 0); }
		public TerminalNode IN() { return getToken(MyLangParser.IN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode FUN() { return getToken(MyLangParser.FUN, 0); }
		public TerminalNode ARROW() { return getToken(MyLangParser.ARROW, 0); }
		public TerminalNode POP() { return getToken(MyLangParser.POP, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode PUSH() { return getToken(MyLangParser.PUSH, 0); }
		public TerminalNode SEQ() { return getToken(MyLangParser.SEQ, 0); }
		public TerminalNode COLEQ() { return getToken(MyLangParser.COLEQ, 0); }
		public TerminalNode COMMA() { return getToken(MyLangParser.COMMA, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(26);
				simple_term();
				}
				break;
			case 2:
				{
				setState(27);
				match(LET);
				setState(28);
				match(IDENT);
				setState(29);
				match(EQUAL);
				setState(30);
				simple_term();
				}
				break;
			case 3:
				{
				setState(31);
				match(REF);
				setState(32);
				term(17);
				}
				break;
			case 4:
				{
				setState(33);
				simple_term();
				setState(34);
				match(TIMES);
				setState(35);
				simple_term();
				}
				break;
			case 5:
				{
				setState(37);
				simple_term();
				setState(38);
				match(PLUS);
				setState(39);
				simple_term();
				}
				break;
			case 6:
				{
				setState(41);
				simple_term();
				setState(42);
				match(MINUS);
				setState(43);
				simple_term();
				}
				break;
			case 7:
				{
				setState(45);
				simple_term();
				setState(46);
				match(EQUAL);
				setState(47);
				simple_term();
				}
				break;
			case 8:
				{
				setState(49);
				simple_term();
				setState(50);
				match(LEQ);
				setState(51);
				simple_term();
				}
				break;
			case 9:
				{
				setState(53);
				match(IF);
				setState(54);
				term(0);
				setState(55);
				match(THEN);
				setState(56);
				term(0);
				setState(57);
				match(ELSE);
				setState(58);
				term(8);
				}
				break;
			case 10:
				{
				setState(60);
				match(LET);
				setState(61);
				match(IDENT);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(62);
					parameters();
					}
				}

				setState(65);
				match(EQUAL);
				setState(66);
				term(0);
				setState(67);
				match(IN);
				setState(68);
				term(6);
				}
				break;
			case 11:
				{
				setState(70);
				match(FUN);
				setState(71);
				match(IDENT);
				setState(72);
				match(ARROW);
				setState(73);
				term(5);
				}
				break;
			case 12:
				{
				setState(74);
				match(POP);
				setState(75);
				match(IDENT);
				}
				break;
			case 13:
				{
				setState(76);
				match(POP);
				setState(77);
				list();
				}
				break;
			case 14:
				{
				setState(78);
				simple_term();
				setState(79);
				match(PUSH);
				setState(80);
				match(IDENT);
				}
				break;
			case 15:
				{
				setState(82);
				simple_term();
				setState(83);
				match(PUSH);
				setState(84);
				list();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(88);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(89);
						match(SEQ);
						setState(90);
						term(16);
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(91);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(92);
						match(COLEQ);
						setState(93);
						term(15);
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(94);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(95);
						match(COMMA);
						setState(96);
						term(8);
						}
						break;
					case 4:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(97);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(98);
						simple_term();
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Simple_termContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(MyLangParser.BANG, 0); }
		public Simple_termContext simple_term() {
			return getRuleContext(Simple_termContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MyLangParser.IDENT, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(MyLangParser.LPAR, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MyLangParser.RPAR, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Simple_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterSimple_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitSimple_term(this);
		}
	}

	public final Simple_termContext simple_term() throws RecognitionException {
		Simple_termContext _localctx = new Simple_termContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_term);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BANG:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(BANG);
				setState(105);
				simple_term();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(IDENT);
				}
				break;
			case TRUE:
			case FALSE:
			case UNIT:
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				constant();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(LPAR);
				setState(109);
				term(0);
				setState(110);
				match(RPAR);
				}
				break;
			case LBRA:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			parameter();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(116);
				parameter();
				}
				}
				setState(121);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(MyLangParser.IDENT, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENT);
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
		public TerminalNode TRUE() { return getToken(MyLangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MyLangParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRA() { return getToken(MyLangParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(MyLangParser.RBRA, 0); }
		public List_elementsContext list_elements() {
			return getRuleContext(List_elementsContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LBRA);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << UNIT) | (1L << INT))) != 0)) {
				{
				setState(127);
				list_elements();
				}
			}

			setState(130);
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
		public List<TerminalNode> SEQ() { return getTokens(MyLangParser.SEQ); }
		public TerminalNode SEQ(int i) {
			return getToken(MyLangParser.SEQ, i);
		}
		public List_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterList_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitList_elements(this);
		}
	}

	public final List_elementsContext list_elements() throws RecognitionException {
		List_elementsContext _localctx = new List_elementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			list_element();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEQ) {
				{
				{
				setState(133);
				match(SEQ);
				setState(134);
				list_element();
				}
				}
				setState(139);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public List_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterList_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitList_element(this);
		}
	}

	public final List_elementContext list_element() throws RecognitionException {
		List_elementContext _localctx = new List_elementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			constant();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MyLangParser.INT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode UNIT() { return getToken(MyLangParser.UNIT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				bool();
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0096\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"Y\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3f\n\3\f\3\16\3i\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4t\n\4\3\5\3\5\7\5x\n\5\f\5\16"+
		"\5{\13\5\3\6\3\6\3\7\3\7\3\b\3\b\5\b\u0083\n\b\3\b\3\b\3\t\3\t\3\t\7\t"+
		"\u008a\n\t\f\t\16\t\u008d\13\t\3\n\3\n\3\13\3\13\3\13\5\13\u0094\n\13"+
		"\3\13\2\3\4\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\3\4\2\u00a8\2\27\3\2\2\2"+
		"\4X\3\2\2\2\6s\3\2\2\2\bu\3\2\2\2\n|\3\2\2\2\f~\3\2\2\2\16\u0080\3\2\2"+
		"\2\20\u0086\3\2\2\2\22\u008e\3\2\2\2\24\u0093\3\2\2\2\26\30\5\4\3\2\27"+
		"\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33"+
		"\34\b\3\1\2\34Y\5\6\4\2\35\36\7\13\2\2\36\37\7\36\2\2\37 \7\16\2\2 Y\5"+
		"\6\4\2!\"\7\t\2\2\"Y\5\4\3\23#$\5\6\4\2$%\7\22\2\2%&\5\6\4\2&Y\3\2\2\2"+
		"\'(\5\6\4\2()\7\23\2\2)*\5\6\4\2*Y\3\2\2\2+,\5\6\4\2,-\7\24\2\2-.\5\6"+
		"\4\2.Y\3\2\2\2/\60\5\6\4\2\60\61\7\16\2\2\61\62\5\6\4\2\62Y\3\2\2\2\63"+
		"\64\5\6\4\2\64\65\7\21\2\2\65\66\5\6\4\2\66Y\3\2\2\2\678\7\27\2\289\5"+
		"\4\3\29:\7\30\2\2:;\5\4\3\2;<\7\31\2\2<=\5\4\3\n=Y\3\2\2\2>?\7\13\2\2"+
		"?A\7\36\2\2@B\5\b\5\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\16\2\2DE\5\4\3"+
		"\2EF\7\17\2\2FG\5\4\3\bGY\3\2\2\2HI\7\32\2\2IJ\7\36\2\2JK\7\20\2\2KY\5"+
		"\4\3\7LM\7\34\2\2MY\7\36\2\2NO\7\34\2\2OY\5\16\b\2PQ\5\6\4\2QR\7\35\2"+
		"\2RS\7\36\2\2SY\3\2\2\2TU\5\6\4\2UV\7\35\2\2VW\5\16\b\2WY\3\2\2\2X\33"+
		"\3\2\2\2X\35\3\2\2\2X!\3\2\2\2X#\3\2\2\2X\'\3\2\2\2X+\3\2\2\2X/\3\2\2"+
		"\2X\63\3\2\2\2X\67\3\2\2\2X>\3\2\2\2XH\3\2\2\2XL\3\2\2\2XN\3\2\2\2XP\3"+
		"\2\2\2XT\3\2\2\2Yg\3\2\2\2Z[\f\21\2\2[\\\7\25\2\2\\f\5\4\3\22]^\f\20\2"+
		"\2^_\7\26\2\2_f\5\4\3\21`a\f\t\2\2ab\7\33\2\2bf\5\4\3\ncd\f\22\2\2df\5"+
		"\6\4\2eZ\3\2\2\2e]\3\2\2\2e`\3\2\2\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3"+
		"\2\2\2h\5\3\2\2\2ig\3\2\2\2jk\7\r\2\2kt\5\6\4\2lt\7\36\2\2mt\5\24\13\2"+
		"no\7\5\2\2op\5\4\3\2pq\7\6\2\2qt\3\2\2\2rt\5\16\b\2sj\3\2\2\2sl\3\2\2"+
		"\2sm\3\2\2\2sn\3\2\2\2sr\3\2\2\2t\7\3\2\2\2uy\5\n\6\2vx\5\n\6\2wv\3\2"+
		"\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\t\3\2\2\2{y\3\2\2\2|}\7\36\2\2}\13"+
		"\3\2\2\2~\177\t\2\2\2\177\r\3\2\2\2\u0080\u0082\7\7\2\2\u0081\u0083\5"+
		"\20\t\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\7\b\2\2\u0085\17\3\2\2\2\u0086\u008b\5\22\n\2\u0087\u0088\7\25"+
		"\2\2\u0088\u008a\5\22\n\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\21\3\2\2\2\u008d\u008b\3\2\2"+
		"\2\u008e\u008f\5\24\13\2\u008f\23\3\2\2\2\u0090\u0094\7\37\2\2\u0091\u0094"+
		"\5\f\7\2\u0092\u0094\7\n\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\25\3\2\2\2\f\31AXegsy\u0082\u008b\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}