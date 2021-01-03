// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/TPGCS/GCS_Project\tpCGS.g4 by ANTLR 4.9

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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CONCEPTS=7, STUDENTS=8, 
		RESOURCES=9, WORD=10, NUM=11, QWORD=12, WS=13;
	public static final int
		RULE_sistema = 0, RULE_entityList = 1, RULE_entityObject = 2, RULE_list = 3, 
		RULE_resOfL = 4, RULE_pairKeyValue = 5, RULE_entityValue = 6, RULE_quotedWord = 7, 
		RULE_word = 8, RULE_num = 9, RULE_conc = 10, RULE_stu = 11, RULE_res = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"sistema", "entityList", "entityObject", "list", "resOfL", "pairKeyValue", 
			"entityValue", "quotedWord", "word", "num", "conc", "stu", "res"
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

	public static class SistemaContext extends ParserRuleContext {
		public ListContext c1;
		public EntityListContext a1;
		public EntityListContext r1;
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
		public List<EntityListContext> entityList() {
			return getRuleContexts(EntityListContext.class);
		}
		public EntityListContext entityList(int i) {
			return getRuleContext(EntityListContext.class,i);
		}
		public SistemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sistema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterSistema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitSistema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitSistema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SistemaContext sistema() throws RecognitionException {
		SistemaContext _localctx = new SistemaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sistema);

		    ArrayList<String> concepts = new ArrayList<>();
		    HashMap<Integer, Entity> students =  new HashMap<>();
		    HashMap<Integer, Entity> resources =  new HashMap<>();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			conc();
			setState(27);
			match(T__0);
			setState(28);
			((SistemaContext)_localctx).c1 = list(concepts);
			setState(29);
			stu();
			setState(30);
			match(T__0);
			setState(31);
			((SistemaContext)_localctx).a1 = entityList(students);
			setState(32);
			res();
			setState(33);
			match(T__0);
			setState(34);
			((SistemaContext)_localctx).r1 = entityList(resources);
			   View v = new View(((SistemaContext)_localctx).c1.conceptsOUT,((SistemaContext)_localctx).a1.genOUT,((SistemaContext)_localctx).r1.genOUT);  
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

	public static class EntityListContext extends ParserRuleContext {
		public HashMap<Integer, Entity> genIN;
		public HashMap<Integer, Entity> genOUT;
		public EntityObjectContext g1;
		public EntityObjectContext g2;
		public List<EntityObjectContext> entityObject() {
			return getRuleContexts(EntityObjectContext.class);
		}
		public EntityObjectContext entityObject(int i) {
			return getRuleContext(EntityObjectContext.class,i);
		}
		public EntityListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EntityListContext(ParserRuleContext parent, int invokingState, HashMap<Integer, Entity> genIN) {
			super(parent, invokingState);
			this.genIN = genIN;
		}
		@Override public int getRuleIndex() { return RULE_entityList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterEntityList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitEntityList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitEntityList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityListContext entityList(HashMap<Integer, Entity> genIN) throws RecognitionException {
		EntityListContext _localctx = new EntityListContext(_ctx, getState(), genIN);
		enterRule(_localctx, 2, RULE_entityList);

		    Entity ent = new Entity();
		    ent.data = new HashMap<>();
		    Integer i = 0;

		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(T__1);
				setState(38);
				((EntityListContext)_localctx).g1 = entityObject();
				ent.data = ((EntityListContext)_localctx).g1.ret; genIN.put(i,ent); ((EntityListContext)_localctx).genOUT = _localctx.genIN; i=1;
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(40);
					match(T__2);
					setState(41);
					((EntityListContext)_localctx).g2 = entityObject();
					 Entity ent2 =  new Entity();
					                        ent2.data = ((EntityListContext)_localctx).g2.ret; _localctx.genOUT.put(i,ent2);((EntityListContext)_localctx).genOUT = _localctx.genIN;i=i+1;
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(T__3);
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

	public static class EntityObjectContext extends ParserRuleContext {
		public HashMap<String, JsonValue> ret;
		public List<PairKeyValueContext> pairKeyValue() {
			return getRuleContexts(PairKeyValueContext.class);
		}
		public PairKeyValueContext pairKeyValue(int i) {
			return getRuleContext(PairKeyValueContext.class,i);
		}
		public EntityObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterEntityObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitEntityObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitEntityObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityObjectContext entityObject() throws RecognitionException {
		EntityObjectContext _localctx = new EntityObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entityObject);

		    HashMap<String, JsonValue> req = new HashMap<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__4);
			setState(55);
			pairKeyValue(req);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(56);
				match(T__2);
				setState(57);
				pairKeyValue(req);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(T__5);
			((EntityObjectContext)_localctx).ret =  req;
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
			setState(66);
			match(T__1);
			setState(67);
			((ListContext)_localctx).qw1 = quotedWord();
			conceptsIN.add((((ListContext)_localctx).qw1!=null?_input.getText(((ListContext)_localctx).qw1.start,((ListContext)_localctx).qw1.stop):null));((ListContext)_localctx).conceptsOUT =  _localctx.conceptsIN;
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(69);
				((ListContext)_localctx).cs2 = resOfL(_localctx.conceptsOUT);
				((ListContext)_localctx).conceptsOUT =  ((ListContext)_localctx).cs2.concOUT;
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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
			setState(79);
			match(T__2);
			setState(80);
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
		public WordContext key;
		public EntityValueContext vv;
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public EntityValueContext entityValue() {
			return getRuleContext(EntityValueContext.class,0);
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
			setState(83);
			((PairKeyValueContext)_localctx).key = word();
			setState(84);
			match(T__0);
			setState(85);
			((PairKeyValueContext)_localctx).vv = entityValue();
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

	public static class EntityValueContext extends ParserRuleContext {
		public JsonValue val;
		public NumContext num;
		public QuotedWordContext quotedWord;
		public EntityObjectContext ret;
		public ListContext c2;
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public QuotedWordContext quotedWord() {
			return getRuleContext(QuotedWordContext.class,0);
		}
		public EntityObjectContext entityObject() {
			return getRuleContext(EntityObjectContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public EntityValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterEntityValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitEntityValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitEntityValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityValueContext entityValue() throws RecognitionException {
		EntityValueContext _localctx = new EntityValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_entityValue);

		ArrayList<String> concepts = new ArrayList<>();

		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((EntityValueContext)_localctx).num = num();
				((EntityValueContext)_localctx).val =  new JsonNum(Integer.parseInt((((EntityValueContext)_localctx).num!=null?_input.getText(((EntityValueContext)_localctx).num.start,((EntityValueContext)_localctx).num.stop):null)));
				}
				break;
			case QWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				((EntityValueContext)_localctx).quotedWord = quotedWord();
				String p = (((EntityValueContext)_localctx).quotedWord!=null?_input.getText(((EntityValueContext)_localctx).quotedWord.start,((EntityValueContext)_localctx).quotedWord.stop):null).toString(); ((EntityValueContext)_localctx).val =  new JsonString(p);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				((EntityValueContext)_localctx).ret = entityObject();
				((EntityValueContext)_localctx).val =  new Json(((EntityValueContext)_localctx).ret.ret);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				((EntityValueContext)_localctx).c2 = list(concepts);
				((EntityValueContext)_localctx).val =  new JsonList(((EntityValueContext)_localctx).c2.conceptsOUT);
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
			setState(102);
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

	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(tpCGSParser.WORD, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpCGSListener ) ((tpCGSListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tpCGSVisitor ) return ((tpCGSVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(WORD);
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
		enterRule(_localctx, 18, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		enterRule(_localctx, 20, RULE_conc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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
		enterRule(_localctx, 22, RULE_stu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		enterRule(_localctx, 24, RULE_res);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3\3\3\3\3\5\3\67"+
		"\n\3\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bg\n\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\2\2\2n\2\34\3\2\2\2\4\66\3\2\2\2\68\3\2\2\2\b"+
		"D\3\2\2\2\nQ\3\2\2\2\fU\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22j\3\2\2\2\24"+
		"l\3\2\2\2\26n\3\2\2\2\30p\3\2\2\2\32r\3\2\2\2\34\35\5\26\f\2\35\36\7\3"+
		"\2\2\36\37\5\b\5\2\37 \5\30\r\2 !\7\3\2\2!\"\5\4\3\2\"#\5\32\16\2#$\7"+
		"\3\2\2$%\5\4\3\2%&\b\2\1\2&\3\3\2\2\2\'(\7\4\2\2()\5\6\4\2)\60\b\3\1\2"+
		"*+\7\5\2\2+,\5\6\4\2,-\b\3\1\2-/\3\2\2\2.*\3\2\2\2/\62\3\2\2\2\60.\3\2"+
		"\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\6\2\2\64\67\3\2"+
		"\2\2\65\67\3\2\2\2\66\'\3\2\2\2\66\65\3\2\2\2\67\5\3\2\2\289\7\7\2\29"+
		">\5\f\7\2:;\7\5\2\2;=\5\f\7\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?A\3\2\2\2@>\3\2\2\2AB\7\b\2\2BC\b\4\1\2C\7\3\2\2\2DE\7\4\2\2EF\5\20\t"+
		"\2FL\b\5\1\2GH\5\n\6\2HI\b\5\1\2IK\3\2\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2"+
		"\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\6\2\2P\t\3\2\2\2QR\7\5\2\2RS\5\20"+
		"\t\2ST\b\6\1\2T\13\3\2\2\2UV\5\22\n\2VW\7\3\2\2WX\5\16\b\2XY\b\7\1\2Y"+
		"\r\3\2\2\2Z[\5\24\13\2[\\\b\b\1\2\\g\3\2\2\2]^\5\20\t\2^_\b\b\1\2_g\3"+
		"\2\2\2`a\5\6\4\2ab\b\b\1\2bg\3\2\2\2cd\5\b\5\2de\b\b\1\2eg\3\2\2\2fZ\3"+
		"\2\2\2f]\3\2\2\2f`\3\2\2\2fc\3\2\2\2g\17\3\2\2\2hi\7\16\2\2i\21\3\2\2"+
		"\2jk\7\f\2\2k\23\3\2\2\2lm\7\r\2\2m\25\3\2\2\2no\7\t\2\2o\27\3\2\2\2p"+
		"q\7\n\2\2q\31\3\2\2\2rs\7\13\2\2s\33\3\2\2\2\7\60\66>Lf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}