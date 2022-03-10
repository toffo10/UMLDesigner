package com.ent.umldesigner

import compiler.Parser
import compiler.handlers.UmlHandler
import compiler.util.Component
import compiler.util.ComponentType
import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.scene.Cursor
import javafx.scene.Group
import javafx.scene.control.TextArea
import javafx.scene.input.MouseEvent
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox
import javafx.scene.shape.Rectangle

class DrawingController {
    @FXML
    private lateinit var umlTextArea: TextArea

    @FXML
    private lateinit var resultArea: TextArea

    @FXML
    private lateinit var drawingArea: Pane

    var orgSceneX = 0.0
    var orgSceneY = 0.0

    @FXML
    private fun convertUml() {
        Parser.doParsing(umlTextArea.text);
        resultArea.text = Parser.sb.toString()

        drawUml();
    }

    private fun drawUml() {
        for (component in UmlHandler.getComponents()) {
            if (component.componentType.equals(ComponentType.CLASS)) {
                drawClass(component)
            }
        }
    }

    private fun drawClass(component: Component) {
        val umlClass = Rectangle(10.0, 10.0, 50.0, 50.0)
        umlClass.cursor = Cursor.HAND
        umlClass.onMousePressed = EventHandler { t: MouseEvent ->
            orgSceneX = t.sceneX
            orgSceneY = t.sceneY
            val c = t.source as Rectangle
            c.toFront()
        }

        umlClass.onMouseDragged = EventHandler { t: MouseEvent ->
            val offsetX = t.sceneX - orgSceneX
            val offsetY = t.sceneY - orgSceneY
            val c = t.source as Rectangle

            if (c.x + offsetX >= 0 && c.x + offsetX <= drawingArea.width - c.width)
                c.x = c.x + offsetX

            if (c.y + offsetY >= 0 && c.y + offsetY <= drawingArea.height - c.height)
                c.y = c.y + offsetY
            orgSceneX = t.sceneX
            orgSceneY = t.sceneY
        }

        drawingArea.children.add(umlClass)
    }
}