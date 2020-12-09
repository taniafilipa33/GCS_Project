// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/TPGCS\tpCGS.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tpCGSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CONCEPTS=7, STUDENTS=8, 
		RESOURCES=9, NUM=10, QWORD=11, WS=12;
	public static final int
		RULE_main = 0, RULE_json = 1, RULE_list = 2, RULE_pairKeyValue = 3, RULE_jsonValue = 4, 
		RULE_quotedWord = 5, RULE_num = 6, RULE_conc = 7, RULE_stu = 8, RULE_res = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "json", "list", "pairKeyValue", "jsonValue", "quotedWord", "num", 
			"conc", "stu", "res"
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

	@Override
	public String getGrammarFileName() { return "tpCGS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tpCGSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public ConcContext conc() {
			return getRuleContext(ConcContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public StuContext stu() {
			return getRuleContext(StuContext.class,0);
		}
		public List<JsonContext> json() {
			return getRuleContexts(JsonContext.class);
		}
		public JsonContext json(int i) {
			return getRuleContext(JsonContext.class,i);
		}
		public ResContext res() {
			return getRuleContext(ResContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			conc();
			setState(21);
			match(T__0);
			setState(22);
			list();
			setState(23);
			stu();
			setState(24);
			match(T__0);
			setState(25);
			json();
			setState(26);
			res();
			setState(27);
			match(T__0);
			setState(28);
			json();
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

	public static class JsonContext extends ParserRuleContext {
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public QuotedWordContext quotedWord() {
			return getRuleContext(QuotedWordContext.class,0);
		}
		public List<PairKeyValueContext> pairKeyValue() {
			return getRuleContexts(PairKeyValueContext.class);
		}
		public PairKeyValueContext pairKeyValue(int i) {
			return getRuleContext(PairKeyValueContext.class,i);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_json);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(T__1);
				setState(31);
				json();
				setState(32);
				match(T__2);
				}
				break;
			case QWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				quotedWord();
				setState(35);
				match(T__0);
				setState(36);
				json();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(T__3);
				setState(39);
				pairKeyValue();
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(40);
					match(T__4);
					setState(41);
					pairKeyValue();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
				match(T__5);
				}
				break;
			case EOF:
			case T__2:
			case T__4:
			case T__5:
			case RESOURCES:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class ListContext extends ParserRuleContext {
		public List<QuotedWordContext> quotedWord() {
			return getRuleContexts(QuotedWordContext.class);
		}
		public QuotedWordContext quotedWord(int i) {
			return getRuleContext(QuotedWordContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__1);
			setState(53);
			quotedWord();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(54);
				match(T__4);
				setState(55);
				quotedWord();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(T__2);
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

	public static class PairKeyValueContext extends ParserRuleContext {
		public QuotedWordContext quotedWord() {
			return getRuleContext(QuotedWordContext.class,0);
		}
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public PairKeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairKeyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterPairKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitPairKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitPairKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairKeyValueContext pairKeyValue() throws RecognitionException {
		PairKeyValueContext _localctx = new PairKeyValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pairKeyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			quotedWord();
			setState(64);
			match(T__0);
			setState(65);
			jsonValue();
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

	public static class JsonValueContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public QuotedWordContext quotedWord() {
			return getRuleContext(QuotedWordContext.class,0);
		}
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public JsonValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterJsonValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitJsonValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitJsonValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonValueContext jsonValue() throws RecognitionException {
		JsonValueContext _localctx = new JsonValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jsonValue);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				quotedWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				json();
				}
				break;
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

	public static class QuotedWordContext extends ParserRuleContext {
		public TerminalNode QWORD() { return getToken(tpCGSParser.QWORD, 0); }
		public QuotedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterQuotedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitQuotedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitQuotedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedWordContext quotedWord() throws RecognitionException {
		QuotedWordContext _localctx = new QuotedWordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_quotedWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(QWORD);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(tpCGSParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NUM);
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

	public static class ConcContext extends ParserRuleContext {
		public TerminalNode CONCEPTS() { return getToken(tpCGSParser.CONCEPTS, 0); }
		public ConcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterConc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitConc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitConc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcContext conc() throws RecognitionException {
		ConcContext _localctx = new ConcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(CONCEPTS);
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

	public static class StuContext extends ParserRuleContext {
		public TerminalNode STUDENTS() { return getToken(tpCGSParser.STUDENTS, 0); }
		public StuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterStu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitStu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitStu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StuContext stu() throws RecognitionException {
		StuContext _localctx = new StuContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(STUDENTS);
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

	public static class ResContext extends ParserRuleContext {
		public TerminalNode RESOURCES() { return getToken(tpCGSParser.RESOURCES, 0); }
		public ResContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_res; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterRes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitRes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitRes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResContext res() throws RecognitionException {
		ResContext _localctx = new ResContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_res);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(RESOURCES);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\3\3\5\3\65\n\3\3\4"+
		"\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\5\6I\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6"+
		"\b\n\f\16\20\22\24\2\2\2Q\2\26\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\bA\3"+
		"\2\2\2\nH\3\2\2\2\fJ\3\2\2\2\16L\3\2\2\2\20N\3\2\2\2\22P\3\2\2\2\24R\3"+
		"\2\2\2\26\27\5\20\t\2\27\30\7\3\2\2\30\31\5\6\4\2\31\32\5\22\n\2\32\33"+
		"\7\3\2\2\33\34\5\4\3\2\34\35\5\24\13\2\35\36\7\3\2\2\36\37\5\4\3\2\37"+
		"\3\3\2\2\2 !\7\4\2\2!\"\5\4\3\2\"#\7\5\2\2#\65\3\2\2\2$%\5\f\7\2%&\7\3"+
		"\2\2&\'\5\4\3\2\'\65\3\2\2\2()\7\6\2\2).\5\b\5\2*+\7\7\2\2+-\5\b\5\2,"+
		"*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62"+
		"\7\b\2\2\62\65\3\2\2\2\63\65\3\2\2\2\64 \3\2\2\2\64$\3\2\2\2\64(\3\2\2"+
		"\2\64\63\3\2\2\2\65\5\3\2\2\2\66\67\7\4\2\2\67<\5\f\7\289\7\7\2\29;\5"+
		"\f\7\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7"+
		"\5\2\2@\7\3\2\2\2AB\5\f\7\2BC\7\3\2\2CD\5\n\6\2D\t\3\2\2\2EI\5\16\b\2"+
		"FI\5\f\7\2GI\5\4\3\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\13\3\2\2\2JK\7\r\2"+
		"\2K\r\3\2\2\2LM\7\f\2\2M\17\3\2\2\2NO\7\t\2\2O\21\3\2\2\2PQ\7\n\2\2Q\23"+
		"\3\2\2\2RS\7\13\2\2S\25\3\2\2\2\6.\64<H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}