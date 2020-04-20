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
		MINUS=1, PLUS=2, TRUE=3, FALSE=4, LPAR=5, RPAR=6, LBRA=7, RBRA=8, LCUR=9, 
		RCUR=10, REF=11, UNIT=12, LET=13, REC=14, BANG=15, EQUAL=16, IN=17, ARROW=18, 
		LEQ=19, TIMES=20, SEQ=21, COLEQ=22, IF=23, THEN=24, ELSE=25, COMMA=26, 
		POP=27, PEEK=28, PUSH=29, ID=30, INT=31, SL_COMMENT=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MINUS", "PLUS", "TRUE", "FALSE", "LPAR", "RPAR", "LBRA", "RBRA", "LCUR", 
			"RCUR", "REF", "UNIT", "LET", "REC", "BANG", "EQUAL", "IN", "ARROW", 
			"LEQ", "TIMES", "SEQ", "COLEQ", "IF", "THEN", "ELSE", "COMMA", "POP", 
			"PEEK", "PUSH", "ID", "LETTER", "INT", "SL_COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00c2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\7\37\u00a3\n\37\f\37\16\37\u00a6\13\37\3 \3 \3!\6"+
		"!\u00ab\n!\r!\16!\u00ac\3\"\3\"\3\"\3\"\7\"\u00b3\n\"\f\"\16\"\u00b6\13"+
		"\"\3\"\3\"\3\"\3\"\3#\6#\u00bd\n#\r#\16#\u00be\3#\3#\3\u00b4\2$\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?\2"+
		"A!C\"E#\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00c5\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2"+
		"\tP\3\2\2\2\13V\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23^\3\2\2"+
		"\2\25`\3\2\2\2\27b\3\2\2\2\31f\3\2\2\2\33i\3\2\2\2\35m\3\2\2\2\37q\3\2"+
		"\2\2!s\3\2\2\2#u\3\2\2\2%x\3\2\2\2\'{\3\2\2\2)}\3\2\2\2+\177\3\2\2\2-"+
		"\u0081\3\2\2\2/\u0084\3\2\2\2\61\u0087\3\2\2\2\63\u008c\3\2\2\2\65\u0091"+
		"\3\2\2\2\67\u0093\3\2\2\29\u0097\3\2\2\2;\u009c\3\2\2\2=\u009f\3\2\2\2"+
		"?\u00a7\3\2\2\2A\u00aa\3\2\2\2C\u00ae\3\2\2\2E\u00bc\3\2\2\2GH\7/\2\2"+
		"H\4\3\2\2\2IJ\7-\2\2J\6\3\2\2\2KL\7V\2\2LM\7T\2\2MN\7W\2\2NO\7G\2\2O\b"+
		"\3\2\2\2PQ\7H\2\2QR\7C\2\2RS\7N\2\2ST\7U\2\2TU\7G\2\2U\n\3\2\2\2VW\7*"+
		"\2\2W\f\3\2\2\2XY\7+\2\2Y\16\3\2\2\2Z[\7]\2\2[\20\3\2\2\2\\]\7_\2\2]\22"+
		"\3\2\2\2^_\7}\2\2_\24\3\2\2\2`a\7\177\2\2a\26\3\2\2\2bc\7t\2\2cd\7g\2"+
		"\2de\7h\2\2e\30\3\2\2\2fg\7*\2\2gh\7+\2\2h\32\3\2\2\2ij\7n\2\2jk\7g\2"+
		"\2kl\7v\2\2l\34\3\2\2\2mn\7t\2\2no\7g\2\2op\7e\2\2p\36\3\2\2\2qr\7#\2"+
		"\2r \3\2\2\2st\7?\2\2t\"\3\2\2\2uv\7k\2\2vw\7p\2\2w$\3\2\2\2xy\7/\2\2"+
		"yz\7@\2\2z&\3\2\2\2{|\7>\2\2|(\3\2\2\2}~\7,\2\2~*\3\2\2\2\177\u0080\7"+
		"=\2\2\u0080,\3\2\2\2\u0081\u0082\7<\2\2\u0082\u0083\7?\2\2\u0083.\3\2"+
		"\2\2\u0084\u0085\7k\2\2\u0085\u0086\7h\2\2\u0086\60\3\2\2\2\u0087\u0088"+
		"\7v\2\2\u0088\u0089\7j\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b"+
		"\62\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f"+
		"\u0090\7g\2\2\u0090\64\3\2\2\2\u0091\u0092\7.\2\2\u0092\66\3\2\2\2\u0093"+
		"\u0094\7r\2\2\u0094\u0095\7q\2\2\u0095\u0096\7r\2\2\u00968\3\2\2\2\u0097"+
		"\u0098\7r\2\2\u0098\u0099\7g\2\2\u0099\u009a\7g\2\2\u009a\u009b\7m\2\2"+
		"\u009b:\3\2\2\2\u009c\u009d\7<\2\2\u009d\u009e\7<\2\2\u009e<\3\2\2\2\u009f"+
		"\u00a4\5? \2\u00a0\u00a3\5? \2\u00a1\u00a3\t\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5>\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\t\3\2\2\u00a8"+
		"@\3\2\2\2\u00a9\u00ab\t\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00adB\3\2\2\2\u00ae\u00af\7"+
		"\61\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\13\2\2\2"+
		"\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\f\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\b\"\2\2\u00baD\3\2\2\2\u00bb\u00bd\t\4\2\2"+
		"\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b#\2\2\u00c1F\3\2\2\2\b\2\u00a2"+
		"\u00a4\u00ac\u00b4\u00be\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}