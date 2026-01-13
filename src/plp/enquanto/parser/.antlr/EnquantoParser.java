// Generated from /workspaces/implementa-o-de-linguagens-anamariaegabriellefernandes/src/plp/enquanto/parser/Enquanto.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EnquantoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, BOOLEANO=40, INT=41, ID=42, TEXTO=43, PONTOVIRGULA=44, Comentario=45, 
		Espaco=46;
	public static final int
		RULE_programa = 0, RULE_seqComando = 1, RULE_comando = 2, RULE_expressao = 3, 
		RULE_booleano = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "seqComando", "comando", "expressao", "booleano"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':='", "'skip'", "'se'", "'entao'", "'senaose'", "'senao'", 
			"'enquanto'", "'faca'", "'escreva'", "'para'", "'de'", "'ate'", "'repita'", 
			"'vezes'", "'escolha'", "':'", "'_'", "'{'", "'}'", "'exiba'", "'leia'", 
			"'**'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'=='", "'<='", "'>='", 
			"'>'", "'<'", "'<>'", "'nao'", "'e'", "'ou'", "'xor'", null, null, null, 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "BOOLEANO", "INT", "ID", "TEXTO", "PONTOVIRGULA", 
			"Comentario", "Espaco"
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
	public String getGrammarFileName() { return "Enquanto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnquantoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			seqComando();
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
	public static class SeqComandoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(EnquantoParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(EnquantoParser.PONTOVIRGULA, i);
		}
		public SeqComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqComando; }
	}

	public final SeqComandoContext seqComando() throws RecognitionException {
		SeqComandoContext _localctx = new SeqComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seqComando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				comando();
				setState(13);
				match(PONTOVIRGULA);
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4398049217816L) != 0) );
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
	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ComandoContext {
		public List<TerminalNode> ID() { return getTokens(EnquantoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EnquantoParser.ID, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public AtribuicaoContext(ComandoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeContext extends ComandoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SeContext(ComandoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExibaContext extends ComandoContext {
		public TerminalNode TEXTO() { return getToken(EnquantoParser.TEXTO, 0); }
		public TerminalNode INT() { return getToken(EnquantoParser.INT, 0); }
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public ExibaContext(ComandoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ComandoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public EnquantoContext(ComandoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IteracaoContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public IteracaoContext(ComandoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ComandoContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public BlocoContext(ComandoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Iteracao2Context extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Iteracao2Context(ComandoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchcaseContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(EnquantoParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EnquantoParser.INT, i);
		}
		public SwitchcaseContext(ComandoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscrevaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public EscrevaContext(ComandoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComandoContext {
		public SkipContext(ComandoContext ctx) { copyFrom(ctx); }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		int _la;
		try {
			int _alt;
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(ID);
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(20);
					match(T__0);
					setState(21);
					match(ID);
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(27);
				match(T__1);
				setState(28);
				expressao(0);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(29);
					match(T__0);
					setState(30);
					expressao(0);
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__2:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new SeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(T__3);
				setState(38);
				booleano(0);
				setState(39);
				match(T__4);
				setState(40);
				comando();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(41);
					match(T__5);
					setState(42);
					booleano(0);
					setState(43);
					match(T__4);
					setState(44);
					comando();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(T__6);
				setState(52);
				comando();
				}
				break;
			case T__7:
				_localctx = new EnquantoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				match(T__7);
				setState(55);
				booleano(0);
				setState(56);
				match(T__8);
				setState(57);
				comando();
				}
				break;
			case T__9:
				_localctx = new EscrevaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				match(T__9);
				setState(60);
				expressao(0);
				}
				break;
			case T__10:
				_localctx = new IteracaoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				match(T__10);
				setState(62);
				match(ID);
				setState(63);
				match(T__11);
				setState(64);
				expressao(0);
				setState(65);
				match(T__12);
				setState(66);
				expressao(0);
				setState(67);
				match(T__8);
				setState(69); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(68);
						comando();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(71); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__13:
				_localctx = new Iteracao2Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				match(T__13);
				setState(74);
				expressao(0);
				setState(75);
				match(T__14);
				setState(77); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(76);
						comando();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(79); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__15:
				_localctx = new SwitchcaseContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				match(T__15);
				setState(82);
				match(ID);
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(83);
					match(INT);
					setState(84);
					match(T__16);
					setState(85);
					comando();
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(90);
				match(T__17);
				setState(91);
				match(T__16);
				setState(92);
				comando();
				}
				break;
			case T__18:
				_localctx = new BlocoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				match(T__18);
				setState(95);
				seqComando();
				setState(96);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new ExibaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(98);
				match(T__20);
				setState(99);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeiaContext extends ExpressaoContext {
		public LeiaContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InteiroContext extends ExpressaoContext {
		public TerminalNode INT() { return getToken(EnquantoParser.INT, 0); }
		public InteiroContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpBinContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpBinContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public IdContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParContext extends ExpressaoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpParContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new InteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				match(INT);
				}
				break;
			case T__21:
				{
				_localctx = new LeiaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(T__21);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(ID);
				}
				break;
			case T__27:
				{
				_localctx = new ExpParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(T__27);
				setState(107);
				expressao(0);
				setState(108);
				match(T__28);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(113);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(114);
						expressao(4);
						}
						break;
					case 2:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(115);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(116);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(117);
						expressao(3);
						}
						break;
					case 3:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(118);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(119);
						match(T__22);
						setState(120);
						expressao(0);
						}
						}
						break;
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class BooleanoContext extends ParserRuleContext {
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	 
		public BooleanoContext() { }
		public void copyFrom(BooleanoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ELogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public ELogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NaoLogicoContext extends BooleanoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public NaoLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpRelContext extends BooleanoContext {
		public TerminalNode BOOLEANO() { return getToken(EnquantoParser.BOOLEANO, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpRelContext(BooleanoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public XorContext(BooleanoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolParContext extends BooleanoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public BoolParContext(BooleanoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OuLogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public OuLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
	}

	public final BooleanoContext booleano() throws RecognitionException {
		return booleano(0);
	}

	private BooleanoContext booleano(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanoContext _localctx = new BooleanoContext(_ctx, _parentState);
		BooleanoContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_booleano, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(127);
				match(BOOLEANO);
				}
				break;
			case 2:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				expressao(0);
				setState(129);
				match(T__29);
				setState(130);
				expressao(0);
				}
				break;
			case 3:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				expressao(0);
				setState(133);
				match(T__30);
				setState(134);
				expressao(0);
				}
				break;
			case 4:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				expressao(0);
				setState(137);
				match(T__31);
				setState(138);
				expressao(0);
				}
				break;
			case 5:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				expressao(0);
				setState(141);
				match(T__32);
				setState(142);
				expressao(0);
				}
				break;
			case 6:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				expressao(0);
				setState(145);
				match(T__33);
				setState(146);
				expressao(0);
				}
				break;
			case 7:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				expressao(0);
				setState(149);
				match(T__34);
				setState(150);
				expressao(0);
				}
				break;
			case 8:
				{
				_localctx = new NaoLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(T__35);
				setState(153);
				booleano(5);
				}
				break;
			case 9:
				{
				_localctx = new BoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(T__27);
				setState(155);
				booleano(0);
				setState(156);
				match(T__28);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ELogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(160);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(161);
						match(T__36);
						setState(162);
						booleano(5);
						}
						break;
					case 2:
						{
						_localctx = new OuLogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						match(T__37);
						setState(165);
						booleano(4);
						}
						break;
					case 3:
						{
						_localctx = new XorContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						match(T__38);
						setState(168);
						booleano(3);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 4:
			return booleano_sempred((BooleanoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleano_sempred(BooleanoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u00af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0010"+
		"\b\u0001\u000b\u0001\f\u0001\u0011\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u0017\b\u0002\n\u0002\f\u0002\u001a\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002#\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002/\b"+
		"\u0002\n\u0002\f\u00022\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002F\b\u0002\u000b\u0002\f\u0002"+
		"G\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002N\b\u0002"+
		"\u000b\u0002\f\u0002O\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002W\b\u0002\u000b\u0002\f\u0002X\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002e\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003o\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003z\b\u0003\n\u0003\f\u0003}\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u009f\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00aa"+
		"\b\u0004\n\u0004\f\u0004\u00ad\t\u0004\u0001\u0004\u0000\u0002\u0006\b"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001\u0000)+\u0001\u0000"+
		"\u0018\u0019\u0001\u0000\u001a\u001b\u00ca\u0000\n\u0001\u0000\u0000\u0000"+
		"\u0002\u000f\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006"+
		"n\u0001\u0000\u0000\u0000\b\u009e\u0001\u0000\u0000\u0000\n\u000b\u0003"+
		"\u0002\u0001\u0000\u000b\u0001\u0001\u0000\u0000\u0000\f\r\u0003\u0004"+
		"\u0002\u0000\r\u000e\u0005,\u0000\u0000\u000e\u0010\u0001\u0000\u0000"+
		"\u0000\u000f\f\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000"+
		"\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000"+
		"\u0012\u0003\u0001\u0000\u0000\u0000\u0013\u0018\u0005*\u0000\u0000\u0014"+
		"\u0015\u0005\u0001\u0000\u0000\u0015\u0017\u0005*\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b"+
		"\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0005\u0002\u0000\u0000\u001c!\u0003\u0006\u0003\u0000\u001d\u001e\u0005"+
		"\u0001\u0000\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"e\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000$e\u0005\u0003\u0000\u0000%&\u0005\u0004\u0000\u0000&\'\u0003\b"+
		"\u0004\u0000\'(\u0005\u0005\u0000\u0000(0\u0003\u0004\u0002\u0000)*\u0005"+
		"\u0006\u0000\u0000*+\u0003\b\u0004\u0000+,\u0005\u0005\u0000\u0000,-\u0003"+
		"\u0004\u0002\u0000-/\u0001\u0000\u0000\u0000.)\u0001\u0000\u0000\u0000"+
		"/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0005\u0007"+
		"\u0000\u000045\u0003\u0004\u0002\u00005e\u0001\u0000\u0000\u000067\u0005"+
		"\b\u0000\u000078\u0003\b\u0004\u000089\u0005\t\u0000\u00009:\u0003\u0004"+
		"\u0002\u0000:e\u0001\u0000\u0000\u0000;<\u0005\n\u0000\u0000<e\u0003\u0006"+
		"\u0003\u0000=>\u0005\u000b\u0000\u0000>?\u0005*\u0000\u0000?@\u0005\f"+
		"\u0000\u0000@A\u0003\u0006\u0003\u0000AB\u0005\r\u0000\u0000BC\u0003\u0006"+
		"\u0003\u0000CE\u0005\t\u0000\u0000DF\u0003\u0004\u0002\u0000ED\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000He\u0001\u0000\u0000\u0000IJ\u0005\u000e\u0000\u0000"+
		"JK\u0003\u0006\u0003\u0000KM\u0005\u000f\u0000\u0000LN\u0003\u0004\u0002"+
		"\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000Pe\u0001\u0000\u0000\u0000QR\u0005"+
		"\u0010\u0000\u0000RV\u0005*\u0000\u0000ST\u0005)\u0000\u0000TU\u0005\u0011"+
		"\u0000\u0000UW\u0003\u0004\u0002\u0000VS\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z[\u0005\u0012\u0000\u0000[\\\u0005\u0011\u0000"+
		"\u0000\\]\u0003\u0004\u0002\u0000]e\u0001\u0000\u0000\u0000^_\u0005\u0013"+
		"\u0000\u0000_`\u0003\u0002\u0001\u0000`a\u0005\u0014\u0000\u0000ae\u0001"+
		"\u0000\u0000\u0000bc\u0005\u0015\u0000\u0000ce\u0007\u0000\u0000\u0000"+
		"d\u0013\u0001\u0000\u0000\u0000d$\u0001\u0000\u0000\u0000d%\u0001\u0000"+
		"\u0000\u0000d6\u0001\u0000\u0000\u0000d;\u0001\u0000\u0000\u0000d=\u0001"+
		"\u0000\u0000\u0000dI\u0001\u0000\u0000\u0000dQ\u0001\u0000\u0000\u0000"+
		"d^\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000e\u0005\u0001\u0000"+
		"\u0000\u0000fg\u0006\u0003\uffff\uffff\u0000go\u0005)\u0000\u0000ho\u0005"+
		"\u0016\u0000\u0000io\u0005*\u0000\u0000jk\u0005\u001c\u0000\u0000kl\u0003"+
		"\u0006\u0003\u0000lm\u0005\u001d\u0000\u0000mo\u0001\u0000\u0000\u0000"+
		"nf\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000ni\u0001\u0000\u0000"+
		"\u0000nj\u0001\u0000\u0000\u0000o{\u0001\u0000\u0000\u0000pq\n\u0003\u0000"+
		"\u0000qr\u0007\u0001\u0000\u0000rz\u0003\u0006\u0003\u0004st\n\u0002\u0000"+
		"\u0000tu\u0007\u0002\u0000\u0000uz\u0003\u0006\u0003\u0003vw\n\u0004\u0000"+
		"\u0000wx\u0005\u0017\u0000\u0000xz\u0003\u0006\u0003\u0000yp\u0001\u0000"+
		"\u0000\u0000ys\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000z}\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|\u0007\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0006"+
		"\u0004\uffff\uffff\u0000\u007f\u009f\u0005(\u0000\u0000\u0080\u0081\u0003"+
		"\u0006\u0003\u0000\u0081\u0082\u0005\u001e\u0000\u0000\u0082\u0083\u0003"+
		"\u0006\u0003\u0000\u0083\u009f\u0001\u0000\u0000\u0000\u0084\u0085\u0003"+
		"\u0006\u0003\u0000\u0085\u0086\u0005\u001f\u0000\u0000\u0086\u0087\u0003"+
		"\u0006\u0003\u0000\u0087\u009f\u0001\u0000\u0000\u0000\u0088\u0089\u0003"+
		"\u0006\u0003\u0000\u0089\u008a\u0005 \u0000\u0000\u008a\u008b\u0003\u0006"+
		"\u0003\u0000\u008b\u009f\u0001\u0000\u0000\u0000\u008c\u008d\u0003\u0006"+
		"\u0003\u0000\u008d\u008e\u0005!\u0000\u0000\u008e\u008f\u0003\u0006\u0003"+
		"\u0000\u008f\u009f\u0001\u0000\u0000\u0000\u0090\u0091\u0003\u0006\u0003"+
		"\u0000\u0091\u0092\u0005\"\u0000\u0000\u0092\u0093\u0003\u0006\u0003\u0000"+
		"\u0093\u009f\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u0006\u0003\u0000"+
		"\u0095\u0096\u0005#\u0000\u0000\u0096\u0097\u0003\u0006\u0003\u0000\u0097"+
		"\u009f\u0001\u0000\u0000\u0000\u0098\u0099\u0005$\u0000\u0000\u0099\u009f"+
		"\u0003\b\u0004\u0005\u009a\u009b\u0005\u001c\u0000\u0000\u009b\u009c\u0003"+
		"\b\u0004\u0000\u009c\u009d\u0005\u001d\u0000\u0000\u009d\u009f\u0001\u0000"+
		"\u0000\u0000\u009e~\u0001\u0000\u0000\u0000\u009e\u0080\u0001\u0000\u0000"+
		"\u0000\u009e\u0084\u0001\u0000\u0000\u0000\u009e\u0088\u0001\u0000\u0000"+
		"\u0000\u009e\u008c\u0001\u0000\u0000\u0000\u009e\u0090\u0001\u0000\u0000"+
		"\u0000\u009e\u0094\u0001\u0000\u0000\u0000\u009e\u0098\u0001\u0000\u0000"+
		"\u0000\u009e\u009a\u0001\u0000\u0000\u0000\u009f\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\n\u0004\u0000\u0000\u00a1\u00a2\u0005%\u0000\u0000"+
		"\u00a2\u00aa\u0003\b\u0004\u0005\u00a3\u00a4\n\u0003\u0000\u0000\u00a4"+
		"\u00a5\u0005&\u0000\u0000\u00a5\u00aa\u0003\b\u0004\u0004\u00a6\u00a7"+
		"\n\u0002\u0000\u0000\u00a7\u00a8\u0005\'\u0000\u0000\u00a8\u00aa\u0003"+
		"\b\u0004\u0003\u00a9\u00a0\u0001\u0000\u0000\u0000\u00a9\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\t\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u000e\u0011\u0018!0GOXdny{\u009e\u00a9\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}