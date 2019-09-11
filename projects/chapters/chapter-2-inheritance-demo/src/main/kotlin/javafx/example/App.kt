package javafx.example

import javafx.animation.AnimationTimer
import javafx.application.Application
import javafx.application.Application.launch
import javafx.scene.Scene
import javafx.scene.canvas.Canvas
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.stage.Stage
import kotlin.random.Random

fun main() {
    launch(UfoApplication::class.java)
}

const val CANVAS_WIDTH = 1280.0
const val CANVAS_HEIGHT = 720.0

class UfoApplication : Application() {
    override fun start(primaryStage: Stage) {
        val layout = VBox()
        val canvas = Canvas(CANVAS_WIDTH, CANVAS_HEIGHT)
        layout.children.add(canvas)
        primaryStage.scene = Scene(layout)
        primaryStage.show()

        val game = Game()
        repeat(10) {
            val width = Random.nextDouble(CANVAS_WIDTH)
            val height = Random.nextDouble(CANVAS_HEIGHT)
            game.entities.add(UFO(width, height))
        }

        val timer = Timer(game, canvas)
        timer.start()
    }
}

class Timer(val game: Game, val canvas: Canvas) : AnimationTimer() {
    private var ticks = 0

    override fun handle(now: Long) {
        ticks = (ticks + 1) % 10
        if (ticks == 0) {
            game.tick()
        }
        game.renderScene(canvas)
    }
}

interface Renderable {
    val isVisible: Boolean
    fun render(canvas: Canvas)
}

abstract class Entity(var x: Double, var y: Double) {
    open fun progress() {
        /* Empty */
    }
}

class UFO(x: Double, y: Double) : Renderable, Entity(x, y) {
    companion object {
        const val WIDTH = 40.0
        const val HEIGHT = 40.0
    }

    override var isVisible: Boolean = true

    override fun render(canvas: Canvas) {
        val context = canvas.graphicsContext2D
        context.fill = Color.DIMGRAY
        context.fillOval(x, y, WIDTH, HEIGHT)
        context.fill = Color.DODGERBLUE
        context.fillOval(x + WIDTH / 4, y + HEIGHT / 4, WIDTH / 2, HEIGHT / 2)
    }

    override fun progress() {
        x += Random.nextDouble(from = -5.0, until = 5.0)
        y += Random.nextDouble(from = -10.0, until = 10.0)
    }
}

class Game {
    val entities = mutableListOf<Entity>()

    fun tick() {
        for (entity in entities) {
            entity.progress()
        }
    }

    fun renderScene(canvas: Canvas) {
        canvas.graphicsContext2D.fill = Color.BLACK
        canvas.graphicsContext2D.fillRect(0.0, 0.0, canvas.width, canvas.height)

        for (entity in entities) {
            if (entity !is Renderable) {
                continue
            }
            if (entity.isVisible) {
                entity.render(canvas)
            }
        }
    }
}
