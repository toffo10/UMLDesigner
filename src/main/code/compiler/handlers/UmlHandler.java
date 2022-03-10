package compiler.handlers;

import compiler.Parser;
import compiler.util.*;
import compiler.util.ClassBehaviour;
import javafx.util.Pair;
import org.antlr.runtime.Token;

import java.util.Hashtable;
import java.util.List;

public class UmlHandler {
    private static Hashtable<String, Component> components;

    public UmlHandler() {
        components = new Hashtable<>();
    }

    public void createNewInterface(Token id) {
        if (idAlreadyExists(id.getText()))
            Parser.sb.append(String.format("L'id %s esiste già \n", id.getText()));
        else
            components.put(id.getText(), new Component(id.getText(), new InterfaceBehaviour()));
    }

    public void createNewClass(Token id) {
        if (idAlreadyExists(id.getText()))
            Parser.sb.append(String.format("L'id %s esiste già \n", id.getText()));
        else
            components.put(id.getText(), new Component(id.getText(), new ClassBehaviour()));
    }

    public void addParams(Token id, Param p) {
        components.get(id.getText()).addParam(p);
    }

    public void addMethod(Token id, Method method) {
        components.get(id.getText()).addMethod(method);
    }

    public void addMethodParam(List<MethodParam> list, Token id, Token type) {
        list.add(new MethodParam(id.getText(), type.getText()));
    }

    public void addImplementation(Token id, List<String> interfaces) {
        for (String ifs : interfaces) {
            components.get(id.getText()).getComponentBehaviour().addImplementation(ifs, components.get(ifs));
        }
    }

    private boolean idAlreadyExists(String id) {
        return components.containsKey(id);
    }

    public void setUpRelations() {
        for (Component component1 : components.values()) {
            for (Component component2 : components.values()) {
                component1.getComponentBehaviour().setUpRelations(component2);
            }
        }

        checkClassExistence();
    }

    private void checkClassExistence() {
        for (Component component : components.values()) {
            component.getComponentBehaviour().checkClassesExistence();
        }
    }

    public Param returnParam(Token id, Token type) {
        return new Param(id.getText(), type.getText());
    }

    public Method returnMethod(Token visibility, Token id, Token type, List<MethodParam> methodParams) {
        String typeString;
        if (type == null)
            typeString = "void";
        else
            typeString = type.getText();

        Method method = new Method(visibility.getText(), id.getText(), typeString);
        method.setMp(methodParams);
        return method;
    }

    public void addExtension(Token id, List<String> classList) {
        for (String ifs : classList) {
            components.get(id.getText()).getComponentBehaviour().addExtension(ifs, components.get(ifs));
        }
    }

    public void addRelations(Token id, List<Pair> classList) {
        for (Pair pair : classList) {
            components.get(id.getText()).getComponentBehaviour().addRelation(pair.getKey().toString(),
                    pair.getValue().toString(), components.get(pair.getKey()));
        }
    }

    public static List<Component> getComponents() {
        return components.values().stream().toList();
    }
}
