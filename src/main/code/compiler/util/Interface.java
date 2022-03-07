package compiler.util;

import java.util.Hashtable;

public class Interface {
    private Hashtable<String, Method> interfaceMethods;
    private Hashtable<String, Param> interfaceParams;

    public Interface() {
        interfaceParams = new Hashtable<>();
        interfaceMethods = new Hashtable<>();
    }

    public void addParam(Param param) {
        if (interfaceParams.containsKey(param.getId())) {
            System.out.printf("Il parametro %s è già stato dichiarato \n", param.getId());
        } else {
            interfaceParams.put(param.getId(), param);
        }
    }

    public void addMethod(Method method) {
        if (interfaceParams.containsKey(method.getId())) {
            System.out.printf("Il metodo %s è già stato dichiarato \n", method.getId());
        } else {
            interfaceMethods.put(method.getId(), method);
        }
    }
}
