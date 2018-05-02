// Generated from GLSLParser.g4 by ANTLR 4.7.1
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
		PD_ERROR=1, PD_PRAGMA=2, PD_VERSION=3, PD_LINE=4, PD_EXTENSION=5, PD_ELSE=6, 
		PD_ENDIF=7, PD_UNDEF=8, PD_IFDEF=9, PD_IFNDEF=10, PD_IF=11, PD_ELIF=12, 
		PD_DEFINE=13, KW_BREAK=14, KW_CONTINUE=15, KW_DO=16, KW_FOR=17, KW_WHILE=18, 
		KW_SWITCH=19, KW_CASE=20, KW_DEFAULT=21, KW_IF=22, KW_ELSE=23, KW_DISCARD=24, 
		KW_RETURN=25, KW_STRUCT=26, KW_VOID=27, RESERVED_KEYWORD=28, Q_PRECISION=29, 
		Q_LAYOUT=30, Q_PRECISE=31, Q_INVARIANT=32, Q_SUBROUTINE=33, Q_SMOOTH=34, 
		Q_FLAT=35, Q_NONPERSPECTIVE=36, Q_CONST=37, Q_INOUT=38, Q_IN=39, Q_OUT=40, 
		Q_CENTROID=41, Q_PATCH=42, Q_SAMPLE=43, Q_UNIFORM=44, Q_BUFFER=45, Q_VARYING=46, 
		Q_ATTRIBUTE=47, Q_COHERENT=48, Q_VOLATILE=49, Q_RESTRICT=50, Q_READONLY=51, 
		Q_WRIREONLY=52, Q_SHARED=53, Q_HIGHP=54, Q_MEDIUMP=55, Q_LOWP=56, TYPE=57, 
		BI_FUNCTION=58, BI_MACRO=59, BI_VARIABLE=60, BOOL_LITERAL=61, INT_LITERAL=62, 
		FLOAT_LITERAL=63, OP_MUL=64, OP_ADD=65, OP_SUB=66, OP_DIV=67, OP_MOD=68, 
		OP_INC=69, OP_DEC=70, OP_SHIFT=71, OP_RELATIONAL=72, OP_BIT=73, OP_BIT_UNARY=74, 
		OP_LOGICAL=75, OP_LOGICAL_UNARY=76, OP_MODIFY=77, OP_ASSIGN=78, MULTI_LINE_COMMENT=79, 
		ONE_LINE_MULTI_LINE_COMMENT=80, SINGLE_LINE_COMMENT=81, NEW_LINE=82, SPACE=83, 
		TAB=84, IDENTIFIER=85, DOT=86, COMMA=87, COLON=88, SEMICOLON=89, QUESTION=90, 
		LRB=91, RRB=92, LCB=93, RCB=94, LSB=95, RSB=96, PDA_PRAGMA_DEBUG=97, PDA_PRAGMA_OPTIMIZE=98, 
		PDA_PRAGMA_STDGL=99, PDA_PRAGMA_TOGGLE=100, PDA_VERSION_PROFILE=101, PDA_EXTENSION_ALL_BEHAVIOUR=102, 
		PDA_EXTENSION_BEHAVIOUR=103, PDA_EXTENSION_ALL=104, M_SINGLE_LINE_COMMENT=105, 
		M_MULTI_LINE_COMMENT=106, M_ONE_LINE_MULTI_LINE_COMMENT=107, M_OPERATOR=108, 
		M_NEW_LINE=109, M_INT_LITERAL=110, M_FLOAT_LITERAL=111, M_CHARACTERS=112, 
		M_COMMA=113, M_LRB=114, M_RRB=115, M_COLON=116, M_IDENTIFIER=117, M_SPACE=118, 
		M_TAB=119, QP_LAYOUT=120, QPV_LAYOUT=121, L_LRB=122, L_RRB=123, L_COMMA=124, 
		L_SHARED=125, L_ASSIGN=126, L_BOOL_LITERAL=127, L_INT_LITERAL=128, L_FLOAT_LITERAL=129;
	public static final int
		RULE_start = 0, RULE_macro = 1, RULE_m_version = 2, RULE_m_line = 3, RULE_m_pragma = 4, 
		RULE_m_extension = 5, RULE_m_define = 6, RULE_m_define_content = 7, RULE_m_parameter_expression = 8, 
		RULE_m_parameter_identifier = 9, RULE_m_parameterless = 10, RULE_macro_termination = 11, 
		RULE_function_signature = 12, RULE_return_type = 13, RULE_function_subroutine_qualifier = 14, 
		RULE_function_parameter_list = 15, RULE_function_parameter = 16, RULE_parameter_qualifier = 17, 
		RULE_function_prototype = 18, RULE_function_definition = 19, RULE_function_call = 20, 
		RULE_function_call_parameter_list = 21, RULE_statement_list = 22, RULE_statement = 23, 
		RULE_compound_statement = 24, RULE_simple_statement = 25, RULE_selection_statement = 26, 
		RULE_switch_statement = 27, RULE_case_group = 28, RULE_case_label = 29, 
		RULE_case_statement_list = 30, RULE_iteration_statement = 31, RULE_for_iteration = 32, 
		RULE_while_iteration = 33, RULE_do_while_iteration = 34, RULE_jump_statement = 35, 
		RULE_expression_statement = 36, RULE_declaration_statement = 37, RULE_init_declaration_list = 38, 
		RULE_single_declaration = 39, RULE_struct_declaration_list = 40, RULE_struct_declaration = 41, 
		RULE_struct_declarator_list = 42, RULE_struct_declarator = 43, RULE_struct_specifier = 44, 
		RULE_expression = 45, RULE_constant_expression = 46, RULE_fully_specified_type = 47, 
		RULE_fully_specified_struct = 48, RULE_type = 49, RULE_type_qualifier = 50, 
		RULE_type_name_list = 51, RULE_storage_qualifier = 52, RULE_auxiliary_storage_qualifier = 53, 
		RULE_memory_storage_qualifier = 54, RULE_layout_qualifier = 55, RULE_layout_qualifier_id_list = 56, 
		RULE_layout_qualifier_id = 57, RULE_l_literal = 58, RULE_precision_qualifier = 59, 
		RULE_interpolation_qualifier = 60, RULE_literal = 61, RULE_bool_literal = 62, 
		RULE_number_literal = 63, RULE_array_usage = 64, RULE_array_declaration = 65;
	public static final String[] ruleNames = {
		"start", "macro", "m_version", "m_line", "m_pragma", "m_extension", "m_define", 
		"m_define_content", "m_parameter_expression", "m_parameter_identifier", 
		"m_parameterless", "macro_termination", "function_signature", "return_type", 
		"function_subroutine_qualifier", "function_parameter_list", "function_parameter", 
		"parameter_qualifier", "function_prototype", "function_definition", "function_call", 
		"function_call_parameter_list", "statement_list", "statement", "compound_statement", 
		"simple_statement", "selection_statement", "switch_statement", "case_group", 
		"case_label", "case_statement_list", "iteration_statement", "for_iteration", 
		"while_iteration", "do_while_iteration", "jump_statement", "expression_statement", 
		"declaration_statement", "init_declaration_list", "single_declaration", 
		"struct_declaration_list", "struct_declaration", "struct_declarator_list", 
		"struct_declarator", "struct_specifier", "expression", "constant_expression", 
		"fully_specified_type", "fully_specified_struct", "type", "type_qualifier", 
		"type_name_list", "storage_qualifier", "auxiliary_storage_qualifier", 
		"memory_storage_qualifier", "layout_qualifier", "layout_qualifier_id_list", 
		"layout_qualifier_id", "l_literal", "precision_qualifier", "interpolation_qualifier", 
		"literal", "bool_literal", "number_literal", "array_usage", "array_declaration"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#error'", "'#pragma'", "'#version'", "'#line'", "'#extension'", 
		"'#else'", "'#endif'", "'#undef'", "'#ifdef'", "'#ifndef'", "'#if'", "'#elif'", 
		"'#define'", "'break'", "'continue'", "'do'", "'for'", "'while'", "'switch'", 
		"'case'", "'default'", "'if'", "'else'", "'discard'", "'return'", "'struct'", 
		"'void'", null, "'precision'", "'layout'", "'precise'", "'invariant'", 
		"'subroutine'", "'smooth'", "'flat'", "'noperspective'", "'const'", "'inout'", 
		"'in'", "'out'", "'centroid'", "'patch'", "'sample'", "'uniform'", "'buffer'", 
		"'varying'", "'attribute'", "'coherent'", "'volatile'", "'restrict'", 
		"'readonly'", "'writeonly'", null, "'highp'", "'mediump'", "'lowp'", null, 
		null, null, null, null, null, null, "'*'", "'+'", "'-'", "'/'", "'%'", 
		"'++'", "'--'", null, null, null, "'~'", null, "'!'", null, null, null, 
		null, null, null, null, null, null, "'.'", null, null, "';'", "'?'", null, 
		null, "'{'", "'}'", "'['", "']'", "'debug'", "'optimize'", "'STDGL'", 
		null, null, null, null, "'all'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PD_ERROR", "PD_PRAGMA", "PD_VERSION", "PD_LINE", "PD_EXTENSION", 
		"PD_ELSE", "PD_ENDIF", "PD_UNDEF", "PD_IFDEF", "PD_IFNDEF", "PD_IF", "PD_ELIF", 
		"PD_DEFINE", "KW_BREAK", "KW_CONTINUE", "KW_DO", "KW_FOR", "KW_WHILE", 
		"KW_SWITCH", "KW_CASE", "KW_DEFAULT", "KW_IF", "KW_ELSE", "KW_DISCARD", 
		"KW_RETURN", "KW_STRUCT", "KW_VOID", "RESERVED_KEYWORD", "Q_PRECISION", 
		"Q_LAYOUT", "Q_PRECISE", "Q_INVARIANT", "Q_SUBROUTINE", "Q_SMOOTH", "Q_FLAT", 
		"Q_NONPERSPECTIVE", "Q_CONST", "Q_INOUT", "Q_IN", "Q_OUT", "Q_CENTROID", 
		"Q_PATCH", "Q_SAMPLE", "Q_UNIFORM", "Q_BUFFER", "Q_VARYING", "Q_ATTRIBUTE", 
		"Q_COHERENT", "Q_VOLATILE", "Q_RESTRICT", "Q_READONLY", "Q_WRIREONLY", 
		"Q_SHARED", "Q_HIGHP", "Q_MEDIUMP", "Q_LOWP", "TYPE", "BI_FUNCTION", "BI_MACRO", 
		"BI_VARIABLE", "BOOL_LITERAL", "INT_LITERAL", "FLOAT_LITERAL", "OP_MUL", 
		"OP_ADD", "OP_SUB", "OP_DIV", "OP_MOD", "OP_INC", "OP_DEC", "OP_SHIFT", 
		"OP_RELATIONAL", "OP_BIT", "OP_BIT_UNARY", "OP_LOGICAL", "OP_LOGICAL_UNARY", 
		"OP_MODIFY", "OP_ASSIGN", "MULTI_LINE_COMMENT", "ONE_LINE_MULTI_LINE_COMMENT", 
		"SINGLE_LINE_COMMENT", "NEW_LINE", "SPACE", "TAB", "IDENTIFIER", "DOT", 
		"COMMA", "COLON", "SEMICOLON", "QUESTION", "LRB", "RRB", "LCB", "RCB", 
		"LSB", "RSB", "PDA_PRAGMA_DEBUG", "PDA_PRAGMA_OPTIMIZE", "PDA_PRAGMA_STDGL", 
		"PDA_PRAGMA_TOGGLE", "PDA_VERSION_PROFILE", "PDA_EXTENSION_ALL_BEHAVIOUR", 
		"PDA_EXTENSION_BEHAVIOUR", "PDA_EXTENSION_ALL", "M_SINGLE_LINE_COMMENT", 
		"M_MULTI_LINE_COMMENT", "M_ONE_LINE_MULTI_LINE_COMMENT", "M_OPERATOR", 
		"M_NEW_LINE", "M_INT_LITERAL", "M_FLOAT_LITERAL", "M_CHARACTERS", "M_COMMA", 
		"M_LRB", "M_RRB", "M_COLON", "M_IDENTIFIER", "M_SPACE", "M_TAB", "QP_LAYOUT", 
		"QPV_LAYOUT", "L_LRB", "L_RRB", "L_COMMA", "L_SHARED", "L_ASSIGN", "L_BOOL_LITERAL", 
		"L_INT_LITERAL", "L_FLOAT_LITERAL"
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
	public String getGrammarFileName() { return "GLSLParser.g4"; }

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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PD_ERROR) | (1L << PD_PRAGMA) | (1L << PD_VERSION) | (1L << PD_LINE) | (1L << PD_EXTENSION) | (1L << PD_ELSE) | (1L << PD_ENDIF) | (1L << PD_UNDEF) | (1L << PD_IFDEF) | (1L << PD_IFNDEF) | (1L << PD_IF) | (1L << PD_ELIF) | (1L << KW_STRUCT) | (1L << KW_VOID) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE))) != 0) || _la==IDENTIFIER || _la==SEMICOLON) {
				{
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(132);
					macro();
					}
					break;
				case 2:
					{
					setState(133);
					function_prototype();
					}
					break;
				case 3:
					{
					setState(134);
					function_definition();
					}
					break;
				case 4:
					{
					setState(135);
					declaration_statement();
					}
					break;
				case 5:
					{
					setState(136);
					match(SEMICOLON);
					}
					break;
				}
				}
				setState(141);
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
		public Macro_terminationContext macro_termination() {
			return getRuleContext(Macro_terminationContext.class,0);
		}
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
		public M_parameter_expressionContext m_parameter_expression() {
			return getRuleContext(M_parameter_expressionContext.class,0);
		}
		public M_parameter_identifierContext m_parameter_identifier() {
			return getRuleContext(M_parameter_identifierContext.class,0);
		}
		public M_parameterlessContext m_parameterless() {
			return getRuleContext(M_parameterlessContext.class,0);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitMacro(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_macro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PD_VERSION:
				{
				setState(142);
				m_version();
				}
				break;
			case PD_LINE:
				{
				setState(143);
				m_line();
				}
				break;
			case PD_PRAGMA:
				{
				setState(144);
				m_pragma();
				}
				break;
			case PD_EXTENSION:
				{
				setState(145);
				m_extension();
				}
				break;
			case PD_IF:
			case PD_ELIF:
				{
				setState(146);
				m_parameter_expression();
				}
				break;
			case PD_UNDEF:
			case PD_IFDEF:
			case PD_IFNDEF:
				{
				setState(147);
				m_parameter_identifier();
				}
				break;
			case PD_ERROR:
			case PD_ELSE:
			case PD_ENDIF:
				{
				setState(148);
				m_parameterless();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(151);
			macro_termination();
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
		public TerminalNode M_INT_LITERAL() { return getToken(GLSLParser.M_INT_LITERAL, 0); }
		public TerminalNode PDA_VERSION_PROFILE() { return getToken(GLSLParser.PDA_VERSION_PROFILE, 0); }
		public M_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterM_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitM_version(this);
		}
	}

	public final M_versionContext m_version() throws RecognitionException {
		M_versionContext _localctx = new M_versionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_m_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(PD_VERSION);
			setState(154);
			match(M_INT_LITERAL);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PDA_VERSION_PROFILE) {
				{
				setState(155);
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
		public List<TerminalNode> M_INT_LITERAL() { return getTokens(GLSLParser.M_INT_LITERAL); }
		public TerminalNode M_INT_LITERAL(int i) {
			return getToken(GLSLParser.M_INT_LITERAL, i);
		}
		public M_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterM_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitM_line(this);
		}
	}

	public final M_lineContext m_line() throws RecognitionException {
		M_lineContext _localctx = new M_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_m_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(PD_LINE);
			setState(159);
			match(M_INT_LITERAL);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==M_INT_LITERAL) {
				{
				setState(160);
				match(M_INT_LITERAL);
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
		public TerminalNode M_LRB() { return getToken(GLSLParser.M_LRB, 0); }
		public TerminalNode PDA_PRAGMA_TOGGLE() { return getToken(GLSLParser.PDA_PRAGMA_TOGGLE, 0); }
		public TerminalNode M_RRB() { return getToken(GLSLParser.M_RRB, 0); }
		public TerminalNode PDA_PRAGMA_DEBUG() { return getToken(GLSLParser.PDA_PRAGMA_DEBUG, 0); }
		public TerminalNode PDA_PRAGMA_OPTIMIZE() { return getToken(GLSLParser.PDA_PRAGMA_OPTIMIZE, 0); }
		public M_pragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterM_pragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitM_pragma(this);
		}
	}

	public final M_pragmaContext m_pragma() throws RecognitionException {
		M_pragmaContext _localctx = new M_pragmaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_m_pragma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(PD_PRAGMA);
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PDA_PRAGMA_DEBUG:
			case PDA_PRAGMA_OPTIMIZE:
				{
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==PDA_PRAGMA_DEBUG || _la==PDA_PRAGMA_OPTIMIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				match(M_LRB);
				setState(166);
				match(PDA_PRAGMA_TOGGLE);
				setState(167);
				match(M_RRB);
				}
				}
				break;
			case PDA_PRAGMA_STDGL:
				{
				setState(168);
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
		public TerminalNode M_IDENTIFIER() { return getToken(GLSLParser.M_IDENTIFIER, 0); }
		public TerminalNode M_COLON() { return getToken(GLSLParser.M_COLON, 0); }
		public TerminalNode PDA_EXTENSION_BEHAVIOUR() { return getToken(GLSLParser.PDA_EXTENSION_BEHAVIOUR, 0); }
		public TerminalNode PDA_EXTENSION_ALL() { return getToken(GLSLParser.PDA_EXTENSION_ALL, 0); }
		public TerminalNode PDA_EXTENSION_ALL_BEHAVIOUR() { return getToken(GLSLParser.PDA_EXTENSION_ALL_BEHAVIOUR, 0); }
		public M_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterM_extension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitM_extension(this);
		}
	}

	public final M_extensionContext m_extension() throws RecognitionException {
		M_extensionContext _localctx = new M_extensionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_m_extension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(PD_EXTENSION);
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case M_IDENTIFIER:
				{
				setState(172);
				match(M_IDENTIFIER);
				setState(173);
				match(M_COLON);
				setState(174);
				match(PDA_EXTENSION_BEHAVIOUR);
				}
				break;
			case PDA_EXTENSION_ALL:
				{
				setState(175);
				match(PDA_EXTENSION_ALL);
				setState(176);
				match(M_COLON);
				setState(177);
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

	public static class M_defineContext extends ParserRuleContext {
		public TerminalNode PD_DEFINE() { return getToken(GLSLParser.PD_DEFINE, 0); }
		public List<TerminalNode> M_IDENTIFIER() { return getTokens(GLSLParser.M_IDENTIFIER); }
		public TerminalNode M_IDENTIFIER(int i) {
			return getToken(GLSLParser.M_IDENTIFIER, i);
		}
		public TerminalNode M_LRB() { return getToken(GLSLParser.M_LRB, 0); }
		public TerminalNode M_RRB() { return getToken(GLSLParser.M_RRB, 0); }
		public List<M_define_contentContext> m_define_content() {
			return getRuleContexts(M_define_contentContext.class);
		}
		public M_define_contentContext m_define_content(int i) {
			return getRuleContext(M_define_contentContext.class,i);
		}
		public List<TerminalNode> M_COMMA() { return getTokens(GLSLParser.M_COMMA); }
		public TerminalNode M_COMMA(int i) {
			return getToken(GLSLParser.M_COMMA, i);
		}
		public M_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterM_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitM_define(this);
		}
	}

	public final M_defineContext m_define() throws RecognitionException {
		M_defineContext _localctx = new M_defineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_m_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(PD_DEFINE);
			setState(181);
			match(M_IDENTIFIER);
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(182);
				match(M_LRB);
				setState(183);
				match(M_IDENTIFIER);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==M_COMMA) {
					{
					{
					setState(184);
					match(M_COMMA);
					setState(185);
					match(M_IDENTIFIER);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(M_RRB);
				}
				break;
			}
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (M_OPERATOR - 108)) | (1L << (M_INT_LITERAL - 108)) | (1L << (M_FLOAT_LITERAL - 108)) | (1L << (M_CHARACTERS - 108)) | (1L << (M_COMMA - 108)) | (1L << (M_LRB - 108)) | (1L << (M_RRB - 108)) | (1L << (M_COLON - 108)) | (1L << (M_IDENTIFIER - 108)))) != 0)) {
				{
				{
				setState(194);
				m_define_content();
				}
				}
				setState(199);
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

	public static class M_define_contentContext extends ParserRuleContext {
		public TerminalNode M_IDENTIFIER() { return getToken(GLSLParser.M_IDENTIFIER, 0); }
		public TerminalNode M_INT_LITERAL() { return getToken(GLSLParser.M_INT_LITERAL, 0); }
		public TerminalNode M_FLOAT_LITERAL() { return getToken(GLSLParser.M_FLOAT_LITERAL, 0); }
		public TerminalNode M_OPERATOR() { return getToken(GLSLParser.M_OPERATOR, 0); }
		public TerminalNode M_CHARACTERS() { return getToken(GLSLParser.M_CHARACTERS, 0); }
		public TerminalNode M_COLON() { return getToken(GLSLParser.M_COLON, 0); }
		public TerminalNode M_COMMA() { return getToken(GLSLParser.M_COMMA, 0); }
		public TerminalNode M_LRB() { return getToken(GLSLParser.M_LRB, 0); }
		public TerminalNode M_RRB() { return getToken(GLSLParser.M_RRB, 0); }
		public M_define_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_define_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterM_define_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitM_define_content(this);
		}
	}

	public final M_define_contentContext m_define_content() throws RecognitionException {
		M_define_contentContext _localctx = new M_define_contentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_m_define_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (M_OPERATOR - 108)) | (1L << (M_INT_LITERAL - 108)) | (1L << (M_FLOAT_LITERAL - 108)) | (1L << (M_CHARACTERS - 108)) | (1L << (M_COMMA - 108)) | (1L << (M_LRB - 108)) | (1L << (M_RRB - 108)) | (1L << (M_COLON - 108)) | (1L << (M_IDENTIFIER - 108)))) != 0)) ) {
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

	public static class M_parameter_expressionContext extends ParserRuleContext {
		public TerminalNode PD_IF() { return getToken(GLSLParser.PD_IF, 0); }
		public TerminalNode PD_ELIF() { return getToken(GLSLParser.PD_ELIF, 0); }
		public List<TerminalNode> M_IDENTIFIER() { return getTokens(GLSLParser.M_IDENTIFIER); }
		public TerminalNode M_IDENTIFIER(int i) {
			return getToken(GLSLParser.M_IDENTIFIER, i);
		}
		public List<TerminalNode> M_OPERATOR() { return getTokens(GLSLParser.M_OPERATOR); }
		public TerminalNode M_OPERATOR(int i) {
			return getToken(GLSLParser.M_OPERATOR, i);
		}
		public List<TerminalNode> M_INT_LITERAL() { return getTokens(GLSLParser.M_INT_LITERAL); }
		public TerminalNode M_INT_LITERAL(int i) {
			return getToken(GLSLParser.M_INT_LITERAL, i);
		}
		public M_parameter_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_parameter_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterM_parameter_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitM_parameter_expression(this);
		}
	}

	public final M_parameter_expressionContext m_parameter_expression() throws RecognitionException {
		M_parameter_expressionContext _localctx = new M_parameter_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_m_parameter_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(_la==PD_IF || _la==PD_ELIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (M_OPERATOR - 108)) | (1L << (M_INT_LITERAL - 108)) | (1L << (M_IDENTIFIER - 108)))) != 0)) {
				{
				{
				setState(203);
				_la = _input.LA(1);
				if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (M_OPERATOR - 108)) | (1L << (M_INT_LITERAL - 108)) | (1L << (M_IDENTIFIER - 108)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(208);
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

	public static class M_parameter_identifierContext extends ParserRuleContext {
		public TerminalNode M_IDENTIFIER() { return getToken(GLSLParser.M_IDENTIFIER, 0); }
		public TerminalNode PD_IFDEF() { return getToken(GLSLParser.PD_IFDEF, 0); }
		public TerminalNode PD_IFNDEF() { return getToken(GLSLParser.PD_IFNDEF, 0); }
		public TerminalNode PD_UNDEF() { return getToken(GLSLParser.PD_UNDEF, 0); }
		public M_parameter_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_parameter_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterM_parameter_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitM_parameter_identifier(this);
		}
	}

	public final M_parameter_identifierContext m_parameter_identifier() throws RecognitionException {
		M_parameter_identifierContext _localctx = new M_parameter_identifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_m_parameter_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PD_UNDEF) | (1L << PD_IFDEF) | (1L << PD_IFNDEF))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(210);
			match(M_IDENTIFIER);
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

	public static class M_parameterlessContext extends ParserRuleContext {
		public TerminalNode PD_ERROR() { return getToken(GLSLParser.PD_ERROR, 0); }
		public TerminalNode PD_ELSE() { return getToken(GLSLParser.PD_ELSE, 0); }
		public TerminalNode PD_ENDIF() { return getToken(GLSLParser.PD_ENDIF, 0); }
		public M_parameterlessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_parameterless; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterM_parameterless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitM_parameterless(this);
		}
	}

	public final M_parameterlessContext m_parameterless() throws RecognitionException {
		M_parameterlessContext _localctx = new M_parameterlessContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_m_parameterless);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PD_ERROR) | (1L << PD_ELSE) | (1L << PD_ENDIF))) != 0)) ) {
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

	public static class Macro_terminationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GLSLParser.EOF, 0); }
		public TerminalNode M_NEW_LINE() { return getToken(GLSLParser.M_NEW_LINE, 0); }
		public TerminalNode M_SINGLE_LINE_COMMENT() { return getToken(GLSLParser.M_SINGLE_LINE_COMMENT, 0); }
		public TerminalNode M_MULTI_LINE_COMMENT() { return getToken(GLSLParser.M_MULTI_LINE_COMMENT, 0); }
		public Macro_terminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_termination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterMacro_termination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitMacro_termination(this);
		}
	}

	public final Macro_terminationContext macro_termination() throws RecognitionException {
		Macro_terminationContext _localctx = new Macro_terminationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_macro_termination);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !(_la==EOF || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (M_SINGLE_LINE_COMMENT - 105)) | (1L << (M_MULTI_LINE_COMMENT - 105)) | (1L << (M_NEW_LINE - 105)))) != 0)) ) {
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunction_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunction_signature(this);
		}
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			return_type();
			setState(217);
			match(IDENTIFIER);
			setState(218);
			match(LRB);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (KW_VOID - 27)) | (1L << (Q_PRECISE - 27)) | (1L << (Q_CONST - 27)) | (1L << (Q_INOUT - 27)) | (1L << (Q_IN - 27)) | (1L << (Q_OUT - 27)) | (1L << (Q_COHERENT - 27)) | (1L << (Q_VOLATILE - 27)) | (1L << (Q_RESTRICT - 27)) | (1L << (Q_READONLY - 27)) | (1L << (Q_WRIREONLY - 27)) | (1L << (Q_HIGHP - 27)) | (1L << (Q_MEDIUMP - 27)) | (1L << (Q_LOWP - 27)) | (1L << (TYPE - 27)) | (1L << (IDENTIFIER - 27)))) != 0)) {
				{
				setState(219);
				function_parameter_list();
				}
			}

			setState(222);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				setState(224);
				precision_qualifier();
				}
			}

			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Q_SUBROUTINE) {
				{
				setState(227);
				function_subroutine_qualifier();
				}
			}

			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case IDENTIFIER:
				{
				setState(230);
				type();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(231);
					array_declaration();
					}
				}

				}
				break;
			case KW_VOID:
				{
				setState(234);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunction_subroutine_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunction_subroutine_qualifier(this);
		}
	}

	public final Function_subroutine_qualifierContext function_subroutine_qualifier() throws RecognitionException {
		Function_subroutine_qualifierContext _localctx = new Function_subroutine_qualifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_subroutine_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(Q_SUBROUTINE);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LRB) {
				{
				setState(238);
				match(LRB);
				setState(239);
				type_name_list();
				setState(240);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunction_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunction_parameter_list(this);
		}
	}

	public final Function_parameter_listContext function_parameter_list() throws RecognitionException {
		Function_parameter_listContext _localctx = new Function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_parameter_list);
		int _la;
		try {
			setState(253);
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
				setState(244);
				function_parameter();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(245);
					match(COMMA);
					setState(246);
					function_parameter();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case KW_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunction_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunction_parameter(this);
		}
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_PRECISE) | (1L << Q_CONST) | (1L << Q_INOUT) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(255);
				parameter_qualifier();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			type();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(262);
				match(IDENTIFIER);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(263);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterParameter_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitParameter_qualifier(this);
		}
	}

	public final Parameter_qualifierContext parameter_qualifier() throws RecognitionException {
		Parameter_qualifierContext _localctx = new Parameter_qualifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameter_qualifier);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_PRECISE:
			case Q_CONST:
			case Q_INOUT:
			case Q_IN:
			case Q_OUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
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
				setState(269);
				memory_storage_qualifier();
				}
				break;
			case Q_HIGHP:
			case Q_MEDIUMP:
			case Q_LOWP:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunction_prototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunction_prototype(this);
		}
	}

	public final Function_prototypeContext function_prototype() throws RecognitionException {
		Function_prototypeContext _localctx = new Function_prototypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			function_signature();
			setState(274);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			function_signature();
			setState(277);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (TYPE - 57)) | (1L << (BI_FUNCTION - 57)) | (1L << (IDENTIFIER - 57)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(280);
			match(LRB);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_VOID) | (1L << TYPE) | (1L << BI_FUNCTION) | (1L << BI_MACRO) | (1L << BI_VARIABLE) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (OP_ADD - 65)) | (1L << (OP_SUB - 65)) | (1L << (OP_INC - 65)) | (1L << (OP_DEC - 65)) | (1L << (OP_BIT_UNARY - 65)) | (1L << (OP_LOGICAL_UNARY - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LRB - 65)))) != 0)) {
				{
				setState(281);
				function_call_parameter_list();
				}
			}

			setState(284);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunction_call_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunction_call_parameter_list(this);
		}
	}

	public final Function_call_parameter_listContext function_call_parameter_list() throws RecognitionException {
		Function_call_parameter_listContext _localctx = new Function_call_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call_parameter_list);
		try {
			setState(288);
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
				setState(286);
				expression(0);
				}
				break;
			case KW_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290);
				statement();
				}
				}
				setState(293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_DO) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_SWITCH) | (1L << KW_IF) | (1L << KW_DISCARD) | (1L << KW_RETURN) | (1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BI_FUNCTION) | (1L << BI_MACRO) | (1L << BI_VARIABLE) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (OP_ADD - 65)) | (1L << (OP_SUB - 65)) | (1L << (OP_INC - 65)) | (1L << (OP_DEC - 65)) | (1L << (OP_BIT_UNARY - 65)) | (1L << (OP_LOGICAL_UNARY - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (SEMICOLON - 65)) | (1L << (LRB - 65)) | (1L << (LCB - 65)))) != 0) );
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCB:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
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
				setState(296);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(LCB);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_DO) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_SWITCH) | (1L << KW_IF) | (1L << KW_DISCARD) | (1L << KW_RETURN) | (1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BI_FUNCTION) | (1L << BI_MACRO) | (1L << BI_VARIABLE) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (OP_ADD - 65)) | (1L << (OP_SUB - 65)) | (1L << (OP_INC - 65)) | (1L << (OP_DEC - 65)) | (1L << (OP_BIT_UNARY - 65)) | (1L << (OP_LOGICAL_UNARY - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (SEMICOLON - 65)) | (1L << (LRB - 65)) | (1L << (LCB - 65)))) != 0)) {
				{
				setState(300);
				statement_list();
				}
			}

			setState(303);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitSimple_statement(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_simple_statement);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				expression_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				selection_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				iteration_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				jump_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitSelection_statement(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(KW_IF);
			setState(314);
			match(LRB);
			setState(315);
			expression(0);
			setState(316);
			match(RRB);
			setState(317);
			statement();
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(318);
				match(KW_ELSE);
				setState(319);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(KW_SWITCH);
			setState(323);
			match(LRB);
			setState(324);
			expression(0);
			setState(325);
			match(RRB);
			setState(326);
			match(LCB);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_CASE || _la==KW_DEFAULT) {
				{
				{
				setState(327);
				case_group();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterCase_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitCase_group(this);
		}
	}

	public final Case_groupContext case_group() throws RecognitionException {
		Case_groupContext _localctx = new Case_groupContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_case_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			case_label();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BI_FUNCTION) | (1L << BI_MACRO) | (1L << BI_VARIABLE) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (OP_ADD - 65)) | (1L << (OP_SUB - 65)) | (1L << (OP_INC - 65)) | (1L << (OP_DEC - 65)) | (1L << (OP_BIT_UNARY - 65)) | (1L << (OP_LOGICAL_UNARY - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (SEMICOLON - 65)) | (1L << (LRB - 65)))) != 0)) {
				{
				setState(336);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitCase_label(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DEFAULT:
				{
				setState(339);
				match(KW_DEFAULT);
				}
				break;
			case KW_CASE:
				{
				setState(340);
				match(KW_CASE);
				setState(341);
				constant_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(344);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterCase_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitCase_statement_list(this);
		}
	}

	public final Case_statement_listContext case_statement_list() throws RecognitionException {
		Case_statement_listContext _localctx = new Case_statement_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_case_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(346);
					declaration_statement();
					}
					break;
				case 2:
					{
					setState(347);
					expression_statement();
					}
					break;
				}
				}
				setState(350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BI_FUNCTION) | (1L << BI_MACRO) | (1L << BI_VARIABLE) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (OP_ADD - 65)) | (1L << (OP_SUB - 65)) | (1L << (OP_INC - 65)) | (1L << (OP_DEC - 65)) | (1L << (OP_BIT_UNARY - 65)) | (1L << (OP_LOGICAL_UNARY - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (SEMICOLON - 65)) | (1L << (LRB - 65)))) != 0) );
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_iteration_statement);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				for_iteration();
				}
				break;
			case KW_WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				while_iteration();
				}
				break;
			case KW_DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFor_iteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFor_iteration(this);
		}
	}

	public final For_iterationContext for_iteration() throws RecognitionException {
		For_iterationContext _localctx = new For_iterationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_for_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(KW_FOR);
			setState(358);
			match(LRB);
			setState(359);
			init_declaration_list();
			setState(360);
			match(SEMICOLON);
			setState(361);
			expression(0);
			setState(362);
			match(SEMICOLON);
			setState(363);
			expression(0);
			setState(364);
			match(RRB);
			setState(365);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterWhile_iteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitWhile_iteration(this);
		}
	}

	public final While_iterationContext while_iteration() throws RecognitionException {
		While_iterationContext _localctx = new While_iterationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_while_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(KW_WHILE);
			setState(368);
			match(LRB);
			setState(369);
			expression(0);
			setState(370);
			match(RRB);
			setState(371);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterDo_while_iteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitDo_while_iteration(this);
		}
	}

	public final Do_while_iterationContext do_while_iteration() throws RecognitionException {
		Do_while_iterationContext _localctx = new Do_while_iterationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_do_while_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(KW_DO);
			setState(374);
			statement();
			setState(375);
			match(KW_WHILE);
			setState(376);
			match(LRB);
			setState(377);
			expression(0);
			setState(378);
			match(RRB);
			setState(379);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_jump_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CONTINUE:
				{
				setState(381);
				match(KW_CONTINUE);
				}
				break;
			case KW_BREAK:
				{
				setState(382);
				match(KW_BREAK);
				}
				break;
			case KW_DISCARD:
				{
				setState(383);
				match(KW_DISCARD);
				}
				break;
			case KW_RETURN:
				{
				setState(384);
				match(KW_RETURN);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (TYPE - 57)) | (1L << (BI_FUNCTION - 57)) | (1L << (BI_MACRO - 57)) | (1L << (BI_VARIABLE - 57)) | (1L << (BOOL_LITERAL - 57)) | (1L << (INT_LITERAL - 57)) | (1L << (FLOAT_LITERAL - 57)) | (1L << (OP_ADD - 57)) | (1L << (OP_SUB - 57)) | (1L << (OP_INC - 57)) | (1L << (OP_DEC - 57)) | (1L << (OP_BIT_UNARY - 57)) | (1L << (OP_LOGICAL_UNARY - 57)) | (1L << (IDENTIFIER - 57)) | (1L << (LRB - 57)))) != 0)) {
					{
					setState(385);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (TYPE - 57)) | (1L << (BI_FUNCTION - 57)) | (1L << (BI_MACRO - 57)) | (1L << (BI_VARIABLE - 57)) | (1L << (BOOL_LITERAL - 57)) | (1L << (INT_LITERAL - 57)) | (1L << (FLOAT_LITERAL - 57)) | (1L << (OP_ADD - 57)) | (1L << (OP_SUB - 57)) | (1L << (OP_INC - 57)) | (1L << (OP_DEC - 57)) | (1L << (OP_BIT_UNARY - 57)) | (1L << (OP_LOGICAL_UNARY - 57)) | (1L << (IDENTIFIER - 57)) | (1L << (LRB - 57)))) != 0)) {
				{
				setState(392);
				expression(0);
				}
			}

			setState(395);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitDeclaration_statement(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declaration_statement);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(Q_PRECISION);
				setState(398);
				precision_qualifier();
				setState(399);
				type();
				setState(400);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				init_declaration_list();
				setState(403);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
					{
					{
					setState(405);
					type_qualifier();
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(411);
				match(IDENTIFIER);
				setState(412);
				match(LCB);
				setState(413);
				struct_declaration_list();
				setState(414);
				match(RCB);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(415);
					match(IDENTIFIER);
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LSB) {
						{
						setState(416);
						array_declaration();
						}
					}

					}
				}

				setState(421);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
					{
					{
					setState(423);
					type_qualifier();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(429);
					match(IDENTIFIER);
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(430);
						match(COMMA);
						setState(431);
						match(IDENTIFIER);
						}
						}
						setState(436);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(439);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterInit_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitInit_declaration_list(this);
		}
	}

	public final Init_declaration_listContext init_declaration_list() throws RecognitionException {
		Init_declaration_listContext _localctx = new Init_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_init_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			single_declaration();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(443);
				match(COMMA);
				setState(444);
				match(IDENTIFIER);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(445);
					array_declaration();
					}
				}

				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASSIGN) {
					{
					setState(448);
					match(OP_ASSIGN);
					setState(449);
					expression(0);
					}
				}

				}
				}
				setState(456);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterSingle_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitSingle_declaration(this);
		}
	}

	public final Single_declarationContext single_declaration() throws RecognitionException {
		Single_declarationContext _localctx = new Single_declarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_single_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(457);
				type_qualifier();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case IDENTIFIER:
				{
				setState(463);
				type();
				}
				break;
			case KW_STRUCT:
				{
				setState(464);
				struct_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(467);
				match(IDENTIFIER);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(468);
					array_declaration();
					}
				}

				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASSIGN) {
					{
					setState(471);
					match(OP_ASSIGN);
					setState(472);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStruct_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStruct_declaration_list(this);
		}
	}

	public final Struct_declaration_listContext struct_declaration_list() throws RecognitionException {
		Struct_declaration_listContext _localctx = new Struct_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_struct_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(477);
				struct_declaration();
				}
				}
				setState(480); 
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStruct_declaration(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(482);
				type_qualifier();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			type();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(489);
				struct_declarator_list();
				}
			}

			setState(492);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStruct_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStruct_declarator_list(this);
		}
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_struct_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			struct_declarator();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(495);
				match(COMMA);
				setState(496);
				struct_declarator();
				}
				}
				setState(501);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStruct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStruct_declarator(this);
		}
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_struct_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(IDENTIFIER);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(503);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStruct_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStruct_specifier(this);
		}
	}

	public final Struct_specifierContext struct_specifier() throws RecognitionException {
		Struct_specifierContext _localctx = new Struct_specifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_struct_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(KW_STRUCT);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(507);
				match(IDENTIFIER);
				}
			}

			setState(510);
			match(LCB);
			setState(511);
			struct_declaration_list();
			setState(512);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitExpression(this);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(515);
				match(BI_MACRO);
				}
				break;
			case 2:
				{
				setState(516);
				match(BI_VARIABLE);
				}
				break;
			case 3:
				{
				setState(517);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(518);
				function_call();
				}
				break;
			case 5:
				{
				setState(519);
				literal();
				}
				break;
			case 6:
				{
				setState(520);
				match(LRB);
				setState(521);
				expression(0);
				setState(522);
				match(RRB);
				}
				break;
			case 7:
				{
				setState(524);
				_la = _input.LA(1);
				if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (OP_ADD - 65)) | (1L << (OP_SUB - 65)) | (1L << (OP_INC - 65)) | (1L << (OP_DEC - 65)) | (1L << (OP_BIT_UNARY - 65)) | (1L << (OP_LOGICAL_UNARY - 65)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(525);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(547);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(528);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(529);
						_la = _input.LA(1);
						if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OP_MUL - 64)) | (1L << (OP_ADD - 64)) | (1L << (OP_SUB - 64)) | (1L << (OP_DIV - 64)) | (1L << (OP_MOD - 64)) | (1L << (OP_SHIFT - 64)) | (1L << (OP_RELATIONAL - 64)) | (1L << (OP_BIT - 64)) | (1L << (OP_LOGICAL - 64)) | (1L << (OP_MODIFY - 64)) | (1L << (OP_ASSIGN - 64)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(530);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(531);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(532);
						match(QUESTION);
						setState(533);
						expression(0);
						setState(534);
						match(COLON);
						setState(535);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(537);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(538);
						match(COMMA);
						setState(539);
						expression(2);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(540);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(541);
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
						setState(542);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(543);
						match(DOT);
						setState(544);
						match(IDENTIFIER);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(545);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(546);
						array_usage();
						}
						break;
					}
					} 
				}
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_constant_expression);
		try {
			setState(556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				literal();
				}
				break;
			case BI_MACRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(BI_MACRO);
				}
				break;
			case BI_VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				match(BI_VARIABLE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFully_specified_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFully_specified_type(this);
		}
	}

	public final Fully_specified_typeContext fully_specified_type() throws RecognitionException {
		Fully_specified_typeContext _localctx = new Fully_specified_typeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fully_specified_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(558);
				type_qualifier();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFully_specified_struct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFully_specified_struct(this);
		}
	}

	public final Fully_specified_structContext fully_specified_struct() throws RecognitionException {
		Fully_specified_structContext _localctx = new Fully_specified_structContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fully_specified_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(566);
				type_qualifier();
				}
				}
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(572);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitType_qualifier(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_type_qualifier);
		try {
			setState(583);
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
				setState(576);
				storage_qualifier();
				}
				break;
			case Q_LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				layout_qualifier();
				}
				break;
			case Q_HIGHP:
			case Q_MEDIUMP:
			case Q_LOWP:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				precision_qualifier();
				}
				break;
			case Q_SMOOTH:
			case Q_FLAT:
			case Q_NONPERSPECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				interpolation_qualifier();
				}
				break;
			case Q_INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(580);
				match(Q_INVARIANT);
				}
				break;
			case Q_PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(581);
				match(Q_PRECISE);
				}
				break;
			case Q_SUBROUTINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(582);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterType_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitType_name_list(this);
		}
	}

	public final Type_name_listContext type_name_list() throws RecognitionException {
		Type_name_listContext _localctx = new Type_name_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_type_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(IDENTIFIER);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(586);
				match(COMMA);
				setState(587);
				match(IDENTIFIER);
				}
				}
				setState(592);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStorage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStorage_qualifier(this);
		}
	}

	public final Storage_qualifierContext storage_qualifier() throws RecognitionException {
		Storage_qualifierContext _localctx = new Storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_storage_qualifier);
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_COHERENT:
			case Q_VOLATILE:
			case Q_RESTRICT:
			case Q_READONLY:
			case Q_WRIREONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				memory_storage_qualifier();
				}
				break;
			case Q_CENTROID:
			case Q_PATCH:
			case Q_SAMPLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				auxiliary_storage_qualifier();
				}
				break;
			case Q_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				match(Q_CONST);
				}
				break;
			case Q_IN:
				enterOuterAlt(_localctx, 4);
				{
				setState(596);
				match(Q_IN);
				}
				break;
			case Q_OUT:
				enterOuterAlt(_localctx, 5);
				{
				setState(597);
				match(Q_OUT);
				}
				break;
			case Q_ATTRIBUTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(598);
				match(Q_ATTRIBUTE);
				}
				break;
			case Q_UNIFORM:
				enterOuterAlt(_localctx, 7);
				{
				setState(599);
				match(Q_UNIFORM);
				}
				break;
			case Q_VARYING:
				enterOuterAlt(_localctx, 8);
				{
				setState(600);
				match(Q_VARYING);
				}
				break;
			case Q_BUFFER:
				enterOuterAlt(_localctx, 9);
				{
				setState(601);
				match(Q_BUFFER);
				}
				break;
			case Q_SHARED:
				enterOuterAlt(_localctx, 10);
				{
				setState(602);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterAuxiliary_storage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitAuxiliary_storage_qualifier(this);
		}
	}

	public final Auxiliary_storage_qualifierContext auxiliary_storage_qualifier() throws RecognitionException {
		Auxiliary_storage_qualifierContext _localctx = new Auxiliary_storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_auxiliary_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterMemory_storage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitMemory_storage_qualifier(this);
		}
	}

	public final Memory_storage_qualifierContext memory_storage_qualifier() throws RecognitionException {
		Memory_storage_qualifierContext _localctx = new Memory_storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_memory_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
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
		public TerminalNode L_LRB() { return getToken(GLSLParser.L_LRB, 0); }
		public Layout_qualifier_id_listContext layout_qualifier_id_list() {
			return getRuleContext(Layout_qualifier_id_listContext.class,0);
		}
		public TerminalNode L_RRB() { return getToken(GLSLParser.L_RRB, 0); }
		public Layout_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLayout_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLayout_qualifier(this);
		}
	}

	public final Layout_qualifierContext layout_qualifier() throws RecognitionException {
		Layout_qualifierContext _localctx = new Layout_qualifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_layout_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(Q_LAYOUT);
			setState(610);
			match(L_LRB);
			setState(611);
			layout_qualifier_id_list();
			setState(612);
			match(L_RRB);
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
		public List<TerminalNode> L_COMMA() { return getTokens(GLSLParser.L_COMMA); }
		public TerminalNode L_COMMA(int i) {
			return getToken(GLSLParser.L_COMMA, i);
		}
		public Layout_qualifier_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLayout_qualifier_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLayout_qualifier_id_list(this);
		}
	}

	public final Layout_qualifier_id_listContext layout_qualifier_id_list() throws RecognitionException {
		Layout_qualifier_id_listContext _localctx = new Layout_qualifier_id_listContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_layout_qualifier_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			layout_qualifier_id();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_COMMA) {
				{
				{
				setState(615);
				match(L_COMMA);
				setState(616);
				layout_qualifier_id();
				}
				}
				setState(621);
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
		public TerminalNode L_ASSIGN() { return getToken(GLSLParser.L_ASSIGN, 0); }
		public TerminalNode QPV_LAYOUT() { return getToken(GLSLParser.QPV_LAYOUT, 0); }
		public L_literalContext l_literal() {
			return getRuleContext(L_literalContext.class,0);
		}
		public TerminalNode L_SHARED() { return getToken(GLSLParser.L_SHARED, 0); }
		public Layout_qualifier_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLayout_qualifier_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLayout_qualifier_id(this);
		}
	}

	public final Layout_qualifier_idContext layout_qualifier_id() throws RecognitionException {
		Layout_qualifier_idContext _localctx = new Layout_qualifier_idContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_layout_qualifier_id);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QP_LAYOUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(QP_LAYOUT);
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==L_ASSIGN) {
					{
					setState(623);
					match(L_ASSIGN);
					setState(626);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case QPV_LAYOUT:
						{
						setState(624);
						match(QPV_LAYOUT);
						}
						break;
					case L_BOOL_LITERAL:
					case L_INT_LITERAL:
					case L_FLOAT_LITERAL:
						{
						setState(625);
						l_literal();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case L_SHARED:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				match(L_SHARED);
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

	public static class L_literalContext extends ParserRuleContext {
		public TerminalNode L_BOOL_LITERAL() { return getToken(GLSLParser.L_BOOL_LITERAL, 0); }
		public TerminalNode L_INT_LITERAL() { return getToken(GLSLParser.L_INT_LITERAL, 0); }
		public TerminalNode L_FLOAT_LITERAL() { return getToken(GLSLParser.L_FLOAT_LITERAL, 0); }
		public L_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterL_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitL_literal(this);
		}
	}

	public final L_literalContext l_literal() throws RecognitionException {
		L_literalContext _localctx = new L_literalContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_l_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_la = _input.LA(1);
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (L_BOOL_LITERAL - 127)) | (1L << (L_INT_LITERAL - 127)) | (1L << (L_FLOAT_LITERAL - 127)))) != 0)) ) {
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterPrecision_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitPrecision_qualifier(this);
		}
	}

	public final Precision_qualifierContext precision_qualifier() throws RecognitionException {
		Precision_qualifierContext _localctx = new Precision_qualifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_precision_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterInterpolation_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitInterpolation_qualifier(this);
		}
	}

	public final Interpolation_qualifierContext interpolation_qualifier() throws RecognitionException {
		Interpolation_qualifierContext _localctx = new Interpolation_qualifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_interpolation_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL))) != 0)) ) {
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_bool_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterNumber_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitNumber_literal(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterArray_usage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitArray_usage(this);
		}
	}

	public final Array_usageContext array_usage() throws RecognitionException {
		Array_usageContext _localctx = new Array_usageContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_array_usage);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(645);
					match(LSB);
					setState(646);
					constant_expression();
					setState(647);
					match(RSB);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(651); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterArray_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitArray_declaration(this);
		}
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(653);
				match(LSB);
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (BI_MACRO - 59)) | (1L << (BI_VARIABLE - 59)) | (1L << (BOOL_LITERAL - 59)) | (1L << (INT_LITERAL - 59)) | (1L << (FLOAT_LITERAL - 59)) | (1L << (IDENTIFIER - 59)))) != 0)) {
					{
					setState(654);
					constant_expression();
					}
				}

				setState(657);
				match(RSB);
				}
				}
				setState(660); 
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
		case 45:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0083\u0299\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\7\2\u008c\n\2"+
		"\f\2\16\2\u008f\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0098\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\5\4\u009f\n\4\3\5\3\5\3\5\5\5\u00a4\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00ac\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b5\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u00bd\n\b\f\b\16\b\u00c0\13\b\3\b\5\b\u00c3\n\b\3"+
		"\b\7\b\u00c6\n\b\f\b\16\b\u00c9\13\b\3\t\3\t\3\n\3\n\7\n\u00cf\n\n\f\n"+
		"\16\n\u00d2\13\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5"+
		"\16\u00df\n\16\3\16\3\16\3\17\5\17\u00e4\n\17\3\17\5\17\u00e7\n\17\3\17"+
		"\3\17\5\17\u00eb\n\17\3\17\5\17\u00ee\n\17\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00f5\n\20\3\21\3\21\3\21\7\21\u00fa\n\21\f\21\16\21\u00fd\13\21\3"+
		"\21\5\21\u0100\n\21\3\22\7\22\u0103\n\22\f\22\16\22\u0106\13\22\3\22\3"+
		"\22\3\22\5\22\u010b\n\22\5\22\u010d\n\22\3\23\3\23\3\23\5\23\u0112\n\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u011d\n\26\3\26\3\26"+
		"\3\27\3\27\5\27\u0123\n\27\3\30\6\30\u0126\n\30\r\30\16\30\u0127\3\31"+
		"\3\31\5\31\u012c\n\31\3\32\3\32\5\32\u0130\n\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u013a\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0143\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u014b\n\35\f\35\16"+
		"\35\u014e\13\35\3\35\3\35\3\36\3\36\5\36\u0154\n\36\3\37\3\37\3\37\5\37"+
		"\u0159\n\37\3\37\3\37\3 \3 \6 \u015f\n \r \16 \u0160\3!\3!\3!\5!\u0166"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\5%\u0185\n%\5%\u0187\n%\3%\3%\3&\5&\u018c"+
		"\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0199\n\'\f\'\16\'\u019c"+
		"\13\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01a4\n\'\5\'\u01a6\n\'\3\'\3\'\3\'"+
		"\7\'\u01ab\n\'\f\'\16\'\u01ae\13\'\3\'\3\'\3\'\7\'\u01b3\n\'\f\'\16\'"+
		"\u01b6\13\'\5\'\u01b8\n\'\3\'\5\'\u01bb\n\'\3(\3(\3(\3(\5(\u01c1\n(\3"+
		"(\3(\5(\u01c5\n(\7(\u01c7\n(\f(\16(\u01ca\13(\3)\7)\u01cd\n)\f)\16)\u01d0"+
		"\13)\3)\3)\5)\u01d4\n)\3)\3)\5)\u01d8\n)\3)\3)\5)\u01dc\n)\5)\u01de\n"+
		")\3*\6*\u01e1\n*\r*\16*\u01e2\3+\7+\u01e6\n+\f+\16+\u01e9\13+\3+\3+\5"+
		"+\u01ed\n+\3+\3+\3,\3,\3,\7,\u01f4\n,\f,\16,\u01f7\13,\3-\3-\5-\u01fb"+
		"\n-\3.\3.\5.\u01ff\n.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\5/\u0211\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\7/\u0226\n/\f/\16/\u0229\13/\3\60\3\60\3\60\3\60\5\60\u022f\n\60\3\61"+
		"\7\61\u0232\n\61\f\61\16\61\u0235\13\61\3\61\3\61\3\62\7\62\u023a\n\62"+
		"\f\62\16\62\u023d\13\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\5\64\u024a\n\64\3\65\3\65\3\65\7\65\u024f\n\65\f\65\16\65\u0252"+
		"\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u025e\n"+
		"\66\3\67\3\67\38\38\39\39\39\39\39\3:\3:\3:\7:\u026c\n:\f:\16:\u026f\13"+
		":\3;\3;\3;\3;\5;\u0275\n;\5;\u0277\n;\3;\5;\u027a\n;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3B\3B\6B\u028c\nB\rB\16B\u028d\3C\3C\5C\u0292"+
		"\nC\3C\6C\u0295\nC\rC\16C\u0296\3C\2\3\\D\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\2\26\3\2cd\4\2nnpw\3\2\r\16\5\2nnppww\3\2\n\f\4\2\3\3\b\t"+
		"\4\3kloo\4\2!!\'*\4\2;<WW\6\2CDGHLLNN\6\2BFIKMMOP\3\2GH\4\2;;WW\3\2+-"+
		"\3\2\62\66\3\2\u0081\u0083\3\28:\3\2$&\3\2?A\3\2@A\2\u02cc\2\u008d\3\2"+
		"\2\2\4\u0097\3\2\2\2\6\u009b\3\2\2\2\b\u00a0\3\2\2\2\n\u00a5\3\2\2\2\f"+
		"\u00ad\3\2\2\2\16\u00b6\3\2\2\2\20\u00ca\3\2\2\2\22\u00cc\3\2\2\2\24\u00d3"+
		"\3\2\2\2\26\u00d6\3\2\2\2\30\u00d8\3\2\2\2\32\u00da\3\2\2\2\34\u00e3\3"+
		"\2\2\2\36\u00ef\3\2\2\2 \u00ff\3\2\2\2\"\u0104\3\2\2\2$\u0111\3\2\2\2"+
		"&\u0113\3\2\2\2(\u0116\3\2\2\2*\u0119\3\2\2\2,\u0122\3\2\2\2.\u0125\3"+
		"\2\2\2\60\u012b\3\2\2\2\62\u012d\3\2\2\2\64\u0139\3\2\2\2\66\u013b\3\2"+
		"\2\28\u0144\3\2\2\2:\u0151\3\2\2\2<\u0158\3\2\2\2>\u015e\3\2\2\2@\u0165"+
		"\3\2\2\2B\u0167\3\2\2\2D\u0171\3\2\2\2F\u0177\3\2\2\2H\u0186\3\2\2\2J"+
		"\u018b\3\2\2\2L\u01ba\3\2\2\2N\u01bc\3\2\2\2P\u01ce\3\2\2\2R\u01e0\3\2"+
		"\2\2T\u01e7\3\2\2\2V\u01f0\3\2\2\2X\u01f8\3\2\2\2Z\u01fc\3\2\2\2\\\u0210"+
		"\3\2\2\2^\u022e\3\2\2\2`\u0233\3\2\2\2b\u023b\3\2\2\2d\u0240\3\2\2\2f"+
		"\u0249\3\2\2\2h\u024b\3\2\2\2j\u025d\3\2\2\2l\u025f\3\2\2\2n\u0261\3\2"+
		"\2\2p\u0263\3\2\2\2r\u0268\3\2\2\2t\u0279\3\2\2\2v\u027b\3\2\2\2x\u027d"+
		"\3\2\2\2z\u027f\3\2\2\2|\u0281\3\2\2\2~\u0283\3\2\2\2\u0080\u0285\3\2"+
		"\2\2\u0082\u028b\3\2\2\2\u0084\u0294\3\2\2\2\u0086\u008c\5\4\3\2\u0087"+
		"\u008c\5&\24\2\u0088\u008c\5(\25\2\u0089\u008c\5L\'\2\u008a\u008c\7[\2"+
		"\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\3\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0098\5\6\4\2"+
		"\u0091\u0098\5\b\5\2\u0092\u0098\5\n\6\2\u0093\u0098\5\f\7\2\u0094\u0098"+
		"\5\22\n\2\u0095\u0098\5\24\13\2\u0096\u0098\5\26\f\2\u0097\u0090\3\2\2"+
		"\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\5\30\r\2\u009a\5\3\2\2\2\u009b\u009c\7\5\2\2\u009c\u009e\7p\2\2"+
		"\u009d\u009f\7g\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\7\3"+
		"\2\2\2\u00a0\u00a1\7\6\2\2\u00a1\u00a3\7p\2\2\u00a2\u00a4\7p\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\t\3\2\2\2\u00a5\u00ab\7\4\2\2"+
		"\u00a6\u00a7\t\2\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7f\2\2\u00a9\u00ac"+
		"\7u\2\2\u00aa\u00ac\7e\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\13\3\2\2\2\u00ad\u00b4\7\7\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7v\2\2"+
		"\u00b0\u00b5\7i\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b5"+
		"\7h\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\r\3\2\2\2\u00b6"+
		"\u00b7\7\17\2\2\u00b7\u00c2\7w\2\2\u00b8\u00b9\7t\2\2\u00b9\u00be\7w\2"+
		"\2\u00ba\u00bb\7s\2\2\u00bb\u00bd\7w\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c3\7u\2\2\u00c2\u00b8\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c6\5\20\t\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\17\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\t\3\2\2\u00cb\21\3\2\2\2\u00cc\u00d0"+
		"\t\4\2\2\u00cd\u00cf\t\5\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\23\3\2\2\2\u00d2\u00d0\3\2\2"+
		"\2\u00d3\u00d4\t\6\2\2\u00d4\u00d5\7w\2\2\u00d5\25\3\2\2\2\u00d6\u00d7"+
		"\t\7\2\2\u00d7\27\3\2\2\2\u00d8\u00d9\t\b\2\2\u00d9\31\3\2\2\2\u00da\u00db"+
		"\5\34\17\2\u00db\u00dc\7W\2\2\u00dc\u00de\7]\2\2\u00dd\u00df\5 \21\2\u00de"+
		"\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7^"+
		"\2\2\u00e1\33\3\2\2\2\u00e2\u00e4\5x=\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e7\5\36\20\2\u00e6\u00e5\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00ed\3\2\2\2\u00e8\u00ea\5d\63\2\u00e9\u00eb"+
		"\5\u0084C\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2\2"+
		"\2\u00ec\u00ee\7\35\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\35\3\2\2\2\u00ef\u00f4\7#\2\2\u00f0\u00f1\7]\2\2\u00f1\u00f2\5h\65\2"+
		"\u00f2\u00f3\7^\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00fb\5\"\22\2\u00f7\u00f8\7Y\2\2\u00f8"+
		"\u00fa\5\"\22\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0100\7\35\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100!\3\2\2\2"+
		"\u0101\u0103\5$\23\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u010c\5d\63\2\u0108\u010a\7W\2\2\u0109\u010b\5\u0084C\2\u010a\u0109\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u0108\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d#\3\2\2\2\u010e\u0112\t\t\2\2\u010f\u0112\5n8\2\u0110"+
		"\u0112\5x=\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2"+
		"\2\u0112%\3\2\2\2\u0113\u0114\5\32\16\2\u0114\u0115\7[\2\2\u0115\'\3\2"+
		"\2\2\u0116\u0117\5\32\16\2\u0117\u0118\5\62\32\2\u0118)\3\2\2\2\u0119"+
		"\u011a\t\n\2\2\u011a\u011c\7]\2\2\u011b\u011d\5,\27\2\u011c\u011b\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7^\2\2\u011f"+
		"+\3\2\2\2\u0120\u0123\5\\/\2\u0121\u0123\7\35\2\2\u0122\u0120\3\2\2\2"+
		"\u0122\u0121\3\2\2\2\u0123-\3\2\2\2\u0124\u0126\5\60\31\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"/\3\2\2\2\u0129\u012c\5\62\32\2\u012a\u012c\5\64\33\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012a\3\2\2\2\u012c\61\3\2\2\2\u012d\u012f\7_\2\2\u012e\u0130"+
		"\5.\30\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\7`\2\2\u0132\63\3\2\2\2\u0133\u013a\5L\'\2\u0134\u013a\5J&\2\u0135"+
		"\u013a\5\66\34\2\u0136\u013a\5@!\2\u0137\u013a\5H%\2\u0138\u013a\58\35"+
		"\2\u0139\u0133\3\2\2\2\u0139\u0134\3\2\2\2\u0139\u0135\3\2\2\2\u0139\u0136"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\65\3\2\2\2\u013b"+
		"\u013c\7\30\2\2\u013c\u013d\7]\2\2\u013d\u013e\5\\/\2\u013e\u013f\7^\2"+
		"\2\u013f\u0142\5\60\31\2\u0140\u0141\7\31\2\2\u0141\u0143\5\60\31\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\67\3\2\2\2\u0144\u0145\7\25\2"+
		"\2\u0145\u0146\7]\2\2\u0146\u0147\5\\/\2\u0147\u0148\7^\2\2\u0148\u014c"+
		"\7_\2\2\u0149\u014b\5:\36\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014f\u0150\7`\2\2\u01509\3\2\2\2\u0151\u0153\5<\37\2\u0152\u0154"+
		"\5> \2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154;\3\2\2\2\u0155\u0159"+
		"\7\27\2\2\u0156\u0157\7\26\2\2\u0157\u0159\5^\60\2\u0158\u0155\3\2\2\2"+
		"\u0158\u0156\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7Z\2\2\u015b=\3\2"+
		"\2\2\u015c\u015f\5L\'\2\u015d\u015f\5J&\2\u015e\u015c\3\2\2\2\u015e\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"?\3\2\2\2\u0162\u0166\5B\"\2\u0163\u0166\5D#\2\u0164\u0166\5F$\2\u0165"+
		"\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166A\3\2\2\2"+
		"\u0167\u0168\7\23\2\2\u0168\u0169\7]\2\2\u0169\u016a\5N(\2\u016a\u016b"+
		"\7[\2\2\u016b\u016c\5\\/\2\u016c\u016d\7[\2\2\u016d\u016e\5\\/\2\u016e"+
		"\u016f\7^\2\2\u016f\u0170\5\60\31\2\u0170C\3\2\2\2\u0171\u0172\7\24\2"+
		"\2\u0172\u0173\7]\2\2\u0173\u0174\5\\/\2\u0174\u0175\7^\2\2\u0175\u0176"+
		"\5\60\31\2\u0176E\3\2\2\2\u0177\u0178\7\22\2\2\u0178\u0179\5\60\31\2\u0179"+
		"\u017a\7\24\2\2\u017a\u017b\7]\2\2\u017b\u017c\5\\/\2\u017c\u017d\7^\2"+
		"\2\u017d\u017e\7[\2\2\u017eG\3\2\2\2\u017f\u0187\7\21\2\2\u0180\u0187"+
		"\7\20\2\2\u0181\u0187\7\32\2\2\u0182\u0184\7\33\2\2\u0183\u0185\5\\/\2"+
		"\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u017f"+
		"\3\2\2\2\u0186\u0180\3\2\2\2\u0186\u0181\3\2\2\2\u0186\u0182\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\7[\2\2\u0189I\3\2\2\2\u018a\u018c\5\\/\2\u018b"+
		"\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7["+
		"\2\2\u018eK\3\2\2\2\u018f\u0190\7\37\2\2\u0190\u0191\5x=\2\u0191\u0192"+
		"\5d\63\2\u0192\u0193\7[\2\2\u0193\u01bb\3\2\2\2\u0194\u0195\5N(\2\u0195"+
		"\u0196\7[\2\2\u0196\u01bb\3\2\2\2\u0197\u0199\5f\64\2\u0198\u0197\3\2"+
		"\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7W\2\2\u019e\u019f\7_\2"+
		"\2\u019f\u01a0\5R*\2\u01a0\u01a5\7`\2\2\u01a1\u01a3\7W\2\2\u01a2\u01a4"+
		"\5\u0084C\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2"+
		"\2\u01a5\u01a1\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8"+
		"\7[\2\2\u01a8\u01bb\3\2\2\2\u01a9\u01ab\5f\64\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b7\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b4\7W\2\2\u01b0\u01b1\7Y\2\2\u01b1\u01b3"+
		"\7W\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01af\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\7[\2\2\u01ba"+
		"\u018f\3\2\2\2\u01ba\u0194\3\2\2\2\u01ba\u019a\3\2\2\2\u01ba\u01ac\3\2"+
		"\2\2\u01bbM\3\2\2\2\u01bc\u01c8\5P)\2\u01bd\u01be\7Y\2\2\u01be\u01c0\7"+
		"W\2\2\u01bf\u01c1\5\u0084C\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c3\7P\2\2\u01c3\u01c5\5\\/\2\u01c4\u01c2\3\2\2"+
		"\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01bd\3\2\2\2\u01c7\u01ca"+
		"\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9O\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01cb\u01cd\5f\64\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d3\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d1\u01d4\5d\63\2\u01d2\u01d4\5Z.\2\u01d3\u01d1\3\2\2"+
		"\2\u01d3\u01d2\3\2\2\2\u01d4\u01dd\3\2\2\2\u01d5\u01d7\7W\2\2\u01d6\u01d8"+
		"\5\u0084C\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01db\3\2\2"+
		"\2\u01d9\u01da\7P\2\2\u01da\u01dc\5\\/\2\u01db\u01d9\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d5\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"Q\3\2\2\2\u01df\u01e1\5T+\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3S\3\2\2\2\u01e4\u01e6\5f\64\2"+
		"\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ec\5d\63\2\u01eb"+
		"\u01ed\5V,\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2"+
		"\2\u01ee\u01ef\7[\2\2\u01efU\3\2\2\2\u01f0\u01f5\5X-\2\u01f1\u01f2\7Y"+
		"\2\2\u01f2\u01f4\5X-\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6W\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01fa\7W\2\2\u01f9\u01fb\5\u0084C\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3"+
		"\2\2\2\u01fbY\3\2\2\2\u01fc\u01fe\7\34\2\2\u01fd\u01ff\7W\2\2\u01fe\u01fd"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\7_\2\2\u0201"+
		"\u0202\5R*\2\u0202\u0203\7`\2\2\u0203[\3\2\2\2\u0204\u0205\b/\1\2\u0205"+
		"\u0211\7=\2\2\u0206\u0211\7>\2\2\u0207\u0211\7W\2\2\u0208\u0211\5*\26"+
		"\2\u0209\u0211\5|?\2\u020a\u020b\7]\2\2\u020b\u020c\5\\/\2\u020c\u020d"+
		"\7^\2\2\u020d\u0211\3\2\2\2\u020e\u020f\t\13\2\2\u020f\u0211\5\\/\t\u0210"+
		"\u0204\3\2\2\2\u0210\u0206\3\2\2\2\u0210\u0207\3\2\2\2\u0210\u0208\3\2"+
		"\2\2\u0210\u0209\3\2\2\2\u0210\u020a\3\2\2\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0227\3\2\2\2\u0212\u0213\f\7\2\2\u0213\u0214\t\f\2\2\u0214\u0226\5\\"+
		"/\b\u0215\u0216\f\6\2\2\u0216\u0217\7\\\2\2\u0217\u0218\5\\/\2\u0218\u0219"+
		"\7Z\2\2\u0219\u021a\5\\/\7\u021a\u0226\3\2\2\2\u021b\u021c\f\3\2\2\u021c"+
		"\u021d\7Y\2\2\u021d\u0226\5\\/\4\u021e\u021f\f\b\2\2\u021f\u0226\t\r\2"+
		"\2\u0220\u0221\f\5\2\2\u0221\u0222\7X\2\2\u0222\u0226\7W\2\2\u0223\u0224"+
		"\f\4\2\2\u0224\u0226\5\u0082B\2\u0225\u0212\3\2\2\2\u0225\u0215\3\2\2"+
		"\2\u0225\u021b\3\2\2\2\u0225\u021e\3\2\2\2\u0225\u0220\3\2\2\2\u0225\u0223"+
		"\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"]\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022f\5|?\2\u022b\u022f\7=\2\2\u022c"+
		"\u022f\7>\2\2\u022d\u022f\7W\2\2\u022e\u022a\3\2\2\2\u022e\u022b\3\2\2"+
		"\2\u022e\u022c\3\2\2\2\u022e\u022d\3\2\2\2\u022f_\3\2\2\2\u0230\u0232"+
		"\5f\64\2\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237\5d"+
		"\63\2\u0237a\3\2\2\2\u0238\u023a\5f\64\2\u0239\u0238\3\2\2\2\u023a\u023d"+
		"\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023e\u023f\5Z.\2\u023fc\3\2\2\2\u0240\u0241\t\16\2\2\u0241"+
		"e\3\2\2\2\u0242\u024a\5j\66\2\u0243\u024a\5p9\2\u0244\u024a\5x=\2\u0245"+
		"\u024a\5z>\2\u0246\u024a\7\"\2\2\u0247\u024a\7!\2\2\u0248\u024a\7#\2\2"+
		"\u0249\u0242\3\2\2\2\u0249\u0243\3\2\2\2\u0249\u0244\3\2\2\2\u0249\u0245"+
		"\3\2\2\2\u0249\u0246\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2\2\u024a"+
		"g\3\2\2\2\u024b\u0250\7W\2\2\u024c\u024d\7Y\2\2\u024d\u024f\7W\2\2\u024e"+
		"\u024c\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251i\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u025e\5n8\2\u0254\u025e"+
		"\5l\67\2\u0255\u025e\7\'\2\2\u0256\u025e\7)\2\2\u0257\u025e\7*\2\2\u0258"+
		"\u025e\7\61\2\2\u0259\u025e\7.\2\2\u025a\u025e\7\60\2\2\u025b\u025e\7"+
		"/\2\2\u025c\u025e\7\67\2\2\u025d\u0253\3\2\2\2\u025d\u0254\3\2\2\2\u025d"+
		"\u0255\3\2\2\2\u025d\u0256\3\2\2\2\u025d\u0257\3\2\2\2\u025d\u0258\3\2"+
		"\2\2\u025d\u0259\3\2\2\2\u025d\u025a\3\2\2\2\u025d\u025b\3\2\2\2\u025d"+
		"\u025c\3\2\2\2\u025ek\3\2\2\2\u025f\u0260\t\17\2\2\u0260m\3\2\2\2\u0261"+
		"\u0262\t\20\2\2\u0262o\3\2\2\2\u0263\u0264\7 \2\2\u0264\u0265\7|\2\2\u0265"+
		"\u0266\5r:\2\u0266\u0267\7}\2\2\u0267q\3\2\2\2\u0268\u026d\5t;\2\u0269"+
		"\u026a\7~\2\2\u026a\u026c\5t;\2\u026b\u0269\3\2\2\2\u026c\u026f\3\2\2"+
		"\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026es\3\2\2\2\u026f\u026d"+
		"\3\2\2\2\u0270\u0276\7z\2\2\u0271\u0274\7\u0080\2\2\u0272\u0275\7{\2\2"+
		"\u0273\u0275\5v<\2\u0274\u0272\3\2\2\2\u0274\u0273\3\2\2\2\u0275\u0277"+
		"\3\2\2\2\u0276\u0271\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2\2\2\u0278"+
		"\u027a\7\177\2\2\u0279\u0270\3\2\2\2\u0279\u0278\3\2\2\2\u027au\3\2\2"+
		"\2\u027b\u027c\t\21\2\2\u027cw\3\2\2\2\u027d\u027e\t\22\2\2\u027ey\3\2"+
		"\2\2\u027f\u0280\t\23\2\2\u0280{\3\2\2\2\u0281\u0282\t\24\2\2\u0282}\3"+
		"\2\2\2\u0283\u0284\7?\2\2\u0284\177\3\2\2\2\u0285\u0286\t\25\2\2\u0286"+
		"\u0081\3\2\2\2\u0287\u0288\7a\2\2\u0288\u0289\5^\60\2\u0289\u028a\7b\2"+
		"\2\u028a\u028c\3\2\2\2\u028b\u0287\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028b"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0083\3\2\2\2\u028f\u0291\7a\2\2\u0290"+
		"\u0292\5^\60\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293\u0295\7b\2\2\u0294\u028f\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0085\3\2\2\2N\u008b\u008d\u0097"+
		"\u009e\u00a3\u00ab\u00b4\u00be\u00c2\u00c7\u00d0\u00de\u00e3\u00e6\u00ea"+
		"\u00ed\u00f4\u00fb\u00ff\u0104\u010a\u010c\u0111\u011c\u0122\u0127\u012b"+
		"\u012f\u0139\u0142\u014c\u0153\u0158\u015e\u0160\u0165\u0184\u0186\u018b"+
		"\u019a\u01a3\u01a5\u01ac\u01b4\u01b7\u01ba\u01c0\u01c4\u01c8\u01ce\u01d3"+
		"\u01d7\u01db\u01dd\u01e2\u01e7\u01ec\u01f5\u01fa\u01fe\u0210\u0225\u0227"+
		"\u022e\u0233\u023b\u0249\u0250\u025d\u026d\u0274\u0276\u0279\u028d\u0291"+
		"\u0296";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}