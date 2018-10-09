package hu.racz.zalan.editor.codecompletion;

import hu.racz.zalan.editor.core.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;
import javax.swing.*;
import org.netbeans.spi.editor.completion.*;
import org.openide.util.*;

public class GlslCompletionDocumentation implements CompletionDocumentation {

    private static final HashMap<String, String> DOCUMENTATION_CACHE = new HashMap<>();

    private URL documentationUrl;
    private String elementName;

    public GlslCompletionDocumentation(String elementName) {
        this.elementName = elementName;
        try {
            documentationUrl = new URL("https://www.khronos.org/registry/OpenGL-Refpages/gl4/html/" + elementName + ".xhtml");
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @Override
    public String getText() {
        String result = DOCUMENTATION_CACHE.get(elementName);
        if (result == null) {
            result = loadDocumentation();
            DOCUMENTATION_CACHE.put(elementName, result);
        }
        return result;
    }

    private String loadDocumentation() {
        StringBuilder result;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(documentationUrl.openStream()))) {
            result = readDocumentation(br);
        } catch (IOException ex) {
            return "Not found";
        }
        return transformDocumentationToNetbeansCompatible(result);
    }

    private StringBuilder readDocumentation(BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            result.append(line);
        }
        return result;
    }

    private String transformDocumentationToNetbeansCompatible(StringBuilder doc) {
        StringBuilder documentation = selectHtmlBody(doc);
        replaceNetbeansIncompatibleCharacters(documentation);
        return documentation.toString();
    }

    private StringBuilder selectHtmlBody(StringBuilder documentation) {
        String startTag = "<body>";
        String endTag = "</body>";
        int start = documentation.indexOf(startTag) + startTag.length();
        int end = documentation.indexOf(endTag);
        return new StringBuilder(documentation.substring(start, end));
    }

    private void replaceNetbeansIncompatibleCharacters(StringBuilder documentation) {
        Utility.replaceAll(documentation, Pattern.compile("â€”"), "-");
        Utility.replaceAll(documentation, Pattern.compile("Â"), "");
        Utility.replaceAll(documentation, Pattern.compile("âś”"), "+");
    }

    @Override
    public URL getURL() {
        return documentationUrl;
    }

    @Override
    public CompletionDocumentation resolveLink(String link) {
        int xhtmlIndex = link.indexOf(".xhtml");
        if (xhtmlIndex > 0) {
            String name = link.substring(0, xhtmlIndex);
            return new GlslCompletionDocumentation(name);
        } else {
            return null;
        }
    }

    @Override
    public Action getGotoSourceAction() {
        return null;
    }

}
