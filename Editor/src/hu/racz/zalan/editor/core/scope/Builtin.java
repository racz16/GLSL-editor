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

    private static final List<Function> FUNCTIONS = new ArrayList<>();
    private static final Map<String, VariableDeclaration> VARIABLES = new HashMap<>();
    private static final Map<String, TypeDeclaration> TYPES = new HashMap<>();
    private static final List<Keyword> KEYWORDS = new ArrayList<>();
    private static final Map<String, Qualifier> QUALIFIERS = new HashMap<>();
    private static final List<Set<Qualifier>> QUALIFIER_RULES = new ArrayList<>();

    private static Document doc;

    static {
        try {
            loadKeywords();
            loadQualifiers();
            loadTypes();
            loadVariables();
            loadFunctions();
            loadImplicitConversions();
            loadQualifierRules();
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

    //
    //functions-----------------------------------------------------------------
    //
    private static void loadFunctions() {
        loadDocument(XML_FUNCTIONS);
        NodeList nList = doc.getElementsByTagName("function");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element element = (Element) nList.item(temp);
            Function function = createFunction(element);
            FUNCTIONS.add(function);
        }
    }

    private static Function createFunction(Element element) {
        Function function = new Function();
        setReturnType(element, function);
        setSignature(element, function);
        function.setBuiltIn(true);
        return function;
    }

    private static void setReturnType(Element element, Function function) {
        String typeName = element.getElementsByTagName("type").item(0).getTextContent();
        TypeUsage type = new TypeUsage(typeName);
        function.setReturnType(type);
    }

    private static void setSignature(Element element, Function function) {
        String name = element.getElementsByTagName("name").item(0).getTextContent();
        String params = element.getElementsByTagName("parameters").item(0).getTextContent();
        function.setName(name);
        function.setBuiltInParameters(params);
    }

    //
    //variables-----------------------------------------------------------------
    //
    private static void loadVariables() {
        loadDocument(XML_VARIABLES);
        NodeList nList = doc.getElementsByTagName("variable");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element element = (Element) nList.item(temp);
            VariableDeclaration variable = createVariableDeclaration(element);
            VARIABLES.put(variable.getName(), variable);
        }
    }

    private static VariableDeclaration createVariableDeclaration(Element element) {
        String typeName = element.getElementsByTagName("type").item(0).getTextContent();
        boolean array = element.getElementsByTagName("array").getLength() != 0;
        TypeUsage type = new TypeUsage(typeName, array, TypeUsage.ARRAY_SIZE_DONT_CARE);
        type.setDeclaration(getType(typeName));
        String name = element.getElementsByTagName("name").item(0).getTextContent();
        return new VariableDeclaration(type, name, true);
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
    }

    private static void loadTypes(TypeCategory typeCategory) {
        NodeList tnList = doc.getElementsByTagName(typeCategory.getXmlName());
        NodeList nList = ((Element) tnList.item(0)).getElementsByTagName("type");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element element = (Element) nList.item(temp);
            addType(element, typeCategory);
        }
    }

    private static void addType(Element element, TypeCategory typeCategory) {
        String name = element.getElementsByTagName("name").item(0).getTextContent();
        TypeDeclaration td = new TypeDeclaration(name, true, typeCategory);
        if (typeCategory == TypeCategory.TRANSPARENT) {
            addTranparentSpecificTypeData(td, element);
        }
        TYPES.put(name, td);
    }

    private static void addTranparentSpecificTypeData(TypeDeclaration td, Element element) {
        td.setWidth(Integer.parseInt(element.getElementsByTagName("width").item(0).getTextContent()));
        td.setHeight(Integer.parseInt(element.getElementsByTagName("height").item(0).getTextContent()));
        td.setTypeBase(TypeBase.valueOf(element.getElementsByTagName("base").item(0).getTextContent().toUpperCase()));
    }

    //
    //keywords------------------------------------------------------------------
    //
    private static void loadKeywords() {
        loadDocument(XML_KEYWORDS);
        NodeList nList = doc.getElementsByTagName("keyword");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element element = (Element) nList.item(temp);
            KEYWORDS.add(new Keyword(element.getTextContent()));
        }
    }

    //
    //qualifiers----------------------------------------------------------------
    //
    private static void loadQualifiers() {
        loadDocument(XML_QUALIFIERS);
        NodeList nList = doc.getElementsByTagName("qualifier");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element element = (Element) nList.item(temp);
            String name = element.getTextContent();
            QUALIFIERS.put(name, new Qualifier(name));
        }
    }

    private static void loadQualifierRules() {
        loadDocument(XML_QUALIFIER_RULES);
        NodeList nList = doc.getElementsByTagName("qualifier-rule");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element element = (Element) nList.item(temp);
            addRule(element);
        }
    }

    private static void addRule(Element element) {
        Set<Qualifier> rule = new HashSet<>();
        addQualifiersToRule(element, rule);
        QUALIFIER_RULES.add(rule);
    }

    private static void addQualifiersToRule(Element element, Set<Qualifier> rule) {
        NodeList nList = element.getElementsByTagName("qualifier");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element q = (Element) nList.item(temp);
            String name = q.getTextContent();
            Qualifier qu = getQualfiers().get(name);
            rule.add(qu);
        }
    }

    //
    //implicit conversions------------------------------------------------------
    //
    private static void loadImplicitConversions() {
        loadDocument(XML_IMPLICIT_CONVERSIONS);
        NodeList nList = doc.getElementsByTagName("conversion");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element element = (Element) nList.item(temp);
            TypeDeclaration from = getTypeFromType(element);
            setConversions(from, element);
        }
    }

    private static TypeDeclaration getTypeFromType(Element element) {
        Element fromNode = (Element) element.getElementsByTagName("from").item(0);
        String name = ((Element) fromNode.getElementsByTagName("name").item(0)).getTextContent();
        return getType(name);
    }

    private static void setConversions(TypeDeclaration from, Element element) {
        Element toNode = ((Element) element.getElementsByTagName("to").item(0));
        NodeList nl = toNode.getElementsByTagName("name");
        for (int i = 0; i < nl.getLength(); i++) {
            String toName = ((Element) nl.item(i)).getTextContent();
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
