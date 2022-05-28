package com.ent.umldesigner

import compiler.Parser
import compiler.drawingutil.Arrow
import compiler.handlers.UmlHandler
import compiler.util.Component
import compiler.util.ComponentType
import compiler.util.ConnectionType
import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.scene.Cursor
import javafx.scene.control.TextArea
import javafx.scene.input.MouseEvent
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.scene.shape.Line
import javafx.scene.shape.Rectangle
import javafx.scene.text.Text
import org.fxmisc.richtext.CodeArea


class DrawingController {
    @FXML
    private lateinit var umlTextArea: CodeArea

    @FXML
    private lateinit var resultArea: TextArea

    @FXML
    private lateinit var drawingArea: Pane

    private var orgSceneX = 0.0
    private var orgSceneY = 0.0

    private var x = 0.0
    private var y = 0.0
    private var maxY = 0.0

    private var components: HashMap<String, Pane> = HashMap()

    @FXML
    private fun convertUml() {
        x = 0.0
        y = 0.0
        maxY = 0.0

        Parser.doParsing(umlTextArea.text)
        resultArea.text = Parser.sb.toString()

        drawingArea.children.clear()
        drawUml()
    }

    private fun drawUml() {
        for (component in UmlHandler.getComponents()) {
            drawComponent(component)
        }

        for (component in UmlHandler.getComponents()) {
            for (implementedComponent in component.componentBehaviour.implementedComponents) {
                connect(component.name, implementedComponent.name, ConnectionType.IMPLEMENTATION)
            }
            for (extendedComponent in component.componentBehaviour.extendedComponents) {
                connect(component.name, extendedComponent.name, ConnectionType.EXTENSION)
            }
            for (relationComponent in component.componentBehaviour.relatedComponents) {
                connect(
                    component.name,
                    (relationComponent.key as Component).name,
                    relationComponent.value.toString(),
                    ConnectionType.RELATION
                )
            }
        }
    }

    private fun drawComponent(component: Component?) {
        val umlInterface = Rectangle(0.0, 0.0, 0.0, 0.0)

        umlInterface.fill = Color.WHITE
        umlInterface.stroke = Color.BLACK

        val paramIndex: Int
        val stack = Pane()
        val box = VBox()
        var text: Text

        stack.children.add(umlInterface)

        text = if (component!!.componentType.equals(ComponentType.CLASS)) {
            Text(String.format(" %s", component.name))
        } else {
            Text(String.format(" <<Interface>> %s", component.name))
        }

        box.children.add(text)
        umlInterface.height += text.layoutBounds.height + 10.0

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

        stack.layoutX = x
        stack.layoutY = y

        maxY = if (umlInterface.height + y > maxY) umlInterface.height + y else maxY

        x += umlInterface.layoutX + umlInterface.width + 10

        if (x > drawingArea.width) {
            x = 0.0
            y = maxY + 10.0

            stack.layoutX = x
            stack.layoutY = y

            x += umlInterface.layoutX + umlInterface.width + 10
        }

        components[component.name] = stack

        drawingArea.children.add(stack)
    }

    private fun setMouseDraggedEvent(umlElement: Pane) {
        umlElement.onMouseDragged = EventHandler { t: MouseEvent ->
            val offsetX = t.sceneX - orgSceneX
            val offsetY = t.sceneY - orgSceneY
            val c = t.source as Pane

            if (c.layoutX + offsetX >= 0 && c.layoutX + offsetX <= drawingArea.width - c.width)
                c.layoutX = c.layoutX + offsetX

            if (c.layoutY + offsetY >= 0 && c.layoutY + offsetY <= drawingArea.height - c.height)
                c.layoutY = c.layoutY + offsetY

            orgSceneX = t.sceneX
            orgSceneY = t.sceneY
        }
    }

    private fun setEventHandler(umlElement: Pane) {
        umlElement.onMousePressed = EventHandler { t: MouseEvent ->
            orgSceneX = t.sceneX
            orgSceneY = t.sceneY
            val c = t.source as Pane
            c.toFront()
        }
    }

    private fun connect(name1: String, name2: String, connectionType: ConnectionType) {
        connect(name1, name2, "", connectionType)
    }

    private fun connect(name1: String, name2: String, cardinality: String, connectionType: ConnectionType) {
        val v1: Pane = components[name1]!!
        val v2: Pane = components[name2]!!

        val arrow = Arrow(connectionType, v1, v2)
        arrow.startX = v1.layoutX
        arrow.startY = v1.layoutY
        arrow.endX = v2.layoutX
        arrow.endY = v2.layoutY

        arrow.startXProperty().bind(v1.layoutXProperty().add(v1.widthProperty().divide(2)))
        arrow.startYProperty().bind(v1.layoutYProperty().add(v1.heightProperty().divide(2)))

        v2.layoutYProperty().addListener { obs, _, _ ->
            var bound = true

            if (arrow.startY <= obs.value.toDouble()) {
                arrow.endY = obs.value.toDouble()
            } else if (arrow.startY < obs.value.toDouble() + v2.height) {
                bound = false

                arrow.endXProperty().unbind()

                arrow.endY = v2.layoutY + (v2.height / 2)
                if (arrow.endX <= v1.layoutX)
                    arrow.endX = v2.layoutX + v2.width
                else
                    arrow.endX = v2.layoutX
            } else {
                arrow.endY = obs.value.toDouble() + v2.height
            }

            if (!arrow.endXProperty().isBound && bound) {
                arrow.endXProperty().bind(
                    v2.layoutXProperty().add(v2.widthProperty().divide(2))
                )
            }
        }

        v1.layoutYProperty().addListener { obs, _, _ ->
            var bound = true

            if (obs.value.toDouble() + v1.height <= v2.layoutY) {
                arrow.endY = v2.layoutY
            } else if (obs.value.toDouble() <= v2.layoutY + v2.height) {
                bound = false

                arrow.endXProperty().unbind()

                arrow.endY = v2.layoutY + (v2.height / 2)
                if (arrow.endX <= v1.layoutX)
                    arrow.endX = v2.layoutX + v2.width
                else
                    arrow.endX = v2.layoutX
            } else {
                arrow.endY = v2.layoutY + v2.height
            }

            if (!arrow.endXProperty().isBound && bound) {
                arrow.endXProperty().bind(
                    v2.layoutXProperty().add(v2.widthProperty().divide(2))
                )
            }
        }

        if (cardinality.isNotEmpty()) {
            arrow.cardinality = cardinality
        }

        drawingArea.children.add(arrow)
        arrow.toBack()
    }
}