package com.ent.umldesigner

import javafx.application.Application
import javafx.application.Application.launch
import javafx.event.EventHandler
import javafx.scene.Cursor
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.input.MouseEvent
import javafx.scene.layout.Pane
import javafx.scene.layout.StackPane
import javafx.scene.paint.Color
import javafx.scene.shape.Rectangle
import javafx.scene.shape.Line
import javafx.scene.shape.StrokeLineCap
import javafx.stage.Stage
import java.util.Stack

//from  w w  w. j av a2 s. c o  m
class DragApp : Application() {
    var orgSceneX = 0.0
    var orgSceneY = 0.0
    private fun createRectangle(x: Double, y: Double, r: Double, color: Color): Rectangle {
        val Rectangle = Rectangle(x, y)
        Rectangle.fill = color
        Rectangle.cursor = Cursor.HAND
        Rectangle.onMousePressed = EventHandler { t: MouseEvent ->
            orgSceneX = t.sceneX
            orgSceneY = t.sceneY
            val c = t.source as Rectangle
            c.toFront()
        }
        Rectangle.onMouseDragged = EventHandler { t: MouseEvent ->
            val offsetX = t.sceneX - orgSceneX
            val offsetY = t.sceneY - orgSceneY
            val c = t.source as Rectangle
            c.x = c.x + offsetX
            c.y = c.y + offsetY
            orgSceneX = t.sceneX
            orgSceneY = t.sceneY
        }
        return Rectangle
    }

    private fun connect(c1: Rectangle, c2: Rectangle): Line {
        val line = Line()
        line.startXProperty().bind(c1.xProperty().add(c1.widthProperty().divide(2)))
        line.startYProperty().bind(c1.yProperty().add(c1.heightProperty().divide(2)))
        line.endXProperty().bind(c2.xProperty().add(c2.widthProperty().divide(2)))
        line.endYProperty().bind(c2.yProperty().add(c2.heightProperty().divide(2)))
        line.strokeWidth = 1.0
        line.strokeLineCap = StrokeLineCap.BUTT
        line.strokeDashArray.setAll(1.0, 4.0)
        return line
    }

    override fun start(primaryStage: Stage) {
        val root = Group()
        val scene = Scene(root, 500.0, 260.0)

        val stackPane = Pane()

        // Rectangles
        val redRectangle = createRectangle(100.0, 50.0, 30.0, Color.RED)
        val blueRectangle = createRectangle(20.0, 150.0, 20.0, Color.BLUE)
        val greenRectangle = createRectangle(40.0, 100.0, 40.0, Color.GREEN)
        val line1 = connect(redRectangle, blueRectangle)
        val line2 = connect(redRectangle, greenRectangle)
        val line3 = connect(greenRectangle, blueRectangle)

        // add the Rectangles
        stackPane.children.add(redRectangle)
        stackPane.children.add(blueRectangle)
        stackPane.children.add(greenRectangle)

        // add the lines
        stackPane.children.add(line1)
        stackPane.children.add(line2)
        stackPane.children.add(line3)

        root.children.add(stackPane)

        // bring the Rectangles to the front of the lines
        redRectangle.toFront()
        blueRectangle.toFront()
        greenRectangle.toFront()

        primaryStage.scene = scene
        primaryStage.show()
    }

}

fun main(args: Array<String>) {
    Application.launch(DragApp::class.java)
}

