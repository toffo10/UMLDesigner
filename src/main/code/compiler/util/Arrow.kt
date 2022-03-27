package compiler.util

import javafx.beans.InvalidationListener
import javafx.beans.Observable
import javafx.beans.property.DoubleProperty
import javafx.scene.Group
import javafx.scene.shape.Line
import javafx.scene.text.Text
import kotlin.math.hypot


class Arrow private constructor(
    connectionType: ConnectionType,
    line: Line,
    arrow1: Line,
    arrow2: Line,
    relText1: Text,
    relText2: Text
) :
    Group(line, arrow1, arrow2, relText1, relText2) {
    private val line: Line
    var cardinality = ""

    constructor(connectionType: ConnectionType) : this(connectionType, Line(), Line(), Line(), Text(), Text())

    init {
        this.line = line
        val updater = when (connectionType) {
            ConnectionType.IMPLEMENTATION -> returnImplArrow(arrow1, arrow2)
            ConnectionType.EXTENSION -> returnImplArrow(arrow1, arrow2)
            ConnectionType.RELATION -> returnRelArrow(relText1, relText2)
        }

        // add updater to properties
        startXProperty().addListener(updater)
        startYProperty().addListener(updater)
        endXProperty().addListener(updater)
        endYProperty().addListener(updater)
        updater.invalidated(null)
    }

    private fun returnRelArrow(text1: Text, text2: Text): InvalidationListener {
        return InvalidationListener { _: Observable? ->
            val textSplitted = cardinality.split("/")
            if (textSplitted.size == 2) {
                text1.text = cardinality.split("/")[0]
                text1.x = if (startX > endX) endX + 20 else endX - 20
                text1.y = if (startY > endY) endY + 20 else endY - 20

                text2.text = cardinality.split("/")[1]
                text2.x = if (startX > endX) startX + 50 else startX - 50
                text2.y = if (startY > endY) startY + 50 else startY - 50
            }
        }
    }

    private fun returnImplArrow(arrow1: Line, arrow2: Line): InvalidationListener {
        return InvalidationListener { _: Observable? ->
            val ex = endX
            val ey = endY
            val sx = startX
            val sy = startY
            arrow1.endX = ex
            arrow1.endY = ey
            arrow2.endX = ex
            arrow2.endY = ey
            if (ex == sx && ey == sy) {
                // arrow parts of length 0
                arrow1.startX = ex
                arrow1.startY = ey
                arrow2.startX = ex
                arrow2.startY = ey
            } else {
                val factor = arrowLength / hypot(sx - ex, sy - ey)
                val factorO = arrowWidth / hypot(sx - ex, sy - ey)

                // part in direction of main line
                val dx = (sx - ex) * factor
                val dy = (sy - ey) * factor

                // part ortogonal to main line
                val ox = (sx - ex) * factorO
                val oy = (sy - ey) * factorO
                arrow1.startX = ex + dx - oy
                arrow1.startY = ey + dy + ox
                arrow2.startX = ex + dx + oy
                arrow2.startY = ey + dy - ox


            }
        }

    }

    // start/end properties
    var startX: Double
        get() = line.startX
        set(value) {
            line.startX = value
        }

    fun startXProperty(): DoubleProperty {
        return line.startXProperty()
    }

    var startY: Double
        get() = line.startY
        set(value) {
            line.startY = value
        }

    fun startYProperty(): DoubleProperty {
        return line.startYProperty()
    }

    var endX: Double
        get() = line.endX
        set(value) {
            line.endX = value
        }

    fun endXProperty(): DoubleProperty {
        return line.endXProperty()
    }

    var endY: Double
        get() = line.endY
        set(value) {
            line.endY = value
        }

    fun endYProperty(): DoubleProperty {
        return line.endYProperty()
    }

    companion object {
        private const val arrowLength = 20.0
        private const val arrowWidth = 7.0
    }
}