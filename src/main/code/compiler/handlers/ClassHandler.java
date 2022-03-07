package compiler.handlers;

import java.util.Hashtable;

public class ClassHandler {

    private Hashtable<String, Class> classes;

    public ClassHandler() {
        classes = new Hashtable<>();
    }

    public Hashtable<String, Class> getClasses() {
        return classes;
    }
}
