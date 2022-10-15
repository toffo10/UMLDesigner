package com.ent.umldesigner.drawing

import com.ent.umldesigner.compiler.enums.ConnectionType
import javafx.beans.InvalidationListener
import javafx.beans.Observable
import javafx.beans.property.DoubleProperty
import javafx.scene.Group
import javafx.scene.layout.Pane
import javafx.scene.shape.Line
import javafx.scene.text.Text
import kotlin.math.*


class Connector private constructor(
    connectionType: ConnectionType,
    line: Line,
    arrow1: Line,
    arrow2: Line,
    relText1: Text,
    relText2: Text,
    pane1: Pane,
    pane2: Pane
) :
    Group(line, arrow1, arrow2, relText1, relText2) {
    private var line: Line
    var cardinality = ""

    constructor(connectionType: ConnectionType, pane1: Pane, pane2: Pane) : this(
        connectionType,
        Line(),
        Line(),
        Line(),
        Text(),
        Text(),
        pane1,
        pane2
    )

    init {
        this.line = line
        val updater = when (connectionType) {
            ConnectionType.IMPLEMENTATION -> returnImplArrow(arrow1, arrow2, pane1, pane2)
            ConnectionType.EXTENSION -> returnImplArrow(arrow1, arrow2, pane1, pane2)
            ConnectionType.RELATION -> returnRelArrow(relText1, relText2, pane1, pane2)
        }

        if (connectionType.equals(ConnectionType.EXTENSION)) {
            line.strokeDashArray.addAll(20.0, 20.0, 20.0)
        }

        // add updater to properties
        startXProperty().addListener(updater)
        startYProperty().addListener(updater)
        endXProperty().addListener(updater)
        endYProperty().addListener(updater)
        updater.invalidated(null)
    }

    private fun returnRelArrow(text1: Text, text2: Text, pane1: Pane, pane2: Pane): InvalidationListener {
        return InvalidationListener { _: Observable? ->
            val textSplitted = cardinality.split("/")
            if (textSplitted.size == 2) {

                text1.text = cardinality.split("/")[0]

                text1.x = computeEx(startX, startY, endX, endY, pane2, true)
                text1.y = computeEy(startX, startY, endX, endY, pane2, true)

                text2.text = cardinality.split("/")[1]

                text2.x = computeEx(endX, endY, startX, startY, pane1, true)
                text2.y = computeEy(endX, endY, startX, startY, pane1, true)
            }
        }
    }

    private fun returnImplArrow(arrow1: Line, arrow2: Line, pane1: Pane, pane2: Pane): InvalidationListener {
        return InvalidationListener { _: Observable? ->
            val sx = startX
            val sy = startY

            val ex = computeEx(startX, startY, endX, endY, pane2, false)
            val ey = computeEy(startX, startY, endX, endY, pane2, false)

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

    private fun computeEx(
        startX: Double,
        startY: Double,
        endX: Double,
        endY: Double,
        pane: Pane,
        addExtraPadding: Boolean
    ): Double {
        val hyp = hypot(abs(endX - startX), abs(endY - startY))
        val height = (endY - startY)
        val cosAngle = height.div(hyp)

        var triangleHeight = if (abs(endY - startY) < pane.height.div(2)) abs(endY - startY) else pane.height.div(2)

        val squareHyp = triangleHeight.div(cosAngle)

        var triangleWidth = sqrt(squareHyp.pow(2) - triangleHeight.pow(2))

        triangleWidth = if (triangleWidth > pane.width / 2) pane.width / 2 else triangleWidth
        triangleWidth = if (startX < endX) triangleWidth else -triangleWidth

        if (addExtraPadding) {
            triangleWidth += 20 * sign(triangleWidth)
        }

        return endX - triangleWidth
    }

    private fun computeEy(
        startX: Double,
        startY: Double,
        endX: Double,
        endY: Double,
        pane: Pane,
        addExtraPadding: Boolean
    ): Double {
        val hyp = hypot(abs(endX - startX), abs(endY - startY))
        val width = abs(endX - startX)
        val cosAngle = width.div(hyp)

        val triangleWidth = if (abs(endX - startX) < pane.width.div(2)) abs(endX - startX) else pane.width.div(2)

        val triangleHyp = triangleWidth.div(cosAngle)

        var triangleHeight = sqrt(triangleHyp.pow(2) - triangleWidth.pow(2))

        triangleHeight = if (triangleHeight > pane.height / 2) pane.height / 2 else triangleHeight
        triangleHeight = if (startY < endY) triangleHeight else -triangleHeight

        if (addExtraPadding) {
            triangleHeight += 20 * sign(triangleHeight)
        }

        return endY - triangleHeight
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