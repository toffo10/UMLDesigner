package compiler;

import compiler.enums.ERROR_TYPE;
import compiler.error.Error;
import compiler.generated.UmlDesignerParser;
import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    static UmlDesignerParser parser;

    private static List<Error> errorList = new ArrayList<>();

    public static void addError(String errorMessage, Token e) {
        String msg = "";
        Error error = new Error();
        error.setType(ERROR_TYPE.SEMANTICS);
        msg = "Semantics error at row " + (e.getLine() + 1) + ": " + errorMessage;

        if (e instanceof MissingTokenException)
            msg = msg + errorMessage;

        error.setMessage(msg);
        errorList.add(error);
    }

    public static StringBuffer doParsing(String input) {
        StringBuffer errorMessage = new StringBuffer();
        errorList.clear();

        try {
            parser = new UmlDesignerParser(input);
            parser.initUml();
        } catch (Exception e) {
        }

        if (parser.getErrorList().isEmpty() && errorList.isEmpty()) {
            errorMessage.append("Everything ok! \n");
        } else {
            errorMessage.insert(0, "Compilation ended with errors: \n");

            if (!parser.getErrorList().isEmpty()) {
                errorList.clear();
                errorList.addAll(parser.getErrorList());
            }
        }

        errorList.forEach(error -> {
            errorMessage.append(error.getMessage() + "\n");
        });

        return errorMessage;
    }

    public static List<Error> getErrorList() {
        return errorList;
    }
}
