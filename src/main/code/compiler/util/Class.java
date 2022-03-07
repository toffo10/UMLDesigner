package compiler.util;

import java.util.Hashtable;

public class Class {
    private Hashtable<String, Method> methods;
    private Hashtable<String, Param> params;

    public Class() {
        methods = new Hashtable<>();
        params = new Hashtable<>();
    }

    public void addParam(Param param) {
        params.put(param.getId(), param);
    }

    public void addMethod(Method method) {
        methods.put(method.getId(), method);
    }
}
