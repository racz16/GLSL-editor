package hu.racz.zalan.editor.core.scope;

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

    private static final String XML_PATH = "src\\hu\\racz\\zalan\\editor\\core\\scope\\res\\builtin.xml";

    private static final List<FunctionPrototype> FUNCTIONS = new ArrayList<>();
    private static final Map<String, VariableDeclaration> VARIABLES = new HashMap<>();
    private static final Map<String, TypeDeclaration> TYPES = new HashMap<>();
    private static final List<Keyword> KEYWORDS = new ArrayList<>();

    private static Document doc;

    static {
        try {
            initialize();
            loadBuiltinElements();
        } catch (IOException | ParserConfigurationException | DOMException | SAXException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private static void initialize() throws ParserConfigurationException, SAXException, IOException {
        File inputFile = new File(XML_PATH);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
    }

    private static void loadBuiltinElements() {
        loadKeywords();
        loadTypes();
        loadVariables();
        loadFunctions();
    }

    private static void loadFunctions() {
        NodeList nList = doc.getElementsByTagName("function");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element element = (Element) nList.item(temp);
            FunctionPrototype function = createFunctionPrototype(element);
            FUNCTIONS.add(function);
        }
    }

    private static FunctionPrototype createFunctionPrototype(Element element) {
        FunctionPrototype function = new FunctionPrototype();
        setReturnType(element, function);
        setSignature(element, function);
        function.setBuiltIn(true);
        return function;
    }

    private static void setReturnType(Element element, FunctionPrototype function) {
        String typeName = element.getElementsByTagName("type").item(0).getTextContent();
        TypeUsage type = typeName.equals("void") ? TypeUsage.VOID : new TypeUsage(typeName);
        function.setReturnType(type);
    }

    private static void setSignature(Element element, FunctionPrototype function) {
        String name = element.getElementsByTagName("name").item(0).getTextContent();
        String params = element.getElementsByTagName("parameters").item(0).getTextContent();
        function.setName(name);
        function.setBuiltInParameters(params);
    }

    private static void loadVariables() {
        NodeList nList = doc.getElementsByTagName("variable");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element element = (Element) nList.item(temp);
            VariableDeclaration variable = createVariableDeclaration(element);
            VARIABLES.put(variable.getName(), variable);
        }
    }

    private static VariableDeclaration createVariableDeclaration(Element element) {
        String typeName = element.getElementsByTagName("type").item(0).getTextContent();
        TypeUsage type = new TypeUsage(typeName);
        type.setDeclaration(getType(typeName));
        String name = element.getElementsByTagName("name").item(0).getTextContent();
        boolean array = element.getElementsByTagName("array").getLength() != 0;
        return new VariableDeclaration(type, name, true, array);
    }

    private static void loadTypes() {
        NodeList nList = doc.getElementsByTagName("type");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element element = (Element) nList.item(temp);
            String name = element.getTextContent();
            TYPES.put(name, new TypeDeclaration(name, true));
        }
    }

    private static void loadKeywords() {
        NodeList nList = doc.getElementsByTagName("keyword");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Element element = (Element) nList.item(temp);
            KEYWORDS.add(new Keyword(element.getTextContent()));
        }
    }

    public static List<FunctionPrototype> getFunctions() {
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

}
