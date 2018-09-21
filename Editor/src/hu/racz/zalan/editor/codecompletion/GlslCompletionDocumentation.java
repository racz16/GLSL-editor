package hu.racz.zalan.editor.codecompletion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Action;
import org.netbeans.spi.editor.completion.CompletionDocumentation;
import org.openide.util.Exceptions;

public class GlslCompletionDocumentation implements CompletionDocumentation {

    private GlslCompletionItem item;

    public GlslCompletionDocumentation(GlslCompletionItem item) {
        this.item = item;
    }

    @Override
    public String getText() {
        String result = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL("https://www.khronos.org/registry/OpenGL-Refpages/gl4/html/texture.xhtml").openStream()))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                result += line;
            }
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            return "There is no internet connection";
        }
        if (!result.isEmpty()) {
            int start = result.indexOf("<body>") + 6;
            int end = result.indexOf("</body>");
            result = result.substring(start, end);
        }
        return result;
    }

    @Override
    public URL getURL() {
        try {
            return new URL("https://www.khronos.org/registry/OpenGL-Refpages/gl4/html/texture.xhtml");
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
        return null;
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
