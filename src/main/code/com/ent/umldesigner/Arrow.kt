package com.ent.umldesigner

import javafx.beans.InvalidationListener
import javafx.beans.Observable
import javafx.beans.property.DoubleProperty
import javafx.scene.Group
import javafx.scene.shape.Line


class Arrow private constructor(line: Line, arrow1: Line, arrow2: Line) : Group(line, arrow1, arrow2) {
    private val line: Line

    constructor() : this(Line(), Line(), Line()) {}

    init {
        this.line = line
        val updater = InvalidationListener { o: Observable? ->
            val ex = endX
            val ey = endY
            val sx = startX
            val sy = startY
            arrow1.setEndX(ex)
            arrow1.setEndY(ey)
            arrow2.setEndX(ex)
            arrow2.setEndY(ey)
            if (ex == sx && ey == sy) {
                // arrow parts of length 0
                arrow1.setStartX(ex)
                arrow1.setStartY(ey)
                arrow2.setStartX(ex)
                arrow2.setStartY(ey)
            } else {
                val factor = arrowLength / Math.hypot(sx - ex, sy - ey)
                val factorO = arrowWidth / Math.hypot(sx - ex, sy - ey)

                // part in direction of main line
                val dx = (sx - ex) * factor
                val dy = (sy - ey) * factor

                // part ortogonal to main line
                val ox = (sx - ex) * factorO
                val oy = (sy - ey) * factorO
                arrow1.setStartX(ex + dx - oy)
                arrow1.setStartY(ey + dy + ox)
                arrow2.setStartX(ex + dx + oy)
                arrow2.setStartY(ey + dy - ox)
            }
        }

        // add updater to properties
        startXProperty().addListener(updater)
        startYProperty().addListener(updater)
        endXProperty().addListener(updater)
        endYProperty().addListener(updater)
        updater.invalidated(null)
    }

    // start/end properties
    var startX: Double
        get() = line.getStartX()
        set(value) {
            line.setStartX(value)
        }

    fun startXProperty(): DoubleProperty {
        return line.startXProperty()
    }

    var startY: Double
        get() = line.getStartY()
        set(value) {
            line.setStartY(value)
        }

    fun startYProperty(): DoubleProperty {
        return line.startYProperty()
    }

    var endX: Double
        get() = line.getEndX()
        set(value) {
            line.setEndX(value)
        }

    fun endXProperty(): DoubleProperty {
        return line.endXProperty()
    }

    var endY: Double
        get() = line.getEndY()
        set(value) {
            line.setEndY(value)
        }

    fun endYProperty(): DoubleProperty {
        return line.endYProperty()
    }

    companion object {
        private const val arrowLength = 20.0
        private const val arrowWidth = 7.0
    }
}