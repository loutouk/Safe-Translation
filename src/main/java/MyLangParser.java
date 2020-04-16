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
		RULE_program = 0, RULE_term = 1, RULE_simple_term = 2, RULE_bool = 3, 
		RULE_list = 4, RULE_list_elements = 5, RULE_list_element = 6, RULE_constant = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "term", "simple_term", "bool", "list", "list_elements", "list_element", 
			"constant"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				term(0);
				}
				}
				setState(19); 
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetInContext extends TermContext {
		public TerminalNode LET() { return getToken(MyLangParser.LET, 0); }
		public TerminalNode EQUAL() { return getToken(MyLangParser.EQUAL, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode IN() { return getToken(MyLangParser.IN, 0); }
		public List<TerminalNode> IDENT() { return getTokens(MyLangParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MyLangParser.IDENT, i);
		}
		public LetInContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterLetIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitLetIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitLetIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListPushIdContext extends TermContext {
		public Simple_termContext simple_term() {
			return getRuleContext(Simple_termContext.class,0);
		}
		public TerminalNode PUSH() { return getToken(MyLangParser.PUSH, 0); }
		public TerminalNode IDENT() { return getToken(MyLangParser.IDENT, 0); }
		public ListPushIdContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterListPushId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitListPushId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitListPushId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenElseContext extends TermContext {
		public TerminalNode IF() { return getToken(MyLangParser.IF, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode THEN() { return getToken(MyLangParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(MyLangParser.ELSE, 0); }
		public IfThenElseContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitIfThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListPushListContext extends TermContext {
		public Simple_termContext simple_term() {
			return getRuleContext(Simple_termContext.class,0);
		}
		public TerminalNode PUSH() { return getToken(MyLangParser.PUSH, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListPushListContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterListPushList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitListPushList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitListPushList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssociationContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode COLEQ() { return getToken(MyLangParser.COLEQ, 0); }
		public AssociationContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAssociation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitAssociation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstractionContext extends TermContext {
		public List<Simple_termContext> simple_term() {
			return getRuleContexts(Simple_termContext.class);
		}
		public Simple_termContext simple_term(int i) {
			return getRuleContext(Simple_termContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(MyLangParser.MINUS, 0); }
		public SubstractionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterSubstraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitSubstraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitSubstraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunDeclarationContext extends TermContext {
		public TerminalNode FUN() { return getToken(MyLangParser.FUN, 0); }
		public TerminalNode ARROW() { return getToken(MyLangParser.ARROW, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MyLangParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MyLangParser.IDENT, i);
		}
		public FunDeclarationContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterFunDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitFunDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitFunDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationContext extends TermContext {
		public TerminalNode REF() { return getToken(MyLangParser.REF, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public VarDeclarationContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(MyLangParser.COMMA, 0); }
		public PairContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends TermContext {
		public List<Simple_termContext> simple_term() {
			return getRuleContexts(Simple_termContext.class);
		}
		public Simple_termContext simple_term(int i) {
			return getRuleContext(Simple_termContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(MyLangParser.EQUAL, 0); }
		public EqualContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SequenceContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode SEQ() { return getToken(MyLangParser.SEQ, 0); }
		public SequenceContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplicationContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Simple_termContext simple_term() {
			return getRuleContext(Simple_termContext.class,0);
		}
		public ApplicationContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitApplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleTermContext extends TermContext {
		public Simple_termContext simple_term() {
			return getRuleContext(Simple_termContext.class,0);
		}
		public SimpleTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterSimpleTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitSimpleTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitSimpleTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends TermContext {
		public List<Simple_termContext> simple_term() {
			return getRuleContexts(Simple_termContext.class);
		}
		public Simple_termContext simple_term(int i) {
			return getRuleContext(Simple_termContext.class,i);
		}
		public TerminalNode LEQ() { return getToken(MyLangParser.LEQ, 0); }
		public LessThanContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends TermContext {
		public TerminalNode LET() { return getToken(MyLangParser.LET, 0); }
		public TerminalNode IDENT() { return getToken(MyLangParser.IDENT, 0); }
		public TerminalNode EQUAL() { return getToken(MyLangParser.EQUAL, 0); }
		public Simple_termContext simple_term() {
			return getRuleContext(Simple_termContext.class,0);
		}
		public LetContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListPopIdContext extends TermContext {
		public TerminalNode POP() { return getToken(MyLangParser.POP, 0); }
		public TerminalNode IDENT() { return getToken(MyLangParser.IDENT, 0); }
		public ListPopIdContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterListPopId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitListPopId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitListPopId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListPopListContext extends TermContext {
		public TerminalNode POP() { return getToken(MyLangParser.POP, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListPopListContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterListPopList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitListPopList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitListPopList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends TermContext {
		public List<Simple_termContext> simple_term() {
			return getRuleContexts(Simple_termContext.class);
		}
		public Simple_termContext simple_term(int i) {
			return getRuleContext(Simple_termContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(MyLangParser.TIMES, 0); }
		public MultiplicationContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends TermContext {
		public List<Simple_termContext> simple_term() {
			return getRuleContexts(Simple_termContext.class);
		}
		public Simple_termContext simple_term(int i) {
			return getRuleContext(Simple_termContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MyLangParser.PLUS, 0); }
		public AdditionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(22);
				simple_term();
				}
				break;
			case 2:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				match(LET);
				setState(24);
				match(IDENT);
				setState(25);
				match(EQUAL);
				setState(26);
				simple_term();
				}
				break;
			case 3:
				{
				_localctx = new VarDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(REF);
				setState(28);
				term(17);
				}
				break;
			case 4:
				{
				_localctx = new MultiplicationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				simple_term();
				setState(30);
				match(TIMES);
				setState(31);
				simple_term();
				}
				break;
			case 5:
				{
				_localctx = new AdditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				simple_term();
				setState(34);
				match(PLUS);
				setState(35);
				simple_term();
				}
				break;
			case 6:
				{
				_localctx = new SubstractionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				simple_term();
				setState(38);
				match(MINUS);
				setState(39);
				simple_term();
				}
				break;
			case 7:
				{
				_localctx = new EqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				simple_term();
				setState(42);
				match(EQUAL);
				setState(43);
				simple_term();
				}
				break;
			case 8:
				{
				_localctx = new LessThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				simple_term();
				setState(46);
				match(LEQ);
				setState(47);
				simple_term();
				}
				break;
			case 9:
				{
				_localctx = new IfThenElseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(IF);
				setState(50);
				term(0);
				setState(51);
				match(THEN);
				setState(52);
				term(0);
				setState(53);
				match(ELSE);
				setState(54);
				term(8);
				}
				break;
			case 10:
				{
				_localctx = new LetInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(LET);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					match(IDENT);
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENT );
				setState(62);
				match(EQUAL);
				setState(63);
				term(0);
				setState(64);
				match(IN);
				setState(65);
				term(6);
				}
				break;
			case 11:
				{
				_localctx = new FunDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(FUN);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(68);
					match(IDENT);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(ARROW);
				setState(75);
				term(5);
				}
				break;
			case 12:
				{
				_localctx = new ListPopIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(POP);
				setState(77);
				match(IDENT);
				}
				break;
			case 13:
				{
				_localctx = new ListPopListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(POP);
				setState(79);
				list();
				}
				break;
			case 14:
				{
				_localctx = new ListPushIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				simple_term();
				setState(81);
				match(PUSH);
				setState(82);
				match(IDENT);
				}
				break;
			case 15:
				{
				_localctx = new ListPushListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				simple_term();
				setState(85);
				match(PUSH);
				setState(86);
				list();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new SequenceContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(90);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(91);
						match(SEQ);
						setState(92);
						term(16);
						}
						break;
					case 2:
						{
						_localctx = new AssociationContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(93);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(94);
						match(COLEQ);
						setState(95);
						term(15);
						}
						break;
					case 3:
						{
						_localctx = new PairContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(96);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(97);
						match(COMMA);
						setState(98);
						term(8);
						}
						break;
					case 4:
						{
						_localctx = new ApplicationContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(99);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(100);
						simple_term();
						}
						break;
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitSimple_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_termContext simple_term() throws RecognitionException {
		Simple_termContext _localctx = new Simple_termContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_term);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BANG:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(BANG);
				setState(107);
				simple_term();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(IDENT);
				}
				break;
			case TRUE:
			case FALSE:
			case UNIT:
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				constant();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(LPAR);
				setState(111);
				term(0);
				setState(112);
				match(RPAR);
				}
				break;
			case LBRA:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(LBRA);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << UNIT) | (1L << INT))) != 0)) {
				{
				setState(120);
				list_elements();
				}
			}

			setState(123);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitList_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_elementsContext list_elements() throws RecognitionException {
		List_elementsContext _localctx = new List_elementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			list_element();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEQ) {
				{
				{
				setState(126);
				match(SEQ);
				setState(127);
				list_element();
				}
				}
				setState(132);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitList_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_elementContext list_element() throws RecognitionException {
		List_elementContext _localctx = new List_elementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLangVisitor ) return ((MyLangVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				bool();
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u008f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2"+
		"\r\2\16\2\25\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\6\3=\n\3\r\3\16\3>\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3H\n\3\f\3\16\3K\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3[\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3h\n\3"+
		"\f\3\16\3k\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4v\n\4\3\5\3\5\3"+
		"\6\3\6\5\6|\n\6\3\6\3\6\3\7\3\7\3\7\7\7\u0083\n\7\f\7\16\7\u0086\13\7"+
		"\3\b\3\b\3\t\3\t\3\t\5\t\u008d\n\t\3\t\2\3\4\n\2\4\6\b\n\f\16\20\2\3\3"+
		"\2\3\4\2\u00a3\2\23\3\2\2\2\4Z\3\2\2\2\6u\3\2\2\2\bw\3\2\2\2\ny\3\2\2"+
		"\2\f\177\3\2\2\2\16\u0087\3\2\2\2\20\u008c\3\2\2\2\22\24\5\4\3\2\23\22"+
		"\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\30"+
		"\b\3\1\2\30[\5\6\4\2\31\32\7\13\2\2\32\33\7\36\2\2\33\34\7\16\2\2\34["+
		"\5\6\4\2\35\36\7\t\2\2\36[\5\4\3\23\37 \5\6\4\2 !\7\22\2\2!\"\5\6\4\2"+
		"\"[\3\2\2\2#$\5\6\4\2$%\7\23\2\2%&\5\6\4\2&[\3\2\2\2\'(\5\6\4\2()\7\24"+
		"\2\2)*\5\6\4\2*[\3\2\2\2+,\5\6\4\2,-\7\16\2\2-.\5\6\4\2.[\3\2\2\2/\60"+
		"\5\6\4\2\60\61\7\21\2\2\61\62\5\6\4\2\62[\3\2\2\2\63\64\7\27\2\2\64\65"+
		"\5\4\3\2\65\66\7\30\2\2\66\67\5\4\3\2\678\7\31\2\289\5\4\3\n9[\3\2\2\2"+
		":<\7\13\2\2;=\7\36\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2"+
		"\2@A\7\16\2\2AB\5\4\3\2BC\7\17\2\2CD\5\4\3\bD[\3\2\2\2EI\7\32\2\2FH\7"+
		"\36\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM"+
		"\7\20\2\2M[\5\4\3\7NO\7\34\2\2O[\7\36\2\2PQ\7\34\2\2Q[\5\n\6\2RS\5\6\4"+
		"\2ST\7\35\2\2TU\7\36\2\2U[\3\2\2\2VW\5\6\4\2WX\7\35\2\2XY\5\n\6\2Y[\3"+
		"\2\2\2Z\27\3\2\2\2Z\31\3\2\2\2Z\35\3\2\2\2Z\37\3\2\2\2Z#\3\2\2\2Z\'\3"+
		"\2\2\2Z+\3\2\2\2Z/\3\2\2\2Z\63\3\2\2\2Z:\3\2\2\2ZE\3\2\2\2ZN\3\2\2\2Z"+
		"P\3\2\2\2ZR\3\2\2\2ZV\3\2\2\2[i\3\2\2\2\\]\f\21\2\2]^\7\25\2\2^h\5\4\3"+
		"\22_`\f\20\2\2`a\7\26\2\2ah\5\4\3\21bc\f\t\2\2cd\7\33\2\2dh\5\4\3\nef"+
		"\f\22\2\2fh\5\6\4\2g\\\3\2\2\2g_\3\2\2\2gb\3\2\2\2ge\3\2\2\2hk\3\2\2\2"+
		"ig\3\2\2\2ij\3\2\2\2j\5\3\2\2\2ki\3\2\2\2lm\7\r\2\2mv\5\6\4\2nv\7\36\2"+
		"\2ov\5\20\t\2pq\7\5\2\2qr\5\4\3\2rs\7\6\2\2sv\3\2\2\2tv\5\n\6\2ul\3\2"+
		"\2\2un\3\2\2\2uo\3\2\2\2up\3\2\2\2ut\3\2\2\2v\7\3\2\2\2wx\t\2\2\2x\t\3"+
		"\2\2\2y{\7\7\2\2z|\5\f\7\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\b\2\2~\13"+
		"\3\2\2\2\177\u0084\5\16\b\2\u0080\u0081\7\25\2\2\u0081\u0083\5\16\b\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\r\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\5\20\t\2\u0088"+
		"\17\3\2\2\2\u0089\u008d\7\37\2\2\u008a\u008d\5\b\5\2\u008b\u008d\7\n\2"+
		"\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\21"+
		"\3\2\2\2\f\25>IZgiu{\u0084\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}