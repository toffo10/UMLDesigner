package compiler.handlers;

import compiler.util.Interface;
import compiler.util.Method;
import compiler.util.MethodParam;
import compiler.util.Param;
import org.antlr.runtime.Token;

import java.util.Hashtable;
import java.util.List;

public class InterfaceHandler {

    private Hashtable<String, Interface> interfaces;

    public InterfaceHandler() {
        this.interfaces = new Hashtable<>();
    }

    public Param returnParam(Token id, Token type) {
        return new Param(id.getText(), type.getText());
    }

    public void addInterfaceParams(Token id, Param p) {
        interfaces.get(id.getText()).addParam(p);
    }

    public Method returnMethod(Token id, Token type, List<MethodParam> methodParams) {
        String typeString;
        if (type == null)
            typeString = "void";
        else
            typeString = type.getText();

        Method method = new Method(id.getText(), typeString);
        method.setMp(methodParams);
        return method;
    }

    public void addInterfaceMethod(Token id, Method method) {
        interfaces.get(id.getText()).addMethod(method);
    }

    public void addInterfaceMethodParam(List<MethodParam> list, Token id, Token type) {
        list.add(new MethodParam(id.getText(), type.getText()));
    }

    public Hashtable<String, Interface> getInterfaces() {
        return interfaces;
    }
}
