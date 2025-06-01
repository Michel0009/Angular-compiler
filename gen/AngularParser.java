// Generated from C:/Users/Michael/Desktop/Compiler/AngularParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMPONENT=1, CLASS=2, CONSTRUCTOR=3, SEMICOLON=4, COLON=5, BACKTICK=6, 
		FUNCTION=7, ASSIGN=8, NOT=9, EQUAL=10, NOT_EQUAL=11, EQUALS_OR_LESS_THAN=12, 
		EQAULS_OR_GREATER_THAN=13, STRICT_EQUALITY=14, STRICT_INEQUALITY=15, HASHTAG=16, 
		SQUARE_OPEN_BRACKET=17, SQUARE_CLOSE_BRACKET=18, NUMBER_VALUE=19, BOOLEAN_VALUE=20, 
		STRING_VALUE=21, COMMA=22, OPEN_PAREN=23, CLOSE_PAREN=24, OPEN_BRACE=25, 
		CLOSE_BRACE=26, LESS_THAN=27, GREATER_THAN=28, DOT=29, DOLLAR=30, AT=31, 
		REST_OPERATOR=32, INCREASE=33, DECREASE=34, NULL=35, ARRAY=36, LOG=37, 
		STRING=38, BOOLEAN=39, NUMBER=40, VOID=41, ANY=42, PLUS=43, MINUS=44, 
		PIPE_OPERATOR=45, LOGICAL_AND=46, LOGICAL_OR=47, DIVIDE=48, MODULUS=49, 
		MULTIPLY=50, POWER=51, MULTIPLICATION_ASSIGNMENT=52, DIVISION_ASSIGNMENT=53, 
		ADDITION_ASSIGNMENT=54, SUBTRACTION_ASSIGNMENT=55, QUESTION_MARK=56, NULLISH_COALESCING=57, 
		IMPORT=58, LET=59, EXPORT=60, FROM=61, FOR=62, WHILE=63, DO=64, IF=65, 
		ELSE=66, SWITCH=67, BREAK=68, CONTINUE=69, RETURN=70, CASE=71, CONSOLE=72, 
		CONST=73, IMPLEMENTS=74, EXTENDS=75, PUBLIC=76, PRIVATE=77, PROTECTED=78, 
		READ_ONLY=79, ARROW=80, VAR=81, AS=82, THIS=83, IMPORTS=84, STYLES=85, 
		OF=86, TRACK=87, DEFAULT=88, TRY=89, CATCH=90, FINALLY=91, IDENTIFIER=92, 
		HTML_COMMENT=93, LINE_COMMENT=94, BLOCK_COMMENT=95, SPACE=96;
	public static final int
		RULE_page = 0, RULE_imports = 1, RULE_component = 2, RULE_componentBody = 3, 
		RULE_componentImport = 4, RULE_componentStyles = 5, RULE_styleElements = 6, 
		RULE_styleElementsBody = 7, RULE_htmlBlock = 8, RULE_htmlElement = 9, 
		RULE_htmlElementProperties = 10, RULE_htmlElementContent = 11, RULE_tsxBlock = 12, 
		RULE_operation = 13, RULE_forStatement = 14, RULE_ifStatement = 15, RULE_class = 16, 
		RULE_classBody = 17, RULE_array = 18, RULE_arrayMethod = 19, RULE_arrayBody = 20, 
		RULE_object = 21, RULE_objectBody = 22, RULE_var = 23, RULE_stringVar = 24, 
		RULE_boolVar = 25, RULE_numVar = 26, RULE_anyVar = 27, RULE_function = 28, 
		RULE_parameter = 29, RULE_dataType = 30, RULE_bodyStatement = 31, RULE_forLoop = 32, 
		RULE_functionCall = 33, RULE_return = 34, RULE_ifCondition = 35, RULE_condition = 36, 
		RULE_multiOperation = 37, RULE_console = 38, RULE_modifiers = 39, RULE_constructor = 40, 
		RULE_constructorBody = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"page", "imports", "component", "componentBody", "componentImport", "componentStyles", 
			"styleElements", "styleElementsBody", "htmlBlock", "htmlElement", "htmlElementProperties", 
			"htmlElementContent", "tsxBlock", "operation", "forStatement", "ifStatement", 
			"class", "classBody", "array", "arrayMethod", "arrayBody", "object", 
			"objectBody", "var", "stringVar", "boolVar", "numVar", "anyVar", "function", 
			"parameter", "dataType", "bodyStatement", "forLoop", "functionCall", 
			"return", "ifCondition", "condition", "multiOperation", "console", "modifiers", 
			"constructor", "constructorBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Component'", "'class'", "'constructor'", "';'", "':'", "'`'", 
			"'function'", "'='", "'!'", "'=='", "'!='", "'<='", "'>='", "'==='", 
			"'!=='", "'#'", "'['", "']'", null, null, null, "','", "'('", "')'", 
			"'{'", "'}'", "'<'", "'>'", "'.'", "'$'", "'@'", "'...'", "'++'", "'--'", 
			"'null'", "'Array'", "'log'", "'string'", "'boolean'", "'number'", "'void'", 
			"'any'", "'+'", "'-'", "'|'", "'&&'", "'||'", "'/'", "'%'", "'*'", "'**'", 
			"'*='", "'/='", "'+='", "'-='", "'?'", "'??'", "'import'", "'let'", "'export'", 
			"'from'", "'for'", "'while'", "'do'", "'if'", "'else'", "'switch'", "'break'", 
			"'continue'", "'return'", "'case'", "'console'", "'const'", "'implements'", 
			"'extends'", "'public'", "'private'", "'protected'", "'readonly'", "'=>'", 
			"'var'", "'as'", "'this'", "'imports'", "'styles'", "'of'", "'track'", 
			"'default'", "'try'", "'catch'", "'finally'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMPONENT", "CLASS", "CONSTRUCTOR", "SEMICOLON", "COLON", "BACKTICK", 
			"FUNCTION", "ASSIGN", "NOT", "EQUAL", "NOT_EQUAL", "EQUALS_OR_LESS_THAN", 
			"EQAULS_OR_GREATER_THAN", "STRICT_EQUALITY", "STRICT_INEQUALITY", "HASHTAG", 
			"SQUARE_OPEN_BRACKET", "SQUARE_CLOSE_BRACKET", "NUMBER_VALUE", "BOOLEAN_VALUE", 
			"STRING_VALUE", "COMMA", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", 
			"LESS_THAN", "GREATER_THAN", "DOT", "DOLLAR", "AT", "REST_OPERATOR", 
			"INCREASE", "DECREASE", "NULL", "ARRAY", "LOG", "STRING", "BOOLEAN", 
			"NUMBER", "VOID", "ANY", "PLUS", "MINUS", "PIPE_OPERATOR", "LOGICAL_AND", 
			"LOGICAL_OR", "DIVIDE", "MODULUS", "MULTIPLY", "POWER", "MULTIPLICATION_ASSIGNMENT", 
			"DIVISION_ASSIGNMENT", "ADDITION_ASSIGNMENT", "SUBTRACTION_ASSIGNMENT", 
			"QUESTION_MARK", "NULLISH_COALESCING", "IMPORT", "LET", "EXPORT", "FROM", 
			"FOR", "WHILE", "DO", "IF", "ELSE", "SWITCH", "BREAK", "CONTINUE", "RETURN", 
			"CASE", "CONSOLE", "CONST", "IMPLEMENTS", "EXTENDS", "PUBLIC", "PRIVATE", 
			"PROTECTED", "READ_ONLY", "ARROW", "VAR", "AS", "THIS", "IMPORTS", "STYLES", 
			"OF", "TRACK", "DEFAULT", "TRY", "CATCH", "FINALLY", "IDENTIFIER", "HTML_COMMENT", 
			"LINE_COMMENT", "BLOCK_COMMENT", "SPACE"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				imports();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				component();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				class_();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXPORT );
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
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING_VALUE() { return getToken(AngularParser.STRING_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IMPORT);
			setState(100);
			match(OPEN_BRACE);
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==COMPONENT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(102);
				match(COMMA);
				setState(103);
				match(IDENTIFIER);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(CLOSE_BRACE);
			setState(110);
			match(FROM);
			setState(111);
			match(STRING_VALUE);
			setState(112);
			match(SEMICOLON);
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
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(AT);
			setState(115);
			match(COMPONENT);
			setState(116);
			match(OPEN_PAREN);
			setState(117);
			match(OPEN_BRACE);
			setState(118);
			componentBody();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(119);
				match(COMMA);
				}
			}

			setState(122);
			match(CLOSE_BRACE);
			setState(123);
			match(CLOSE_PAREN);
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
	public static class ComponentBodyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TerminalNode> STRING_VALUE() { return getTokens(AngularParser.STRING_VALUE); }
		public TerminalNode STRING_VALUE(int i) {
			return getToken(AngularParser.STRING_VALUE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public HtmlBlockContext htmlBlock() {
			return getRuleContext(HtmlBlockContext.class,0);
		}
		public ComponentStylesContext componentStyles() {
			return getRuleContext(ComponentStylesContext.class,0);
		}
		public ComponentImportContext componentImport() {
			return getRuleContext(ComponentImportContext.class,0);
		}
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			match(IDENTIFIER);
			setState(126);
			match(COLON);
			setState(127);
			match(STRING_VALUE);
			}
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					match(COMMA);
					setState(130);
					match(IDENTIFIER);
					setState(131);
					match(COLON);
					setState(132);
					match(STRING_VALUE);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(138);
				match(COMMA);
				setState(139);
				match(IDENTIFIER);
				setState(140);
				match(COLON);
				setState(141);
				match(BACKTICK);
				setState(142);
				htmlBlock();
				setState(143);
				match(BACKTICK);
				}
				break;
			}
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(147);
				match(COMMA);
				setState(148);
				componentStyles();
				}
				break;
			}
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(151);
				match(COMMA);
				setState(152);
				componentImport();
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
	public static class ComponentImportContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(AngularParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(AngularParser.SQUARE_CLOSE_BRACKET, 0); }
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ComponentImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentImportContext componentImport() throws RecognitionException {
		ComponentImportContext _localctx = new ComponentImportContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(IMPORTS);
			setState(156);
			match(COLON);
			setState(157);
			match(SQUARE_OPEN_BRACKET);
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==COMPONENT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(159);
				match(COMMA);
				setState(160);
				match(IDENTIFIER);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(SQUARE_CLOSE_BRACKET);
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
	public static class ComponentStylesContext extends ParserRuleContext {
		public TerminalNode STYLES() { return getToken(AngularParser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(AngularParser.SQUARE_OPEN_BRACKET, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(AngularParser.SQUARE_CLOSE_BRACKET, 0); }
		public List<StyleElementsContext> styleElements() {
			return getRuleContexts(StyleElementsContext.class);
		}
		public StyleElementsContext styleElements(int i) {
			return getRuleContext(StyleElementsContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ComponentStylesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentStyles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentStyles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentStylesContext componentStyles() throws RecognitionException {
		ComponentStylesContext _localctx = new ComponentStylesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentStyles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(STYLES);
			setState(169);
			match(COLON);
			setState(170);
			match(SQUARE_OPEN_BRACKET);
			setState(171);
			match(BACKTICK);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900443779072L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(172);
				styleElements();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(BACKTICK);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(179);
				match(COMMA);
				}
			}

			setState(182);
			match(SQUARE_CLOSE_BRACKET);
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
	public static class StyleElementsContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public TerminalNode MULTIPLY() { return getToken(AngularParser.MULTIPLY, 0); }
		public List<StyleElementsBodyContext> styleElementsBody() {
			return getRuleContexts(StyleElementsBodyContext.class);
		}
		public StyleElementsBodyContext styleElementsBody(int i) {
			return getRuleContext(StyleElementsBodyContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<TerminalNode> HASHTAG() { return getTokens(AngularParser.HASHTAG); }
		public TerminalNode HASHTAG(int i) {
			return getToken(AngularParser.HASHTAG, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public StyleElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleElementsContext styleElements() throws RecognitionException {
		StyleElementsContext _localctx = new StyleElementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_styleElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASHTAG:
			case DOT:
			case IDENTIFIER:
				{
				{
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASHTAG || _la==DOT) {
					{
					setState(184);
					_la = _input.LA(1);
					if ( !(_la==HASHTAG || _la==DOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(187);
				match(IDENTIFIER);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 541130752L) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(188);
						match(COMMA);
						}
					}

					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==HASHTAG || _la==DOT) {
						{
						setState(191);
						_la = _input.LA(1);
						if ( !(_la==HASHTAG || _la==DOT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(194);
					match(IDENTIFIER);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case MULTIPLY:
				{
				setState(200);
				match(MULTIPLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(203);
			match(OPEN_BRACE);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(204);
				styleElementsBody();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(CLOSE_BRACE);
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
	public static class StyleElementsBodyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode NUMBER_VALUE() { return getToken(AngularParser.NUMBER_VALUE, 0); }
		public TerminalNode MODULUS() { return getToken(AngularParser.MODULUS, 0); }
		public StyleElementsBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleElementsBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleElementsBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleElementsBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleElementsBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleElementsBodyContext styleElementsBody() throws RecognitionException {
		StyleElementsBodyContext _localctx = new StyleElementsBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_styleElementsBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(IDENTIFIER);
			setState(213);
			match(COLON);
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(214);
				match(IDENTIFIER);
				}
				break;
			case NUMBER_VALUE:
				{
				{
				setState(215);
				match(NUMBER_VALUE);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MODULUS || _la==IDENTIFIER) {
					{
					setState(216);
					_la = _input.LA(1);
					if ( !(_la==MODULUS || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
			match(SEMICOLON);
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
	public static class HtmlBlockContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBlockContext htmlBlock() throws RecognitionException {
		HtmlBlockContext _localctx = new HtmlBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				htmlElement();
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LESS_THAN );
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
	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(AngularParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(AngularParser.LESS_THAN, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(AngularParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(AngularParser.GREATER_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING_VALUE() { return getToken(AngularParser.STRING_VALUE, 0); }
		public List<HtmlElementPropertiesContext> htmlElementProperties() {
			return getRuleContexts(HtmlElementPropertiesContext.class);
		}
		public HtmlElementPropertiesContext htmlElementProperties(int i) {
			return getRuleContext(HtmlElementPropertiesContext.class,i);
		}
		public List<ForStatementContext> forStatement() {
			return getRuleContexts(ForStatementContext.class);
		}
		public ForStatementContext forStatement(int i) {
			return getRuleContext(ForStatementContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<HtmlElementContentContext> htmlElementContent() {
			return getRuleContexts(HtmlElementContentContext.class);
		}
		public HtmlElementContentContext htmlElementContent(int i) {
			return getRuleContext(HtmlElementContentContext.class,i);
		}
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(228);
				match(LESS_THAN);
				setState(229);
				match(IDENTIFIER);
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(230);
					_la = _input.LA(1);
					if ( !(_la==CLASS || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(231);
					match(ASSIGN);
					setState(232);
					match(STRING_VALUE);
					}
					break;
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SQUARE_OPEN_BRACKET || _la==OPEN_PAREN || _la==IDENTIFIER) {
					{
					{
					setState(235);
					htmlElementProperties();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(GREATER_THAN);
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(245);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(242);
							forStatement();
							}
							break;
						case 2:
							{
							setState(243);
							ifStatement();
							}
							break;
						case 3:
							{
							setState(244);
							htmlElementContent();
							}
							break;
						}
						} 
					}
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(250);
				match(LESS_THAN);
				setState(251);
				match(DIVIDE);
				setState(252);
				match(IDENTIFIER);
				setState(253);
				match(GREATER_THAN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(254);
				match(LESS_THAN);
				setState(255);
				match(IDENTIFIER);
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(256);
					_la = _input.LA(1);
					if ( !(_la==CLASS || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(257);
					match(ASSIGN);
					setState(258);
					match(STRING_VALUE);
					}
					break;
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SQUARE_OPEN_BRACKET || _la==OPEN_PAREN || _la==IDENTIFIER) {
					{
					{
					setState(261);
					htmlElementProperties();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				match(DIVIDE);
				setState(268);
				match(GREATER_THAN);
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
	public static class HtmlElementPropertiesContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING_VALUE() { return getToken(AngularParser.STRING_VALUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(AngularParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(AngularParser.SQUARE_CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public HtmlElementPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElementProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElementProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElementProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElementProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementPropertiesContext htmlElementProperties() throws RecognitionException {
		HtmlElementPropertiesContext _localctx = new HtmlElementPropertiesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlElementProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
			case IDENTIFIER:
				{
				{
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(271);
					match(OPEN_PAREN);
					}
				}

				setState(274);
				match(IDENTIFIER);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(275);
					match(CLOSE_PAREN);
					}
				}

				}
				}
				break;
			case SQUARE_OPEN_BRACKET:
				{
				{
				setState(278);
				match(SQUARE_OPEN_BRACKET);
				setState(279);
				match(IDENTIFIER);
				setState(280);
				match(SQUARE_CLOSE_BRACKET);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			match(ASSIGN);
			setState(284);
			match(STRING_VALUE);
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
	public static class HtmlElementContentContext extends ParserRuleContext {
		public TsxBlockContext tsxBlock() {
			return getRuleContext(TsxBlockContext.class,0);
		}
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public HtmlElementContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElementContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElementContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElementContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElementContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContentContext htmlElementContent() throws RecognitionException {
		HtmlElementContentContext _localctx = new HtmlElementContentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_htmlElementContent);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				tsxBlock();
				}
				break;
			case LESS_THAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				htmlElement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(IDENTIFIER);
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
	public static class TsxBlockContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_BRACE() { return getTokens(AngularParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(AngularParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(AngularParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(AngularParser.CLOSE_BRACE, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode NUMBER_VALUE() { return getToken(AngularParser.NUMBER_VALUE, 0); }
		public TsxBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsxBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsxBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsxBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsxBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsxBlockContext tsxBlock() throws RecognitionException {
		TsxBlockContext _localctx = new TsxBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tsxBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(OPEN_BRACE);
			setState(292);
			match(OPEN_BRACE);
			setState(293);
			match(IDENTIFIER);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(294);
				match(DOT);
				setState(295);
				match(IDENTIFIER);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1433763162619904L) != 0)) {
				{
				setState(301);
				operation();
				setState(302);
				match(NUMBER_VALUE);
				}
			}

			setState(306);
			match(CLOSE_BRACE);
			setState(307);
			match(CLOSE_BRACE);
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
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(AngularParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1433763162619904L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode OF() { return getToken(AngularParser.OF, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode TRACK() { return getToken(AngularParser.TRACK, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(AT);
			setState(312);
			match(FOR);
			setState(313);
			match(OPEN_PAREN);
			setState(314);
			match(IDENTIFIER);
			setState(315);
			match(OF);
			setState(316);
			match(IDENTIFIER);
			setState(317);
			match(SEMICOLON);
			setState(318);
			match(TRACK);
			setState(319);
			match(IDENTIFIER);
			setState(320);
			match(CLOSE_PAREN);
			setState(321);
			match(OPEN_BRACE);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESS_THAN) {
				{
				{
				setState(322);
				htmlElement();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(CLOSE_BRACE);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> LOGICAL_AND() { return getTokens(AngularParser.LOGICAL_AND); }
		public TerminalNode LOGICAL_AND(int i) {
			return getToken(AngularParser.LOGICAL_AND, i);
		}
		public List<TerminalNode> LOGICAL_OR() { return getTokens(AngularParser.LOGICAL_OR); }
		public TerminalNode LOGICAL_OR(int i) {
			return getToken(AngularParser.LOGICAL_OR, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(AT);
			setState(331);
			match(IF);
			setState(332);
			match(OPEN_PAREN);
			setState(333);
			condition();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND || _la==LOGICAL_OR) {
				{
				{
				setState(334);
				_la = _input.LA(1);
				if ( !(_la==LOGICAL_AND || _la==LOGICAL_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(335);
				condition();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(CLOSE_PAREN);
			setState(342);
			match(OPEN_BRACE);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESS_THAN) {
				{
				{
				setState(343);
				htmlElement();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			match(CLOSE_BRACE);
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(EXPORT);
			setState(352);
			match(CLASS);
			setState(353);
			match(IDENTIFIER);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS || _la==EXTENDS) {
				{
				setState(354);
				_la = _input.LA(1);
				if ( !(_la==IMPLEMENTS || _la==EXTENDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(355);
				match(IDENTIFIER);
				}
			}

			setState(358);
			match(OPEN_BRACE);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTRUCTOR || _la==LET || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 524665L) != 0)) {
				{
				{
				setState(359);
				classBody();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			match(CLOSE_BRACE);
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
	public static class ClassBodyContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case CONST:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case READ_ONLY:
			case VAR:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 15L) != 0)) {
					{
					setState(367);
					modifiers();
					}
				}

				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(370);
					array();
					}
					break;
				case 2:
					{
					setState(371);
					var();
					}
					break;
				case 3:
					{
					setState(372);
					function();
					}
					break;
				}
				}
				}
				break;
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				constructor();
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(AngularParser.SQUARE_OPEN_BRACKET, 0); }
		public ArrayBodyContext arrayBody() {
			return getRuleContext(ArrayBodyContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(AngularParser.SQUARE_CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayMethodContext arrayMethod() {
			return getRuleContext(ArrayMethodContext.class,0);
		}
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 4210689L) != 0)) {
				{
				setState(378);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 4210689L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(381);
			match(IDENTIFIER);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(382);
				match(COLON);
				setState(383);
				arrayMethod();
				}
			}

			setState(386);
			match(ASSIGN);
			setState(387);
			match(SQUARE_OPEN_BRACKET);
			setState(388);
			arrayBody();
			setState(389);
			match(SQUARE_CLOSE_BRACKET);
			setState(390);
			match(SEMICOLON);
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
	public static class ArrayMethodContext extends ParserRuleContext {
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(AngularParser.SQUARE_OPEN_BRACKET, 0); }
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(AngularParser.SQUARE_CLOSE_BRACKET, 0); }
		public TerminalNode ARRAY() { return getToken(AngularParser.ARRAY, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayMethodContext arrayMethod() throws RecognitionException {
		ArrayMethodContext _localctx = new ArrayMethodContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayMethod);
		int _la;
		try {
			int _alt;
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case BOOLEAN:
			case NUMBER:
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(392);
				dataType();
				setState(393);
				match(SQUARE_OPEN_BRACKET);
				setState(394);
				match(SQUARE_CLOSE_BRACKET);
				}
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(396);
				match(ARRAY);
				setState(397);
				match(LESS_THAN);
				setState(398);
				dataType();
				setState(399);
				match(GREATER_THAN);
				}
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(401);
				match(OPEN_BRACE);
				{
				setState(402);
				match(IDENTIFIER);
				setState(403);
				match(COLON);
				setState(404);
				dataType();
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(406);
						match(COMMA);
						setState(407);
						match(IDENTIFIER);
						setState(408);
						match(COLON);
						setState(409);
						dataType();
						}
						} 
					}
					setState(414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(415);
					match(COMMA);
					}
				}

				setState(418);
				match(CLOSE_BRACE);
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
	public static class ArrayBodyContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER_VALUE() { return getTokens(AngularParser.NUMBER_VALUE); }
		public TerminalNode NUMBER_VALUE(int i) {
			return getToken(AngularParser.NUMBER_VALUE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> STRING_VALUE() { return getTokens(AngularParser.STRING_VALUE); }
		public TerminalNode STRING_VALUE(int i) {
			return getToken(AngularParser.STRING_VALUE, i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<TerminalNode> BOOLEAN_VALUE() { return getTokens(AngularParser.BOOLEAN_VALUE); }
		public TerminalNode BOOLEAN_VALUE(int i) {
			return getToken(AngularParser.BOOLEAN_VALUE, i);
		}
		public ArrayBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayBodyContext arrayBody() throws RecognitionException {
		ArrayBodyContext _localctx = new ArrayBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayBody);
		int _la;
		try {
			int _alt;
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(422);
				match(NUMBER_VALUE);
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(423);
						match(COMMA);
						setState(424);
						match(NUMBER_VALUE);
						}
						} 
					}
					setState(429);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(430);
					match(COMMA);
					}
				}

				}
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(433);
				match(STRING_VALUE);
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(434);
						match(COMMA);
						setState(435);
						match(STRING_VALUE);
						}
						} 
					}
					setState(440);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(441);
					match(COMMA);
					}
				}

				}
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(444);
				object();
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(445);
						match(COMMA);
						setState(446);
						object();
						}
						} 
					}
					setState(451);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(452);
					match(COMMA);
					}
				}

				}
				}
				break;
			case BOOLEAN_VALUE:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(455);
				match(BOOLEAN_VALUE);
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(456);
						match(COMMA);
						setState(457);
						match(BOOLEAN_VALUE);
						}
						} 
					}
					setState(462);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(463);
					match(COMMA);
					}
				}

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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<ObjectBodyContext> objectBody() {
			return getRuleContexts(ObjectBodyContext.class);
		}
		public ObjectBodyContext objectBody(int i) {
			return getRuleContext(ObjectBodyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_object);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(OPEN_BRACE);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(469);
				objectBody();
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(470);
						match(COMMA);
						setState(471);
						objectBody();
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(477);
					match(COMMA);
					}
				}

				}
			}

			setState(482);
			match(CLOSE_BRACE);
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
	public static class ObjectBodyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING_VALUE() { return getToken(AngularParser.STRING_VALUE, 0); }
		public TerminalNode NUMBER_VALUE() { return getToken(AngularParser.NUMBER_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(AngularParser.BOOLEAN_VALUE, 0); }
		public TerminalNode SQUARE_OPEN_BRACKET() { return getToken(AngularParser.SQUARE_OPEN_BRACKET, 0); }
		public ArrayBodyContext arrayBody() {
			return getRuleContext(ArrayBodyContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE_BRACKET() { return getToken(AngularParser.SQUARE_CLOSE_BRACKET, 0); }
		public ObjectBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectBodyContext objectBody() throws RecognitionException {
		ObjectBodyContext _localctx = new ObjectBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_objectBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(IDENTIFIER);
			setState(485);
			match(COLON);
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_VALUE:
				{
				setState(486);
				match(STRING_VALUE);
				}
				break;
			case NUMBER_VALUE:
				{
				setState(487);
				match(NUMBER_VALUE);
				}
				break;
			case SQUARE_OPEN_BRACKET:
				{
				{
				setState(488);
				match(SQUARE_OPEN_BRACKET);
				setState(489);
				arrayBody();
				setState(490);
				match(SQUARE_CLOSE_BRACKET);
				}
				}
				break;
			case BOOLEAN_VALUE:
				{
				setState(492);
				match(BOOLEAN_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class VarContext extends ParserRuleContext {
		public StringVarContext stringVar() {
			return getRuleContext(StringVarContext.class,0);
		}
		public BoolVarContext boolVar() {
			return getRuleContext(BoolVarContext.class,0);
		}
		public NumVarContext numVar() {
			return getRuleContext(NumVarContext.class,0);
		}
		public AnyVarContext anyVar() {
			return getRuleContext(AnyVarContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_var);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				stringVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				boolVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				numVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				anyVar();
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
	public static class StringVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING_VALUE() { return getToken(AngularParser.STRING_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public StringVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringVarContext stringVar() throws RecognitionException {
		StringVarContext _localctx = new StringVarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stringVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 4210689L) != 0)) {
				{
				setState(501);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 4210689L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(504);
			match(IDENTIFIER);
			setState(505);
			match(COLON);
			setState(506);
			match(STRING);
			setState(507);
			match(ASSIGN);
			setState(508);
			match(STRING_VALUE);
			setState(509);
			match(SEMICOLON);
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
	public static class BoolVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(AngularParser.BOOLEAN_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public BoolVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBoolVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolVarContext boolVar() throws RecognitionException {
		BoolVarContext _localctx = new BoolVarContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_boolVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 4210689L) != 0)) {
				{
				setState(511);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 4210689L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(514);
			match(IDENTIFIER);
			setState(515);
			match(COLON);
			setState(516);
			match(BOOLEAN);
			setState(517);
			match(ASSIGN);
			setState(518);
			match(BOOLEAN_VALUE);
			setState(519);
			match(SEMICOLON);
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
	public static class NumVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode NUMBER_VALUE() { return getToken(AngularParser.NUMBER_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public NumVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumVarContext numVar() throws RecognitionException {
		NumVarContext _localctx = new NumVarContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_numVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 4210689L) != 0)) {
				{
				setState(521);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 4210689L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(524);
			match(IDENTIFIER);
			setState(525);
			match(COLON);
			setState(526);
			match(NUMBER);
			setState(527);
			match(ASSIGN);
			setState(528);
			match(NUMBER_VALUE);
			setState(529);
			match(SEMICOLON);
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
	public static class AnyVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode STRING_VALUE() { return getToken(AngularParser.STRING_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(AngularParser.BOOLEAN_VALUE, 0); }
		public TerminalNode NUMBER_VALUE() { return getToken(AngularParser.NUMBER_VALUE, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public AnyVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnyVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnyVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnyVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyVarContext anyVar() throws RecognitionException {
		AnyVarContext _localctx = new AnyVarContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_anyVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 4210689L) != 0)) {
				{
				setState(531);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 4210689L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(534);
			match(IDENTIFIER);
			setState(535);
			match(COLON);
			setState(536);
			match(ANY);
			setState(537);
			match(ASSIGN);
			setState(538);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34363408384L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(539);
			match(SEMICOLON);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<BodyStatementContext> bodyStatement() {
			return getRuleContexts(BodyStatementContext.class);
		}
		public BodyStatementContext bodyStatement(int i) {
			return getRuleContext(BodyStatementContext.class,i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(AngularParser.VOID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(IDENTIFIER);
			setState(542);
			match(OPEN_PAREN);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(543);
				parameter();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(544);
					match(COMMA);
					setState(545);
					parameter();
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(553);
			match(CLOSE_PAREN);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(554);
				match(COLON);
				setState(557);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case BOOLEAN:
				case NUMBER:
				case ANY:
					{
					setState(555);
					dataType();
					}
					break;
				case VOID:
					{
					setState(556);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(561);
			match(OPEN_BRACE);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 8610932809L) != 0)) {
				{
				{
				setState(562);
				bodyStatement();
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			match(CLOSE_BRACE);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(IDENTIFIER);
			setState(571);
			match(COLON);
			setState(572);
			dataType();
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
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6322191859712L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class BodyStatementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode NUMBER_VALUE() { return getToken(AngularParser.NUMBER_VALUE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(AngularParser.STRING_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(AngularParser.BOOLEAN_VALUE, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public ConsoleContext console() {
			return getRuleContext(ConsoleContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MultiOperationContext multiOperation() {
			return getRuleContext(MultiOperationContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public BodyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBodyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBodyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBodyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyStatementContext bodyStatement() throws RecognitionException {
		BodyStatementContext _localctx = new BodyStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bodyStatement);
		int _la;
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(576);
					match(THIS);
					setState(577);
					match(DOT);
					}
				}

				setState(580);
				match(IDENTIFIER);
				setState(581);
				match(ASSIGN);
				setState(582);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0) || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(583);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				var();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(587);
				ifCondition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(588);
				console();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(589);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(590);
				match(IDENTIFIER);
				setState(591);
				multiOperation();
				setState(592);
				match(SEMICOLON);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(594);
				return_();
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public List<TerminalNode> NUMBER_VALUE() { return getTokens(AngularParser.NUMBER_VALUE); }
		public TerminalNode NUMBER_VALUE(int i) {
			return getToken(AngularParser.NUMBER_VALUE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AngularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngularParser.SEMICOLON, i);
		}
		public MultiOperationContext multiOperation() {
			return getRuleContext(MultiOperationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(AngularParser.NOT_EQUAL, 0); }
		public TerminalNode EQUALS_OR_LESS_THAN() { return getToken(AngularParser.EQUALS_OR_LESS_THAN, 0); }
		public TerminalNode EQAULS_OR_GREATER_THAN() { return getToken(AngularParser.EQAULS_OR_GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public List<BodyStatementContext> bodyStatement() {
			return getRuleContexts(BodyStatementContext.class);
		}
		public BodyStatementContext bodyStatement(int i) {
			return getRuleContext(BodyStatementContext.class,i);
		}
		public TerminalNode CONTINUE() { return getToken(AngularParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(AngularParser.BREAK, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(FOR);
			setState(598);
			match(OPEN_PAREN);
			{
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET || _la==VAR) {
				{
				setState(599);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(602);
			match(IDENTIFIER);
			setState(603);
			match(ASSIGN);
			setState(604);
			match(NUMBER_VALUE);
			setState(605);
			match(SEMICOLON);
			setState(606);
			match(IDENTIFIER);
			setState(607);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 402668544L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(608);
			match(NUMBER_VALUE);
			setState(609);
			match(SEMICOLON);
			setState(610);
			match(IDENTIFIER);
			setState(611);
			multiOperation();
			}
			setState(613);
			match(CLOSE_PAREN);
			setState(614);
			match(OPEN_BRACE);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 8610932809L) != 0)) {
				{
				{
				setState(615);
				bodyStatement();
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK || _la==CONTINUE) {
				{
				setState(621);
				_la = _input.LA(1);
				if ( !(_la==BREAK || _la==CONTINUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(624);
			match(CLOSE_BRACE);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<TerminalNode> STRING_VALUE() { return getTokens(AngularParser.STRING_VALUE); }
		public TerminalNode STRING_VALUE(int i) {
			return getToken(AngularParser.STRING_VALUE, i);
		}
		public List<TerminalNode> NUMBER_VALUE() { return getTokens(AngularParser.NUMBER_VALUE); }
		public TerminalNode NUMBER_VALUE(int i) {
			return getToken(AngularParser.NUMBER_VALUE, i);
		}
		public List<TerminalNode> BOOLEAN_VALUE() { return getTokens(AngularParser.BOOLEAN_VALUE); }
		public TerminalNode BOOLEAN_VALUE(int i) {
			return getToken(AngularParser.BOOLEAN_VALUE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> THIS() { return getTokens(AngularParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(AngularParser.THIS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(IDENTIFIER);
			setState(627);
			match(OPEN_PAREN);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0) || _la==THIS || _la==IDENTIFIER) {
				{
				setState(636);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case THIS:
				case IDENTIFIER:
					{
					{
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THIS) {
						{
						setState(628);
						match(THIS);
						setState(629);
						match(DOT);
						}
					}

					setState(632);
					match(IDENTIFIER);
					}
					}
					break;
				case STRING_VALUE:
					{
					setState(633);
					match(STRING_VALUE);
					}
					break;
				case NUMBER_VALUE:
					{
					setState(634);
					match(NUMBER_VALUE);
					}
					break;
				case BOOLEAN_VALUE:
					{
					setState(635);
					match(BOOLEAN_VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) {
					{
					setState(647);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						setState(638);
						match(COMMA);
						{
						setState(641);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==THIS) {
							{
							setState(639);
							match(THIS);
							setState(640);
							match(DOT);
							}
						}

						setState(643);
						match(IDENTIFIER);
						}
						}
						break;
					case STRING_VALUE:
						{
						setState(644);
						match(STRING_VALUE);
						}
						break;
					case NUMBER_VALUE:
						{
						setState(645);
						match(NUMBER_VALUE);
						}
						break;
					case BOOLEAN_VALUE:
						{
						setState(646);
						match(BOOLEAN_VALUE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(651);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(654);
			match(CLOSE_PAREN);
			setState(655);
			match(SEMICOLON);
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
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode STRING_VALUE() { return getToken(AngularParser.STRING_VALUE, 0); }
		public TerminalNode NUMBER_VALUE() { return getToken(AngularParser.NUMBER_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(AngularParser.BOOLEAN_VALUE, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(RETURN);
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) {
				{
				setState(658);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(661);
			match(SEMICOLON);
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
	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public List<BodyStatementContext> bodyStatement() {
			return getRuleContexts(BodyStatementContext.class);
		}
		public BodyStatementContext bodyStatement(int i) {
			return getRuleContext(BodyStatementContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> LOGICAL_AND() { return getTokens(AngularParser.LOGICAL_AND); }
		public TerminalNode LOGICAL_AND(int i) {
			return getToken(AngularParser.LOGICAL_AND, i);
		}
		public List<TerminalNode> LOGICAL_OR() { return getTokens(AngularParser.LOGICAL_OR); }
		public TerminalNode LOGICAL_OR(int i) {
			return getToken(AngularParser.LOGICAL_OR, i);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifCondition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(IF);
			setState(664);
			match(OPEN_PAREN);
			setState(665);
			condition();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND || _la==LOGICAL_OR) {
				{
				{
				setState(666);
				_la = _input.LA(1);
				if ( !(_la==LOGICAL_AND || _la==LOGICAL_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(667);
				condition();
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673);
			match(CLOSE_PAREN);
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(674);
				match(OPEN_BRACE);
				}
			}

			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(677);
					bodyStatement();
					}
					} 
				}
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(683);
				match(CLOSE_BRACE);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(AngularParser.NOT_EQUAL, 0); }
		public TerminalNode EQUALS_OR_LESS_THAN() { return getToken(AngularParser.EQUALS_OR_LESS_THAN, 0); }
		public TerminalNode EQAULS_OR_GREATER_THAN() { return getToken(AngularParser.EQAULS_OR_GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode NUMBER_VALUE() { return getToken(AngularParser.NUMBER_VALUE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(AngularParser.STRING_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(AngularParser.BOOLEAN_VALUE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(686);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(687);
				functionCall();
				}
				break;
			}
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 402668544L) != 0)) {
				{
				setState(690);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 402668544L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(691);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0) || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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
	public static class MultiOperationContext extends ParserRuleContext {
		public TerminalNode INCREASE() { return getToken(AngularParser.INCREASE, 0); }
		public TerminalNode DECREASE() { return getToken(AngularParser.DECREASE, 0); }
		public TerminalNode MULTIPLICATION_ASSIGNMENT() { return getToken(AngularParser.MULTIPLICATION_ASSIGNMENT, 0); }
		public TerminalNode DIVISION_ASSIGNMENT() { return getToken(AngularParser.DIVISION_ASSIGNMENT, 0); }
		public TerminalNode ADDITION_ASSIGNMENT() { return getToken(AngularParser.ADDITION_ASSIGNMENT, 0); }
		public TerminalNode SUBTRACTION_ASSIGNMENT() { return getToken(AngularParser.SUBTRACTION_ASSIGNMENT, 0); }
		public TerminalNode NUMBER_VALUE() { return getToken(AngularParser.NUMBER_VALUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public MultiOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMultiOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMultiOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMultiOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiOperationContext multiOperation() throws RecognitionException {
		MultiOperationContext _localctx = new MultiOperationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_multiOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREASE:
			case DECREASE:
				{
				setState(694);
				_la = _input.LA(1);
				if ( !(_la==INCREASE || _la==DECREASE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MULTIPLICATION_ASSIGNMENT:
			case DIVISION_ASSIGNMENT:
			case ADDITION_ASSIGNMENT:
			case SUBTRACTION_ASSIGNMENT:
				{
				{
				setState(695);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67553994410557440L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(702);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER_VALUE:
					{
					setState(696);
					match(NUMBER_VALUE);
					}
					break;
				case THIS:
				case IDENTIFIER:
					{
					setState(699);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THIS) {
						{
						setState(697);
						match(THIS);
						setState(698);
						match(DOT);
						}
					}

					setState(701);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ConsoleContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(AngularParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(AngularParser.LOG, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<TerminalNode> STRING_VALUE() { return getTokens(AngularParser.STRING_VALUE); }
		public TerminalNode STRING_VALUE(int i) {
			return getToken(AngularParser.STRING_VALUE, i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(AngularParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(AngularParser.PLUS, i);
		}
		public ConsoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_console; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConsole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConsole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConsole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsoleContext console() throws RecognitionException {
		ConsoleContext _localctx = new ConsoleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_console);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(CONSOLE);
			setState(707);
			match(DOT);
			setState(708);
			match(LOG);
			setState(709);
			match(OPEN_PAREN);
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(710);
				match(STRING_VALUE);
				}
				break;
			case 2:
				{
				setState(711);
				functionCall();
				}
				break;
			case 3:
				{
				setState(712);
				match(IDENTIFIER);
				}
				break;
			}
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(715);
				match(PLUS);
				setState(719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(716);
					match(STRING_VALUE);
					}
					break;
				case 2:
					{
					setState(717);
					functionCall();
					}
					break;
				case 3:
					{
					setState(718);
					match(IDENTIFIER);
					}
					break;
				}
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
			match(CLOSE_PAREN);
			setState(727);
			match(SEMICOLON);
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
	public static class ModifiersContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(AngularParser.PROTECTED, 0); }
		public TerminalNode READ_ONLY() { return getToken(AngularParser.READ_ONLY, 0); }
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngularParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngularParser.CLOSE_BRACE, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<ConstructorBodyContext> constructorBody() {
			return getRuleContexts(ConstructorBodyContext.class);
		}
		public ConstructorBodyContext constructorBody(int i) {
			return getRuleContext(ConstructorBodyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(CONSTRUCTOR);
			setState(732);
			match(OPEN_PAREN);
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(733);
				parameter();
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(734);
					match(COMMA);
					setState(735);
					parameter();
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(743);
			match(CLOSE_PAREN);
			setState(744);
			match(OPEN_BRACE);
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 8610930761L) != 0)) {
				{
				{
				setState(745);
				constructorBody();
				}
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(751);
			match(CLOSE_BRACE);
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
	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode NUMBER_VALUE() { return getToken(AngularParser.NUMBER_VALUE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(AngularParser.STRING_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(AngularParser.BOOLEAN_VALUE, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public MultiOperationContext multiOperation() {
			return getRuleContext(MultiOperationContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public ConsoleContext console() {
			return getRuleContext(ConsoleContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_constructorBody);
		int _la;
		try {
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(753);
					match(THIS);
					setState(754);
					match(DOT);
					}
				}

				setState(757);
				match(IDENTIFIER);
				setState(758);
				match(ASSIGN);
				setState(763);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(759);
					functionCall();
					}
					break;
				case NUMBER_VALUE:
					{
					setState(760);
					match(NUMBER_VALUE);
					}
					break;
				case STRING_VALUE:
					{
					setState(761);
					match(STRING_VALUE);
					}
					break;
				case BOOLEAN_VALUE:
					{
					setState(762);
					match(BOOLEAN_VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(765);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(766);
					match(THIS);
					setState(767);
					match(DOT);
					}
				}

				setState(770);
				match(IDENTIFIER);
				setState(771);
				multiOperation();
				setState(772);
				match(SEMICOLON);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
				var();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(776);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(777);
				forLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(778);
				ifCondition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(779);
				console();
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

	public static final String _serializedATN =
		"\u0004\u0001`\u030f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0004\u0000V\b\u0000\u000b\u0000\f"+
		"\u0000W\u0001\u0000\u0004\u0000[\b\u0000\u000b\u0000\f\u0000\\\u0001\u0000"+
		"\u0004\u0000`\b\u0000\u000b\u0000\f\u0000a\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001i\b\u0001\n\u0001\f\u0001l\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002y\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0086\b\u0003\n\u0003\f\u0003\u0089\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0092\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0096\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009a\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a2"+
		"\b\u0004\n\u0004\f\u0004\u00a5\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00ae\b\u0005"+
		"\n\u0005\f\u0005\u00b1\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b5"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006\u00ba\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00be\b\u0006\u0001\u0006\u0003\u0006"+
		"\u00c1\b\u0006\u0001\u0006\u0005\u0006\u00c4\b\u0006\n\u0006\f\u0006\u00c7"+
		"\t\u0006\u0001\u0006\u0003\u0006\u00ca\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00ce\b\u0006\n\u0006\f\u0006\u00d1\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00da\b\u0007\u0003\u0007\u00dc\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0004\b\u00e1\b\b\u000b\b\f\b\u00e2\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00ea\b\t\u0001\t\u0005\t\u00ed\b\t\n\t\f\t\u00f0\t"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00f6\b\t\n\t\f\t\u00f9\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0104\b\t\u0001\t\u0005\t\u0107\b\t\n\t\f\t\u010a\t\t\u0001"+
		"\t\u0001\t\u0003\t\u010e\b\t\u0001\n\u0003\n\u0111\b\n\u0001\n\u0001\n"+
		"\u0003\n\u0115\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u011a\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0122\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0129\b\f\n\f\f\f\u012c"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0003\f\u0131\b\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0144\b\u000e\n\u000e\f\u000e\u0147\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0151\b\u000f\n\u000f\f\u000f\u0154"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0159\b\u000f"+
		"\n\u000f\f\u000f\u015c\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0165\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0169\b\u0010\n\u0010\f\u0010\u016c\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u0171\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0176\b\u0011\u0001\u0011\u0003\u0011"+
		"\u0179\b\u0011\u0001\u0012\u0003\u0012\u017c\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0181\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u019b\b\u0013\n"+
		"\u0013\f\u0013\u019e\t\u0013\u0001\u0013\u0003\u0013\u01a1\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u01a5\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u01aa\b\u0014\n\u0014\f\u0014\u01ad\t\u0014\u0001\u0014"+
		"\u0003\u0014\u01b0\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u01b5\b\u0014\n\u0014\f\u0014\u01b8\t\u0014\u0001\u0014\u0003\u0014\u01bb"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01c0\b\u0014"+
		"\n\u0014\f\u0014\u01c3\t\u0014\u0001\u0014\u0003\u0014\u01c6\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01cb\b\u0014\n\u0014\f\u0014"+
		"\u01ce\t\u0014\u0001\u0014\u0003\u0014\u01d1\b\u0014\u0003\u0014\u01d3"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01d9"+
		"\b\u0015\n\u0015\f\u0015\u01dc\t\u0015\u0001\u0015\u0003\u0015\u01df\b"+
		"\u0015\u0003\u0015\u01e1\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u01ee\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01f4\b\u0017\u0001\u0018\u0003\u0018\u01f7"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0003\u0019\u0201\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0003\u001a\u020b\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0003\u001b\u0215"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u0223\b\u001c\n\u001c\f\u001c\u0226\t\u001c\u0003\u001c"+
		"\u0228\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u022e\b\u001c\u0003\u001c\u0230\b\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u0234\b\u001c\n\u001c\f\u001c\u0237\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0243\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0254\b\u001f\u0001 \u0001 \u0001 \u0003 \u0259"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0005 \u0269\b \n \f \u026c\t \u0001 \u0003"+
		" \u026f\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u0277\b!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u027d\b!\u0001!\u0001!\u0001!\u0003!\u0282"+
		"\b!\u0001!\u0001!\u0001!\u0001!\u0005!\u0288\b!\n!\f!\u028b\t!\u0003!"+
		"\u028d\b!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u0294\b\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u029d\b#\n#\f#\u02a0"+
		"\t#\u0001#\u0001#\u0003#\u02a4\b#\u0001#\u0005#\u02a7\b#\n#\f#\u02aa\t"+
		"#\u0001#\u0003#\u02ad\b#\u0001$\u0001$\u0003$\u02b1\b$\u0001$\u0001$\u0003"+
		"$\u02b5\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u02bc\b%\u0001%\u0003"+
		"%\u02bf\b%\u0003%\u02c1\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u02ca\b&\u0001&\u0001&\u0001&\u0001&\u0003&\u02d0\b&\u0005&\u02d2"+
		"\b&\n&\f&\u02d5\t&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0005(\u02e1\b(\n(\f(\u02e4\t(\u0003(\u02e6\b(\u0001"+
		"(\u0001(\u0001(\u0005(\u02eb\b(\n(\f(\u02ee\t(\u0001(\u0001(\u0001)\u0001"+
		")\u0003)\u02f4\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u02fc"+
		"\b)\u0001)\u0001)\u0001)\u0003)\u0301\b)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u030d\b)\u0001)\u0000\u0000"+
		"*\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR\u0000\u0012\u0002\u0000\u0001"+
		"\u0001\\\\\u0002\u0000\u0010\u0010\u001d\u001d\u0002\u000011\\\\\u0002"+
		"\u0000\u0002\u0002\\\\\u0003\u0000+,0022\u0001\u0000./\u0001\u0000JK\u0003"+
		"\u0000;;IIQQ\u0002\u0000\u0013\u0015##\u0002\u0000&(**\u0002\u0000\u0013"+
		"\u0015\\\\\u0002\u0000;;QQ\u0002\u0000\n\r\u001b\u001c\u0001\u0000DE\u0001"+
		"\u0000\u0013\u0015\u0001\u0000!\"\u0001\u000047\u0001\u0000LO\u0368\u0000"+
		"U\u0001\u0000\u0000\u0000\u0002c\u0001\u0000\u0000\u0000\u0004r\u0001"+
		"\u0000\u0000\u0000\u0006}\u0001\u0000\u0000\u0000\b\u009b\u0001\u0000"+
		"\u0000\u0000\n\u00a8\u0001\u0000\u0000\u0000\f\u00c9\u0001\u0000\u0000"+
		"\u0000\u000e\u00d4\u0001\u0000\u0000\u0000\u0010\u00e0\u0001\u0000\u0000"+
		"\u0000\u0012\u010d\u0001\u0000\u0000\u0000\u0014\u0119\u0001\u0000\u0000"+
		"\u0000\u0016\u0121\u0001\u0000\u0000\u0000\u0018\u0123\u0001\u0000\u0000"+
		"\u0000\u001a\u0135\u0001\u0000\u0000\u0000\u001c\u0137\u0001\u0000\u0000"+
		"\u0000\u001e\u014a\u0001\u0000\u0000\u0000 \u015f\u0001\u0000\u0000\u0000"+
		"\"\u0178\u0001\u0000\u0000\u0000$\u017b\u0001\u0000\u0000\u0000&\u01a4"+
		"\u0001\u0000\u0000\u0000(\u01d2\u0001\u0000\u0000\u0000*\u01d4\u0001\u0000"+
		"\u0000\u0000,\u01e4\u0001\u0000\u0000\u0000.\u01f3\u0001\u0000\u0000\u0000"+
		"0\u01f6\u0001\u0000\u0000\u00002\u0200\u0001\u0000\u0000\u00004\u020a"+
		"\u0001\u0000\u0000\u00006\u0214\u0001\u0000\u0000\u00008\u021d\u0001\u0000"+
		"\u0000\u0000:\u023a\u0001\u0000\u0000\u0000<\u023e\u0001\u0000\u0000\u0000"+
		">\u0253\u0001\u0000\u0000\u0000@\u0255\u0001\u0000\u0000\u0000B\u0272"+
		"\u0001\u0000\u0000\u0000D\u0291\u0001\u0000\u0000\u0000F\u0297\u0001\u0000"+
		"\u0000\u0000H\u02b0\u0001\u0000\u0000\u0000J\u02c0\u0001\u0000\u0000\u0000"+
		"L\u02c2\u0001\u0000\u0000\u0000N\u02d9\u0001\u0000\u0000\u0000P\u02db"+
		"\u0001\u0000\u0000\u0000R\u030c\u0001\u0000\u0000\u0000TV\u0003\u0002"+
		"\u0001\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000"+
		"Y[\u0003\u0004\u0002\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000"+
		"\u0000\u0000^`\u0003 \u0010\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0001"+
		"\u0001\u0000\u0000\u0000cd\u0005:\u0000\u0000de\u0005\u0019\u0000\u0000"+
		"ej\u0007\u0000\u0000\u0000fg\u0005\u0016\u0000\u0000gi\u0005\\\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000mn\u0005\u001a\u0000\u0000no\u0005=\u0000\u0000op\u0005\u0015"+
		"\u0000\u0000pq\u0005\u0004\u0000\u0000q\u0003\u0001\u0000\u0000\u0000"+
		"rs\u0005\u001f\u0000\u0000st\u0005\u0001\u0000\u0000tu\u0005\u0017\u0000"+
		"\u0000uv\u0005\u0019\u0000\u0000vx\u0003\u0006\u0003\u0000wy\u0005\u0016"+
		"\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0005\u001a\u0000\u0000{|\u0005\u0018\u0000\u0000"+
		"|\u0005\u0001\u0000\u0000\u0000}~\u0005\\\u0000\u0000~\u007f\u0005\u0005"+
		"\u0000\u0000\u007f\u0080\u0005\u0015\u0000\u0000\u0080\u0087\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005\u0016\u0000\u0000\u0082\u0083\u0005\\\u0000"+
		"\u0000\u0083\u0084\u0005\u0005\u0000\u0000\u0084\u0086\u0005\u0015\u0000"+
		"\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0091\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\u0016\u0000\u0000\u008b\u008c\u0005\\\u0000\u0000"+
		"\u008c\u008d\u0005\u0005\u0000\u0000\u008d\u008e\u0005\u0006\u0000\u0000"+
		"\u008e\u008f\u0003\u0010\b\u0000\u008f\u0090\u0005\u0006\u0000\u0000\u0090"+
		"\u0092\u0001\u0000\u0000\u0000\u0091\u008a\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005\u0016\u0000\u0000\u0094\u0096\u0003\n\u0005\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0099"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0016\u0000\u0000\u0098\u009a"+
		"\u0003\b\u0004\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u0007\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"T\u0000\u0000\u009c\u009d\u0005\u0005\u0000\u0000\u009d\u009e\u0005\u0011"+
		"\u0000\u0000\u009e\u00a3\u0007\u0000\u0000\u0000\u009f\u00a0\u0005\u0016"+
		"\u0000\u0000\u00a0\u00a2\u0005\\\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0012\u0000"+
		"\u0000\u00a7\t\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005U\u0000\u0000"+
		"\u00a9\u00aa\u0005\u0005\u0000\u0000\u00aa\u00ab\u0005\u0011\u0000\u0000"+
		"\u00ab\u00af\u0005\u0006\u0000\u0000\u00ac\u00ae\u0003\f\u0006\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u0005\u0006\u0000\u0000\u00b3\u00b5\u0005\u0016\u0000\u0000\u00b4"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0012\u0000\u0000\u00b7"+
		"\u000b\u0001\u0000\u0000\u0000\u00b8\u00ba\u0007\u0001\u0000\u0000\u00b9"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u00c5\u0005\\\u0000\u0000\u00bc\u00be"+
		"\u0005\u0016\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00c1"+
		"\u0007\u0001\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0005\\\u0000\u0000\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00ca\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00ca\u00052\u0000\u0000\u00c9\u00b9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cf\u0005\u0019\u0000\u0000\u00cc\u00ce\u0003\u000e"+
		"\u0007\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0005\u001a\u0000\u0000\u00d3\r\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005\\\u0000\u0000\u00d5\u00db\u0005\u0005\u0000\u0000"+
		"\u00d6\u00dc\u0005\\\u0000\u0000\u00d7\u00d9\u0005\u0013\u0000\u0000\u00d8"+
		"\u00da\u0007\u0002\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db"+
		"\u00d6\u0001\u0000\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0004\u0000\u0000\u00de"+
		"\u000f\u0001\u0000\u0000\u0000\u00df\u00e1\u0003\u0012\t\u0000\u00e0\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u0011"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u001b\u0000\u0000\u00e5\u00e9"+
		"\u0005\\\u0000\u0000\u00e6\u00e7\u0007\u0003\u0000\u0000\u00e7\u00e8\u0005"+
		"\b\u0000\u0000\u00e8\u00ea\u0005\u0015\u0000\u0000\u00e9\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ee\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ed\u0003\u0014\n\u0000\u00ec\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f7\u0005\u001c\u0000"+
		"\u0000\u00f2\u00f6\u0003\u001c\u000e\u0000\u00f3\u00f6\u0003\u001e\u000f"+
		"\u0000\u00f4\u00f6\u0003\u0016\u000b\u0000\u00f5\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u001b\u0000"+
		"\u0000\u00fb\u00fc\u00050\u0000\u0000\u00fc\u00fd\u0005\\\u0000\u0000"+
		"\u00fd\u010e\u0005\u001c\u0000\u0000\u00fe\u00ff\u0005\u001b\u0000\u0000"+
		"\u00ff\u0103\u0005\\\u0000\u0000\u0100\u0101\u0007\u0003\u0000\u0000\u0101"+
		"\u0102\u0005\b\u0000\u0000\u0102\u0104\u0005\u0015\u0000\u0000\u0103\u0100"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0108"+
		"\u0001\u0000\u0000\u0000\u0105\u0107\u0003\u0014\n\u0000\u0106\u0105\u0001"+
		"\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"0\u0000\u0000\u010c\u010e\u0005\u001c\u0000\u0000\u010d\u00e4\u0001\u0000"+
		"\u0000\u0000\u010d\u00fe\u0001\u0000\u0000\u0000\u010e\u0013\u0001\u0000"+
		"\u0000\u0000\u010f\u0111\u0005\u0017\u0000\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0114\u0005\\\u0000\u0000\u0113\u0115\u0005\u0018\u0000"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u011a\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u0011\u0000"+
		"\u0000\u0117\u0118\u0005\\\u0000\u0000\u0118\u011a\u0005\u0012\u0000\u0000"+
		"\u0119\u0110\u0001\u0000\u0000\u0000\u0119\u0116\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0005\b\u0000\u0000\u011c"+
		"\u011d\u0005\u0015\u0000\u0000\u011d\u0015\u0001\u0000\u0000\u0000\u011e"+
		"\u0122\u0003\u0018\f\u0000\u011f\u0122\u0003\u0012\t\u0000\u0120\u0122"+
		"\u0005\\\u0000\u0000\u0121\u011e\u0001\u0000\u0000\u0000\u0121\u011f\u0001"+
		"\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0017\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0005\u0019\u0000\u0000\u0124\u0125\u0005"+
		"\u0019\u0000\u0000\u0125\u012a\u0005\\\u0000\u0000\u0126\u0127\u0005\u001d"+
		"\u0000\u0000\u0127\u0129\u0005\\\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u0130\u0001\u0000\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0003\u001a\r\u0000"+
		"\u012e\u012f\u0005\u0013\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000"+
		"\u0130\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u001a\u0000\u0000"+
		"\u0133\u0134\u0005\u001a\u0000\u0000\u0134\u0019\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0007\u0004\u0000\u0000\u0136\u001b\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0005\u001f\u0000\u0000\u0138\u0139\u0005>\u0000\u0000\u0139"+
		"\u013a\u0005\u0017\u0000\u0000\u013a\u013b\u0005\\\u0000\u0000\u013b\u013c"+
		"\u0005V\u0000\u0000\u013c\u013d\u0005\\\u0000\u0000\u013d\u013e\u0005"+
		"\u0004\u0000\u0000\u013e\u013f\u0005W\u0000\u0000\u013f\u0140\u0005\\"+
		"\u0000\u0000\u0140\u0141\u0005\u0018\u0000\u0000\u0141\u0145\u0005\u0019"+
		"\u0000\u0000\u0142\u0144\u0003\u0012\t\u0000\u0143\u0142\u0001\u0000\u0000"+
		"\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u0005\u001a\u0000"+
		"\u0000\u0149\u001d\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u001f\u0000"+
		"\u0000\u014b\u014c\u0005A\u0000\u0000\u014c\u014d\u0005\u0017\u0000\u0000"+
		"\u014d\u0152\u0003H$\u0000\u014e\u014f\u0007\u0005\u0000\u0000\u014f\u0151"+
		"\u0003H$\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0005\u0018\u0000\u0000\u0156\u015a\u0005\u0019"+
		"\u0000\u0000\u0157\u0159\u0003\u0012\t\u0000\u0158\u0157\u0001\u0000\u0000"+
		"\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u001a\u0000"+
		"\u0000\u015e\u001f\u0001\u0000\u0000\u0000\u015f\u0160\u0005<\u0000\u0000"+
		"\u0160\u0161\u0005\u0002\u0000\u0000\u0161\u0164\u0005\\\u0000\u0000\u0162"+
		"\u0163\u0007\u0006\u0000\u0000\u0163\u0165\u0005\\\u0000\u0000\u0164\u0162"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\u016a\u0005\u0019\u0000\u0000\u0167\u0169"+
		"\u0003\"\u0011\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016c\u0001"+
		"\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001"+
		"\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u016a\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0005\u001a\u0000\u0000\u016e!\u0001\u0000"+
		"\u0000\u0000\u016f\u0171\u0003N\'\u0000\u0170\u016f\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0175\u0001\u0000\u0000"+
		"\u0000\u0172\u0176\u0003$\u0012\u0000\u0173\u0176\u0003.\u0017\u0000\u0174"+
		"\u0176\u00038\u001c\u0000\u0175\u0172\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0179"+
		"\u0001\u0000\u0000\u0000\u0177\u0179\u0003P(\u0000\u0178\u0170\u0001\u0000"+
		"\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179#\u0001\u0000\u0000"+
		"\u0000\u017a\u017c\u0007\u0007\u0000\u0000\u017b\u017a\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u0180\u0005\\\u0000\u0000\u017e\u017f\u0005\u0005\u0000\u0000"+
		"\u017f\u0181\u0003&\u0013\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0005\b\u0000\u0000\u0183\u0184\u0005\u0011\u0000\u0000\u0184\u0185"+
		"\u0003(\u0014\u0000\u0185\u0186\u0005\u0012\u0000\u0000\u0186\u0187\u0005"+
		"\u0004\u0000\u0000\u0187%\u0001\u0000\u0000\u0000\u0188\u0189\u0003<\u001e"+
		"\u0000\u0189\u018a\u0005\u0011\u0000\u0000\u018a\u018b\u0005\u0012\u0000"+
		"\u0000\u018b\u01a5\u0001\u0000\u0000\u0000\u018c\u018d\u0005$\u0000\u0000"+
		"\u018d\u018e\u0005\u001b\u0000\u0000\u018e\u018f\u0003<\u001e\u0000\u018f"+
		"\u0190\u0005\u001c\u0000\u0000\u0190\u01a5\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0005\u0019\u0000\u0000\u0192\u0193\u0005\\\u0000\u0000\u0193\u0194"+
		"\u0005\u0005\u0000\u0000\u0194\u0195\u0003<\u001e\u0000\u0195\u019c\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0005\u0016\u0000\u0000\u0197\u0198\u0005"+
		"\\\u0000\u0000\u0198\u0199\u0005\u0005\u0000\u0000\u0199\u019b\u0003<"+
		"\u001e\u0000\u019a\u0196\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000"+
		"\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000"+
		"\u0000\u0000\u019f\u01a1\u0005\u0016\u0000\u0000\u01a0\u019f\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0005\u001a\u0000\u0000\u01a3\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a4\u0188\u0001\u0000\u0000\u0000\u01a4\u018c\u0001\u0000"+
		"\u0000\u0000\u01a4\u0191\u0001\u0000\u0000\u0000\u01a5\'\u0001\u0000\u0000"+
		"\u0000\u01a6\u01ab\u0005\u0013\u0000\u0000\u01a7\u01a8\u0005\u0016\u0000"+
		"\u0000\u01a8\u01aa\u0005\u0013\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01b0\u0005\u0016\u0000"+
		"\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b0\u01d3\u0001\u0000\u0000\u0000\u01b1\u01b6\u0005\u0015\u0000"+
		"\u0000\u01b2\u01b3\u0005\u0016\u0000\u0000\u01b3\u01b5\u0005\u0015\u0000"+
		"\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b9\u01bb\u0005\u0016\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01d3\u0001\u0000\u0000"+
		"\u0000\u01bc\u01c1\u0003*\u0015\u0000\u01bd\u01be\u0005\u0016\u0000\u0000"+
		"\u01be\u01c0\u0003*\u0015\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c6\u0005\u0016\u0000\u0000\u01c5"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6"+
		"\u01d3\u0001\u0000\u0000\u0000\u01c7\u01cc\u0005\u0014\u0000\u0000\u01c8"+
		"\u01c9\u0005\u0016\u0000\u0000\u01c9\u01cb\u0005\u0014\u0000\u0000\u01ca"+
		"\u01c8\u0001\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc"+
		"\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd"+
		"\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d1\u0005\u0016\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2"+
		"\u01a6\u0001\u0000\u0000\u0000\u01d2\u01b1\u0001\u0000\u0000\u0000\u01d2"+
		"\u01bc\u0001\u0000\u0000\u0000\u01d2\u01c7\u0001\u0000\u0000\u0000\u01d3"+
		")\u0001\u0000\u0000\u0000\u01d4\u01e0\u0005\u0019\u0000\u0000\u01d5\u01da"+
		"\u0003,\u0016\u0000\u01d6\u01d7\u0005\u0016\u0000\u0000\u01d7\u01d9\u0003"+
		",\u0016\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000"+
		"\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000"+
		"\u0000\u0000\u01dd\u01df\u0005\u0016\u0000\u0000\u01de\u01dd\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e0\u01d5\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\u001a"+
		"\u0000\u0000\u01e3+\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\\\u0000"+
		"\u0000\u01e5\u01ed\u0005\u0005\u0000\u0000\u01e6\u01ee\u0005\u0015\u0000"+
		"\u0000\u01e7\u01ee\u0005\u0013\u0000\u0000\u01e8\u01e9\u0005\u0011\u0000"+
		"\u0000\u01e9\u01ea\u0003(\u0014\u0000\u01ea\u01eb\u0005\u0012\u0000\u0000"+
		"\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ee\u0005\u0014\u0000\u0000"+
		"\u01ed\u01e6\u0001\u0000\u0000\u0000\u01ed\u01e7\u0001\u0000\u0000\u0000"+
		"\u01ed\u01e8\u0001\u0000\u0000\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ee-\u0001\u0000\u0000\u0000\u01ef\u01f4\u00030\u0018\u0000\u01f0\u01f4"+
		"\u00032\u0019\u0000\u01f1\u01f4\u00034\u001a\u0000\u01f2\u01f4\u00036"+
		"\u001b\u0000\u01f3\u01ef\u0001\u0000\u0000\u0000\u01f3\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f4/\u0001\u0000\u0000\u0000\u01f5\u01f7\u0007\u0007\u0000"+
		"\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005\\\u0000\u0000"+
		"\u01f9\u01fa\u0005\u0005\u0000\u0000\u01fa\u01fb\u0005&\u0000\u0000\u01fb"+
		"\u01fc\u0005\b\u0000\u0000\u01fc\u01fd\u0005\u0015\u0000\u0000\u01fd\u01fe"+
		"\u0005\u0004\u0000\u0000\u01fe1\u0001\u0000\u0000\u0000\u01ff\u0201\u0007"+
		"\u0007\u0000\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0200\u0201\u0001"+
		"\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0005"+
		"\\\u0000\u0000\u0203\u0204\u0005\u0005\u0000\u0000\u0204\u0205\u0005\'"+
		"\u0000\u0000\u0205\u0206\u0005\b\u0000\u0000\u0206\u0207\u0005\u0014\u0000"+
		"\u0000\u0207\u0208\u0005\u0004\u0000\u0000\u02083\u0001\u0000\u0000\u0000"+
		"\u0209\u020b\u0007\u0007\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000"+
		"\u020c\u020d\u0005\\\u0000\u0000\u020d\u020e\u0005\u0005\u0000\u0000\u020e"+
		"\u020f\u0005(\u0000\u0000\u020f\u0210\u0005\b\u0000\u0000\u0210\u0211"+
		"\u0005\u0013\u0000\u0000\u0211\u0212\u0005\u0004\u0000\u0000\u02125\u0001"+
		"\u0000\u0000\u0000\u0213\u0215\u0007\u0007\u0000\u0000\u0214\u0213\u0001"+
		"\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0005\\\u0000\u0000\u0217\u0218\u0005\u0005"+
		"\u0000\u0000\u0218\u0219\u0005*\u0000\u0000\u0219\u021a\u0005\b\u0000"+
		"\u0000\u021a\u021b\u0007\b\u0000\u0000\u021b\u021c\u0005\u0004\u0000\u0000"+
		"\u021c7\u0001\u0000\u0000\u0000\u021d\u021e\u0005\\\u0000\u0000\u021e"+
		"\u0227\u0005\u0017\u0000\u0000\u021f\u0224\u0003:\u001d\u0000\u0220\u0221"+
		"\u0005\u0016\u0000\u0000\u0221\u0223\u0003:\u001d\u0000\u0222\u0220\u0001"+
		"\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0222\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0228\u0001"+
		"\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0227\u021f\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0001"+
		"\u0000\u0000\u0000\u0229\u022f\u0005\u0018\u0000\u0000\u022a\u022d\u0005"+
		"\u0005\u0000\u0000\u022b\u022e\u0003<\u001e\u0000\u022c\u022e\u0005)\u0000"+
		"\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022d\u022c\u0001\u0000\u0000"+
		"\u0000\u022e\u0230\u0001\u0000\u0000\u0000\u022f\u022a\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000"+
		"\u0000\u0231\u0235\u0005\u0019\u0000\u0000\u0232\u0234\u0003>\u001f\u0000"+
		"\u0233\u0232\u0001\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000\u0000"+
		"\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000"+
		"\u0236\u0238\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0005\u001a\u0000\u0000\u02399\u0001\u0000\u0000\u0000\u023a"+
		"\u023b\u0005\\\u0000\u0000\u023b\u023c\u0005\u0005\u0000\u0000\u023c\u023d"+
		"\u0003<\u001e\u0000\u023d;\u0001\u0000\u0000\u0000\u023e\u023f\u0007\t"+
		"\u0000\u0000\u023f=\u0001\u0000\u0000\u0000\u0240\u0241\u0005S\u0000\u0000"+
		"\u0241\u0243\u0005\u001d\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000"+
		"\u0244\u0245\u0005\\\u0000\u0000\u0245\u0246\u0005\b\u0000\u0000\u0246"+
		"\u0247\u0007\n\u0000\u0000\u0247\u0254\u0005\u0004\u0000\u0000\u0248\u0254"+
		"\u0003$\u0012\u0000\u0249\u0254\u0003.\u0017\u0000\u024a\u0254\u0003@"+
		" \u0000\u024b\u0254\u0003F#\u0000\u024c\u0254\u0003L&\u0000\u024d\u0254"+
		"\u0003B!\u0000\u024e\u024f\u0005\\\u0000\u0000\u024f\u0250\u0003J%\u0000"+
		"\u0250\u0251\u0005\u0004\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000"+
		"\u0252\u0254\u0003D\"\u0000\u0253\u0242\u0001\u0000\u0000\u0000\u0253"+
		"\u0248\u0001\u0000\u0000\u0000\u0253\u0249\u0001\u0000\u0000\u0000\u0253"+
		"\u024a\u0001\u0000\u0000\u0000\u0253\u024b\u0001\u0000\u0000\u0000\u0253"+
		"\u024c\u0001\u0000\u0000\u0000\u0253\u024d\u0001\u0000\u0000\u0000\u0253"+
		"\u024e\u0001\u0000\u0000\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0254"+
		"?\u0001\u0000\u0000\u0000\u0255\u0256\u0005>\u0000\u0000\u0256\u0258\u0005"+
		"\u0017\u0000\u0000\u0257\u0259\u0007\u000b\u0000\u0000\u0258\u0257\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0001"+
		"\u0000\u0000\u0000\u025a\u025b\u0005\\\u0000\u0000\u025b\u025c\u0005\b"+
		"\u0000\u0000\u025c\u025d\u0005\u0013\u0000\u0000\u025d\u025e\u0005\u0004"+
		"\u0000\u0000\u025e\u025f\u0005\\\u0000\u0000\u025f\u0260\u0007\f\u0000"+
		"\u0000\u0260\u0261\u0005\u0013\u0000\u0000\u0261\u0262\u0005\u0004\u0000"+
		"\u0000\u0262\u0263\u0005\\\u0000\u0000\u0263\u0264\u0003J%\u0000\u0264"+
		"\u0265\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u0018\u0000\u0000\u0266"+
		"\u026a\u0005\u0019\u0000\u0000\u0267\u0269\u0003>\u001f\u0000\u0268\u0267"+
		"\u0001\u0000\u0000\u0000\u0269\u026c\u0001\u0000\u0000\u0000\u026a\u0268"+
		"\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026e"+
		"\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026d\u026f"+
		"\u0007\r\u0000\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001"+
		"\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0005"+
		"\u001a\u0000\u0000\u0271A\u0001\u0000\u0000\u0000\u0272\u0273\u0005\\"+
		"\u0000\u0000\u0273\u028c\u0005\u0017\u0000\u0000\u0274\u0275\u0005S\u0000"+
		"\u0000\u0275\u0277\u0005\u001d\u0000\u0000\u0276\u0274\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000"+
		"\u0000\u0278\u027d\u0005\\\u0000\u0000\u0279\u027d\u0005\u0015\u0000\u0000"+
		"\u027a\u027d\u0005\u0013\u0000\u0000\u027b\u027d\u0005\u0014\u0000\u0000"+
		"\u027c\u0276\u0001\u0000\u0000\u0000\u027c\u0279\u0001\u0000\u0000\u0000"+
		"\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000"+
		"\u027d\u0289\u0001\u0000\u0000\u0000\u027e\u0281\u0005\u0016\u0000\u0000"+
		"\u027f\u0280\u0005S\u0000\u0000\u0280\u0282\u0005\u001d\u0000\u0000\u0281"+
		"\u027f\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282"+
		"\u0283\u0001\u0000\u0000\u0000\u0283\u0288\u0005\\\u0000\u0000\u0284\u0288"+
		"\u0005\u0015\u0000\u0000\u0285\u0288\u0005\u0013\u0000\u0000\u0286\u0288"+
		"\u0005\u0014\u0000\u0000\u0287\u027e\u0001\u0000\u0000\u0000\u0287\u0284"+
		"\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0286"+
		"\u0001\u0000\u0000\u0000\u0288\u028b\u0001\u0000\u0000\u0000\u0289\u0287"+
		"\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028d"+
		"\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028c\u027c"+
		"\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028e"+
		"\u0001\u0000\u0000\u0000\u028e\u028f\u0005\u0018\u0000\u0000\u028f\u0290"+
		"\u0005\u0004\u0000\u0000\u0290C\u0001\u0000\u0000\u0000\u0291\u0293\u0005"+
		"F\u0000\u0000\u0292\u0294\u0007\u000e\u0000\u0000\u0293\u0292\u0001\u0000"+
		"\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000"+
		"\u0000\u0000\u0295\u0296\u0005\u0004\u0000\u0000\u0296E\u0001\u0000\u0000"+
		"\u0000\u0297\u0298\u0005A\u0000\u0000\u0298\u0299\u0005\u0017\u0000\u0000"+
		"\u0299\u029e\u0003H$\u0000\u029a\u029b\u0007\u0005\u0000\u0000\u029b\u029d"+
		"\u0003H$\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029d\u02a0\u0001\u0000"+
		"\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000"+
		"\u0000\u0000\u029f\u02a1\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a3\u0005\u0018\u0000\u0000\u02a2\u02a4\u0005\u0019"+
		"\u0000\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a8\u0001\u0000\u0000\u0000\u02a5\u02a7\u0003>\u001f"+
		"\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000"+
		"\u0000\u02a9\u02ac\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000"+
		"\u0000\u02ab\u02ad\u0005\u001a\u0000\u0000\u02ac\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02adG\u0001\u0000\u0000\u0000"+
		"\u02ae\u02b1\u0005\\\u0000\u0000\u02af\u02b1\u0003B!\u0000\u02b0\u02ae"+
		"\u0001\u0000\u0000\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b1\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b3\u0007\f\u0000\u0000\u02b3\u02b5\u0007"+
		"\n\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b5I\u0001\u0000\u0000\u0000\u02b6\u02c1\u0007\u000f\u0000"+
		"\u0000\u02b7\u02be\u0007\u0010\u0000\u0000\u02b8\u02bf\u0005\u0013\u0000"+
		"\u0000\u02b9\u02ba\u0005S\u0000\u0000\u02ba\u02bc\u0005\u001d\u0000\u0000"+
		"\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000"+
		"\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02bf\u0005\\\u0000\u0000\u02be"+
		"\u02b8\u0001\u0000\u0000\u0000\u02be\u02bb\u0001\u0000\u0000\u0000\u02bf"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c0\u02b6\u0001\u0000\u0000\u0000\u02c0"+
		"\u02b7\u0001\u0000\u0000\u0000\u02c1K\u0001\u0000\u0000\u0000\u02c2\u02c3"+
		"\u0005H\u0000\u0000\u02c3\u02c4\u0005\u001d\u0000\u0000\u02c4\u02c5\u0005"+
		"%\u0000\u0000\u02c5\u02c9\u0005\u0017\u0000\u0000\u02c6\u02ca\u0005\u0015"+
		"\u0000\u0000\u02c7\u02ca\u0003B!\u0000\u02c8\u02ca\u0005\\\u0000\u0000"+
		"\u02c9\u02c6\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c9\u02c8\u0001\u0000\u0000\u0000\u02ca\u02d3\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cf\u0005+\u0000\u0000\u02cc\u02d0\u0005\u0015\u0000\u0000\u02cd"+
		"\u02d0\u0003B!\u0000\u02ce\u02d0\u0005\\\u0000\u0000\u02cf\u02cc\u0001"+
		"\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02cf\u02ce\u0001"+
		"\u0000\u0000\u0000\u02d0\u02d2\u0001\u0000\u0000\u0000\u02d1\u02cb\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d5\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005"+
		"\u0018\u0000\u0000\u02d7\u02d8\u0005\u0004\u0000\u0000\u02d8M\u0001\u0000"+
		"\u0000\u0000\u02d9\u02da\u0007\u0011\u0000\u0000\u02daO\u0001\u0000\u0000"+
		"\u0000\u02db\u02dc\u0005\u0003\u0000\u0000\u02dc\u02e5\u0005\u0017\u0000"+
		"\u0000\u02dd\u02e2\u0003:\u001d\u0000\u02de\u02df\u0005\u0016\u0000\u0000"+
		"\u02df\u02e1\u0003:\u001d\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e6\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e5\u02dd\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e8\u0005\u0018\u0000\u0000\u02e8\u02ec\u0005\u0019\u0000\u0000\u02e9"+
		"\u02eb\u0003R)\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ee\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ef\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f0\u0005\u001a\u0000\u0000\u02f0Q\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f2\u0005S\u0000\u0000\u02f2\u02f4\u0005\u001d\u0000"+
		"\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005\\\u0000\u0000"+
		"\u02f6\u02fb\u0005\b\u0000\u0000\u02f7\u02fc\u0003B!\u0000\u02f8\u02fc"+
		"\u0005\u0013\u0000\u0000\u02f9\u02fc\u0005\u0015\u0000\u0000\u02fa\u02fc"+
		"\u0005\u0014\u0000\u0000\u02fb\u02f7\u0001\u0000\u0000\u0000\u02fb\u02f8"+
		"\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb\u02fa"+
		"\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u030d"+
		"\u0005\u0004\u0000\u0000\u02fe\u02ff\u0005S\u0000\u0000\u02ff\u0301\u0005"+
		"\u001d\u0000\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0300\u0301\u0001"+
		"\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0303\u0005"+
		"\\\u0000\u0000\u0303\u0304\u0003J%\u0000\u0304\u0305\u0005\u0004\u0000"+
		"\u0000\u0305\u030d\u0001\u0000\u0000\u0000\u0306\u030d\u0003$\u0012\u0000"+
		"\u0307\u030d\u0003.\u0017\u0000\u0308\u030d\u0003B!\u0000\u0309\u030d"+
		"\u0003@ \u0000\u030a\u030d\u0003F#\u0000\u030b\u030d\u0003L&\u0000\u030c"+
		"\u02f3\u0001\u0000\u0000\u0000\u030c\u0300\u0001\u0000\u0000\u0000\u030c"+
		"\u0306\u0001\u0000\u0000\u0000\u030c\u0307\u0001\u0000\u0000\u0000\u030c"+
		"\u0308\u0001\u0000\u0000\u0000\u030c\u0309\u0001\u0000\u0000\u0000\u030c"+
		"\u030a\u0001\u0000\u0000\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030d"+
		"S\u0001\u0000\u0000\u0000eW\\ajx\u0087\u0091\u0095\u0099\u00a3\u00af\u00b4"+
		"\u00b9\u00bd\u00c0\u00c5\u00c9\u00cf\u00d9\u00db\u00e2\u00e9\u00ee\u00f5"+
		"\u00f7\u0103\u0108\u010d\u0110\u0114\u0119\u0121\u012a\u0130\u0145\u0152"+
		"\u015a\u0164\u016a\u0170\u0175\u0178\u017b\u0180\u019c\u01a0\u01a4\u01ab"+
		"\u01af\u01b6\u01ba\u01c1\u01c5\u01cc\u01d0\u01d2\u01da\u01de\u01e0\u01ed"+
		"\u01f3\u01f6\u0200\u020a\u0214\u0224\u0227\u022d\u022f\u0235\u0242\u0253"+
		"\u0258\u026a\u026e\u0276\u027c\u0281\u0287\u0289\u028c\u0293\u029e\u02a3"+
		"\u02a8\u02ac\u02b0\u02b4\u02bb\u02be\u02c0\u02c9\u02cf\u02d3\u02e2\u02e5"+
		"\u02ec\u02f3\u02fb\u0300\u030c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}