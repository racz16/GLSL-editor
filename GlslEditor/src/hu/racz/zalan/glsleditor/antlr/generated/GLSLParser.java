package hu.racz.zalan.glsleditor.antlr.generated;
// Generated from GLSL.g4 by ANTLR 4.7.1

import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GLSLParser extends Parser {

    static {
        RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache
            = new PredictionContextCache();
    public static final int PD_ERROR = 1, PD_PRAGMA = 2, PDA_PRAGMA_DEBUG = 3, PDA_PRAGMA_OPTIMIZE = 4, PDA_PRAGMA_STDGL = 5,
            PDA_PRAGMA_TOGGLE = 6, PD_VERSION = 7, PDA_VERSION_PROFILE = 8, PD_LINE = 9, PD_EXTENSION = 10,
            PDA_EXTENSION_ALL_BEHAVIOUR = 11, PDA_EXTENSION_BEHAVIOUR = 12, PDA_EXTENSION_ALL = 13,
            KW_LAYOUT = 14, KW_BREAK = 15, KW_CONTINUE = 16, KW_DO = 17, KW_FOR = 18, KW_WHILE = 19,
            KW_SWITCH = 20, KW_CASE = 21, KW_DEFAULT = 22, KW_IF = 23, KW_ELSE = 24, KW_DISCARD = 25,
            KW_RETURN = 26, KW_STRUCT = 27, KW_VOID = 28, KW_PRECISION = 29, Q_PRECISE = 30,
            Q_INVARIANT = 31, Q_SUBROUTINE = 32, Q_INTERPOLATION = 33, Q_STORAGE = 34, Q_SHARED = 35,
            Q_PRECISION = 36, RESERVED_KEYWORD = 37, TYPE = 38, BI_FUNCTION = 39, BI_MACRO = 40,
            BI_INTERPOLATION_VARIABLE = 41, BOOL_LITERAL = 42, INT_LITERAL = 43, FLOAT_LITERAL = 44,
            OP_MUL = 45, OP_ADD = 46, OP_SUB = 47, OP_DIV = 48, OP_MOD = 49, OP_INC = 50, OP_DEC = 51,
            OP_SHIFT = 52, OP_RELATIONAL = 53, OP_BIT = 54, OP_BIT_UNARY = 55, OP_LOGICAL = 56,
            OP_LOGICAL_UNARY = 57, OP_MODIFY = 58, OP_ASSIGN = 59, DOT = 60, COMMA = 61, COLON = 62,
            SEMICOLON = 63, QUESTION = 64, VECTOR_FIELD = 65, LRB = 66, RRB = 67, LCB = 68, RCB = 69,
            LSB = 70, RSB = 71, MULTI_LINE_COMMENT = 72, SINGLE_LINE_COMMENT = 73, NEW_LINE = 74,
            SPACE = 75, TAB = 76, IDENTIFIER = 77;
    public static final int RULE_start = 0, RULE_macro = 1, RULE_m_version = 2, RULE_m_line = 3, RULE_m_pragma = 4,
            RULE_m_extension = 5, RULE_m_error = 6, RULE_function_signature = 7, RULE_function_argument_list = 8,
            RULE_function_argument = 9, RULE_function_prototype = 10, RULE_function_definition = 11,
            RULE_function_call = 12, RULE_function_call_argument_list = 13, RULE_statement_list = 14,
            RULE_statement = 15, RULE_compound_statement = 16, RULE_simple_statement = 17,
            RULE_selection_statement = 18, RULE_switch_statement = 19, RULE_case_label = 20,
            RULE_iteration_statement = 21, RULE_for_iteration = 22, RULE_while_iteration = 23,
            RULE_do_while_iteration = 24, RULE_jump_statement = 25, RULE_expression_statement = 26,
            RULE_declaration_statement = 27, RULE_init_declaration_list = 28, RULE_single_declaration = 29,
            RULE_struct_declaration_list = 30, RULE_struct_declaration = 31, RULE_struct_declarator_list = 32,
            RULE_struct_declarator = 33, RULE_struct_specifier = 34, RULE_expression = 35,
            RULE_return_type = 36, RULE_fully_specified_type = 37, RULE_fully_specified_struct = 38,
            RULE_type = 39, RULE_type_qualifier = 40, RULE_storage_qualifier = 41,
            RULE_type_name_list = 42, RULE_layout_qualifier = 43, RULE_layout_qualifier_id_list = 44,
            RULE_layout_qualifier_id = 45, RULE_literal = 46, RULE_array_usage = 47,
            RULE_array_declaration = 48;
    public static final String[] ruleNames = {
        "start", "macro", "m_version", "m_line", "m_pragma", "m_extension", "m_error",
        "function_signature", "function_argument_list", "function_argument", "function_prototype",
        "function_definition", "function_call", "function_call_argument_list",
        "statement_list", "statement", "compound_statement", "simple_statement",
        "selection_statement", "switch_statement", "case_label", "iteration_statement",
        "for_iteration", "while_iteration", "do_while_iteration", "jump_statement",
        "expression_statement", "declaration_statement", "init_declaration_list",
        "single_declaration", "struct_declaration_list", "struct_declaration",
        "struct_declarator_list", "struct_declarator", "struct_specifier", "expression",
        "return_type", "fully_specified_type", "fully_specified_struct", "type",
        "type_qualifier", "storage_qualifier", "type_name_list", "layout_qualifier",
        "layout_qualifier_id_list", "layout_qualifier_id", "literal", "array_usage",
        "array_declaration"
    };

    private static final String[] _LITERAL_NAMES = {
        null, "'#error'", "'#pragma'", "'debug'", "'optimize'", "'STDGL'", null,
        "'#version'", null, "'#line'", "'#extension'", null, null, "'all'", "'layout'",
        "'break'", "'continue'", "'do'", "'for'", "'while'", "'switch'", "'case'",
        "'default'", "'if'", "'else'", "'discard'", "'return'", "'struct'", "'void'",
        "'precision'", "'precise'", "'invariant'", "'subroutine'", null, null,
        "'shared'", null, null, null, null, null, null, null, null, null, "'*'",
        "'+'", "'-'", "'/'", "'%'", "'++'", "'--'", null, null, null, "'~'", null,
        "'!'", null, "'='", "'.'", "','", "':'", "';'", "'?'", null, "'('", "')'",
        "'{'", "'}'", "'['", "']'", null, null, null, "' '", "'\t'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
        null, "PD_ERROR", "PD_PRAGMA", "PDA_PRAGMA_DEBUG", "PDA_PRAGMA_OPTIMIZE",
        "PDA_PRAGMA_STDGL", "PDA_PRAGMA_TOGGLE", "PD_VERSION", "PDA_VERSION_PROFILE",
        "PD_LINE", "PD_EXTENSION", "PDA_EXTENSION_ALL_BEHAVIOUR", "PDA_EXTENSION_BEHAVIOUR",
        "PDA_EXTENSION_ALL", "KW_LAYOUT", "KW_BREAK", "KW_CONTINUE", "KW_DO",
        "KW_FOR", "KW_WHILE", "KW_SWITCH", "KW_CASE", "KW_DEFAULT", "KW_IF", "KW_ELSE",
        "KW_DISCARD", "KW_RETURN", "KW_STRUCT", "KW_VOID", "KW_PRECISION", "Q_PRECISE",
        "Q_INVARIANT", "Q_SUBROUTINE", "Q_INTERPOLATION", "Q_STORAGE", "Q_SHARED",
        "Q_PRECISION", "RESERVED_KEYWORD", "TYPE", "BI_FUNCTION", "BI_MACRO",
        "BI_INTERPOLATION_VARIABLE", "BOOL_LITERAL", "INT_LITERAL", "FLOAT_LITERAL",
        "OP_MUL", "OP_ADD", "OP_SUB", "OP_DIV", "OP_MOD", "OP_INC", "OP_DEC",
        "OP_SHIFT", "OP_RELATIONAL", "OP_BIT", "OP_BIT_UNARY", "OP_LOGICAL", "OP_LOGICAL_UNARY",
        "OP_MODIFY", "OP_ASSIGN", "DOT", "COMMA", "COLON", "SEMICOLON", "QUESTION",
        "VECTOR_FIELD", "LRB", "RRB", "LCB", "RCB", "LSB", "RSB", "MULTI_LINE_COMMENT",
        "SINGLE_LINE_COMMENT", "NEW_LINE", "SPACE", "TAB", "IDENTIFIER"
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
    public String getGrammarFileName() {
        return "GLSL.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public GLSLParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class StartContext extends ParserRuleContext {

        public List<MacroContext> macro() {
            return getRuleContexts(MacroContext.class);
        }

        public MacroContext macro(int i) {
            return getRuleContext(MacroContext.class, i);
        }

        public List<Function_prototypeContext> function_prototype() {
            return getRuleContexts(Function_prototypeContext.class);
        }

        public Function_prototypeContext function_prototype(int i) {
            return getRuleContext(Function_prototypeContext.class, i);
        }

        public List<Function_definitionContext> function_definition() {
            return getRuleContexts(Function_definitionContext.class);
        }

        public Function_definitionContext function_definition(int i) {
            return getRuleContext(Function_definitionContext.class, i);
        }

        public List<Declaration_statementContext> declaration_statement() {
            return getRuleContexts(Declaration_statementContext.class);
        }

        public Declaration_statementContext declaration_statement(int i) {
            return getRuleContext(Declaration_statementContext.class, i);
        }

        public List<TerminalNode> SEMICOLON() {
            return getTokens(GLSLParser.SEMICOLON);
        }

        public TerminalNode SEMICOLON(int i) {
            return getToken(GLSLParser.SEMICOLON, i);
        }

        public StartContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_start;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterStart(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitStart(this);
            }
        }
    }

    public final StartContext start() throws RecognitionException {
        StartContext _localctx = new StartContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_start);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(105);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PD_ERROR) | (1L << PD_PRAGMA) | (1L << PD_VERSION) | (1L << PD_LINE) | (1L << PD_EXTENSION) | (1L << KW_LAYOUT) | (1L << KW_STRUCT) | (1L << KW_VOID) | (1L << KW_PRECISION) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_INTERPOLATION) | (1L << Q_STORAGE) | (1L << Q_SHARED) | (1L << Q_PRECISION) | (1L << TYPE) | (1L << SEMICOLON))) != 0) || _la == IDENTIFIER) {
                    {
                        setState(103);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                            case 1: {
                                setState(98);
                                macro();
                            }
                            break;
                            case 2: {
                                setState(99);
                                function_prototype();
                            }
                            break;
                            case 3: {
                                setState(100);
                                function_definition();
                            }
                            break;
                            case 4: {
                                setState(101);
                                declaration_statement();
                            }
                            break;
                            case 5: {
                                setState(102);
                                match(SEMICOLON);
                            }
                            break;
                        }
                    }
                    setState(107);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MacroContext extends ParserRuleContext {

        public TerminalNode NEW_LINE() {
            return getToken(GLSLParser.NEW_LINE, 0);
        }

        public TerminalNode EOF() {
            return getToken(GLSLParser.EOF, 0);
        }

        public M_versionContext m_version() {
            return getRuleContext(M_versionContext.class, 0);
        }

        public M_lineContext m_line() {
            return getRuleContext(M_lineContext.class, 0);
        }

        public M_pragmaContext m_pragma() {
            return getRuleContext(M_pragmaContext.class, 0);
        }

        public M_extensionContext m_extension() {
            return getRuleContext(M_extensionContext.class, 0);
        }

        public M_errorContext m_error() {
            return getRuleContext(M_errorContext.class, 0);
        }

        public MacroContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_macro;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterMacro(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitMacro(this);
            }
        }
    }

    public final MacroContext macro() throws RecognitionException {
        MacroContext _localctx = new MacroContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_macro);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(113);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case PD_VERSION: {
                        setState(108);
                        m_version();
                    }
                    break;
                    case PD_LINE: {
                        setState(109);
                        m_line();
                    }
                    break;
                    case PD_PRAGMA: {
                        setState(110);
                        m_pragma();
                    }
                    break;
                    case PD_EXTENSION: {
                        setState(111);
                        m_extension();
                    }
                    break;
                    case PD_ERROR: {
                        setState(112);
                        m_error();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(115);
                _la = _input.LA(1);
                if (!(_la == EOF || _la == NEW_LINE)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class M_versionContext extends ParserRuleContext {

        public TerminalNode PD_VERSION() {
            return getToken(GLSLParser.PD_VERSION, 0);
        }

        public TerminalNode INT_LITERAL() {
            return getToken(GLSLParser.INT_LITERAL, 0);
        }

        public TerminalNode PDA_VERSION_PROFILE() {
            return getToken(GLSLParser.PDA_VERSION_PROFILE, 0);
        }

        public M_versionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_m_version;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterM_version(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitM_version(this);
            }
        }
    }

    public final M_versionContext m_version() throws RecognitionException {
        M_versionContext _localctx = new M_versionContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_m_version);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
                match(PD_VERSION);
                setState(118);
                match(INT_LITERAL);
                setState(120);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == PDA_VERSION_PROFILE) {
                    {
                        setState(119);
                        match(PDA_VERSION_PROFILE);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class M_lineContext extends ParserRuleContext {

        public TerminalNode PD_LINE() {
            return getToken(GLSLParser.PD_LINE, 0);
        }

        public List<TerminalNode> INT_LITERAL() {
            return getTokens(GLSLParser.INT_LITERAL);
        }

        public TerminalNode INT_LITERAL(int i) {
            return getToken(GLSLParser.INT_LITERAL, i);
        }

        public M_lineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_m_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterM_line(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitM_line(this);
            }
        }
    }

    public final M_lineContext m_line() throws RecognitionException {
        M_lineContext _localctx = new M_lineContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_m_line);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(122);
                match(PD_LINE);
                setState(123);
                match(INT_LITERAL);
                setState(125);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == INT_LITERAL) {
                    {
                        setState(124);
                        match(INT_LITERAL);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class M_pragmaContext extends ParserRuleContext {

        public TerminalNode PD_PRAGMA() {
            return getToken(GLSLParser.PD_PRAGMA, 0);
        }

        public TerminalNode PDA_PRAGMA_STDGL() {
            return getToken(GLSLParser.PDA_PRAGMA_STDGL, 0);
        }

        public TerminalNode LRB() {
            return getToken(GLSLParser.LRB, 0);
        }

        public TerminalNode PDA_PRAGMA_TOGGLE() {
            return getToken(GLSLParser.PDA_PRAGMA_TOGGLE, 0);
        }

        public TerminalNode RRB() {
            return getToken(GLSLParser.RRB, 0);
        }

        public TerminalNode PDA_PRAGMA_DEBUG() {
            return getToken(GLSLParser.PDA_PRAGMA_DEBUG, 0);
        }

        public TerminalNode PDA_PRAGMA_OPTIMIZE() {
            return getToken(GLSLParser.PDA_PRAGMA_OPTIMIZE, 0);
        }

        public M_pragmaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_m_pragma;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterM_pragma(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitM_pragma(this);
            }
        }
    }

    public final M_pragmaContext m_pragma() throws RecognitionException {
        M_pragmaContext _localctx = new M_pragmaContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_m_pragma);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(127);
                match(PD_PRAGMA);
                setState(133);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case PDA_PRAGMA_DEBUG:
                    case PDA_PRAGMA_OPTIMIZE: {
                        {
                            setState(128);
                            _la = _input.LA(1);
                            if (!(_la == PDA_PRAGMA_DEBUG || _la == PDA_PRAGMA_OPTIMIZE)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) {
                                    matchedEOF = true;
                                }
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(129);
                            match(LRB);
                            setState(130);
                            match(PDA_PRAGMA_TOGGLE);
                            setState(131);
                            match(RRB);
                        }
                    }
                    break;
                    case PDA_PRAGMA_STDGL: {
                        setState(132);
                        match(PDA_PRAGMA_STDGL);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class M_extensionContext extends ParserRuleContext {

        public TerminalNode PD_EXTENSION() {
            return getToken(GLSLParser.PD_EXTENSION, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(GLSLParser.IDENTIFIER, 0);
        }

        public TerminalNode COLON() {
            return getToken(GLSLParser.COLON, 0);
        }

        public TerminalNode PDA_EXTENSION_BEHAVIOUR() {
            return getToken(GLSLParser.PDA_EXTENSION_BEHAVIOUR, 0);
        }

        public TerminalNode PDA_EXTENSION_ALL() {
            return getToken(GLSLParser.PDA_EXTENSION_ALL, 0);
        }

        public TerminalNode PDA_EXTENSION_ALL_BEHAVIOUR() {
            return getToken(GLSLParser.PDA_EXTENSION_ALL_BEHAVIOUR, 0);
        }

        public M_extensionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_m_extension;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterM_extension(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitM_extension(this);
            }
        }
    }

    public final M_extensionContext m_extension() throws RecognitionException {
        M_extensionContext _localctx = new M_extensionContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_m_extension);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(135);
                match(PD_EXTENSION);
                setState(142);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case IDENTIFIER: {
                        setState(136);
                        match(IDENTIFIER);
                        setState(137);
                        match(COLON);
                        setState(138);
                        match(PDA_EXTENSION_BEHAVIOUR);
                    }
                    break;
                    case PDA_EXTENSION_ALL: {
                        setState(139);
                        match(PDA_EXTENSION_ALL);
                        setState(140);
                        match(COLON);
                        setState(141);
                        match(PDA_EXTENSION_ALL_BEHAVIOUR);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class M_errorContext extends ParserRuleContext {

        public TerminalNode PD_ERROR() {
            return getToken(GLSLParser.PD_ERROR, 0);
        }

        public M_errorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_m_error;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterM_error(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitM_error(this);
            }
        }
    }

    public final M_errorContext m_error() throws RecognitionException {
        M_errorContext _localctx = new M_errorContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_m_error);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(144);
                match(PD_ERROR);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_signatureContext extends ParserRuleContext {

        public Return_typeContext return_type() {
            return getRuleContext(Return_typeContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(GLSLParser.IDENTIFIER, 0);
        }

        public TerminalNode LRB() {
            return getToken(GLSLParser.LRB, 0);
        }

        public TerminalNode RRB() {
            return getToken(GLSLParser.RRB, 0);
        }

        public Function_argument_listContext function_argument_list() {
            return getRuleContext(Function_argument_listContext.class, 0);
        }

        public Function_signatureContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_function_signature;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterFunction_signature(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitFunction_signature(this);
            }
        }
    }

    public final Function_signatureContext function_signature() throws RecognitionException {
        Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_function_signature);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(146);
                return_type();
                setState(147);
                match(IDENTIFIER);
                setState(148);
                match(LRB);
                setState(150);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (KW_LAYOUT - 14)) | (1L << (KW_VOID - 14)) | (1L << (Q_PRECISE - 14)) | (1L << (Q_INVARIANT - 14)) | (1L << (Q_SUBROUTINE - 14)) | (1L << (Q_INTERPOLATION - 14)) | (1L << (Q_STORAGE - 14)) | (1L << (Q_SHARED - 14)) | (1L << (Q_PRECISION - 14)) | (1L << (TYPE - 14)) | (1L << (IDENTIFIER - 14)))) != 0)) {
                    {
                        setState(149);
                        function_argument_list();
                    }
                }

                setState(152);
                match(RRB);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_argument_listContext extends ParserRuleContext {

        public List<Function_argumentContext> function_argument() {
            return getRuleContexts(Function_argumentContext.class);
        }

        public Function_argumentContext function_argument(int i) {
            return getRuleContext(Function_argumentContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GLSLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GLSLParser.COMMA, i);
        }

        public TerminalNode KW_VOID() {
            return getToken(GLSLParser.KW_VOID, 0);
        }

        public Function_argument_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_function_argument_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterFunction_argument_list(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitFunction_argument_list(this);
            }
        }
    }

    public final Function_argument_listContext function_argument_list() throws RecognitionException {
        Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_function_argument_list);
        int _la;
        try {
            setState(163);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case KW_LAYOUT:
                case Q_PRECISE:
                case Q_INVARIANT:
                case Q_SUBROUTINE:
                case Q_INTERPOLATION:
                case Q_STORAGE:
                case Q_SHARED:
                case Q_PRECISION:
                case TYPE:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(154);
                        function_argument();
                        setState(159);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(155);
                                    match(COMMA);
                                    setState(156);
                                    function_argument();
                                }
                            }
                            setState(161);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                    break;
                case KW_VOID:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(162);
                        match(KW_VOID);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_argumentContext extends ParserRuleContext {

        public Fully_specified_typeContext fully_specified_type() {
            return getRuleContext(Fully_specified_typeContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(GLSLParser.IDENTIFIER, 0);
        }

        public Array_declarationContext array_declaration() {
            return getRuleContext(Array_declarationContext.class, 0);
        }

        public Function_argumentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_function_argument;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterFunction_argument(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitFunction_argument(this);
            }
        }
    }

    public final Function_argumentContext function_argument() throws RecognitionException {
        Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_function_argument);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(165);
                fully_specified_type();
                setState(170);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IDENTIFIER) {
                    {
                        setState(166);
                        match(IDENTIFIER);
                        setState(168);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LSB) {
                            {
                                setState(167);
                                array_declaration();
                            }
                        }

                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_prototypeContext extends ParserRuleContext {

        public Function_signatureContext function_signature() {
            return getRuleContext(Function_signatureContext.class, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(GLSLParser.SEMICOLON, 0);
        }

        public Function_prototypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_function_prototype;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterFunction_prototype(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitFunction_prototype(this);
            }
        }
    }

    public final Function_prototypeContext function_prototype() throws RecognitionException {
        Function_prototypeContext _localctx = new Function_prototypeContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_function_prototype);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(172);
                function_signature();
                setState(173);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_definitionContext extends ParserRuleContext {

        public Function_signatureContext function_signature() {
            return getRuleContext(Function_signatureContext.class, 0);
        }

        public Compound_statementContext compound_statement() {
            return getRuleContext(Compound_statementContext.class, 0);
        }

        public Function_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_function_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterFunction_definition(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitFunction_definition(this);
            }
        }
    }

    public final Function_definitionContext function_definition() throws RecognitionException {
        Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_function_definition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(175);
                function_signature();
                setState(176);
                compound_statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_callContext extends ParserRuleContext {

        public TerminalNode LRB() {
            return getToken(GLSLParser.LRB, 0);
        }

        public TerminalNode RRB() {
            return getToken(GLSLParser.RRB, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(GLSLParser.IDENTIFIER, 0);
        }

        public TerminalNode TYPE() {
            return getToken(GLSLParser.TYPE, 0);
        }

        public Function_call_argument_listContext function_call_argument_list() {
            return getRuleContext(Function_call_argument_listContext.class, 0);
        }

        public Function_callContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_function_call;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterFunction_call(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitFunction_call(this);
            }
        }
    }

    public final Function_callContext function_call() throws RecognitionException {
        Function_callContext _localctx = new Function_callContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_function_call);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(178);
                _la = _input.LA(1);
                if (!(_la == TYPE || _la == IDENTIFIER)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(179);
                match(LRB);
                setState(181);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (KW_VOID - 28)) | (1L << (TYPE - 28)) | (1L << (BOOL_LITERAL - 28)) | (1L << (INT_LITERAL - 28)) | (1L << (FLOAT_LITERAL - 28)) | (1L << (OP_ADD - 28)) | (1L << (OP_SUB - 28)) | (1L << (OP_INC - 28)) | (1L << (OP_DEC - 28)) | (1L << (OP_BIT_UNARY - 28)) | (1L << (OP_LOGICAL_UNARY - 28)) | (1L << (LRB - 28)) | (1L << (IDENTIFIER - 28)))) != 0)) {
                    {
                        setState(180);
                        function_call_argument_list();
                    }
                }

                setState(183);
                match(RRB);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_call_argument_listContext extends ParserRuleContext {

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode KW_VOID() {
            return getToken(GLSLParser.KW_VOID, 0);
        }

        public Function_call_argument_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_function_call_argument_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterFunction_call_argument_list(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitFunction_call_argument_list(this);
            }
        }
    }

    public final Function_call_argument_listContext function_call_argument_list() throws RecognitionException {
        Function_call_argument_listContext _localctx = new Function_call_argument_listContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_function_call_argument_list);
        try {
            setState(187);
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
                case LRB:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(185);
                        expression(0);
                    }
                    break;
                case KW_VOID:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(186);
                        match(KW_VOID);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Statement_listContext extends ParserRuleContext {

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public Statement_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_statement_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterStatement_list(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitStatement_list(this);
            }
        }
    }

    public final Statement_listContext statement_list() throws RecognitionException {
        Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_statement_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(190);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(189);
                            statement();
                        }
                    }
                    setState(192);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (KW_LAYOUT - 14)) | (1L << (KW_BREAK - 14)) | (1L << (KW_CONTINUE - 14)) | (1L << (KW_DO - 14)) | (1L << (KW_FOR - 14)) | (1L << (KW_WHILE - 14)) | (1L << (KW_SWITCH - 14)) | (1L << (KW_CASE - 14)) | (1L << (KW_DEFAULT - 14)) | (1L << (KW_IF - 14)) | (1L << (KW_DISCARD - 14)) | (1L << (KW_RETURN - 14)) | (1L << (KW_STRUCT - 14)) | (1L << (KW_PRECISION - 14)) | (1L << (Q_PRECISE - 14)) | (1L << (Q_INVARIANT - 14)) | (1L << (Q_SUBROUTINE - 14)) | (1L << (Q_INTERPOLATION - 14)) | (1L << (Q_STORAGE - 14)) | (1L << (Q_SHARED - 14)) | (1L << (Q_PRECISION - 14)) | (1L << (TYPE - 14)) | (1L << (BOOL_LITERAL - 14)) | (1L << (INT_LITERAL - 14)) | (1L << (FLOAT_LITERAL - 14)) | (1L << (OP_ADD - 14)) | (1L << (OP_SUB - 14)) | (1L << (OP_INC - 14)) | (1L << (OP_DEC - 14)) | (1L << (OP_BIT_UNARY - 14)) | (1L << (OP_LOGICAL_UNARY - 14)) | (1L << (SEMICOLON - 14)) | (1L << (LRB - 14)) | (1L << (LCB - 14)) | (1L << (IDENTIFIER - 14)))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext {

        public Compound_statementContext compound_statement() {
            return getRuleContext(Compound_statementContext.class, 0);
        }

        public Simple_statementContext simple_statement() {
            return getRuleContext(Simple_statementContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterStatement(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitStatement(this);
            }
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_statement);
        try {
            setState(196);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LCB:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(194);
                        compound_statement();
                    }
                    break;
                case KW_LAYOUT:
                case KW_BREAK:
                case KW_CONTINUE:
                case KW_DO:
                case KW_FOR:
                case KW_WHILE:
                case KW_SWITCH:
                case KW_CASE:
                case KW_DEFAULT:
                case KW_IF:
                case KW_DISCARD:
                case KW_RETURN:
                case KW_STRUCT:
                case KW_PRECISION:
                case Q_PRECISE:
                case Q_INVARIANT:
                case Q_SUBROUTINE:
                case Q_INTERPOLATION:
                case Q_STORAGE:
                case Q_SHARED:
                case Q_PRECISION:
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
                case SEMICOLON:
                case LRB:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(195);
                        simple_statement();
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Compound_statementContext extends ParserRuleContext {

        public TerminalNode LCB() {
            return getToken(GLSLParser.LCB, 0);
        }

        public TerminalNode RCB() {
            return getToken(GLSLParser.RCB, 0);
        }

        public Statement_listContext statement_list() {
            return getRuleContext(Statement_listContext.class, 0);
        }

        public Compound_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_compound_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterCompound_statement(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitCompound_statement(this);
            }
        }
    }

    public final Compound_statementContext compound_statement() throws RecognitionException {
        Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_compound_statement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(198);
                match(LCB);
                setState(200);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (KW_LAYOUT - 14)) | (1L << (KW_BREAK - 14)) | (1L << (KW_CONTINUE - 14)) | (1L << (KW_DO - 14)) | (1L << (KW_FOR - 14)) | (1L << (KW_WHILE - 14)) | (1L << (KW_SWITCH - 14)) | (1L << (KW_CASE - 14)) | (1L << (KW_DEFAULT - 14)) | (1L << (KW_IF - 14)) | (1L << (KW_DISCARD - 14)) | (1L << (KW_RETURN - 14)) | (1L << (KW_STRUCT - 14)) | (1L << (KW_PRECISION - 14)) | (1L << (Q_PRECISE - 14)) | (1L << (Q_INVARIANT - 14)) | (1L << (Q_SUBROUTINE - 14)) | (1L << (Q_INTERPOLATION - 14)) | (1L << (Q_STORAGE - 14)) | (1L << (Q_SHARED - 14)) | (1L << (Q_PRECISION - 14)) | (1L << (TYPE - 14)) | (1L << (BOOL_LITERAL - 14)) | (1L << (INT_LITERAL - 14)) | (1L << (FLOAT_LITERAL - 14)) | (1L << (OP_ADD - 14)) | (1L << (OP_SUB - 14)) | (1L << (OP_INC - 14)) | (1L << (OP_DEC - 14)) | (1L << (OP_BIT_UNARY - 14)) | (1L << (OP_LOGICAL_UNARY - 14)) | (1L << (SEMICOLON - 14)) | (1L << (LRB - 14)) | (1L << (LCB - 14)) | (1L << (IDENTIFIER - 14)))) != 0)) {
                    {
                        setState(199);
                        statement_list();
                    }
                }

                setState(202);
                match(RCB);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Simple_statementContext extends ParserRuleContext {

        public Declaration_statementContext declaration_statement() {
            return getRuleContext(Declaration_statementContext.class, 0);
        }

        public Expression_statementContext expression_statement() {
            return getRuleContext(Expression_statementContext.class, 0);
        }

        public Selection_statementContext selection_statement() {
            return getRuleContext(Selection_statementContext.class, 0);
        }

        public Iteration_statementContext iteration_statement() {
            return getRuleContext(Iteration_statementContext.class, 0);
        }

        public Jump_statementContext jump_statement() {
            return getRuleContext(Jump_statementContext.class, 0);
        }

        public Switch_statementContext switch_statement() {
            return getRuleContext(Switch_statementContext.class, 0);
        }

        public Case_labelContext case_label() {
            return getRuleContext(Case_labelContext.class, 0);
        }

        public Simple_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_simple_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterSimple_statement(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitSimple_statement(this);
            }
        }
    }

    public final Simple_statementContext simple_statement() throws RecognitionException {
        Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_simple_statement);
        try {
            setState(211);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(204);
                        declaration_statement();
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(205);
                        expression_statement();
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                     {
                        setState(206);
                        selection_statement();
                    }
                    break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                     {
                        setState(207);
                        iteration_statement();
                    }
                    break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                     {
                        setState(208);
                        jump_statement();
                    }
                    break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                     {
                        setState(209);
                        switch_statement();
                    }
                    break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                     {
                        setState(210);
                        case_label();
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Selection_statementContext extends ParserRuleContext {

        public TerminalNode KW_IF() {
            return getToken(GLSLParser.KW_IF, 0);
        }

        public TerminalNode LRB() {
            return getToken(GLSLParser.LRB, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RRB() {
            return getToken(GLSLParser.RRB, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public TerminalNode KW_ELSE() {
            return getToken(GLSLParser.KW_ELSE, 0);
        }

        public Selection_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_selection_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterSelection_statement(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitSelection_statement(this);
            }
        }
    }

    public final Selection_statementContext selection_statement() throws RecognitionException {
        Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_selection_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(213);
                match(KW_IF);
                setState(214);
                match(LRB);
                setState(215);
                expression(0);
                setState(216);
                match(RRB);
                setState(217);
                statement();
                setState(220);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                    case 1: {
                        setState(218);
                        match(KW_ELSE);
                        setState(219);
                        statement();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Switch_statementContext extends ParserRuleContext {

        public TerminalNode KW_SWITCH() {
            return getToken(GLSLParser.KW_SWITCH, 0);
        }

        public TerminalNode LRB() {
            return getToken(GLSLParser.LRB, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RRB() {
            return getToken(GLSLParser.RRB, 0);
        }

        public TerminalNode LCB() {
            return getToken(GLSLParser.LCB, 0);
        }

        public TerminalNode RCB() {
            return getToken(GLSLParser.RCB, 0);
        }

        public Statement_listContext statement_list() {
            return getRuleContext(Statement_listContext.class, 0);
        }

        public Switch_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_switch_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterSwitch_statement(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitSwitch_statement(this);
            }
        }
    }

    public final Switch_statementContext switch_statement() throws RecognitionException {
        Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_switch_statement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(222);
                match(KW_SWITCH);
                setState(223);
                match(LRB);
                setState(224);
                expression(0);
                setState(225);
                match(RRB);
                setState(226);
                match(LCB);
                setState(228);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (KW_LAYOUT - 14)) | (1L << (KW_BREAK - 14)) | (1L << (KW_CONTINUE - 14)) | (1L << (KW_DO - 14)) | (1L << (KW_FOR - 14)) | (1L << (KW_WHILE - 14)) | (1L << (KW_SWITCH - 14)) | (1L << (KW_CASE - 14)) | (1L << (KW_DEFAULT - 14)) | (1L << (KW_IF - 14)) | (1L << (KW_DISCARD - 14)) | (1L << (KW_RETURN - 14)) | (1L << (KW_STRUCT - 14)) | (1L << (KW_PRECISION - 14)) | (1L << (Q_PRECISE - 14)) | (1L << (Q_INVARIANT - 14)) | (1L << (Q_SUBROUTINE - 14)) | (1L << (Q_INTERPOLATION - 14)) | (1L << (Q_STORAGE - 14)) | (1L << (Q_SHARED - 14)) | (1L << (Q_PRECISION - 14)) | (1L << (TYPE - 14)) | (1L << (BOOL_LITERAL - 14)) | (1L << (INT_LITERAL - 14)) | (1L << (FLOAT_LITERAL - 14)) | (1L << (OP_ADD - 14)) | (1L << (OP_SUB - 14)) | (1L << (OP_INC - 14)) | (1L << (OP_DEC - 14)) | (1L << (OP_BIT_UNARY - 14)) | (1L << (OP_LOGICAL_UNARY - 14)) | (1L << (SEMICOLON - 14)) | (1L << (LRB - 14)) | (1L << (LCB - 14)) | (1L << (IDENTIFIER - 14)))) != 0)) {
                    {
                        setState(227);
                        statement_list();
                    }
                }

                setState(230);
                match(RCB);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Case_labelContext extends ParserRuleContext {

        public TerminalNode COLON() {
            return getToken(GLSLParser.COLON, 0);
        }

        public TerminalNode KW_DEFAULT() {
            return getToken(GLSLParser.KW_DEFAULT, 0);
        }

        public TerminalNode KW_CASE() {
            return getToken(GLSLParser.KW_CASE, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Case_labelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_case_label;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterCase_label(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitCase_label(this);
            }
        }
    }

    public final Case_labelContext case_label() throws RecognitionException {
        Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_case_label);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(235);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case KW_DEFAULT: {
                        setState(232);
                        match(KW_DEFAULT);
                    }
                    break;
                    case KW_CASE: {
                        setState(233);
                        match(KW_CASE);
                        setState(234);
                        expression(0);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(237);
                match(COLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Iteration_statementContext extends ParserRuleContext {

        public For_iterationContext for_iteration() {
            return getRuleContext(For_iterationContext.class, 0);
        }

        public While_iterationContext while_iteration() {
            return getRuleContext(While_iterationContext.class, 0);
        }

        public Do_while_iterationContext do_while_iteration() {
            return getRuleContext(Do_while_iterationContext.class, 0);
        }

        public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_iteration_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterIteration_statement(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitIteration_statement(this);
            }
        }
    }

    public final Iteration_statementContext iteration_statement() throws RecognitionException {
        Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_iteration_statement);
        try {
            setState(242);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case KW_FOR:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(239);
                        for_iteration();
                    }
                    break;
                case KW_WHILE:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(240);
                        while_iteration();
                    }
                    break;
                case KW_DO:
                    enterOuterAlt(_localctx, 3);
                     {
                        setState(241);
                        do_while_iteration();
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class For_iterationContext extends ParserRuleContext {

        public TerminalNode KW_FOR() {
            return getToken(GLSLParser.KW_FOR, 0);
        }

        public TerminalNode LRB() {
            return getToken(GLSLParser.LRB, 0);
        }

        public Init_declaration_listContext init_declaration_list() {
            return getRuleContext(Init_declaration_listContext.class, 0);
        }

        public List<TerminalNode> SEMICOLON() {
            return getTokens(GLSLParser.SEMICOLON);
        }

        public TerminalNode SEMICOLON(int i) {
            return getToken(GLSLParser.SEMICOLON, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode RRB() {
            return getToken(GLSLParser.RRB, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public For_iterationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_for_iteration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterFor_iteration(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitFor_iteration(this);
            }
        }
    }

    public final For_iterationContext for_iteration() throws RecognitionException {
        For_iterationContext _localctx = new For_iterationContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_for_iteration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(244);
                match(KW_FOR);
                setState(245);
                match(LRB);
                setState(246);
                init_declaration_list();
                setState(247);
                match(SEMICOLON);
                setState(248);
                expression(0);
                setState(249);
                match(SEMICOLON);
                setState(250);
                expression(0);
                setState(251);
                match(RRB);
                setState(252);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class While_iterationContext extends ParserRuleContext {

        public TerminalNode KW_WHILE() {
            return getToken(GLSLParser.KW_WHILE, 0);
        }

        public TerminalNode LRB() {
            return getToken(GLSLParser.LRB, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RRB() {
            return getToken(GLSLParser.RRB, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public While_iterationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_while_iteration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterWhile_iteration(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitWhile_iteration(this);
            }
        }
    }

    public final While_iterationContext while_iteration() throws RecognitionException {
        While_iterationContext _localctx = new While_iterationContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_while_iteration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(254);
                match(KW_WHILE);
                setState(255);
                match(LRB);
                setState(256);
                expression(0);
                setState(257);
                match(RRB);
                setState(258);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Do_while_iterationContext extends ParserRuleContext {

        public TerminalNode KW_DO() {
            return getToken(GLSLParser.KW_DO, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public TerminalNode KW_WHILE() {
            return getToken(GLSLParser.KW_WHILE, 0);
        }

        public TerminalNode LRB() {
            return getToken(GLSLParser.LRB, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RRB() {
            return getToken(GLSLParser.RRB, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(GLSLParser.SEMICOLON, 0);
        }

        public Do_while_iterationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_do_while_iteration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterDo_while_iteration(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitDo_while_iteration(this);
            }
        }
    }

    public final Do_while_iterationContext do_while_iteration() throws RecognitionException {
        Do_while_iterationContext _localctx = new Do_while_iterationContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_do_while_iteration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(260);
                match(KW_DO);
                setState(261);
                statement();
                setState(262);
                match(KW_WHILE);
                setState(263);
                match(LRB);
                setState(264);
                expression(0);
                setState(265);
                match(RRB);
                setState(266);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Jump_statementContext extends ParserRuleContext {

        public TerminalNode SEMICOLON() {
            return getToken(GLSLParser.SEMICOLON, 0);
        }

        public TerminalNode KW_CONTINUE() {
            return getToken(GLSLParser.KW_CONTINUE, 0);
        }

        public TerminalNode KW_BREAK() {
            return getToken(GLSLParser.KW_BREAK, 0);
        }

        public TerminalNode KW_DISCARD() {
            return getToken(GLSLParser.KW_DISCARD, 0);
        }

        public TerminalNode KW_RETURN() {
            return getToken(GLSLParser.KW_RETURN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Jump_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_jump_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterJump_statement(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitJump_statement(this);
            }
        }
    }

    public final Jump_statementContext jump_statement() throws RecognitionException {
        Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_jump_statement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(275);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case KW_CONTINUE: {
                        setState(268);
                        match(KW_CONTINUE);
                    }
                    break;
                    case KW_BREAK: {
                        setState(269);
                        match(KW_BREAK);
                    }
                    break;
                    case KW_DISCARD: {
                        setState(270);
                        match(KW_DISCARD);
                    }
                    break;
                    case KW_RETURN: {
                        setState(271);
                        match(KW_RETURN);
                        setState(273);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (TYPE - 38)) | (1L << (BOOL_LITERAL - 38)) | (1L << (INT_LITERAL - 38)) | (1L << (FLOAT_LITERAL - 38)) | (1L << (OP_ADD - 38)) | (1L << (OP_SUB - 38)) | (1L << (OP_INC - 38)) | (1L << (OP_DEC - 38)) | (1L << (OP_BIT_UNARY - 38)) | (1L << (OP_LOGICAL_UNARY - 38)) | (1L << (LRB - 38)) | (1L << (IDENTIFIER - 38)))) != 0)) {
                            {
                                setState(272);
                                expression(0);
                            }
                        }

                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(277);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Expression_statementContext extends ParserRuleContext {

        public TerminalNode SEMICOLON() {
            return getToken(GLSLParser.SEMICOLON, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Expression_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_expression_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterExpression_statement(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitExpression_statement(this);
            }
        }
    }

    public final Expression_statementContext expression_statement() throws RecognitionException {
        Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_expression_statement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(280);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (TYPE - 38)) | (1L << (BOOL_LITERAL - 38)) | (1L << (INT_LITERAL - 38)) | (1L << (FLOAT_LITERAL - 38)) | (1L << (OP_ADD - 38)) | (1L << (OP_SUB - 38)) | (1L << (OP_INC - 38)) | (1L << (OP_DEC - 38)) | (1L << (OP_BIT_UNARY - 38)) | (1L << (OP_LOGICAL_UNARY - 38)) | (1L << (LRB - 38)) | (1L << (IDENTIFIER - 38)))) != 0)) {
                    {
                        setState(279);
                        expression(0);
                    }
                }

                setState(282);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Declaration_statementContext extends ParserRuleContext {

        public TerminalNode KW_PRECISION() {
            return getToken(GLSLParser.KW_PRECISION, 0);
        }

        public TerminalNode Q_PRECISION() {
            return getToken(GLSLParser.Q_PRECISION, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(GLSLParser.SEMICOLON, 0);
        }

        public Init_declaration_listContext init_declaration_list() {
            return getRuleContext(Init_declaration_listContext.class, 0);
        }

        public List<TerminalNode> IDENTIFIER() {
            return getTokens(GLSLParser.IDENTIFIER);
        }

        public TerminalNode IDENTIFIER(int i) {
            return getToken(GLSLParser.IDENTIFIER, i);
        }

        public TerminalNode LCB() {
            return getToken(GLSLParser.LCB, 0);
        }

        public Struct_declaration_listContext struct_declaration_list() {
            return getRuleContext(Struct_declaration_listContext.class, 0);
        }

        public TerminalNode RCB() {
            return getToken(GLSLParser.RCB, 0);
        }

        public List<Type_qualifierContext> type_qualifier() {
            return getRuleContexts(Type_qualifierContext.class);
        }

        public Type_qualifierContext type_qualifier(int i) {
            return getRuleContext(Type_qualifierContext.class, i);
        }

        public Array_declarationContext array_declaration() {
            return getRuleContext(Array_declarationContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GLSLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GLSLParser.COMMA, i);
        }

        public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_declaration_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterDeclaration_statement(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitDeclaration_statement(this);
            }
        }
    }

    public final Declaration_statementContext declaration_statement() throws RecognitionException {
        Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_declaration_statement);
        int _la;
        try {
            setState(327);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(284);
                        match(KW_PRECISION);
                        setState(285);
                        match(Q_PRECISION);
                        setState(286);
                        type();
                        setState(287);
                        match(SEMICOLON);
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(289);
                        init_declaration_list();
                        setState(290);
                        match(SEMICOLON);
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                     {
                        setState(295);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_INTERPOLATION) | (1L << Q_STORAGE) | (1L << Q_SHARED) | (1L << Q_PRECISION))) != 0)) {
                            {
                                {
                                    setState(292);
                                    type_qualifier();
                                }
                            }
                            setState(297);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(298);
                        match(IDENTIFIER);
                        setState(299);
                        match(LCB);
                        setState(300);
                        struct_declaration_list();
                        setState(301);
                        match(RCB);
                        setState(306);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == IDENTIFIER) {
                            {
                                setState(302);
                                match(IDENTIFIER);
                                setState(304);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == LSB) {
                                    {
                                        setState(303);
                                        array_declaration();
                                    }
                                }

                            }
                        }

                        setState(308);
                        match(SEMICOLON);
                    }
                    break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                     {
                        setState(313);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_INTERPOLATION) | (1L << Q_STORAGE) | (1L << Q_SHARED) | (1L << Q_PRECISION))) != 0)) {
                            {
                                {
                                    setState(310);
                                    type_qualifier();
                                }
                            }
                            setState(315);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(324);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == IDENTIFIER) {
                            {
                                setState(316);
                                match(IDENTIFIER);
                                setState(321);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == COMMA) {
                                    {
                                        {
                                            setState(317);
                                            match(COMMA);
                                            setState(318);
                                            match(IDENTIFIER);
                                        }
                                    }
                                    setState(323);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(326);
                        match(SEMICOLON);
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Init_declaration_listContext extends ParserRuleContext {

        public Single_declarationContext single_declaration() {
            return getRuleContext(Single_declarationContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GLSLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GLSLParser.COMMA, i);
        }

        public List<TerminalNode> IDENTIFIER() {
            return getTokens(GLSLParser.IDENTIFIER);
        }

        public TerminalNode IDENTIFIER(int i) {
            return getToken(GLSLParser.IDENTIFIER, i);
        }

        public List<TerminalNode> OP_ASSIGN() {
            return getTokens(GLSLParser.OP_ASSIGN);
        }

        public TerminalNode OP_ASSIGN(int i) {
            return getToken(GLSLParser.OP_ASSIGN, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<Array_declarationContext> array_declaration() {
            return getRuleContexts(Array_declarationContext.class);
        }

        public Array_declarationContext array_declaration(int i) {
            return getRuleContext(Array_declarationContext.class, i);
        }

        public Init_declaration_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_init_declaration_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterInit_declaration_list(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitInit_declaration_list(this);
            }
        }
    }

    public final Init_declaration_listContext init_declaration_list() throws RecognitionException {
        Init_declaration_listContext _localctx = new Init_declaration_listContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_init_declaration_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(329);
                single_declaration();
                setState(339);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(330);
                            match(COMMA);
                            setState(331);
                            match(IDENTIFIER);
                            setState(333);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == LSB) {
                                {
                                    setState(332);
                                    array_declaration();
                                }
                            }

                            {
                                setState(335);
                                match(OP_ASSIGN);
                                setState(336);
                                expression(0);
                            }
                        }
                    }
                    setState(341);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Single_declarationContext extends ParserRuleContext {

        public Fully_specified_typeContext fully_specified_type() {
            return getRuleContext(Fully_specified_typeContext.class, 0);
        }

        public Fully_specified_structContext fully_specified_struct() {
            return getRuleContext(Fully_specified_structContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(GLSLParser.IDENTIFIER, 0);
        }

        public Array_declarationContext array_declaration() {
            return getRuleContext(Array_declarationContext.class, 0);
        }

        public TerminalNode OP_ASSIGN() {
            return getToken(GLSLParser.OP_ASSIGN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Single_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_single_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterSingle_declaration(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitSingle_declaration(this);
            }
        }
    }

    public final Single_declarationContext single_declaration() throws RecognitionException {
        Single_declarationContext _localctx = new Single_declarationContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_single_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(344);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
                    case 1: {
                        setState(342);
                        fully_specified_type();
                    }
                    break;
                    case 2: {
                        setState(343);
                        fully_specified_struct();
                    }
                    break;
                }
                setState(347);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IDENTIFIER) {
                    {
                        setState(346);
                        match(IDENTIFIER);
                    }
                }

                setState(350);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LSB) {
                    {
                        setState(349);
                        array_declaration();
                    }
                }

                setState(354);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OP_ASSIGN) {
                    {
                        setState(352);
                        match(OP_ASSIGN);
                        setState(353);
                        expression(0);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Struct_declaration_listContext extends ParserRuleContext {

        public List<Struct_declarationContext> struct_declaration() {
            return getRuleContexts(Struct_declarationContext.class);
        }

        public Struct_declarationContext struct_declaration(int i) {
            return getRuleContext(Struct_declarationContext.class, i);
        }

        public Struct_declaration_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_struct_declaration_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterStruct_declaration_list(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitStruct_declaration_list(this);
            }
        }
    }

    public final Struct_declaration_listContext struct_declaration_list() throws RecognitionException {
        Struct_declaration_listContext _localctx = new Struct_declaration_listContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_struct_declaration_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(357);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(356);
                            struct_declaration();
                        }
                    }
                    setState(359);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (KW_LAYOUT - 14)) | (1L << (Q_PRECISE - 14)) | (1L << (Q_INVARIANT - 14)) | (1L << (Q_SUBROUTINE - 14)) | (1L << (Q_INTERPOLATION - 14)) | (1L << (Q_STORAGE - 14)) | (1L << (Q_SHARED - 14)) | (1L << (Q_PRECISION - 14)) | (1L << (TYPE - 14)) | (1L << (IDENTIFIER - 14)))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Struct_declarationContext extends ParserRuleContext {

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(GLSLParser.SEMICOLON, 0);
        }

        public List<Type_qualifierContext> type_qualifier() {
            return getRuleContexts(Type_qualifierContext.class);
        }

        public Type_qualifierContext type_qualifier(int i) {
            return getRuleContext(Type_qualifierContext.class, i);
        }

        public Struct_declarator_listContext struct_declarator_list() {
            return getRuleContext(Struct_declarator_listContext.class, 0);
        }

        public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_struct_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterStruct_declaration(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitStruct_declaration(this);
            }
        }
    }

    public final Struct_declarationContext struct_declaration() throws RecognitionException {
        Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_struct_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(364);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_INTERPOLATION) | (1L << Q_STORAGE) | (1L << Q_SHARED) | (1L << Q_PRECISION))) != 0)) {
                    {
                        {
                            setState(361);
                            type_qualifier();
                        }
                    }
                    setState(366);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(367);
                type();
                setState(369);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IDENTIFIER) {
                    {
                        setState(368);
                        struct_declarator_list();
                    }
                }

                setState(371);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Struct_declarator_listContext extends ParserRuleContext {

        public List<Struct_declaratorContext> struct_declarator() {
            return getRuleContexts(Struct_declaratorContext.class);
        }

        public Struct_declaratorContext struct_declarator(int i) {
            return getRuleContext(Struct_declaratorContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GLSLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GLSLParser.COMMA, i);
        }

        public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_struct_declarator_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterStruct_declarator_list(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitStruct_declarator_list(this);
            }
        }
    }

    public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
        Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_struct_declarator_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(373);
                struct_declarator();
                setState(378);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(374);
                            match(COMMA);
                            setState(375);
                            struct_declarator();
                        }
                    }
                    setState(380);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Struct_declaratorContext extends ParserRuleContext {

        public TerminalNode IDENTIFIER() {
            return getToken(GLSLParser.IDENTIFIER, 0);
        }

        public Array_declarationContext array_declaration() {
            return getRuleContext(Array_declarationContext.class, 0);
        }

        public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_struct_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterStruct_declarator(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitStruct_declarator(this);
            }
        }
    }

    public final Struct_declaratorContext struct_declarator() throws RecognitionException {
        Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_struct_declarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(381);
                match(IDENTIFIER);
                setState(383);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LSB) {
                    {
                        setState(382);
                        array_declaration();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Struct_specifierContext extends ParserRuleContext {

        public TerminalNode KW_STRUCT() {
            return getToken(GLSLParser.KW_STRUCT, 0);
        }

        public TerminalNode LCB() {
            return getToken(GLSLParser.LCB, 0);
        }

        public Struct_declaration_listContext struct_declaration_list() {
            return getRuleContext(Struct_declaration_listContext.class, 0);
        }

        public TerminalNode RCB() {
            return getToken(GLSLParser.RCB, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(GLSLParser.IDENTIFIER, 0);
        }

        public Struct_specifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_struct_specifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterStruct_specifier(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitStruct_specifier(this);
            }
        }
    }

    public final Struct_specifierContext struct_specifier() throws RecognitionException {
        Struct_specifierContext _localctx = new Struct_specifierContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_struct_specifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(385);
                match(KW_STRUCT);
                setState(387);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IDENTIFIER) {
                    {
                        setState(386);
                        match(IDENTIFIER);
                    }
                }

                setState(389);
                match(LCB);
                setState(390);
                struct_declaration_list();
                setState(391);
                match(RCB);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {

        public TerminalNode IDENTIFIER() {
            return getToken(GLSLParser.IDENTIFIER, 0);
        }

        public Function_callContext function_call() {
            return getRuleContext(Function_callContext.class, 0);
        }

        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public TerminalNode LRB() {
            return getToken(GLSLParser.LRB, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode RRB() {
            return getToken(GLSLParser.RRB, 0);
        }

        public TerminalNode OP_LOGICAL_UNARY() {
            return getToken(GLSLParser.OP_LOGICAL_UNARY, 0);
        }

        public TerminalNode OP_ADD() {
            return getToken(GLSLParser.OP_ADD, 0);
        }

        public TerminalNode OP_SUB() {
            return getToken(GLSLParser.OP_SUB, 0);
        }

        public TerminalNode OP_BIT_UNARY() {
            return getToken(GLSLParser.OP_BIT_UNARY, 0);
        }

        public List<TerminalNode> OP_INC() {
            return getTokens(GLSLParser.OP_INC);
        }

        public TerminalNode OP_INC(int i) {
            return getToken(GLSLParser.OP_INC, i);
        }

        public List<TerminalNode> OP_DEC() {
            return getTokens(GLSLParser.OP_DEC);
        }

        public TerminalNode OP_DEC(int i) {
            return getToken(GLSLParser.OP_DEC, i);
        }

        public TerminalNode OP_MUL() {
            return getToken(GLSLParser.OP_MUL, 0);
        }

        public TerminalNode OP_DIV() {
            return getToken(GLSLParser.OP_DIV, 0);
        }

        public TerminalNode OP_MOD() {
            return getToken(GLSLParser.OP_MOD, 0);
        }

        public TerminalNode OP_SHIFT() {
            return getToken(GLSLParser.OP_SHIFT, 0);
        }

        public TerminalNode OP_BIT() {
            return getToken(GLSLParser.OP_BIT, 0);
        }

        public TerminalNode OP_RELATIONAL() {
            return getToken(GLSLParser.OP_RELATIONAL, 0);
        }

        public TerminalNode OP_LOGICAL() {
            return getToken(GLSLParser.OP_LOGICAL, 0);
        }

        public TerminalNode OP_MODIFY() {
            return getToken(GLSLParser.OP_MODIFY, 0);
        }

        public TerminalNode OP_ASSIGN() {
            return getToken(GLSLParser.OP_ASSIGN, 0);
        }

        public TerminalNode QUESTION() {
            return getToken(GLSLParser.QUESTION, 0);
        }

        public TerminalNode COLON() {
            return getToken(GLSLParser.COLON, 0);
        }

        public TerminalNode COMMA() {
            return getToken(GLSLParser.COMMA, 0);
        }

        public TerminalNode DOT() {
            return getToken(GLSLParser.DOT, 0);
        }

        public List<TerminalNode> VECTOR_FIELD() {
            return getTokens(GLSLParser.VECTOR_FIELD);
        }

        public TerminalNode VECTOR_FIELD(int i) {
            return getToken(GLSLParser.VECTOR_FIELD, i);
        }

        public Array_usageContext array_usage() {
            return getRuleContext(Array_usageContext.class, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterExpression(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitExpression(this);
            }
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
        int _startState = 70;
        enterRecursionRule(_localctx, 70, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(405);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
                    case 1: {
                        setState(394);
                        match(IDENTIFIER);
                    }
                    break;
                    case 2: {
                        setState(395);
                        function_call();
                    }
                    break;
                    case 3: {
                        setState(396);
                        literal();
                    }
                    break;
                    case 4: {
                        setState(397);
                        match(LRB);
                        setState(398);
                        expression(0);
                        setState(399);
                        match(RRB);
                    }
                    break;
                    case 5: {
                        setState(401);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_INC) | (1L << OP_DEC) | (1L << OP_BIT_UNARY) | (1L << OP_LOGICAL_UNARY))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(402);
                        expression(0);
                        setState(403);
                        _la = _input.LA(1);
                        if (!(_la == OP_INC || _la == OP_DEC)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(433);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) {
                            triggerExitRuleEvent();
                        }
                        _prevctx = _localctx;
                        {
                            setState(431);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
                                case 1: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(407);
                                    if (!(precpred(_ctx, 5))) {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    }
                                    setState(408);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MUL) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_DIV) | (1L << OP_MOD) | (1L << OP_SHIFT) | (1L << OP_RELATIONAL) | (1L << OP_BIT) | (1L << OP_LOGICAL) | (1L << OP_MODIFY) | (1L << OP_ASSIGN))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) {
                                            matchedEOF = true;
                                        }
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(409);
                                    expression(6);
                                }
                                break;
                                case 2: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(410);
                                    if (!(precpred(_ctx, 4))) {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    }
                                    setState(411);
                                    match(QUESTION);
                                    setState(412);
                                    expression(0);
                                    setState(413);
                                    match(COLON);
                                    setState(414);
                                    expression(5);
                                }
                                break;
                                case 3: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(416);
                                    if (!(precpred(_ctx, 1))) {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    }
                                    setState(417);
                                    match(COMMA);
                                    setState(418);
                                    expression(2);
                                }
                                break;
                                case 4: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(419);
                                    if (!(precpred(_ctx, 3))) {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    }
                                    setState(420);
                                    match(DOT);
                                    setState(427);
                                    _errHandler.sync(this);
                                    switch (_input.LA(1)) {
                                        case IDENTIFIER: {
                                            setState(421);
                                            match(IDENTIFIER);
                                        }
                                        break;
                                        case VECTOR_FIELD: {
                                            setState(423);
                                            _errHandler.sync(this);
                                            _alt = 1;
                                            do {
                                                switch (_alt) {
                                                    case 1: {
                                                        {
                                                            setState(422);
                                                            match(VECTOR_FIELD);
                                                        }
                                                    }
                                                    break;
                                                    default:
                                                        throw new NoViableAltException(this);
                                                }
                                                setState(425);
                                                _errHandler.sync(this);
                                                _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
                                            } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                                        }
                                        break;
                                        default:
                                            throw new NoViableAltException(this);
                                    }
                                }
                                break;
                                case 5: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(429);
                                    if (!(precpred(_ctx, 2))) {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    }
                                    setState(430);
                                    array_usage();
                                }
                                break;
                            }
                        }
                    }
                    setState(435);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class Return_typeContext extends ParserRuleContext {

        public Fully_specified_typeContext fully_specified_type() {
            return getRuleContext(Fully_specified_typeContext.class, 0);
        }

        public Array_declarationContext array_declaration() {
            return getRuleContext(Array_declarationContext.class, 0);
        }

        public TerminalNode KW_VOID() {
            return getToken(GLSLParser.KW_VOID, 0);
        }

        public Return_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_return_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterReturn_type(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitReturn_type(this);
            }
        }
    }

    public final Return_typeContext return_type() throws RecognitionException {
        Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_return_type);
        int _la;
        try {
            setState(441);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case KW_LAYOUT:
                case Q_PRECISE:
                case Q_INVARIANT:
                case Q_SUBROUTINE:
                case Q_INTERPOLATION:
                case Q_STORAGE:
                case Q_SHARED:
                case Q_PRECISION:
                case TYPE:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(436);
                        fully_specified_type();
                        setState(438);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LSB) {
                            {
                                setState(437);
                                array_declaration();
                            }
                        }

                    }
                    break;
                case KW_VOID:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(440);
                        match(KW_VOID);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Fully_specified_typeContext extends ParserRuleContext {

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public List<Type_qualifierContext> type_qualifier() {
            return getRuleContexts(Type_qualifierContext.class);
        }

        public Type_qualifierContext type_qualifier(int i) {
            return getRuleContext(Type_qualifierContext.class, i);
        }

        public Fully_specified_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_fully_specified_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterFully_specified_type(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitFully_specified_type(this);
            }
        }
    }

    public final Fully_specified_typeContext fully_specified_type() throws RecognitionException {
        Fully_specified_typeContext _localctx = new Fully_specified_typeContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_fully_specified_type);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(446);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_INTERPOLATION) | (1L << Q_STORAGE) | (1L << Q_SHARED) | (1L << Q_PRECISION))) != 0)) {
                    {
                        {
                            setState(443);
                            type_qualifier();
                        }
                    }
                    setState(448);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(449);
                type();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Fully_specified_structContext extends ParserRuleContext {

        public Struct_specifierContext struct_specifier() {
            return getRuleContext(Struct_specifierContext.class, 0);
        }

        public List<Type_qualifierContext> type_qualifier() {
            return getRuleContexts(Type_qualifierContext.class);
        }

        public Type_qualifierContext type_qualifier(int i) {
            return getRuleContext(Type_qualifierContext.class, i);
        }

        public Fully_specified_structContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_fully_specified_struct;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterFully_specified_struct(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitFully_specified_struct(this);
            }
        }
    }

    public final Fully_specified_structContext fully_specified_struct() throws RecognitionException {
        Fully_specified_structContext _localctx = new Fully_specified_structContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_fully_specified_struct);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(454);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_LAYOUT) | (1L << Q_PRECISE) | (1L << Q_INVARIANT) | (1L << Q_SUBROUTINE) | (1L << Q_INTERPOLATION) | (1L << Q_STORAGE) | (1L << Q_SHARED) | (1L << Q_PRECISION))) != 0)) {
                    {
                        {
                            setState(451);
                            type_qualifier();
                        }
                    }
                    setState(456);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(457);
                struct_specifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeContext extends ParserRuleContext {

        public TerminalNode IDENTIFIER() {
            return getToken(GLSLParser.IDENTIFIER, 0);
        }

        public TerminalNode TYPE() {
            return getToken(GLSLParser.TYPE, 0);
        }

        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterType(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitType(this);
            }
        }
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_type);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(459);
                _la = _input.LA(1);
                if (!(_la == TYPE || _la == IDENTIFIER)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_qualifierContext extends ParserRuleContext {

        public Storage_qualifierContext storage_qualifier() {
            return getRuleContext(Storage_qualifierContext.class, 0);
        }

        public Layout_qualifierContext layout_qualifier() {
            return getRuleContext(Layout_qualifierContext.class, 0);
        }

        public TerminalNode Q_PRECISION() {
            return getToken(GLSLParser.Q_PRECISION, 0);
        }

        public TerminalNode Q_INTERPOLATION() {
            return getToken(GLSLParser.Q_INTERPOLATION, 0);
        }

        public TerminalNode Q_INVARIANT() {
            return getToken(GLSLParser.Q_INVARIANT, 0);
        }

        public TerminalNode Q_PRECISE() {
            return getToken(GLSLParser.Q_PRECISE, 0);
        }

        public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_type_qualifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterType_qualifier(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitType_qualifier(this);
            }
        }
    }

    public final Type_qualifierContext type_qualifier() throws RecognitionException {
        Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_type_qualifier);
        try {
            setState(467);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Q_SUBROUTINE:
                case Q_STORAGE:
                case Q_SHARED:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(461);
                        storage_qualifier();
                    }
                    break;
                case KW_LAYOUT:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(462);
                        layout_qualifier();
                    }
                    break;
                case Q_PRECISION:
                    enterOuterAlt(_localctx, 3);
                     {
                        setState(463);
                        match(Q_PRECISION);
                    }
                    break;
                case Q_INTERPOLATION:
                    enterOuterAlt(_localctx, 4);
                     {
                        setState(464);
                        match(Q_INTERPOLATION);
                    }
                    break;
                case Q_INVARIANT:
                    enterOuterAlt(_localctx, 5);
                     {
                        setState(465);
                        match(Q_INVARIANT);
                    }
                    break;
                case Q_PRECISE:
                    enterOuterAlt(_localctx, 6);
                     {
                        setState(466);
                        match(Q_PRECISE);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Storage_qualifierContext extends ParserRuleContext {

        public TerminalNode Q_SHARED() {
            return getToken(GLSLParser.Q_SHARED, 0);
        }

        public TerminalNode Q_STORAGE() {
            return getToken(GLSLParser.Q_STORAGE, 0);
        }

        public TerminalNode Q_SUBROUTINE() {
            return getToken(GLSLParser.Q_SUBROUTINE, 0);
        }

        public TerminalNode LRB() {
            return getToken(GLSLParser.LRB, 0);
        }

        public Type_name_listContext type_name_list() {
            return getRuleContext(Type_name_listContext.class, 0);
        }

        public TerminalNode RRB() {
            return getToken(GLSLParser.RRB, 0);
        }

        public Storage_qualifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_storage_qualifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterStorage_qualifier(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitStorage_qualifier(this);
            }
        }
    }

    public final Storage_qualifierContext storage_qualifier() throws RecognitionException {
        Storage_qualifierContext _localctx = new Storage_qualifierContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_storage_qualifier);
        int _la;
        try {
            setState(478);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Q_SHARED:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(469);
                        match(Q_SHARED);
                    }
                    break;
                case Q_STORAGE:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(470);
                        match(Q_STORAGE);
                    }
                    break;
                case Q_SUBROUTINE:
                    enterOuterAlt(_localctx, 3);
                     {
                        setState(471);
                        match(Q_SUBROUTINE);
                        setState(476);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LRB) {
                            {
                                setState(472);
                                match(LRB);
                                setState(473);
                                type_name_list();
                                setState(474);
                                match(RRB);
                            }
                        }

                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_name_listContext extends ParserRuleContext {

        public List<TerminalNode> IDENTIFIER() {
            return getTokens(GLSLParser.IDENTIFIER);
        }

        public TerminalNode IDENTIFIER(int i) {
            return getToken(GLSLParser.IDENTIFIER, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GLSLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GLSLParser.COMMA, i);
        }

        public Type_name_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_type_name_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterType_name_list(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitType_name_list(this);
            }
        }
    }

    public final Type_name_listContext type_name_list() throws RecognitionException {
        Type_name_listContext _localctx = new Type_name_listContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_type_name_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(480);
                match(IDENTIFIER);
                setState(485);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(481);
                            match(COMMA);
                            setState(482);
                            match(IDENTIFIER);
                        }
                    }
                    setState(487);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Layout_qualifierContext extends ParserRuleContext {

        public TerminalNode KW_LAYOUT() {
            return getToken(GLSLParser.KW_LAYOUT, 0);
        }

        public TerminalNode LRB() {
            return getToken(GLSLParser.LRB, 0);
        }

        public Layout_qualifier_id_listContext layout_qualifier_id_list() {
            return getRuleContext(Layout_qualifier_id_listContext.class, 0);
        }

        public TerminalNode RRB() {
            return getToken(GLSLParser.RRB, 0);
        }

        public Layout_qualifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_layout_qualifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterLayout_qualifier(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitLayout_qualifier(this);
            }
        }
    }

    public final Layout_qualifierContext layout_qualifier() throws RecognitionException {
        Layout_qualifierContext _localctx = new Layout_qualifierContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_layout_qualifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(488);
                match(KW_LAYOUT);
                setState(489);
                match(LRB);
                setState(490);
                layout_qualifier_id_list();
                setState(491);
                match(RRB);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Layout_qualifier_id_listContext extends ParserRuleContext {

        public List<Layout_qualifier_idContext> layout_qualifier_id() {
            return getRuleContexts(Layout_qualifier_idContext.class);
        }

        public Layout_qualifier_idContext layout_qualifier_id(int i) {
            return getRuleContext(Layout_qualifier_idContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GLSLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GLSLParser.COMMA, i);
        }

        public Layout_qualifier_id_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_layout_qualifier_id_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterLayout_qualifier_id_list(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitLayout_qualifier_id_list(this);
            }
        }
    }

    public final Layout_qualifier_id_listContext layout_qualifier_id_list() throws RecognitionException {
        Layout_qualifier_id_listContext _localctx = new Layout_qualifier_id_listContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_layout_qualifier_id_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(493);
                layout_qualifier_id();
                setState(498);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(494);
                            match(COMMA);
                            setState(495);
                            layout_qualifier_id();
                        }
                    }
                    setState(500);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Layout_qualifier_idContext extends ParserRuleContext {

        public TerminalNode IDENTIFIER() {
            return getToken(GLSLParser.IDENTIFIER, 0);
        }

        public TerminalNode OP_ASSIGN() {
            return getToken(GLSLParser.OP_ASSIGN, 0);
        }

        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public TerminalNode Q_SHARED() {
            return getToken(GLSLParser.Q_SHARED, 0);
        }

        public Layout_qualifier_idContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_layout_qualifier_id;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterLayout_qualifier_id(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitLayout_qualifier_id(this);
            }
        }
    }

    public final Layout_qualifier_idContext layout_qualifier_id() throws RecognitionException {
        Layout_qualifier_idContext _localctx = new Layout_qualifier_idContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_layout_qualifier_id);
        int _la;
        try {
            setState(507);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(501);
                        match(IDENTIFIER);
                        setState(504);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OP_ASSIGN) {
                            {
                                setState(502);
                                match(OP_ASSIGN);
                                setState(503);
                                literal();
                            }
                        }

                    }
                    break;
                case Q_SHARED:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(506);
                        match(Q_SHARED);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LiteralContext extends ParserRuleContext {

        public TerminalNode BOOL_LITERAL() {
            return getToken(GLSLParser.BOOL_LITERAL, 0);
        }

        public TerminalNode INT_LITERAL() {
            return getToken(GLSLParser.INT_LITERAL, 0);
        }

        public TerminalNode FLOAT_LITERAL() {
            return getToken(GLSLParser.FLOAT_LITERAL, 0);
        }

        public LiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterLiteral(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitLiteral(this);
            }
        }
    }

    public final LiteralContext literal() throws RecognitionException {
        LiteralContext _localctx = new LiteralContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_literal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(509);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Array_usageContext extends ParserRuleContext {

        public List<TerminalNode> LSB() {
            return getTokens(GLSLParser.LSB);
        }

        public TerminalNode LSB(int i) {
            return getToken(GLSLParser.LSB, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> RSB() {
            return getTokens(GLSLParser.RSB);
        }

        public TerminalNode RSB(int i) {
            return getToken(GLSLParser.RSB, i);
        }

        public Array_usageContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_array_usage;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterArray_usage(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitArray_usage(this);
            }
        }
    }

    public final Array_usageContext array_usage() throws RecognitionException {
        Array_usageContext _localctx = new Array_usageContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_array_usage);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(515);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(511);
                                match(LSB);
                                setState(512);
                                expression(0);
                                setState(513);
                                match(RSB);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(517);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 60, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Array_declarationContext extends ParserRuleContext {

        public List<TerminalNode> LSB() {
            return getTokens(GLSLParser.LSB);
        }

        public TerminalNode LSB(int i) {
            return getToken(GLSLParser.LSB, i);
        }

        public List<TerminalNode> RSB() {
            return getTokens(GLSLParser.RSB);
        }

        public TerminalNode RSB(int i) {
            return getToken(GLSLParser.RSB, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public Array_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override public int getRuleIndex() {
            return RULE_array_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).enterArray_declaration(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GLSLListener) {
                ((GLSLListener) listener).exitArray_declaration(this);
            }
        }
    }

    public final Array_declarationContext array_declaration() throws RecognitionException {
        Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_array_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(524);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(519);
                            match(LSB);
                            setState(521);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (TYPE - 38)) | (1L << (BOOL_LITERAL - 38)) | (1L << (INT_LITERAL - 38)) | (1L << (FLOAT_LITERAL - 38)) | (1L << (OP_ADD - 38)) | (1L << (OP_SUB - 38)) | (1L << (OP_INC - 38)) | (1L << (OP_DEC - 38)) | (1L << (OP_BIT_UNARY - 38)) | (1L << (OP_LOGICAL_UNARY - 38)) | (1L << (LRB - 38)) | (1L << (IDENTIFIER - 38)))) != 0)) {
                                {
                                    setState(520);
                                    expression(0);
                                }
                            }

                            setState(523);
                            match(RSB);
                        }
                    }
                    setState(526);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == LSB);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 35:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
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
                return precpred(_ctx, 3);
            case 4:
                return precpred(_ctx, 2);
        }
        return true;
    }

    public static final String _serializedATN
            = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0213\4\2\t\2\4"
            + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
            + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
            + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
            + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
            + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
            + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"
            + "\2\7\2j\n\2\f\2\16\2m\13\2\3\3\3\3\3\3\3\3\3\3\5\3t\n\3\3\3\3\3\3\4\3"
            + "\4\3\4\5\4{\n\4\3\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6"
            + "\u0088\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0091\n\7\3\b\3\b\3\t\3\t\3"
            + "\t\3\t\5\t\u0099\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u00a0\n\n\f\n\16\n\u00a3"
            + "\13\n\3\n\5\n\u00a6\n\n\3\13\3\13\3\13\5\13\u00ab\n\13\5\13\u00ad\n\13"
            + "\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00b8\n\16\3\16\3\16\3\17"
            + "\3\17\5\17\u00be\n\17\3\20\6\20\u00c1\n\20\r\20\16\20\u00c2\3\21\3\21"
            + "\5\21\u00c7\n\21\3\22\3\22\5\22\u00cb\n\22\3\22\3\22\3\23\3\23\3\23\3"
            + "\23\3\23\3\23\3\23\5\23\u00d6\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"
            + "\5\24\u00df\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e7\n\25\3\25\3"
            + "\25\3\26\3\26\3\26\5\26\u00ee\n\26\3\26\3\26\3\27\3\27\3\27\5\27\u00f5"
            + "\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"
            + "\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"
            + "\3\33\3\33\5\33\u0114\n\33\5\33\u0116\n\33\3\33\3\33\3\34\5\34\u011b\n"
            + "\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0128"
            + "\n\35\f\35\16\35\u012b\13\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0133"
            + "\n\35\5\35\u0135\n\35\3\35\3\35\3\35\7\35\u013a\n\35\f\35\16\35\u013d"
            + "\13\35\3\35\3\35\3\35\7\35\u0142\n\35\f\35\16\35\u0145\13\35\5\35\u0147"
            + "\n\35\3\35\5\35\u014a\n\35\3\36\3\36\3\36\3\36\5\36\u0150\n\36\3\36\3"
            + "\36\7\36\u0154\n\36\f\36\16\36\u0157\13\36\3\37\3\37\5\37\u015b\n\37\3"
            + "\37\5\37\u015e\n\37\3\37\5\37\u0161\n\37\3\37\3\37\5\37\u0165\n\37\3 "
            + "\6 \u0168\n \r \16 \u0169\3!\7!\u016d\n!\f!\16!\u0170\13!\3!\3!\5!\u0174"
            + "\n!\3!\3!\3\"\3\"\3\"\7\"\u017b\n\"\f\"\16\"\u017e\13\"\3#\3#\5#\u0182"
            + "\n#\3$\3$\5$\u0186\n$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"
            + "\5%\u0198\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u01aa"
            + "\n%\r%\16%\u01ab\5%\u01ae\n%\3%\3%\7%\u01b2\n%\f%\16%\u01b5\13%\3&\3&"
            + "\5&\u01b9\n&\3&\5&\u01bc\n&\3\'\7\'\u01bf\n\'\f\'\16\'\u01c2\13\'\3\'"
            + "\3\'\3(\7(\u01c7\n(\f(\16(\u01ca\13(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\5*"
            + "\u01d6\n*\3+\3+\3+\3+\3+\3+\3+\5+\u01df\n+\5+\u01e1\n+\3,\3,\3,\7,\u01e6"
            + "\n,\f,\16,\u01e9\13,\3-\3-\3-\3-\3-\3.\3.\3.\7.\u01f3\n.\f.\16.\u01f6"
            + "\13.\3/\3/\3/\5/\u01fb\n/\3/\5/\u01fe\n/\3\60\3\60\3\61\3\61\3\61\3\61"
            + "\6\61\u0206\n\61\r\61\16\61\u0207\3\62\3\62\5\62\u020c\n\62\3\62\6\62"
            + "\u020f\n\62\r\62\16\62\u0210\3\62\2\3H\63\2\4\6\b\n\f\16\20\22\24\26\30"
            + "\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\t\3\3LL\3\2\5"
            + "\6\4\2((OO\6\2\60\61\64\6599;;\3\2\64\65\6\2/\63\668::<=\3\2,.\2\u023b"
            + "\2k\3\2\2\2\4s\3\2\2\2\6w\3\2\2\2\b|\3\2\2\2\n\u0081\3\2\2\2\f\u0089\3"
            + "\2\2\2\16\u0092\3\2\2\2\20\u0094\3\2\2\2\22\u00a5\3\2\2\2\24\u00a7\3\2"
            + "\2\2\26\u00ae\3\2\2\2\30\u00b1\3\2\2\2\32\u00b4\3\2\2\2\34\u00bd\3\2\2"
            + "\2\36\u00c0\3\2\2\2 \u00c6\3\2\2\2\"\u00c8\3\2\2\2$\u00d5\3\2\2\2&\u00d7"
            + "\3\2\2\2(\u00e0\3\2\2\2*\u00ed\3\2\2\2,\u00f4\3\2\2\2.\u00f6\3\2\2\2\60"
            + "\u0100\3\2\2\2\62\u0106\3\2\2\2\64\u0115\3\2\2\2\66\u011a\3\2\2\28\u0149"
            + "\3\2\2\2:\u014b\3\2\2\2<\u015a\3\2\2\2>\u0167\3\2\2\2@\u016e\3\2\2\2B"
            + "\u0177\3\2\2\2D\u017f\3\2\2\2F\u0183\3\2\2\2H\u0197\3\2\2\2J\u01bb\3\2"
            + "\2\2L\u01c0\3\2\2\2N\u01c8\3\2\2\2P\u01cd\3\2\2\2R\u01d5\3\2\2\2T\u01e0"
            + "\3\2\2\2V\u01e2\3\2\2\2X\u01ea\3\2\2\2Z\u01ef\3\2\2\2\\\u01fd\3\2\2\2"
            + "^\u01ff\3\2\2\2`\u0205\3\2\2\2b\u020e\3\2\2\2dj\5\4\3\2ej\5\26\f\2fj\5"
            + "\30\r\2gj\58\35\2hj\7A\2\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3"
            + "\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\3\3\2\2\2mk\3\2\2\2nt\5\6\4\2ot"
            + "\5\b\5\2pt\5\n\6\2qt\5\f\7\2rt\5\16\b\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2"
            + "sq\3\2\2\2sr\3\2\2\2tu\3\2\2\2uv\t\2\2\2v\5\3\2\2\2wx\7\t\2\2xz\7-\2\2"
            + "y{\7\n\2\2zy\3\2\2\2z{\3\2\2\2{\7\3\2\2\2|}\7\13\2\2}\177\7-\2\2~\u0080"
            + "\7-\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\t\3\2\2\2\u0081\u0087\7\4"
            + "\2\2\u0082\u0083\t\3\2\2\u0083\u0084\7D\2\2\u0084\u0085\7\b\2\2\u0085"
            + "\u0088\7E\2\2\u0086\u0088\7\7\2\2\u0087\u0082\3\2\2\2\u0087\u0086\3\2"
            + "\2\2\u0088\13\3\2\2\2\u0089\u0090\7\f\2\2\u008a\u008b\7O\2\2\u008b\u008c"
            + "\7@\2\2\u008c\u0091\7\16\2\2\u008d\u008e\7\17\2\2\u008e\u008f\7@\2\2\u008f"
            + "\u0091\7\r\2\2\u0090\u008a\3\2\2\2\u0090\u008d\3\2\2\2\u0091\r\3\2\2\2"
            + "\u0092\u0093\7\3\2\2\u0093\17\3\2\2\2\u0094\u0095\5J&\2\u0095\u0096\7"
            + "O\2\2\u0096\u0098\7D\2\2\u0097\u0099\5\22\n\2\u0098\u0097\3\2\2\2\u0098"
            + "\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7E\2\2\u009b\21\3\2\2\2"
            + "\u009c\u00a1\5\24\13\2\u009d\u009e\7?\2\2\u009e\u00a0\5\24\13\2\u009f"
            + "\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"
            + "\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\7\36\2\2\u00a5"
            + "\u009c\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\23\3\2\2\2\u00a7\u00ac\5L\'\2"
            + "\u00a8\u00aa\7O\2\2\u00a9\u00ab\5b\62\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab"
            + "\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"
            + "\25\3\2\2\2\u00ae\u00af\5\20\t\2\u00af\u00b0\7A\2\2\u00b0\27\3\2\2\2\u00b1"
            + "\u00b2\5\20\t\2\u00b2\u00b3\5\"\22\2\u00b3\31\3\2\2\2\u00b4\u00b5\t\4"
            + "\2\2\u00b5\u00b7\7D\2\2\u00b6\u00b8\5\34\17\2\u00b7\u00b6\3\2\2\2\u00b7"
            + "\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7E\2\2\u00ba\33\3\2\2\2"
            + "\u00bb\u00be\5H%\2\u00bc\u00be\7\36\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc"
            + "\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00c1\5 \21\2\u00c0\u00bf\3\2\2\2\u00c1"
            + "\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\37\3\2\2"
            + "\2\u00c4\u00c7\5\"\22\2\u00c5\u00c7\5$\23\2\u00c6\u00c4\3\2\2\2\u00c6"
            + "\u00c5\3\2\2\2\u00c7!\3\2\2\2\u00c8\u00ca\7F\2\2\u00c9\u00cb\5\36\20\2"
            + "\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd"
            + "\7G\2\2\u00cd#\3\2\2\2\u00ce\u00d6\58\35\2\u00cf\u00d6\5\66\34\2\u00d0"
            + "\u00d6\5&\24\2\u00d1\u00d6\5,\27\2\u00d2\u00d6\5\64\33\2\u00d3\u00d6\5"
            + "(\25\2\u00d4\u00d6\5*\26\2\u00d5\u00ce\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5"
            + "\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2"
            + "\2\2\u00d5\u00d4\3\2\2\2\u00d6%\3\2\2\2\u00d7\u00d8\7\31\2\2\u00d8\u00d9"
            + "\7D\2\2\u00d9\u00da\5H%\2\u00da\u00db\7E\2\2\u00db\u00de\5 \21\2\u00dc"
            + "\u00dd\7\32\2\2\u00dd\u00df\5 \21\2\u00de\u00dc\3\2\2\2\u00de\u00df\3"
            + "\2\2\2\u00df\'\3\2\2\2\u00e0\u00e1\7\26\2\2\u00e1\u00e2\7D\2\2\u00e2\u00e3"
            + "\5H%\2\u00e3\u00e4\7E\2\2\u00e4\u00e6\7F\2\2\u00e5\u00e7\5\36\20\2\u00e6"
            + "\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7G"
            + "\2\2\u00e9)\3\2\2\2\u00ea\u00ee\7\30\2\2\u00eb\u00ec\7\27\2\2\u00ec\u00ee"
            + "\5H%\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"
            + "\u00f0\7@\2\2\u00f0+\3\2\2\2\u00f1\u00f5\5.\30\2\u00f2\u00f5\5\60\31\2"
            + "\u00f3\u00f5\5\62\32\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3"
            + "\3\2\2\2\u00f5-\3\2\2\2\u00f6\u00f7\7\24\2\2\u00f7\u00f8\7D\2\2\u00f8"
            + "\u00f9\5:\36\2\u00f9\u00fa\7A\2\2\u00fa\u00fb\5H%\2\u00fb\u00fc\7A\2\2"
            + "\u00fc\u00fd\5H%\2\u00fd\u00fe\7E\2\2\u00fe\u00ff\5 \21\2\u00ff/\3\2\2"
            + "\2\u0100\u0101\7\25\2\2\u0101\u0102\7D\2\2\u0102\u0103\5H%\2\u0103\u0104"
            + "\7E\2\2\u0104\u0105\5 \21\2\u0105\61\3\2\2\2\u0106\u0107\7\23\2\2\u0107"
            + "\u0108\5 \21\2\u0108\u0109\7\25\2\2\u0109\u010a\7D\2\2\u010a\u010b\5H"
            + "%\2\u010b\u010c\7E\2\2\u010c\u010d\7A\2\2\u010d\63\3\2\2\2\u010e\u0116"
            + "\7\22\2\2\u010f\u0116\7\21\2\2\u0110\u0116\7\33\2\2\u0111\u0113\7\34\2"
            + "\2\u0112\u0114\5H%\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116"
            + "\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0110\3\2\2\2\u0115"
            + "\u0111\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7A\2\2\u0118\65\3\2\2\2"
            + "\u0119\u011b\5H%\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c"
            + "\3\2\2\2\u011c\u011d\7A\2\2\u011d\67\3\2\2\2\u011e\u011f\7\37\2\2\u011f"
            + "\u0120\7&\2\2\u0120\u0121\5P)\2\u0121\u0122\7A\2\2\u0122\u014a\3\2\2\2"
            + "\u0123\u0124\5:\36\2\u0124\u0125\7A\2\2\u0125\u014a\3\2\2\2\u0126\u0128"
            + "\5R*\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"
            + "\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7O"
            + "\2\2\u012d\u012e\7F\2\2\u012e\u012f\5> \2\u012f\u0134\7G\2\2\u0130\u0132"
            + "\7O\2\2\u0131\u0133\5b\62\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"
            + "\u0135\3\2\2\2\u0134\u0130\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2"
            + "\2\2\u0136\u0137\7A\2\2\u0137\u014a\3\2\2\2\u0138\u013a\5R*\2\u0139\u0138"
            + "\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"
            + "\u0146\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0143\7O\2\2\u013f\u0140\7?\2"
            + "\2\u0140\u0142\7O\2\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"
            + "\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146"
            + "\u013e\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\7A"
            + "\2\2\u0149\u011e\3\2\2\2\u0149\u0123\3\2\2\2\u0149\u0129\3\2\2\2\u0149"
            + "\u013b\3\2\2\2\u014a9\3\2\2\2\u014b\u0155\5<\37\2\u014c\u014d\7?\2\2\u014d"
            + "\u014f\7O\2\2\u014e\u0150\5b\62\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2"
            + "\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7=\2\2\u0152\u0154\5H%\2\u0153\u014c"
            + "\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"
            + ";\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015b\5L\'\2\u0159\u015b\5N(\2\u015a"
            + "\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015e\7O"
            + "\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f"
            + "\u0161\5b\62\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2"
            + "\2\2\u0162\u0163\7=\2\2\u0163\u0165\5H%\2\u0164\u0162\3\2\2\2\u0164\u0165"
            + "\3\2\2\2\u0165=\3\2\2\2\u0166\u0168\5@!\2\u0167\u0166\3\2\2\2\u0168\u0169"
            + "\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a?\3\2\2\2\u016b"
            + "\u016d\5R*\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2"
            + "\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173"
            + "\5P)\2\u0172\u0174\5B\"\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"
            + "\u0175\3\2\2\2\u0175\u0176\7A\2\2\u0176A\3\2\2\2\u0177\u017c\5D#\2\u0178"
            + "\u0179\7?\2\2\u0179\u017b\5D#\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2"
            + "\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017dC\3\2\2\2\u017e\u017c"
            + "\3\2\2\2\u017f\u0181\7O\2\2\u0180\u0182\5b\62\2\u0181\u0180\3\2\2\2\u0181"
            + "\u0182\3\2\2\2\u0182E\3\2\2\2\u0183\u0185\7\35\2\2\u0184\u0186\7O\2\2"
            + "\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188"
            + "\7F\2\2\u0188\u0189\5> \2\u0189\u018a\7G\2\2\u018aG\3\2\2\2\u018b\u018c"
            + "\b%\1\2\u018c\u0198\7O\2\2\u018d\u0198\5\32\16\2\u018e\u0198\5^\60\2\u018f"
            + "\u0190\7D\2\2\u0190\u0191\5H%\2\u0191\u0192\7E\2\2\u0192\u0198\3\2\2\2"
            + "\u0193\u0194\t\5\2\2\u0194\u0195\5H%\2\u0195\u0196\t\6\2\2\u0196\u0198"
            + "\3\2\2\2\u0197\u018b\3\2\2\2\u0197\u018d\3\2\2\2\u0197\u018e\3\2\2\2\u0197"
            + "\u018f\3\2\2\2\u0197\u0193\3\2\2\2\u0198\u01b3\3\2\2\2\u0199\u019a\f\7"
            + "\2\2\u019a\u019b\t\7\2\2\u019b\u01b2\5H%\b\u019c\u019d\f\6\2\2\u019d\u019e"
            + "\7B\2\2\u019e\u019f\5H%\2\u019f\u01a0\7@\2\2\u01a0\u01a1\5H%\7\u01a1\u01b2"
            + "\3\2\2\2\u01a2\u01a3\f\3\2\2\u01a3\u01a4\7?\2\2\u01a4\u01b2\5H%\4\u01a5"
            + "\u01a6\f\5\2\2\u01a6\u01ad\7>\2\2\u01a7\u01ae\7O\2\2\u01a8\u01aa\7C\2"
            + "\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac"
            + "\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ae"
            + "\u01b2\3\2\2\2\u01af\u01b0\f\4\2\2\u01b0\u01b2\5`\61\2\u01b1\u0199\3\2"
            + "\2\2\u01b1\u019c\3\2\2\2\u01b1\u01a2\3\2\2\2\u01b1\u01a5\3\2\2\2\u01b1"
            + "\u01af\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"
            + "\2\2\u01b4I\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\5L\'\2\u01b7\u01b9"
            + "\5b\62\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"
            + "\u01bc\7\36\2\2\u01bb\u01b6\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bcK\3\2\2\2"
            + "\u01bd\u01bf\5R*\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be"
            + "\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3"
            + "\u01c4\5P)\2\u01c4M\3\2\2\2\u01c5\u01c7\5R*\2\u01c6\u01c5\3\2\2\2\u01c7"
            + "\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"
            + "\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\5F$\2\u01ccO\3\2\2\2\u01cd\u01ce"
            + "\t\4\2\2\u01ceQ\3\2\2\2\u01cf\u01d6\5T+\2\u01d0\u01d6\5X-\2\u01d1\u01d6"
            + "\7&\2\2\u01d2\u01d6\7#\2\2\u01d3\u01d6\7!\2\2\u01d4\u01d6\7 \2\2\u01d5"
            + "\u01cf\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d5\u01d1\3\2\2\2\u01d5\u01d2\3\2"
            + "\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6S\3\2\2\2\u01d7\u01e1"
            + "\7%\2\2\u01d8\u01e1\7$\2\2\u01d9\u01de\7\"\2\2\u01da\u01db\7D\2\2\u01db"
            + "\u01dc\5V,\2\u01dc\u01dd\7E\2\2\u01dd\u01df\3\2\2\2\u01de\u01da\3\2\2"
            + "\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01d7\3\2\2\2\u01e0\u01d8"
            + "\3\2\2\2\u01e0\u01d9\3\2\2\2\u01e1U\3\2\2\2\u01e2\u01e7\7O\2\2\u01e3\u01e4"
            + "\7?\2\2\u01e4\u01e6\7O\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7"
            + "\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8W\3\2\2\2\u01e9\u01e7\3\2\2\2"
            + "\u01ea\u01eb\7\20\2\2\u01eb\u01ec\7D\2\2\u01ec\u01ed\5Z.\2\u01ed\u01ee"
            + "\7E\2\2\u01eeY\3\2\2\2\u01ef\u01f4\5\\/\2\u01f0\u01f1\7?\2\2\u01f1\u01f3"
            + "\5\\/\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"
            + "\u01f5\3\2\2\2\u01f5[\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\7O\2\2\u01f8"
            + "\u01f9\7=\2\2\u01f9\u01fb\5^\60\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2"
            + "\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fe\7%\2\2\u01fd\u01f7\3\2\2\2\u01fd"
            + "\u01fc\3\2\2\2\u01fe]\3\2\2\2\u01ff\u0200\t\b\2\2\u0200_\3\2\2\2\u0201"
            + "\u0202\7H\2\2\u0202\u0203\5H%\2\u0203\u0204\7I\2\2\u0204\u0206\3\2\2\2"
            + "\u0205\u0201\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208"
            + "\3\2\2\2\u0208a\3\2\2\2\u0209\u020b\7H\2\2\u020a\u020c\5H%\2\u020b\u020a"
            + "\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\7I\2\2\u020e"
            + "\u0209\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2"
            + "\2\2\u0211c\3\2\2\2Aiksz\177\u0087\u0090\u0098\u00a1\u00a5\u00aa\u00ac"
            + "\u00b7\u00bd\u00c2\u00c6\u00ca\u00d5\u00de\u00e6\u00ed\u00f4\u0113\u0115"
            + "\u011a\u0129\u0132\u0134\u013b\u0143\u0146\u0149\u014f\u0155\u015a\u015d"
            + "\u0160\u0164\u0169\u016e\u0173\u017c\u0181\u0185\u0197\u01ab\u01ad\u01b1"
            + "\u01b3\u01b8\u01bb\u01c0\u01c8\u01d5\u01de\u01e0\u01e7\u01f4\u01fa\u01fd"
            + "\u0207\u020b\u0210";
    public static final ATN _ATN
            = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
