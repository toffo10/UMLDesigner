package com.ent.umldesigner

import compiler.Parser
import javafx.fxml.FXML
import javafx.scene.control.TextArea

class HelloController {
    @FXML
    private lateinit var umlTextArea: TextArea

    @FXML
    private lateinit var resultArea: TextArea

    @FXML
    private fun convertUml() {
        Parser.doParsing(umlTextArea.text);
        resultArea.text = Parser.sb.toString()
    }
}