// Generated from GLSLParser.g4 by ANTLR 4.7.1
package hu.racz.zalan.editor.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GLSLParser}.
 */
public interface GLSLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GLSLParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GLSLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GLSLParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void enterFunction_signature(GLSLParser.Function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void exitFunction_signature(GLSLParser.Function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(GLSLParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(GLSLParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_subroutine_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_subroutine_qualifier(GLSLParser.Function_subroutine_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_subroutine_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_subroutine_qualifier(GLSLParser.Function_subroutine_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter_list(GLSLParser.Function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter_list(GLSLParser.Function_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter(GLSLParser.Function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter(GLSLParser.Function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#parameter_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterParameter_qualifier(GLSLParser.Parameter_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#parameter_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitParameter_qualifier(GLSLParser.Parameter_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prototype(GLSLParser.Function_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prototype(GLSLParser.Function_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(GLSLParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(GLSLParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(GLSLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(GLSLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#function_call_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_parameter_list(GLSLParser.Function_call_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#function_call_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_parameter_list(GLSLParser.Function_call_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(GLSLParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(GLSLParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GLSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GLSLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(GLSLParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(GLSLParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(GLSLParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(GLSLParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(GLSLParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(GLSLParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(GLSLParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(GLSLParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#case_group}.
	 * @param ctx the parse tree
	 */
	void enterCase_group(GLSLParser.Case_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#case_group}.
	 * @param ctx the parse tree
	 */
	void exitCase_group(GLSLParser.Case_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(GLSLParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(GLSLParser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#case_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_list(GLSLParser.Case_statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#case_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_list(GLSLParser.Case_statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(GLSLParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(GLSLParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#for_iteration}.
	 * @param ctx the parse tree
	 */
	void enterFor_iteration(GLSLParser.For_iterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#for_iteration}.
	 * @param ctx the parse tree
	 */
	void exitFor_iteration(GLSLParser.For_iterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#while_iteration}.
	 * @param ctx the parse tree
	 */
	void enterWhile_iteration(GLSLParser.While_iterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#while_iteration}.
	 * @param ctx the parse tree
	 */
	void exitWhile_iteration(GLSLParser.While_iterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#do_while_iteration}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_iteration(GLSLParser.Do_while_iterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#do_while_iteration}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_iteration(GLSLParser.Do_while_iterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(GLSLParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(GLSLParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(GLSLParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(GLSLParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(GLSLParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(GLSLParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#init_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declaration_list(GLSLParser.Init_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#init_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declaration_list(GLSLParser.Init_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_declaration(GLSLParser.Single_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_declaration(GLSLParser.Single_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#struct_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration_list(GLSLParser.Struct_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#struct_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration_list(GLSLParser.Struct_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(GLSLParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(GLSLParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator_list(GLSLParser.Struct_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator_list(GLSLParser.Struct_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator(GLSLParser.Struct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator(GLSLParser.Struct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_specifier(GLSLParser.Struct_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_specifier(GLSLParser.Struct_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GLSLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GLSLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(GLSLParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(GLSLParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#fully_specified_type}.
	 * @param ctx the parse tree
	 */
	void enterFully_specified_type(GLSLParser.Fully_specified_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#fully_specified_type}.
	 * @param ctx the parse tree
	 */
	void exitFully_specified_type(GLSLParser.Fully_specified_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#fully_specified_struct}.
	 * @param ctx the parse tree
	 */
	void enterFully_specified_struct(GLSLParser.Fully_specified_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#fully_specified_struct}.
	 * @param ctx the parse tree
	 */
	void exitFully_specified_struct(GLSLParser.Fully_specified_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GLSLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GLSLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(GLSLParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(GLSLParser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#type_name_list}.
	 * @param ctx the parse tree
	 */
	void enterType_name_list(GLSLParser.Type_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#type_name_list}.
	 * @param ctx the parse tree
	 */
	void exitType_name_list(GLSLParser.Type_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_qualifier(GLSLParser.Storage_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_qualifier(GLSLParser.Storage_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#auxiliary_storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterAuxiliary_storage_qualifier(GLSLParser.Auxiliary_storage_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#auxiliary_storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitAuxiliary_storage_qualifier(GLSLParser.Auxiliary_storage_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#memory_storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterMemory_storage_qualifier(GLSLParser.Memory_storage_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#memory_storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitMemory_storage_qualifier(GLSLParser.Memory_storage_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier(GLSLParser.Layout_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier(GLSLParser.Layout_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#layout_qualifier_id_list}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier_id_list(GLSLParser.Layout_qualifier_id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#layout_qualifier_id_list}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier_id_list(GLSLParser.Layout_qualifier_id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier_id(GLSLParser.Layout_qualifier_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier_id(GLSLParser.Layout_qualifier_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_qualifier(GLSLParser.Precision_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_qualifier(GLSLParser.Precision_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation_qualifier(GLSLParser.Interpolation_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation_qualifier(GLSLParser.Interpolation_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GLSLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GLSLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(GLSLParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(GLSLParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(GLSLParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(GLSLParser.Number_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#array_usage}.
	 * @param ctx the parse tree
	 */
	void enterArray_usage(GLSLParser.Array_usageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#array_usage}.
	 * @param ctx the parse tree
	 */
	void exitArray_usage(GLSLParser.Array_usageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration(GLSLParser.Array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration(GLSLParser.Array_declarationContext ctx);
}