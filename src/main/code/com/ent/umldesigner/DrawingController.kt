package com.ent.umldesigner

import compiler.Parser
import compiler.handlers.UmlHandler
import compiler.util.Component
import compiler.util.ComponentType
import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.scene.Cursor
import javafx.scene.control.TextArea
import javafx.scene.input.MouseEvent
import javafx.scene.layout.Pane
import javafx.scene.layout.StackPane
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.scene.shape.Line
import javafx.scene.shape.Rectangle
import javafx.scene.text.Text


class DrawingController {
    @FXML
    private lateinit var umlTextArea: TextArea

    @FXML
    private lateinit var resultArea: TextArea

    @FXML
    private lateinit var drawingArea: Pane

    private var orgSceneX = 0.0
    private var orgSceneY = 0.0

    @FXML
    private fun convertUml() {
        Parser.doParsing(umlTextArea.text)
        resultArea.text = Parser.sb.toString()

        drawingArea.children.clear()
        drawUml();
    }

    private fun drawUml() {
        for (component in UmlHandler.getComponents()) {
            drawComponent(component)
        }
    }

    private fun drawComponent(component: Component?) {
        val umlInterface = Rectangle(10.0, 10.0, 0.0, 0.0)

        umlInterface.fill = Color.WHITE
        umlInterface.stroke = Color.BLACK

        var paramIndex: Int
        val stack = StackPane()
        val box = VBox()
        var text: Text

        stack.children.add(umlInterface)

        text = if (component!!.componentType.equals(ComponentType.CLASS)) {
            Text(String.format(" %s", component.name))
        } else {
            Text(String.format(" <<Interface>> %s", component.name))
        }

        box.children.add(text)
        umlInterface.height += text.layoutBounds.height

        umlInterface.width = text.layoutBounds.width + 10.0

        for (param in component.params) {
            text = Text(String.format(" +%s : %s", param.value.id, param.value.type))

            box.children.add(text)

            umlInterface.width =
                if (text.layoutBounds.width > umlInterface.width) text.layoutBounds.width + 10.0 else umlInterface.width

            umlInterface.height += text.layoutBounds.height
        }

        paramIndex = box.children.size + 1

        for (method in component.methods) {
            text = Text(method.value.toString())

            box.children.add(text)

            umlInterface.width =
                if (text.layoutBounds.width > umlInterface.width) text.layoutBounds.width + 10.0 else umlInterface.width

            umlInterface.height += text.layoutBounds.height
        }

        // Draw separation line
        var nameLine: Line = Line(umlInterface.x, 0.0, umlInterface.x + umlInterface.width, 0.0)
        box.children.add(1, nameLine)
        var paramsLine: Line = Line(umlInterface.x, 0.0, umlInterface.x + umlInterface.width, 0.0)
        box.children.add(paramIndex, paramsLine)

        stack.cursor = Cursor.HAND
        setEventHandler(stack)
        setMouseDraggedEvent(stack)

        stack.children.add(box)
        drawingArea.children.add(stack)
    }

    private fun setMouseDraggedEvent(umlElement: StackPane) {
        umlElement.onMouseDragged = EventHandler { t: MouseEvent ->
            val offsetX = t.sceneX - orgSceneX
            val offsetY = t.sceneY - orgSceneY
            val c = t.source as StackPane

            if (c.layoutX + offsetX >= 0 && c.layoutX + offsetX <= drawingArea.width - c.width)
                c.layoutX = c.layoutX + offsetX

            if (c.layoutY + offsetY >= 0 && c.layoutY + offsetY <= drawingArea.height - c.height)
                c.layoutY = c.layoutY + offsetY
            orgSceneX = t.sceneX
            orgSceneY = t.sceneY
        }
    }

    private fun setEventHandler(umlElement: StackPane) {
        umlElement.onMousePressed = EventHandler { t: MouseEvent ->
            orgSceneX = t.sceneX
            orgSceneY = t.sceneY
            val c = t.source as StackPane
            c.toFront()
        }
    }
}