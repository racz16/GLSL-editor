// Generated from c:\Users\Zalan\Desktop\Szakdolgozat\program\GlslEditor\grammar\AntlrGlslParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrGlslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_BREAK=1, KW_CONTINUE=2, KW_DO=3, KW_FOR=4, KW_WHILE=5, KW_SWITCH=6, 
		KW_CASE=7, KW_DEFAULT=8, KW_IF=9, KW_ELSE=10, KW_DISCARD=11, KW_RETURN=12, 
		KW_STRUCT=13, KW_VOID=14, RESERVED_KEYWORD=15, ILLEGAL_CHARACTERS=16, 
		Q_PRECISION=17, Q_LAYOUT=18, Q_PRECISE=19, Q_INVARIANT=20, Q_SUBROUTINE=21, 
		Q_SMOOTH=22, Q_FLAT=23, Q_NONPERSPECTIVE=24, Q_CONST=25, Q_INOUT=26, Q_IN=27, 
		Q_OUT=28, Q_CENTROID=29, Q_PATCH=30, Q_SAMPLE=31, Q_UNIFORM=32, Q_BUFFER=33, 
		Q_VARYING=34, Q_ATTRIBUTE=35, Q_COHERENT=36, Q_VOLATILE=37, Q_RESTRICT=38, 
		Q_READONLY=39, Q_WRIREONLY=40, Q_SHARED=41, Q_HIGHP=42, Q_MEDIUMP=43, 
		Q_LOWP=44, TYPE=45, BOOL_LITERAL=46, INT_LITERAL=47, FLOAT_LITERAL=48, 
		OP_MUL=49, OP_ADD=50, OP_SUB=51, OP_DIV=52, OP_MOD=53, OP_INC=54, OP_DEC=55, 
		OP_SHIFT=56, OP_RELATIONAL=57, OP_EQUALITY=58, OP_BIT_AND=59, OP_BIT_XOR=60, 
		OP_BIT_OR=61, OP_BIT_UNARY=62, OP_LOGICAL_AND=63, OP_LOGICAL_OR=64, OP_LOGICAL_XOR=65, 
		OP_LOGICAL_UNARY=66, OP_MODIFY=67, OP_ASSIGN=68, MACRO=69, NEW_LINE=70, 
		SPACE=71, TAB=72, MULTI_LINE_COMMENT=73, SINGLE_LINE_COMMENT=74, IDENTIFIER=75, 
		DOT=76, COMMA=77, COLON=78, SEMICOLON=79, QUESTION=80, LRB=81, RRB=82, 
		LCB=83, RCB=84, LSB=85, RSB=86;
	public static final int
		RULE_start = 0, RULE_function_header = 1, RULE_return_type = 2, RULE_function_subroutine_qualifier = 3, 
		RULE_type_name_list = 4, RULE_function_parameter_list = 5, RULE_function_parameter = 6, 
		RULE_parameter_qualifiers = 7, RULE_parameter_qualifier = 8, RULE_function_prototype = 9, 
		RULE_function_definition = 10, RULE_function_call = 11, RULE_function_call_parameter_list = 12, 
		RULE_statement = 13, RULE_compound_statement = 14, RULE_simple_statement = 15, 
		RULE_selection_statement = 16, RULE_switch_statement = 17, RULE_case_group = 18, 
		RULE_case_label = 19, RULE_case_statement_list = 20, RULE_iteration_statement = 21, 
		RULE_for_iteration = 22, RULE_while_iteration = 23, RULE_do_while_iteration = 24, 
		RULE_jump_statement = 25, RULE_expression_statement = 26, RULE_declaration_statement = 27, 
		RULE_variable_declaration = 28, RULE_member_declaration = 29, RULE_member_declarator = 30, 
		RULE_struct_declaration = 31, RULE_identifier_optarray = 32, RULE_identifier_optarray_optassignment = 33, 
		RULE_expression = 34, RULE_expression_list = 35, RULE_type = 36, RULE_array_subscript = 37, 
		RULE_type_qualifier = 38, RULE_storage_qualifier = 39, RULE_auxiliary_storage_qualifier = 40, 
		RULE_memory_qualifier = 41, RULE_layout_qualifier = 42, RULE_layout_qualifier_id_list = 43, 
		RULE_layout_qualifier_id = 44, RULE_precision_qualifier = 45, RULE_interpolation_qualifier = 46, 
		RULE_literal = 47, RULE_number_literal = 48;
	public static final String[] ruleNames = {
		"start", "function_header", "return_type", "function_subroutine_qualifier", 
		"type_name_list", "function_parameter_list", "function_parameter", "parameter_qualifiers", 
		"parameter_qualifier", "function_prototype", "function_definition", "function_call", 
		"function_call_parameter_list", "statement", "compound_statement", "simple_statement", 
		"selection_statement", "switch_statement", "case_group", "case_label", 
		"case_statement_list", "iteration_statement", "for_iteration", "while_iteration", 
		"do_while_iteration", "jump_statement", "expression_statement", "declaration_statement", 
		"variable_declaration", "member_declaration", "member_declarator", "struct_declaration", 
		"identifier_optarray", "identifier_optarray_optassignment", "expression", 
		"expression_list", "type", "array_subscript", "type_qualifier", "storage_qualifier", 
		"auxiliary_storage_qualifier", "memory_qualifier", "layout_qualifier", 
		"layout_qualifier_id_list", "layout_qualifier_id", "precision_qualifier", 
		"interpolation_qualifier", "literal", "number_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'break'", "'continue'", "'do'", "'for'", "'while'", "'switch'", 
		"'case'", "'default'", "'if'", "'else'", "'discard'", "'return'", "'struct'", 
		"'void'", null, null, "'precision'", "'layout'", "'precise'", "'invariant'", 
		"'subroutine'", "'smooth'", "'flat'", "'noperspective'", "'const'", "'inout'", 
		"'in'", "'out'", "'centroid'", "'patch'", "'sample'", "'uniform'", "'buffer'", 
		"'varying'", "'attribute'", "'coherent'", "'volatile'", "'restrict'", 
		"'readonly'", "'writeonly'", "'shared'", "'highp'", "'mediump'", "'lowp'", 
		null, null, null, null, "'*'", "'+'", "'-'", "'/'", "'%'", "'++'", "'--'", 
		null, null, null, "'&'", "'^'", "'|'", "'~'", "'&&'", "'||'", "'^^'", 
		"'!'", null, "'='", null, null, "' '", "'\t'", null, null, null, "'.'", 
		"','", "':'", "';'", "'?'", "'('", "')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KW_BREAK", "KW_CONTINUE", "KW_DO", "KW_FOR", "KW_WHILE", "KW_SWITCH", 
		"KW_CASE", "KW_DEFAULT", "KW_IF", "KW_ELSE", "KW_DISCARD", "KW_RETURN", 
		"KW_STRUCT", "KW_VOID", "RESERVED_KEYWORD", "ILLEGAL_CHARACTERS", "Q_PRECISION", 
		"Q_LAYOUT", "Q_PRECISE", "Q_INVARIANT", "Q_SUBROUTINE", "Q_SMOOTH", "Q_FLAT", 
		"Q_NONPERSPECTIVE", "Q_CONST", "Q_INOUT", "Q_IN", "Q_OUT", "Q_CENTROID", 
		"Q_PATCH", "Q_SAMPLE", "Q_UNIFORM", "Q_BUFFER", "Q_VARYING", "Q_ATTRIBUTE", 
		"Q_COHERENT", "Q_VOLATILE", "Q_RESTRICT", "Q_READONLY", "Q_WRIREONLY", 
		"Q_SHARED", "Q_HIGHP", "Q_MEDIUMP", "Q_LOWP", "TYPE", "BOOL_LITERAL", 
		"INT_LITERAL", "FLOAT_LITERAL", "OP_MUL", "OP_ADD", "OP_SUB", "OP_DIV", 
		"OP_MOD", "OP_INC", "OP_DEC", "OP_SHIFT", "OP_RELATIONAL", "OP_EQUALITY", 
		"OP_BIT_AND", "OP_BIT_XOR", "OP_BIT_OR", "OP_BIT_UNARY", "OP_LOGICAL_AND", 
		"OP_LOGICAL_OR", "OP_LOGICAL_XOR", "OP_LOGICAL_UNARY", "OP_MODIFY", "OP_ASSIGN", 
		"MACRO", "NEW_LINE", "SPACE", "TAB", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", 
		"IDENTIFIER", "DOT", "COMMA", "COLON", "SEMICOLON", "QUESTION", "LRB", 
		"RRB", "LCB", "RCB", "LSB", "RSB"
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
	public String getGrammarFileName() { return "AntlrGlslParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AntlrGlslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
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
		public List<TerminalNode> SEMICOLON() { return getTokens(AntlrGlslParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AntlrGlslParser.SEMICOLON, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_STRUCT) | (1L << KW_VOID) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE))) != 0) || _la==IDENTIFIER || _la==SEMICOLON) {
				{
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(98);
					function_prototype();
					}
					break;
				case 2:
					{
					setState(99);
					function_definition();
					}
					break;
				case 3:
					{
					setState(100);
					declaration_statement();
					}
					break;
				case 4:
					{
					setState(101);
					match(SEMICOLON);
					}
					break;
				}
				}
				setState(106);
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

	public static class Function_headerContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public Function_parameter_listContext function_parameter_list() {
			return getRuleContext(Function_parameter_listContext.class,0);
		}
		public Function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_header; }
	}

	public final Function_headerContext function_header() throws RecognitionException {
		Function_headerContext _localctx = new Function_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			return_type();
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(LRB);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (KW_VOID - 14)) | (1L << (Q_PRECISE - 14)) | (1L << (Q_CONST - 14)) | (1L << (Q_INOUT - 14)) | (1L << (Q_IN - 14)) | (1L << (Q_OUT - 14)) | (1L << (Q_COHERENT - 14)) | (1L << (Q_VOLATILE - 14)) | (1L << (Q_RESTRICT - 14)) | (1L << (Q_READONLY - 14)) | (1L << (Q_WRIREONLY - 14)) | (1L << (Q_HIGHP - 14)) | (1L << (Q_MEDIUMP - 14)) | (1L << (Q_LOWP - 14)) | (1L << (TYPE - 14)) | (1L << (IDENTIFIER - 14)))) != 0)) {
				{
				setState(110);
				function_parameter_list();
				}
			}

			setState(113);
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
		public TerminalNode KW_VOID() { return getToken(AntlrGlslParser.KW_VOID, 0); }
		public Precision_qualifierContext precision_qualifier() {
			return getRuleContext(Precision_qualifierContext.class,0);
		}
		public Function_subroutine_qualifierContext function_subroutine_qualifier() {
			return getRuleContext(Function_subroutine_qualifierContext.class,0);
		}
		public Array_subscriptContext array_subscript() {
			return getRuleContext(Array_subscriptContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_return_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				setState(115);
				precision_qualifier();
				}
			}

			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Q_SUBROUTINE) {
				{
				setState(118);
				function_subroutine_qualifier();
				}
			}

			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case IDENTIFIER:
				{
				setState(121);
				type();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(122);
					array_subscript();
					}
				}

				}
				break;
			case KW_VOID:
				{
				setState(125);
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
		public TerminalNode Q_SUBROUTINE() { return getToken(AntlrGlslParser.Q_SUBROUTINE, 0); }
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public Type_name_listContext type_name_list() {
			return getRuleContext(Type_name_listContext.class,0);
		}
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public Function_subroutine_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_subroutine_qualifier; }
	}

	public final Function_subroutine_qualifierContext function_subroutine_qualifier() throws RecognitionException {
		Function_subroutine_qualifierContext _localctx = new Function_subroutine_qualifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_subroutine_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(Q_SUBROUTINE);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LRB) {
				{
				setState(129);
				match(LRB);
				setState(130);
				type_name_list();
				setState(131);
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

	public static class Type_name_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AntlrGlslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AntlrGlslParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrGlslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrGlslParser.COMMA, i);
		}
		public Type_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name_list; }
	}

	public final Type_name_listContext type_name_list() throws RecognitionException {
		Type_name_listContext _localctx = new Type_name_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IDENTIFIER);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				match(COMMA);
				setState(137);
				match(IDENTIFIER);
				}
				}
				setState(142);
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

	public static class Function_parameter_listContext extends ParserRuleContext {
		public List<Function_parameterContext> function_parameter() {
			return getRuleContexts(Function_parameterContext.class);
		}
		public Function_parameterContext function_parameter(int i) {
			return getRuleContext(Function_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrGlslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrGlslParser.COMMA, i);
		}
		public TerminalNode KW_VOID() { return getToken(AntlrGlslParser.KW_VOID, 0); }
		public Function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_list; }
	}

	public final Function_parameter_listContext function_parameter_list() throws RecognitionException {
		Function_parameter_listContext _localctx = new Function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_parameter_list);
		int _la;
		try {
			setState(152);
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
				setState(143);
				function_parameter();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(144);
					match(COMMA);
					setState(145);
					function_parameter();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case KW_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
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
		public Parameter_qualifiersContext parameter_qualifiers() {
			return getRuleContext(Parameter_qualifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_subscriptContext array_subscript() {
			return getRuleContext(Array_subscriptContext.class,0);
		}
		public Identifier_optarrayContext identifier_optarray() {
			return getRuleContext(Identifier_optarrayContext.class,0);
		}
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			parameter_qualifiers();
			setState(155);
			type();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(156);
				array_subscript();
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(159);
				identifier_optarray();
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

	public static class Parameter_qualifiersContext extends ParserRuleContext {
		public Precision_qualifierContext precision_qualifier() {
			return getRuleContext(Precision_qualifierContext.class,0);
		}
		public List<Parameter_qualifierContext> parameter_qualifier() {
			return getRuleContexts(Parameter_qualifierContext.class);
		}
		public Parameter_qualifierContext parameter_qualifier(int i) {
			return getRuleContext(Parameter_qualifierContext.class,i);
		}
		public Parameter_qualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_qualifiers; }
	}

	public final Parameter_qualifiersContext parameter_qualifiers() throws RecognitionException {
		Parameter_qualifiersContext _localctx = new Parameter_qualifiersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter_qualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				setState(162);
				precision_qualifier();
				}
			}

			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_PRECISE) | (1L << Q_CONST) | (1L << Q_INOUT) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY))) != 0)) {
				{
				{
				setState(165);
				parameter_qualifier();
				}
				}
				setState(170);
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

	public static class Parameter_qualifierContext extends ParserRuleContext {
		public TerminalNode Q_CONST() { return getToken(AntlrGlslParser.Q_CONST, 0); }
		public TerminalNode Q_IN() { return getToken(AntlrGlslParser.Q_IN, 0); }
		public TerminalNode Q_OUT() { return getToken(AntlrGlslParser.Q_OUT, 0); }
		public TerminalNode Q_INOUT() { return getToken(AntlrGlslParser.Q_INOUT, 0); }
		public TerminalNode Q_PRECISE() { return getToken(AntlrGlslParser.Q_PRECISE, 0); }
		public Memory_qualifierContext memory_qualifier() {
			return getRuleContext(Memory_qualifierContext.class,0);
		}
		public Parameter_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_qualifier; }
	}

	public final Parameter_qualifierContext parameter_qualifier() throws RecognitionException {
		Parameter_qualifierContext _localctx = new Parameter_qualifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_qualifier);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(Q_CONST);
				}
				break;
			case Q_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(Q_IN);
				}
				break;
			case Q_OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(Q_OUT);
				}
				break;
			case Q_INOUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(Q_INOUT);
				}
				break;
			case Q_PRECISE:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(Q_PRECISE);
				}
				break;
			case Q_COHERENT:
			case Q_VOLATILE:
			case Q_RESTRICT:
			case Q_READONLY:
			case Q_WRIREONLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				memory_qualifier();
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
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AntlrGlslParser.SEMICOLON, 0); }
		public Function_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_prototype; }
	}

	public final Function_prototypeContext function_prototype() throws RecognitionException {
		Function_prototypeContext _localctx = new Function_prototypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			function_header();
			setState(180);
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
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			function_header();
			setState(183);
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
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public TerminalNode TYPE() { return getToken(AntlrGlslParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public Function_call_parameter_listContext function_call_parameter_list() {
			return getRuleContext(Function_call_parameter_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(186);
			match(LRB);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_VOID) | (1L << TYPE) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_INC) | (1L << OP_DEC) | (1L << OP_BIT_UNARY))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OP_LOGICAL_UNARY - 66)) | (1L << (IDENTIFIER - 66)) | (1L << (LRB - 66)))) != 0)) {
				{
				setState(187);
				function_call_parameter_list();
				}
			}

			setState(190);
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
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode KW_VOID() { return getToken(AntlrGlslParser.KW_VOID, 0); }
		public Function_call_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_parameter_list; }
	}

	public final Function_call_parameter_listContext function_call_parameter_list() throws RecognitionException {
		Function_call_parameter_listContext _localctx = new Function_call_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call_parameter_list);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
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
				setState(192);
				expression_list();
				}
				break;
			case KW_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCB:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
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
			case Q_SHARED:
			case Q_HIGHP:
			case Q_MEDIUMP:
			case Q_LOWP:
			case TYPE:
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
				setState(197);
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
		public TerminalNode LCB() { return getToken(AntlrGlslParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(AntlrGlslParser.RCB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(LCB);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_DO) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_SWITCH) | (1L << KW_IF) | (1L << KW_DISCARD) | (1L << KW_RETURN) | (1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_INC) | (1L << OP_DEC) | (1L << OP_BIT_UNARY))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OP_LOGICAL_UNARY - 66)) | (1L << (IDENTIFIER - 66)) | (1L << (SEMICOLON - 66)) | (1L << (LRB - 66)) | (1L << (LCB - 66)))) != 0)) {
				{
				{
				setState(201);
				statement();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simple_statement);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				expression_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				selection_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				iteration_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				jump_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
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
		public TerminalNode KW_IF() { return getToken(AntlrGlslParser.KW_IF, 0); }
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(AntlrGlslParser.KW_ELSE, 0); }
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(KW_IF);
			setState(218);
			match(LRB);
			setState(219);
			expression(0);
			setState(220);
			match(RRB);
			setState(221);
			statement();
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(222);
				match(KW_ELSE);
				setState(223);
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
		public TerminalNode KW_SWITCH() { return getToken(AntlrGlslParser.KW_SWITCH, 0); }
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public TerminalNode LCB() { return getToken(AntlrGlslParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(AntlrGlslParser.RCB, 0); }
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
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(KW_SWITCH);
			setState(227);
			match(LRB);
			setState(228);
			expression(0);
			setState(229);
			match(RRB);
			setState(230);
			match(LCB);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_CASE || _la==KW_DEFAULT) {
				{
				{
				setState(231);
				case_group();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
	}

	public final Case_groupContext case_group() throws RecognitionException {
		Case_groupContext _localctx = new Case_groupContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_case_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			case_label();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_DO) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_SWITCH) | (1L << KW_IF) | (1L << KW_DISCARD) | (1L << KW_RETURN) | (1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_INC) | (1L << OP_DEC) | (1L << OP_BIT_UNARY))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OP_LOGICAL_UNARY - 66)) | (1L << (IDENTIFIER - 66)) | (1L << (SEMICOLON - 66)) | (1L << (LRB - 66)) | (1L << (LCB - 66)))) != 0)) {
				{
				setState(240);
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
		public TerminalNode COLON() { return getToken(AntlrGlslParser.COLON, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(AntlrGlslParser.KW_DEFAULT, 0); }
		public TerminalNode KW_CASE() { return getToken(AntlrGlslParser.KW_CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DEFAULT:
				{
				setState(243);
				match(KW_DEFAULT);
				}
				break;
			case KW_CASE:
				{
				setState(244);
				match(KW_CASE);
				setState(245);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(248);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Case_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement_list; }
	}

	public final Case_statement_listContext case_statement_list() throws RecognitionException {
		Case_statement_listContext _localctx = new Case_statement_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_case_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				statement();
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_DO) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_SWITCH) | (1L << KW_IF) | (1L << KW_DISCARD) | (1L << KW_RETURN) | (1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_INC) | (1L << OP_DEC) | (1L << OP_BIT_UNARY))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OP_LOGICAL_UNARY - 66)) | (1L << (IDENTIFIER - 66)) | (1L << (SEMICOLON - 66)) | (1L << (LRB - 66)) | (1L << (LCB - 66)))) != 0) );
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
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_iteration_statement);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				for_iteration();
				}
				break;
			case KW_WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				while_iteration();
				}
				break;
			case KW_DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
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
		public TerminalNode KW_FOR() { return getToken(AntlrGlslParser.KW_FOR, 0); }
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(AntlrGlslParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AntlrGlslParser.SEMICOLON, i);
		}
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iteration; }
	}

	public final For_iterationContext for_iteration() throws RecognitionException {
		For_iterationContext _localctx = new For_iterationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_for_iteration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(KW_FOR);
			setState(261);
			match(LRB);
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(262);
				variable_declaration();
				}
				break;
			case 2:
				{
				setState(263);
				expression_list();
				}
				break;
			}
			setState(266);
			match(SEMICOLON);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (TYPE - 45)) | (1L << (BOOL_LITERAL - 45)) | (1L << (INT_LITERAL - 45)) | (1L << (FLOAT_LITERAL - 45)) | (1L << (OP_ADD - 45)) | (1L << (OP_SUB - 45)) | (1L << (OP_INC - 45)) | (1L << (OP_DEC - 45)) | (1L << (OP_BIT_UNARY - 45)) | (1L << (OP_LOGICAL_UNARY - 45)) | (1L << (IDENTIFIER - 45)) | (1L << (LRB - 45)))) != 0)) {
				{
				setState(267);
				expression(0);
				}
			}

			setState(270);
			match(SEMICOLON);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (TYPE - 45)) | (1L << (BOOL_LITERAL - 45)) | (1L << (INT_LITERAL - 45)) | (1L << (FLOAT_LITERAL - 45)) | (1L << (OP_ADD - 45)) | (1L << (OP_SUB - 45)) | (1L << (OP_INC - 45)) | (1L << (OP_DEC - 45)) | (1L << (OP_BIT_UNARY - 45)) | (1L << (OP_LOGICAL_UNARY - 45)) | (1L << (IDENTIFIER - 45)) | (1L << (LRB - 45)))) != 0)) {
				{
				setState(271);
				expression_list();
				}
			}

			setState(274);
			match(RRB);
			setState(275);
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
		public TerminalNode KW_WHILE() { return getToken(AntlrGlslParser.KW_WHILE, 0); }
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_iteration; }
	}

	public final While_iterationContext while_iteration() throws RecognitionException {
		While_iterationContext _localctx = new While_iterationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(KW_WHILE);
			setState(278);
			match(LRB);
			setState(279);
			expression(0);
			setState(280);
			match(RRB);
			setState(281);
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
		public TerminalNode KW_DO() { return getToken(AntlrGlslParser.KW_DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode KW_WHILE() { return getToken(AntlrGlslParser.KW_WHILE, 0); }
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public TerminalNode SEMICOLON() { return getToken(AntlrGlslParser.SEMICOLON, 0); }
		public Do_while_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_iteration; }
	}

	public final Do_while_iterationContext do_while_iteration() throws RecognitionException {
		Do_while_iterationContext _localctx = new Do_while_iterationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_do_while_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(KW_DO);
			setState(284);
			statement();
			setState(285);
			match(KW_WHILE);
			setState(286);
			match(LRB);
			setState(287);
			expression(0);
			setState(288);
			match(RRB);
			setState(289);
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
		public TerminalNode SEMICOLON() { return getToken(AntlrGlslParser.SEMICOLON, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(AntlrGlslParser.KW_CONTINUE, 0); }
		public TerminalNode KW_BREAK() { return getToken(AntlrGlslParser.KW_BREAK, 0); }
		public TerminalNode KW_DISCARD() { return getToken(AntlrGlslParser.KW_DISCARD, 0); }
		public TerminalNode KW_RETURN() { return getToken(AntlrGlslParser.KW_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jump_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CONTINUE:
				{
				setState(291);
				match(KW_CONTINUE);
				}
				break;
			case KW_BREAK:
				{
				setState(292);
				match(KW_BREAK);
				}
				break;
			case KW_DISCARD:
				{
				setState(293);
				match(KW_DISCARD);
				}
				break;
			case KW_RETURN:
				{
				setState(294);
				match(KW_RETURN);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (TYPE - 45)) | (1L << (BOOL_LITERAL - 45)) | (1L << (INT_LITERAL - 45)) | (1L << (FLOAT_LITERAL - 45)) | (1L << (OP_ADD - 45)) | (1L << (OP_SUB - 45)) | (1L << (OP_INC - 45)) | (1L << (OP_DEC - 45)) | (1L << (OP_BIT_UNARY - 45)) | (1L << (OP_LOGICAL_UNARY - 45)) | (1L << (IDENTIFIER - 45)) | (1L << (LRB - 45)))) != 0)) {
					{
					setState(295);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(300);
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
		public TerminalNode SEMICOLON() { return getToken(AntlrGlslParser.SEMICOLON, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (TYPE - 45)) | (1L << (BOOL_LITERAL - 45)) | (1L << (INT_LITERAL - 45)) | (1L << (FLOAT_LITERAL - 45)) | (1L << (OP_ADD - 45)) | (1L << (OP_SUB - 45)) | (1L << (OP_INC - 45)) | (1L << (OP_DEC - 45)) | (1L << (OP_BIT_UNARY - 45)) | (1L << (OP_LOGICAL_UNARY - 45)) | (1L << (IDENTIFIER - 45)) | (1L << (LRB - 45)))) != 0)) {
				{
				setState(302);
				expression_list();
				}
			}

			setState(305);
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
		public TerminalNode Q_PRECISION() { return getToken(AntlrGlslParser.Q_PRECISION, 0); }
		public Precision_qualifierContext precision_qualifier() {
			return getRuleContext(Precision_qualifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AntlrGlslParser.SEMICOLON, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AntlrGlslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AntlrGlslParser.IDENTIFIER, i);
		}
		public TerminalNode LCB() { return getToken(AntlrGlslParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(AntlrGlslParser.RCB, 0); }
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public List<Member_declarationContext> member_declaration() {
			return getRuleContexts(Member_declarationContext.class);
		}
		public Member_declarationContext member_declaration(int i) {
			return getRuleContext(Member_declarationContext.class,i);
		}
		public Identifier_optarrayContext identifier_optarray() {
			return getRuleContext(Identifier_optarrayContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrGlslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrGlslParser.COMMA, i);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declaration_statement);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(Q_PRECISION);
				setState(308);
				precision_qualifier();
				setState(309);
				type();
				setState(310);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				variable_declaration();
				setState(313);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
					{
					{
					setState(315);
					type_qualifier();
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				match(IDENTIFIER);
				setState(322);
				match(LCB);
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(323);
					member_declaration();
					}
					}
					setState(326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (Q_LAYOUT - 18)) | (1L << (Q_PRECISE - 18)) | (1L << (Q_INVARIANT - 18)) | (1L << (Q_SUBROUTINE - 18)) | (1L << (Q_SMOOTH - 18)) | (1L << (Q_FLAT - 18)) | (1L << (Q_NONPERSPECTIVE - 18)) | (1L << (Q_CONST - 18)) | (1L << (Q_IN - 18)) | (1L << (Q_OUT - 18)) | (1L << (Q_CENTROID - 18)) | (1L << (Q_PATCH - 18)) | (1L << (Q_SAMPLE - 18)) | (1L << (Q_UNIFORM - 18)) | (1L << (Q_BUFFER - 18)) | (1L << (Q_VARYING - 18)) | (1L << (Q_ATTRIBUTE - 18)) | (1L << (Q_SHARED - 18)) | (1L << (Q_HIGHP - 18)) | (1L << (Q_MEDIUMP - 18)) | (1L << (Q_LOWP - 18)) | (1L << (TYPE - 18)) | (1L << (IDENTIFIER - 18)))) != 0) );
				setState(328);
				match(RCB);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(329);
					identifier_optarray();
					}
				}

				setState(332);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
					{
					{
					setState(334);
					type_qualifier();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(340);
					match(IDENTIFIER);
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(341);
						match(COMMA);
						setState(342);
						match(IDENTIFIER);
						}
						}
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(350);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Array_subscriptContext array_subscript() {
			return getRuleContext(Array_subscriptContext.class,0);
		}
		public List<Identifier_optarray_optassignmentContext> identifier_optarray_optassignment() {
			return getRuleContexts(Identifier_optarray_optassignmentContext.class);
		}
		public Identifier_optarray_optassignmentContext identifier_optarray_optassignment(int i) {
			return getRuleContext(Identifier_optarray_optassignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrGlslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrGlslParser.COMMA, i);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(353);
				type_qualifier();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case IDENTIFIER:
				{
				setState(359);
				type();
				}
				break;
			case KW_STRUCT:
				{
				setState(360);
				struct_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(363);
				array_subscript();
				}
			}

			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(366);
				identifier_optarray_optassignment();
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(367);
					match(COMMA);
					setState(368);
					identifier_optarray_optassignment();
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Member_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Member_declaratorContext member_declarator() {
			return getRuleContext(Member_declaratorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AntlrGlslParser.SEMICOLON, 0); }
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Array_subscriptContext array_subscript() {
			return getRuleContext(Array_subscriptContext.class,0);
		}
		public Member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declaration; }
	}

	public final Member_declarationContext member_declaration() throws RecognitionException {
		Member_declarationContext _localctx = new Member_declarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(376);
				type_qualifier();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			type();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(383);
				array_subscript();
				}
			}

			setState(386);
			member_declarator();
			setState(387);
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

	public static class Member_declaratorContext extends ParserRuleContext {
		public List<Identifier_optarrayContext> identifier_optarray() {
			return getRuleContexts(Identifier_optarrayContext.class);
		}
		public Identifier_optarrayContext identifier_optarray(int i) {
			return getRuleContext(Identifier_optarrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrGlslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrGlslParser.COMMA, i);
		}
		public Member_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator; }
	}

	public final Member_declaratorContext member_declarator() throws RecognitionException {
		Member_declaratorContext _localctx = new Member_declaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_member_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			identifier_optarray();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390);
				match(COMMA);
				setState(391);
				identifier_optarray();
				}
				}
				setState(396);
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(AntlrGlslParser.KW_STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public TerminalNode LCB() { return getToken(AntlrGlslParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(AntlrGlslParser.RCB, 0); }
		public List<Member_declarationContext> member_declaration() {
			return getRuleContexts(Member_declarationContext.class);
		}
		public Member_declarationContext member_declaration(int i) {
			return getRuleContext(Member_declarationContext.class,i);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(KW_STRUCT);
			setState(398);
			match(IDENTIFIER);
			setState(399);
			match(LCB);
			setState(401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(400);
				member_declaration();
				}
				}
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (Q_LAYOUT - 18)) | (1L << (Q_PRECISE - 18)) | (1L << (Q_INVARIANT - 18)) | (1L << (Q_SUBROUTINE - 18)) | (1L << (Q_SMOOTH - 18)) | (1L << (Q_FLAT - 18)) | (1L << (Q_NONPERSPECTIVE - 18)) | (1L << (Q_CONST - 18)) | (1L << (Q_IN - 18)) | (1L << (Q_OUT - 18)) | (1L << (Q_CENTROID - 18)) | (1L << (Q_PATCH - 18)) | (1L << (Q_SAMPLE - 18)) | (1L << (Q_UNIFORM - 18)) | (1L << (Q_BUFFER - 18)) | (1L << (Q_VARYING - 18)) | (1L << (Q_ATTRIBUTE - 18)) | (1L << (Q_SHARED - 18)) | (1L << (Q_HIGHP - 18)) | (1L << (Q_MEDIUMP - 18)) | (1L << (Q_LOWP - 18)) | (1L << (TYPE - 18)) | (1L << (IDENTIFIER - 18)))) != 0) );
			setState(405);
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

	public static class Identifier_optarrayContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public Array_subscriptContext array_subscript() {
			return getRuleContext(Array_subscriptContext.class,0);
		}
		public Identifier_optarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_optarray; }
	}

	public final Identifier_optarrayContext identifier_optarray() throws RecognitionException {
		Identifier_optarrayContext _localctx = new Identifier_optarrayContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_identifier_optarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(IDENTIFIER);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(408);
				array_subscript();
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

	public static class Identifier_optarray_optassignmentContext extends ParserRuleContext {
		public Identifier_optarrayContext identifier_optarray() {
			return getRuleContext(Identifier_optarrayContext.class,0);
		}
		public TerminalNode OP_ASSIGN() { return getToken(AntlrGlslParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Identifier_optarray_optassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_optarray_optassignment; }
	}

	public final Identifier_optarray_optassignmentContext identifier_optarray_optassignment() throws RecognitionException {
		Identifier_optarray_optassignmentContext _localctx = new Identifier_optarray_optassignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_identifier_optarray_optassignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			identifier_optarray();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(412);
				match(OP_ASSIGN);
				setState(413);
				expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public TerminalNode OP_ADD() { return getToken(AntlrGlslParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(AntlrGlslParser.OP_SUB, 0); }
		public TerminalNode OP_LOGICAL_UNARY() { return getToken(AntlrGlslParser.OP_LOGICAL_UNARY, 0); }
		public TerminalNode OP_BIT_UNARY() { return getToken(AntlrGlslParser.OP_BIT_UNARY, 0); }
		public TerminalNode OP_INC() { return getToken(AntlrGlslParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(AntlrGlslParser.OP_DEC, 0); }
		public TerminalNode OP_MUL() { return getToken(AntlrGlslParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(AntlrGlslParser.OP_DIV, 0); }
		public TerminalNode OP_MOD() { return getToken(AntlrGlslParser.OP_MOD, 0); }
		public TerminalNode OP_SHIFT() { return getToken(AntlrGlslParser.OP_SHIFT, 0); }
		public TerminalNode OP_RELATIONAL() { return getToken(AntlrGlslParser.OP_RELATIONAL, 0); }
		public TerminalNode OP_EQUALITY() { return getToken(AntlrGlslParser.OP_EQUALITY, 0); }
		public TerminalNode OP_BIT_AND() { return getToken(AntlrGlslParser.OP_BIT_AND, 0); }
		public TerminalNode OP_BIT_XOR() { return getToken(AntlrGlslParser.OP_BIT_XOR, 0); }
		public TerminalNode OP_BIT_OR() { return getToken(AntlrGlslParser.OP_BIT_OR, 0); }
		public TerminalNode OP_LOGICAL_AND() { return getToken(AntlrGlslParser.OP_LOGICAL_AND, 0); }
		public TerminalNode OP_LOGICAL_XOR() { return getToken(AntlrGlslParser.OP_LOGICAL_XOR, 0); }
		public TerminalNode OP_LOGICAL_OR() { return getToken(AntlrGlslParser.OP_LOGICAL_OR, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(AntlrGlslParser.OP_ASSIGN, 0); }
		public TerminalNode OP_MODIFY() { return getToken(AntlrGlslParser.OP_MODIFY, 0); }
		public Array_subscriptContext array_subscript() {
			return getRuleContext(Array_subscriptContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AntlrGlslParser.DOT, 0); }
		public TerminalNode QUESTION() { return getToken(AntlrGlslParser.QUESTION, 0); }
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AntlrGlslParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(417);
				literal();
				}
				break;
			case 2:
				{
				setState(418);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(419);
				function_call();
				}
				break;
			case 4:
				{
				setState(420);
				match(LRB);
				setState(421);
				expression(0);
				setState(422);
				match(RRB);
				}
				break;
			case 5:
				{
				setState(424);
				_la = _input.LA(1);
				if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (OP_ADD - 50)) | (1L << (OP_SUB - 50)) | (1L << (OP_INC - 50)) | (1L << (OP_DEC - 50)) | (1L << (OP_BIT_UNARY - 50)) | (1L << (OP_LOGICAL_UNARY - 50)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(425);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(480);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(428);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(429);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MUL) | (1L << OP_DIV) | (1L << OP_MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(430);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(431);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(432);
						_la = _input.LA(1);
						if ( !(_la==OP_ADD || _la==OP_SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(433);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(434);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(435);
						match(OP_SHIFT);
						setState(436);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(437);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(438);
						match(OP_RELATIONAL);
						setState(439);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(440);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(441);
						match(OP_EQUALITY);
						setState(442);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(443);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(444);
						match(OP_BIT_AND);
						setState(445);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(446);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(447);
						match(OP_BIT_XOR);
						setState(448);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(449);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(450);
						match(OP_BIT_OR);
						setState(451);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(452);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(453);
						match(OP_LOGICAL_AND);
						setState(454);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(455);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(456);
						match(OP_LOGICAL_XOR);
						setState(457);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(458);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(459);
						match(OP_LOGICAL_OR);
						setState(460);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(461);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(462);
						_la = _input.LA(1);
						if ( !(_la==OP_MODIFY || _la==OP_ASSIGN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(463);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(464);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(472);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(465);
							array_subscript();
							}
							break;
						case 2:
							{
							setState(466);
							match(DOT);
							setState(467);
							match(IDENTIFIER);
							}
							break;
						case 3:
							{
							setState(468);
							match(DOT);
							setState(469);
							function_call();
							}
							break;
						case 4:
							{
							setState(470);
							match(OP_INC);
							}
							break;
						case 5:
							{
							setState(471);
							match(OP_DEC);
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(474);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(475);
						match(QUESTION);
						setState(476);
						expression_list();
						setState(477);
						match(COLON);
						setState(478);
						expression_list();
						}
						break;
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrGlslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrGlslParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			expression(0);
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(486);
					match(COMMA);
					setState(487);
					expression(0);
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public TerminalNode TYPE() { return getToken(AntlrGlslParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
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

	public static class Array_subscriptContext extends ParserRuleContext {
		public List<TerminalNode> LSB() { return getTokens(AntlrGlslParser.LSB); }
		public TerminalNode LSB(int i) {
			return getToken(AntlrGlslParser.LSB, i);
		}
		public List<TerminalNode> RSB() { return getTokens(AntlrGlslParser.RSB); }
		public TerminalNode RSB(int i) {
			return getToken(AntlrGlslParser.RSB, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Array_subscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_subscript; }
	}

	public final Array_subscriptContext array_subscript() throws RecognitionException {
		Array_subscriptContext _localctx = new Array_subscriptContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_array_subscript);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(495);
					match(LSB);
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (TYPE - 45)) | (1L << (BOOL_LITERAL - 45)) | (1L << (INT_LITERAL - 45)) | (1L << (FLOAT_LITERAL - 45)) | (1L << (OP_ADD - 45)) | (1L << (OP_SUB - 45)) | (1L << (OP_INC - 45)) | (1L << (OP_DEC - 45)) | (1L << (OP_BIT_UNARY - 45)) | (1L << (OP_LOGICAL_UNARY - 45)) | (1L << (IDENTIFIER - 45)) | (1L << (LRB - 45)))) != 0)) {
						{
						setState(496);
						expression(0);
						}
					}

					setState(499);
					match(RSB);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(502); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
		public TerminalNode Q_INVARIANT() { return getToken(AntlrGlslParser.Q_INVARIANT, 0); }
		public TerminalNode Q_PRECISE() { return getToken(AntlrGlslParser.Q_PRECISE, 0); }
		public TerminalNode Q_SUBROUTINE() { return getToken(AntlrGlslParser.Q_SUBROUTINE, 0); }
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type_qualifier);
		try {
			setState(511);
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
			case Q_SHARED:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				storage_qualifier();
				}
				break;
			case Q_LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				layout_qualifier();
				}
				break;
			case Q_HIGHP:
			case Q_MEDIUMP:
			case Q_LOWP:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				precision_qualifier();
				}
				break;
			case Q_SMOOTH:
			case Q_FLAT:
			case Q_NONPERSPECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				interpolation_qualifier();
				}
				break;
			case Q_INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(508);
				match(Q_INVARIANT);
				}
				break;
			case Q_PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(509);
				match(Q_PRECISE);
				}
				break;
			case Q_SUBROUTINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(510);
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

	public static class Storage_qualifierContext extends ParserRuleContext {
		public Auxiliary_storage_qualifierContext auxiliary_storage_qualifier() {
			return getRuleContext(Auxiliary_storage_qualifierContext.class,0);
		}
		public TerminalNode Q_CONST() { return getToken(AntlrGlslParser.Q_CONST, 0); }
		public TerminalNode Q_IN() { return getToken(AntlrGlslParser.Q_IN, 0); }
		public TerminalNode Q_OUT() { return getToken(AntlrGlslParser.Q_OUT, 0); }
		public TerminalNode Q_ATTRIBUTE() { return getToken(AntlrGlslParser.Q_ATTRIBUTE, 0); }
		public TerminalNode Q_UNIFORM() { return getToken(AntlrGlslParser.Q_UNIFORM, 0); }
		public TerminalNode Q_VARYING() { return getToken(AntlrGlslParser.Q_VARYING, 0); }
		public TerminalNode Q_BUFFER() { return getToken(AntlrGlslParser.Q_BUFFER, 0); }
		public TerminalNode Q_SHARED() { return getToken(AntlrGlslParser.Q_SHARED, 0); }
		public Storage_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_qualifier; }
	}

	public final Storage_qualifierContext storage_qualifier() throws RecognitionException {
		Storage_qualifierContext _localctx = new Storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_storage_qualifier);
		try {
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_CENTROID:
			case Q_PATCH:
			case Q_SAMPLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				auxiliary_storage_qualifier();
				}
				break;
			case Q_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(Q_CONST);
				}
				break;
			case Q_IN:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				match(Q_IN);
				}
				break;
			case Q_OUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(516);
				match(Q_OUT);
				}
				break;
			case Q_ATTRIBUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(517);
				match(Q_ATTRIBUTE);
				}
				break;
			case Q_UNIFORM:
				enterOuterAlt(_localctx, 6);
				{
				setState(518);
				match(Q_UNIFORM);
				}
				break;
			case Q_VARYING:
				enterOuterAlt(_localctx, 7);
				{
				setState(519);
				match(Q_VARYING);
				}
				break;
			case Q_BUFFER:
				enterOuterAlt(_localctx, 8);
				{
				setState(520);
				match(Q_BUFFER);
				}
				break;
			case Q_SHARED:
				enterOuterAlt(_localctx, 9);
				{
				setState(521);
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
		public TerminalNode Q_CENTROID() { return getToken(AntlrGlslParser.Q_CENTROID, 0); }
		public TerminalNode Q_SAMPLE() { return getToken(AntlrGlslParser.Q_SAMPLE, 0); }
		public TerminalNode Q_PATCH() { return getToken(AntlrGlslParser.Q_PATCH, 0); }
		public Auxiliary_storage_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxiliary_storage_qualifier; }
	}

	public final Auxiliary_storage_qualifierContext auxiliary_storage_qualifier() throws RecognitionException {
		Auxiliary_storage_qualifierContext _localctx = new Auxiliary_storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_auxiliary_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
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

	public static class Memory_qualifierContext extends ParserRuleContext {
		public TerminalNode Q_COHERENT() { return getToken(AntlrGlslParser.Q_COHERENT, 0); }
		public TerminalNode Q_VOLATILE() { return getToken(AntlrGlslParser.Q_VOLATILE, 0); }
		public TerminalNode Q_RESTRICT() { return getToken(AntlrGlslParser.Q_RESTRICT, 0); }
		public TerminalNode Q_READONLY() { return getToken(AntlrGlslParser.Q_READONLY, 0); }
		public TerminalNode Q_WRIREONLY() { return getToken(AntlrGlslParser.Q_WRIREONLY, 0); }
		public Memory_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_qualifier; }
	}

	public final Memory_qualifierContext memory_qualifier() throws RecognitionException {
		Memory_qualifierContext _localctx = new Memory_qualifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_memory_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		public TerminalNode Q_LAYOUT() { return getToken(AntlrGlslParser.Q_LAYOUT, 0); }
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public Layout_qualifier_id_listContext layout_qualifier_id_list() {
			return getRuleContext(Layout_qualifier_id_listContext.class,0);
		}
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public Layout_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier; }
	}

	public final Layout_qualifierContext layout_qualifier() throws RecognitionException {
		Layout_qualifierContext _localctx = new Layout_qualifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_layout_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(Q_LAYOUT);
			setState(529);
			match(LRB);
			setState(530);
			layout_qualifier_id_list();
			setState(531);
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
		public List<TerminalNode> COMMA() { return getTokens(AntlrGlslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrGlslParser.COMMA, i);
		}
		public Layout_qualifier_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id_list; }
	}

	public final Layout_qualifier_id_listContext layout_qualifier_id_list() throws RecognitionException {
		Layout_qualifier_id_listContext _localctx = new Layout_qualifier_id_listContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_layout_qualifier_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			layout_qualifier_id();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(534);
				match(COMMA);
				setState(535);
				layout_qualifier_id();
				}
				}
				setState(540);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(AntlrGlslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AntlrGlslParser.IDENTIFIER, i);
		}
		public TerminalNode OP_ASSIGN() { return getToken(AntlrGlslParser.OP_ASSIGN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Q_SHARED() { return getToken(AntlrGlslParser.Q_SHARED, 0); }
		public Layout_qualifier_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id; }
	}

	public final Layout_qualifier_idContext layout_qualifier_id() throws RecognitionException {
		Layout_qualifier_idContext _localctx = new Layout_qualifier_idContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_layout_qualifier_id);
		int _la;
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(IDENTIFIER);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASSIGN) {
					{
					setState(542);
					match(OP_ASSIGN);
					setState(545);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(543);
						match(IDENTIFIER);
						}
						break;
					case BOOL_LITERAL:
					case INT_LITERAL:
					case FLOAT_LITERAL:
						{
						setState(544);
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
				setState(549);
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
		public TerminalNode Q_LOWP() { return getToken(AntlrGlslParser.Q_LOWP, 0); }
		public TerminalNode Q_MEDIUMP() { return getToken(AntlrGlslParser.Q_MEDIUMP, 0); }
		public TerminalNode Q_HIGHP() { return getToken(AntlrGlslParser.Q_HIGHP, 0); }
		public Precision_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision_qualifier; }
	}

	public final Precision_qualifierContext precision_qualifier() throws RecognitionException {
		Precision_qualifierContext _localctx = new Precision_qualifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_precision_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
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
		public TerminalNode Q_SMOOTH() { return getToken(AntlrGlslParser.Q_SMOOTH, 0); }
		public TerminalNode Q_FLAT() { return getToken(AntlrGlslParser.Q_FLAT, 0); }
		public TerminalNode Q_NONPERSPECTIVE() { return getToken(AntlrGlslParser.Q_NONPERSPECTIVE, 0); }
		public Interpolation_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation_qualifier; }
	}

	public final Interpolation_qualifierContext interpolation_qualifier() throws RecognitionException {
		Interpolation_qualifierContext _localctx = new Interpolation_qualifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_interpolation_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
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
		public TerminalNode BOOL_LITERAL() { return getToken(AntlrGlslParser.BOOL_LITERAL, 0); }
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(BOOL_LITERAL);
				}
				break;
			case INT_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				number_literal();
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

	public static class Number_literalContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(AntlrGlslParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(AntlrGlslParser.FLOAT_LITERAL, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 15);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3X\u0235\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\7"+
		"\2i\n\2\f\2\16\2l\13\2\3\3\3\3\3\3\3\3\5\3r\n\3\3\3\3\3\3\4\5\4w\n\4\3"+
		"\4\5\4z\n\4\3\4\3\4\5\4~\n\4\3\4\5\4\u0081\n\4\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u0088\n\5\3\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\3\7\3\7\3\7\7"+
		"\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\5\7\u009b\n\7\3\b\3\b\3\b\5\b\u00a0"+
		"\n\b\3\b\5\b\u00a3\n\b\3\t\5\t\u00a6\n\t\3\t\7\t\u00a9\n\t\f\t\16\t\u00ac"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\5\r\u00bf\n\r\3\r\3\r\3\16\3\16\5\16\u00c5\n\16\3\17\3\17"+
		"\5\17\u00c9\n\17\3\20\3\20\7\20\u00cd\n\20\f\20\16\20\u00d0\13\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00da\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00e3\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00eb"+
		"\n\23\f\23\16\23\u00ee\13\23\3\23\3\23\3\24\3\24\5\24\u00f4\n\24\3\25"+
		"\3\25\3\25\5\25\u00f9\n\25\3\25\3\25\3\26\6\26\u00fe\n\26\r\26\16\26\u00ff"+
		"\3\27\3\27\3\27\5\27\u0105\n\27\3\30\3\30\3\30\3\30\5\30\u010b\n\30\3"+
		"\30\3\30\5\30\u010f\n\30\3\30\3\30\5\30\u0113\n\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u012b\n\33\5\33\u012d\n\33\3\33\3\33\3\34\5"+
		"\34\u0132\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u013f\n\35\f\35\16\35\u0142\13\35\3\35\3\35\3\35\6\35\u0147\n\35"+
		"\r\35\16\35\u0148\3\35\3\35\5\35\u014d\n\35\3\35\3\35\3\35\7\35\u0152"+
		"\n\35\f\35\16\35\u0155\13\35\3\35\3\35\3\35\7\35\u015a\n\35\f\35\16\35"+
		"\u015d\13\35\5\35\u015f\n\35\3\35\5\35\u0162\n\35\3\36\7\36\u0165\n\36"+
		"\f\36\16\36\u0168\13\36\3\36\3\36\5\36\u016c\n\36\3\36\5\36\u016f\n\36"+
		"\3\36\3\36\3\36\7\36\u0174\n\36\f\36\16\36\u0177\13\36\5\36\u0179\n\36"+
		"\3\37\7\37\u017c\n\37\f\37\16\37\u017f\13\37\3\37\3\37\5\37\u0183\n\37"+
		"\3\37\3\37\3\37\3 \3 \3 \7 \u018b\n \f \16 \u018e\13 \3!\3!\3!\3!\6!\u0194"+
		"\n!\r!\16!\u0195\3!\3!\3\"\3\"\5\"\u019c\n\"\3#\3#\3#\5#\u01a1\n#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01ad\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01db\n$\3$\3$\3$\3$\3$\3$\7$\u01e3"+
		"\n$\f$\16$\u01e6\13$\3%\3%\3%\7%\u01eb\n%\f%\16%\u01ee\13%\3&\3&\3\'\3"+
		"\'\5\'\u01f4\n\'\3\'\6\'\u01f7\n\'\r\'\16\'\u01f8\3(\3(\3(\3(\3(\3(\3"+
		"(\5(\u0202\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u020d\n)\3*\3*\3+\3+\3,\3"+
		",\3,\3,\3,\3-\3-\3-\7-\u021b\n-\f-\16-\u021e\13-\3.\3.\3.\3.\5.\u0224"+
		"\n.\5.\u0226\n.\3.\5.\u0229\n.\3/\3/\3\60\3\60\3\61\3\61\5\61\u0231\n"+
		"\61\3\62\3\62\3\62\2\3F\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\f\4\2//MM\6\2\64\6589@@DD\4"+
		"\2\63\63\66\67\3\2\64\65\3\2EF\3\2\37!\3\2&*\3\2,.\3\2\30\32\3\2\61\62"+
		"\2\u0272\2j\3\2\2\2\4m\3\2\2\2\6v\3\2\2\2\b\u0082\3\2\2\2\n\u0089\3\2"+
		"\2\2\f\u009a\3\2\2\2\16\u009c\3\2\2\2\20\u00a5\3\2\2\2\22\u00b3\3\2\2"+
		"\2\24\u00b5\3\2\2\2\26\u00b8\3\2\2\2\30\u00bb\3\2\2\2\32\u00c4\3\2\2\2"+
		"\34\u00c8\3\2\2\2\36\u00ca\3\2\2\2 \u00d9\3\2\2\2\"\u00db\3\2\2\2$\u00e4"+
		"\3\2\2\2&\u00f1\3\2\2\2(\u00f8\3\2\2\2*\u00fd\3\2\2\2,\u0104\3\2\2\2."+
		"\u0106\3\2\2\2\60\u0117\3\2\2\2\62\u011d\3\2\2\2\64\u012c\3\2\2\2\66\u0131"+
		"\3\2\2\28\u0161\3\2\2\2:\u0166\3\2\2\2<\u017d\3\2\2\2>\u0187\3\2\2\2@"+
		"\u018f\3\2\2\2B\u0199\3\2\2\2D\u019d\3\2\2\2F\u01ac\3\2\2\2H\u01e7\3\2"+
		"\2\2J\u01ef\3\2\2\2L\u01f6\3\2\2\2N\u0201\3\2\2\2P\u020c\3\2\2\2R\u020e"+
		"\3\2\2\2T\u0210\3\2\2\2V\u0212\3\2\2\2X\u0217\3\2\2\2Z\u0228\3\2\2\2\\"+
		"\u022a\3\2\2\2^\u022c\3\2\2\2`\u0230\3\2\2\2b\u0232\3\2\2\2di\5\24\13"+
		"\2ei\5\26\f\2fi\58\35\2gi\7Q\2\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2"+
		"\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\3\3\2\2\2lj\3\2\2\2mn\5\6\4\2no\7M\2"+
		"\2oq\7S\2\2pr\5\f\7\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7T\2\2t\5\3\2\2"+
		"\2uw\5\\/\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\5\b\5\2yx\3\2\2\2yz\3\2\2"+
		"\2z\u0080\3\2\2\2{}\5J&\2|~\5L\'\2}|\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2"+
		"\177\u0081\7\20\2\2\u0080{\3\2\2\2\u0080\177\3\2\2\2\u0081\7\3\2\2\2\u0082"+
		"\u0087\7\27\2\2\u0083\u0084\7S\2\2\u0084\u0085\5\n\6\2\u0085\u0086\7T"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\t\3\2\2\2\u0089\u008e\7M\2\2\u008a\u008b\7O\2\2\u008b\u008d\7M\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\13\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0096\5\16\b\2\u0092\u0093"+
		"\7O\2\2\u0093\u0095\5\16\b\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009b\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009b\7\20\2\2\u009a\u0091\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\r\3\2\2\2\u009c\u009d\5\20\t\2\u009d\u009f\5J&\2\u009e\u00a0\5L\'\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\5B"+
		"\"\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a6"+
		"\5\\/\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00aa\3\2\2\2\u00a7"+
		"\u00a9\5\22\n\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\21\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b4\7\33\2\2\u00ae\u00b4\7\35\2\2\u00af\u00b4\7\36\2\2\u00b0\u00b4"+
		"\7\34\2\2\u00b1\u00b4\7\25\2\2\u00b2\u00b4\5T+\2\u00b3\u00ad\3\2\2\2\u00b3"+
		"\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b4\23\3\2\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7"+
		"\7Q\2\2\u00b7\25\3\2\2\2\u00b8\u00b9\5\4\3\2\u00b9\u00ba\5\36\20\2\u00ba"+
		"\27\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bc\u00be\7S\2\2\u00bd\u00bf\5\32\16"+
		"\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\7T\2\2\u00c1\31\3\2\2\2\u00c2\u00c5\5H%\2\u00c3\u00c5\7\20\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\33\3\2\2\2\u00c6\u00c9\5\36\20"+
		"\2\u00c7\u00c9\5 \21\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\35"+
		"\3\2\2\2\u00ca\u00ce\7U\2\2\u00cb\u00cd\5\34\17\2\u00cc\u00cb\3\2\2\2"+
		"\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7V\2\2\u00d2\37\3\2\2\2\u00d3"+
		"\u00da\58\35\2\u00d4\u00da\5\66\34\2\u00d5\u00da\5\"\22\2\u00d6\u00da"+
		"\5,\27\2\u00d7\u00da\5\64\33\2\u00d8\u00da\5$\23\2\u00d9\u00d3\3\2\2\2"+
		"\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da!\3\2\2\2\u00db\u00dc\7\13\2\2\u00dc"+
		"\u00dd\7S\2\2\u00dd\u00de\5F$\2\u00de\u00df\7T\2\2\u00df\u00e2\5\34\17"+
		"\2\u00e0\u00e1\7\f\2\2\u00e1\u00e3\5\34\17\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3#\3\2\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\7S\2\2\u00e6"+
		"\u00e7\5F$\2\u00e7\u00e8\7T\2\2\u00e8\u00ec\7U\2\2\u00e9\u00eb\5&\24\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7V\2\2\u00f0"+
		"%\3\2\2\2\u00f1\u00f3\5(\25\2\u00f2\u00f4\5*\26\2\u00f3\u00f2\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\'\3\2\2\2\u00f5\u00f9\7\n\2\2\u00f6\u00f7\7"+
		"\t\2\2\u00f7\u00f9\5F$\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\7P\2\2\u00fb)\3\2\2\2\u00fc\u00fe\5\34\17\2"+
		"\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100+\3\2\2\2\u0101\u0105\5.\30\2\u0102\u0105\5\60\31\2\u0103"+
		"\u0105\5\62\32\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3"+
		"\2\2\2\u0105-\3\2\2\2\u0106\u0107\7\6\2\2\u0107\u010a\7S\2\2\u0108\u010b"+
		"\5:\36\2\u0109\u010b\5H%\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\7Q\2\2\u010d\u010f\5F$"+
		"\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112"+
		"\7Q\2\2\u0111\u0113\5H%\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\7T\2\2\u0115\u0116\5\34\17\2\u0116/\3\2\2\2"+
		"\u0117\u0118\7\7\2\2\u0118\u0119\7S\2\2\u0119\u011a\5F$\2\u011a\u011b"+
		"\7T\2\2\u011b\u011c\5\34\17\2\u011c\61\3\2\2\2\u011d\u011e\7\5\2\2\u011e"+
		"\u011f\5\34\17\2\u011f\u0120\7\7\2\2\u0120\u0121\7S\2\2\u0121\u0122\5"+
		"F$\2\u0122\u0123\7T\2\2\u0123\u0124\7Q\2\2\u0124\63\3\2\2\2\u0125\u012d"+
		"\7\4\2\2\u0126\u012d\7\3\2\2\u0127\u012d\7\r\2\2\u0128\u012a\7\16\2\2"+
		"\u0129\u012b\5F$\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d"+
		"\3\2\2\2\u012c\u0125\3\2\2\2\u012c\u0126\3\2\2\2\u012c\u0127\3\2\2\2\u012c"+
		"\u0128\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7Q\2\2\u012f\65\3\2\2\2"+
		"\u0130\u0132\5H%\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0134\7Q\2\2\u0134\67\3\2\2\2\u0135\u0136\7\23\2\2\u0136"+
		"\u0137\5\\/\2\u0137\u0138\5J&\2\u0138\u0139\7Q\2\2\u0139\u0162\3\2\2\2"+
		"\u013a\u013b\5:\36\2\u013b\u013c\7Q\2\2\u013c\u0162\3\2\2\2\u013d\u013f"+
		"\5N(\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7M"+
		"\2\2\u0144\u0146\7U\2\2\u0145\u0147\5<\37\2\u0146\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014c\7V\2\2\u014b\u014d\5B\"\2\u014c\u014b\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7Q\2\2\u014f\u0162\3\2\2\2\u0150"+
		"\u0152\5N(\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2"+
		"\2\u0153\u0154\3\2\2\2\u0154\u015e\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015b"+
		"\7M\2\2\u0157\u0158\7O\2\2\u0158\u015a\7M\2\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e\u0156\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\7Q\2\2\u0161\u0135\3\2\2\2\u0161\u013a\3\2"+
		"\2\2\u0161\u0140\3\2\2\2\u0161\u0153\3\2\2\2\u01629\3\2\2\2\u0163\u0165"+
		"\5N(\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u016b\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016c\5J"+
		"&\2\u016a\u016c\5@!\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c\u016e"+
		"\3\2\2\2\u016d\u016f\5L\'\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0178\3\2\2\2\u0170\u0175\5D#\2\u0171\u0172\7O\2\2\u0172\u0174\5D#\2"+
		"\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0170\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179;\3\2\2\2\u017a\u017c\5N(\2\u017b\u017a\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0182\5J&\2\u0181\u0183\5L\'\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\5> \2\u0185"+
		"\u0186\7Q\2\2\u0186=\3\2\2\2\u0187\u018c\5B\"\2\u0188\u0189\7O\2\2\u0189"+
		"\u018b\5B\"\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d?\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190"+
		"\7\17\2\2\u0190\u0191\7M\2\2\u0191\u0193\7U\2\2\u0192\u0194\5<\37\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7V\2\2\u0198A\3\2\2\2\u0199\u019b"+
		"\7M\2\2\u019a\u019c\5L\'\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"C\3\2\2\2\u019d\u01a0\5B\"\2\u019e\u019f\7F\2\2\u019f\u01a1\5F$\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1E\3\2\2\2\u01a2\u01a3\b$\1\2\u01a3"+
		"\u01ad\5`\61\2\u01a4\u01ad\7M\2\2\u01a5\u01ad\5\30\r\2\u01a6\u01a7\7S"+
		"\2\2\u01a7\u01a8\5F$\2\u01a8\u01a9\7T\2\2\u01a9\u01ad\3\2\2\2\u01aa\u01ab"+
		"\t\3\2\2\u01ab\u01ad\5F$\20\u01ac\u01a2\3\2\2\2\u01ac\u01a4\3\2\2\2\u01ac"+
		"\u01a5\3\2\2\2\u01ac\u01a6\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01e4\3\2"+
		"\2\2\u01ae\u01af\f\17\2\2\u01af\u01b0\t\4\2\2\u01b0\u01e3\5F$\20\u01b1"+
		"\u01b2\f\16\2\2\u01b2\u01b3\t\5\2\2\u01b3\u01e3\5F$\17\u01b4\u01b5\f\r"+
		"\2\2\u01b5\u01b6\7:\2\2\u01b6\u01e3\5F$\16\u01b7\u01b8\f\f\2\2\u01b8\u01b9"+
		"\7;\2\2\u01b9\u01e3\5F$\r\u01ba\u01bb\f\13\2\2\u01bb\u01bc\7<\2\2\u01bc"+
		"\u01e3\5F$\f\u01bd\u01be\f\n\2\2\u01be\u01bf\7=\2\2\u01bf\u01e3\5F$\13"+
		"\u01c0\u01c1\f\t\2\2\u01c1\u01c2\7>\2\2\u01c2\u01e3\5F$\n\u01c3\u01c4"+
		"\f\b\2\2\u01c4\u01c5\7?\2\2\u01c5\u01e3\5F$\t\u01c6\u01c7\f\7\2\2\u01c7"+
		"\u01c8\7A\2\2\u01c8\u01e3\5F$\b\u01c9\u01ca\f\6\2\2\u01ca\u01cb\7C\2\2"+
		"\u01cb\u01e3\5F$\7\u01cc\u01cd\f\5\2\2\u01cd\u01ce\7B\2\2\u01ce\u01e3"+
		"\5F$\6\u01cf\u01d0\f\3\2\2\u01d0\u01d1\t\6\2\2\u01d1\u01e3\5F$\4\u01d2"+
		"\u01da\f\21\2\2\u01d3\u01db\5L\'\2\u01d4\u01d5\7N\2\2\u01d5\u01db\7M\2"+
		"\2\u01d6\u01d7\7N\2\2\u01d7\u01db\5\30\r\2\u01d8\u01db\78\2\2\u01d9\u01db"+
		"\79\2\2\u01da\u01d3\3\2\2\2\u01da\u01d4\3\2\2\2\u01da\u01d6\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01e3\3\2\2\2\u01dc\u01dd\f\4"+
		"\2\2\u01dd\u01de\7R\2\2\u01de\u01df\5H%\2\u01df\u01e0\7P\2\2\u01e0\u01e1"+
		"\5H%\2\u01e1\u01e3\3\2\2\2\u01e2\u01ae\3\2\2\2\u01e2\u01b1\3\2\2\2\u01e2"+
		"\u01b4\3\2\2\2\u01e2\u01b7\3\2\2\2\u01e2\u01ba\3\2\2\2\u01e2\u01bd\3\2"+
		"\2\2\u01e2\u01c0\3\2\2\2\u01e2\u01c3\3\2\2\2\u01e2\u01c6\3\2\2\2\u01e2"+
		"\u01c9\3\2\2\2\u01e2\u01cc\3\2\2\2\u01e2\u01cf\3\2\2\2\u01e2\u01d2\3\2"+
		"\2\2\u01e2\u01dc\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5G\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01ec\5F$\2\u01e8"+
		"\u01e9\7O\2\2\u01e9\u01eb\5F$\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2"+
		"\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edI\3\2\2\2\u01ee\u01ec"+
		"\3\2\2\2\u01ef\u01f0\t\2\2\2\u01f0K\3\2\2\2\u01f1\u01f3\7W\2\2\u01f2\u01f4"+
		"\5F$\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f7\7X\2\2\u01f6\u01f1\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9M\3\2\2\2\u01fa\u0202\5P)\2\u01fb\u0202"+
		"\5V,\2\u01fc\u0202\5\\/\2\u01fd\u0202\5^\60\2\u01fe\u0202\7\26\2\2\u01ff"+
		"\u0202\7\25\2\2\u0200\u0202\7\27\2\2\u0201\u01fa\3\2\2\2\u0201\u01fb\3"+
		"\2\2\2\u0201\u01fc\3\2\2\2\u0201\u01fd\3\2\2\2\u0201\u01fe\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202O\3\2\2\2\u0203\u020d\5R*\2\u0204"+
		"\u020d\7\33\2\2\u0205\u020d\7\35\2\2\u0206\u020d\7\36\2\2\u0207\u020d"+
		"\7%\2\2\u0208\u020d\7\"\2\2\u0209\u020d\7$\2\2\u020a\u020d\7#\2\2\u020b"+
		"\u020d\7+\2\2\u020c\u0203\3\2\2\2\u020c\u0204\3\2\2\2\u020c\u0205\3\2"+
		"\2\2\u020c\u0206\3\2\2\2\u020c\u0207\3\2\2\2\u020c\u0208\3\2\2\2\u020c"+
		"\u0209\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020dQ\3\2\2\2"+
		"\u020e\u020f\t\7\2\2\u020fS\3\2\2\2\u0210\u0211\t\b\2\2\u0211U\3\2\2\2"+
		"\u0212\u0213\7\24\2\2\u0213\u0214\7S\2\2\u0214\u0215\5X-\2\u0215\u0216"+
		"\7T\2\2\u0216W\3\2\2\2\u0217\u021c\5Z.\2\u0218\u0219\7O\2\2\u0219\u021b"+
		"\5Z.\2\u021a\u0218\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021dY\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0225\7M\2\2\u0220"+
		"\u0223\7F\2\2\u0221\u0224\7M\2\2\u0222\u0224\5`\61\2\u0223\u0221\3\2\2"+
		"\2\u0223\u0222\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0220\3\2\2\2\u0225\u0226"+
		"\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0229\7+\2\2\u0228\u021f\3\2\2\2\u0228"+
		"\u0227\3\2\2\2\u0229[\3\2\2\2\u022a\u022b\t\t\2\2\u022b]\3\2\2\2\u022c"+
		"\u022d\t\n\2\2\u022d_\3\2\2\2\u022e\u0231\7\60\2\2\u022f\u0231\5b\62\2"+
		"\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231a\3\2\2\2\u0232\u0233\t"+
		"\13\2\2\u0233c\3\2\2\2Chjqvy}\u0080\u0087\u008e\u0096\u009a\u009f\u00a2"+
		"\u00a5\u00aa\u00b3\u00be\u00c4\u00c8\u00ce\u00d9\u00e2\u00ec\u00f3\u00f8"+
		"\u00ff\u0104\u010a\u010e\u0112\u012a\u012c\u0131\u0140\u0148\u014c\u0153"+
		"\u015b\u015e\u0161\u0166\u016b\u016e\u0175\u0178\u017d\u0182\u018c\u0195"+
		"\u019b\u01a0\u01ac\u01da\u01e2\u01e4\u01ec\u01f3\u01f8\u0201\u020c\u021c"+
		"\u0223\u0225\u0228\u0230";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}