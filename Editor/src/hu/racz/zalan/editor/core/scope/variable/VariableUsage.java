package hu.racz.zalan.editor.core.scope.variable;

import hu.racz.zalan.editor.core.scope.*;

public class VariableUsage extends Element {

    private VariableDeclaration declaration;

    public VariableDeclaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(VariableDeclaration declaration) {
        this.declaration = declaration;
    }

}
