package hu.racz.zalan.editor.core.scope.qualifier;

import hu.racz.zalan.editor.core.scope.*;

public class QualifierUsage extends Element {

    private Qualifier qualifier;

    public QualifierUsage(String name) {
        super(name);
    }

    public Qualifier getQualifier() {
        return qualifier;
    }

    public void setQualifier(Qualifier qualifier) {
        this.qualifier = qualifier;
    }

    @Override
    public boolean equals(Object obj) {
        QualifierUsage qu = (QualifierUsage) obj;
        return getName().equals(qu.getName());
    }

}
