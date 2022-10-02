package com.ent.umldesigner

import com.ent.umldesigner.drawingutil.Connector
import compiler.Parser
import compiler.enums.ComponentType
import compiler.enums.ConnectionType
import compiler.handlers.UmlHandler
import compiler.objects.Component
import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.scene.Cursor
import javafx.scene.control.ScrollPane
import javafx.scene.control.TextArea
import javafx.scene.input.MouseEvent
import javafx.scene.input.TransferMode
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
    private lateinit var scrollPane: ScrollPane

    @FXML
    private lateinit var drawingArea: Pane

    private var orgSceneX = 0.0
    private var orgSceneY = 0.0

    private var x = 0.0
    private var y = 0.0
    private var maxY = 0.0

    private var drawingAreaWidth = 0.0
    private var drawingAreaHeight = 0.0

    private var components: HashMap<String, Pane> = HashMap()

    @FXML
    private fun convertUml() {
        x = 0.0
        y = 0.0
        maxY = 0.0

        scrollPane.isPannable = true

        drawingArea.children.clear()
        resultArea.text = ""

        val parserResponse = Parser.doParsing(umlTextArea.text)

        if (parserResponse.isEmpty()) {
            resultArea.text = "Everything ok! \n"
            drawUml()
        } else {
            resultArea.text += "Compilation ended with errors: \n"
            for (error in parserResponse) {
                resultArea.text += error.message.toString() + "\n"
            }
        }

        calculateDrawingAreaHeigth()
        calculateDrawingAreaWidth()

        drawingArea.prefWidth = if (drawingArea.prefWidth < drawingAreaWidth) drawingAreaWidth else drawingArea.prefWidth
        drawingArea.prefHeight = if (drawingArea.prefHeight < drawingAreaHeight) drawingAreaHeight else drawingArea.prefHeight
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
            text = Text(String.format(" %s%s : %s", param.value.visibility, param.value.id, param.value.type))

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
            scrollPane.isPannable = false

            val offsetX = t.sceneX - orgSceneX
            val offsetY = t.sceneY - orgSceneY
            val c = t.source as Pane

            if (c.layoutX + offsetX >= 0)
                c.layoutX = c.layoutX + offsetX

            if (c.layoutY + offsetY >= 0)
                c.layoutY = c.layoutY + offsetY

            orgSceneX = t.sceneX
            orgSceneY = t.sceneY

            println("dio")

            calculateDrawingAreaHeigth()
            calculateDrawingAreaWidth()

            if (drawingArea.prefWidth < drawingAreaWidth)
                drawingArea.prefWidth = drawingAreaWidth

            if (drawingArea.prefHeight < drawingAreaHeight)
                drawingArea.prefHeight = drawingAreaHeight
        }

        umlElement.onMouseReleased = EventHandler { _ ->
            calculateDrawingAreaHeigth()
            calculateDrawingAreaWidth()

            drawingArea.prefWidth = drawingAreaWidth
            drawingArea.prefHeight = drawingAreaHeight

            scrollPane.isPannable = true
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

        val connector = Connector(connectionType, v1, v2)
        connector.startX = v1.layoutX
        connector.startY = v1.layoutY
        connector.endX = v2.layoutX
        connector.endY = v2.layoutY

        connector.startXProperty().bind(v1.layoutXProperty().add(v1.widthProperty().divide(2)))
        connector.startYProperty().bind(v1.layoutYProperty().add(v1.heightProperty().divide(2)))

        connector.endXProperty().bind(v2.layoutXProperty().add(v2.widthProperty().divide(2)))
        connector.endYProperty().bind(v2.layoutYProperty().add(v2.heightProperty().divide(2)))

        if (cardinality.isNotEmpty()) {
            connector.cardinality = cardinality
        }

        drawingArea.children.add(connector)
        connector.toBack()
    }

    private fun calculateDrawingAreaHeigth() {
        drawingAreaHeight = 0.0
        for (component in components) {
            if (component.value.layoutY + component.value.height > drawingAreaHeight)
                drawingAreaHeight = component.value.layoutY + component.value.height
        }
    }

    private fun calculateDrawingAreaWidth() {
        drawingAreaWidth = 0.0
        for (component in components) {
            if (component.value.layoutX + component.value.width > drawingAreaWidth)
                drawingAreaWidth = component.value.layoutX + component.value.width
        }
    }
}