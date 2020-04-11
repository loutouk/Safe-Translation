// Generated from .\MyLang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUE=1, FALSE=2, LPAR=3, RPAR=4, LBRA=5, RBRA=6, REF=7, UNIT=8, LET=9, 
		REC=10, BANG=11, EQUAL=12, IN=13, ARROW=14, LEQ=15, TIMES=16, PLUS=17, 
		MINUS=18, SEQ=19, COLEQ=20, IF=21, THEN=22, ELSE=23, FUN=24, COMMA=25, 
		POP=26, PUSH=27, IDENT=28, INT=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRUE", "FALSE", "LPAR", "RPAR", "LBRA", "RBRA", "REF", "UNIT", "LET", 
			"REC", "BANG", "EQUAL", "IN", "ARROW", "LEQ", "TIMES", "PLUS", "MINUS", 
			"SEQ", "COLEQ", "IF", "THEN", "ELSE", "FUN", "COMMA", "POP", "PUSH", 
			"IDENT", "INT", "WS"
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


	public MyLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00a3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\6\35\u0094\n\35\r\35\16\35\u0095\3\36\6\36\u0099"+
		"\n\36\r\36\16\36\u009a\3\37\6\37\u009e\n\37\r\37\16\37\u009f\3\37\3\37"+
		"\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= \3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00a5\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\3?\3\2\2\2\5D\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rP\3\2\2\2"+
		"\17R\3\2\2\2\21V\3\2\2\2\23Y\3\2\2\2\25]\3\2\2\2\27a\3\2\2\2\31c\3\2\2"+
		"\2\33e\3\2\2\2\35h\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#o\3\2\2\2%q\3\2\2\2\'"+
		"s\3\2\2\2)u\3\2\2\2+x\3\2\2\2-{\3\2\2\2/\u0080\3\2\2\2\61\u0085\3\2\2"+
		"\2\63\u0089\3\2\2\2\65\u008b\3\2\2\2\67\u008f\3\2\2\29\u0093\3\2\2\2;"+
		"\u0098\3\2\2\2=\u009d\3\2\2\2?@\7V\2\2@A\7T\2\2AB\7W\2\2BC\7G\2\2C\4\3"+
		"\2\2\2DE\7H\2\2EF\7C\2\2FG\7N\2\2GH\7U\2\2HI\7G\2\2I\6\3\2\2\2JK\7*\2"+
		"\2K\b\3\2\2\2LM\7+\2\2M\n\3\2\2\2NO\7]\2\2O\f\3\2\2\2PQ\7_\2\2Q\16\3\2"+
		"\2\2RS\7t\2\2ST\7g\2\2TU\7h\2\2U\20\3\2\2\2VW\7*\2\2WX\7+\2\2X\22\3\2"+
		"\2\2YZ\7n\2\2Z[\7g\2\2[\\\7v\2\2\\\24\3\2\2\2]^\7t\2\2^_\7g\2\2_`\7e\2"+
		"\2`\26\3\2\2\2ab\7#\2\2b\30\3\2\2\2cd\7?\2\2d\32\3\2\2\2ef\7k\2\2fg\7"+
		"p\2\2g\34\3\2\2\2hi\7/\2\2ij\7@\2\2j\36\3\2\2\2kl\7>\2\2l \3\2\2\2mn\7"+
		",\2\2n\"\3\2\2\2op\7-\2\2p$\3\2\2\2qr\7/\2\2r&\3\2\2\2st\7=\2\2t(\3\2"+
		"\2\2uv\7<\2\2vw\7?\2\2w*\3\2\2\2xy\7k\2\2yz\7h\2\2z,\3\2\2\2{|\7v\2\2"+
		"|}\7j\2\2}~\7g\2\2~\177\7p\2\2\177.\3\2\2\2\u0080\u0081\7g\2\2\u0081\u0082"+
		"\7n\2\2\u0082\u0083\7u\2\2\u0083\u0084\7g\2\2\u0084\60\3\2\2\2\u0085\u0086"+
		"\7h\2\2\u0086\u0087\7w\2\2\u0087\u0088\7p\2\2\u0088\62\3\2\2\2\u0089\u008a"+
		"\7.\2\2\u008a\64\3\2\2\2\u008b\u008c\7r\2\2\u008c\u008d\7q\2\2\u008d\u008e"+
		"\7r\2\2\u008e\66\3\2\2\2\u008f\u0090\7<\2\2\u0090\u0091\7<\2\2\u00918"+
		"\3\2\2\2\u0092\u0094\t\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096:\3\2\2\2\u0097\u0099\t\3\2\2"+
		"\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b<\3\2\2\2\u009c\u009e\t\4\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\b\37\2\2\u00a2>\3\2\2\2\6\2\u0095\u009a\u009f\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}