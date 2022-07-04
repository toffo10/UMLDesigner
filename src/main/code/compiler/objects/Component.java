package compiler.objects;

import compiler.Parser;
import compiler.enums.ComponentType;
import compiler.enums.ERROR_TYPE;
import compiler.objects.behaviour.ClassBehaviour;
import compiler.objects.behaviour.ComponentBehaviour;
import compiler.objects.behaviour.InterfaceBehaviour;

import java.util.Hashtable;
import java.util.Map;

public class Component {
    private final Map<String, Method> methods;
    private final Map<String, Param> params;
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
            Parser.addError(String.format("Parameter %s already declared \n", param.getId()), ERROR_TYPE.SEMANTICS);
        } else {
            params.put(param.getId(), param);
        }
    }

    public void addMethod(Method method) {
        if (params.containsKey(method.getId())) {
            Parser.addError(String.format("Method %s already declared \n", method.getId()), ERROR_TYPE.SEMANTICS);
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

    public Map<String, Method> getMethods() {
        return methods;
    }

    public Map<String, Param> getParams() {
        return params;
    }
}
