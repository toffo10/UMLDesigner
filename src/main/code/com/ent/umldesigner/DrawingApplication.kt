package com.ent.umldesigner

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.stage.Stage

class DrawingApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(DrawingApplication::class.java.getResource("designer-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "UMLDesigner"
        stage.scene = scene
        stage.icons.add(Image("file:./src/main/resources/com/ent/umldesigner/UML_Icon.png"))
        stage.show()

        stage.x = 0.0
        stage.y = 0.0
        stage.width = 1024.0
        stage.height = 1024.0
    }
}


fun main() {
    Application.launch(DrawingApplication::class.java)
}