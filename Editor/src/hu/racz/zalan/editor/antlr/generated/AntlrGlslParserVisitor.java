// Generated from AntlrGlslParser.g4 by ANTLR 4.7.1
package hu.racz.zalan.editor.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AntlrGlslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AntlrGlslParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AntlrGlslParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_header(AntlrGlslParser.Function_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(AntlrGlslParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#function_subroutine_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_subroutine_qualifier(AntlrGlslParser.Function_subroutine_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#type_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name_list(AntlrGlslParser.Type_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#function_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter_list(AntlrGlslParser.Function_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter(AntlrGlslParser.Function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#parameter_qualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_qualifiers(AntlrGlslParser.Parameter_qualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#parameter_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_qualifier(AntlrGlslParser.Parameter_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#function_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_prototype(AntlrGlslParser.Function_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(AntlrGlslParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(AntlrGlslParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#function_call_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_parameter_list(AntlrGlslParser.Function_call_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AntlrGlslParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(AntlrGlslParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(AntlrGlslParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(AntlrGlslParser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(AntlrGlslParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#case_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_group(AntlrGlslParser.Case_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(AntlrGlslParser.Case_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#case_statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement_list(AntlrGlslParser.Case_statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(AntlrGlslParser.Iteration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#for_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_iteration(AntlrGlslParser.For_iterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#while_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_iteration(AntlrGlslParser.While_iterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#do_while_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_iteration(AntlrGlslParser.Do_while_iterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(AntlrGlslParser.Jump_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(AntlrGlslParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#declaration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_statement(AntlrGlslParser.Declaration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(AntlrGlslParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_declaration(AntlrGlslParser.Member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#member_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_declarator(AntlrGlslParser.Member_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(AntlrGlslParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#identifier_optarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_optarray(AntlrGlslParser.Identifier_optarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#identifier_optarray_optassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_optarray_optassignment(AntlrGlslParser.Identifier_optarray_optassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AntlrGlslParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(AntlrGlslParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AntlrGlslParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#array_subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_subscript(AntlrGlslParser.Array_subscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_qualifier(AntlrGlslParser.Type_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#storage_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_qualifier(AntlrGlslParser.Storage_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#auxiliary_storage_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxiliary_storage_qualifier(AntlrGlslParser.Auxiliary_storage_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#memory_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemory_qualifier(AntlrGlslParser.Memory_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#layout_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayout_qualifier(AntlrGlslParser.Layout_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#layout_qualifier_id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayout_qualifier_id_list(AntlrGlslParser.Layout_qualifier_id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayout_qualifier_id(AntlrGlslParser.Layout_qualifier_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#precision_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision_qualifier(AntlrGlslParser.Precision_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation_qualifier(AntlrGlslParser.Interpolation_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AntlrGlslParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrGlslParser#number_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_literal(AntlrGlslParser.Number_literalContext ctx);
}