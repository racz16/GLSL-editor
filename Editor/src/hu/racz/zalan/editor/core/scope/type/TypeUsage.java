package hu.racz.zalan.editor.core.scope.type;

import hu.racz.zalan.editor.core.scope.*;

public class TypeUsage extends Element {

    private TypeDeclaration declaration;

    public TypeDeclaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(TypeDeclaration declaration) {
        this.declaration = declaration;
    }
}
