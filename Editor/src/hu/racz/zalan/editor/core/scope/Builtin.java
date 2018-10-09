package hu.racz.zalan.editor.core.scope;

import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.io.*;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.w3c.dom.Element;
import org.xml.sax.*;

public class Builtin {

    private static final String XML_PATH = "src\\hu\\racz\\zalan\\editor\\core\\scope\\res\\builtin.xml";

    private static final List<FunctionPrototype> FUNCTIONS = new ArrayList<>();
    private static final Map<String, VariableDeclaration> VARIABLES = new HashMap<>();
    private static final Map<String, TypeDeclaration> TYPES = new HashMap<>();
    private static final List<Keyword> KEYWORDS = new ArrayList<>();

    static {

        try {
            File inputFile = new File(XML_PATH);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            loadKeywords(doc);
            loadTypes(doc);
            loadVariables(doc);
            loadFunctions(doc);

        } catch (IOException | ParserConfigurationException | DOMException | SAXException e) {
        }
    }

    private static void loadFunctions(Document doc) {
        NodeList nList = doc.getElementsByTagName("function");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                String typeName = eElement.getElementsByTagName("type").item(0).getTextContent();
                TypeUsage type;
                if (typeName.equals("void")) {
                    type = TypeUsage.VOID;
                } else {
                    type = new TypeUsage();
                    type.setName(typeName);
                }
                String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                String params = eElement.getElementsByTagName("parameters").item(0).getTextContent();

                FunctionPrototype function = new FunctionPrototype();
                function.setBuiltIn(true);
                function.setName(name);
                function.setReturnType(type);
                function.setBuiltInParameters(params);

                FUNCTIONS.add(function);
            }
        }
    }

    private static void loadVariables(Document doc) {
        NodeList nList = doc.getElementsByTagName("variable");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                String typeName = eElement.getElementsByTagName("type").item(0).getTextContent();
                TypeDeclaration type = getType(typeName);
                String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                boolean array = eElement.getElementsByTagName("array").getLength() != 0;
                VARIABLES.put(name, new VariableDeclaration(type, name, true, array));
            }
        }
    }

    private static void loadTypes(Document doc) {
        NodeList nList = doc.getElementsByTagName("type");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                String name = eElement.getTextContent();
                TYPES.put(name, new TypeDeclaration(name, true));
            }
        }
    }

    private static void loadKeywords(Document doc) {
        NodeList nList = doc.getElementsByTagName("keyword");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                KEYWORDS.add(new Keyword(eElement.getTextContent()));
            }
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
