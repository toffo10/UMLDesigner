package com.ent.umldesigner.compiler.objects;

import com.ent.umldesigner.compiler.enums.ComponentType;
import com.ent.umldesigner.compiler.error.SemanticException;
import com.ent.umldesigner.compiler.objects.behaviour.ClassBehaviour;
import com.ent.umldesigner.compiler.objects.behaviour.ComponentBehaviour;
import com.ent.umldesigner.compiler.objects.behaviour.InterfaceBehaviour;
import org.antlr.runtime.Token;

import java.util.LinkedHashMap;
import java.util.Map;

public class Component {
    private final Map<String, Method> methods;
    private final Map<String, Param> params;
    private final ComponentBehaviour componentBehaviour;
    private final String name;
    private final Token token;

    public Component(Token token, String name, ComponentBehaviour componentBehaviour) {
        this.name = name;
        this.componentBehaviour = componentBehaviour;
        this.token = token;
        methods = new LinkedHashMap<>();
        params = new LinkedHashMap<>();
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
