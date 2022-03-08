package com.ent.umldesigner

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.geometry.Rectangle2D
import javafx.scene.Scene
import javafx.stage.Screen
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("hello-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()

        stage.isResizable = false;
        stage.width = 800.0;
        stage.height = 800.0;
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}