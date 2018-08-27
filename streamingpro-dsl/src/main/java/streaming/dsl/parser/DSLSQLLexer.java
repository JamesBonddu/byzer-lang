// Generated from DSLSQL.g4 by ANTLR 4.7.1

package streaming.dsl.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DSLSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		STRING=39, BLOCK_STRING=40, IDENTIFIER=41, BACKQUOTED_IDENTIFIER=42, SIMPLE_COMMENT=43, 
		BRACKETED_EMPTY_COMMENT=44, BRACKETED_COMMENT=45, WS=46, UNRECOGNIZED=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "STRING", "BLOCK_STRING", 
		"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "DIGIT", "LETTER", "SIMPLE_COMMENT", 
		"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'load'", "'LOAD'", "'.'", "'options'", "'as'", "'save'", "'SAVE'", 
		"'partitionBy'", "'select'", "'SELECT'", "';'", "'insert'", "'INSERT'", 
		"'create'", "'CREATE'", "'drop'", "'DROP'", "'refresh'", "'REFRESH'", 
		"'set'", "'SET'", "'='", "'connect'", "'CONNECT'", "'where'", "'train'", 
		"'TRAIN'", "'register'", "'REGISTER'", "'unRegister'", "'UNREGISTER'", 
		"'include'", "'INCLUDE'", "'overwrite'", "'append'", "'errorIfExists'", 
		"'ignore'", "'and'", null, null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "STRING", "BLOCK_STRING", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", 
		"SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", 
		"UNRECOGNIZED"
	};
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


	public DSLSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DSLSQL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u01d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u016b\n(\f(\16(\u016e"+
		"\13(\3(\3(\3(\3(\3(\7(\u0175\n(\f(\16(\u0178\13(\3(\5(\u017b\n(\3)\3)"+
		"\3)\3)\3)\3)\7)\u0183\n)\f)\16)\u0186\13)\3)\3)\3)\3)\3*\3*\3*\6*\u018f"+
		"\n*\r*\16*\u0190\3+\3+\3+\3+\7+\u0197\n+\f+\16+\u019a\13+\3+\3+\3,\3,"+
		"\3-\3-\3.\3.\3.\3.\7.\u01a6\n.\f.\16.\u01a9\13.\3.\5.\u01ac\n.\3.\5.\u01af"+
		"\n.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\7\60\u01bf\n\60"+
		"\f\60\16\60\u01c2\13\60\3\60\3\60\3\60\3\60\3\60\3\61\6\61\u01ca\n\61"+
		"\r\61\16\61\u01cb\3\61\3\61\3\62\3\62\4\u0184\u01c0\2\63\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W\2Y\2[-]._/a\60c\61\3\2\n\4\2))^^\4\2$$^^\3\2--\3\2b"+
		"b\3\2\62;\4\2C\\c|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u01de\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5j\3"+
		"\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13y\3\2\2\2\r|\3\2\2\2\17\u0081\3\2\2\2\21"+
		"\u0086\3\2\2\2\23\u0092\3\2\2\2\25\u0099\3\2\2\2\27\u00a0\3\2\2\2\31\u00a2"+
		"\3\2\2\2\33\u00a9\3\2\2\2\35\u00b0\3\2\2\2\37\u00b7\3\2\2\2!\u00be\3\2"+
		"\2\2#\u00c3\3\2\2\2%\u00c8\3\2\2\2\'\u00d0\3\2\2\2)\u00d8\3\2\2\2+\u00dc"+
		"\3\2\2\2-\u00e0\3\2\2\2/\u00e2\3\2\2\2\61\u00ea\3\2\2\2\63\u00f2\3\2\2"+
		"\2\65\u00f8\3\2\2\2\67\u00fe\3\2\2\29\u0104\3\2\2\2;\u010d\3\2\2\2=\u0116"+
		"\3\2\2\2?\u0121\3\2\2\2A\u012c\3\2\2\2C\u0134\3\2\2\2E\u013c\3\2\2\2G"+
		"\u0146\3\2\2\2I\u014d\3\2\2\2K\u015b\3\2\2\2M\u0162\3\2\2\2O\u017a\3\2"+
		"\2\2Q\u017c\3\2\2\2S\u018e\3\2\2\2U\u0192\3\2\2\2W\u019d\3\2\2\2Y\u019f"+
		"\3\2\2\2[\u01a1\3\2\2\2]\u01b2\3\2\2\2_\u01b9\3\2\2\2a\u01c9\3\2\2\2c"+
		"\u01cf\3\2\2\2ef\7n\2\2fg\7q\2\2gh\7c\2\2hi\7f\2\2i\4\3\2\2\2jk\7N\2\2"+
		"kl\7Q\2\2lm\7C\2\2mn\7F\2\2n\6\3\2\2\2op\7\60\2\2p\b\3\2\2\2qr\7q\2\2"+
		"rs\7r\2\2st\7v\2\2tu\7k\2\2uv\7q\2\2vw\7p\2\2wx\7u\2\2x\n\3\2\2\2yz\7"+
		"c\2\2z{\7u\2\2{\f\3\2\2\2|}\7u\2\2}~\7c\2\2~\177\7x\2\2\177\u0080\7g\2"+
		"\2\u0080\16\3\2\2\2\u0081\u0082\7U\2\2\u0082\u0083\7C\2\2\u0083\u0084"+
		"\7X\2\2\u0084\u0085\7G\2\2\u0085\20\3\2\2\2\u0086\u0087\7r\2\2\u0087\u0088"+
		"\7c\2\2\u0088\u0089\7t\2\2\u0089\u008a\7v\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7v\2\2\u008c\u008d\7k\2\2\u008d\u008e\7q\2\2\u008e\u008f\7p\2\2"+
		"\u008f\u0090\7D\2\2\u0090\u0091\7{\2\2\u0091\22\3\2\2\2\u0092\u0093\7"+
		"u\2\2\u0093\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\u0097"+
		"\7e\2\2\u0097\u0098\7v\2\2\u0098\24\3\2\2\2\u0099\u009a\7U\2\2\u009a\u009b"+
		"\7G\2\2\u009b\u009c\7N\2\2\u009c\u009d\7G\2\2\u009d\u009e\7E\2\2\u009e"+
		"\u009f\7V\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7=\2\2\u00a1\30\3\2\2\2\u00a2"+
		"\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6\u00a7\7t\2\2\u00a7\u00a8\7v\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7"+
		"K\2\2\u00aa\u00ab\7P\2\2\u00ab\u00ac\7U\2\2\u00ac\u00ad\7G\2\2\u00ad\u00ae"+
		"\7T\2\2\u00ae\u00af\7V\2\2\u00af\34\3\2\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2"+
		"\7t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\36\3\2\2\2\u00b7\u00b8\7E\2\2\u00b8\u00b9\7T\2\2\u00b9"+
		"\u00ba\7G\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc\7V\2\2\u00bc\u00bd\7G\2\2"+
		"\u00bd \3\2\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7q\2"+
		"\2\u00c1\u00c2\7r\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7F\2\2\u00c4\u00c5\7"+
		"T\2\2\u00c5\u00c6\7Q\2\2\u00c6\u00c7\7R\2\2\u00c7$\3\2\2\2\u00c8\u00c9"+
		"\7t\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7j\2\2\u00cf&\3\2\2\2\u00d0"+
		"\u00d1\7T\2\2\u00d1\u00d2\7G\2\2\u00d2\u00d3\7H\2\2\u00d3\u00d4\7T\2\2"+
		"\u00d4\u00d5\7G\2\2\u00d5\u00d6\7U\2\2\u00d6\u00d7\7J\2\2\u00d7(\3\2\2"+
		"\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7v\2\2\u00db*\3\2"+
		"\2\2\u00dc\u00dd\7U\2\2\u00dd\u00de\7G\2\2\u00de\u00df\7V\2\2\u00df,\3"+
		"\2\2\2\u00e0\u00e1\7?\2\2\u00e1.\3\2\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4"+
		"\7q\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7e\2\2\u00e8\u00e9\7v\2\2\u00e9\60\3\2\2\2\u00ea\u00eb\7E\2\2\u00eb"+
		"\u00ec\7Q\2\2\u00ec\u00ed\7P\2\2\u00ed\u00ee\7P\2\2\u00ee\u00ef\7G\2\2"+
		"\u00ef\u00f0\7E\2\2\u00f0\u00f1\7V\2\2\u00f1\62\3\2\2\2\u00f2\u00f3\7"+
		"y\2\2\u00f3\u00f4\7j\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7"+
		"\7g\2\2\u00f7\64\3\2\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb"+
		"\7c\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd\66\3\2\2\2\u00fe\u00ff"+
		"\7V\2\2\u00ff\u0100\7T\2\2\u0100\u0101\7C\2\2\u0101\u0102\7K\2\2\u0102"+
		"\u0103\7P\2\2\u01038\3\2\2\2\u0104\u0105\7t\2\2\u0105\u0106\7g\2\2\u0106"+
		"\u0107\7i\2\2\u0107\u0108\7k\2\2\u0108\u0109\7u\2\2\u0109\u010a\7v\2\2"+
		"\u010a\u010b\7g\2\2\u010b\u010c\7t\2\2\u010c:\3\2\2\2\u010d\u010e\7T\2"+
		"\2\u010e\u010f\7G\2\2\u010f\u0110\7I\2\2\u0110\u0111\7K\2\2\u0111\u0112"+
		"\7U\2\2\u0112\u0113\7V\2\2\u0113\u0114\7G\2\2\u0114\u0115\7T\2\2\u0115"+
		"<\3\2\2\2\u0116\u0117\7w\2\2\u0117\u0118\7p\2\2\u0118\u0119\7T\2\2\u0119"+
		"\u011a\7g\2\2\u011a\u011b\7i\2\2\u011b\u011c\7k\2\2\u011c\u011d\7u\2\2"+
		"\u011d\u011e\7v\2\2\u011e\u011f\7g\2\2\u011f\u0120\7t\2\2\u0120>\3\2\2"+
		"\2\u0121\u0122\7W\2\2\u0122\u0123\7P\2\2\u0123\u0124\7T\2\2\u0124\u0125"+
		"\7G\2\2\u0125\u0126\7I\2\2\u0126\u0127\7K\2\2\u0127\u0128\7U\2\2\u0128"+
		"\u0129\7V\2\2\u0129\u012a\7G\2\2\u012a\u012b\7T\2\2\u012b@\3\2\2\2\u012c"+
		"\u012d\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f\7e\2\2\u012f\u0130\7n\2\2"+
		"\u0130\u0131\7w\2\2\u0131\u0132\7f\2\2\u0132\u0133\7g\2\2\u0133B\3\2\2"+
		"\2\u0134\u0135\7K\2\2\u0135\u0136\7P\2\2\u0136\u0137\7E\2\2\u0137\u0138"+
		"\7N\2\2\u0138\u0139\7W\2\2\u0139\u013a\7F\2\2\u013a\u013b\7G\2\2\u013b"+
		"D\3\2\2\2\u013c\u013d\7q\2\2\u013d\u013e\7x\2\2\u013e\u013f\7g\2\2\u013f"+
		"\u0140\7t\2\2\u0140\u0141\7y\2\2\u0141\u0142\7t\2\2\u0142\u0143\7k\2\2"+
		"\u0143\u0144\7v\2\2\u0144\u0145\7g\2\2\u0145F\3\2\2\2\u0146\u0147\7c\2"+
		"\2\u0147\u0148\7r\2\2\u0148\u0149\7r\2\2\u0149\u014a\7g\2\2\u014a\u014b"+
		"\7p\2\2\u014b\u014c\7f\2\2\u014cH\3\2\2\2\u014d\u014e\7g\2\2\u014e\u014f"+
		"\7t\2\2\u014f\u0150\7t\2\2\u0150\u0151\7q\2\2\u0151\u0152\7t\2\2\u0152"+
		"\u0153\7K\2\2\u0153\u0154\7h\2\2\u0154\u0155\7G\2\2\u0155\u0156\7z\2\2"+
		"\u0156\u0157\7k\2\2\u0157\u0158\7u\2\2\u0158\u0159\7v\2\2\u0159\u015a"+
		"\7u\2\2\u015aJ\3\2\2\2\u015b\u015c\7k\2\2\u015c\u015d\7i\2\2\u015d\u015e"+
		"\7p\2\2\u015e\u015f\7q\2\2\u015f\u0160\7t\2\2\u0160\u0161\7g\2\2\u0161"+
		"L\3\2\2\2\u0162\u0163\7c\2\2\u0163\u0164\7p\2\2\u0164\u0165\7f\2\2\u0165"+
		"N\3\2\2\2\u0166\u016c\7)\2\2\u0167\u016b\n\2\2\2\u0168\u0169\7^\2\2\u0169"+
		"\u016b\13\2\2\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016e\3"+
		"\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016f\u017b\7)\2\2\u0170\u0176\7$\2\2\u0171\u0175\n\3\2"+
		"\2\u0172\u0173\7^\2\2\u0173\u0175\13\2\2\2\u0174\u0171\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\7$\2\2\u017a\u0166\3\2"+
		"\2\2\u017a\u0170\3\2\2\2\u017bP\3\2\2\2\u017c\u017d\7)\2\2\u017d\u017e"+
		"\7)\2\2\u017e\u017f\7)\2\2\u017f\u0180\3\2\2\2\u0180\u0184\n\4\2\2\u0181"+
		"\u0183\13\2\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0185\3"+
		"\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u0188\7)\2\2\u0188\u0189\7)\2\2\u0189\u018a\7)\2\2\u018aR\3\2\2\2\u018b"+
		"\u018f\5Y-\2\u018c\u018f\5W,\2\u018d\u018f\7a\2\2\u018e\u018b\3\2\2\2"+
		"\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191T\3\2\2\2\u0192\u0198\7b\2\2\u0193\u0197"+
		"\n\5\2\2\u0194\u0195\7b\2\2\u0195\u0197\7b\2\2\u0196\u0193\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7b\2\2\u019c"+
		"V\3\2\2\2\u019d\u019e\t\6\2\2\u019eX\3\2\2\2\u019f\u01a0\t\7\2\2\u01a0"+
		"Z\3\2\2\2\u01a1\u01a2\7/\2\2\u01a2\u01a3\7/\2\2\u01a3\u01a7\3\2\2\2\u01a4"+
		"\u01a6\n\b\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2"+
		"\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ac\7\17\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3"+
		"\2\2\2\u01ad\u01af\7\f\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b1\b.\2\2\u01b1\\\3\2\2\2\u01b2\u01b3\7\61\2\2"+
		"\u01b3\u01b4\7,\2\2\u01b4\u01b5\7,\2\2\u01b5\u01b6\7\61\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01b8\b/\2\2\u01b8^\3\2\2\2\u01b9\u01ba\7\61\2\2\u01ba"+
		"\u01bb\7,\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c0\n\4\2\2\u01bd\u01bf\13\2"+
		"\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\7,"+
		"\2\2\u01c4\u01c5\7\61\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\b\60\2\2\u01c7"+
		"`\3\2\2\2\u01c8\u01ca\t\t\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2"+
		"\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce"+
		"\b\61\2\2\u01ceb\3\2\2\2\u01cf\u01d0\13\2\2\2\u01d0d\3\2\2\2\22\2\u016a"+
		"\u016c\u0174\u0176\u017a\u0184\u018e\u0190\u0196\u0198\u01a7\u01ab\u01ae"+
		"\u01c0\u01cb\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}