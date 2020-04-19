// Generated from ./RefML.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RefMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MINUS=1, PLUS=2, TRUE=3, FALSE=4, LPAR=5, RPAR=6, LBRA=7, RBRA=8, REF=9, 
		UNIT=10, LET=11, REC=12, BANG=13, EQUAL=14, IN=15, ARROW=16, LEQ=17, TIMES=18, 
		SEQ=19, COLEQ=20, IF=21, THEN=22, ELSE=23, COMMA=24, POP=25, PUSH=26, 
		ID=27, INT=28, SL_COMMENT=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MINUS", "PLUS", "TRUE", "FALSE", "LPAR", "RPAR", "LBRA", "RBRA", "REF", 
			"UNIT", "LET", "REC", "BANG", "EQUAL", "IN", "ARROW", "LEQ", "TIMES", 
			"SEQ", "COLEQ", "IF", "THEN", "ELSE", "COMMA", "POP", "PUSH", "ID", "LETTER", 
			"INT", "SL_COMMENT", "WS"
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


	public RefMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RefML.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\7\34\u0094\n\34\f\34\16\34\u0097\13\34\3\35\3"+
		"\35\3\36\6\36\u009c\n\36\r\36\16\36\u009d\3\37\3\37\3\37\3\37\7\37\u00a4"+
		"\n\37\f\37\16\37\u00a7\13\37\3\37\3\37\3\37\3\37\3 \6 \u00ae\n \r \16"+
		" \u00af\3 \3 \3\u00a5\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\2;\36=\37? \3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\""+
		"\2\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tJ\3\2\2\2"+
		"\13P\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25\\\3\2\2"+
		"\2\27_\3\2\2\2\31c\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2\37k\3\2\2\2!n\3\2\2"+
		"\2#q\3\2\2\2%s\3\2\2\2\'u\3\2\2\2)w\3\2\2\2+z\3\2\2\2-}\3\2\2\2/\u0082"+
		"\3\2\2\2\61\u0087\3\2\2\2\63\u0089\3\2\2\2\65\u008d\3\2\2\2\67\u0090\3"+
		"\2\2\29\u0098\3\2\2\2;\u009b\3\2\2\2=\u009f\3\2\2\2?\u00ad\3\2\2\2AB\7"+
		"/\2\2B\4\3\2\2\2CD\7-\2\2D\6\3\2\2\2EF\7V\2\2FG\7T\2\2GH\7W\2\2HI\7G\2"+
		"\2I\b\3\2\2\2JK\7H\2\2KL\7C\2\2LM\7N\2\2MN\7U\2\2NO\7G\2\2O\n\3\2\2\2"+
		"PQ\7*\2\2Q\f\3\2\2\2RS\7+\2\2S\16\3\2\2\2TU\7]\2\2U\20\3\2\2\2VW\7_\2"+
		"\2W\22\3\2\2\2XY\7t\2\2YZ\7g\2\2Z[\7h\2\2[\24\3\2\2\2\\]\7*\2\2]^\7+\2"+
		"\2^\26\3\2\2\2_`\7n\2\2`a\7g\2\2ab\7v\2\2b\30\3\2\2\2cd\7t\2\2de\7g\2"+
		"\2ef\7e\2\2f\32\3\2\2\2gh\7#\2\2h\34\3\2\2\2ij\7?\2\2j\36\3\2\2\2kl\7"+
		"k\2\2lm\7p\2\2m \3\2\2\2no\7/\2\2op\7@\2\2p\"\3\2\2\2qr\7>\2\2r$\3\2\2"+
		"\2st\7,\2\2t&\3\2\2\2uv\7=\2\2v(\3\2\2\2wx\7<\2\2xy\7?\2\2y*\3\2\2\2z"+
		"{\7k\2\2{|\7h\2\2|,\3\2\2\2}~\7v\2\2~\177\7j\2\2\177\u0080\7g\2\2\u0080"+
		"\u0081\7p\2\2\u0081.\3\2\2\2\u0082\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7u\2\2\u0085\u0086\7g\2\2\u0086\60\3\2\2\2\u0087\u0088\7.\2\2\u0088"+
		"\62\3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b\7q\2\2\u008b\u008c\7r\2\2\u008c"+
		"\64\3\2\2\2\u008d\u008e\7<\2\2\u008e\u008f\7<\2\2\u008f\66\3\2\2\2\u0090"+
		"\u0095\59\35\2\u0091\u0094\59\35\2\u0092\u0094\t\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u00968\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\t\3\2\2"+
		"\u0099:\3\2\2\2\u009a\u009c\t\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e<\3\2\2\2\u009f\u00a0"+
		"\7\61\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\13\2\2"+
		"\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\f\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\b\37\2\2\u00ab>\3\2\2\2\u00ac\u00ae\t\4\2\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b \3\2\u00b2@\3\2\2\2\b\2\u0093"+
		"\u0095\u009d\u00a5\u00af\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}