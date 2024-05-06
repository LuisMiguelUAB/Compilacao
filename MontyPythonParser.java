// Generated from MontyPython.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MontyPythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDellista=1, AND=2, OR=3, NOT=4, EQ=5, COMMA=6, SEMI=7, LPAREN=8, RPAREN=9, 
		LCURLY=10, RCURLY=11, LSQUARE=12, RSQUARE=13, TWOPOINTS=14, EXP=15, MULT=16, 
		DIV=17, IDIV=18, MOD=19, SUM=20, SUBT=21, LESS=22, LESSEQ=23, BIGG=24, 
		BIGGEQ=25, EQUAL=26, DIFF=27, DINT=28, DFLOAT=29, INPUT=30, PRINT=31, 
		WHILE=32, IF=33, ELIF=34, ELSE=35, FOR=36, IN=37, RANGE=38, DEF=39, RETURN=40, 
		LSIZE=41, LADD=42, LREMOVE=43, INT=44, FLOAT=45, MMENOS=46, STRING=47, 
		ID=48, COMMENT=49, WS=50;
	public static final int
		RULE_program = 0, RULE_progline = 1, RULE_stat = 2, RULE_assignment = 3, 
		RULE_declaration = 4, RULE_deftipo = 5, RULE_funcheader = 6, RULE_funcreturn = 7, 
		RULE_def = 8, RULE_whilecycle = 9, RULE_ifthenelse = 10, RULE_forin = 11, 
		RULE_tlistint = 12, RULE_tlistfloat = 13, RULE_flsize = 14, RULE_fladd = 15, 
		RULE_flremove = 16, RULE_inputline = 17, RULE_printstat = 18, RULE_trange = 19, 
		RULE_expr = 20, RULE_exprlogic = 21, RULE_func = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "progline", "stat", "assignment", "declaration", "deftipo", 
			"funcheader", "funcreturn", "def", "whilecycle", "ifthenelse", "forin", 
			"tlistint", "tlistfloat", "flsize", "fladd", "flremove", "inputline", 
			"printstat", "trange", "expr", "exprlogic", "func"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'and'", "'or'", "'not'", "'='", "','", "';'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "':'", "'**'", "'*'", "'/'", "'//'", "'%'", 
			"'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'int'", 
			"'float'", "'input'", "'print'", "'while'", "'if'", "'elif'", "'else'", 
			"'for'", "'in'", "'range'", "'def'", "'return'", "'size'", "'add'", "'remove'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDellista", "AND", "OR", "NOT", "EQ", "COMMA", "SEMI", "LPAREN", 
			"RPAREN", "LCURLY", "RCURLY", "LSQUARE", "RSQUARE", "TWOPOINTS", "EXP", 
			"MULT", "DIV", "IDIV", "MOD", "SUM", "SUBT", "LESS", "LESSEQ", "BIGG", 
			"BIGGEQ", "EQUAL", "DIFF", "DINT", "DFLOAT", "INPUT", "PRINT", "WHILE", 
			"IF", "ELIF", "ELSE", "FOR", "IN", "RANGE", "DEF", "RETURN", "LSIZE", 
			"LADD", "LREMOVE", "INT", "FLOAT", "MMENOS", "STRING", "ID", "COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "MontyPython.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MontyPythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MontyPythonParser.EOF, 0); }
		public List<ProglineContext> progline() {
			return getRuleContexts(ProglineContext.class);
		}
		public ProglineContext progline(int i) {
			return getRuleContext(ProglineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 296402940854274L) != 0)) {
				{
				{
				setState(46);
				progline();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProglineContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public ProglineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterProgline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitProgline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitProgline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProglineContext progline() throws RecognitionException {
		ProglineContext _localctx = new ProglineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_progline);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				def();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhilecycleContext whilecycle() {
			return getRuleContext(WhilecycleContext.class,0);
		}
		public IfthenelseContext ifthenelse() {
			return getRuleContext(IfthenelseContext.class,0);
		}
		public ForinContext forin() {
			return getRuleContext(ForinContext.class,0);
		}
		public FuncheaderContext funcheader() {
			return getRuleContext(FuncheaderContext.class,0);
		}
		public FuncreturnContext funcreturn() {
			return getRuleContext(FuncreturnContext.class,0);
		}
		public PrintstatContext printstat() {
			return getRuleContext(PrintstatContext.class,0);
		}
		public FladdContext fladd() {
			return getRuleContext(FladdContext.class,0);
		}
		public FlremoveContext flremove() {
			return getRuleContext(FlremoveContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				whilecycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				ifthenelse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				forin();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				funcheader();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				funcreturn();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				printstat();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				fladd();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(67);
				flremove();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(MontyPythonParser.EQ, 0); }
		public TerminalNode ID() { return getToken(MontyPythonParser.ID, 0); }
		public TerminalNode IDellista() { return getToken(MontyPythonParser.IDellista, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TlistintContext tlistint() {
			return getRuleContext(TlistintContext.class,0);
		}
		public TlistfloatContext tlistfloat() {
			return getRuleContext(TlistfloatContext.class,0);
		}
		public InputlineContext inputline() {
			return getRuleContext(InputlineContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==IDellista || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
			match(EQ);
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(72);
				expr(0);
				}
				break;
			case 2:
				{
				setState(73);
				tlistint();
				}
				break;
			case 3:
				{
				setState(74);
				tlistfloat();
				}
				break;
			case 4:
				{
				setState(75);
				inputline();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DINT() { return getToken(MontyPythonParser.DINT, 0); }
		public List<TerminalNode> ID() { return getTokens(MontyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MontyPythonParser.ID, i);
		}
		public List<TerminalNode> EQ() { return getTokens(MontyPythonParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(MontyPythonParser.EQ, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MontyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MontyPythonParser.COMMA, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InputlineContext inputline() {
			return getRuleContext(InputlineContext.class,0);
		}
		public TerminalNode DFLOAT() { return getToken(MontyPythonParser.DFLOAT, 0); }
		public TerminalNode LSQUARE() { return getToken(MontyPythonParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(MontyPythonParser.RSQUARE, 0); }
		public TlistintContext tlistint() {
			return getRuleContext(TlistintContext.class,0);
		}
		public TlistfloatContext tlistfloat() {
			return getRuleContext(TlistfloatContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(DINT);
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					{
					setState(79);
					match(ID);
					}
					}
					break;
				case 2:
					{
					{
					setState(80);
					match(ID);
					setState(81);
					match(EQ);
					setState(84);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDellista:
					case LPAREN:
					case LSIZE:
					case INT:
					case FLOAT:
					case ID:
						{
						setState(82);
						expr(0);
						}
						break;
					case INPUT:
						{
						setState(83);
						inputline();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						{
						setState(88);
						match(COMMA);
						setState(89);
						match(ID);
						}
						}
						break;
					case 2:
						{
						{
						setState(90);
						match(COMMA);
						setState(91);
						match(ID);
						setState(92);
						match(EQ);
						setState(93);
						expr(0);
						}
						}
						break;
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(DFLOAT);
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					{
					setState(100);
					match(ID);
					}
					}
					break;
				case 2:
					{
					{
					setState(101);
					match(ID);
					setState(102);
					match(EQ);
					setState(103);
					expr(0);
					}
					}
					break;
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						{
						setState(106);
						match(COMMA);
						setState(107);
						match(ID);
						}
						}
						break;
					case 2:
						{
						{
						setState(108);
						match(COMMA);
						setState(109);
						match(ID);
						setState(110);
						match(EQ);
						setState(111);
						expr(0);
						}
						}
						break;
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					{
					setState(117);
					match(ID);
					}
					}
					break;
				case 2:
					{
					{
					setState(118);
					match(ID);
					setState(119);
					match(EQ);
					setState(120);
					expr(0);
					}
					}
					break;
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						{
						setState(123);
						match(COMMA);
						setState(124);
						match(ID);
						}
						}
						break;
					case 2:
						{
						{
						setState(125);
						match(COMMA);
						setState(126);
						match(ID);
						setState(127);
						match(EQ);
						setState(128);
						expr(0);
						}
						}
						break;
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(DINT);
				setState(135);
				match(LSQUARE);
				setState(136);
				match(RSQUARE);
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(137);
					match(ID);
					}
					break;
				case 2:
					{
					{
					setState(138);
					match(ID);
					setState(139);
					match(EQ);
					setState(140);
					tlistint();
					}
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(DFLOAT);
				setState(144);
				match(LSQUARE);
				setState(145);
				match(RSQUARE);
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(146);
					match(ID);
					}
					break;
				case 2:
					{
					{
					setState(147);
					match(ID);
					setState(148);
					match(EQ);
					setState(149);
					tlistfloat();
					}
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeftipoContext extends ParserRuleContext {
		public TerminalNode DINT() { return getToken(MontyPythonParser.DINT, 0); }
		public TerminalNode DFLOAT() { return getToken(MontyPythonParser.DFLOAT, 0); }
		public TerminalNode LSQUARE() { return getToken(MontyPythonParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(MontyPythonParser.RSQUARE, 0); }
		public DeftipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deftipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterDeftipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitDeftipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitDeftipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeftipoContext deftipo() throws RecognitionException {
		DeftipoContext _localctx = new DeftipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_deftipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==DINT || _la==DFLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(155);
				match(LSQUARE);
				setState(156);
				match(RSQUARE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncheaderContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(MontyPythonParser.DEF, 0); }
		public List<TerminalNode> ID() { return getTokens(MontyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MontyPythonParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(MontyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MontyPythonParser.RPAREN, 0); }
		public TerminalNode TWOPOINTS() { return getToken(MontyPythonParser.TWOPOINTS, 0); }
		public List<DeftipoContext> deftipo() {
			return getRuleContexts(DeftipoContext.class);
		}
		public DeftipoContext deftipo(int i) {
			return getRuleContext(DeftipoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MontyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MontyPythonParser.COMMA, i);
		}
		public FuncheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterFuncheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitFuncheader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitFuncheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncheaderContext funcheader() throws RecognitionException {
		FuncheaderContext _localctx = new FuncheaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcheader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(DEF);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DINT || _la==DFLOAT) {
				{
				setState(160);
				deftipo();
				}
			}

			setState(163);
			match(ID);
			setState(164);
			match(LPAREN);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281475782017024L) != 0)) {
				{
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DINT || _la==DFLOAT) {
					{
					setState(165);
					deftipo();
					}
				}

				setState(168);
				match(ID);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(169);
					match(COMMA);
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DINT || _la==DFLOAT) {
						{
						setState(170);
						deftipo();
						}
					}

					setState(173);
					match(ID);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(181);
			match(RPAREN);
			setState(182);
			match(TWOPOINTS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncreturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MontyPythonParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterFuncreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitFuncreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitFuncreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncreturnContext funcreturn() throws RecognitionException {
		FuncreturnContext _localctx = new FuncreturnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcreturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(RETURN);
			setState(185);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MontyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MontyPythonParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(MontyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MontyPythonParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(MontyPythonParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(MontyPythonParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MontyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MontyPythonParser.COMMA, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(188);
			match(LPAREN);
			setState(189);
			match(ID);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(190);
				match(COMMA);
				setState(191);
				match(ID);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(RPAREN);
			setState(198);
			match(LCURLY);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 296402940854274L) != 0)) {
				{
				{
				setState(199);
				stat();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhilecycleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MontyPythonParser.WHILE, 0); }
		public ExprlogicContext exprlogic() {
			return getRuleContext(ExprlogicContext.class,0);
		}
		public List<TerminalNode> TWOPOINTS() { return getTokens(MontyPythonParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(MontyPythonParser.TWOPOINTS, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MontyPythonParser.ELSE, 0); }
		public WhilecycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilecycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterWhilecycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitWhilecycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitWhilecycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilecycleContext whilecycle() throws RecognitionException {
		WhilecycleContext _localctx = new WhilecycleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whilecycle);
		int _la;
		try {
			int _alt;
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(WHILE);
				setState(208);
				exprlogic(0);
				setState(209);
				match(TWOPOINTS);
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(210);
						stat();
						}
						} 
					}
					setState(215);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(WHILE);
				setState(217);
				exprlogic(0);
				setState(218);
				match(TWOPOINTS);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 296402940854274L) != 0)) {
					{
					{
					setState(219);
					stat();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(ELSE);
				setState(226);
				match(TWOPOINTS);
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227);
						stat();
						}
						} 
					}
					setState(232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfthenelseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MontyPythonParser.IF, 0); }
		public List<ExprlogicContext> exprlogic() {
			return getRuleContexts(ExprlogicContext.class);
		}
		public ExprlogicContext exprlogic(int i) {
			return getRuleContext(ExprlogicContext.class,i);
		}
		public List<TerminalNode> TWOPOINTS() { return getTokens(MontyPythonParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(MontyPythonParser.TWOPOINTS, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(MontyPythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(MontyPythonParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(MontyPythonParser.ELSE, 0); }
		public IfthenelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthenelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterIfthenelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitIfthenelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitIfthenelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfthenelseContext ifthenelse() throws RecognitionException {
		IfthenelseContext _localctx = new IfthenelseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifthenelse);
		int _la;
		try {
			int _alt;
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(IF);
				setState(236);
				exprlogic(0);
				setState(237);
				match(TWOPOINTS);
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(238);
						stat();
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(IF);
				setState(245);
				exprlogic(0);
				setState(246);
				match(TWOPOINTS);
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(247);
						stat();
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253);
						match(ELIF);
						setState(254);
						exprlogic(0);
						setState(255);
						match(TWOPOINTS);
						setState(259);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(256);
								stat();
								}
								} 
							}
							setState(261);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
						}
						}
						} 
					}
					setState(266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(IF);
				setState(268);
				exprlogic(0);
				setState(269);
				match(TWOPOINTS);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 296402940854274L) != 0)) {
					{
					{
					setState(270);
					stat();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(276);
					match(ELIF);
					setState(277);
					exprlogic(0);
					setState(278);
					match(TWOPOINTS);
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 296402940854274L) != 0)) {
						{
						{
						setState(279);
						stat();
						}
						}
						setState(284);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(290);
				match(ELSE);
				setState(291);
				match(TWOPOINTS);
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(292);
						stat();
						}
						} 
					}
					setState(297);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForinContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MontyPythonParser.FOR, 0); }
		public TerminalNode ID() { return getToken(MontyPythonParser.ID, 0); }
		public TerminalNode IN() { return getToken(MontyPythonParser.IN, 0); }
		public TlistintContext tlistint() {
			return getRuleContext(TlistintContext.class,0);
		}
		public TerminalNode TWOPOINTS() { return getToken(MontyPythonParser.TWOPOINTS, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TrangeContext trange() {
			return getRuleContext(TrangeContext.class,0);
		}
		public ForinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterForin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitForin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitForin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForinContext forin() throws RecognitionException {
		ForinContext _localctx = new ForinContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forin);
		try {
			int _alt;
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(FOR);
				setState(301);
				match(ID);
				setState(302);
				match(IN);
				setState(303);
				tlistint();
				setState(304);
				match(TWOPOINTS);
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(305);
						stat();
						}
						} 
					}
					setState(310);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(FOR);
				setState(312);
				match(ID);
				setState(313);
				match(IN);
				setState(314);
				trange();
				setState(315);
				match(TWOPOINTS);
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(316);
						stat();
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TlistintContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MontyPythonParser.ID, 0); }
		public TerminalNode LSQUARE() { return getToken(MontyPythonParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(MontyPythonParser.RSQUARE, 0); }
		public List<TerminalNode> INT() { return getTokens(MontyPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MontyPythonParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MontyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MontyPythonParser.COMMA, i);
		}
		public TlistintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tlistint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterTlistint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitTlistint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitTlistint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TlistintContext tlistint() throws RecognitionException {
		TlistintContext _localctx = new TlistintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tlistint);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(LSQUARE);
				setState(326);
				match(RSQUARE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(LSQUARE);
				setState(328);
				match(INT);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(329);
					match(COMMA);
					setState(330);
					match(INT);
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				match(RSQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TlistfloatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MontyPythonParser.ID, 0); }
		public TerminalNode LSQUARE() { return getToken(MontyPythonParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(MontyPythonParser.RSQUARE, 0); }
		public List<TerminalNode> INT() { return getTokens(MontyPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MontyPythonParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(MontyPythonParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(MontyPythonParser.FLOAT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MontyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MontyPythonParser.COMMA, i);
		}
		public TlistfloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tlistfloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterTlistfloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitTlistfloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitTlistfloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TlistfloatContext tlistfloat() throws RecognitionException {
		TlistfloatContext _localctx = new TlistfloatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tlistfloat);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(LSQUARE);
				setState(341);
				match(RSQUARE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				match(LSQUARE);
				setState(343);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(344);
					match(COMMA);
					setState(345);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==FLOAT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351);
				match(RSQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlsizeContext extends ParserRuleContext {
		public TerminalNode LSIZE() { return getToken(MontyPythonParser.LSIZE, 0); }
		public TerminalNode LPAREN() { return getToken(MontyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MontyPythonParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(MontyPythonParser.ID, 0); }
		public TlistintContext tlistint() {
			return getRuleContext(TlistintContext.class,0);
		}
		public TlistfloatContext tlistfloat() {
			return getRuleContext(TlistfloatContext.class,0);
		}
		public FlsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterFlsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitFlsize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitFlsize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlsizeContext flsize() throws RecognitionException {
		FlsizeContext _localctx = new FlsizeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_flsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LSIZE);
			setState(355);
			match(LPAREN);
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(356);
				match(ID);
				}
				break;
			case 2:
				{
				setState(357);
				tlistint();
				}
				break;
			case 3:
				{
				setState(358);
				tlistfloat();
				}
				break;
			}
			setState(361);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FladdContext extends ParserRuleContext {
		public TerminalNode LADD() { return getToken(MontyPythonParser.LADD, 0); }
		public TerminalNode LPAREN() { return getToken(MontyPythonParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(MontyPythonParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MontyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MontyPythonParser.COMMA, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MontyPythonParser.RPAREN, 0); }
		public FladdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fladd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterFladd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitFladd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitFladd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FladdContext fladd() throws RecognitionException {
		FladdContext _localctx = new FladdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fladd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(LADD);
			setState(364);
			match(LPAREN);
			setState(365);
			match(ID);
			setState(366);
			match(COMMA);
			setState(367);
			expr(0);
			setState(368);
			match(COMMA);
			setState(369);
			expr(0);
			setState(370);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlremoveContext extends ParserRuleContext {
		public TerminalNode LREMOVE() { return getToken(MontyPythonParser.LREMOVE, 0); }
		public TerminalNode LPAREN() { return getToken(MontyPythonParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(MontyPythonParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(MontyPythonParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MontyPythonParser.RPAREN, 0); }
		public FlremoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flremove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterFlremove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitFlremove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitFlremove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlremoveContext flremove() throws RecognitionException {
		FlremoveContext _localctx = new FlremoveContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_flremove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(LREMOVE);
			setState(373);
			match(LPAREN);
			setState(374);
			match(ID);
			setState(375);
			match(COMMA);
			setState(376);
			expr(0);
			setState(377);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputlineContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(MontyPythonParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(MontyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MontyPythonParser.RPAREN, 0); }
		public TerminalNode STRING() { return getToken(MontyPythonParser.STRING, 0); }
		public InputlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterInputline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitInputline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitInputline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputlineContext inputline() throws RecognitionException {
		InputlineContext _localctx = new InputlineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inputline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(INPUT);
			setState(380);
			match(LPAREN);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(381);
				match(STRING);
				}
			}

			setState(384);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintstatContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MontyPythonParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(MontyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MontyPythonParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(MontyPythonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MontyPythonParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MontyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MontyPythonParser.COMMA, i);
		}
		public PrintstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterPrintstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitPrintstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitPrintstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstatContext printstat() throws RecognitionException {
		PrintstatContext _localctx = new PrintstatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(PRINT);
			setState(387);
			match(LPAREN);
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDellista:
			case LPAREN:
			case LSIZE:
			case INT:
			case FLOAT:
			case ID:
				{
				setState(388);
				expr(0);
				}
				break;
			case STRING:
				{
				setState(389);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(392);
				match(COMMA);
				setState(395);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDellista:
				case LPAREN:
				case LSIZE:
				case INT:
				case FLOAT:
				case ID:
					{
					setState(393);
					expr(0);
					}
					break;
				case STRING:
					{
					setState(394);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TrangeContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(MontyPythonParser.RANGE, 0); }
		public TerminalNode LPAREN() { return getToken(MontyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MontyPythonParser.RPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(MontyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MontyPythonParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(MontyPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MontyPythonParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MontyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MontyPythonParser.COMMA, i);
		}
		public TrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterTrange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitTrange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitTrange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrangeContext trange() throws RecognitionException {
		TrangeContext _localctx = new TrangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_trange);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(RANGE);
				setState(405);
				match(LPAREN);
				setState(406);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(407);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(RANGE);
				setState(409);
				match(LPAREN);
				setState(410);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(411);
				match(COMMA);
				setState(412);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(413);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				match(RANGE);
				setState(415);
				match(LPAREN);
				setState(416);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(417);
				match(COMMA);
				setState(418);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(419);
				match(COMMA);
				setState(420);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(421);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MontyPythonParser.ID, 0); }
		public TerminalNode IDellista() { return getToken(MontyPythonParser.IDellista, 0); }
		public TerminalNode INT() { return getToken(MontyPythonParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MontyPythonParser.FLOAT, 0); }
		public FlsizeContext flsize() {
			return getRuleContext(FlsizeContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MontyPythonParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MontyPythonParser.RPAREN, 0); }
		public TerminalNode EXP() { return getToken(MontyPythonParser.EXP, 0); }
		public TerminalNode MULT() { return getToken(MontyPythonParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MontyPythonParser.DIV, 0); }
		public TerminalNode IDIV() { return getToken(MontyPythonParser.IDIV, 0); }
		public TerminalNode MOD() { return getToken(MontyPythonParser.MOD, 0); }
		public TerminalNode SUM() { return getToken(MontyPythonParser.SUM, 0); }
		public TerminalNode SUBT() { return getToken(MontyPythonParser.SUBT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(425);
				match(ID);
				}
				break;
			case 2:
				{
				setState(426);
				match(IDellista);
				}
				break;
			case 3:
				{
				setState(427);
				match(INT);
				}
				break;
			case 4:
				{
				setState(428);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(429);
				flsize();
				}
				break;
			case 6:
				{
				setState(430);
				func();
				}
				break;
			case 7:
				{
				setState(431);
				match(LPAREN);
				setState(432);
				expr(0);
				setState(433);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(435);
				match(ID);
				}
				break;
			case 9:
				{
				setState(436);
				match(INT);
				}
				break;
			case 10:
				{
				setState(437);
				match(FLOAT);
				}
				break;
			case 11:
				{
				setState(438);
				func();
				}
				break;
			case 12:
				{
				setState(439);
				match(LPAREN);
				setState(440);
				expr(0);
				setState(441);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(466);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(445);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(446);
						match(EXP);
						setState(447);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(448);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(449);
						match(MULT);
						setState(450);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(451);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(452);
						match(DIV);
						setState(453);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(454);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(455);
						match(IDIV);
						setState(456);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(457);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(458);
						match(MOD);
						setState(459);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(460);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(461);
						match(SUM);
						setState(462);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(463);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(464);
						match(SUBT);
						setState(465);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprlogicContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MontyPythonParser.ID, 0); }
		public TerminalNode INT() { return getToken(MontyPythonParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MontyPythonParser.FLOAT, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MontyPythonParser.NOT, 0); }
		public List<ExprlogicContext> exprlogic() {
			return getRuleContexts(ExprlogicContext.class);
		}
		public ExprlogicContext exprlogic(int i) {
			return getRuleContext(ExprlogicContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(MontyPythonParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MontyPythonParser.RPAREN, 0); }
		public TerminalNode LESS() { return getToken(MontyPythonParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(MontyPythonParser.LESSEQ, 0); }
		public TerminalNode BIGG() { return getToken(MontyPythonParser.BIGG, 0); }
		public TerminalNode BIGGEQ() { return getToken(MontyPythonParser.BIGGEQ, 0); }
		public TerminalNode EQUAL() { return getToken(MontyPythonParser.EQUAL, 0); }
		public TerminalNode DIFF() { return getToken(MontyPythonParser.DIFF, 0); }
		public TerminalNode AND() { return getToken(MontyPythonParser.AND, 0); }
		public TerminalNode OR() { return getToken(MontyPythonParser.OR, 0); }
		public ExprlogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterExprlogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitExprlogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitExprlogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlogicContext exprlogic() throws RecognitionException {
		return exprlogic(0);
	}

	private ExprlogicContext exprlogic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprlogicContext _localctx = new ExprlogicContext(_ctx, _parentState);
		ExprlogicContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_exprlogic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(472);
				match(ID);
				}
				break;
			case 2:
				{
				setState(473);
				match(INT);
				}
				break;
			case 3:
				{
				setState(474);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(475);
				func();
				}
				break;
			case 5:
				{
				setState(476);
				match(NOT);
				setState(477);
				exprlogic(10);
				}
				break;
			case 6:
				{
				setState(478);
				match(LPAREN);
				setState(479);
				expr(0);
				setState(480);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(482);
				expr(0);
				setState(483);
				match(LESS);
				setState(484);
				expr(0);
				}
				break;
			case 8:
				{
				setState(486);
				expr(0);
				setState(487);
				match(LESSEQ);
				setState(488);
				expr(0);
				}
				break;
			case 9:
				{
				setState(490);
				expr(0);
				setState(491);
				match(BIGG);
				setState(492);
				expr(0);
				}
				break;
			case 10:
				{
				setState(494);
				expr(0);
				setState(495);
				match(BIGGEQ);
				setState(496);
				expr(0);
				}
				break;
			case 11:
				{
				setState(498);
				expr(0);
				setState(499);
				match(EQUAL);
				setState(500);
				expr(0);
				}
				break;
			case 12:
				{
				setState(502);
				expr(0);
				setState(503);
				match(DIFF);
				setState(504);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new ExprlogicContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprlogic);
						setState(508);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(509);
						match(AND);
						setState(510);
						exprlogic(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprlogicContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprlogic);
						setState(511);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(512);
						match(OR);
						setState(513);
						exprlogic(8);
						}
						break;
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MontyPythonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MontyPythonParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MontyPythonParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MontyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MontyPythonParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontyPythonListener ) ((MontyPythonListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontyPythonVisitor ) return ((MontyPythonVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(ID);
			setState(520);
			match(LPAREN);
			setState(521);
			expr(0);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(522);
				match(COMMA);
				setState(523);
				expr(0);
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			match(RPAREN);
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
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 21:
			return exprlogic_sempred((ExprlogicContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean exprlogic_sempred(ExprlogicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u0214\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"9\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"E\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003M\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0003\u0004"+
		"W\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004_\b\u0004\n\u0004\f\u0004b\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004i\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004q\b\u0004\n\u0004\f\u0004t\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004z\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0082\b\u0004"+
		"\n\u0004\f\u0004\u0085\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008e\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0097\b\u0004\u0003\u0004\u0099\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u009e\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00a2\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00a7\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ac\b"+
		"\u0006\u0001\u0006\u0005\u0006\u00af\b\u0006\n\u0006\f\u0006\u00b2\t\u0006"+
		"\u0003\u0006\u00b4\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00c1\b\b\n\b\f\b\u00c4\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u00c9\b"+
		"\b\n\b\f\b\u00cc\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00d4\b\t\n\t\f\t\u00d7\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t"+
		"\u00dd\b\t\n\t\f\t\u00e0\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u00e5\b\t"+
		"\n\t\f\t\u00e8\t\t\u0003\t\u00ea\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00f0\b\n\n\n\f\n\u00f3\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n"+
		"\u00f9\b\n\n\n\f\n\u00fc\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0102"+
		"\b\n\n\n\f\n\u0105\t\n\u0005\n\u0107\b\n\n\n\f\n\u010a\t\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0110\b\n\n\n\f\n\u0113\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u0119\b\n\n\n\f\n\u011c\t\n\u0005\n\u011e\b\n"+
		"\n\n\f\n\u0121\t\n\u0001\n\u0001\n\u0001\n\u0005\n\u0126\b\n\n\n\f\n\u0129"+
		"\t\n\u0003\n\u012b\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0133\b\u000b\n\u000b\f\u000b\u0136"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u013e\b\u000b\n\u000b\f\u000b\u0141\t\u000b\u0003\u000b"+
		"\u0143\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0005\f\u014c\b\f\n\f\f\f\u014f\t\f\u0001\f\u0003\f\u0152\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u015b\b\r\n\r"+
		"\f\r\u015e\t\r\u0001\r\u0003\r\u0161\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0168\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u017f\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0187\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u018c\b\u0012\u0005\u0012\u018e"+
		"\b\u0012\n\u0012\f\u0012\u0191\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01a7\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u01bc\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u01d3\b\u0014\n\u0014\f\u0014\u01d6\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01fb"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u0203\b\u0015\n\u0015\f\u0015\u0206\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u020d\b\u0016"+
		"\n\u0016\f\u0016\u0210\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0000"+
		"\u0002(*\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0004\u0002\u0000\u0001\u00010"+
		"0\u0001\u0000\u001c\u001d\u0001\u0000,-\u0002\u0000,,00\u0261\u00001\u0001"+
		"\u0000\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000"+
		"\u0000\u0006F\u0001\u0000\u0000\u0000\b\u0098\u0001\u0000\u0000\u0000"+
		"\n\u009a\u0001\u0000\u0000\u0000\f\u009f\u0001\u0000\u0000\u0000\u000e"+
		"\u00b8\u0001\u0000\u0000\u0000\u0010\u00bb\u0001\u0000\u0000\u0000\u0012"+
		"\u00e9\u0001\u0000\u0000\u0000\u0014\u012a\u0001\u0000\u0000\u0000\u0016"+
		"\u0142\u0001\u0000\u0000\u0000\u0018\u0151\u0001\u0000\u0000\u0000\u001a"+
		"\u0160\u0001\u0000\u0000\u0000\u001c\u0162\u0001\u0000\u0000\u0000\u001e"+
		"\u016b\u0001\u0000\u0000\u0000 \u0174\u0001\u0000\u0000\u0000\"\u017b"+
		"\u0001\u0000\u0000\u0000$\u0182\u0001\u0000\u0000\u0000&\u01a6\u0001\u0000"+
		"\u0000\u0000(\u01bb\u0001\u0000\u0000\u0000*\u01fa\u0001\u0000\u0000\u0000"+
		",\u0207\u0001\u0000\u0000\u0000.0\u0003\u0002\u0001\u0000/.\u0001\u0000"+
		"\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"45\u0005\u0000\u0000\u00015\u0001\u0001\u0000\u0000\u000069\u0003\u0004"+
		"\u0002\u000079\u0003\u0010\b\u000086\u0001\u0000\u0000\u000087\u0001\u0000"+
		"\u0000\u00009\u0003\u0001\u0000\u0000\u0000:E\u0003\b\u0004\u0000;E\u0003"+
		"\u0006\u0003\u0000<E\u0003\u0012\t\u0000=E\u0003\u0014\n\u0000>E\u0003"+
		"\u0016\u000b\u0000?E\u0003\f\u0006\u0000@E\u0003\u000e\u0007\u0000AE\u0003"+
		"$\u0012\u0000BE\u0003\u001e\u000f\u0000CE\u0003 \u0010\u0000D:\u0001\u0000"+
		"\u0000\u0000D;\u0001\u0000\u0000\u0000D<\u0001\u0000\u0000\u0000D=\u0001"+
		"\u0000\u0000\u0000D>\u0001\u0000\u0000\u0000D?\u0001\u0000\u0000\u0000"+
		"D@\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0007"+
		"\u0000\u0000\u0000GL\u0005\u0005\u0000\u0000HM\u0003(\u0014\u0000IM\u0003"+
		"\u0018\f\u0000JM\u0003\u001a\r\u0000KM\u0003\"\u0011\u0000LH\u0001\u0000"+
		"\u0000\u0000LI\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NV\u0005\u001c\u0000"+
		"\u0000OW\u00050\u0000\u0000PQ\u00050\u0000\u0000QT\u0005\u0005\u0000\u0000"+
		"RU\u0003(\u0014\u0000SU\u0003\"\u0011\u0000TR\u0001\u0000\u0000\u0000"+
		"TS\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VO\u0001\u0000\u0000"+
		"\u0000VP\u0001\u0000\u0000\u0000W`\u0001\u0000\u0000\u0000XY\u0005\u0006"+
		"\u0000\u0000Y_\u00050\u0000\u0000Z[\u0005\u0006\u0000\u0000[\\\u00050"+
		"\u0000\u0000\\]\u0005\u0005\u0000\u0000]_\u0003(\u0014\u0000^X\u0001\u0000"+
		"\u0000\u0000^Z\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0099\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000ch\u0005\u001d\u0000\u0000di\u00050\u0000"+
		"\u0000ef\u00050\u0000\u0000fg\u0005\u0005\u0000\u0000gi\u0003(\u0014\u0000"+
		"hd\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000ir\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0006\u0000\u0000kq\u00050\u0000\u0000lm\u0005\u0006\u0000"+
		"\u0000mn\u00050\u0000\u0000no\u0005\u0005\u0000\u0000oq\u0003(\u0014\u0000"+
		"pj\u0001\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0099\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uz\u00050\u0000\u0000vw\u0005"+
		"0\u0000\u0000wx\u0005\u0005\u0000\u0000xz\u0003(\u0014\u0000yu\u0001\u0000"+
		"\u0000\u0000yv\u0001\u0000\u0000\u0000z\u0083\u0001\u0000\u0000\u0000"+
		"{|\u0005\u0006\u0000\u0000|\u0082\u00050\u0000\u0000}~\u0005\u0006\u0000"+
		"\u0000~\u007f\u00050\u0000\u0000\u007f\u0080\u0005\u0005\u0000\u0000\u0080"+
		"\u0082\u0003(\u0014\u0000\u0081{\u0001\u0000\u0000\u0000\u0081}\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0099\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\u001c\u0000\u0000\u0087\u0088\u0005\f\u0000\u0000\u0088\u008d\u0005\r"+
		"\u0000\u0000\u0089\u008e\u00050\u0000\u0000\u008a\u008b\u00050\u0000\u0000"+
		"\u008b\u008c\u0005\u0005\u0000\u0000\u008c\u008e\u0003\u0018\f\u0000\u008d"+
		"\u0089\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e"+
		"\u0099\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001d\u0000\u0000\u0090"+
		"\u0091\u0005\f\u0000\u0000\u0091\u0096\u0005\r\u0000\u0000\u0092\u0097"+
		"\u00050\u0000\u0000\u0093\u0094\u00050\u0000\u0000\u0094\u0095\u0005\u0005"+
		"\u0000\u0000\u0095\u0097\u0003\u001a\r\u0000\u0096\u0092\u0001\u0000\u0000"+
		"\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000"+
		"\u0000\u0098N\u0001\u0000\u0000\u0000\u0098c\u0001\u0000\u0000\u0000\u0098"+
		"y\u0001\u0000\u0000\u0000\u0098\u0086\u0001\u0000\u0000\u0000\u0098\u008f"+
		"\u0001\u0000\u0000\u0000\u0099\t\u0001\u0000\u0000\u0000\u009a\u009d\u0007"+
		"\u0001\u0000\u0000\u009b\u009c\u0005\f\u0000\u0000\u009c\u009e\u0005\r"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u000b\u0001\u0000\u0000\u0000\u009f\u00a1\u0005\'\u0000"+
		"\u0000\u00a0\u00a2\u0003\n\u0005\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u00050\u0000\u0000\u00a4\u00b3\u0005\b\u0000\u0000\u00a5"+
		"\u00a7\u0003\n\u0005\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00b0"+
		"\u00050\u0000\u0000\u00a9\u00ab\u0005\u0006\u0000\u0000\u00aa\u00ac\u0003"+
		"\n\u0005\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u00050\u0000"+
		"\u0000\u00ae\u00a9\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00a6\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\t\u0000\u0000"+
		"\u00b6\u00b7\u0005\u000e\u0000\u0000\u00b7\r\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0005(\u0000\u0000\u00b9\u00ba\u0003(\u0014\u0000\u00ba\u000f\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u00050\u0000\u0000\u00bc\u00bd\u0005\b"+
		"\u0000\u0000\u00bd\u00c2\u00050\u0000\u0000\u00be\u00bf\u0005\u0006\u0000"+
		"\u0000\u00bf\u00c1\u00050\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\t\u0000\u0000\u00c6"+
		"\u00ca\u0005\n\u0000\u0000\u00c7\u00c9\u0003\u0004\u0002\u0000\u00c8\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0005\u000b\u0000\u0000\u00ce\u0011\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0005 \u0000\u0000\u00d0\u00d1\u0003*\u0015\u0000\u00d1\u00d5\u0005\u000e"+
		"\u0000\u0000\u00d2\u00d4\u0003\u0004\u0002\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00ea\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005 \u0000"+
		"\u0000\u00d9\u00da\u0003*\u0015\u0000\u00da\u00de\u0005\u000e\u0000\u0000"+
		"\u00db\u00dd\u0003\u0004\u0002\u0000\u00dc\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005#\u0000\u0000\u00e2"+
		"\u00e6\u0005\u000e\u0000\u0000\u00e3\u00e5\u0003\u0004\u0002\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9"+
		"\u00cf\u0001\u0000\u0000\u0000\u00e9\u00d8\u0001\u0000\u0000\u0000\u00ea"+
		"\u0013\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005!\u0000\u0000\u00ec\u00ed"+
		"\u0003*\u0015\u0000\u00ed\u00f1\u0005\u000e\u0000\u0000\u00ee\u00f0\u0003"+
		"\u0004\u0002\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u012b\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005!\u0000\u0000\u00f5\u00f6\u0003*\u0015"+
		"\u0000\u00f6\u00fa\u0005\u000e\u0000\u0000\u00f7\u00f9\u0003\u0004\u0002"+
		"\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u0108\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0005\"\u0000\u0000\u00fe\u00ff\u0003*\u0015\u0000"+
		"\u00ff\u0103\u0005\u000e\u0000\u0000\u0100\u0102\u0003\u0004\u0002\u0000"+
		"\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0106\u00fd\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109\u012b\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005!\u0000\u0000\u010c\u010d\u0003*\u0015\u0000\u010d\u0111"+
		"\u0005\u000e\u0000\u0000\u010e\u0110\u0003\u0004\u0002\u0000\u010f\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u011f"+
		"\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0005\"\u0000\u0000\u0115\u0116\u0003*\u0015\u0000\u0116\u011a\u0005"+
		"\u000e\u0000\u0000\u0117\u0119\u0003\u0004\u0002\u0000\u0118\u0117\u0001"+
		"\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011e\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0114\u0001"+
		"\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0123\u0005"+
		"#\u0000\u0000\u0123\u0127\u0005\u000e\u0000\u0000\u0124\u0126\u0003\u0004"+
		"\u0002\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000"+
		"\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u012a\u00eb\u0001\u0000\u0000\u0000\u012a\u00f4\u0001\u0000"+
		"\u0000\u0000\u012a\u010b\u0001\u0000\u0000\u0000\u012b\u0015\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0005$\u0000\u0000\u012d\u012e\u00050\u0000\u0000"+
		"\u012e\u012f\u0005%\u0000\u0000\u012f\u0130\u0003\u0018\f\u0000\u0130"+
		"\u0134\u0005\u000e\u0000\u0000\u0131\u0133\u0003\u0004\u0002\u0000\u0132"+
		"\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u0143\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0005$\u0000\u0000\u0138\u0139\u00050\u0000\u0000\u0139\u013a\u0005"+
		"%\u0000\u0000\u013a\u013b\u0003&\u0013\u0000\u013b\u013f\u0005\u000e\u0000"+
		"\u0000\u013c\u013e\u0003\u0004\u0002\u0000\u013d\u013c\u0001\u0000\u0000"+
		"\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u012c\u0001\u0000\u0000"+
		"\u0000\u0142\u0137\u0001\u0000\u0000\u0000\u0143\u0017\u0001\u0000\u0000"+
		"\u0000\u0144\u0152\u00050\u0000\u0000\u0145\u0146\u0005\f\u0000\u0000"+
		"\u0146\u0152\u0005\r\u0000\u0000\u0147\u0148\u0005\f\u0000\u0000\u0148"+
		"\u014d\u0005,\u0000\u0000\u0149\u014a\u0005\u0006\u0000\u0000\u014a\u014c"+
		"\u0005,\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014f\u0001"+
		"\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001"+
		"\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u014d\u0001"+
		"\u0000\u0000\u0000\u0150\u0152\u0005\r\u0000\u0000\u0151\u0144\u0001\u0000"+
		"\u0000\u0000\u0151\u0145\u0001\u0000\u0000\u0000\u0151\u0147\u0001\u0000"+
		"\u0000\u0000\u0152\u0019\u0001\u0000\u0000\u0000\u0153\u0161\u00050\u0000"+
		"\u0000\u0154\u0155\u0005\f\u0000\u0000\u0155\u0161\u0005\r\u0000\u0000"+
		"\u0156\u0157\u0005\f\u0000\u0000\u0157\u015c\u0007\u0002\u0000\u0000\u0158"+
		"\u0159\u0005\u0006\u0000\u0000\u0159\u015b\u0007\u0002\u0000\u0000\u015a"+
		"\u0158\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c"+
		"\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d"+
		"\u015f\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f"+
		"\u0161\u0005\r\u0000\u0000\u0160\u0153\u0001\u0000\u0000\u0000\u0160\u0154"+
		"\u0001\u0000\u0000\u0000\u0160\u0156\u0001\u0000\u0000\u0000\u0161\u001b"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0005)\u0000\u0000\u0163\u0167\u0005"+
		"\b\u0000\u0000\u0164\u0168\u00050\u0000\u0000\u0165\u0168\u0003\u0018"+
		"\f\u0000\u0166\u0168\u0003\u001a\r\u0000\u0167\u0164\u0001\u0000\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0005\t\u0000\u0000"+
		"\u016a\u001d\u0001\u0000\u0000\u0000\u016b\u016c\u0005*\u0000\u0000\u016c"+
		"\u016d\u0005\b\u0000\u0000\u016d\u016e\u00050\u0000\u0000\u016e\u016f"+
		"\u0005\u0006\u0000\u0000\u016f\u0170\u0003(\u0014\u0000\u0170\u0171\u0005"+
		"\u0006\u0000\u0000\u0171\u0172\u0003(\u0014\u0000\u0172\u0173\u0005\t"+
		"\u0000\u0000\u0173\u001f\u0001\u0000\u0000\u0000\u0174\u0175\u0005+\u0000"+
		"\u0000\u0175\u0176\u0005\b\u0000\u0000\u0176\u0177\u00050\u0000\u0000"+
		"\u0177\u0178\u0005\u0006\u0000\u0000\u0178\u0179\u0003(\u0014\u0000\u0179"+
		"\u017a\u0005\t\u0000\u0000\u017a!\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0005\u001e\u0000\u0000\u017c\u017e\u0005\b\u0000\u0000\u017d\u017f\u0005"+
		"/\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0005\t\u0000"+
		"\u0000\u0181#\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u001f\u0000\u0000"+
		"\u0183\u0186\u0005\b\u0000\u0000\u0184\u0187\u0003(\u0014\u0000\u0185"+
		"\u0187\u0005/\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185"+
		"\u0001\u0000\u0000\u0000\u0187\u018f\u0001\u0000\u0000\u0000\u0188\u018b"+
		"\u0005\u0006\u0000\u0000\u0189\u018c\u0003(\u0014\u0000\u018a\u018c\u0005"+
		"/\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000"+
		"\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u0188\u0001\u0000"+
		"\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000"+
		"\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000"+
		"\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0193\u0005\t\u0000"+
		"\u0000\u0193%\u0001\u0000\u0000\u0000\u0194\u0195\u0005&\u0000\u0000\u0195"+
		"\u0196\u0005\b\u0000\u0000\u0196\u0197\u0007\u0003\u0000\u0000\u0197\u01a7"+
		"\u0005\t\u0000\u0000\u0198\u0199\u0005&\u0000\u0000\u0199\u019a\u0005"+
		"\b\u0000\u0000\u019a\u019b\u0007\u0003\u0000\u0000\u019b\u019c\u0005\u0006"+
		"\u0000\u0000\u019c\u019d\u0007\u0003\u0000\u0000\u019d\u01a7\u0005\t\u0000"+
		"\u0000\u019e\u019f\u0005&\u0000\u0000\u019f\u01a0\u0005\b\u0000\u0000"+
		"\u01a0\u01a1\u0007\u0003\u0000\u0000\u01a1\u01a2\u0005\u0006\u0000\u0000"+
		"\u01a2\u01a3\u0007\u0003\u0000\u0000\u01a3\u01a4\u0005\u0006\u0000\u0000"+
		"\u01a4\u01a5\u0007\u0003\u0000\u0000\u01a5\u01a7\u0005\t\u0000\u0000\u01a6"+
		"\u0194\u0001\u0000\u0000\u0000\u01a6\u0198\u0001\u0000\u0000\u0000\u01a6"+
		"\u019e\u0001\u0000\u0000\u0000\u01a7\'\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0006\u0014\uffff\uffff\u0000\u01a9\u01bc\u00050\u0000\u0000\u01aa\u01bc"+
		"\u0005\u0001\u0000\u0000\u01ab\u01bc\u0005,\u0000\u0000\u01ac\u01bc\u0005"+
		"-\u0000\u0000\u01ad\u01bc\u0003\u001c\u000e\u0000\u01ae\u01bc\u0003,\u0016"+
		"\u0000\u01af\u01b0\u0005\b\u0000\u0000\u01b0\u01b1\u0003(\u0014\u0000"+
		"\u01b1\u01b2\u0005\t\u0000\u0000\u01b2\u01bc\u0001\u0000\u0000\u0000\u01b3"+
		"\u01bc\u00050\u0000\u0000\u01b4\u01bc\u0005,\u0000\u0000\u01b5\u01bc\u0005"+
		"-\u0000\u0000\u01b6\u01bc\u0003,\u0016\u0000\u01b7\u01b8\u0005\b\u0000"+
		"\u0000\u01b8\u01b9\u0003(\u0014\u0000\u01b9\u01ba\u0005\t\u0000\u0000"+
		"\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01a8\u0001\u0000\u0000\u0000"+
		"\u01bb\u01aa\u0001\u0000\u0000\u0000\u01bb\u01ab\u0001\u0000\u0000\u0000"+
		"\u01bb\u01ac\u0001\u0000\u0000\u0000\u01bb\u01ad\u0001\u0000\u0000\u0000"+
		"\u01bb\u01ae\u0001\u0000\u0000\u0000\u01bb\u01af\u0001\u0000\u0000\u0000"+
		"\u01bb\u01b3\u0001\u0000\u0000\u0000\u01bb\u01b4\u0001\u0000\u0000\u0000"+
		"\u01bb\u01b5\u0001\u0000\u0000\u0000\u01bb\u01b6\u0001\u0000\u0000\u0000"+
		"\u01bb\u01b7\u0001\u0000\u0000\u0000\u01bc\u01d4\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\n\f\u0000\u0000\u01be\u01bf\u0005\u000f\u0000\u0000\u01bf"+
		"\u01d3\u0003(\u0014\r\u01c0\u01c1\n\u000b\u0000\u0000\u01c1\u01c2\u0005"+
		"\u0010\u0000\u0000\u01c2\u01d3\u0003(\u0014\f\u01c3\u01c4\n\n\u0000\u0000"+
		"\u01c4\u01c5\u0005\u0011\u0000\u0000\u01c5\u01d3\u0003(\u0014\u000b\u01c6"+
		"\u01c7\n\t\u0000\u0000\u01c7\u01c8\u0005\u0012\u0000\u0000\u01c8\u01d3"+
		"\u0003(\u0014\n\u01c9\u01ca\n\b\u0000\u0000\u01ca\u01cb\u0005\u0013\u0000"+
		"\u0000\u01cb\u01d3\u0003(\u0014\t\u01cc\u01cd\n\u0007\u0000\u0000\u01cd"+
		"\u01ce\u0005\u0014\u0000\u0000\u01ce\u01d3\u0003(\u0014\b\u01cf\u01d0"+
		"\n\u0006\u0000\u0000\u01d0\u01d1\u0005\u0015\u0000\u0000\u01d1\u01d3\u0003"+
		"(\u0014\u0007\u01d2\u01bd\u0001\u0000\u0000\u0000\u01d2\u01c0\u0001\u0000"+
		"\u0000\u0000\u01d2\u01c3\u0001\u0000\u0000\u0000\u01d2\u01c6\u0001\u0000"+
		"\u0000\u0000\u01d2\u01c9\u0001\u0000\u0000\u0000\u01d2\u01cc\u0001\u0000"+
		"\u0000\u0000\u01d2\u01cf\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d5)\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0006\u0015\uffff\uffff\u0000\u01d8\u01fb\u00050\u0000"+
		"\u0000\u01d9\u01fb\u0005,\u0000\u0000\u01da\u01fb\u0005-\u0000\u0000\u01db"+
		"\u01fb\u0003,\u0016\u0000\u01dc\u01dd\u0005\u0004\u0000\u0000\u01dd\u01fb"+
		"\u0003*\u0015\n\u01de\u01df\u0005\b\u0000\u0000\u01df\u01e0\u0003(\u0014"+
		"\u0000\u01e0\u01e1\u0005\t\u0000\u0000\u01e1\u01fb\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0003(\u0014\u0000\u01e3\u01e4\u0005\u0016\u0000\u0000\u01e4"+
		"\u01e5\u0003(\u0014\u0000\u01e5\u01fb\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0003(\u0014\u0000\u01e7\u01e8\u0005\u0017\u0000\u0000\u01e8\u01e9\u0003"+
		"(\u0014\u0000\u01e9\u01fb\u0001\u0000\u0000\u0000\u01ea\u01eb\u0003(\u0014"+
		"\u0000\u01eb\u01ec\u0005\u0018\u0000\u0000\u01ec\u01ed\u0003(\u0014\u0000"+
		"\u01ed\u01fb\u0001\u0000\u0000\u0000\u01ee\u01ef\u0003(\u0014\u0000\u01ef"+
		"\u01f0\u0005\u0019\u0000\u0000\u01f0\u01f1\u0003(\u0014\u0000\u01f1\u01fb"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f3\u0003(\u0014\u0000\u01f3\u01f4\u0005"+
		"\u001a\u0000\u0000\u01f4\u01f5\u0003(\u0014\u0000\u01f5\u01fb\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0003(\u0014\u0000\u01f7\u01f8\u0005\u001b\u0000"+
		"\u0000\u01f8\u01f9\u0003(\u0014\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fa\u01d7\u0001\u0000\u0000\u0000\u01fa\u01d9\u0001\u0000\u0000\u0000"+
		"\u01fa\u01da\u0001\u0000\u0000\u0000\u01fa\u01db\u0001\u0000\u0000\u0000"+
		"\u01fa\u01dc\u0001\u0000\u0000\u0000\u01fa\u01de\u0001\u0000\u0000\u0000"+
		"\u01fa\u01e2\u0001\u0000\u0000\u0000\u01fa\u01e6\u0001\u0000\u0000\u0000"+
		"\u01fa\u01ea\u0001\u0000\u0000\u0000\u01fa\u01ee\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f2\u0001\u0000\u0000\u0000\u01fa\u01f6\u0001\u0000\u0000\u0000"+
		"\u01fb\u0204\u0001\u0000\u0000\u0000\u01fc\u01fd\n\b\u0000\u0000\u01fd"+
		"\u01fe\u0005\u0002\u0000\u0000\u01fe\u0203\u0003*\u0015\t\u01ff\u0200"+
		"\n\u0007\u0000\u0000\u0200\u0201\u0005\u0003\u0000\u0000\u0201\u0203\u0003"+
		"*\u0015\b\u0202\u01fc\u0001\u0000\u0000\u0000\u0202\u01ff\u0001\u0000"+
		"\u0000\u0000\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205+\u0001\u0000\u0000"+
		"\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u0208\u00050\u0000\u0000"+
		"\u0208\u0209\u0005\b\u0000\u0000\u0209\u020e\u0003(\u0014\u0000\u020a"+
		"\u020b\u0005\u0006\u0000\u0000\u020b\u020d\u0003(\u0014\u0000\u020c\u020a"+
		"\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0211"+
		"\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0212"+
		"\u0005\t\u0000\u0000\u0212-\u0001\u0000\u0000\u0000:18DLTV^`hpry\u0081"+
		"\u0083\u008d\u0096\u0098\u009d\u00a1\u00a6\u00ab\u00b0\u00b3\u00c2\u00ca"+
		"\u00d5\u00de\u00e6\u00e9\u00f1\u00fa\u0103\u0108\u0111\u011a\u011f\u0127"+
		"\u012a\u0134\u013f\u0142\u014d\u0151\u015c\u0160\u0167\u017e\u0186\u018b"+
		"\u018f\u01a6\u01bb\u01d2\u01d4\u01fa\u0202\u0204\u020e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}