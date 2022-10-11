package compiler.handlers;

import compiler.enums.ERROR_TYPE;
import compiler.error.Error;
import compiler.error.SemanticException;
import compiler.generated.UmlDesignerLexer;
import compiler.objects.Component;
import compiler.objects.Method;
import compiler.objects.MethodParam;
import compiler.objects.Param;
import compiler.objects.behaviour.ClassBehaviour;
import compiler.objects.behaviour.InterfaceBehaviour;
import javafx.util.Pair;
import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UmlHandler {
    private static HashMap<String, Component> components;
    private List<Error> errorList;

    public UmlHandler() {
        errorList = new ArrayList<>();
        components = new HashMap<>();
    }

    public void createNewInterface(Token id) {
        if (idAlreadyExists(id.getText())) {
            handleSemanticError(String.format("ID already existing: %s", id.getText()), id);
        } else
            components.put(id.getText(), new Component(id, id.getText(), new InterfaceBehaviour()));
    }

    public void createNewClass(Token id) {
        if (idAlreadyExists(id.getText())) {
            handleSemanticError(String.format("ID already existing: %s", id.getText()), id);
        } else
            components.put(id.getText(), new Component(id, id.getText(), new ClassBehaviour()));
    }

    public void addParams(Token id, Param p) {
        try {
            components.get(id.getText()).addParam(id, p);
        } catch (SemanticException s) {
            handleSemanticError(s.getMessage(), s.getErrorToken());
        }
    }

    public void addMethod(Token id, Method method) {
        try {
            components.get(id.getText()).addMethod(id, method);
        } catch (SemanticException s) {
            handleSemanticError(s.getMessage(), s.getErrorToken());
        }
    }

    public void addMethodParam(List<MethodParam> list, String id, String type) {
        list.add(new MethodParam(id, type));
    }

    public void addImplementation(Token id, List<String> interfaces) {
        for (String ifs : interfaces) {
            try {
                components.get(id.getText()).getComponentBehaviour().addImplementation(id, ifs, components.get(ifs));
            } catch (SemanticException s) {
                handleSemanticError(s.getMessage(), s.getErrorToken());
            }
        }
    }

    private boolean idAlreadyExists(String id) {
        return components.containsKey(id);
    }

    public void setUpRelations() {
        for (Component component1 : components.values()) {
            for (Component component2 : components.values()) {
                try {
                    component1.getComponentBehaviour().setUpRelations(component1.getToken(), component2);
                } catch (SemanticException s) {
                    handleSemanticError(s.getMessage(), s.getErrorToken());
                }
            }
        }

        checkClassExistence();
    }

    private void checkClassExistence() {
        for (Component component : components.values()) {
            try {
                component.getComponentBehaviour().checkClassesExistence(component.getToken());
            } catch (SemanticException s) {
                handleSemanticError(s.getMessage(), s.getErrorToken());
            }
        }
    }

    public Param returnParam(String id, String visibility, String type) {
        return new Param(id, visibility, type);
    }

    public Method returnMethod(Token visibility, Token id, String type, List<MethodParam> methodParams) {
        String typeString;
        if (type == null)
            typeString = "void";
        else
            typeString = type;

        Method method = new Method(visibility.getText(), id.getText(), typeString);
        method.setMp(methodParams);
        return method;
    }

    public void addExtension(Token id, List<String> classList) {
        for (String ifs : classList) {
            components.get(id.getText()).getComponentBehaviour().addExtension(id, ifs, components.get(ifs));
        }
    }

    public void addRelations(Token id, List<Pair> classList) {
        for (Pair pair : classList) {
            components.get(id.getText()).getComponentBehaviour().addRelation(id, pair.getKey().toString(),
                    pair.getValue().toString(), components.get(pair.getKey()));
        }
    }

    public static List<Component> getComponents() {
        return components.values().stream().toList();
    }

    public void handleSemanticError(String errorMessage, Token e) {
        String msg = "";
        Error error = new Error();
        error.setType(ERROR_TYPE.SEMANTICS);
        msg = "Semantics error at row " + (e.getLine() + 1) + ": " + errorMessage;

        if (e instanceof MissingTokenException)
            msg = msg + errorMessage;

        error.setMessage(msg);
        errorList.add(error);
    }

    public void handleError(String[] tokenNames, RecognitionException e, String hdr, String m) {
        String type = "";
        String msg = "";
        Error error = new Error();
        if (e.token.getType() >= 0)
            type = tokenNames[e.token.getType()];
        if (e.token.getType() == UmlDesignerLexer.SCAN_ERROR) {
            error.setType(ERROR_TYPE.LEXICAL);
            msg = "Lexical Error at ";
        } else {
            error.setType(ERROR_TYPE.SYNTAX);
            msg = "Syntax Error at ";
        }

        msg += "[" + e.token.getLine() + ", " + (e.token.getCharPositionInLine() + 1) + "]: " +
                "Found ";
        msg += type;
        msg += " ('" + e.token.getText() + "')" + m;

        if (e instanceof MissingTokenException)
            msg = msg + m;

        error.setMessage(msg);
        errorList.add(error);
    }

    public List<Error> getErrorList() {
        return errorList;
    }
}
