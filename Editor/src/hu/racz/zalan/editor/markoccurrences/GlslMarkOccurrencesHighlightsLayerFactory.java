package hu.racz.zalan.editor.markoccurrences;

import javax.swing.text.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.spi.editor.highlighting.*;

@MimeRegistration(mimeType = "text/x-glsl", service = HighlightsLayerFactory.class)
public class GlslMarkOccurrencesHighlightsLayerFactory implements HighlightsLayerFactory {

    public static GlslMarkOccurrencesHighlighter getMarkOccurrencesHighlighter(Document doc) {
        GlslMarkOccurrencesHighlighter highlighter = (GlslMarkOccurrencesHighlighter) doc.getProperty(GlslMarkOccurrencesHighlighter.class);
        if (highlighter == null) {
            doc.putProperty(GlslMarkOccurrencesHighlighter.class, highlighter = new GlslMarkOccurrencesHighlighter(doc));
        }
        return highlighter;
    }

    @Override
    public HighlightsLayer[] createLayers(Context context) {
        return new HighlightsLayer[]{
            HighlightsLayer.create(
            GlslMarkOccurrencesHighlighter.class.getName(),
            ZOrder.SHOW_OFF_RACK,
            true,
            getMarkOccurrencesHighlighter(context.getDocument()).getHighlightsBag())
        };
    }
}
