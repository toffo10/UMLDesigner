package com.ent.umldesigner

import javafx.application.Application
import javafx.application.Application.launch
import javafx.event.EventHandler
import javafx.scene.Cursor
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.input.MouseEvent
import javafx.scene.paint.Color
import javafx.scene.shape.Circle
import javafx.scene.shape.Line
import javafx.scene.shape.StrokeLineCap
import javafx.stage.Stage

//from  w w  w. j av a2 s. c o  m
class DragApp : Application() {
    var orgSceneX = 0.0
    var orgSceneY = 0.0
    private fun createCircle(x: Double, y: Double, r: Double, color: Color): Circle {
        val circle = Circle(x, y, r, color)
        circle.cursor = Cursor.HAND
        circle.onMousePressed = EventHandler { t: MouseEvent ->
            orgSceneX = t.sceneX
            orgSceneY = t.sceneY
            val c = t.source as Circle
            c.toFront()
        }
        circle.onMouseDragged = EventHandler { t: MouseEvent ->
            val offsetX = t.sceneX - orgSceneX
            val offsetY = t.sceneY - orgSceneY
            val c = t.source as Circle
            c.centerX = c.centerX + offsetX
            c.centerY = c.centerY + offsetY
            orgSceneX = t.sceneX
            orgSceneY = t.sceneY
        }
        return circle
    }

    private fun connect(c1: Circle, c2: Circle): Line {
        val line = Line()
        line.startXProperty().bind(c1.centerXProperty())
        line.startYProperty().bind(c1.centerYProperty())
        line.endXProperty().bind(c2.centerXProperty())
        line.endYProperty().bind(c2.centerYProperty())
        line.strokeWidth = 1.0
        line.strokeLineCap = StrokeLineCap.BUTT
        line.strokeDashArray.setAll(1.0, 4.0)
        return line
    }

    override fun start(primaryStage: Stage) {
        val root = Group()
        val scene = Scene(root, 500.0, 260.0)

        // circles
        val redCircle = createCircle(100.0, 50.0, 30.0, Color.RED)
        val blueCircle = createCircle(20.0, 150.0, 20.0, Color.BLUE)
        val greenCircle = createCircle(40.0, 100.0, 40.0, Color.GREEN)
        val line1 = connect(redCircle, blueCircle)
        val line2 = connect(redCircle, greenCircle)
        val line3 = connect(greenCircle, blueCircle)

        // add the circles
        root.children.add(redCircle)
        root.children.add(blueCircle)
        root.children.add(greenCircle)

        // add the lines
        root.children.add(line1)
        root.children.add(line2)
        root.children.add(line3)

        // bring the circles to the front of the lines
        redCircle.toFront()
        blueCircle.toFront()
        greenCircle.toFront()
        primaryStage.scene = scene
        primaryStage.show()
    }

}

fun main(args: Array<String>) {
    Application.launch(DragApp::class.java)
}

