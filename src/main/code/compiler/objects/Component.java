package compiler.objects;

import compiler.enums.ComponentType;
import compiler.error.SemanticException;
import compiler.objects.behaviour.ClassBehaviour;
import compiler.objects.behaviour.ComponentBehaviour;
import compiler.objects.behaviour.InterfaceBehaviour;
import org.antlr.runtime.Token;

import java.util.Hashtable;
import java.util.Map;

public class Component {
    private final Map<String, Method> methods;
    private final Map<String, Param> params;
    private final ComponentBehaviour componentBehaviour;
    private final String name;
    private Token token;

    public Component(Token token, String name, ComponentBehaviour componentBehaviour) {
        this.name = name;
        this.componentBehaviour = componentBehaviour;
        this.token = token;
        methods = new Hashtable<>();
        params = new Hashtable<>();
    }

    public void addParam(Token id, Param param) throws SemanticException {
        if (params.containsKey(param.getId())) {
            throw new SemanticException(String.format("Parameter %s already declared", param.getId()), id);
        } else {
            params.put(param.getId(), param);
        }
    }

    public void addMethod(Token id, Method method) throws SemanticException {
        if (params.containsKey(method.getId())) {
            throw new SemanticException(String.format("Method %s already declared", method.getId()), id);
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

    public Token getToken() {
        return token;
    }
}
