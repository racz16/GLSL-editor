package hu.racz.zalan.editor.codecompletion;

import hu.racz.zalan.editor.core.scope.type.TypeDeclaration;
import hu.racz.zalan.editor.core.scope.variable.VariableDeclaration;
import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.Element;
import java.util.*;
import javax.swing.text.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.modules.parsing.spi.*;
import org.netbeans.spi.editor.completion.*;
import org.netbeans.spi.editor.completion.support.*;
import org.openide.util.*;

@MimeRegistration(mimeType = "text/x-glsl", service = CompletionProvider.class)
public class GlslCompletionProvider implements CompletionProvider {

    private static final List<Keyword> KEYWORDS = new ArrayList();
    private static final List<TypeDeclaration> BI_TYPES = new ArrayList<>();
    private static final List<VariableDeclaration> BI_VARIABLES = new ArrayList<>();
    private static final List<Function> BI_FUNCTIONS = new ArrayList<>();

    private CompletionResultSet resultSet;
    private int caretPosition;
    private String filter;

    private static final char CARRIGE_RETURN = '\r';
    private static final char LINE_FEED = '\n';
    private static final char TAB = '\t';
    private static final char SPACE = ' ';
    private static final char LCB = '{';
    private static final char RCB = '}';
    private static final char LSB = '[';
    private static final char LRB = '(';
    private static final char COMMA = ',';
    private static final char COLON = ':';
    private static final char SEMICOLON = ';';

    static {
        addKeywords();
        addBuiltInTypes();
        addBuiltInVariables();
        addBuiltInFunctions();
    }

    private static void addKeywords() {
        KEYWORDS.add(new Keyword("break"));
        KEYWORDS.add(new Keyword("continue"));
        KEYWORDS.add(new Keyword("do"));
        KEYWORDS.add(new Keyword("for"));
        KEYWORDS.add(new Keyword("while"));
        KEYWORDS.add(new Keyword("switch"));
        KEYWORDS.add(new Keyword("case"));
        KEYWORDS.add(new Keyword("default"));
        KEYWORDS.add(new Keyword("if"));
        KEYWORDS.add(new Keyword("else"));
        KEYWORDS.add(new Keyword("discard"));
        KEYWORDS.add(new Keyword("return"));
        KEYWORDS.add(new Keyword("struct"));
        KEYWORDS.add(new Keyword("void"));
        KEYWORDS.add(new Keyword("precision"));
        KEYWORDS.add(new Keyword("layout"));
        KEYWORDS.add(new Keyword("precise"));
        KEYWORDS.add(new Keyword("invariant"));
        KEYWORDS.add(new Keyword("subroutine"));
        KEYWORDS.add(new Keyword("smooth"));
        KEYWORDS.add(new Keyword("flat"));
        KEYWORDS.add(new Keyword("noperspective"));
        KEYWORDS.add(new Keyword("const"));
        KEYWORDS.add(new Keyword("inout"));
        KEYWORDS.add(new Keyword("in"));
        KEYWORDS.add(new Keyword("out"));
        KEYWORDS.add(new Keyword("centroid"));
        KEYWORDS.add(new Keyword("patch"));
        KEYWORDS.add(new Keyword("sample"));
        KEYWORDS.add(new Keyword("uniform"));
        KEYWORDS.add(new Keyword("buffer"));
        KEYWORDS.add(new Keyword("varying"));
        KEYWORDS.add(new Keyword("attribute"));
        KEYWORDS.add(new Keyword("coherent"));
        KEYWORDS.add(new Keyword("volatile"));
        KEYWORDS.add(new Keyword("restrict"));
        KEYWORDS.add(new Keyword("readonly"));
        KEYWORDS.add(new Keyword("writeonly"));
        KEYWORDS.add(new Keyword("shared"));
        KEYWORDS.add(new Keyword("highp"));
        KEYWORDS.add(new Keyword("mediump"));
        KEYWORDS.add(new Keyword("lowp"));
        KEYWORDS.add(new Keyword("true"));
        KEYWORDS.add(new Keyword("false"));
    }

    private static void addBuiltInTypes() {
        BI_TYPES.add(new TypeDeclaration("bool", true));
        BI_TYPES.add(new TypeDeclaration("int", true));
        BI_TYPES.add(new TypeDeclaration("uint", true));
        BI_TYPES.add(new TypeDeclaration("float", true));
        BI_TYPES.add(new TypeDeclaration("double", true));
        BI_TYPES.add(new TypeDeclaration("vec2", true));
        BI_TYPES.add(new TypeDeclaration("vec3", true));
        BI_TYPES.add(new TypeDeclaration("vec4", true));
        BI_TYPES.add(new TypeDeclaration("dvec2", true));
        BI_TYPES.add(new TypeDeclaration("dvec3", true));
        BI_TYPES.add(new TypeDeclaration("dvec4", true));
        BI_TYPES.add(new TypeDeclaration("bvec2", true));
        BI_TYPES.add(new TypeDeclaration("bvec3", true));
        BI_TYPES.add(new TypeDeclaration("bvec4", true));
        BI_TYPES.add(new TypeDeclaration("ivec2", true));
        BI_TYPES.add(new TypeDeclaration("ivec3", true));
        BI_TYPES.add(new TypeDeclaration("ivec4 ", true));
        BI_TYPES.add(new TypeDeclaration("uvec2", true));
        BI_TYPES.add(new TypeDeclaration("uvec3", true));
        BI_TYPES.add(new TypeDeclaration("uvec4", true));
        BI_TYPES.add(new TypeDeclaration("mat2", true));
        BI_TYPES.add(new TypeDeclaration("mat3", true));
        BI_TYPES.add(new TypeDeclaration("mat4", true));
        BI_TYPES.add(new TypeDeclaration("mat2x2", true));
        BI_TYPES.add(new TypeDeclaration("mat2x3", true));
        BI_TYPES.add(new TypeDeclaration("mat2x4", true));
        BI_TYPES.add(new TypeDeclaration("mat3x2", true));
        BI_TYPES.add(new TypeDeclaration("mat3x3", true));
        BI_TYPES.add(new TypeDeclaration("mat3x4", true));
        BI_TYPES.add(new TypeDeclaration("mat4x2", true));
        BI_TYPES.add(new TypeDeclaration("mat4x3", true));
        BI_TYPES.add(new TypeDeclaration("mat4x4", true));
        BI_TYPES.add(new TypeDeclaration("dmat2", true));
        BI_TYPES.add(new TypeDeclaration("dmat3", true));
        BI_TYPES.add(new TypeDeclaration("dmat4", true));
        BI_TYPES.add(new TypeDeclaration("dmat2x2", true));
        BI_TYPES.add(new TypeDeclaration("dmat2x3", true));
        BI_TYPES.add(new TypeDeclaration("dmat2x4", true));
        BI_TYPES.add(new TypeDeclaration("dmat3x2", true));
        BI_TYPES.add(new TypeDeclaration("dmat3x3", true));
        BI_TYPES.add(new TypeDeclaration("dmat3x4", true));
        BI_TYPES.add(new TypeDeclaration("dmat4x2", true));
        BI_TYPES.add(new TypeDeclaration("dmat4x3", true));
        BI_TYPES.add(new TypeDeclaration("dmat4x4", true));
        BI_TYPES.add(new TypeDeclaration("sampler1D", true));
        BI_TYPES.add(new TypeDeclaration("image1D", true));
        BI_TYPES.add(new TypeDeclaration("sampler2D", true));
        BI_TYPES.add(new TypeDeclaration("image2D", true));
        BI_TYPES.add(new TypeDeclaration("sampler3D", true));
        BI_TYPES.add(new TypeDeclaration("image3D", true));
        BI_TYPES.add(new TypeDeclaration("samplerCube", true));
        BI_TYPES.add(new TypeDeclaration("imageCube", true));
        BI_TYPES.add(new TypeDeclaration("sampler2DRect", true));
        BI_TYPES.add(new TypeDeclaration("image2DRect", true));
        BI_TYPES.add(new TypeDeclaration("sampler1DArray", true));
        BI_TYPES.add(new TypeDeclaration("image1DArray", true));
        BI_TYPES.add(new TypeDeclaration("sampler2DArray", true));
        BI_TYPES.add(new TypeDeclaration("image2DArray", true));
        BI_TYPES.add(new TypeDeclaration("samplerBuffer", true));
        BI_TYPES.add(new TypeDeclaration("imageBuffer", true));
        BI_TYPES.add(new TypeDeclaration("sampler2DMS", true));
        BI_TYPES.add(new TypeDeclaration("image2DMS", true));
        BI_TYPES.add(new TypeDeclaration("sampler2DMSArray", true));
        BI_TYPES.add(new TypeDeclaration("image2DMSArray", true));
        BI_TYPES.add(new TypeDeclaration("samplerCubeArray", true));
        BI_TYPES.add(new TypeDeclaration("imageCubeArray", true));
        BI_TYPES.add(new TypeDeclaration("sampler1DShadow", true));
        BI_TYPES.add(new TypeDeclaration("sampler2DShadow", true));
        BI_TYPES.add(new TypeDeclaration("sampler2DRectShadow", true));
        BI_TYPES.add(new TypeDeclaration("sampler1DArrayShadow", true));
        BI_TYPES.add(new TypeDeclaration("sampler2DArrayShadow", true));
        BI_TYPES.add(new TypeDeclaration("samplerCubeShadow", true));
        BI_TYPES.add(new TypeDeclaration("samplerCubeArrayShadow", true));
        BI_TYPES.add(new TypeDeclaration("isampler1D", true));
        BI_TYPES.add(new TypeDeclaration("iimage1D", true));
        BI_TYPES.add(new TypeDeclaration("isampler2D", true));
        BI_TYPES.add(new TypeDeclaration("iimage2D", true));
        BI_TYPES.add(new TypeDeclaration("isampler3D", true));
        BI_TYPES.add(new TypeDeclaration("iimage3D", true));
        BI_TYPES.add(new TypeDeclaration("isamplerCube", true));
        BI_TYPES.add(new TypeDeclaration("iimageCube", true));
        BI_TYPES.add(new TypeDeclaration("isampler2DRect", true));
        BI_TYPES.add(new TypeDeclaration("iimage2DRect", true));
        BI_TYPES.add(new TypeDeclaration("isampler1DArray", true));
        BI_TYPES.add(new TypeDeclaration("iimage1DArray", true));
        BI_TYPES.add(new TypeDeclaration("isampler2DArray", true));
        BI_TYPES.add(new TypeDeclaration("iimage2DArray", true));
        BI_TYPES.add(new TypeDeclaration("isamplerBuffer", true));
        BI_TYPES.add(new TypeDeclaration("iimageBuffer", true));
        BI_TYPES.add(new TypeDeclaration("isampler2DMS", true));
        BI_TYPES.add(new TypeDeclaration("iimage2DMS", true));
        BI_TYPES.add(new TypeDeclaration("isampler2DMSArray", true));
        BI_TYPES.add(new TypeDeclaration("iimage2DMSArray", true));
        BI_TYPES.add(new TypeDeclaration("isamplerCubeArray", true));
        BI_TYPES.add(new TypeDeclaration("iimageCubeArray", true));
        BI_TYPES.add(new TypeDeclaration("usampler1D", true));
        BI_TYPES.add(new TypeDeclaration("uimage1D", true));
        BI_TYPES.add(new TypeDeclaration("usampler2D", true));
        BI_TYPES.add(new TypeDeclaration("uimage2D", true));
        BI_TYPES.add(new TypeDeclaration("usampler3D", true));
        BI_TYPES.add(new TypeDeclaration("uimage3D", true));
        BI_TYPES.add(new TypeDeclaration("usamplerCube", true));
        BI_TYPES.add(new TypeDeclaration("uimageCube", true));
        BI_TYPES.add(new TypeDeclaration("usampler2DRect", true));
        BI_TYPES.add(new TypeDeclaration("uimage2DRect", true));
        BI_TYPES.add(new TypeDeclaration("usampler1DArray", true));
        BI_TYPES.add(new TypeDeclaration("uimage1DArray", true));
        BI_TYPES.add(new TypeDeclaration("usampler2DArray", true));
        BI_TYPES.add(new TypeDeclaration("uimage2DArray", true));
        BI_TYPES.add(new TypeDeclaration("usamplerBuffer", true));
        BI_TYPES.add(new TypeDeclaration("uimageBuffer", true));
        BI_TYPES.add(new TypeDeclaration("usampler2DMS", true));
        BI_TYPES.add(new TypeDeclaration("uimage2DMS", true));
        BI_TYPES.add(new TypeDeclaration("usampler2DMSArray", true));
        BI_TYPES.add(new TypeDeclaration("uimage2DMSArray", true));
        BI_TYPES.add(new TypeDeclaration("usamplerCubeArray", true));
        BI_TYPES.add(new TypeDeclaration("uimageCubeArray", true));
    }

    private static void addBuiltInVariables() {
        BI_VARIABLES.add(new VariableDeclaration("uvec3", "gl_NumWorkGroups", true));
        BI_VARIABLES.add(new VariableDeclaration("uvec3", "gl_WorkGroupSize", true));
        BI_VARIABLES.add(new VariableDeclaration("uvec3", "gl_WorkGroupID", true));
        BI_VARIABLES.add(new VariableDeclaration("uvec3", "gl_LocalInvocationID", true));
        BI_VARIABLES.add(new VariableDeclaration("uvec3", "gl_GlobalInvocationID", true));
        BI_VARIABLES.add(new VariableDeclaration("uint", "gl_LocalInvocationIndex", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_VertexID", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_InstanceID", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_DrawID", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_BaseVertex", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_BaseInstance", true));
        BI_VARIABLES.add(new VariableDeclaration("vec4", "gl_Position", true));
        BI_VARIABLES.add(new VariableDeclaration("float", "gl_PointSize", true));
        BI_VARIABLES.add(new VariableDeclaration("float", "gl_ClipDistance", true, true));
        BI_VARIABLES.add(new VariableDeclaration("float", "gl_CullDistance", true, true));
        BI_VARIABLES.add(new VariableDeclaration("gl_PerVertex", "gl_in", true, true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_PrimitiveIDIn", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_InvocationID", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_PatchVerticesIn", true));
        BI_VARIABLES.add(new VariableDeclaration("vec3", "gl_TessCoord", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_PrimitiveID", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_Layer", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_ViewportIndex", true));
        BI_VARIABLES.add(new VariableDeclaration("float", "gl_TessLevelOuter", true, true));
        BI_VARIABLES.add(new VariableDeclaration("float", "gl_TessLevelInner", true, true));
        BI_VARIABLES.add(new VariableDeclaration("vec4", "gl_FragCoord", true));
        BI_VARIABLES.add(new VariableDeclaration("bool", "gl_FrontFacing", true));
        BI_VARIABLES.add(new VariableDeclaration("vec2", "gl_PointCoord", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_SampleID", true));
        BI_VARIABLES.add(new VariableDeclaration("vec2", "gl_SamplePosition", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_SampleMaskIn", true, true));
        BI_VARIABLES.add(new VariableDeclaration("bool", "gl_HelperInvocation", true));
        BI_VARIABLES.add(new VariableDeclaration("float", "gl_FragDepth", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_SampleMask", true, true));
        BI_VARIABLES.add(new VariableDeclaration("gl_DepthRangeParameters", "gl_DepthRange", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_NumSamples", true));
        //constants
        BI_VARIABLES.add(new VariableDeclaration("ivec3", "gl_MaxComputeWorkGroupCount", true));
        BI_VARIABLES.add(new VariableDeclaration("ivec3", "gl_MaxComputeWorkGroupSize", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxComputeUniformComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxComputeTextureImageUnits", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxComputeImageUniforms", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxComputeAtomicCounters", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxComputeAtomicCounterBuffers", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxVertexAttribs", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxVertexUniformComponents ", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxVaryingComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxVertexOutputComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxGeometryInputComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxGeometryOutputComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxFragmentInputComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxVertexTextureImageUnits", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxCombinedTextureImageUnits", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTextureImageUnits", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxImageUnits", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxCombinedImageUnitsAndFragmentOutputs", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxCombinedShaderOutputResources", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxImageSamples", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxVertexImageUniforms", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessControlImageUniforms", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessEvaluationImageUniforms", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxGeometryImageUniforms", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxFragmentImageUniforms", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxCombinedImageUniforms", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxFragmentUniformComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxDrawBuffers", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxClipDistances", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxGeometryTextureImageUnits", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxGeometryOutputVertices", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxGeometryTotalOutputComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxGeometryUniformComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxGeometryVaryingComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessControlInputComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessControlOutputComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessControlTextureImageUnits", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessControlUniformComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessControlTotalOutputComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessEvaluationInputComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessEvaluationOutputComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessEvaluationTextureImageUnits", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessEvaluationUniformComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessPatchComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxPatchVertices", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessGenLevel", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxViewports", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxVertexUniformVectors", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxFragmentUniformVectors", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxVaryingVectors", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxVertexAtomicCounters", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessControlAtomicCounters", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessEvaluationAtomicCounters", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxGeometryAtomicCounters", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxFragmentAtomicCounters", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxCombinedAtomicCounters", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxAtomicCounterBindings", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxVertexAtomicCounterBuffers", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessControlAtomicCounterBuffers", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTessEvaluationAtomicCounterBuffers", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxGeometryAtomicCounterBuffers", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxFragmentAtomicCounterBuffers", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxCombinedAtomicCounterBuffers", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxAtomicCounterBufferSize", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MinProgramTexelOffset", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxProgramTexelOffset", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTransformFeedbackBuffers", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxTransformFeedbackInterleavedComponents", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxCullDistances", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxCombinedClipAndCullDistances", true));
        BI_VARIABLES.add(new VariableDeclaration("int", "gl_MaxSamples", true));
    }

    private static void addBuiltInFunctions() {
        Function f = new Function("T", "radians", true);
        f.addParameter(new VariableDeclaration("T", "degrees"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "degrees", true);
        f.addParameter(new VariableDeclaration("T", "radians"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "sin", true);
        f.addParameter(new VariableDeclaration("T", "angle"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "cos", true);
        f.addParameter(new VariableDeclaration("T", "angle"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "tan", true);
        f.addParameter(new VariableDeclaration("T", "angle"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "asin", true);
        f.addParameter(new VariableDeclaration("T", "x"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "acos", true);
        f.addParameter(new VariableDeclaration("T", "x"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "atan", true);
        f.setHideParameters(true);
        BI_FUNCTIONS.add(f);
        f = new Function("T", "sinh", true);
        f.addParameter(new VariableDeclaration("T", "x"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "cosh", true);
        f.addParameter(new VariableDeclaration("T", "x"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "tanh", true);
        f.addParameter(new VariableDeclaration("T", "x"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "asinh", true);
        f.addParameter(new VariableDeclaration("T", "x"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "acosh", true);
        f.addParameter(new VariableDeclaration("T", "x"));
        BI_FUNCTIONS.add(f);
        f = new Function("T", "atanh", true);
        f.addParameter(new VariableDeclaration("T", "x"));
        BI_FUNCTIONS.add(f);

        f = new Function("T", "texture", true);
        BI_FUNCTIONS.add(f);
    }

    @Override
    public CompletionTask createTask(int queryType, JTextComponent jtc) {
        if (queryType != CompletionProvider.COMPLETION_QUERY_TYPE) {
            return null;
        }
        return new AsyncCompletionTask(new GlslAsyncCompletionQuery(), jtc);
    }

    private void initializeCodeCompletion(CompletionResultSet completionResultSet, Document document, int caretPosition) throws BadLocationException {
        this.resultSet = completionResultSet;
        this.caretPosition = caretPosition;
        //kódkiegészítés során leütött karaktereket a parser valamiéert nem érzékeli, úgyhogy manuálisan frissítem
        if (GlslProcessor.getText().length() != document.getLength()) {
            GlslProcessor.setText(document.getText(0, document.getLength()));
        }
    }

    private void addCodeCompletionItems() throws BadLocationException, ParseException {
        Scope rootScope = GlslProcessor.getRootScope();
        Scope caretScope = GlslProcessor.getCaretScope(caretPosition);
        filter = computeFilter();
        addUserElements(rootScope, caretScope);
        addBuiltInElements();
    }

    private void addUserElements(Scope rootScope, Scope caretScope) {
        addElementListIfDeclared(rootScope.getTypeDeclarations());
        addUserVariablesFromScopes(caretScope);
        addUserFunctions(rootScope);
    }

    private void addUserVariablesFromScopes(Scope scope) {
        while (scope != null) {
            addElementListIfDeclared(scope.getVariables());
            scope = scope.getParent();
        }
    }

    private void addUserFunctions(Scope scope) {
        for (Function function : scope.getFunctionPrototypes()) {
            if (function.getSignatureStopIndex() < caretPosition) {
                addElement(function);
            }
        }
    }

    private void addElementListIfDeclared(List<? extends Element> elements) {
        for (Element element : elements) {
            if (element.getStopIndex() < caretPosition) {
                addElement(element);
            }
        }
    }

    private void addBuiltInElements() {
        if (!filter.isEmpty()) {
            addElementList(KEYWORDS);
            addElementList(BI_TYPES);
            addElementList(BI_VARIABLES);
            addElementList(BI_FUNCTIONS);
        }
    }

    private void addElementList(List<? extends Element> elements) {
        for (Element element : elements) {
            addElement(element);
        }
    }

    private void addElement(Element element) {
        if (element.getName().startsWith(filter)) {
            resultSet.addItem(new GlslCompletionItem((CompletionElement) element, filter.length(), caretPosition));
        }
    }

    private String computeFilter() throws BadLocationException {
        if (caretPosition == 0) {
            return "";
        }
        String text = GlslProcessor.getText();
        int offset = computeFilterOffset(text, caretPosition - 1);
        return offset == caretPosition ? "" : text.substring(offset, caretPosition);
    }

    private int computeFilterOffset(String text, int offset) {
        while (offset >= 0) {
            if (isIdentifierSeparator(text.charAt(offset))) {
                return offset + 1;
            }
            offset--;
        }
        return offset + 1;
    }

    private boolean isIdentifierSeparator(char character) {
        return character == SPACE || character == CARRIGE_RETURN || character == LINE_FEED
                || character == TAB || character == LCB || character == LRB
                || character == LSB || character == COMMA || character == SEMICOLON
                || character == RCB || character == COLON;
    }

    @Override
    public int getAutoQueryTypes(JTextComponent jtc, String string) {
        return 0;
    }

    private class GlslAsyncCompletionQuery extends AsyncCompletionQuery {

        @Override
        protected void query(CompletionResultSet completionResultSet, Document document, int caretOffset) {
            try {
                initializeCodeCompletion(completionResultSet, document, caretOffset);
                addCodeCompletionItems();
                completionResultSet.finish();
            } catch (BadLocationException | ParseException ex) {
                Exceptions.printStackTrace(ex);
            }
        }

    }

}
