package com.ent.umldesigner

import compiler.Parser
import compiler.handlers.UmlHandler
import compiler.util.Component
import compiler.util.ComponentType
import javafx.beans.value.ChangeListener
import javafx.beans.value.ObservableValue
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
    private var components: HashMap<String, StackPane> = HashMap()

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

        for (component in UmlHandler.getComponents()) {
            for (implementedComponent in component.componentBehaviour.implementedComponents) {
                connect(component.name, implementedComponent.name)
            }
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

        components[component.name] = stack

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

    private fun connect(name1: String, name2: String) {
        val v1: StackPane = components[name1]!!
        val v2: StackPane = components[name2]!!

        val arrow = Arrow()
        arrow.startX = v1.scene.x
        arrow.startY = v1.scene.y
        arrow.endX = v2.scene.x
        arrow.endY = v2.scene.y

        arrow.startXProperty().bind(v1.layoutXProperty().add(v1.widthProperty().divide(2)))
        arrow.startYProperty().bind(v1.layoutYProperty().add(v1.heightProperty().divide(2)))

        v2.layoutYProperty().addListener { obs, _, _ ->
            var bound = true

            if (arrow.startY <= obs.value.toDouble()) {
                arrow.endY = obs.value.toDouble()
            } else if (arrow.startY < obs.value.toDouble() + v2.height) {
                bound = false

                arrow.endXProperty().unbind()

                if (arrow.endX <= v1.layoutX)
                    arrow.endX = v2.layoutX + v2.width
                else
                    arrow.endX = v2.layoutX
            } else {
                arrow.endY = obs.value.toDouble() + v2.height
            }

            if(!arrow.endXProperty().isBound && bound) {
                arrow.endXProperty().bind(
                    v2.layoutXProperty()
                        .add((v1.layoutXProperty().divide(drawingArea.widthProperty())).multiply(v2.widthProperty()))
                        .add(20)
                )
            }
        }

        v1.layoutYProperty().addListener { obs, _, _ ->
            var bound = true

            if (obs.value.toDouble() + v1.height <= v2.layoutY) {
                arrow.endY = v2.layoutY
            } else if (obs.value.toDouble() + v1.height <= v2.layoutY + v2.height) {
                bound = false

                arrow.endXProperty().unbind()

                arrow.endY = (obs.value.toDouble() + v1.height)
                if (arrow.endX <= v1.layoutX)
                    arrow.endX = v2.layoutX + v2.width
                else
                    arrow.endX = v2.layoutX
            } else if (obs.value.toDouble() >= v2.layoutY + v2.height) {
                arrow.endY = v2.layoutY + v2.height
            }

            if(!arrow.endXProperty().isBound && bound) {
                arrow.endXProperty().bind(
                    v2.layoutXProperty()
                        .add((v1.layoutXProperty().divide(drawingArea.widthProperty())).multiply(v2.widthProperty()))
                        .add(20)
                )
            }
        }

        /*
        arrow.strokeWidth = 1.0
        arrow.strokeLineCap = StrokeLineCap.ROUND
        arrow.strokeDashArray.setAll(1.0, 4.0)
        */

        drawingArea.children.add(arrow)
        arrow.toBack()
    }
}