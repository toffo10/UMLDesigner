package compiler;

import compiler.enums.ERROR_TYPE;
import compiler.error.Error;
import compiler.generated.UmlDesignerParser;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    static UmlDesignerParser parser;

    public static List<Error> errorList = new ArrayList<>();

    public static void addError(String errorMessage, ERROR_TYPE type) {
        Error e = new Error();
        e.setMessage(errorMessage);
        e.setType(type);

        errorList.add(e);
    }

    public static StringBuffer doParsing(String input) {
        StringBuffer errorMessage = new StringBuffer();
        errorList.clear();

        try {
            parser = new UmlDesignerParser(input);
            parser.initUml();
        } catch (Exception e) {
        }

        if (parser.getErrorList().isEmpty()) {
            errorMessage.append("Everything ok! \n");
        } else {
            errorMessage.insert(0, "Compilation ended with errors: \n");

            parser.getErrorList().forEach(error -> {
                errorList.add(error);
            });
        }

        errorList.forEach(error -> {
            errorMessage.append(error.getMessage() + "\n");
        });

        return errorMessage;
    }
}
