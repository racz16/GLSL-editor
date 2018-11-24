package hu.racz.zalan.editor.core.scope.variable;

import hu.racz.zalan.editor.core.scope.*;

public class VariableUsage extends Element {

    private VariableDeclaration declaration;

    public VariableUsage(String name) {
        super(name);
    }

    public VariableDeclaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(VariableDeclaration declaration) {
        this.declaration = declaration;
    }

    @Override
    public boolean equals(Object obj) {
        VariableUsage vu = (VariableUsage) obj;
        return getDeclaration().equals(vu.getDeclaration());
    }

}
