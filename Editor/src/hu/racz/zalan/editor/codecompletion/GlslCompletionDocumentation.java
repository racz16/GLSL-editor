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

    private URL docUrl;
    private String elementName;

    public GlslCompletionDocumentation(String elementName) {
        this.elementName = elementName;
        docUrl = null;
        try {
            docUrl = new URL("https://www.khronos.org/registry/OpenGL-Refpages/gl4/html/" + elementName + ".xhtml");
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @Override
    public String getText() {
        String result = DOCUMENTATION_CACHE.get(elementName);
        if (result == null) {
            result = loadDocumentation();
        }
        return result;
    }

    private String loadDocumentation() {
        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(docUrl.openStream()))) {
            readDocumentation(result, br);
        } catch (IOException ex) {
            return "Not found";
        }
        return transformDocumentationToNetbeansCompatible(result);
    }

    private void readDocumentation(StringBuilder result, BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            result.append(line);
        }
    }

    private String transformDocumentationToNetbeansCompatible(StringBuilder documentation) {
        documentation = selectHtmlBody(documentation);
        replaceNetbeansIncompatibleCharacters(documentation);
        String result = documentation.toString();
        DOCUMENTATION_CACHE.put(elementName, result);
        return result;
    }

    private StringBuilder selectHtmlBody(StringBuilder documentation) {
        int start = documentation.indexOf("<body>") + 6;
        int end = documentation.indexOf("</body>");
        return new StringBuilder(documentation.substring(start, end));
    }

    private void replaceNetbeansIncompatibleCharacters(StringBuilder documentation) {
        Utility.replaceAll(documentation, Pattern.compile("â€”"), "-");
        Utility.replaceAll(documentation, Pattern.compile("Â"), "");
        Utility.replaceAll(documentation, Pattern.compile("âś”"), "+");
    }

    @Override
    public URL getURL() {
        return docUrl;
    }

    @Override
    public CompletionDocumentation resolveLink(String string) {
        return null;
    }

    @Override
    public Action getGotoSourceAction() {
        return null;
    }

}
