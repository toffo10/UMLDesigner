package compiler.util;

import compiler.Parser;

import java.util.Hashtable;

public class Component {
    private final Hashtable<String, Method> methods;
    private final Hashtable<String, Param> params;
    private final ComponentBehaviour componentBehaviour;
    private final String name;

    public Component(String name, ComponentBehaviour componentBehaviour) {
        this.name = name;
        this.componentBehaviour = componentBehaviour;
        methods = new Hashtable<>();
        params = new Hashtable<>();
    }

    public void addParam(Param param) {
        if (params.containsKey(param.getId())) {
            Parser.sb.append(String.format("Il parametro %s è già stato dichiarato \n", param.getId()));
        } else {
            params.put(param.getId(), param);
        }
    }

    public void addMethod(Method method) {
        if (params.containsKey(method.getId())) {
            Parser.sb.append(String.format("Il metodo %s è già stato dichiarato \n", method.getId()));
        } else {
            methods.put(method.getId(), method);
        }
    }

    public ComponentBehaviour getComponentBehaviour() {
        return componentBehaviour;
    }

    public ComponentType getComponentType() {
        if (componentBehaviour instanceof ClassBehaviour)
            return ComponentType.CLASS;
        else if (componentBehaviour instanceof InterfaceBehaviour)
            return ComponentType.INTERFACE;

        return ComponentType.CLASS;
    }

    public String getName() {
        return name;
    }
}
