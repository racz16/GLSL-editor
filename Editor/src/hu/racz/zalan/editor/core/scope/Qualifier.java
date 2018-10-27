package hu.racz.zalan.editor.core.scope;

import java.util.*;

public class Qualifier {

    private static final Map<String, Qualifier> QUALIFIERS = new HashMap<>();
    private static final List<Set<Qualifier>> MAX_ONE_ALLOWED = new ArrayList<>();

    private final String name;
    
    //TODO: le kéne származni az elementből
    //+ enum

    static {
        //TODO: ezt az xml-ből kéne betölteni
        Qualifier q_const = new Qualifier("const");
        Qualifier q_in = new Qualifier("in");
        Qualifier q_out = new Qualifier("out");
        Qualifier q_inout = new Qualifier("inout");
        Qualifier q_lowp = new Qualifier("lowp");
        Qualifier q_mediump = new Qualifier("mediump");
        Qualifier q_highp = new Qualifier("highp");
        Qualifier q_coherent = new Qualifier("coherent");
        Qualifier q_volatile = new Qualifier("volatile");
        Qualifier q_restrict = new Qualifier("restrict");
        Qualifier q_readonly = new Qualifier("readonly");
        Qualifier q_writeonly = new Qualifier("writeonly");

        MAX_ONE_ALLOWED.add(new HashSet(Arrays.asList(q_in, q_out, q_inout)));
        MAX_ONE_ALLOWED.add(new HashSet(Arrays.asList(q_lowp, q_mediump, q_highp)));
        MAX_ONE_ALLOWED.add(new HashSet(Arrays.asList(q_const, q_out)));
        MAX_ONE_ALLOWED.add(new HashSet(Arrays.asList(q_const, q_inout)));
    }

    private Qualifier(String name) {
        this.name = name;
        QUALIFIERS.put(name, this);
    }

    public String getName() {
        return name;
    }

    public static boolean areCompatible(Qualifier q1, Qualifier q2) {
        if (q1 == q2) {
            return false;
        }
        for (Set<Qualifier> qs : MAX_ONE_ALLOWED) {
            if (qs.contains(q1) && qs.contains(q2)) {
                return false;
            }
        }
        return true;
    }

    public static Qualifier getQualifier(String name) {
        return QUALIFIERS.get(name);
    }

}
