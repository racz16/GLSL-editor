package hu.racz.zalan.editor.folding;

import java.util.*;
import org.netbeans.api.editor.fold.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.spi.editor.fold.*;

@MimeRegistration(mimeType = "text/x-glsl", service = FoldTypeProvider.class)
public class GlslFoldTypeProvider implements FoldTypeProvider {

    @Override
    public Collection<FoldType> getValues(Class type) {
        if (type == FoldType.class) {
            return Arrays.asList(FoldType.COMMENT, FoldType.DOCUMENTATION);
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public boolean inheritable() {
        return false;
    }
}
