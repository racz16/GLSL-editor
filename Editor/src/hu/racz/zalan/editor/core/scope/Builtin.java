package hu.racz.zalan.editor.core.scope;

import hu.racz.zalan.editor.core.scope.qualifier.Qualifier;
import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.io.*;
import java.util.*;
import javax.xml.parsers.*;
import org.openide.util.*;
import org.w3c.dom.*;
import org.w3c.dom.Element;
import org.xml.sax.*;

public class Builtin {

    private static final String XML_FUNCTIONS = "src\\hu\\racz\\zalan\\editor\\core\\scope\\res\\xml\\functions.xml";
    private static final String XML_KEYWORDS = "src\\hu\\racz\\zalan\\editor\\core\\scope\\res\\xml\\keywords.xml";
    private static final String XML_QUALIFIERS = "src\\hu\\racz\\zalan\\editor\\core\\scope\\res\\xml\\qualifiers.xml";
    private static final String XML_QUALIFIER_RULES = "src\\hu\\racz\\zalan\\editor\\core\\scope\\res\\xml\\qualifier_rules.xml";
    private static final String XML_TYPES = "src\\hu\\racz\\zalan\\editor\\core\\scope\\res\\xml\\types.xml";
    private static final String XML_VARIABLES = "src\\hu\\racz\\zalan\\editor\\core\\scope\\res\\xml\\variables.xml";
    private static final String XML_IMPLICIT_CONVERSIONS = "src\\hu\\racz\\zalan\\editor\\core\\scope\\res\\xml\\conversions.xml";
    private static final String XML_CONSTRUCTORS = "src\\hu\\racz\\zalan\\editor\\core\\scope\\res\\xml\\constructors.xml";

    private static final List<Function> FUNCTIONS = new ArrayList<>();
    private static final Map<String, VariableDeclaration> VARIABLES = new HashMap<>();
    private static final Map<String, TypeDeclaration> TYPES = new HashMap<>();
    private static final List<Keyword> KEYWORDS = new ArrayList<>();
    private static final Map<String, Qualifier> QUALIFIERS = new HashMap<>();
    private static final List<Set<Qualifier>> QUALIFIER_RULES = new ArrayList<>();

    private static Document doc;

    static {
        try {
            long time = System.currentTimeMillis();
            loadKeywords();
            loadQualifiers();
            loadTypes();
            loadVariables();
            loadFunctions();
            loadImplicitConversions();
            loadQualifierRules();
            loadConstructors();
            long elapsedTime = System.currentTimeMillis() - time;
            System.out.println("xml: " + elapsedTime);
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private static void loadDocument(String filePath) {
        try {
            loadDocumentUnsafe(filePath);
        } catch (IOException | ParserConfigurationException | DOMException | SAXException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private static void loadDocumentUnsafe(String filePath) throws ParserConfigurationException, SAXException, IOException {
        File inputFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
    }

    private static void setReturnType(Element eFunc, Function func) {
        String typeName = eFunc.getElementsByTagName("type").item(0).getTextContent();
        TypeUsage tu = new TypeUsage(typeName);
        tu.setDeclaration(getType(typeName));
        func.setReturnType(tu);
    }

    //
    //constructors--------------------------------------------------------------
    //
    private static void loadConstructors() {
        loadDocument(XML_CONSTRUCTORS);
        NodeList eCtors = doc.getElementsByTagName("constructor");
        for (int i = 0; i < eCtors.getLength(); i++) {
            Element eCtor = (Element) eCtors.item(i);
            Function ctor = createConstructor(eCtor);
            FUNCTIONS.add(ctor);
        }
    }

    private static Function createConstructor(Element eCtor) {
        Function ctor = new Function();
        setReturnType(eCtor, ctor);
        ctor.setName(ctor.getReturnType().getName());
        setConstructorParameters(ctor, eCtor);
        ctor.setBuiltIn(true);
        ctor.setConstructor(true);
        return ctor;
    }

    private static void setConstructorParameters(Function ctor, Element eCtor) {
        NodeList eParams = eCtor.getElementsByTagName("parameter");
        for (int i = 0; i < eParams.getLength(); i++) {
            String typeName = eParams.item(i).getTextContent();
            TypeUsage tu = new TypeUsage(typeName);
            tu.setDeclaration(getType(typeName));
            ctor.addParameter(new VariableDeclaration(tu, "p" + i, true));
        }
    }

    //
    //functions-----------------------------------------------------------------
    //
    private static void loadFunctions() {
        loadDocument(XML_FUNCTIONS);
        NodeList eFuncs = doc.getElementsByTagName("function");
        for (int i = 0; i < eFuncs.getLength(); i++) {
            Element eFunc = (Element) eFuncs.item(i);
            Function func = createFunction(eFunc);
            FUNCTIONS.add(func);
        }
    }

    private static Function createFunction(Element eFunc) {
        Function func = new Function();
        setReturnType(eFunc, func);
        setSignature(func, eFunc);
        func.setBuiltIn(true);
        return func;
    }

    private static void setSignature(Function func, Element eFunc) {
        String name = eFunc.getElementsByTagName("name").item(0).getTextContent();
        func.setName(name);
        NodeList eParams = eFunc.getElementsByTagName("parameter");
        for (int i = 0; i < eParams.getLength(); i++) {
            setFunctionParameter(func, (Element) eParams.item(i));
        }
    }

    private static void setFunctionParameter(Function func, Element eFunc) {
        String paramType = eFunc.getElementsByTagName("parameter-type").item(0).getTextContent();
        String paramName = eFunc.getElementsByTagName("parameter-name").item(0).getTextContent();
        TypeUsage tu = new TypeUsage(paramType);
        tu.setDeclaration(getType(paramType));
        tu.setArrayDepth(eFunc.getElementsByTagName("array").getLength() != 0 ? 1 : 0);
        VariableDeclaration vd = new VariableDeclaration(tu, paramName, true);
        func.addParameter(vd);
    }

    //
    //variables-----------------------------------------------------------------
    //
    private static void loadVariables() {
        loadDocument(XML_VARIABLES);
        NodeList eVars = doc.getElementsByTagName("variable");
        for (int i = 0; i < eVars.getLength(); i++) {
            Element eVar = (Element) eVars.item(i);
            VariableDeclaration vd = createVariableDeclaration(eVar);
            VARIABLES.put(vd.getName(), vd);
        }
    }

    private static VariableDeclaration createVariableDeclaration(Element eVar) {
        String typeName = eVar.getElementsByTagName("type").item(0).getTextContent();
        boolean array = eVar.getElementsByTagName("array").getLength() != 0;
        TypeUsage tu = new TypeUsage(typeName, array ? 1 : 0);
        tu.setDeclaration(getType(typeName));
        String name = eVar.getElementsByTagName("name").item(0).getTextContent();
        return new VariableDeclaration(tu, name, true);
    }

    //
    //types---------------------------------------------------------------------
    //
    private static void loadTypes() {
        loadDocument(XML_TYPES);
        loadTypes(TypeCategory.TRANSPARENT);
        loadTypes(TypeCategory.FLOATING_POINT_OPAQUE);
        loadTypes(TypeCategory.SIGNED_INTEGER_OPAQUE);
        loadTypes(TypeCategory.UNSIGNED_INTEGER_OPAQUE);
        loadTypes(TypeCategory.CUSTOM);
    }

    private static void loadTypes(TypeCategory typeCategory) {
        NodeList eTypeCat = doc.getElementsByTagName(typeCategory.getXmlName());
        NodeList eTypes = ((Element) eTypeCat.item(0)).getElementsByTagName("type");
        for (int i = 0; i < eTypes.getLength(); i++) {
            Element eType = (Element) eTypes.item(i);
            addType(typeCategory, eType);
        }
    }

    private static void addType(TypeCategory typeCategory, Element eType) {
        String typeName = eType.getElementsByTagName("name").item(0).getTextContent();
        TypeDeclaration td = new TypeDeclaration(typeName, true, typeCategory);
        addTranparentSpecificTypeData(td, eType);
        addCustomSpecificTypeData(td, eType);
        TYPES.put(typeName, td);
    }

    private static void addTranparentSpecificTypeData(TypeDeclaration td, Element eType) {
        if (td.getTypeCategory() == TypeCategory.TRANSPARENT) {
            td.setWidth(Integer.parseInt(eType.getElementsByTagName("width").item(0).getTextContent()));
            td.setHeight(Integer.parseInt(eType.getElementsByTagName("height").item(0).getTextContent()));
            td.setTypeBase(TypeBase.valueOf(eType.getElementsByTagName("base").item(0).getTextContent().toUpperCase()));
        }
    }

    private static void addCustomSpecificTypeData(TypeDeclaration td, Element eType) {
        if (td.getTypeCategory() == TypeCategory.CUSTOM) {
            NodeList eMembers = eType.getElementsByTagName("member");
            for (int i = 0; i < eMembers.getLength(); i++) {
                Element eMember = (Element) eMembers.item(i);
                addTypeMember(td, eMember);
            }
        }
    }

    private static void addTypeMember(TypeDeclaration td, Element eMember) {
        TypeUsage tu = new TypeUsage(eMember.getElementsByTagName("member-type").item(0).getTextContent());
        tu.setArrayDepth(eMember.getElementsByTagName("array").getLength() != 0 ? 1 : 0);
        tu.setDeclaration(getType(tu.getName()));
        VariableDeclaration vd = new VariableDeclaration(tu, eMember.getElementsByTagName("member-name").item(0).getTextContent(), true);
        td.addMember(vd);
    }

    //
    //keywords------------------------------------------------------------------
    //
    private static void loadKeywords() {
        loadDocument(XML_KEYWORDS);
        NodeList eKeyws = doc.getElementsByTagName("keyword");
        for (int i = 0; i < eKeyws.getLength(); i++) {
            Element eKeys = (Element) eKeyws.item(i);
            KEYWORDS.add(new Keyword(eKeys.getTextContent()));
        }
    }

    //
    //qualifiers----------------------------------------------------------------
    //
    private static void loadQualifiers() {
        loadDocument(XML_QUALIFIERS);
        NodeList eQuals = doc.getElementsByTagName("qualifier");
        for (int i = 0; i < eQuals.getLength(); i++) {
            Element eQual = (Element) eQuals.item(i);
            String name = eQual.getTextContent();
            QUALIFIERS.put(name, new Qualifier(name));
        }
    }

    private static void loadQualifierRules() {
        loadDocument(XML_QUALIFIER_RULES);
        NodeList eQualRules = doc.getElementsByTagName("qualifier-rule");
        for (int i = 0; i < eQualRules.getLength(); i++) {
            Element eQualRule = (Element) eQualRules.item(i);
            addQualifierRule(eQualRule);
        }
    }

    private static void addQualifierRule(Element eQualRule) {
        Set<Qualifier> qualRule = new HashSet<>();
        addQualifiersToRule(qualRule, eQualRule);
        QUALIFIER_RULES.add(qualRule);
    }

    private static void addQualifiersToRule(Set<Qualifier> qualRule, Element eQualRule) {
        NodeList qQuals = eQualRule.getElementsByTagName("qualifier");
        for (int i = 0; i < qQuals.getLength(); i++) {
            Element eQual = (Element) qQuals.item(i);
            String name = eQual.getTextContent();
            Qualifier qu = getQualifier(name);
            qualRule.add(qu);
        }
    }

    //
    //implicit conversions------------------------------------------------------
    //
    private static void loadImplicitConversions() {
        loadDocument(XML_IMPLICIT_CONVERSIONS);
        NodeList eConvs = doc.getElementsByTagName("conversion");
        for (int i = 0; i < eConvs.getLength(); i++) {
            Element eConv = (Element) eConvs.item(i);
            TypeDeclaration from = getTypeFromType(eConv);
            setConversions(from, eConv);
        }
    }

    private static TypeDeclaration getTypeFromType(Element eConv) {
        Element eFrom = (Element) eConv.getElementsByTagName("from").item(0);
        String name = ((Element) eFrom.getElementsByTagName("name").item(0)).getTextContent();
        return getType(name);
    }

    private static void setConversions(TypeDeclaration from, Element eConv) {
        Element eTo = ((Element) eConv.getElementsByTagName("to").item(0));
        NodeList eNames = eTo.getElementsByTagName("name");
        for (int i = 0; i < eNames.getLength(); i++) {
            String toName = ((Element) eNames.item(i)).getTextContent();
            TypeDeclaration to = getType(toName);
            from.addImplicitConversion(to);
        }
    }

    //
    //misc----------------------------------------------------------------------
    //
    public static List<Function> getFunctions() {
        return Collections.unmodifiableList(FUNCTIONS);
    }

    public static Map<String, VariableDeclaration> getVariables() {
        return Collections.unmodifiableMap(VARIABLES);
    }

    public static VariableDeclaration getVariable(String name) {
        return VARIABLES.get(name);
    }

    public static Map<String, TypeDeclaration> getTypes() {
        return Collections.unmodifiableMap(TYPES);
    }

    public static TypeDeclaration getType(String name) {
        return TYPES.get(name);
    }

    public static List<Keyword> getKeywords() {
        return Collections.unmodifiableList(KEYWORDS);
    }

    public static Map<String, Qualifier> getQualfiers() {
        return QUALIFIERS;
    }

    public static Qualifier getQualifier(String name) {
        return QUALIFIERS.get(name);
    }

    public static List<Set<Qualifier>> getQualifierRules() {
        return QUALIFIER_RULES;
    }

}
