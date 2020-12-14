// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/TPGCS/GCS_Project\tpCGS.g4 by ANTLR 4.8

    import java.util.HashMap;
    import java.util.ArrayList;

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
		RULE_main = 0, RULE_jsonList = 1, RULE_jsonObject = 2, RULE_list = 3, 
		RULE_resOfL = 4, RULE_pairKeyValue = 5, RULE_jsonValue = 6, RULE_quotedWord = 7, 
		RULE_num = 8, RULE_conc = 9, RULE_stu = 10, RULE_res = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "jsonList", "jsonObject", "list", "resOfL", "pairKeyValue", "jsonValue", 
			"quotedWord", "num", "conc", "stu", "res"
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



	  class Entity {
	    HashMap<String, JsonValue> data;
	  }

	  interface JsonValue {}

	  class JsonString implements JsonValue {
	    String val = "";

	    JsonString(String i){
	        this.val = i;
	       }
	  }

	  class JsonNum implements JsonValue {
	   int val = -1;

	   JsonNum(int i){
	    this.val = i;
	   }
	  }

	  class Json implements JsonValue {
	    HashMap<String, JsonValue> val;

	    Json (HashMap<String, JsonValue> req){
	        this.val = req;
	    }
	  }

	  class JsonList implements JsonValue{
	    ArrayList<String> val;

	    JsonList (ArrayList<String> req){
	        this.val = req;
	    }
	  }


	public tpCGSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public ListContext c1;
		public JsonListContext a1;
		public JsonListContext r1;
		public ConcContext conc() {
			return getRuleContext(ConcContext.class,0);
		}
		public StuContext stu() {
			return getRuleContext(StuContext.class,0);
		}
		public ResContext res() {
			return getRuleContext(ResContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<JsonListContext> jsonList() {
			return getRuleContexts(JsonListContext.class);
		}
		public JsonListContext jsonList(int i) {
			return getRuleContext(JsonListContext.class,i);
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

		    ArrayList<String> concepts = new ArrayList<>();
		    ArrayList<HashMap<Integer, Entity>> students = new ArrayList<>();
		    ArrayList<HashMap<Integer, Entity>> resources = new ArrayList<>();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			conc();
			setState(25);
			match(T__0);
			setState(26);
			((MainContext)_localctx).c1 = list(concepts);
			setState(27);
			stu();
			setState(28);
			match(T__0);
			setState(29);
			((MainContext)_localctx).a1 = jsonList(students);
			setState(30);
			res();
			setState(31);
			match(T__0);
			setState(32);
			((MainContext)_localctx).r1 = jsonList(resources);
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

	public static class JsonListContext extends ParserRuleContext {
		public ArrayList<HashMap<Integer, Entity>> genIN;
		public ArrayList<HashMap<Integer, Entity>> genOUT;
		public JsonObjectContext g1;
		public JsonObjectContext g2;
		public List<JsonObjectContext> jsonObject() {
			return getRuleContexts(JsonObjectContext.class);
		}
		public JsonObjectContext jsonObject(int i) {
			return getRuleContext(JsonObjectContext.class,i);
		}
		public JsonListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public JsonListContext(ParserRuleContext parent, int invokingState, ArrayList<HashMap<Integer, Entity>> genIN) {
			super(parent, invokingState);
			this.genIN = genIN;
		}
		@Override public int getRuleIndex() { return RULE_jsonList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterJsonList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitJsonList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitJsonList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonListContext jsonList(ArrayList<HashMap<Integer, Entity>> genIN) throws RecognitionException {
		JsonListContext _localctx = new JsonListContext(_ctx, getState(), genIN);
		enterRule(_localctx, 2, RULE_jsonList);

		    Entity ent = new Entity();
		    ent.data = new HashMap<>();
		    Entity ent2 =  new Entity();
		    ent2.data = new HashMap<>();
		    HashMap<Integer,Entity> add = new HashMap<>();
		    int i = 0;

		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(T__1);
				setState(35);
				((JsonListContext)_localctx).g1 = jsonObject();
				ent.data = ((JsonListContext)_localctx).g1.ret; add.put(i,ent);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(37);
					match(T__2);
					setState(38);
					((JsonListContext)_localctx).g2 = jsonObject();
					 ent2.data = ((JsonListContext)_localctx).g2.ret; add.put(i,ent2); i= i+1;
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(T__3);
				 _localctx.genIN.add(add); ((JsonListContext)_localctx).genOUT = genIN;
				}
				break;
			case EOF:
			case RESOURCES:
				enterOuterAlt(_localctx, 2);
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

	public static class JsonObjectContext extends ParserRuleContext {
		public HashMap<String, JsonValue> ret;
		public List<PairKeyValueContext> pairKeyValue() {
			return getRuleContexts(PairKeyValueContext.class);
		}
		public PairKeyValueContext pairKeyValue(int i) {
			return getRuleContext(PairKeyValueContext.class,i);
		}
		public JsonObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterJsonObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitJsonObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitJsonObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonObjectContext jsonObject() throws RecognitionException {
		JsonObjectContext _localctx = new JsonObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jsonObject);

		    HashMap<String, JsonValue> req = new HashMap<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__4);
			setState(53);
			pairKeyValue(req);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(54);
				match(T__2);
				setState(55);
				pairKeyValue(req);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(T__5);
			((JsonObjectContext)_localctx).ret =  req;
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
		public ArrayList<String> conceptsIN;
		public ArrayList<String> conceptsOUT;
		public QuotedWordContext qw1;
		public ResOfLContext cs2;
		public QuotedWordContext quotedWord() {
			return getRuleContext(QuotedWordContext.class,0);
		}
		public List<ResOfLContext> resOfL() {
			return getRuleContexts(ResOfLContext.class);
		}
		public ResOfLContext resOfL(int i) {
			return getRuleContext(ResOfLContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListContext(ParserRuleContext parent, int invokingState, ArrayList<String> conceptsIN) {
			super(parent, invokingState);
			this.conceptsIN = conceptsIN;
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

	public final ListContext list(ArrayList<String> conceptsIN) throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState(), conceptsIN);
		enterRule(_localctx, 6, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__1);
			setState(65);
			((ListContext)_localctx).qw1 = quotedWord();
			conceptsIN.add((((ListContext)_localctx).qw1!=null?_input.getText(((ListContext)_localctx).qw1.start,((ListContext)_localctx).qw1.stop):null));((ListContext)_localctx).conceptsOUT =  _localctx.conceptsIN;
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(67);
				((ListContext)_localctx).cs2 = resOfL(_localctx.conceptsOUT);
				((ListContext)_localctx).conceptsOUT =  ((ListContext)_localctx).cs2.concOUT;
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__3);
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

	public static class ResOfLContext extends ParserRuleContext {
		public ArrayList<String> concIN;
		public ArrayList<String> concOUT;
		public QuotedWordContext qw2;
		public QuotedWordContext quotedWord() {
			return getRuleContext(QuotedWordContext.class,0);
		}
		public ResOfLContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ResOfLContext(ParserRuleContext parent, int invokingState, ArrayList<String> concIN) {
			super(parent, invokingState);
			this.concIN = concIN;
		}
		@Override public int getRuleIndex() { return RULE_resOfL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterResOfL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitResOfL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitResOfL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResOfLContext resOfL(ArrayList<String> concIN) throws RecognitionException {
		ResOfLContext _localctx = new ResOfLContext(_ctx, getState(), concIN);
		enterRule(_localctx, 8, RULE_resOfL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__2);
			setState(78);
			((ResOfLContext)_localctx).qw2 = quotedWord();
			_localctx.concIN.add((((ResOfLContext)_localctx).qw2!=null?_input.getText(((ResOfLContext)_localctx).qw2.start,((ResOfLContext)_localctx).qw2.stop):null));((ResOfLContext)_localctx).concOUT =  _localctx.concIN;
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
		public HashMap<String, JsonValue> kIN;
		public HashMap<String, JsonValue> kOUT;
		public QuotedWordContext key;
		public JsonValueContext vv;
		public QuotedWordContext quotedWord() {
			return getRuleContext(QuotedWordContext.class,0);
		}
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public PairKeyValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PairKeyValueContext(ParserRuleContext parent, int invokingState, HashMap<String, JsonValue> kIN) {
			super(parent, invokingState);
			this.kIN = kIN;
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

	public final PairKeyValueContext pairKeyValue(HashMap<String, JsonValue> kIN) throws RecognitionException {
		PairKeyValueContext _localctx = new PairKeyValueContext(_ctx, getState(), kIN);
		enterRule(_localctx, 10, RULE_pairKeyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((PairKeyValueContext)_localctx).key = quotedWord();
			setState(82);
			match(T__0);
			setState(83);
			((PairKeyValueContext)_localctx).vv = jsonValue();
			_localctx.kIN.put((((PairKeyValueContext)_localctx).key!=null?_input.getText(((PairKeyValueContext)_localctx).key.start,((PairKeyValueContext)_localctx).key.stop):null), ((PairKeyValueContext)_localctx).vv.val);((PairKeyValueContext)_localctx).kOUT =  _localctx.kIN;
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
		public JsonValue val;
		public NumContext num;
		public QuotedWordContext quotedWord;
		public JsonObjectContext ret;
		public ListContext c2;
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public QuotedWordContext quotedWord() {
			return getRuleContext(QuotedWordContext.class,0);
		}
		public JsonObjectContext jsonObject() {
			return getRuleContext(JsonObjectContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
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
		enterRule(_localctx, 12, RULE_jsonValue);

		ArrayList<String> concepts = new ArrayList<>();

		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((JsonValueContext)_localctx).num = num();
				((JsonValueContext)_localctx).val =  new JsonNum(Integer.parseInt((((JsonValueContext)_localctx).num!=null?_input.getText(((JsonValueContext)_localctx).num.start,((JsonValueContext)_localctx).num.stop):null)));
				}
				break;
			case QWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				((JsonValueContext)_localctx).quotedWord = quotedWord();
				((JsonValueContext)_localctx).val =  new JsonString((((JsonValueContext)_localctx).quotedWord!=null?_input.getText(((JsonValueContext)_localctx).quotedWord.start,((JsonValueContext)_localctx).quotedWord.stop):null));
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				((JsonValueContext)_localctx).ret = jsonObject();
				((JsonValueContext)_localctx).val =  new Json(((JsonValueContext)_localctx).ret.ret);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				((JsonValueContext)_localctx).c2 = list(concepts);
				((JsonValueContext)_localctx).val =  new JsonList(((JsonValueContext)_localctx).c2.conceptsOUT);
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
		enterRule(_localctx, 14, RULE_quotedWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		enterRule(_localctx, 16, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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
		enterRule(_localctx, 18, RULE_conc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		enterRule(_localctx, 20, RULE_stu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		enterRule(_localctx, 22, RULE_res);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\3\3\3\5\3\65\n\3\3\4\3"+
		"\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\be\n\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\2\2\2k\2\32\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\bB\3\2\2\2\nO\3\2\2\2\f"+
		"S\3\2\2\2\16d\3\2\2\2\20f\3\2\2\2\22h\3\2\2\2\24j\3\2\2\2\26l\3\2\2\2"+
		"\30n\3\2\2\2\32\33\5\24\13\2\33\34\7\3\2\2\34\35\5\b\5\2\35\36\5\26\f"+
		"\2\36\37\7\3\2\2\37 \5\4\3\2 !\5\30\r\2!\"\7\3\2\2\"#\5\4\3\2#\3\3\2\2"+
		"\2$%\7\4\2\2%&\5\6\4\2&-\b\3\1\2\'(\7\5\2\2()\5\6\4\2)*\b\3\1\2*,\3\2"+
		"\2\2+\'\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60"+
		"\61\7\6\2\2\61\62\b\3\1\2\62\65\3\2\2\2\63\65\3\2\2\2\64$\3\2\2\2\64\63"+
		"\3\2\2\2\65\5\3\2\2\2\66\67\7\7\2\2\67<\5\f\7\289\7\5\2\29;\5\f\7\2:8"+
		"\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\b\2\2@"+
		"A\b\4\1\2A\7\3\2\2\2BC\7\4\2\2CD\5\20\t\2DJ\b\5\1\2EF\5\n\6\2FG\b\5\1"+
		"\2GI\3\2\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2"+
		"\2MN\7\6\2\2N\t\3\2\2\2OP\7\5\2\2PQ\5\20\t\2QR\b\6\1\2R\13\3\2\2\2ST\5"+
		"\20\t\2TU\7\3\2\2UV\5\16\b\2VW\b\7\1\2W\r\3\2\2\2XY\5\22\n\2YZ\b\b\1\2"+
		"Ze\3\2\2\2[\\\5\20\t\2\\]\b\b\1\2]e\3\2\2\2^_\5\6\4\2_`\b\b\1\2`e\3\2"+
		"\2\2ab\5\b\5\2bc\b\b\1\2ce\3\2\2\2dX\3\2\2\2d[\3\2\2\2d^\3\2\2\2da\3\2"+
		"\2\2e\17\3\2\2\2fg\7\r\2\2g\21\3\2\2\2hi\7\f\2\2i\23\3\2\2\2jk\7\t\2\2"+
		"k\25\3\2\2\2lm\7\n\2\2m\27\3\2\2\2no\7\13\2\2o\31\3\2\2\2\7-\64<Jd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}