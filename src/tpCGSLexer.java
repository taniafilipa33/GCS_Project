// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/TPGCS/GCS_Project\tpCGS.g4 by ANTLR 4.9

    import java.util.HashMap;
    import java.util.ArrayList;


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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CONCEPTS=7, STUDENTS=8, 
		RESOURCES=9, WORD=10, NUM=11, QWORD=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "CONCEPTS", "STUDENTS", 
			"RESOURCES", "WORD", "NUM", "QWORD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'['", "','", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "CONCEPTS", "STUDENTS", "RESOURCES", 
			"WORD", "NUM", "QWORD", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\7\13N\n\13\f\13\16\13Q\13\13\3\13\7\13T\n\13\f\13\16"+
		"\13W\13\13\3\13\3\13\7\13[\n\13\f\13\16\13^\13\13\7\13`\n\13\f\13\16\13"+
		"c\13\13\3\f\6\ff\n\f\r\f\16\fg\3\r\3\r\3\r\7\rm\n\r\f\r\16\rp\13\r\3\r"+
		"\7\rs\n\r\f\r\16\rv\13\r\3\r\3\r\7\rz\n\r\f\r\16\r}\13\r\7\r\177\n\r\f"+
		"\r\16\r\u0082\13\r\3\r\3\r\3\16\5\16\u0087\n\16\3\16\3\16\6\16\u008b\n"+
		"\16\r\16\16\16\u008c\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\3\2\23\4\2EEee\4\2QQqq\4\2PPpp\4\2GGgg"+
		"\4\2RRrr\4\2VVvv\4\2UUuu\4\2WWww\4\2FFff\4\2TTtt\4\2C\\c|\7\2//\62;C\\"+
		"aac|\3\2\"\"\3\2\62;\3\2$$\t\2##%%\'\'.<C\\aac|\4\2\13\13\"\"\2\u009b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2"+
		"\2\2\13%\3\2\2\2\r\'\3\2\2\2\17)\3\2\2\2\21\64\3\2\2\2\23?\3\2\2\2\25"+
		"K\3\2\2\2\27e\3\2\2\2\31i\3\2\2\2\33\u008a\3\2\2\2\35\36\7<\2\2\36\4\3"+
		"\2\2\2\37 \7]\2\2 \6\3\2\2\2!\"\7.\2\2\"\b\3\2\2\2#$\7_\2\2$\n\3\2\2\2"+
		"%&\7}\2\2&\f\3\2\2\2\'(\7\177\2\2(\16\3\2\2\2)*\7~\2\2*+\t\2\2\2+,\t\3"+
		"\2\2,-\t\4\2\2-.\t\2\2\2./\t\5\2\2/\60\t\6\2\2\60\61\t\7\2\2\61\62\t\b"+
		"\2\2\62\63\7~\2\2\63\20\3\2\2\2\64\65\7~\2\2\65\66\t\b\2\2\66\67\t\7\2"+
		"\2\678\t\t\2\289\t\n\2\29:\t\5\2\2:;\t\4\2\2;<\t\7\2\2<=\t\b\2\2=>\7~"+
		"\2\2>\22\3\2\2\2?@\7~\2\2@A\t\13\2\2AB\t\5\2\2BC\t\b\2\2CD\t\3\2\2DE\t"+
		"\t\2\2EF\t\13\2\2FG\t\2\2\2GH\t\5\2\2HI\t\b\2\2IJ\7~\2\2J\24\3\2\2\2K"+
		"O\t\f\2\2LN\t\r\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2Pa\3\2\2\2"+
		"QO\3\2\2\2RT\t\16\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2"+
		"\2WU\3\2\2\2X\\\t\f\2\2Y[\t\r\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]`\3\2\2\2^\\\3\2\2\2_U\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\26"+
		"\3\2\2\2ca\3\2\2\2df\t\17\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"h\30\3\2\2\2ij\t\20\2\2jn\t\f\2\2km\t\21\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2"+
		"\2\2no\3\2\2\2o\u0080\3\2\2\2pn\3\2\2\2qs\t\16\2\2rq\3\2\2\2sv\3\2\2\2"+
		"tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2w{\t\f\2\2xz\t\21\2\2yx\3\2\2"+
		"\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~t\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0084\t\20\2\2\u0084\32\3\2\2\2\u0085\u0087"+
		"\7\17\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2"+
		"\u0088\u008b\7\f\2\2\u0089\u008b\t\22\2\2\u008a\u0086\3\2\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\b\16\2\2\u008f\34\3\2\2\2\17\2OU\\agnt{\u0080"+
		"\u0086\u008a\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}