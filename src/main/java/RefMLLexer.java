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
		RCUR=10, REF=11, LET=12, REC=13, BANG=14, EQUAL=15, IN=16, ARROW=17, LEQ=18, 
		TIMES=19, SEQ=20, COLEQ=21, IF=22, THEN=23, ELSE=24, COMMA=25, ID=26, 
		INT=27, SL_COMMENT=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MINUS", "PLUS", "TRUE", "FALSE", "LPAR", "RPAR", "LBRA", "RBRA", "LCUR", 
			"RCUR", "REF", "LET", "REC", "BANG", "EQUAL", "IN", "ARROW", "LEQ", "TIMES", 
			"SEQ", "COLEQ", "IF", "THEN", "ELSE", "COMMA", "ID", "LETTER", "INT", 
			"SL_COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u008c"+
		"\n\33\f\33\16\33\u008f\13\33\3\34\3\34\3\35\6\35\u0094\n\35\r\35\16\35"+
		"\u0095\3\36\3\36\3\36\3\36\7\36\u009c\n\36\f\36\16\36\u009f\13\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\6\37\u00a7\n\37\r\37\16\37\u00a8\3\37\3\37\3"+
		"\u009d\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\29\35;\36=\37\3\2\5\3\2\62;\5\2C\\aac|\5\2\13\f\17\17\"\"\2\u00af\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tH\3\2\2\2\13N\3\2\2\2\rP\3\2\2\2\17"+
		"R\3\2\2\2\21T\3\2\2\2\23V\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31^\3\2\2\2"+
		"\33b\3\2\2\2\35f\3\2\2\2\37h\3\2\2\2!j\3\2\2\2#m\3\2\2\2%p\3\2\2\2\'r"+
		"\3\2\2\2)t\3\2\2\2+v\3\2\2\2-y\3\2\2\2/|\3\2\2\2\61\u0081\3\2\2\2\63\u0086"+
		"\3\2\2\2\65\u0088\3\2\2\2\67\u0090\3\2\2\29\u0093\3\2\2\2;\u0097\3\2\2"+
		"\2=\u00a6\3\2\2\2?@\7/\2\2@\4\3\2\2\2AB\7-\2\2B\6\3\2\2\2CD\7v\2\2DE\7"+
		"t\2\2EF\7w\2\2FG\7g\2\2G\b\3\2\2\2HI\7h\2\2IJ\7c\2\2JK\7n\2\2KL\7u\2\2"+
		"LM\7g\2\2M\n\3\2\2\2NO\7*\2\2O\f\3\2\2\2PQ\7+\2\2Q\16\3\2\2\2RS\7]\2\2"+
		"S\20\3\2\2\2TU\7_\2\2U\22\3\2\2\2VW\7}\2\2W\24\3\2\2\2XY\7\177\2\2Y\26"+
		"\3\2\2\2Z[\7t\2\2[\\\7g\2\2\\]\7h\2\2]\30\3\2\2\2^_\7n\2\2_`\7g\2\2`a"+
		"\7v\2\2a\32\3\2\2\2bc\7t\2\2cd\7g\2\2de\7e\2\2e\34\3\2\2\2fg\7#\2\2g\36"+
		"\3\2\2\2hi\7?\2\2i \3\2\2\2jk\7k\2\2kl\7p\2\2l\"\3\2\2\2mn\7/\2\2no\7"+
		"@\2\2o$\3\2\2\2pq\7>\2\2q&\3\2\2\2rs\7,\2\2s(\3\2\2\2tu\7=\2\2u*\3\2\2"+
		"\2vw\7<\2\2wx\7?\2\2x,\3\2\2\2yz\7k\2\2z{\7h\2\2{.\3\2\2\2|}\7v\2\2}~"+
		"\7j\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080\60\3\2\2\2\u0081\u0082\7g\2"+
		"\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085\62\3"+
		"\2\2\2\u0086\u0087\7.\2\2\u0087\64\3\2\2\2\u0088\u008d\5\67\34\2\u0089"+
		"\u008c\5\67\34\2\u008a\u008c\t\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3"+
		"\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\66\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\t\3\2\2\u00918\3\2\2\2\u0092"+
		"\u0094\t\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096:\3\2\2\2\u0097\u0098\7*\2\2\u0098\u0099"+
		"\7,\2\2\u0099\u009d\3\2\2\2\u009a\u009c\13\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\7+\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\b\36\2\2\u00a4<\3\2\2\2\u00a5\u00a7\t\4\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\37\2\2\u00ab>\3\2\2\2\b\2\u008b"+
		"\u008d\u0095\u009d\u00a8\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}