package com.ent.umldesigner.compiler;

import com.ent.umldesigner.compiler.error.Error;
import com.ent.umldesigner.compiler.generated.UmlDesignerParser;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private static UmlDesignerParser parser;

    public static List<Error> doParsing(String input) {
        List<Error> errorList = new ArrayList<>();

        try {
            parser = new UmlDesignerParser(input);
            parser.initUml();
        } catch (Exception e) {
            errorList.add(new Error(e.getMessage()));
        }

        errorList.addAll(parser.getErrorList());
        return errorList;
    }
}
