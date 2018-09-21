package hu.racz.zalan.editor.indentation;

import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

@MimeRegistration(mimeType = "text/x-glsl", service = ReformatTask.Factory.class)
public class GlslReformatTaskFactory implements ReformatTask.Factory {

    @Override
    public ReformatTask createTask(Context cntxt) {
        return new GlslReformatTask(cntxt);
    }

}
