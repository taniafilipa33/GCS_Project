// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/TPGCS\tpCGS.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tpCGSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CONCEPTS=7, STUDENTS=8, 
		RESOURCES=9, NUM=10, QWORD=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "CONCEPTS", "STUDENTS", 
			"RESOURCES", "NUM", "QWORD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'['", "']'", "'{'", "','", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "CONCEPTS", "STUDENTS", "RESOURCES", 
			"NUM", "QWORD", "WS"
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


	public tpCGSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tpCGS.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13E\n\13\r\13\16\13F\3"+
		"\f\3\f\3\f\7\fL\n\f\f\f\16\fO\13\f\3\f\7\fR\n\f\f\f\16\fU\13\f\3\f\3\f"+
		"\7\fY\n\f\f\f\16\f\\\13\f\7\f^\n\f\f\f\16\fa\13\f\3\f\3\f\3\r\5\rf\n\r"+
		"\3\r\3\r\6\rj\n\r\r\r\16\rk\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\3\2\22\4\2EEee\4\2QQqq\4\2PPpp\4\2GGgg\4"+
		"\2RRrr\4\2VVvv\4\2UUuu\4\2WWww\4\2FFff\4\2TTtt\3\2\62;\3\2$$\4\2C\\c|"+
		"\7\2//\62;C\\aac|\3\2\"\"\4\2\13\13\"\"\2v\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5"+
		"\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13#\3\2\2\2\r%\3\2\2\2\17\'\3\2\2"+
		"\2\21\60\3\2\2\2\239\3\2\2\2\25D\3\2\2\2\27H\3\2\2\2\31i\3\2\2\2\33\34"+
		"\7<\2\2\34\4\3\2\2\2\35\36\7]\2\2\36\6\3\2\2\2\37 \7_\2\2 \b\3\2\2\2!"+
		"\"\7}\2\2\"\n\3\2\2\2#$\7.\2\2$\f\3\2\2\2%&\7\177\2\2&\16\3\2\2\2\'(\t"+
		"\2\2\2()\t\3\2\2)*\t\4\2\2*+\t\2\2\2+,\t\5\2\2,-\t\6\2\2-.\t\7\2\2./\t"+
		"\b\2\2/\20\3\2\2\2\60\61\t\b\2\2\61\62\t\7\2\2\62\63\t\t\2\2\63\64\t\n"+
		"\2\2\64\65\t\5\2\2\65\66\t\4\2\2\66\67\t\7\2\2\678\t\b\2\28\22\3\2\2\2"+
		"9:\t\13\2\2:;\t\5\2\2;<\t\b\2\2<=\t\3\2\2=>\t\t\2\2>?\t\13\2\2?@\t\2\2"+
		"\2@A\t\5\2\2AB\t\b\2\2B\24\3\2\2\2CE\t\f\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2"+
		"\2\2FG\3\2\2\2G\26\3\2\2\2HI\t\r\2\2IM\t\16\2\2JL\t\17\2\2KJ\3\2\2\2L"+
		"O\3\2\2\2MK\3\2\2\2MN\3\2\2\2N_\3\2\2\2OM\3\2\2\2PR\t\20\2\2QP\3\2\2\2"+
		"RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VZ\t\16\2\2WY\t\17\2"+
		"\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]S\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\t\r\2\2c\30\3"+
		"\2\2\2df\7\17\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gj\7\f\2\2hj\t\21\2\2i"+
		"e\3\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\r\2\2"+
		"n\32\3\2\2\2\13\2FMSZ_eik\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}