// Generated from AntlrGlslParser.g4 by ANTLR 4.7.1
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
public class AntlrGlslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_BREAK=1, KW_CONTINUE=2, KW_DO=3, KW_FOR=4, KW_WHILE=5, KW_SWITCH=6, 
		KW_CASE=7, KW_DEFAULT=8, KW_IF=9, KW_ELSE=10, KW_DISCARD=11, KW_RETURN=12, 
		KW_STRUCT=13, KW_VOID=14, RESERVED_KEYWORD=15, Q_PRECISION=16, Q_LAYOUT=17, 
		Q_PRECISE=18, Q_INVARIANT=19, Q_SUBROUTINE=20, Q_SMOOTH=21, Q_FLAT=22, 
		Q_NONPERSPECTIVE=23, Q_CONST=24, Q_INOUT=25, Q_IN=26, Q_OUT=27, Q_CENTROID=28, 
		Q_PATCH=29, Q_SAMPLE=30, Q_UNIFORM=31, Q_BUFFER=32, Q_VARYING=33, Q_ATTRIBUTE=34, 
		Q_COHERENT=35, Q_VOLATILE=36, Q_RESTRICT=37, Q_READONLY=38, Q_WRIREONLY=39, 
		Q_SHARED=40, Q_HIGHP=41, Q_MEDIUMP=42, Q_LOWP=43, TYPE=44, BOOL_LITERAL=45, 
		INT_LITERAL=46, FLOAT_LITERAL=47, OP_MUL=48, OP_ADD=49, OP_SUB=50, OP_DIV=51, 
		OP_MOD=52, OP_INC=53, OP_DEC=54, OP_SHIFT=55, OP_RELATIONAL=56, OP_BIT=57, 
		OP_BIT_UNARY=58, OP_LOGICAL=59, OP_LOGICAL_UNARY=60, OP_MODIFY=61, OP_ASSIGN=62, 
		MACRO=63, NEW_LINE=64, SPACE=65, TAB=66, MULTI_LINE_COMMENT=67, SINGLE_LINE_COMMENT=68, 
		IDENTIFIER=69, DOT=70, COMMA=71, COLON=72, SEMICOLON=73, QUESTION=74, 
		LRB=75, RRB=76, LCB=77, RCB=78, LSB=79, RSB=80;
	public static final int
		RULE_start = 0, RULE_function_signature = 1, RULE_return_type = 2, RULE_function_subroutine_qualifier = 3, 
		RULE_function_parameter_list = 4, RULE_function_parameter = 5, RULE_parameter_qualifier = 6, 
		RULE_function_prototype = 7, RULE_function_definition = 8, RULE_function_call = 9, 
		RULE_function_call_parameter_list = 10, RULE_statement_list = 11, RULE_statement = 12, 
		RULE_compound_statement = 13, RULE_simple_statement = 14, RULE_selection_statement = 15, 
		RULE_switch_statement = 16, RULE_case_group = 17, RULE_case_label = 18, 
		RULE_case_statement_list = 19, RULE_iteration_statement = 20, RULE_for_iteration = 21, 
		RULE_while_iteration = 22, RULE_do_while_iteration = 23, RULE_jump_statement = 24, 
		RULE_expression_statement = 25, RULE_declaration_statement = 26, RULE_init_declaration_list = 27, 
		RULE_single_declaration = 28, RULE_struct_declaration_list = 29, RULE_struct_declaration = 30, 
		RULE_struct_declarator_list = 31, RULE_struct_declarator = 32, RULE_struct_specifier = 33, 
		RULE_expression = 34, RULE_constant_expression = 35, RULE_fully_specified_type = 36, 
		RULE_fully_specified_struct = 37, RULE_type = 38, RULE_type_qualifier = 39, 
		RULE_type_name_list = 40, RULE_storage_qualifier = 41, RULE_auxiliary_storage_qualifier = 42, 
		RULE_memory_storage_qualifier = 43, RULE_layout_qualifier = 44, RULE_layout_qualifier_id_list = 45, 
		RULE_layout_qualifier_id = 46, RULE_precision_qualifier = 47, RULE_interpolation_qualifier = 48, 
		RULE_literal = 49, RULE_bool_literal = 50, RULE_number_literal = 51, RULE_array_usage = 52, 
		RULE_array_declaration = 53;
	public static final String[] ruleNames = {
		"start", "function_signature", "return_type", "function_subroutine_qualifier", 
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
		null, "'break'", "'continue'", "'do'", "'for'", "'while'", "'switch'", 
		"'case'", "'default'", "'if'", "'else'", "'discard'", "'return'", "'struct'", 
		"'void'", null, "'precision'", "'layout'", "'precise'", "'invariant'", 
		"'subroutine'", "'smooth'", "'flat'", "'noperspective'", "'const'", "'inout'", 
		"'in'", "'out'", "'centroid'", "'patch'", "'sample'", "'uniform'", "'buffer'", 
		"'varying'", "'attribute'", "'coherent'", "'volatile'", "'restrict'", 
		"'readonly'", "'writeonly'", "'shared'", "'highp'", "'mediump'", "'lowp'", 
		null, null, null, null, "'*'", "'+'", "'-'", "'/'", "'%'", "'++'", "'--'", 
		null, null, null, "'~'", null, "'!'", null, "'='", null, null, "' '", 
		"'\t'", null, null, null, "'.'", "','", "':'", "';'", "'?'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KW_BREAK", "KW_CONTINUE", "KW_DO", "KW_FOR", "KW_WHILE", "KW_SWITCH", 
		"KW_CASE", "KW_DEFAULT", "KW_IF", "KW_ELSE", "KW_DISCARD", "KW_RETURN", 
		"KW_STRUCT", "KW_VOID", "RESERVED_KEYWORD", "Q_PRECISION", "Q_LAYOUT", 
		"Q_PRECISE", "Q_INVARIANT", "Q_SUBROUTINE", "Q_SMOOTH", "Q_FLAT", "Q_NONPERSPECTIVE", 
		"Q_CONST", "Q_INOUT", "Q_IN", "Q_OUT", "Q_CENTROID", "Q_PATCH", "Q_SAMPLE", 
		"Q_UNIFORM", "Q_BUFFER", "Q_VARYING", "Q_ATTRIBUTE", "Q_COHERENT", "Q_VOLATILE", 
		"Q_RESTRICT", "Q_READONLY", "Q_WRIREONLY", "Q_SHARED", "Q_HIGHP", "Q_MEDIUMP", 
		"Q_LOWP", "TYPE", "BOOL_LITERAL", "INT_LITERAL", "FLOAT_LITERAL", "OP_MUL", 
		"OP_ADD", "OP_SUB", "OP_DIV", "OP_MOD", "OP_INC", "OP_DEC", "OP_SHIFT", 
		"OP_RELATIONAL", "OP_BIT", "OP_BIT_UNARY", "OP_LOGICAL", "OP_LOGICAL_UNARY", 
		"OP_MODIFY", "OP_ASSIGN", "MACRO", "NEW_LINE", "SPACE", "TAB", "MULTI_LINE_COMMENT", 
		"SINGLE_LINE_COMMENT", "IDENTIFIER", "DOT", "COMMA", "COLON", "SEMICOLON", 
		"QUESTION", "LRB", "RRB", "LCB", "RCB", "LSB", "RSB"
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
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (KW_STRUCT - 13)) | (1L << (KW_VOID - 13)) | (1L << (Q_PRECISION - 13)) | (1L << (Q_LAYOUT - 13)) | (1L << (Q_PRECISE - 13)) | (1L << (Q_INVARIANT - 13)) | (1L << (Q_SUBROUTINE - 13)) | (1L << (Q_SMOOTH - 13)) | (1L << (Q_FLAT - 13)) | (1L << (Q_NONPERSPECTIVE - 13)) | (1L << (Q_CONST - 13)) | (1L << (Q_IN - 13)) | (1L << (Q_OUT - 13)) | (1L << (Q_CENTROID - 13)) | (1L << (Q_PATCH - 13)) | (1L << (Q_SAMPLE - 13)) | (1L << (Q_UNIFORM - 13)) | (1L << (Q_BUFFER - 13)) | (1L << (Q_VARYING - 13)) | (1L << (Q_ATTRIBUTE - 13)) | (1L << (Q_COHERENT - 13)) | (1L << (Q_VOLATILE - 13)) | (1L << (Q_RESTRICT - 13)) | (1L << (Q_READONLY - 13)) | (1L << (Q_WRIREONLY - 13)) | (1L << (Q_SHARED - 13)) | (1L << (Q_HIGHP - 13)) | (1L << (Q_MEDIUMP - 13)) | (1L << (Q_LOWP - 13)) | (1L << (TYPE - 13)) | (1L << (IDENTIFIER - 13)) | (1L << (SEMICOLON - 13)))) != 0)) {
				{
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(108);
					function_prototype();
					}
					break;
				case 2:
					{
					setState(109);
					function_definition();
					}
					break;
				case 3:
					{
					setState(110);
					declaration_statement();
					}
					break;
				case 4:
					{
					setState(111);
					match(SEMICOLON);
					}
					break;
				}
				}
				setState(116);
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

	public static class Function_signatureContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public Function_parameter_listContext function_parameter_list() {
			return getRuleContext(Function_parameter_listContext.class,0);
		}
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			return_type();
			setState(118);
			match(IDENTIFIER);
			setState(119);
			match(LRB);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (KW_VOID - 14)) | (1L << (Q_PRECISE - 14)) | (1L << (Q_CONST - 14)) | (1L << (Q_INOUT - 14)) | (1L << (Q_IN - 14)) | (1L << (Q_OUT - 14)) | (1L << (Q_COHERENT - 14)) | (1L << (Q_VOLATILE - 14)) | (1L << (Q_RESTRICT - 14)) | (1L << (Q_READONLY - 14)) | (1L << (Q_WRIREONLY - 14)) | (1L << (Q_HIGHP - 14)) | (1L << (Q_MEDIUMP - 14)) | (1L << (Q_LOWP - 14)) | (1L << (TYPE - 14)) | (1L << (IDENTIFIER - 14)))) != 0)) {
				{
				setState(120);
				function_parameter_list();
				}
			}

			setState(123);
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
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
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
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				setState(125);
				precision_qualifier();
				}
			}

			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Q_SUBROUTINE) {
				{
				setState(128);
				function_subroutine_qualifier();
				}
			}

			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case IDENTIFIER:
				{
				setState(131);
				type();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(132);
					array_declaration();
					}
				}

				}
				break;
			case KW_VOID:
				{
				setState(135);
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
			setState(138);
			match(Q_SUBROUTINE);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LRB) {
				{
				setState(139);
				match(LRB);
				setState(140);
				type_name_list();
				setState(141);
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
		enterRule(_localctx, 8, RULE_function_parameter_list);
		int _la;
		try {
			setState(154);
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
				setState(145);
				function_parameter();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(146);
					match(COMMA);
					setState(147);
					function_parameter();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case KW_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
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
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_PRECISE) | (1L << Q_CONST) | (1L << Q_INOUT) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(156);
				parameter_qualifier();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			type();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(163);
				match(IDENTIFIER);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(164);
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
		public TerminalNode Q_CONST() { return getToken(AntlrGlslParser.Q_CONST, 0); }
		public TerminalNode Q_IN() { return getToken(AntlrGlslParser.Q_IN, 0); }
		public TerminalNode Q_OUT() { return getToken(AntlrGlslParser.Q_OUT, 0); }
		public TerminalNode Q_INOUT() { return getToken(AntlrGlslParser.Q_INOUT, 0); }
		public TerminalNode Q_PRECISE() { return getToken(AntlrGlslParser.Q_PRECISE, 0); }
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
	}

	public final Parameter_qualifierContext parameter_qualifier() throws RecognitionException {
		Parameter_qualifierContext _localctx = new Parameter_qualifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter_qualifier);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_PRECISE:
			case Q_CONST:
			case Q_INOUT:
			case Q_IN:
			case Q_OUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
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
				setState(170);
				memory_storage_qualifier();
				}
				break;
			case Q_HIGHP:
			case Q_MEDIUMP:
			case Q_LOWP:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
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
		public TerminalNode SEMICOLON() { return getToken(AntlrGlslParser.SEMICOLON, 0); }
		public Function_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_prototype; }
	}

	public final Function_prototypeContext function_prototype() throws RecognitionException {
		Function_prototypeContext _localctx = new Function_prototypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			function_signature();
			setState(175);
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
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			function_signature();
			setState(178);
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
		enterRule(_localctx, 18, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(181);
			match(LRB);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (KW_VOID - 14)) | (1L << (TYPE - 14)) | (1L << (BOOL_LITERAL - 14)) | (1L << (INT_LITERAL - 14)) | (1L << (FLOAT_LITERAL - 14)) | (1L << (OP_ADD - 14)) | (1L << (OP_SUB - 14)) | (1L << (OP_INC - 14)) | (1L << (OP_DEC - 14)) | (1L << (OP_BIT_UNARY - 14)) | (1L << (OP_LOGICAL_UNARY - 14)) | (1L << (IDENTIFIER - 14)) | (1L << (LRB - 14)))) != 0)) {
				{
				setState(182);
				function_call_parameter_list();
				}
			}

			setState(185);
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
		public TerminalNode KW_VOID() { return getToken(AntlrGlslParser.KW_VOID, 0); }
		public Function_call_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_parameter_list; }
	}

	public final Function_call_parameter_listContext function_call_parameter_list() throws RecognitionException {
		Function_call_parameter_listContext _localctx = new Function_call_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_call_parameter_list);
		try {
			setState(189);
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
				setState(187);
				expression(0);
				}
				break;
			case KW_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
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
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				statement();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_DO) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_SWITCH) | (1L << KW_IF) | (1L << KW_DISCARD) | (1L << KW_RETURN) | (1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_INC) | (1L << OP_DEC) | (1L << OP_BIT_UNARY) | (1L << OP_LOGICAL_UNARY))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IDENTIFIER - 69)) | (1L << (SEMICOLON - 69)) | (1L << (LRB - 69)) | (1L << (LCB - 69)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 24, RULE_statement);
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
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(LCB);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_DO) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_SWITCH) | (1L << KW_IF) | (1L << KW_DISCARD) | (1L << KW_RETURN) | (1L << KW_STRUCT) | (1L << Q_PRECISION) | (1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP) | (1L << TYPE) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_INC) | (1L << OP_DEC) | (1L << OP_BIT_UNARY) | (1L << OP_LOGICAL_UNARY))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IDENTIFIER - 69)) | (1L << (SEMICOLON - 69)) | (1L << (LRB - 69)) | (1L << (LCB - 69)))) != 0)) {
				{
				setState(201);
				statement_list();
				}
			}

			setState(204);
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
		enterRule(_localctx, 28, RULE_simple_statement);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				expression_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				selection_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				iteration_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				jump_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
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
		enterRule(_localctx, 30, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(KW_IF);
			setState(215);
			match(LRB);
			setState(216);
			expression(0);
			setState(217);
			match(RRB);
			setState(218);
			statement();
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(219);
				match(KW_ELSE);
				setState(220);
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
		enterRule(_localctx, 32, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(KW_SWITCH);
			setState(224);
			match(LRB);
			setState(225);
			expression(0);
			setState(226);
			match(RRB);
			setState(227);
			match(LCB);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_CASE || _la==KW_DEFAULT) {
				{
				{
				setState(228);
				case_group();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
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
		enterRule(_localctx, 34, RULE_case_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			case_label();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (KW_STRUCT - 13)) | (1L << (Q_PRECISION - 13)) | (1L << (Q_LAYOUT - 13)) | (1L << (Q_PRECISE - 13)) | (1L << (Q_INVARIANT - 13)) | (1L << (Q_SUBROUTINE - 13)) | (1L << (Q_SMOOTH - 13)) | (1L << (Q_FLAT - 13)) | (1L << (Q_NONPERSPECTIVE - 13)) | (1L << (Q_CONST - 13)) | (1L << (Q_IN - 13)) | (1L << (Q_OUT - 13)) | (1L << (Q_CENTROID - 13)) | (1L << (Q_PATCH - 13)) | (1L << (Q_SAMPLE - 13)) | (1L << (Q_UNIFORM - 13)) | (1L << (Q_BUFFER - 13)) | (1L << (Q_VARYING - 13)) | (1L << (Q_ATTRIBUTE - 13)) | (1L << (Q_COHERENT - 13)) | (1L << (Q_VOLATILE - 13)) | (1L << (Q_RESTRICT - 13)) | (1L << (Q_READONLY - 13)) | (1L << (Q_WRIREONLY - 13)) | (1L << (Q_SHARED - 13)) | (1L << (Q_HIGHP - 13)) | (1L << (Q_MEDIUMP - 13)) | (1L << (Q_LOWP - 13)) | (1L << (TYPE - 13)) | (1L << (BOOL_LITERAL - 13)) | (1L << (INT_LITERAL - 13)) | (1L << (FLOAT_LITERAL - 13)) | (1L << (OP_ADD - 13)) | (1L << (OP_SUB - 13)) | (1L << (OP_INC - 13)) | (1L << (OP_DEC - 13)) | (1L << (OP_BIT_UNARY - 13)) | (1L << (OP_LOGICAL_UNARY - 13)) | (1L << (IDENTIFIER - 13)) | (1L << (SEMICOLON - 13)) | (1L << (LRB - 13)))) != 0)) {
				{
				setState(237);
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
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DEFAULT:
				{
				setState(240);
				match(KW_DEFAULT);
				}
				break;
			case KW_CASE:
				{
				setState(241);
				match(KW_CASE);
				setState(242);
				constant_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
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
	}

	public final Case_statement_listContext case_statement_list() throws RecognitionException {
		Case_statement_listContext _localctx = new Case_statement_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_case_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(247);
					declaration_statement();
					}
					break;
				case 2:
					{
					setState(248);
					expression_statement();
					}
					break;
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (KW_STRUCT - 13)) | (1L << (Q_PRECISION - 13)) | (1L << (Q_LAYOUT - 13)) | (1L << (Q_PRECISE - 13)) | (1L << (Q_INVARIANT - 13)) | (1L << (Q_SUBROUTINE - 13)) | (1L << (Q_SMOOTH - 13)) | (1L << (Q_FLAT - 13)) | (1L << (Q_NONPERSPECTIVE - 13)) | (1L << (Q_CONST - 13)) | (1L << (Q_IN - 13)) | (1L << (Q_OUT - 13)) | (1L << (Q_CENTROID - 13)) | (1L << (Q_PATCH - 13)) | (1L << (Q_SAMPLE - 13)) | (1L << (Q_UNIFORM - 13)) | (1L << (Q_BUFFER - 13)) | (1L << (Q_VARYING - 13)) | (1L << (Q_ATTRIBUTE - 13)) | (1L << (Q_COHERENT - 13)) | (1L << (Q_VOLATILE - 13)) | (1L << (Q_RESTRICT - 13)) | (1L << (Q_READONLY - 13)) | (1L << (Q_WRIREONLY - 13)) | (1L << (Q_SHARED - 13)) | (1L << (Q_HIGHP - 13)) | (1L << (Q_MEDIUMP - 13)) | (1L << (Q_LOWP - 13)) | (1L << (TYPE - 13)) | (1L << (BOOL_LITERAL - 13)) | (1L << (INT_LITERAL - 13)) | (1L << (FLOAT_LITERAL - 13)) | (1L << (OP_ADD - 13)) | (1L << (OP_SUB - 13)) | (1L << (OP_INC - 13)) | (1L << (OP_DEC - 13)) | (1L << (OP_BIT_UNARY - 13)) | (1L << (OP_LOGICAL_UNARY - 13)) | (1L << (IDENTIFIER - 13)) | (1L << (SEMICOLON - 13)) | (1L << (LRB - 13)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_iteration_statement);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				for_iteration();
				}
				break;
			case KW_WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				while_iteration();
				}
				break;
			case KW_DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
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
		public Init_declaration_listContext init_declaration_list() {
			return getRuleContext(Init_declaration_listContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iteration; }
	}

	public final For_iterationContext for_iteration() throws RecognitionException {
		For_iterationContext _localctx = new For_iterationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_iteration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(KW_FOR);
			setState(259);
			match(LRB);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (KW_STRUCT - 13)) | (1L << (Q_LAYOUT - 13)) | (1L << (Q_PRECISE - 13)) | (1L << (Q_INVARIANT - 13)) | (1L << (Q_SUBROUTINE - 13)) | (1L << (Q_SMOOTH - 13)) | (1L << (Q_FLAT - 13)) | (1L << (Q_NONPERSPECTIVE - 13)) | (1L << (Q_CONST - 13)) | (1L << (Q_IN - 13)) | (1L << (Q_OUT - 13)) | (1L << (Q_CENTROID - 13)) | (1L << (Q_PATCH - 13)) | (1L << (Q_SAMPLE - 13)) | (1L << (Q_UNIFORM - 13)) | (1L << (Q_BUFFER - 13)) | (1L << (Q_VARYING - 13)) | (1L << (Q_ATTRIBUTE - 13)) | (1L << (Q_COHERENT - 13)) | (1L << (Q_VOLATILE - 13)) | (1L << (Q_RESTRICT - 13)) | (1L << (Q_READONLY - 13)) | (1L << (Q_WRIREONLY - 13)) | (1L << (Q_SHARED - 13)) | (1L << (Q_HIGHP - 13)) | (1L << (Q_MEDIUMP - 13)) | (1L << (Q_LOWP - 13)) | (1L << (TYPE - 13)) | (1L << (IDENTIFIER - 13)))) != 0)) {
				{
				setState(260);
				init_declaration_list();
				}
			}

			setState(263);
			match(SEMICOLON);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (TYPE - 44)) | (1L << (BOOL_LITERAL - 44)) | (1L << (INT_LITERAL - 44)) | (1L << (FLOAT_LITERAL - 44)) | (1L << (OP_ADD - 44)) | (1L << (OP_SUB - 44)) | (1L << (OP_INC - 44)) | (1L << (OP_DEC - 44)) | (1L << (OP_BIT_UNARY - 44)) | (1L << (OP_LOGICAL_UNARY - 44)) | (1L << (IDENTIFIER - 44)) | (1L << (LRB - 44)))) != 0)) {
				{
				setState(264);
				expression(0);
				}
			}

			setState(267);
			match(SEMICOLON);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (TYPE - 44)) | (1L << (BOOL_LITERAL - 44)) | (1L << (INT_LITERAL - 44)) | (1L << (FLOAT_LITERAL - 44)) | (1L << (OP_ADD - 44)) | (1L << (OP_SUB - 44)) | (1L << (OP_INC - 44)) | (1L << (OP_DEC - 44)) | (1L << (OP_BIT_UNARY - 44)) | (1L << (OP_LOGICAL_UNARY - 44)) | (1L << (IDENTIFIER - 44)) | (1L << (LRB - 44)))) != 0)) {
				{
				setState(268);
				expression(0);
				}
			}

			setState(271);
			match(RRB);
			setState(272);
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
		enterRule(_localctx, 44, RULE_while_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(KW_WHILE);
			setState(275);
			match(LRB);
			setState(276);
			expression(0);
			setState(277);
			match(RRB);
			setState(278);
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
		enterRule(_localctx, 46, RULE_do_while_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(KW_DO);
			setState(281);
			statement();
			setState(282);
			match(KW_WHILE);
			setState(283);
			match(LRB);
			setState(284);
			expression(0);
			setState(285);
			match(RRB);
			setState(286);
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
		enterRule(_localctx, 48, RULE_jump_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CONTINUE:
				{
				setState(288);
				match(KW_CONTINUE);
				}
				break;
			case KW_BREAK:
				{
				setState(289);
				match(KW_BREAK);
				}
				break;
			case KW_DISCARD:
				{
				setState(290);
				match(KW_DISCARD);
				}
				break;
			case KW_RETURN:
				{
				setState(291);
				match(KW_RETURN);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (TYPE - 44)) | (1L << (BOOL_LITERAL - 44)) | (1L << (INT_LITERAL - 44)) | (1L << (FLOAT_LITERAL - 44)) | (1L << (OP_ADD - 44)) | (1L << (OP_SUB - 44)) | (1L << (OP_INC - 44)) | (1L << (OP_DEC - 44)) | (1L << (OP_BIT_UNARY - 44)) | (1L << (OP_LOGICAL_UNARY - 44)) | (1L << (IDENTIFIER - 44)) | (1L << (LRB - 44)))) != 0)) {
					{
					setState(292);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(297);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (TYPE - 44)) | (1L << (BOOL_LITERAL - 44)) | (1L << (INT_LITERAL - 44)) | (1L << (FLOAT_LITERAL - 44)) | (1L << (OP_ADD - 44)) | (1L << (OP_SUB - 44)) | (1L << (OP_INC - 44)) | (1L << (OP_DEC - 44)) | (1L << (OP_BIT_UNARY - 44)) | (1L << (OP_LOGICAL_UNARY - 44)) | (1L << (IDENTIFIER - 44)) | (1L << (LRB - 44)))) != 0)) {
				{
				setState(299);
				expression(0);
				}
			}

			setState(302);
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
		public Init_declaration_listContext init_declaration_list() {
			return getRuleContext(Init_declaration_listContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AntlrGlslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AntlrGlslParser.IDENTIFIER, i);
		}
		public TerminalNode LCB() { return getToken(AntlrGlslParser.LCB, 0); }
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public TerminalNode RCB() { return getToken(AntlrGlslParser.RCB, 0); }
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
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
		enterRule(_localctx, 52, RULE_declaration_statement);
		int _la;
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(Q_PRECISION);
				setState(305);
				precision_qualifier();
				setState(306);
				type();
				setState(307);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				init_declaration_list();
				setState(310);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
					{
					{
					setState(312);
					type_qualifier();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				match(IDENTIFIER);
				setState(319);
				match(LCB);
				setState(320);
				struct_declaration_list();
				setState(321);
				match(RCB);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(322);
					match(IDENTIFIER);
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LSB) {
						{
						setState(323);
						array_declaration();
						}
					}

					}
				}

				setState(328);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
					{
					{
					setState(330);
					type_qualifier();
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(336);
					match(IDENTIFIER);
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(337);
						match(COMMA);
						setState(338);
						match(IDENTIFIER);
						}
						}
						setState(343);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(346);
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
		public List<TerminalNode> COMMA() { return getTokens(AntlrGlslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrGlslParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AntlrGlslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AntlrGlslParser.IDENTIFIER, i);
		}
		public List<Array_declarationContext> array_declaration() {
			return getRuleContexts(Array_declarationContext.class);
		}
		public Array_declarationContext array_declaration(int i) {
			return getRuleContext(Array_declarationContext.class,i);
		}
		public List<TerminalNode> OP_ASSIGN() { return getTokens(AntlrGlslParser.OP_ASSIGN); }
		public TerminalNode OP_ASSIGN(int i) {
			return getToken(AntlrGlslParser.OP_ASSIGN, i);
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
	}

	public final Init_declaration_listContext init_declaration_list() throws RecognitionException {
		Init_declaration_listContext _localctx = new Init_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_init_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			single_declaration();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(350);
				match(COMMA);
				setState(351);
				match(IDENTIFIER);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(352);
					array_declaration();
					}
				}

				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASSIGN) {
					{
					setState(355);
					match(OP_ASSIGN);
					setState(356);
					expression(0);
					}
				}

				}
				}
				setState(363);
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
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
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
		public TerminalNode OP_ASSIGN() { return getToken(AntlrGlslParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Single_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_declaration; }
	}

	public final Single_declarationContext single_declaration() throws RecognitionException {
		Single_declarationContext _localctx = new Single_declarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_single_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(364);
				type_qualifier();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case IDENTIFIER:
				{
				setState(370);
				type();
				}
				break;
			case KW_STRUCT:
				{
				setState(371);
				struct_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(374);
				match(IDENTIFIER);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSB) {
					{
					setState(375);
					array_declaration();
					}
				}

				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASSIGN) {
					{
					setState(378);
					match(OP_ASSIGN);
					setState(379);
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
	}

	public final Struct_declaration_listContext struct_declaration_list() throws RecognitionException {
		Struct_declaration_listContext _localctx = new Struct_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_struct_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(384);
				struct_declaration();
				}
				}
				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Q_LAYOUT - 17)) | (1L << (Q_PRECISE - 17)) | (1L << (Q_INVARIANT - 17)) | (1L << (Q_SUBROUTINE - 17)) | (1L << (Q_SMOOTH - 17)) | (1L << (Q_FLAT - 17)) | (1L << (Q_NONPERSPECTIVE - 17)) | (1L << (Q_CONST - 17)) | (1L << (Q_IN - 17)) | (1L << (Q_OUT - 17)) | (1L << (Q_CENTROID - 17)) | (1L << (Q_PATCH - 17)) | (1L << (Q_SAMPLE - 17)) | (1L << (Q_UNIFORM - 17)) | (1L << (Q_BUFFER - 17)) | (1L << (Q_VARYING - 17)) | (1L << (Q_ATTRIBUTE - 17)) | (1L << (Q_COHERENT - 17)) | (1L << (Q_VOLATILE - 17)) | (1L << (Q_RESTRICT - 17)) | (1L << (Q_READONLY - 17)) | (1L << (Q_WRIREONLY - 17)) | (1L << (Q_SHARED - 17)) | (1L << (Q_HIGHP - 17)) | (1L << (Q_MEDIUMP - 17)) | (1L << (Q_LOWP - 17)) | (1L << (TYPE - 17)) | (1L << (IDENTIFIER - 17)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SEMICOLON() { return getToken(AntlrGlslParser.SEMICOLON, 0); }
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
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(389);
				type_qualifier();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			type();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(396);
				struct_declarator_list();
				}
			}

			setState(399);
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
		public List<TerminalNode> COMMA() { return getTokens(AntlrGlslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrGlslParser.COMMA, i);
		}
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_struct_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			struct_declarator();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(402);
				match(COMMA);
				setState(403);
				struct_declarator();
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

	public static class Struct_declaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_struct_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(IDENTIFIER);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(410);
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
		public TerminalNode KW_STRUCT() { return getToken(AntlrGlslParser.KW_STRUCT, 0); }
		public TerminalNode LCB() { return getToken(AntlrGlslParser.LCB, 0); }
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public TerminalNode RCB() { return getToken(AntlrGlslParser.RCB, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public Struct_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_specifier; }
	}

	public final Struct_specifierContext struct_specifier() throws RecognitionException {
		Struct_specifierContext _localctx = new Struct_specifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_struct_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(KW_STRUCT);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(414);
				match(IDENTIFIER);
				}
			}

			setState(417);
			match(LCB);
			setState(418);
			struct_declaration_list();
			setState(419);
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
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LRB() { return getToken(AntlrGlslParser.LRB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RRB() { return getToken(AntlrGlslParser.RRB, 0); }
		public TerminalNode OP_LOGICAL_UNARY() { return getToken(AntlrGlslParser.OP_LOGICAL_UNARY, 0); }
		public TerminalNode OP_ADD() { return getToken(AntlrGlslParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(AntlrGlslParser.OP_SUB, 0); }
		public TerminalNode OP_BIT_UNARY() { return getToken(AntlrGlslParser.OP_BIT_UNARY, 0); }
		public TerminalNode OP_INC() { return getToken(AntlrGlslParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(AntlrGlslParser.OP_DEC, 0); }
		public TerminalNode OP_MUL() { return getToken(AntlrGlslParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(AntlrGlslParser.OP_DIV, 0); }
		public TerminalNode OP_MOD() { return getToken(AntlrGlslParser.OP_MOD, 0); }
		public TerminalNode OP_SHIFT() { return getToken(AntlrGlslParser.OP_SHIFT, 0); }
		public TerminalNode OP_BIT() { return getToken(AntlrGlslParser.OP_BIT, 0); }
		public TerminalNode OP_RELATIONAL() { return getToken(AntlrGlslParser.OP_RELATIONAL, 0); }
		public TerminalNode OP_LOGICAL() { return getToken(AntlrGlslParser.OP_LOGICAL, 0); }
		public TerminalNode OP_MODIFY() { return getToken(AntlrGlslParser.OP_MODIFY, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(AntlrGlslParser.OP_ASSIGN, 0); }
		public TerminalNode QUESTION() { return getToken(AntlrGlslParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(AntlrGlslParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(AntlrGlslParser.COMMA, 0); }
		public TerminalNode DOT() { return getToken(AntlrGlslParser.DOT, 0); }
		public Array_usageContext array_usage() {
			return getRuleContext(Array_usageContext.class,0);
		}
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
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(422);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(423);
				function_call();
				}
				break;
			case 3:
				{
				setState(424);
				literal();
				}
				break;
			case 4:
				{
				setState(425);
				match(LRB);
				setState(426);
				expression(0);
				setState(427);
				match(RRB);
				}
				break;
			case 5:
				{
				setState(429);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_INC) | (1L << OP_DEC) | (1L << OP_BIT_UNARY) | (1L << OP_LOGICAL_UNARY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(430);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(452);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(433);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(434);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MUL) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_DIV) | (1L << OP_MOD) | (1L << OP_SHIFT) | (1L << OP_RELATIONAL) | (1L << OP_BIT) | (1L << OP_LOGICAL) | (1L << OP_MODIFY) | (1L << OP_ASSIGN))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(435);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(436);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(437);
						match(QUESTION);
						setState(438);
						expression(0);
						setState(439);
						match(COLON);
						setState(440);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(442);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(443);
						match(COMMA);
						setState(444);
						expression(2);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(445);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(446);
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
						setState(447);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(448);
						match(DOT);
						setState(449);
						match(IDENTIFIER);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(450);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(451);
						array_usage();
						}
						break;
					}
					} 
				}
				setState(456);
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

	public static class Constant_expressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constant_expression);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
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
	}

	public final Fully_specified_typeContext fully_specified_type() throws RecognitionException {
		Fully_specified_typeContext _localctx = new Fully_specified_typeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fully_specified_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(461);
				type_qualifier();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(467);
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
	}

	public final Fully_specified_structContext fully_specified_struct() throws RecognitionException {
		Fully_specified_structContext _localctx = new Fully_specified_structContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_fully_specified_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_SMOOTH) | (1L << Q_FLAT) | (1L << Q_NONPERSPECTIVE) | (1L << Q_CONST) | (1L << Q_IN) | (1L << Q_OUT) | (1L << Q_CENTROID) | (1L << Q_PATCH) | (1L << Q_SAMPLE) | (1L << Q_UNIFORM) | (1L << Q_BUFFER) | (1L << Q_VARYING) | (1L << Q_ATTRIBUTE) | (1L << Q_COHERENT) | (1L << Q_VOLATILE) | (1L << Q_RESTRICT) | (1L << Q_READONLY) | (1L << Q_WRIREONLY) | (1L << Q_SHARED) | (1L << Q_HIGHP) | (1L << Q_MEDIUMP) | (1L << Q_LOWP))) != 0)) {
				{
				{
				setState(469);
				type_qualifier();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
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
		public TerminalNode IDENTIFIER() { return getToken(AntlrGlslParser.IDENTIFIER, 0); }
		public TerminalNode TYPE() { return getToken(AntlrGlslParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
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
		enterRule(_localctx, 78, RULE_type_qualifier);
		try {
			setState(486);
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
				setState(479);
				storage_qualifier();
				}
				break;
			case Q_LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				layout_qualifier();
				}
				break;
			case Q_HIGHP:
			case Q_MEDIUMP:
			case Q_LOWP:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				precision_qualifier();
				}
				break;
			case Q_SMOOTH:
			case Q_FLAT:
			case Q_NONPERSPECTIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				interpolation_qualifier();
				}
				break;
			case Q_INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(483);
				match(Q_INVARIANT);
				}
				break;
			case Q_PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(484);
				match(Q_PRECISE);
				}
				break;
			case Q_SUBROUTINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(485);
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
		enterRule(_localctx, 80, RULE_type_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(IDENTIFIER);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(489);
				match(COMMA);
				setState(490);
				match(IDENTIFIER);
				}
				}
				setState(495);
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
		enterRule(_localctx, 82, RULE_storage_qualifier);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_COHERENT:
			case Q_VOLATILE:
			case Q_RESTRICT:
			case Q_READONLY:
			case Q_WRIREONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				memory_storage_qualifier();
				}
				break;
			case Q_CENTROID:
			case Q_PATCH:
			case Q_SAMPLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				auxiliary_storage_qualifier();
				}
				break;
			case Q_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				match(Q_CONST);
				}
				break;
			case Q_IN:
				enterOuterAlt(_localctx, 4);
				{
				setState(499);
				match(Q_IN);
				}
				break;
			case Q_OUT:
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
				match(Q_OUT);
				}
				break;
			case Q_ATTRIBUTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(501);
				match(Q_ATTRIBUTE);
				}
				break;
			case Q_UNIFORM:
				enterOuterAlt(_localctx, 7);
				{
				setState(502);
				match(Q_UNIFORM);
				}
				break;
			case Q_VARYING:
				enterOuterAlt(_localctx, 8);
				{
				setState(503);
				match(Q_VARYING);
				}
				break;
			case Q_BUFFER:
				enterOuterAlt(_localctx, 9);
				{
				setState(504);
				match(Q_BUFFER);
				}
				break;
			case Q_SHARED:
				enterOuterAlt(_localctx, 10);
				{
				setState(505);
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
		enterRule(_localctx, 84, RULE_auxiliary_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
		public TerminalNode Q_COHERENT() { return getToken(AntlrGlslParser.Q_COHERENT, 0); }
		public TerminalNode Q_VOLATILE() { return getToken(AntlrGlslParser.Q_VOLATILE, 0); }
		public TerminalNode Q_RESTRICT() { return getToken(AntlrGlslParser.Q_RESTRICT, 0); }
		public TerminalNode Q_READONLY() { return getToken(AntlrGlslParser.Q_READONLY, 0); }
		public TerminalNode Q_WRIREONLY() { return getToken(AntlrGlslParser.Q_WRIREONLY, 0); }
		public Memory_storage_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_storage_qualifier; }
	}

	public final Memory_storage_qualifierContext memory_storage_qualifier() throws RecognitionException {
		Memory_storage_qualifierContext _localctx = new Memory_storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_memory_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
		enterRule(_localctx, 88, RULE_layout_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(Q_LAYOUT);
			setState(513);
			match(LRB);
			setState(514);
			layout_qualifier_id_list();
			setState(515);
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
		enterRule(_localctx, 90, RULE_layout_qualifier_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			layout_qualifier_id();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(518);
				match(COMMA);
				setState(519);
				layout_qualifier_id();
				}
				}
				setState(524);
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
		enterRule(_localctx, 92, RULE_layout_qualifier_id);
		int _la;
		try {
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(IDENTIFIER);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASSIGN) {
					{
					setState(526);
					match(OP_ASSIGN);
					setState(529);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(527);
						match(IDENTIFIER);
						}
						break;
					case BOOL_LITERAL:
					case INT_LITERAL:
					case FLOAT_LITERAL:
						{
						setState(528);
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
				setState(533);
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
		enterRule(_localctx, 94, RULE_precision_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
		enterRule(_localctx, 96, RULE_interpolation_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
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
		public TerminalNode INT_LITERAL() { return getToken(AntlrGlslParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(AntlrGlslParser.FLOAT_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
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
		public TerminalNode BOOL_LITERAL() { return getToken(AntlrGlslParser.BOOL_LITERAL, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_bool_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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
		public TerminalNode INT_LITERAL() { return getToken(AntlrGlslParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(AntlrGlslParser.FLOAT_LITERAL, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
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
		public List<TerminalNode> LSB() { return getTokens(AntlrGlslParser.LSB); }
		public TerminalNode LSB(int i) {
			return getToken(AntlrGlslParser.LSB, i);
		}
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public List<TerminalNode> RSB() { return getTokens(AntlrGlslParser.RSB); }
		public TerminalNode RSB(int i) {
			return getToken(AntlrGlslParser.RSB, i);
		}
		public Array_usageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_usage; }
	}

	public final Array_usageContext array_usage() throws RecognitionException {
		Array_usageContext _localctx = new Array_usageContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_array_usage);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(550); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(546);
					match(LSB);
					setState(547);
					constant_expression();
					setState(548);
					match(RSB);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(552); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		public List<TerminalNode> LSB() { return getTokens(AntlrGlslParser.LSB); }
		public TerminalNode LSB(int i) {
			return getToken(AntlrGlslParser.LSB, i);
		}
		public List<TerminalNode> RSB() { return getTokens(AntlrGlslParser.RSB); }
		public TerminalNode RSB(int i) {
			return getToken(AntlrGlslParser.RSB, i);
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
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(554);
				match(LSB);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (BOOL_LITERAL - 45)) | (1L << (INT_LITERAL - 45)) | (1L << (FLOAT_LITERAL - 45)) | (1L << (IDENTIFIER - 45)))) != 0)) {
					{
					setState(555);
					constant_expression();
					}
				}

				setState(558);
				match(RSB);
				}
				}
				setState(561); 
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
		case 34:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u0236\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\3\3\3\3\3\3\3\3\5\3|\n\3\3\3\3\3\3\4\5\4\u0081\n\4\3\4\5\4\u0084\n"+
		"\4\3\4\3\4\5\4\u0088\n\4\3\4\5\4\u008b\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u0092"+
		"\n\5\3\6\3\6\3\6\7\6\u0097\n\6\f\6\16\6\u009a\13\6\3\6\5\6\u009d\n\6\3"+
		"\7\7\7\u00a0\n\7\f\7\16\7\u00a3\13\7\3\7\3\7\3\7\5\7\u00a8\n\7\5\7\u00aa"+
		"\n\7\3\b\3\b\3\b\5\b\u00af\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\5\13\u00ba\n\13\3\13\3\13\3\f\3\f\5\f\u00c0\n\f\3\r\6\r\u00c3\n\r\r\r"+
		"\16\r\u00c4\3\16\3\16\5\16\u00c9\n\16\3\17\3\17\5\17\u00cd\n\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d7\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00e0\n\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e8"+
		"\n\22\f\22\16\22\u00eb\13\22\3\22\3\22\3\23\3\23\5\23\u00f1\n\23\3\24"+
		"\3\24\3\24\5\24\u00f6\n\24\3\24\3\24\3\25\3\25\6\25\u00fc\n\25\r\25\16"+
		"\25\u00fd\3\26\3\26\3\26\5\26\u0103\n\26\3\27\3\27\3\27\5\27\u0108\n\27"+
		"\3\27\3\27\5\27\u010c\n\27\3\27\3\27\5\27\u0110\n\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u0128\n\32\5\32\u012a\n\32\3\32\3\32\3\33"+
		"\5\33\u012f\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u013c\n\34\f\34\16\34\u013f\13\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0147\n\34\5\34\u0149\n\34\3\34\3\34\3\34\7\34\u014e\n\34\f\34\16"+
		"\34\u0151\13\34\3\34\3\34\3\34\7\34\u0156\n\34\f\34\16\34\u0159\13\34"+
		"\5\34\u015b\n\34\3\34\5\34\u015e\n\34\3\35\3\35\3\35\3\35\5\35\u0164\n"+
		"\35\3\35\3\35\5\35\u0168\n\35\7\35\u016a\n\35\f\35\16\35\u016d\13\35\3"+
		"\36\7\36\u0170\n\36\f\36\16\36\u0173\13\36\3\36\3\36\5\36\u0177\n\36\3"+
		"\36\3\36\5\36\u017b\n\36\3\36\3\36\5\36\u017f\n\36\5\36\u0181\n\36\3\37"+
		"\6\37\u0184\n\37\r\37\16\37\u0185\3 \7 \u0189\n \f \16 \u018c\13 \3 \3"+
		" \5 \u0190\n \3 \3 \3!\3!\3!\7!\u0197\n!\f!\16!\u019a\13!\3\"\3\"\5\""+
		"\u019e\n\"\3#\3#\5#\u01a2\n#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\5$\u01b2\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\7$\u01c7\n$\f$\16$\u01ca\13$\3%\3%\5%\u01ce\n%\3&\7&\u01d1\n&\f&\16"+
		"&\u01d4\13&\3&\3&\3\'\7\'\u01d9\n\'\f\'\16\'\u01dc\13\'\3\'\3\'\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3)\5)\u01e9\n)\3*\3*\3*\7*\u01ee\n*\f*\16*\u01f1\13"+
		"*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01fd\n+\3,\3,\3-\3-\3.\3.\3.\3.\3"+
		".\3/\3/\3/\7/\u020b\n/\f/\16/\u020e\13/\3\60\3\60\3\60\3\60\5\60\u0214"+
		"\n\60\5\60\u0216\n\60\3\60\5\60\u0219\n\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\6\66\u0229\n\66\r\66\16\66"+
		"\u022a\3\67\3\67\5\67\u022f\n\67\3\67\6\67\u0232\n\67\r\67\16\67\u0233"+
		"\3\67\2\3F8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\r\4\2\24\24\32\35\4\2..GG\6\2\63\64\67"+
		"8<<>>\6\2\62\669;==?@\3\2\678\3\2\36 \3\2%)\3\2+-\3\2\27\31\3\2/\61\3"+
		"\2\60\61\2\u0265\2t\3\2\2\2\4w\3\2\2\2\6\u0080\3\2\2\2\b\u008c\3\2\2\2"+
		"\n\u009c\3\2\2\2\f\u00a1\3\2\2\2\16\u00ae\3\2\2\2\20\u00b0\3\2\2\2\22"+
		"\u00b3\3\2\2\2\24\u00b6\3\2\2\2\26\u00bf\3\2\2\2\30\u00c2\3\2\2\2\32\u00c8"+
		"\3\2\2\2\34\u00ca\3\2\2\2\36\u00d6\3\2\2\2 \u00d8\3\2\2\2\"\u00e1\3\2"+
		"\2\2$\u00ee\3\2\2\2&\u00f5\3\2\2\2(\u00fb\3\2\2\2*\u0102\3\2\2\2,\u0104"+
		"\3\2\2\2.\u0114\3\2\2\2\60\u011a\3\2\2\2\62\u0129\3\2\2\2\64\u012e\3\2"+
		"\2\2\66\u015d\3\2\2\28\u015f\3\2\2\2:\u0171\3\2\2\2<\u0183\3\2\2\2>\u018a"+
		"\3\2\2\2@\u0193\3\2\2\2B\u019b\3\2\2\2D\u019f\3\2\2\2F\u01b1\3\2\2\2H"+
		"\u01cd\3\2\2\2J\u01d2\3\2\2\2L\u01da\3\2\2\2N\u01df\3\2\2\2P\u01e8\3\2"+
		"\2\2R\u01ea\3\2\2\2T\u01fc\3\2\2\2V\u01fe\3\2\2\2X\u0200\3\2\2\2Z\u0202"+
		"\3\2\2\2\\\u0207\3\2\2\2^\u0218\3\2\2\2`\u021a\3\2\2\2b\u021c\3\2\2\2"+
		"d\u021e\3\2\2\2f\u0220\3\2\2\2h\u0222\3\2\2\2j\u0228\3\2\2\2l\u0231\3"+
		"\2\2\2ns\5\20\t\2os\5\22\n\2ps\5\66\34\2qs\7K\2\2rn\3\2\2\2ro\3\2\2\2"+
		"rp\3\2\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\3\3\2\2\2vt\3\2\2"+
		"\2wx\5\6\4\2xy\7G\2\2y{\7M\2\2z|\5\n\6\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2"+
		"}~\7N\2\2~\5\3\2\2\2\177\u0081\5`\61\2\u0080\177\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5\b\5\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u008a\3\2\2\2\u0085\u0087\5N(\2\u0086\u0088\5l\67"+
		"\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008b"+
		"\7\20\2\2\u008a\u0085\3\2\2\2\u008a\u0089\3\2\2\2\u008b\7\3\2\2\2\u008c"+
		"\u0091\7\26\2\2\u008d\u008e\7M\2\2\u008e\u008f\5R*\2\u008f\u0090\7N\2"+
		"\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u0092\3\2\2\2\u0092\t"+
		"\3\2\2\2\u0093\u0098\5\f\7\2\u0094\u0095\7I\2\2\u0095\u0097\5\f\7\2\u0096"+
		"\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009d\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\20\2\2\u009c"+
		"\u0093\3\2\2\2\u009c\u009b\3\2\2\2\u009d\13\3\2\2\2\u009e\u00a0\5\16\b"+
		"\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a9\5N(\2\u00a5"+
		"\u00a7\7G\2\2\u00a6\u00a8\5l\67\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\r\3\2\2\2\u00ab\u00af\t\2\2\2\u00ac\u00af\5X-\2\u00ad\u00af\5`\61\2\u00ae"+
		"\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\17\3\2\2"+
		"\2\u00b0\u00b1\5\4\3\2\u00b1\u00b2\7K\2\2\u00b2\21\3\2\2\2\u00b3\u00b4"+
		"\5\4\3\2\u00b4\u00b5\5\34\17\2\u00b5\23\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7"+
		"\u00b9\7M\2\2\u00b8\u00ba\5\26\f\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7N\2\2\u00bc\25\3\2\2\2\u00bd\u00c0"+
		"\5F$\2\u00be\u00c0\7\20\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\27\3\2\2\2\u00c1\u00c3\5\32\16\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\31\3\2\2\2\u00c6\u00c9"+
		"\5\34\17\2\u00c7\u00c9\5\36\20\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2"+
		"\2\u00c9\33\3\2\2\2\u00ca\u00cc\7O\2\2\u00cb\u00cd\5\30\r\2\u00cc\u00cb"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7P\2\2\u00cf"+
		"\35\3\2\2\2\u00d0\u00d7\5\66\34\2\u00d1\u00d7\5\64\33\2\u00d2\u00d7\5"+
		" \21\2\u00d3\u00d7\5*\26\2\u00d4\u00d7\5\62\32\2\u00d5\u00d7\5\"\22\2"+
		"\u00d6\u00d0\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\37\3\2\2\2\u00d8"+
		"\u00d9\7\13\2\2\u00d9\u00da\7M\2\2\u00da\u00db\5F$\2\u00db\u00dc\7N\2"+
		"\2\u00dc\u00df\5\32\16\2\u00dd\u00de\7\f\2\2\u00de\u00e0\5\32\16\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0!\3\2\2\2\u00e1\u00e2\7\b\2\2"+
		"\u00e2\u00e3\7M\2\2\u00e3\u00e4\5F$\2\u00e4\u00e5\7N\2\2\u00e5\u00e9\7"+
		"O\2\2\u00e6\u00e8\5$\23\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ed\7P\2\2\u00ed#\3\2\2\2\u00ee\u00f0\5&\24\2\u00ef\u00f1"+
		"\5(\25\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1%\3\2\2\2\u00f2"+
		"\u00f6\7\n\2\2\u00f3\u00f4\7\t\2\2\u00f4\u00f6\5H%\2\u00f5\u00f2\3\2\2"+
		"\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7J\2\2\u00f8\'"+
		"\3\2\2\2\u00f9\u00fc\5\66\34\2\u00fa\u00fc\5\64\33\2\u00fb\u00f9\3\2\2"+
		"\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe)\3\2\2\2\u00ff\u0103\5,\27\2\u0100\u0103\5.\30\2\u0101"+
		"\u0103\5\60\31\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3"+
		"\2\2\2\u0103+\3\2\2\2\u0104\u0105\7\6\2\2\u0105\u0107\7M\2\2\u0106\u0108"+
		"\58\35\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010b\7K\2\2\u010a\u010c\5F$\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2"+
		"\2\u010c\u010d\3\2\2\2\u010d\u010f\7K\2\2\u010e\u0110\5F$\2\u010f\u010e"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7N\2\2\u0112"+
		"\u0113\5\32\16\2\u0113-\3\2\2\2\u0114\u0115\7\7\2\2\u0115\u0116\7M\2\2"+
		"\u0116\u0117\5F$\2\u0117\u0118\7N\2\2\u0118\u0119\5\32\16\2\u0119/\3\2"+
		"\2\2\u011a\u011b\7\5\2\2\u011b\u011c\5\32\16\2\u011c\u011d\7\7\2\2\u011d"+
		"\u011e\7M\2\2\u011e\u011f\5F$\2\u011f\u0120\7N\2\2\u0120\u0121\7K\2\2"+
		"\u0121\61\3\2\2\2\u0122\u012a\7\4\2\2\u0123\u012a\7\3\2\2\u0124\u012a"+
		"\7\r\2\2\u0125\u0127\7\16\2\2\u0126\u0128\5F$\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0122\3\2\2\2\u0129\u0123\3\2"+
		"\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\7K\2\2\u012c\63\3\2\2\2\u012d\u012f\5F$\2\u012e\u012d\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7K\2\2\u0131\65\3\2\2\2"+
		"\u0132\u0133\7\22\2\2\u0133\u0134\5`\61\2\u0134\u0135\5N(\2\u0135\u0136"+
		"\7K\2\2\u0136\u015e\3\2\2\2\u0137\u0138\58\35\2\u0138\u0139\7K\2\2\u0139"+
		"\u015e\3\2\2\2\u013a\u013c\5P)\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2"+
		"\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u0140\u0141\7G\2\2\u0141\u0142\7O\2\2\u0142\u0143\5<\37\2\u0143"+
		"\u0148\7P\2\2\u0144\u0146\7G\2\2\u0145\u0147\5l\67\2\u0146\u0145\3\2\2"+
		"\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7K\2\2\u014b\u015e\3\2\2\2\u014c"+
		"\u014e\5P)\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2"+
		"\2\u014f\u0150\3\2\2\2\u0150\u015a\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0157"+
		"\7G\2\2\u0153\u0154\7I\2\2\u0154\u0156\7G\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u015a\u0152\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015e\7K\2\2\u015d\u0132\3\2\2\2\u015d\u0137\3\2"+
		"\2\2\u015d\u013d\3\2\2\2\u015d\u014f\3\2\2\2\u015e\67\3\2\2\2\u015f\u016b"+
		"\5:\36\2\u0160\u0161\7I\2\2\u0161\u0163\7G\2\2\u0162\u0164\5l\67\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0166\7@"+
		"\2\2\u0166\u0168\5F$\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0160\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c9\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\5P)\2\u016f"+
		"\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0176\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0177\5N(\2\u0175\u0177"+
		"\5D#\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u0180\3\2\2\2\u0178"+
		"\u017a\7G\2\2\u0179\u017b\5l\67\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017e\3\2\2\2\u017c\u017d\7@\2\2\u017d\u017f\5F$\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0178\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181;\3\2\2\2\u0182\u0184\5> \2\u0183\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186=\3\2\2\2"+
		"\u0187\u0189\5P)\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d"+
		"\u018f\5N(\2\u018e\u0190\5@!\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2"+
		"\u0190\u0191\3\2\2\2\u0191\u0192\7K\2\2\u0192?\3\2\2\2\u0193\u0198\5B"+
		"\"\2\u0194\u0195\7I\2\2\u0195\u0197\5B\"\2\u0196\u0194\3\2\2\2\u0197\u019a"+
		"\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199A\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019d\7G\2\2\u019c\u019e\5l\67\2\u019d\u019c\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019eC\3\2\2\2\u019f\u01a1\7\17\2\2\u01a0\u01a2"+
		"\7G\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\7O\2\2\u01a4\u01a5\5<\37\2\u01a5\u01a6\7P\2\2\u01a6E\3\2\2\2\u01a7"+
		"\u01a8\b$\1\2\u01a8\u01b2\7G\2\2\u01a9\u01b2\5\24\13\2\u01aa\u01b2\5d"+
		"\63\2\u01ab\u01ac\7M\2\2\u01ac\u01ad\5F$\2\u01ad\u01ae\7N\2\2\u01ae\u01b2"+
		"\3\2\2\2\u01af\u01b0\t\4\2\2\u01b0\u01b2\5F$\t\u01b1\u01a7\3\2\2\2\u01b1"+
		"\u01a9\3\2\2\2\u01b1\u01aa\3\2\2\2\u01b1\u01ab\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b2\u01c8\3\2\2\2\u01b3\u01b4\f\7\2\2\u01b4\u01b5\t\5\2\2\u01b5"+
		"\u01c7\5F$\b\u01b6\u01b7\f\6\2\2\u01b7\u01b8\7L\2\2\u01b8\u01b9\5F$\2"+
		"\u01b9\u01ba\7J\2\2\u01ba\u01bb\5F$\7\u01bb\u01c7\3\2\2\2\u01bc\u01bd"+
		"\f\3\2\2\u01bd\u01be\7I\2\2\u01be\u01c7\5F$\4\u01bf\u01c0\f\b\2\2\u01c0"+
		"\u01c7\t\6\2\2\u01c1\u01c2\f\5\2\2\u01c2\u01c3\7H\2\2\u01c3\u01c7\7G\2"+
		"\2\u01c4\u01c5\f\4\2\2\u01c5\u01c7\5j\66\2\u01c6\u01b3\3\2\2\2\u01c6\u01b6"+
		"\3\2\2\2\u01c6\u01bc\3\2\2\2\u01c6\u01bf\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9G\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\5d\63\2\u01cc\u01ce"+
		"\7G\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ceI\3\2\2\2\u01cf\u01d1"+
		"\5P)\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\5N"+
		"(\2\u01d6K\3\2\2\2\u01d7\u01d9\5P)\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3"+
		"\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dd\u01de\5D#\2\u01deM\3\2\2\2\u01df\u01e0\t\3\2\2\u01e0"+
		"O\3\2\2\2\u01e1\u01e9\5T+\2\u01e2\u01e9\5Z.\2\u01e3\u01e9\5`\61\2\u01e4"+
		"\u01e9\5b\62\2\u01e5\u01e9\7\25\2\2\u01e6\u01e9\7\24\2\2\u01e7\u01e9\7"+
		"\26\2\2\u01e8\u01e1\3\2\2\2\u01e8\u01e2\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e8"+
		"\u01e4\3\2\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2"+
		"\2\2\u01e9Q\3\2\2\2\u01ea\u01ef\7G\2\2\u01eb\u01ec\7I\2\2\u01ec\u01ee"+
		"\7G\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0S\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01fd\5X-\2\u01f3"+
		"\u01fd\5V,\2\u01f4\u01fd\7\32\2\2\u01f5\u01fd\7\34\2\2\u01f6\u01fd\7\35"+
		"\2\2\u01f7\u01fd\7$\2\2\u01f8\u01fd\7!\2\2\u01f9\u01fd\7#\2\2\u01fa\u01fd"+
		"\7\"\2\2\u01fb\u01fd\7*\2\2\u01fc\u01f2\3\2\2\2\u01fc\u01f3\3\2\2\2\u01fc"+
		"\u01f4\3\2\2\2\u01fc\u01f5\3\2\2\2\u01fc\u01f6\3\2\2\2\u01fc\u01f7\3\2"+
		"\2\2\u01fc\u01f8\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fb\3\2\2\2\u01fdU\3\2\2\2\u01fe\u01ff\t\7\2\2\u01ffW\3\2\2\2\u0200"+
		"\u0201\t\b\2\2\u0201Y\3\2\2\2\u0202\u0203\7\23\2\2\u0203\u0204\7M\2\2"+
		"\u0204\u0205\5\\/\2\u0205\u0206\7N\2\2\u0206[\3\2\2\2\u0207\u020c\5^\60"+
		"\2\u0208\u0209\7I\2\2\u0209\u020b\5^\60\2\u020a\u0208\3\2\2\2\u020b\u020e"+
		"\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d]\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020f\u0215\7G\2\2\u0210\u0213\7@\2\2\u0211\u0214\7G\2"+
		"\2\u0212\u0214\5d\63\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u0216"+
		"\3\2\2\2\u0215\u0210\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0219\3\2\2\2\u0217"+
		"\u0219\7*\2\2\u0218\u020f\3\2\2\2\u0218\u0217\3\2\2\2\u0219_\3\2\2\2\u021a"+
		"\u021b\t\t\2\2\u021ba\3\2\2\2\u021c\u021d\t\n\2\2\u021dc\3\2\2\2\u021e"+
		"\u021f\t\13\2\2\u021fe\3\2\2\2\u0220\u0221\7/\2\2\u0221g\3\2\2\2\u0222"+
		"\u0223\t\f\2\2\u0223i\3\2\2\2\u0224\u0225\7Q\2\2\u0225\u0226\5H%\2\u0226"+
		"\u0227\7R\2\2\u0227\u0229\3\2\2\2\u0228\u0224\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022bk\3\2\2\2\u022c\u022e"+
		"\7Q\2\2\u022d\u022f\5H%\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u0232\7R\2\2\u0231\u022c\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234m\3\2\2\2Hrt{\u0080"+
		"\u0083\u0087\u008a\u0091\u0098\u009c\u00a1\u00a7\u00a9\u00ae\u00b9\u00bf"+
		"\u00c4\u00c8\u00cc\u00d6\u00df\u00e9\u00f0\u00f5\u00fb\u00fd\u0102\u0107"+
		"\u010b\u010f\u0127\u0129\u012e\u013d\u0146\u0148\u014f\u0157\u015a\u015d"+
		"\u0163\u0167\u016b\u0171\u0176\u017a\u017e\u0180\u0185\u018a\u018f\u0198"+
		"\u019d\u01a1\u01b1\u01c6\u01c8\u01cd\u01d2\u01da\u01e8\u01ef\u01fc\u020c"+
		"\u0213\u0215\u0218\u022a\u022e\u0233";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}