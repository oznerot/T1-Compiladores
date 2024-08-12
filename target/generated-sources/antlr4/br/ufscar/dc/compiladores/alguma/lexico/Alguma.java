// Generated from br/ufscar/dc/compiladores/alguma/lexico/Alguma.g4 by ANTLR 4.12.0
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Alguma extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUMREAL=2, NUMINT=3, VARIAVEL=4, CADEIA=5, WS=6, OP_REL=7, 
		OP_ARIT=8, DELIM=9, ABREPAR=10, FECHAPAR=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUMREAL", "NUMINT", "VARIAVEL", "CADEIA", "WS", "OP_REL", 
			"OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUMREAL", "NUMINT", "VARIAVEL", "CADEIA", "WS", 
			"OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR"
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


	public Alguma(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

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
		"\u0004\u0000\u000b\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000b\b\u0000\u0001\u0001\u0004\u0001e\b\u0001"+
		"\u000b\u0001\f\u0001f\u0001\u0001\u0001\u0001\u0004\u0001k\b\u0001\u000b"+
		"\u0001\f\u0001l\u0003\u0001o\b\u0001\u0001\u0002\u0004\u0002r\b\u0002"+
		"\u000b\u0002\f\u0002s\u0001\u0003\u0001\u0003\u0005\u0003x\b\u0003\n\u0003"+
		"\f\u0003{\t\u0003\u0001\u0004\u0001\u0004\u0005\u0004\u007f\b\u0004\n"+
		"\u0004\f\u0004\u0082\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0093\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0001\u0000\u0005\u0001\u000009\u0002\u0000AZaz\u0003\u000009A"+
		"Zaz\u0003\u0000\t\n\r\r  \u0003\u0000*+--//\u00b4\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0001a\u0001\u0000\u0000\u0000\u0003d\u0001\u0000\u0000\u0000\u0005q"+
		"\u0001\u0000\u0000\u0000\u0007u\u0001\u0000\u0000\u0000\t|\u0001\u0000"+
		"\u0000\u0000\u000b\u0085\u0001\u0000\u0000\u0000\r\u0092\u0001\u0000\u0000"+
		"\u0000\u000f\u0094\u0001\u0000\u0000\u0000\u0011\u0096\u0001\u0000\u0000"+
		"\u0000\u0013\u0098\u0001\u0000\u0000\u0000\u0015\u009a\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0005D\u0000\u0000\u0018\u0019\u0005E\u0000\u0000\u0019"+
		"\u001a\u0005C\u0000\u0000\u001a\u001b\u0005L\u0000\u0000\u001b\u001c\u0005"+
		"A\u0000\u0000\u001c\u001d\u0005R\u0000\u0000\u001d\u001e\u0005A\u0000"+
		"\u0000\u001e\u001f\u0005C\u0000\u0000\u001f \u0005O\u0000\u0000 !\u0005"+
		"E\u0000\u0000!b\u0005S\u0000\u0000\"#\u0005A\u0000\u0000#$\u0005L\u0000"+
		"\u0000$%\u0005G\u0000\u0000%&\u0005O\u0000\u0000&\'\u0005R\u0000\u0000"+
		"\'(\u0005I\u0000\u0000()\u0005T\u0000\u0000)*\u0005M\u0000\u0000*b\u0005"+
		"O\u0000\u0000+,\u0005I\u0000\u0000,-\u0005N\u0000\u0000-b\u0005T\u0000"+
		"\u0000./\u0005R\u0000\u0000/0\u0005E\u0000\u000001\u0005A\u0000\u0000"+
		"1b\u0005L\u0000\u000023\u0005A\u0000\u000034\u0005T\u0000\u000045\u0005"+
		"R\u0000\u000056\u0005I\u0000\u000067\u0005B\u0000\u000078\u0005U\u0000"+
		"\u000089\u0005I\u0000\u00009b\u0005R\u0000\u0000:b\u0005A\u0000\u0000"+
		";<\u0005L\u0000\u0000<=\u0005E\u0000\u0000=b\u0005R\u0000\u0000>?\u0005"+
		"I\u0000\u0000?@\u0005M\u0000\u0000@A\u0005P\u0000\u0000AB\u0005R\u0000"+
		"\u0000BC\u0005I\u0000\u0000CD\u0005M\u0000\u0000DE\u0005I\u0000\u0000"+
		"Eb\u0005R\u0000\u0000FG\u0005S\u0000\u0000Gb\u0005E\u0000\u0000HI\u0005"+
		"E\u0000\u0000IJ\u0005N\u0000\u0000JK\u0005T\u0000\u0000KL\u0005A\u0000"+
		"\u0000Lb\u0005O\u0000\u0000MN\u0005E\u0000\u0000NO\u0005N\u0000\u0000"+
		"OP\u0005Q\u0000\u0000PQ\u0005U\u0000\u0000QR\u0005A\u0000\u0000RS\u0005"+
		"N\u0000\u0000ST\u0005T\u0000\u0000Tb\u0005O\u0000\u0000UV\u0005I\u0000"+
		"\u0000VW\u0005N\u0000\u0000WX\u0005I\u0000\u0000XY\u0005C\u0000\u0000"+
		"YZ\u0005I\u0000\u0000Zb\u0005O\u0000\u0000[\\\u0005F\u0000\u0000\\]\u0005"+
		"I\u0000\u0000]b\u0005M\u0000\u0000^b\u0005E\u0000\u0000_`\u0005O\u0000"+
		"\u0000`b\u0005U\u0000\u0000a\u0017\u0001\u0000\u0000\u0000a\"\u0001\u0000"+
		"\u0000\u0000a+\u0001\u0000\u0000\u0000a.\u0001\u0000\u0000\u0000a2\u0001"+
		"\u0000\u0000\u0000a:\u0001\u0000\u0000\u0000a;\u0001\u0000\u0000\u0000"+
		"a>\u0001\u0000\u0000\u0000aF\u0001\u0000\u0000\u0000aH\u0001\u0000\u0000"+
		"\u0000aM\u0001\u0000\u0000\u0000aU\u0001\u0000\u0000\u0000a[\u0001\u0000"+
		"\u0000\u0000a^\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000b\u0002"+
		"\u0001\u0000\u0000\u0000ce\u0007\u0000\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gn\u0001\u0000\u0000\u0000hj\u0005.\u0000\u0000ik\u0007\u0000"+
		"\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000"+
		"nh\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0004\u0001\u0000"+
		"\u0000\u0000pr\u0007\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"t\u0006\u0001\u0000\u0000\u0000uy\u0007\u0001\u0000\u0000vx\u0007\u0002"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\b\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|\u0080\u0005\"\u0000\u0000}\u007f\t\u0000\u0000"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\"\u0000\u0000\u0084\n\u0001\u0000\u0000\u0000\u0085\u0086\u0007"+
		"\u0003\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0006"+
		"\u0005\u0000\u0000\u0088\f\u0001\u0000\u0000\u0000\u0089\u0093\u0005>"+
		"\u0000\u0000\u008a\u008b\u0005>\u0000\u0000\u008b\u0093\u0005=\u0000\u0000"+
		"\u008c\u0093\u0005<\u0000\u0000\u008d\u008e\u0005<\u0000\u0000\u008e\u0093"+
		"\u0005=\u0000\u0000\u008f\u0090\u0005<\u0000\u0000\u0090\u0093\u0005>"+
		"\u0000\u0000\u0091\u0093\u0005=\u0000\u0000\u0092\u0089\u0001\u0000\u0000"+
		"\u0000\u0092\u008a\u0001\u0000\u0000\u0000\u0092\u008c\u0001\u0000\u0000"+
		"\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u000e\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0007\u0004\u0000\u0000\u0095\u0010\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005:\u0000\u0000\u0097\u0012\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005(\u0000\u0000\u0099\u0014\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005)\u0000\u0000\u009b\u0016\u0001\u0000\u0000\u0000\t\u0000"+
		"aflnsy\u0080\u0092\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}