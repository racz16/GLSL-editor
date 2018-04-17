// Generated from GLSL.g4 by ANTLR 4.7.1
package hu.racz.zalan.editor.antlr.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GLSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PD_ERROR=1, PD_PRAGMA=2, PDA_PRAGMA_DEBUG=3, PDA_PRAGMA_OPTIMIZE=4, PDA_PRAGMA_STDGL=5, 
		PDA_PRAGMA_TOGGLE=6, PD_VERSION=7, PDA_VERSION_PROFILE=8, PD_LINE=9, PD_EXTENSION=10, 
		PDA_EXTENSION_ALL_BEHAVIOUR=11, PDA_EXTENSION_BEHAVIOUR=12, PDA_EXTENSION_ALL=13, 
		KW_BREAK=14, KW_CONTINUE=15, KW_DO=16, KW_FOR=17, KW_WHILE=18, KW_SWITCH=19, 
		KW_CASE=20, KW_DEFAULT=21, KW_IF=22, KW_ELSE=23, KW_DISCARD=24, KW_RETURN=25, 
		KW_STRUCT=26, KW_VOID=27, RESERVED_KEYWORD=28, Q_PRECISION=29, Q_LAYOUT=30, 
		Q_PRECISE=31, Q_INVARIANT=32, Q_SUBROUTINE=33, Q_SMOOTH=34, Q_FLAT=35, 
		Q_NONPERSPECTIVE=36, Q_CONST=37, Q_INOUT=38, Q_IN=39, Q_OUT=40, Q_CENTROID=41, 
		Q_PATCH=42, Q_SAMPLE=43, Q_UNIFORM=44, Q_BUFFER=45, Q_VARYING=46, Q_ATTRIBUTE=47, 
		Q_COHERENT=48, Q_VOLATILE=49, Q_RESTRICT=50, Q_READONLY=51, Q_WRIREONLY=52, 
		Q_SHARED=53, Q_HIGHP=54, Q_MEDIUMP=55, Q_LOWP=56, QP_LAYOUT=57, QPV_LAYOUT=58, 
		TYPE=59, BI_FUNCTION=60, BI_MACRO=61, BI_VARIABLE=62, BOOL_LITERAL=63, 
		INT_LITERAL=64, FLOAT_LITERAL=65, OP_MUL=66, OP_ADD=67, OP_SUB=68, OP_DIV=69, 
		OP_MOD=70, OP_INC=71, OP_DEC=72, OP_SHIFT=73, OP_RELATIONAL=74, OP_BIT=75, 
		OP_BIT_UNARY=76, OP_LOGICAL=77, OP_LOGICAL_UNARY=78, OP_MODIFY=79, OP_ASSIGN=80, 
		MULTI_LINE_COMMENT=81, ONE_LINE_MULTI_LINE_COMMENT=82, SINGLE_LINE_COMMENT=83, 
		NEW_LINE=84, SPACE=85, TAB=86, IDENTIFIER=87, DOT=88, COMMA=89, COLON=90, 
		SEMICOLON=91, QUESTION=92, LRB=93, RRB=94, LCB=95, RCB=96, LSB=97, RSB=98;
	public static final int
		RULE_start = 0, RULE_macro = 1, RULE_m_version = 2, RULE_m_line = 3, RULE_m_pragma = 4, 
		RULE_m_extension = 5, RULE_m_error = 6, RULE_function_signature = 7, RULE_return_type = 8, 
		RULE_function_subroutine_qualifier = 9, RULE_function_parameter_list = 10, 
		RULE_function_parameter = 11, RULE_parameter_qualifier = 12, RULE_function_prototype = 13, 
		RULE_function_definition = 14, RULE_function_call = 15, RULE_function_call_parameter_list = 16, 
		RULE_statement_list = 17, RULE_statement = 18, RULE_compound_statement = 19, 
		RULE_simple_statement = 20, RULE_selection_statement = 21, RULE_switch_statement = 22, 
		RULE_case_group = 23, RULE_case_label = 24, RULE_case_statement_list = 25, 
		RULE_iteration_statement = 26, RULE_for_iteration = 27, RULE_while_iteration = 28, 
		RULE_do_while_iteration = 29, RULE_jump_statement = 30, RULE_expression_statement = 31, 
		RULE_declaration_statement = 32, RULE_init_declaration_list = 33, RULE_single_declaration = 34, 
		RULE_struct_declaration_list = 35, RULE_struct_declaration = 36, RULE_struct_declarator_list = 37, 
		RULE_struct_declarator = 38, RULE_struct_specifier = 39, RULE_expression = 40, 
		RULE_constant_expression = 41, RULE_fully_specified_type = 42, RULE_fully_specified_struct = 43, 
		RULE_type = 44, RULE_type_qualifier = 45, RULE_type_name_list = 46, RULE_storage_qualifier = 47, 
		RULE_auxiliary_storage_qualifier = 48, RULE_memory_storage_qualifier = 49, 
		RULE_layout_qualifier = 50, RULE_layout_qualifier_id_list = 51, RULE_layout_qualifier_id = 52, 
		RULE_precision_qualifier = 53, RULE_interpolation_qualifier = 54, RULE_literal = 55, 
		RULE_bool_literal = 56, RULE_number_literal = 57, RULE_array_usage = 58, 
		RULE_array_declaration = 59;
	public static final String[] ruleNames = {
		"start", "macro", "m_version", "m_line", "m_pragma", "m_extension", "m_error", 
		"function_signature", "return_type", "function_subroutine_qualifier", 
		"function_parameter_list", "function_parameter", "parameter_qualifier", 
		"function_prototype", "function_definition", "function_call", "function_call_parameter_list", 
		"statement_list", "statement", "compound_statement", "simple_statement", 
		"selection_statement", "switch_statement", "case_group", "case_label", 
		"case_statement_list", "iteration_statement", "for_iteration", "while_iteration", 
		"do_while_iteration", "jump_statement", "expression_statement", "declaration_statement", 
		"init_declaration_list", "single_declaration", "struct_declaration_list", 
		"struct_declaration", "struct_declarator_list", "struct_declarator", "struct_specifier", 
		"expression", "constant_expression", "fully_specified_type", "fully_specified_struct", 
		"type", "type_qualifier", "type_name_list", "storage_qualifier", "auxiliary_storage_qualifier", 
		"memory_storage_qualifier", "layout_qualifier", "layout_qualifier_id_list", 
		"layout_qualifier_id", "precision_qualifier", "interpolation_qualifier", 
		"literal", "bool_literal", "number_literal", "array_usage", "array_declaration"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#error'", "'#pragma'", "'debug'", "'optimize'", "'STDGL'", null, 
		"'#version'", null, "'#line'", "'#extension'", null, null, "'all'", "'break'", 
		"'continue'", "'do'", "'for'", "'while'", "'switch'", "'case'", "'default'", 
		"'if'", "'else'", "'discard'", "'return'", "'struct'", "'void'", null, 
		"'precision'", "'layout'", "'precise'", "'invariant'", "'subroutine'", 
		"'smooth'", "'flat'", "'noperspective'", "'const'", "'inout'", "'in'", 
		"'out'", "'centroid'", "'patch'", "'sample'", "'uniform'", "'buffer'", 
		"'varying'", "'attribute'", "'coherent'", "'volatile'", "'restrict'", 
		"'readonly'", "'writeonly'", "'shared'", "'highp'", "'mediump'", "'lowp'", 
		null, null, null, null, null, null, null, null, null, "'*'", "'+'", "'-'", 
		"'/'", "'%'", "'++'", "'--'", null, null, null, "'~'", null, "'!'", null, 
		"'='", null, null, null, null, "' '", "'\t'", null, "'.'", "','", "':'", 
		"';'", "'?'", "'('", "')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PD_ERROR", "PD_PRAGMA", "PDA_PRAGMA_DEBUG", "PDA_PRAGMA_OPTIMIZE", 
		"PDA_PRAGMA_STDGL", "PDA_PRAGMA_TOGGLE", "PD_VERSION", "PDA_VERSION_PROFILE", 
		"PD_LINE", "PD_EXTENSION", "PDA_EXTENSION_ALL_BEHAVIOUR", "PDA_EXTENSION_BEHAVIOUR", 
		"PDA_EXTENSION_ALL", "KW_BREAK", "KW_CONTINUE", "KW_DO", "KW_FOR", "KW_WHILE", 
		"KW_SWITCH", "KW_CASE", "KW_DEFAULT", "KW_IF", "KW_ELSE", "KW_DISCARD", 
		"KW_RETURN", "KW_STRUCT", "KW_VOID", "RESERVED_KEYWORD", "Q_PRECISION", 
		"Q_LAYOUT", "Q_PRECISE", "Q_INVARIANT", "Q_SUBROUTINE", "Q_SMOOTH", "Q_FLAT", 
		"Q_NONPERSPECTIVE", "Q_CONST", "Q_INOUT", "Q_IN", "Q_OUT", "Q_CENTROID", 
		"Q_PATCH", "Q_SAMPLE", "Q_UNIFORM", "Q_BUFFER", "Q_VARYING", "Q_ATTRIBUTE", 
		"Q_COHERENT", "Q_VOLATILE", "Q_RESTRICT", "Q_READONLY", "Q_WRIREONLY", 
		"Q_SHARED", "Q_HIGHP", "Q_MEDIUMP", "Q_LOWP", "QP_LAYOUT", "QPV_LAYOUT", 
		"TYPE", "BI_FUNCTION", "BI_MACRO", "BI_VARIABLE", "BOOL_LITERAL", "INT_LITERAL", 
		"FLOAT_LITERAL", "OP_MUL", "OP_ADD", "OP_SUB", "OP_DIV", "OP_MOD", "OP_INC", 
		"OP_DEC", "OP_SHIFT", "OP_RELATIONAL", "OP_BIT", "OP_BIT_UNARY", "OP_LOGICAL", 
		"OP_LOGICAL_UNARY", "OP_MODIFY", "OP_ASSIGN", "MULTI_LINE_COMMENT", "ONE_LINE_MULTI_LINE_COMMENT", 
		"SINGLE_LINE_COMMENT", "NEW_LINE", "SPACE", "TAB", "IDENTIFIER", "DOT", 
		"COMMA", "COLON", "SEMICOLON", "QUESTION", "LRB", "RRB", "LCB", "RCB", 
		"LSB", "RSB"
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

	@Override
	public String getGrammarFileName() { return "GLSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GLSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public List<Function_prototypeContext> function_prototype() {
			return getRuleContexts(Function_prototypeContext.class);
		}
		public Function_prototypeContext function_prototype(int i) {
			return getRuleContext(Function_prototypeContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public List<Declaration_statementContext> declaration_statement() {
			return getRuleContexts(Declaration_statementContext.class);
		}
		public Declaration_statementContext declaration_statement(int i) {
			return getRuleContext(Declaration_statementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GLSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GLSLParser.SEMICOLON, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PD_ERROR) | (1L << PD_PRAGMA) | (1L << PD_VERSION) | (1L << PD_LINE) | (1L << PD_EXTENSION) | (1L << KW_STRUCT) | (1L << KW_VOID) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE))) != 0) || _la==IDENTIFIER || _la==SEMICOLON) {
				{
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(120);
					macro();
					}
					break;
				case 2:
					{
					setState(121);
					function_prototype();
					}
					break;
				case 3:
					{
					setState(122);
					function_definition();
					}
					break;
				case 4:
					{
					setState(123);
					declaration_statement();
					}
					break;
				case 5:
					{
					setState(124);
					match(SEMICOLON);
					}
					break;
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MacroContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(GLSLParser.NEW_LINE, 0); }
		public TerminalNode EOF() { return getToken(GLSLParser.EOF, 0); }
		public M_versionContext m_version() {
			return getRuleContext(M_versionContext.class,0);
		}
		public M_lineContext m_line() {
			return getRuleContext(M_lineContext.class,0);
		}
		public M_pragmaContext m_pragma() {
			return getRuleContext(M_pragmaContext.class,0);
		}
		public M_extensionContext m_extension() {
			return getRuleContext(M_extensionContext.class,0);
		}
		public M_errorContext m_error() {
			return getRuleContext(M_errorContext.class,0);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitMacro(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PD_VERSION:
				{
				setState(130);
				m_version();
				}
				break;
			case PD_LINE:
				{
				setState(131);
				m_line();
				}
				break;
			case PD_PRAGMA:
				{
				setState(132);
				m_pragma();
				}
				break;
			case PD_EXTENSION:
				{
				setState(133);
				m_extension();
				}
				break;
			case PD_ERROR:
				{
				setState(134);
				m_error();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEW_LINE) ) {
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

	public static class M_versionContext extends ParserRuleContext {
		public TerminalNode PD_VERSION() { return getToken(GLSLParser.PD_VERSION, 0); }
		public TerminalNode INT_LITERAL() { return getToken(GLSLParser.INT_LITERAL, 0); }
		public TerminalNode PDA_VERSION_PROFILE() { return getToken(GLSLParser.PDA_VERSION_PROFILE, 0); }
		public M_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterM_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitM_version(this);
		}
	}

	public final M_versionContext m_version() throws RecognitionException {
		M_versionContext _localctx = new M_versionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_m_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(PD_VERSION);
			setState(140);
			match(INT_LITERAL);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PDA_VERSION_PROFILE) {
				{
				setState(141);
				match(PDA_VERSION_PROFILE);
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

	public static class M_lineContext extends ParserRuleContext {
		public TerminalNode PD_LINE() { return getToken(GLSLParser.PD_LINE, 0); }
		public List<TerminalNode> INT_LITERAL() { return getTokens(GLSLParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(GLSLParser.INT_LITERAL, i);
		}
		public M_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterM_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitM_line(this);
		}
	}

	public final M_lineContext m_line() throws RecognitionException {
		M_lineContext _localctx = new M_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_m_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(PD_LINE);
			setState(145);
			match(INT_LITERAL);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_LITERAL) {
				{
				setState(146);
				match(INT_LITERAL);
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

	public static class M_pragmaContext extends ParserRuleContext {
		public TerminalNode PD_PRAGMA() { return getToken(GLSLParser.PD_PRAGMA, 0); }
		public TerminalNode PDA_PRAGMA_STDGL() { return getToken(GLSLParser.PDA_PRAGMA_STDGL, 0); }
		public TerminalNode LRB() { return getToken(GLSLParser.LRB, 0); }
		public TerminalNode PDA_PRAGMA_TOGGLE() { return getToken(GLSLParser.PDA_PRAGMA_TOGGLE, 0); }
		public TerminalNode RRB() { return getToken(GLSLParser.RRB, 0); }
		public TerminalNode PDA_PRAGMA_DEBUG() { return getToken(GLSLParser.PDA_PRAGMA_DEBUG, 0); }
		public TerminalNode PDA_PRAGMA_OPTIMIZE() { return getToken(GLSLParser.PDA_PRAGMA_OPTIMIZE, 0); }
		public M_pragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterM_pragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitM_pragma(this);
		}
	}

	public final M_pragmaContext m_pragma() throws RecognitionException {
		M_pragmaContext _localctx = new M_pragmaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_m_pragma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(PD_PRAGMA);
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PDA_PRAGMA_DEBUG:
			case PDA_PRAGMA_OPTIMIZE:
				{
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==PDA_PRAGMA_DEBUG || _la==PDA_PRAGMA_OPTIMIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				match(LRB);
				setState(152);
				match(PDA_PRAGMA_TOGGLE);
				setState(153);
				match(RRB);
				}
				}
				break;
			case PDA_PRAGMA_STDGL:
				{
				setState(154);
				match(PDA_PRAGMA_STDGL);
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

	public static class M_extensionContext extends ParserRuleContext {
		public TerminalNode PD_EXTENSION() { return getToken(GLSLParser.PD_EXTENSION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public TerminalNode PDA_EXTENSION_BEHAVIOUR() { return getToken(GLSLParser.PDA_EXTENSION_BEHAVIOUR, 0); }
		public TerminalNode PDA_EXTENSION_ALL() { return getToken(GLSLParser.PDA_EXTENSION_ALL, 0); }
		public TerminalNode PDA_EXTENSION_ALL_BEHAVIOUR() { return getToken(GLSLParser.PDA_EXTENSION_ALL_BEHAVIOUR, 0); }
		public M_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterM_extension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitM_extension(this);
		}
	}

	public final M_extensionContext m_extension() throws RecognitionException {
		M_extensionContext _localctx = new M_extensionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_m_extension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(PD_EXTENSION);
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(158);
				match(IDENTIFIER);
				setState(159);
				match(COLON);
				setState(160);
				match(PDA_EXTENSION_BEHAVIOUR);
				}
				break;
			case PDA_EXTENSION_ALL:
				{
				setState(161);
				match(PDA_EXTENSION_ALL);
				setState(162);
				match(COLON);
				setState(163);
				match(PDA_EXTENSION_ALL_BEHAVIOUR);
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

	public static class M_errorContext extends ParserRuleContext {
		public TerminalNode PD_ERROR() { return getToken(GLSLParser.PD_ERROR, 0); }
		public M_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterM_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitM_error(this);
		}
	}

	public final M_errorContext m_error() throws RecognitionException {
		M_errorContext _localctx = new M_errorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_m_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(PD_ERROR);
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

	public static class Function_signatureContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode LRB() { return getToken(GLSLParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(GLSLParser.RRB, 0); }
		public Function_parameter_listContext function_parameter_list() {
			return getRuleContext(Function_parameter_listContext.class,0);
		}
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_signature(this);
		}
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			return_type();
			setState(169);
			match(IDENTIFIER);
			setState(170);
			match(LRB);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (KW_VOID - 27)) | (1L << (Q_PRECISE - 27)) | (1L << (Q_CONST - 27)) | (1L << (Q_INOUT - 27)) | (1L << (Q_IN - 27)) | (1L << (Q_OUT - 27)) | (1L << (Q_COHERENT - 27)) | (1L << (Q_VOLATILE - 27)) | (1L << (Q_RESTRICT - 27)) | (1L << (Q_READONLY - 27)) | (1L << (Q_WRIREONLY - 27)) | (1L << (Q_HIGHP - 27)) | (1L << (Q_MEDIUMP - 27)) | (1L << (Q_LOWP - 27)) | (1L << (TYPE - 27)) | (1L << (IDENTIFIER - 27)))) != 0)) {
				{
				setState(171);
				function_parameter_list();
				}
			}

			setState(174);
			match(RRB);
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

	public static class Return_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode KW_VOID() { return getToken(GLSLParser.KW_VOID, 0); }
		public Precision_qualifierContext precision_qualifier() {
			return getRuleContext(Precision_qualifierContext.class,0);
		}
		public Function_subroutine_qualifierContext function_subroutine_qualifier() {
			return getRuleContext(Function_subroutine_qualifierContext.class,0);
		}
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				setState(176);
				precision_qualifier();
				}
			}

			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Q_SUBROUTINE) {
				{
				setState(179);
				function_subroutine_qualifier();
				}
			}

			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case IDENTIFIER:
				{
				setState(182);
				type();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(183);
					array_declaration();
					}
				}

				}
				break;
			case KW_VOID:
				{
				setState(186);
				match(KW_VOID);
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

	public static class Function_subroutine_qualifierContext extends ParserRuleContext {
		public TerminalNode Q_SUBROUTINE() { return getToken(GLSLParser.Q_SUBROUTINE, 0); }
		public TerminalNode LRB() { return getToken(GLSLParser.LRB, 0); }
		public Type_name_listContext type_name_list() {
			return getRuleContext(Type_name_listContext.class,0);
		}
		public TerminalNode RRB() { return getToken(GLSLParser.RRB, 0); }
		public Function_subroutine_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_subroutine_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_subroutine_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_subroutine_qualifier(this);
		}
	}

	public final Function_subroutine_qualifierContext function_subroutine_qualifier() throws RecognitionException {
		Function_subroutine_qualifierContext _localctx = new Function_subroutine_qualifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_subroutine_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(Q_SUBROUTINE);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LRB) {
				{
				setState(190);
				match(LRB);
				setState(191);
				type_name_list();
				setState(192);
				match(RRB);
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

	public static class Function_parameter_listContext extends ParserRuleContext {
		public List<Function_parameterContext> function_parameter() {
			return getRuleContexts(Function_parameterContext.class);
		}
		public Function_parameterContext function_parameter(int i) {
			return getRuleContext(Function_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public TerminalNode KW_VOID() { return getToken(GLSLParser.KW_VOID, 0); }
		public Function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_parameter_list(this);
		}
	}

	public final Function_parameter_listContext function_parameter_list() throws RecognitionException {
		Function_parameter_listContext _localctx = new Function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_parameter_list);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_PRECISE:
			case Q_CONST:
			case Q_INOUT:
			case Q_IN:
			case Q_OUT:
			case Q_COHERENT:
			case Q_VOLATILE:
			case Q_RESTRICT:
			case Q_READONLY:
			case Q_WRIREONLY:
			case Q_HIGHP:
			case Q_MEDIUMP:
			case Q_LOWP:
			case TYPE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				function_parameter();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(197);
					match(COMMA);
					setState(198);
					function_parameter();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case KW_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(KW_VOID);
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

	public static class Function_parameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Parameter_qualifierContext> parameter_qualifier() {
			return getRuleContexts(Parameter_qualifierContext.class);
		}
		public Parameter_qualifierContext parameter_qualifier(int i) {
			return getRuleContext(Parameter_qualifierContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_parameter(this);
		}
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_PRECISE) | (1L << Q_CONST) | (1L << Q_INOUT) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(207);
				parameter_qualifier();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			type();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(214);
				match(IDENTIFIER);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(215);
					array_declaration();
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

	public static class Parameter_qualifierContext extends ParserRuleContext {
		public TerminalNode Q_CONST() { return getToken(GLSLParser.Q_CONST, 0); }
		public TerminalNode Q_IN() { return getToken(GLSLParser.Q_IN, 0); }
		public TerminalNode Q_OUT() { return getToken(GLSLParser.Q_OUT, 0); }
		public TerminalNode Q_INOUT() { return getToken(GLSLParser.Q_INOUT, 0); }
		public TerminalNode Q_PRECISE() { return getToken(GLSLParser.Q_PRECISE, 0); }
		public Memory_storage_qualifierContext memory_storage_qualifier() {
			return getRuleContext(Memory_storage_qualifierContext.class,0);
		}
		public Precision_qualifierContext precision_qualifier() {
			return getRuleContext(Precision_qualifierContext.class,0);
		}
		public Parameter_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterParameter_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitParameter_qualifier(this);
		}
	}

	public final Parameter_qualifierContext parameter_qualifier() throws RecognitionException {
		Parameter_qualifierContext _localctx = new Parameter_qualifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter_qualifier);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_PRECISE:
			case Q_CONST:
			case Q_INOUT:
			case Q_IN:
			case Q_OUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_PRECISE) | (1L << Q_CONST) | (1L << Q_INOUT) | (1L << Q_IN) | (1L << Q_OUT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case Q_COHERENT:
			case Q_VOLATILE:
			case Q_RESTRICT:
			case Q_READONLY:
			case Q_WRIREONLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				memory_storage_qualifier();
				}
				break;
			case Q_HIGHP:
			case Q_MEDIUMP:
			case Q_LOWP:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				precision_qualifier();
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

	public static class Function_prototypeContext extends ParserRuleContext {
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public Function_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_prototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_prototype(this);
		}
	}

	public final Function_prototypeContext function_prototype() throws RecognitionException {
		Function_prototypeContext _localctx = new Function_prototypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			function_signature();
			setState(226);
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			function_signature();
			setState(229);
			compound_statement();
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode LRB() { return getToken(GLSLParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(GLSLParser.RRB, 0); }
		public TerminalNode BI_FUNCTION() { return getToken(GLSLParser.BI_FUNCTION, 0); }
		public TerminalNode TYPE() { return getToken(GLSLParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public Function_call_parameter_listContext function_call_parameter_list() {
			return getRuleContext(Function_call_parameter_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (TYPE - 59)) | (1L << (BI_FUNCTION - 59)) | (1L << (IDENTIFIER - 59)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(232);
			match(LRB);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_VOID) | (1L << TYPE) | (1L << BI_FUNCTION) | (1L << BI_MACRO) | (1L << BI_VARIABLE) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT_LITERAL - 64)) | (1L << (FLOAT_LITERAL - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_SUB - 64)) | (1L << (OP_INC - 64)) | (1L << (OP_DEC - 64)) | (1L << (OP_BIT_UNARY - 64)) | (1L << (OP_LOGICAL_UNARY - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LRB - 64)))) != 0)) {
				{
				setState(233);
				function_call_parameter_list();
				}
			}

			setState(236);
			match(RRB);
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

	public static class Function_call_parameter_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_VOID() { return getToken(GLSLParser.KW_VOID, 0); }
		public Function_call_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_call_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_call_parameter_list(this);
		}
	}

	public final Function_call_parameter_listContext function_call_parameter_list() throws RecognitionException {
		Function_call_parameter_listContext _localctx = new Function_call_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call_parameter_list);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case BI_FUNCTION:
			case BI_MACRO:
			case BI_VARIABLE:
			case BOOL_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case OP_ADD:
			case OP_SUB:
			case OP_INC:
			case OP_DEC:
			case OP_BIT_UNARY:
			case OP_LOGICAL_UNARY:
			case IDENTIFIER:
			case LRB:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				expression(0);
				}
				break;
			case KW_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(KW_VOID);
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

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				statement();
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_DO) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_SWITCH) | (1L << KW_IF) | (1L << KW_DISCARD) | (1L << KW_RETURN) | (1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BI_FUNCTION) | (1L << BI_MACRO) | (1L << BI_VARIABLE) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT_LITERAL - 64)) | (1L << (FLOAT_LITERAL - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_SUB - 64)) | (1L << (OP_INC - 64)) | (1L << (OP_DEC - 64)) | (1L << (OP_BIT_UNARY - 64)) | (1L << (OP_LOGICAL_UNARY - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (SEMICOLON - 64)) | (1L << (LRB - 64)) | (1L << (LCB - 64)))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCB:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				compound_statement();
				}
				break;
			case KW_BREAK:
			case KW_CONTINUE:
			case KW_DO:
			case KW_FOR:
			case KW_WHILE:
			case KW_SWITCH:
			case KW_IF:
			case KW_DISCARD:
			case KW_RETURN:
			case KW_STRUCT:
			case Q_PRECISION:
			case Q_LAYOUT:
			case Q_PRECISE:
			case Q_INVARIANT:
			case Q_SUBROUTINE:
			case Q_SMOOTH:
			case Q_FLAT:
			case Q_NONPERSPECTIVE:
			case Q_CONST:
			case Q_IN:
			case Q_OUT:
			case Q_CENTROID:
			case Q_PATCH:
			case Q_SAMPLE:
			case Q_UNIFORM:
			case Q_BUFFER:
			case Q_VARYING:
			case Q_ATTRIBUTE:
			case Q_COHERENT:
			case Q_VOLATILE:
			case Q_RESTRICT:
			case Q_READONLY:
			case Q_WRIREONLY:
			case Q_SHARED:
			case Q_HIGHP:
			case Q_MEDIUMP:
			case Q_LOWP:
			case TYPE:
			case BI_FUNCTION:
			case BI_MACRO:
			case BI_VARIABLE:
			case BOOL_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case OP_ADD:
			case OP_SUB:
			case OP_INC:
			case OP_DEC:
			case OP_BIT_UNARY:
			case OP_LOGICAL_UNARY:
			case IDENTIFIER:
			case SEMICOLON:
			case LRB:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				simple_statement();
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

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(GLSLParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(GLSLParser.RCB, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LCB);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_DO) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_SWITCH) | (1L << KW_IF) | (1L << KW_DISCARD) | (1L << KW_RETURN) | (1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BI_FUNCTION) | (1L << BI_MACRO) | (1L << BI_VARIABLE) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT_LITERAL - 64)) | (1L << (FLOAT_LITERAL - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_SUB - 64)) | (1L << (OP_INC - 64)) | (1L << (OP_DEC - 64)) | (1L << (OP_BIT_UNARY - 64)) | (1L << (OP_LOGICAL_UNARY - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (SEMICOLON - 64)) | (1L << (LRB - 64)) | (1L << (LCB - 64)))) != 0)) {
				{
				setState(252);
				statement_list();
				}
			}

			setState(255);
			match(RCB);
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

	public static class Simple_statementContext extends ParserRuleContext {
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitSimple_statement(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simple_statement);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				expression_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				selection_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				iteration_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				jump_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				switch_statement();
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

	public static class Selection_statementContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(GLSLParser.KW_IF, 0); }
		public TerminalNode LRB() { return getToken(GLSLParser.LRB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RRB() { return getToken(GLSLParser.RRB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(GLSLParser.KW_ELSE, 0); }
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitSelection_statement(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(KW_IF);
			setState(266);
			match(LRB);
			setState(267);
			expression(0);
			setState(268);
			match(RRB);
			setState(269);
			statement();
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(270);
				match(KW_ELSE);
				setState(271);
				statement();
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

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode KW_SWITCH() { return getToken(GLSLParser.KW_SWITCH, 0); }
		public TerminalNode LRB() { return getToken(GLSLParser.LRB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RRB() { return getToken(GLSLParser.RRB, 0); }
		public TerminalNode LCB() { return getToken(GLSLParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(GLSLParser.RCB, 0); }
		public List<Case_groupContext> case_group() {
			return getRuleContexts(Case_groupContext.class);
		}
		public Case_groupContext case_group(int i) {
			return getRuleContext(Case_groupContext.class,i);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(KW_SWITCH);
			setState(275);
			match(LRB);
			setState(276);
			expression(0);
			setState(277);
			match(RRB);
			setState(278);
			match(LCB);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_CASE || _la==KW_DEFAULT) {
				{
				{
				setState(279);
				case_group();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(RCB);
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

	public static class Case_groupContext extends ParserRuleContext {
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public Case_statement_listContext case_statement_list() {
			return getRuleContext(Case_statement_listContext.class,0);
		}
		public Case_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterCase_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitCase_group(this);
		}
	}

	public final Case_groupContext case_group() throws RecognitionException {
		Case_groupContext _localctx = new Case_groupContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_case_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			case_label();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BI_FUNCTION) | (1L << BI_MACRO) | (1L << BI_VARIABLE) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT_LITERAL - 64)) | (1L << (FLOAT_LITERAL - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_SUB - 64)) | (1L << (OP_INC - 64)) | (1L << (OP_DEC - 64)) | (1L << (OP_BIT_UNARY - 64)) | (1L << (OP_LOGICAL_UNARY - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (SEMICOLON - 64)) | (1L << (LRB - 64)))) != 0)) {
				{
				setState(288);
				case_statement_list();
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

	public static class Case_labelContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(GLSLParser.KW_DEFAULT, 0); }
		public TerminalNode KW_CASE() { return getToken(GLSLParser.KW_CASE, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitCase_label(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DEFAULT:
				{
				setState(291);
				match(KW_DEFAULT);
				}
				break;
			case KW_CASE:
				{
				setState(292);
				match(KW_CASE);
				setState(293);
				constant_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(296);
			match(COLON);
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

	public static class Case_statement_listContext extends ParserRuleContext {
		public List<Declaration_statementContext> declaration_statement() {
			return getRuleContexts(Declaration_statementContext.class);
		}
		public Declaration_statementContext declaration_statement(int i) {
			return getRuleContext(Declaration_statementContext.class,i);
		}
		public List<Expression_statementContext> expression_statement() {
			return getRuleContexts(Expression_statementContext.class);
		}
		public Expression_statementContext expression_statement(int i) {
			return getRuleContext(Expression_statementContext.class,i);
		}
		public Case_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterCase_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitCase_statement_list(this);
		}
	}

	public final Case_statement_listContext case_statement_list() throws RecognitionException {
		Case_statement_listContext _localctx = new Case_statement_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_case_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(298);
					declaration_statement();
					}
					break;
				case 2:
					{
					setState(299);
					expression_statement();
					}
					break;
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BI_FUNCTION) | (1L << BI_MACRO) | (1L << BI_VARIABLE) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT_LITERAL - 64)) | (1L << (FLOAT_LITERAL - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_SUB - 64)) | (1L << (OP_INC - 64)) | (1L << (OP_DEC - 64)) | (1L << (OP_BIT_UNARY - 64)) | (1L << (OP_LOGICAL_UNARY - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (SEMICOLON - 64)) | (1L << (LRB - 64)))) != 0) );
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

	public static class Iteration_statementContext extends ParserRuleContext {
		public For_iterationContext for_iteration() {
			return getRuleContext(For_iterationContext.class,0);
		}
		public While_iterationContext while_iteration() {
			return getRuleContext(While_iterationContext.class,0);
		}
		public Do_while_iterationContext do_while_iteration() {
			return getRuleContext(Do_while_iterationContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_iteration_statement);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				for_iteration();
				}
				break;
			case KW_WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				while_iteration();
				}
				break;
			case KW_DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				do_while_iteration();
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

	public static class For_iterationContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(GLSLParser.KW_FOR, 0); }
		public TerminalNode LRB() { return getToken(GLSLParser.LRB, 0); }
		public Init_declaration_listContext init_declaration_list() {
			return getRuleContext(Init_declaration_listContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GLSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GLSLParser.SEMICOLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RRB() { return getToken(GLSLParser.RRB, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFor_iteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFor_iteration(this);
		}
	}

	public final For_iterationContext for_iteration() throws RecognitionException {
		For_iterationContext _localctx = new For_iterationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(KW_FOR);
			setState(310);
			match(LRB);
			setState(311);
			init_declaration_list();
			setState(312);
			match(SEMICOLON);
			setState(313);
			expression(0);
			setState(314);
			match(SEMICOLON);
			setState(315);
			expression(0);
			setState(316);
			match(RRB);
			setState(317);
			statement();
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

	public static class While_iterationContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(GLSLParser.KW_WHILE, 0); }
		public TerminalNode LRB() { return getToken(GLSLParser.LRB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RRB() { return getToken(GLSLParser.RRB, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_iteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterWhile_iteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitWhile_iteration(this);
		}
	}

	public final While_iterationContext while_iteration() throws RecognitionException {
		While_iterationContext _localctx = new While_iterationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_while_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(KW_WHILE);
			setState(320);
			match(LRB);
			setState(321);
			expression(0);
			setState(322);
			match(RRB);
			setState(323);
			statement();
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

	public static class Do_while_iterationContext extends ParserRuleContext {
		public TerminalNode KW_DO() { return getToken(GLSLParser.KW_DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode KW_WHILE() { return getToken(GLSLParser.KW_WHILE, 0); }
		public TerminalNode LRB() { return getToken(GLSLParser.LRB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RRB() { return getToken(GLSLParser.RRB, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public Do_while_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_iteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterDo_while_iteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitDo_while_iteration(this);
		}
	}

	public final Do_while_iterationContext do_while_iteration() throws RecognitionException {
		Do_while_iterationContext _localctx = new Do_while_iterationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_do_while_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(KW_DO);
			setState(326);
			statement();
			setState(327);
			match(KW_WHILE);
			setState(328);
			match(LRB);
			setState(329);
			expression(0);
			setState(330);
			match(RRB);
			setState(331);
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

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(GLSLParser.KW_CONTINUE, 0); }
		public TerminalNode KW_BREAK() { return getToken(GLSLParser.KW_BREAK, 0); }
		public TerminalNode KW_DISCARD() { return getToken(GLSLParser.KW_DISCARD, 0); }
		public TerminalNode KW_RETURN() { return getToken(GLSLParser.KW_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_jump_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CONTINUE:
				{
				setState(333);
				match(KW_CONTINUE);
				}
				break;
			case KW_BREAK:
				{
				setState(334);
				match(KW_BREAK);
				}
				break;
			case KW_DISCARD:
				{
				setState(335);
				match(KW_DISCARD);
				}
				break;
			case KW_RETURN:
				{
				setState(336);
				match(KW_RETURN);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (TYPE - 59)) | (1L << (BI_FUNCTION - 59)) | (1L << (BI_MACRO - 59)) | (1L << (BI_VARIABLE - 59)) | (1L << (BOOL_LITERAL - 59)) | (1L << (INT_LITERAL - 59)) | (1L << (FLOAT_LITERAL - 59)) | (1L << (OP_ADD - 59)) | (1L << (OP_SUB - 59)) | (1L << (OP_INC - 59)) | (1L << (OP_DEC - 59)) | (1L << (OP_BIT_UNARY - 59)) | (1L << (OP_LOGICAL_UNARY - 59)) | (1L << (IDENTIFIER - 59)) | (1L << (LRB - 59)))) != 0)) {
					{
					setState(337);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(342);
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

	public static class Expression_statementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (TYPE - 59)) | (1L << (BI_FUNCTION - 59)) | (1L << (BI_MACRO - 59)) | (1L << (BI_VARIABLE - 59)) | (1L << (BOOL_LITERAL - 59)) | (1L << (INT_LITERAL - 59)) | (1L << (FLOAT_LITERAL - 59)) | (1L << (OP_ADD - 59)) | (1L << (OP_SUB - 59)) | (1L << (OP_INC - 59)) | (1L << (OP_DEC - 59)) | (1L << (OP_BIT_UNARY - 59)) | (1L << (OP_LOGICAL_UNARY - 59)) | (1L << (IDENTIFIER - 59)) | (1L << (LRB - 59)))) != 0)) {
				{
				setState(344);
				expression(0);
				}
			}

			setState(347);
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

	public static class Declaration_statementContext extends ParserRuleContext {
		public TerminalNode Q_PRECISION() { return getToken(GLSLParser.Q_PRECISION, 0); }
		public Precision_qualifierContext precision_qualifier() {
			return getRuleContext(Precision_qualifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public Init_declaration_listContext init_declaration_list() {
			return getRuleContext(Init_declaration_listContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(GLSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GLSLParser.IDENTIFIER, i);
		}
		public TerminalNode LCB() { return getToken(GLSLParser.LCB, 0); }
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public TerminalNode RCB() { return getToken(GLSLParser.RCB, 0); }
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitDeclaration_statement(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declaration_statement);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(Q_PRECISION);
				setState(350);
				precision_qualifier();
				setState(351);
				type();
				setState(352);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				init_declaration_list();
				setState(355);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
					{
					{
					setState(357);
					type_qualifier();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(IDENTIFIER);
				setState(364);
				match(LCB);
				setState(365);
				struct_declaration_list();
				setState(366);
				match(RCB);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(367);
					match(IDENTIFIER);
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LSB) {
						{
						setState(368);
						array_declaration();
						}
					}

					}
				}

				setState(373);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
					{
					{
					setState(375);
					type_qualifier();
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(381);
					match(IDENTIFIER);
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(382);
						match(COMMA);
						setState(383);
						match(IDENTIFIER);
						}
						}
						setState(388);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(391);
				match(SEMICOLON);
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

	public static class Init_declaration_listContext extends ParserRuleContext {
		public Single_declarationContext single_declaration() {
			return getRuleContext(Single_declarationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(GLSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GLSLParser.IDENTIFIER, i);
		}
		public List<Array_declarationContext> array_declaration() {
			return getRuleContexts(Array_declarationContext.class);
		}
		public Array_declarationContext array_declaration(int i) {
			return getRuleContext(Array_declarationContext.class,i);
		}
		public List<TerminalNode> OP_ASSIGN() { return getTokens(GLSLParser.OP_ASSIGN); }
		public TerminalNode OP_ASSIGN(int i) {
			return getToken(GLSLParser.OP_ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Init_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterInit_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitInit_declaration_list(this);
		}
	}

	public final Init_declaration_listContext init_declaration_list() throws RecognitionException {
		Init_declaration_listContext _localctx = new Init_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_init_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			single_declaration();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395);
				match(COMMA);
				setState(396);
				match(IDENTIFIER);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(397);
					array_declaration();
					}
				}

				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASSIGN) {
					{
					setState(400);
					match(OP_ASSIGN);
					setState(401);
					expression(0);
					}
				}

				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Single_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Struct_specifierContext struct_specifier() {
			return getRuleContext(Struct_specifierContext.class,0);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public TerminalNode OP_ASSIGN() { return getToken(GLSLParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Single_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterSingle_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitSingle_declaration(this);
		}
	}

	public final Single_declarationContext single_declaration() throws RecognitionException {
		Single_declarationContext _localctx = new Single_declarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_single_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(409);
				type_qualifier();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case IDENTIFIER:
				{
				setState(415);
				type();
				}
				break;
			case KW_STRUCT:
				{
				setState(416);
				struct_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(419);
				match(IDENTIFIER);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(420);
					array_declaration();
					}
				}

				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASSIGN) {
					{
					setState(423);
					match(OP_ASSIGN);
					setState(424);
					expression(0);
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

	public static class Struct_declaration_listContext extends ParserRuleContext {
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Struct_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStruct_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStruct_declaration_list(this);
		}
	}

	public final Struct_declaration_listContext struct_declaration_list() throws RecognitionException {
		Struct_declaration_listContext _localctx = new Struct_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_struct_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(429);
				struct_declaration();
				}
				}
				setState(432); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (Q_LAYOUT - 30)) | (1L << (Q_PRECISE - 30)) | (1L << (Q_INVARIANT - 30)) | (1L << (Q_SUBROUTINE - 30)) | (1L << (Q_SMOOTH - 30)) | (1L << (Q_FLAT - 30)) | (1L << (Q_NONPERSPECTIVE - 30)) | (1L << (Q_CONST - 30)) | (1L << (Q_IN - 30)) | (1L << (Q_OUT - 30)) | (1L << (Q_CENTROID - 30)) | (1L << (Q_PATCH - 30)) | (1L << (Q_SAMPLE - 30)) | (1L << (Q_UNIFORM - 30)) | (1L << (Q_BUFFER - 30)) | (1L << (Q_VARYING - 30)) | (1L << (Q_ATTRIBUTE - 30)) | (1L << (Q_COHERENT - 30)) | (1L << (Q_VOLATILE - 30)) | (1L << (Q_RESTRICT - 30)) | (1L << (Q_READONLY - 30)) | (1L << (Q_WRIREONLY - 30)) | (1L << (Q_SHARED - 30)) | (1L << (Q_HIGHP - 30)) | (1L << (Q_MEDIUMP - 30)) | (1L << (Q_LOWP - 30)) | (1L << (TYPE - 30)) | (1L << (IDENTIFIER - 30)))) != 0) );
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStruct_declaration(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(434);
				type_qualifier();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			type();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(441);
				struct_declarator_list();
				}
			}

			setState(444);
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

	public static class Struct_declarator_listContext extends ParserRuleContext {
		public List<Struct_declaratorContext> struct_declarator() {
			return getRuleContexts(Struct_declaratorContext.class);
		}
		public Struct_declaratorContext struct_declarator(int i) {
			return getRuleContext(Struct_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStruct_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStruct_declarator_list(this);
		}
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_struct_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			struct_declarator();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(447);
				match(COMMA);
				setState(448);
				struct_declarator();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Struct_declaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStruct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStruct_declarator(this);
		}
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_struct_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(IDENTIFIER);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(455);
				array_declaration();
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

	public static class Struct_specifierContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(GLSLParser.KW_STRUCT, 0); }
		public TerminalNode LCB() { return getToken(GLSLParser.LCB, 0); }
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public TerminalNode RCB() { return getToken(GLSLParser.RCB, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public Struct_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStruct_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStruct_specifier(this);
		}
	}

	public final Struct_specifierContext struct_specifier() throws RecognitionException {
		Struct_specifierContext _localctx = new Struct_specifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_struct_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(KW_STRUCT);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(459);
				match(IDENTIFIER);
				}
			}

			setState(462);
			match(LCB);
			setState(463);
			struct_declaration_list();
			setState(464);
			match(RCB);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode BI_MACRO() { return getToken(GLSLParser.BI_MACRO, 0); }
		public TerminalNode BI_VARIABLE() { return getToken(GLSLParser.BI_VARIABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LRB() { return getToken(GLSLParser.LRB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RRB() { return getToken(GLSLParser.RRB, 0); }
		public TerminalNode OP_LOGICAL_UNARY() { return getToken(GLSLParser.OP_LOGICAL_UNARY, 0); }
		public TerminalNode OP_ADD() { return getToken(GLSLParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(GLSLParser.OP_SUB, 0); }
		public TerminalNode OP_BIT_UNARY() { return getToken(GLSLParser.OP_BIT_UNARY, 0); }
		public TerminalNode OP_INC() { return getToken(GLSLParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(GLSLParser.OP_DEC, 0); }
		public TerminalNode OP_MUL() { return getToken(GLSLParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(GLSLParser.OP_DIV, 0); }
		public TerminalNode OP_MOD() { return getToken(GLSLParser.OP_MOD, 0); }
		public TerminalNode OP_SHIFT() { return getToken(GLSLParser.OP_SHIFT, 0); }
		public TerminalNode OP_BIT() { return getToken(GLSLParser.OP_BIT, 0); }
		public TerminalNode OP_RELATIONAL() { return getToken(GLSLParser.OP_RELATIONAL, 0); }
		public TerminalNode OP_LOGICAL() { return getToken(GLSLParser.OP_LOGICAL, 0); }
		public TerminalNode OP_MODIFY() { return getToken(GLSLParser.OP_MODIFY, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(GLSLParser.OP_ASSIGN, 0); }
		public TerminalNode QUESTION() { return getToken(GLSLParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
		public TerminalNode DOT() { return getToken(GLSLParser.DOT, 0); }
		public Array_usageContext array_usage() {
			return getRuleContext(Array_usageContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(467);
				match(BI_MACRO);
				}
				break;
			case 2:
				{
				setState(468);
				match(BI_VARIABLE);
				}
				break;
			case 3:
				{
				setState(469);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(470);
				function_call();
				}
				break;
			case 5:
				{
				setState(471);
				literal();
				}
				break;
			case 6:
				{
				setState(472);
				match(LRB);
				setState(473);
				expression(0);
				setState(474);
				match(RRB);
				}
				break;
			case 7:
				{
				setState(476);
				_la = _input.LA(1);
				if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OP_ADD - 67)) | (1L << (OP_SUB - 67)) | (1L << (OP_INC - 67)) | (1L << (OP_DEC - 67)) | (1L << (OP_BIT_UNARY - 67)) | (1L << (OP_LOGICAL_UNARY - 67)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(477);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(499);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(480);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(481);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OP_MUL - 66)) | (1L << (OP_ADD - 66)) | (1L << (OP_SUB - 66)) | (1L << (OP_DIV - 66)) | (1L << (OP_MOD - 66)) | (1L << (OP_SHIFT - 66)) | (1L << (OP_RELATIONAL - 66)) | (1L << (OP_BIT - 66)) | (1L << (OP_LOGICAL - 66)) | (1L << (OP_MODIFY - 66)) | (1L << (OP_ASSIGN - 66)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(482);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(483);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(484);
						match(QUESTION);
						setState(485);
						expression(0);
						setState(486);
						match(COLON);
						setState(487);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(489);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(490);
						match(COMMA);
						setState(491);
						expression(2);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(492);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(493);
						_la = _input.LA(1);
						if ( !(_la==OP_INC || _la==OP_DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(494);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(495);
						match(DOT);
						setState(496);
						match(IDENTIFIER);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(497);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(498);
						array_usage();
						}
						break;
					}
					} 
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class Constant_expressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode BI_MACRO() { return getToken(GLSLParser.BI_MACRO, 0); }
		public TerminalNode BI_VARIABLE() { return getToken(GLSLParser.BI_VARIABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_constant_expression);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				literal();
				}
				break;
			case BI_MACRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(BI_MACRO);
				}
				break;
			case BI_VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				match(BI_VARIABLE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
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

	public static class Fully_specified_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Fully_specified_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fully_specified_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFully_specified_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFully_specified_type(this);
		}
	}

	public final Fully_specified_typeContext fully_specified_type() throws RecognitionException {
		Fully_specified_typeContext _localctx = new Fully_specified_typeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fully_specified_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(510);
				type_qualifier();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			type();
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

	public static class Fully_specified_structContext extends ParserRuleContext {
		public Struct_specifierContext struct_specifier() {
			return getRuleContext(Struct_specifierContext.class,0);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Fully_specified_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fully_specified_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFully_specified_struct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFully_specified_struct(this);
		}
	}

	public final Fully_specified_structContext fully_specified_struct() throws RecognitionException {
		Fully_specified_structContext _localctx = new Fully_specified_structContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fully_specified_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(518);
				type_qualifier();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
			struct_specifier();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode TYPE() { return getToken(GLSLParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==IDENTIFIER) ) {
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

	public static class Type_qualifierContext extends ParserRuleContext {
		public Storage_qualifierContext storage_qualifier() {
			return getRuleContext(Storage_qualifierContext.class,0);
		}
		public Layout_qualifierContext layout_qualifier() {
			return getRuleContext(Layout_qualifierContext.class,0);
		}
		public Precision_qualifierContext precision_qualifier() {
			return getRuleContext(Precision_qualifierContext.class,0);
		}
		public Interpolation_qualifierContext interpolation_qualifier() {
			return getRuleContext(Interpolation_qualifierContext.class,0);
		}
		public TerminalNode Q_INVARIANT() { return getToken(GLSLParser.Q_INVARIANT, 0); }
		public TerminalNode Q_PRECISE() { return getToken(GLSLParser.Q_PRECISE, 0); }
		public TerminalNode Q_SUBROUTINE() { return getToken(GLSLParser.Q_SUBROUTINE, 0); }
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitType_qualifier(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_type_qualifier);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_CONST:
			case Q_IN:
			case Q_OUT:
			case Q_CENTROID:
			case Q_PATCH:
			case Q_SAMPLE:
			case Q_UNIFORM:
			case Q_BUFFER:
			case Q_VARYING:
			case Q_ATTRIBUTE:
			case Q_COHERENT:
			case Q_VOLATILE:
			case Q_RESTRICT:
			case Q_READONLY:
			case Q_WRIREONLY:
			case Q_SHARED:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				storage_qualifier();
				}
				break;
			case Q_LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				layout_qualifier();
				}
				break;
			case Q_HIGHP:
			case Q_MEDIUMP:
			case Q_LOWP:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				precision_qualifier();
				}
				break;
			case Q_SMOOTH:
			case Q_FLAT:
			case Q_NONPERSPECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				interpolation_qualifier();
				}
				break;
			case Q_INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(532);
				match(Q_INVARIANT);
				}
				break;
			case Q_PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(533);
				match(Q_PRECISE);
				}
				break;
			case Q_SUBROUTINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(534);
				match(Q_SUBROUTINE);
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

	public static class Type_name_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GLSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GLSLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public Type_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterType_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitType_name_list(this);
		}
	}

	public final Type_name_listContext type_name_list() throws RecognitionException {
		Type_name_listContext _localctx = new Type_name_listContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_type_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(IDENTIFIER);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(538);
				match(COMMA);
				setState(539);
				match(IDENTIFIER);
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Storage_qualifierContext extends ParserRuleContext {
		public Memory_storage_qualifierContext memory_storage_qualifier() {
			return getRuleContext(Memory_storage_qualifierContext.class,0);
		}
		public Auxiliary_storage_qualifierContext auxiliary_storage_qualifier() {
			return getRuleContext(Auxiliary_storage_qualifierContext.class,0);
		}
		public TerminalNode Q_CONST() { return getToken(GLSLParser.Q_CONST, 0); }
		public TerminalNode Q_IN() { return getToken(GLSLParser.Q_IN, 0); }
		public TerminalNode Q_OUT() { return getToken(GLSLParser.Q_OUT, 0); }
		public TerminalNode Q_ATTRIBUTE() { return getToken(GLSLParser.Q_ATTRIBUTE, 0); }
		public TerminalNode Q_UNIFORM() { return getToken(GLSLParser.Q_UNIFORM, 0); }
		public TerminalNode Q_VARYING() { return getToken(GLSLParser.Q_VARYING, 0); }
		public TerminalNode Q_BUFFER() { return getToken(GLSLParser.Q_BUFFER, 0); }
		public TerminalNode Q_SHARED() { return getToken(GLSLParser.Q_SHARED, 0); }
		public Storage_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStorage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStorage_qualifier(this);
		}
	}

	public final Storage_qualifierContext storage_qualifier() throws RecognitionException {
		Storage_qualifierContext _localctx = new Storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_storage_qualifier);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_COHERENT:
			case Q_VOLATILE:
			case Q_RESTRICT:
			case Q_READONLY:
			case Q_WRIREONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				memory_storage_qualifier();
				}
				break;
			case Q_CENTROID:
			case Q_PATCH:
			case Q_SAMPLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				auxiliary_storage_qualifier();
				}
				break;
			case Q_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				match(Q_CONST);
				}
				break;
			case Q_IN:
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				match(Q_IN);
				}
				break;
			case Q_OUT:
				enterOuterAlt(_localctx, 5);
				{
				setState(549);
				match(Q_OUT);
				}
				break;
			case Q_ATTRIBUTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(550);
				match(Q_ATTRIBUTE);
				}
				break;
			case Q_UNIFORM:
				enterOuterAlt(_localctx, 7);
				{
				setState(551);
				match(Q_UNIFORM);
				}
				break;
			case Q_VARYING:
				enterOuterAlt(_localctx, 8);
				{
				setState(552);
				match(Q_VARYING);
				}
				break;
			case Q_BUFFER:
				enterOuterAlt(_localctx, 9);
				{
				setState(553);
				match(Q_BUFFER);
				}
				break;
			case Q_SHARED:
				enterOuterAlt(_localctx, 10);
				{
				setState(554);
				match(Q_SHARED);
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

	public static class Auxiliary_storage_qualifierContext extends ParserRuleContext {
		public TerminalNode Q_CENTROID() { return getToken(GLSLParser.Q_CENTROID, 0); }
		public TerminalNode Q_SAMPLE() { return getToken(GLSLParser.Q_SAMPLE, 0); }
		public TerminalNode Q_PATCH() { return getToken(GLSLParser.Q_PATCH, 0); }
		public Auxiliary_storage_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxiliary_storage_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterAuxiliary_storage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitAuxiliary_storage_qualifier(this);
		}
	}

	public final Auxiliary_storage_qualifierContext auxiliary_storage_qualifier() throws RecognitionException {
		Auxiliary_storage_qualifierContext _localctx = new Auxiliary_storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_auxiliary_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE))) != 0)) ) {
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

	public static class Memory_storage_qualifierContext extends ParserRuleContext {
		public TerminalNode Q_COHERENT() { return getToken(GLSLParser.Q_COHERENT, 0); }
		public TerminalNode Q_VOLATILE() { return getToken(GLSLParser.Q_VOLATILE, 0); }
		public TerminalNode Q_RESTRICT() { return getToken(GLSLParser.Q_RESTRICT, 0); }
		public TerminalNode Q_READONLY() { return getToken(GLSLParser.Q_READONLY, 0); }
		public TerminalNode Q_WRIREONLY() { return getToken(GLSLParser.Q_WRIREONLY, 0); }
		public Memory_storage_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_storage_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterMemory_storage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitMemory_storage_qualifier(this);
		}
	}

	public final Memory_storage_qualifierContext memory_storage_qualifier() throws RecognitionException {
		Memory_storage_qualifierContext _localctx = new Memory_storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_memory_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY))) != 0)) ) {
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

	public static class Layout_qualifierContext extends ParserRuleContext {
		public TerminalNode Q_LAYOUT() { return getToken(GLSLParser.Q_LAYOUT, 0); }
		public TerminalNode LRB() { return getToken(GLSLParser.LRB, 0); }
		public Layout_qualifier_id_listContext layout_qualifier_id_list() {
			return getRuleContext(Layout_qualifier_id_listContext.class,0);
		}
		public TerminalNode RRB() { return getToken(GLSLParser.RRB, 0); }
		public Layout_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterLayout_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitLayout_qualifier(this);
		}
	}

	public final Layout_qualifierContext layout_qualifier() throws RecognitionException {
		Layout_qualifierContext _localctx = new Layout_qualifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_layout_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(Q_LAYOUT);
			setState(562);
			match(LRB);
			setState(563);
			layout_qualifier_id_list();
			setState(564);
			match(RRB);
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

	public static class Layout_qualifier_id_listContext extends ParserRuleContext {
		public List<Layout_qualifier_idContext> layout_qualifier_id() {
			return getRuleContexts(Layout_qualifier_idContext.class);
		}
		public Layout_qualifier_idContext layout_qualifier_id(int i) {
			return getRuleContext(Layout_qualifier_idContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public Layout_qualifier_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterLayout_qualifier_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitLayout_qualifier_id_list(this);
		}
	}

	public final Layout_qualifier_id_listContext layout_qualifier_id_list() throws RecognitionException {
		Layout_qualifier_id_listContext _localctx = new Layout_qualifier_id_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_layout_qualifier_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			layout_qualifier_id();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(567);
				match(COMMA);
				setState(568);
				layout_qualifier_id();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Layout_qualifier_idContext extends ParserRuleContext {
		public TerminalNode QP_LAYOUT() { return getToken(GLSLParser.QP_LAYOUT, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(GLSLParser.OP_ASSIGN, 0); }
		public TerminalNode QPV_LAYOUT() { return getToken(GLSLParser.QPV_LAYOUT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Q_SHARED() { return getToken(GLSLParser.Q_SHARED, 0); }
		public Layout_qualifier_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterLayout_qualifier_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitLayout_qualifier_id(this);
		}
	}

	public final Layout_qualifier_idContext layout_qualifier_id() throws RecognitionException {
		Layout_qualifier_idContext _localctx = new Layout_qualifier_idContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_layout_qualifier_id);
		int _la;
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QP_LAYOUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(QP_LAYOUT);
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASSIGN) {
					{
					setState(575);
					match(OP_ASSIGN);
					setState(578);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case QPV_LAYOUT:
						{
						setState(576);
						match(QPV_LAYOUT);
						}
						break;
					case BOOL_LITERAL:
					case INT_LITERAL:
					case FLOAT_LITERAL:
						{
						setState(577);
						literal();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case Q_SHARED:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(Q_SHARED);
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

	public static class Precision_qualifierContext extends ParserRuleContext {
		public TerminalNode Q_LOWP() { return getToken(GLSLParser.Q_LOWP, 0); }
		public TerminalNode Q_MEDIUMP() { return getToken(GLSLParser.Q_MEDIUMP, 0); }
		public TerminalNode Q_HIGHP() { return getToken(GLSLParser.Q_HIGHP, 0); }
		public Precision_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterPrecision_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitPrecision_qualifier(this);
		}
	}

	public final Precision_qualifierContext precision_qualifier() throws RecognitionException {
		Precision_qualifierContext _localctx = new Precision_qualifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_precision_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) ) {
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

	public static class Interpolation_qualifierContext extends ParserRuleContext {
		public TerminalNode Q_SMOOTH() { return getToken(GLSLParser.Q_SMOOTH, 0); }
		public TerminalNode Q_FLAT() { return getToken(GLSLParser.Q_FLAT, 0); }
		public TerminalNode Q_NONPERSPECTIVE() { return getToken(GLSLParser.Q_NONPERSPECTIVE, 0); }
		public Interpolation_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterInterpolation_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitInterpolation_qualifier(this);
		}
	}

	public final Interpolation_qualifierContext interpolation_qualifier() throws RecognitionException {
		Interpolation_qualifierContext _localctx = new Interpolation_qualifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_interpolation_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE))) != 0)) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOL_LITERAL() { return getToken(GLSLParser.BOOL_LITERAL, 0); }
		public TerminalNode INT_LITERAL() { return getToken(GLSLParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(GLSLParser.FLOAT_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (BOOL_LITERAL - 63)) | (1L << (INT_LITERAL - 63)) | (1L << (FLOAT_LITERAL - 63)))) != 0)) ) {
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode BOOL_LITERAL() { return getToken(GLSLParser.BOOL_LITERAL, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_bool_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(BOOL_LITERAL);
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

	public static class Number_literalContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(GLSLParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(GLSLParser.FLOAT_LITERAL, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterNumber_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitNumber_literal(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_la = _input.LA(1);
			if ( !(_la==INT_LITERAL || _la==FLOAT_LITERAL) ) {
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

	public static class Array_usageContext extends ParserRuleContext {
		public List<TerminalNode> LSB() { return getTokens(GLSLParser.LSB); }
		public TerminalNode LSB(int i) {
			return getToken(GLSLParser.LSB, i);
		}
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public List<TerminalNode> RSB() { return getTokens(GLSLParser.RSB); }
		public TerminalNode RSB(int i) {
			return getToken(GLSLParser.RSB, i);
		}
		public Array_usageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_usage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterArray_usage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitArray_usage(this);
		}
	}

	public final Array_usageContext array_usage() throws RecognitionException {
		Array_usageContext _localctx = new Array_usageContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_array_usage);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(595);
					match(LSB);
					setState(596);
					constant_expression();
					setState(597);
					match(RSB);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(601); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Array_declarationContext extends ParserRuleContext {
		public List<TerminalNode> LSB() { return getTokens(GLSLParser.LSB); }
		public TerminalNode LSB(int i) {
			return getToken(GLSLParser.LSB, i);
		}
		public List<TerminalNode> RSB() { return getTokens(GLSLParser.RSB); }
		public TerminalNode RSB(int i) {
			return getToken(GLSLParser.RSB, i);
		}
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public Array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterArray_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitArray_declaration(this);
		}
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(603);
				match(LSB);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (BI_MACRO - 61)) | (1L << (BI_VARIABLE - 61)) | (1L << (BOOL_LITERAL - 61)) | (1L << (INT_LITERAL - 61)) | (1L << (FLOAT_LITERAL - 61)) | (1L << (IDENTIFIER - 61)))) != 0)) {
					{
					setState(604);
					constant_expression();
					}
				}

				setState(607);
				match(RSB);
				}
				}
				setState(610); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LSB );
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
		case 40:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3d\u0267\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\u008a\n\3\3\3\3\3\3\4\3\4\3\4\5\4\u0091\n\4\3\5\3\5\3\5\5\5\u0096"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00a7\n\7\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00af\n\t\3\t\3\t\3\n\5\n\u00b4"+
		"\n\n\3\n\5\n\u00b7\n\n\3\n\3\n\5\n\u00bb\n\n\3\n\5\n\u00be\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00c5\n\13\3\f\3\f\3\f\7\f\u00ca\n\f\f\f\16\f"+
		"\u00cd\13\f\3\f\5\f\u00d0\n\f\3\r\7\r\u00d3\n\r\f\r\16\r\u00d6\13\r\3"+
		"\r\3\r\3\r\5\r\u00db\n\r\5\r\u00dd\n\r\3\16\3\16\3\16\5\16\u00e2\n\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00ed\n\21\3\21\3\21"+
		"\3\22\3\22\5\22\u00f3\n\22\3\23\6\23\u00f6\n\23\r\23\16\23\u00f7\3\24"+
		"\3\24\5\24\u00fc\n\24\3\25\3\25\5\25\u0100\n\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u010a\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0113\n\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u011b\n\30\f\30\16"+
		"\30\u011e\13\30\3\30\3\30\3\31\3\31\5\31\u0124\n\31\3\32\3\32\3\32\5\32"+
		"\u0129\n\32\3\32\3\32\3\33\3\33\6\33\u012f\n\33\r\33\16\33\u0130\3\34"+
		"\3\34\3\34\5\34\u0136\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \5 \u0155\n \5 \u0157\n \3 \3 \3!\5!\u015c\n!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0169\n\"\f\"\16\"\u016c\13"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0174\n\"\5\"\u0176\n\"\3\"\3\"\3\"\7\""+
		"\u017b\n\"\f\"\16\"\u017e\13\"\3\"\3\"\3\"\7\"\u0183\n\"\f\"\16\"\u0186"+
		"\13\"\5\"\u0188\n\"\3\"\5\"\u018b\n\"\3#\3#\3#\3#\5#\u0191\n#\3#\3#\5"+
		"#\u0195\n#\7#\u0197\n#\f#\16#\u019a\13#\3$\7$\u019d\n$\f$\16$\u01a0\13"+
		"$\3$\3$\5$\u01a4\n$\3$\3$\5$\u01a8\n$\3$\3$\5$\u01ac\n$\5$\u01ae\n$\3"+
		"%\6%\u01b1\n%\r%\16%\u01b2\3&\7&\u01b6\n&\f&\16&\u01b9\13&\3&\3&\5&\u01bd"+
		"\n&\3&\3&\3\'\3\'\3\'\7\'\u01c4\n\'\f\'\16\'\u01c7\13\'\3(\3(\5(\u01cb"+
		"\n(\3)\3)\5)\u01cf\n)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\5*\u01e1\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\7*\u01f6\n*\f*\16*\u01f9\13*\3+\3+\3+\3+\5+\u01ff\n+\3,\7,\u0202\n,\f"+
		",\16,\u0205\13,\3,\3,\3-\7-\u020a\n-\f-\16-\u020d\13-\3-\3-\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\5/\u021a\n/\3\60\3\60\3\60\7\60\u021f\n\60\f\60\16\60"+
		"\u0222\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u022e"+
		"\n\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\7\65"+
		"\u023c\n\65\f\65\16\65\u023f\13\65\3\66\3\66\3\66\3\66\5\66\u0245\n\66"+
		"\5\66\u0247\n\66\3\66\5\66\u024a\n\66\3\67\3\67\38\38\39\39\3:\3:\3;\3"+
		";\3<\3<\3<\3<\6<\u025a\n<\r<\16<\u025b\3=\3=\5=\u0260\n=\3=\6=\u0263\n"+
		"=\r=\16=\u0264\3=\2\3R>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\20\3\3VV\3\2\5\6\4"+
		"\2!!\'*\4\2=>YY\6\2EFIJNNPP\6\2DHKMOOQR\3\2IJ\4\2==YY\3\2+-\3\2\62\66"+
		"\3\28:\3\2$&\3\2AC\3\2BC\2\u029a\2\u0081\3\2\2\2\4\u0089\3\2\2\2\6\u008d"+
		"\3\2\2\2\b\u0092\3\2\2\2\n\u0097\3\2\2\2\f\u009f\3\2\2\2\16\u00a8\3\2"+
		"\2\2\20\u00aa\3\2\2\2\22\u00b3\3\2\2\2\24\u00bf\3\2\2\2\26\u00cf\3\2\2"+
		"\2\30\u00d4\3\2\2\2\32\u00e1\3\2\2\2\34\u00e3\3\2\2\2\36\u00e6\3\2\2\2"+
		" \u00e9\3\2\2\2\"\u00f2\3\2\2\2$\u00f5\3\2\2\2&\u00fb\3\2\2\2(\u00fd\3"+
		"\2\2\2*\u0109\3\2\2\2,\u010b\3\2\2\2.\u0114\3\2\2\2\60\u0121\3\2\2\2\62"+
		"\u0128\3\2\2\2\64\u012e\3\2\2\2\66\u0135\3\2\2\28\u0137\3\2\2\2:\u0141"+
		"\3\2\2\2<\u0147\3\2\2\2>\u0156\3\2\2\2@\u015b\3\2\2\2B\u018a\3\2\2\2D"+
		"\u018c\3\2\2\2F\u019e\3\2\2\2H\u01b0\3\2\2\2J\u01b7\3\2\2\2L\u01c0\3\2"+
		"\2\2N\u01c8\3\2\2\2P\u01cc\3\2\2\2R\u01e0\3\2\2\2T\u01fe\3\2\2\2V\u0203"+
		"\3\2\2\2X\u020b\3\2\2\2Z\u0210\3\2\2\2\\\u0219\3\2\2\2^\u021b\3\2\2\2"+
		"`\u022d\3\2\2\2b\u022f\3\2\2\2d\u0231\3\2\2\2f\u0233\3\2\2\2h\u0238\3"+
		"\2\2\2j\u0249\3\2\2\2l\u024b\3\2\2\2n\u024d\3\2\2\2p\u024f\3\2\2\2r\u0251"+
		"\3\2\2\2t\u0253\3\2\2\2v\u0259\3\2\2\2x\u0262\3\2\2\2z\u0080\5\4\3\2{"+
		"\u0080\5\34\17\2|\u0080\5\36\20\2}\u0080\5B\"\2~\u0080\7]\2\2\177z\3\2"+
		"\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\3\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u008a\5\6\4\2\u0085\u008a\5\b\5\2\u0086\u008a\5\n\6\2\u0087"+
		"\u008a\5\f\7\2\u0088\u008a\5\16\b\2\u0089\u0084\3\2\2\2\u0089\u0085\3"+
		"\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\t\2\2\2\u008c\5\3\2\2\2\u008d\u008e\7\t\2\2"+
		"\u008e\u0090\7B\2\2\u008f\u0091\7\n\2\2\u0090\u008f\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\7\3\2\2\2\u0092\u0093\7\13\2\2\u0093\u0095\7B\2\2\u0094"+
		"\u0096\7B\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\t\3\2\2\2"+
		"\u0097\u009d\7\4\2\2\u0098\u0099\t\3\2\2\u0099\u009a\7_\2\2\u009a\u009b"+
		"\7\b\2\2\u009b\u009e\7`\2\2\u009c\u009e\7\7\2\2\u009d\u0098\3\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\13\3\2\2\2\u009f\u00a6\7\f\2\2\u00a0\u00a1\7Y\2\2"+
		"\u00a1\u00a2\7\\\2\2\u00a2\u00a7\7\16\2\2\u00a3\u00a4\7\17\2\2\u00a4\u00a5"+
		"\7\\\2\2\u00a5\u00a7\7\r\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7"+
		"\r\3\2\2\2\u00a8\u00a9\7\3\2\2\u00a9\17\3\2\2\2\u00aa\u00ab\5\22\n\2\u00ab"+
		"\u00ac\7Y\2\2\u00ac\u00ae\7_\2\2\u00ad\u00af\5\26\f\2\u00ae\u00ad\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7`\2\2\u00b1"+
		"\21\3\2\2\2\u00b2\u00b4\5l\67\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2"+
		"\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\5\24\13\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00bd\3\2\2\2\u00b8\u00ba\5Z.\2\u00b9\u00bb\5x=\2"+
		"\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00be"+
		"\7\35\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\23\3\2\2\2\u00bf"+
		"\u00c4\7#\2\2\u00c0\u00c1\7_\2\2\u00c1\u00c2\5^\60\2\u00c2\u00c3\7`\2"+
		"\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\25"+
		"\3\2\2\2\u00c6\u00cb\5\30\r\2\u00c7\u00c8\7[\2\2\u00c8\u00ca\5\30\r\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\7\35\2\2"+
		"\u00cf\u00c6\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\27\3\2\2\2\u00d1\u00d3"+
		"\5\32\16\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dc"+
		"\5Z.\2\u00d8\u00da\7Y\2\2\u00d9\u00db\5x=\2\u00da\u00d9\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\31\3\2\2\2\u00de\u00e2\t\4\2\2\u00df\u00e2\5d\63\2\u00e0\u00e2"+
		"\5l\67\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\33\3\2\2\2\u00e3\u00e4\5\20\t\2\u00e4\u00e5\7]\2\2\u00e5\35\3\2\2\2\u00e6"+
		"\u00e7\5\20\t\2\u00e7\u00e8\5(\25\2\u00e8\37\3\2\2\2\u00e9\u00ea\t\5\2"+
		"\2\u00ea\u00ec\7_\2\2\u00eb\u00ed\5\"\22\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7`\2\2\u00ef!\3\2\2\2\u00f0\u00f3"+
		"\5R*\2\u00f1\u00f3\7\35\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"#\3\2\2\2\u00f4\u00f6\5&\24\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8%\3\2\2\2\u00f9\u00fc\5"+
		"(\25\2\u00fa\u00fc\5*\26\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\'\3\2\2\2\u00fd\u00ff\7a\2\2\u00fe\u0100\5$\23\2\u00ff\u00fe\3\2\2\2"+
		"\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7b\2\2\u0102)\3\2"+
		"\2\2\u0103\u010a\5B\"\2\u0104\u010a\5@!\2\u0105\u010a\5,\27\2\u0106\u010a"+
		"\5\66\34\2\u0107\u010a\5> \2\u0108\u010a\5.\30\2\u0109\u0103\3\2\2\2\u0109"+
		"\u0104\3\2\2\2\u0109\u0105\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u0108\3\2\2\2\u010a+\3\2\2\2\u010b\u010c\7\30\2\2\u010c\u010d"+
		"\7_\2\2\u010d\u010e\5R*\2\u010e\u010f\7`\2\2\u010f\u0112\5&\24\2\u0110"+
		"\u0111\7\31\2\2\u0111\u0113\5&\24\2\u0112\u0110\3\2\2\2\u0112\u0113\3"+
		"\2\2\2\u0113-\3\2\2\2\u0114\u0115\7\25\2\2\u0115\u0116\7_\2\2\u0116\u0117"+
		"\5R*\2\u0117\u0118\7`\2\2\u0118\u011c\7a\2\2\u0119\u011b\5\60\31\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7b\2\2\u0120"+
		"/\3\2\2\2\u0121\u0123\5\62\32\2\u0122\u0124\5\64\33\2\u0123\u0122\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\61\3\2\2\2\u0125\u0129\7\27\2\2\u0126\u0127"+
		"\7\26\2\2\u0127\u0129\5T+\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012b\7\\\2\2\u012b\63\3\2\2\2\u012c\u012f\5B\"\2"+
		"\u012d\u012f\5@!\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\65\3\2\2\2\u0132"+
		"\u0136\58\35\2\u0133\u0136\5:\36\2\u0134\u0136\5<\37\2\u0135\u0132\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\67\3\2\2\2\u0137\u0138"+
		"\7\23\2\2\u0138\u0139\7_\2\2\u0139\u013a\5D#\2\u013a\u013b\7]\2\2\u013b"+
		"\u013c\5R*\2\u013c\u013d\7]\2\2\u013d\u013e\5R*\2\u013e\u013f\7`\2\2\u013f"+
		"\u0140\5&\24\2\u01409\3\2\2\2\u0141\u0142\7\24\2\2\u0142\u0143\7_\2\2"+
		"\u0143\u0144\5R*\2\u0144\u0145\7`\2\2\u0145\u0146\5&\24\2\u0146;\3\2\2"+
		"\2\u0147\u0148\7\22\2\2\u0148\u0149\5&\24\2\u0149\u014a\7\24\2\2\u014a"+
		"\u014b\7_\2\2\u014b\u014c\5R*\2\u014c\u014d\7`\2\2\u014d\u014e\7]\2\2"+
		"\u014e=\3\2\2\2\u014f\u0157\7\21\2\2\u0150\u0157\7\20\2\2\u0151\u0157"+
		"\7\32\2\2\u0152\u0154\7\33\2\2\u0153\u0155\5R*\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u014f\3\2\2\2\u0156\u0150\3\2"+
		"\2\2\u0156\u0151\3\2\2\2\u0156\u0152\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\7]\2\2\u0159?\3\2\2\2\u015a\u015c\5R*\2\u015b\u015a\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7]\2\2\u015eA\3\2\2\2\u015f"+
		"\u0160\7\37\2\2\u0160\u0161\5l\67\2\u0161\u0162\5Z.\2\u0162\u0163\7]\2"+
		"\2\u0163\u018b\3\2\2\2\u0164\u0165\5D#\2\u0165\u0166\7]\2\2\u0166\u018b"+
		"\3\2\2\2\u0167\u0169\5\\/\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016d\u016e\7Y\2\2\u016e\u016f\7a\2\2\u016f\u0170\5H%\2\u0170\u0175"+
		"\7b\2\2\u0171\u0173\7Y\2\2\u0172\u0174\5x=\2\u0173\u0172\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0171\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7]\2\2\u0178\u018b\3\2\2\2\u0179"+
		"\u017b\5\\/\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u0187\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0184\7Y\2\2\u0180\u0181\7[\2\2\u0181\u0183\7Y\2\2\u0182\u0180\3\2\2"+
		"\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0188"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u017f\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\7]\2\2\u018a\u015f\3\2\2\2\u018a\u0164\3\2"+
		"\2\2\u018a\u016a\3\2\2\2\u018a\u017c\3\2\2\2\u018bC\3\2\2\2\u018c\u0198"+
		"\5F$\2\u018d\u018e\7[\2\2\u018e\u0190\7Y\2\2\u018f\u0191\5x=\2\u0190\u018f"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0193\7R\2\2\u0193"+
		"\u0195\5R*\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2"+
		"\2\u0196\u018d\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199E\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d\5\\/\2\u019c\u019b"+
		"\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a3\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a4\5Z.\2\u01a2\u01a4\5P)\2"+
		"\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01ad\3\2\2\2\u01a5\u01a7"+
		"\7Y\2\2\u01a6\u01a8\5x=\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01ab\3\2\2\2\u01a9\u01aa\7R\2\2\u01aa\u01ac\5R*\2\u01ab\u01a9\3\2\2"+
		"\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01aeG\3\2\2\2\u01af\u01b1\5J&\2\u01b0\u01af\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3I\3\2\2\2\u01b4"+
		"\u01b6\5\\/\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bc\5Z.\2\u01bb\u01bd\5L\'\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2"+
		"\2\u01bd\u01be\3\2\2\2\u01be\u01bf\7]\2\2\u01bfK\3\2\2\2\u01c0\u01c5\5"+
		"N(\2\u01c1\u01c2\7[\2\2\u01c2\u01c4\5N(\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7"+
		"\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6M\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01ca\7Y\2\2\u01c9\u01cb\5x=\2\u01ca\u01c9\3\2\2"+
		"\2\u01ca\u01cb\3\2\2\2\u01cbO\3\2\2\2\u01cc\u01ce\7\34\2\2\u01cd\u01cf"+
		"\7Y\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d1\7a\2\2\u01d1\u01d2\5H%\2\u01d2\u01d3\7b\2\2\u01d3Q\3\2\2\2\u01d4"+
		"\u01d5\b*\1\2\u01d5\u01e1\7?\2\2\u01d6\u01e1\7@\2\2\u01d7\u01e1\7Y\2\2"+
		"\u01d8\u01e1\5 \21\2\u01d9\u01e1\5p9\2\u01da\u01db\7_\2\2\u01db\u01dc"+
		"\5R*\2\u01dc\u01dd\7`\2\2\u01dd\u01e1\3\2\2\2\u01de\u01df\t\6\2\2\u01df"+
		"\u01e1\5R*\t\u01e0\u01d4\3\2\2\2\u01e0\u01d6\3\2\2\2\u01e0\u01d7\3\2\2"+
		"\2\u01e0\u01d8\3\2\2\2\u01e0\u01d9\3\2\2\2\u01e0\u01da\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e1\u01f7\3\2\2\2\u01e2\u01e3\f\7\2\2\u01e3\u01e4\t\7\2\2\u01e4"+
		"\u01f6\5R*\b\u01e5\u01e6\f\6\2\2\u01e6\u01e7\7^\2\2\u01e7\u01e8\5R*\2"+
		"\u01e8\u01e9\7\\\2\2\u01e9\u01ea\5R*\7\u01ea\u01f6\3\2\2\2\u01eb\u01ec"+
		"\f\3\2\2\u01ec\u01ed\7[\2\2\u01ed\u01f6\5R*\4\u01ee\u01ef\f\b\2\2\u01ef"+
		"\u01f6\t\b\2\2\u01f0\u01f1\f\5\2\2\u01f1\u01f2\7Z\2\2\u01f2\u01f6\7Y\2"+
		"\2\u01f3\u01f4\f\4\2\2\u01f4\u01f6\5v<\2\u01f5\u01e2\3\2\2\2\u01f5\u01e5"+
		"\3\2\2\2\u01f5\u01eb\3\2\2\2\u01f5\u01ee\3\2\2\2\u01f5\u01f0\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8S\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01ff\5p9\2\u01fb\u01ff"+
		"\7?\2\2\u01fc\u01ff\7@\2\2\u01fd\u01ff\7Y\2\2\u01fe\u01fa\3\2\2\2\u01fe"+
		"\u01fb\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ffU\3\2\2\2"+
		"\u0200\u0202\5\\/\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206"+
		"\u0207\5Z.\2\u0207W\3\2\2\2\u0208\u020a\5\\/\2\u0209\u0208\3\2\2\2\u020a"+
		"\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2"+
		"\2\2\u020d\u020b\3\2\2\2\u020e\u020f\5P)\2\u020fY\3\2\2\2\u0210\u0211"+
		"\t\t\2\2\u0211[\3\2\2\2\u0212\u021a\5`\61\2\u0213\u021a\5f\64\2\u0214"+
		"\u021a\5l\67\2\u0215\u021a\5n8\2\u0216\u021a\7\"\2\2\u0217\u021a\7!\2"+
		"\2\u0218\u021a\7#\2\2\u0219\u0212\3\2\2\2\u0219\u0213\3\2\2\2\u0219\u0214"+
		"\3\2\2\2\u0219\u0215\3\2\2\2\u0219\u0216\3\2\2\2\u0219\u0217\3\2\2\2\u0219"+
		"\u0218\3\2\2\2\u021a]\3\2\2\2\u021b\u0220\7Y\2\2\u021c\u021d\7[\2\2\u021d"+
		"\u021f\7Y\2\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221_\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u022e"+
		"\5d\63\2\u0224\u022e\5b\62\2\u0225\u022e\7\'\2\2\u0226\u022e\7)\2\2\u0227"+
		"\u022e\7*\2\2\u0228\u022e\7\61\2\2\u0229\u022e\7.\2\2\u022a\u022e\7\60"+
		"\2\2\u022b\u022e\7/\2\2\u022c\u022e\7\67\2\2\u022d\u0223\3\2\2\2\u022d"+
		"\u0224\3\2\2\2\u022d\u0225\3\2\2\2\u022d\u0226\3\2\2\2\u022d\u0227\3\2"+
		"\2\2\u022d\u0228\3\2\2\2\u022d\u0229\3\2\2\2\u022d\u022a\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022d\u022c\3\2\2\2\u022ea\3\2\2\2\u022f\u0230\t\n\2\2"+
		"\u0230c\3\2\2\2\u0231\u0232\t\13\2\2\u0232e\3\2\2\2\u0233\u0234\7 \2\2"+
		"\u0234\u0235\7_\2\2\u0235\u0236\5h\65\2\u0236\u0237\7`\2\2\u0237g\3\2"+
		"\2\2\u0238\u023d\5j\66\2\u0239\u023a\7[\2\2\u023a\u023c\5j\66\2\u023b"+
		"\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023ei\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0246\7;\2\2\u0241\u0244"+
		"\7R\2\2\u0242\u0245\7<\2\2\u0243\u0245\5p9\2\u0244\u0242\3\2\2\2\u0244"+
		"\u0243\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0241\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u024a\3\2\2\2\u0248\u024a\7\67\2\2\u0249\u0240\3\2\2\2\u0249"+
		"\u0248\3\2\2\2\u024ak\3\2\2\2\u024b\u024c\t\f\2\2\u024cm\3\2\2\2\u024d"+
		"\u024e\t\r\2\2\u024eo\3\2\2\2\u024f\u0250\t\16\2\2\u0250q\3\2\2\2\u0251"+
		"\u0252\7A\2\2\u0252s\3\2\2\2\u0253\u0254\t\17\2\2\u0254u\3\2\2\2\u0255"+
		"\u0256\7c\2\2\u0256\u0257\5T+\2\u0257\u0258\7d\2\2\u0258\u025a\3\2\2\2"+
		"\u0259\u0255\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025cw\3\2\2\2\u025d\u025f\7c\2\2\u025e\u0260\5T+\2\u025f\u025e"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\7d\2\2\u0262"+
		"\u025d\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265y\3\2\2\2J\177\u0081\u0089\u0090\u0095\u009d\u00a6\u00ae\u00b3"+
		"\u00b6\u00ba\u00bd\u00c4\u00cb\u00cf\u00d4\u00da\u00dc\u00e1\u00ec\u00f2"+
		"\u00f7\u00fb\u00ff\u0109\u0112\u011c\u0123\u0128\u012e\u0130\u0135\u0154"+
		"\u0156\u015b\u016a\u0173\u0175\u017c\u0184\u0187\u018a\u0190\u0194\u0198"+
		"\u019e\u01a3\u01a7\u01ab\u01ad\u01b2\u01b7\u01bc\u01c5\u01ca\u01ce\u01e0"+
		"\u01f5\u01f7\u01fe\u0203\u020b\u0219\u0220\u022d\u023d\u0244\u0246\u0249"+
		"\u025b\u025f\u0264";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}