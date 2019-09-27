package javafx.example

import javafx.animation.AnimationTimer
import javafx.application.Application
import javafx.stage.Stage

class MyApplication : Application() {
    private var timer: AnimationTimer? = null

    override fun start(primaryStage: Stage) {
        // Setup things
        timer = object : AnimationTimer() {
            override fun handle(now: Long) {
                // Draw stuff somewhere!
            }
        }

        timer?.start()
        timer!!.stop()

        if (timer != null) {
            // timer.stop() // This line doesn't compile!
        }
    }
}

class BetterTimerApplication : Application() {
    private lateinit var timer: AnimationTimer

    override fun start(primaryStage: Stage) {
        timer = object : AnimationTimer() {
            override fun handle(now: Long) {
                // Draw stuff somewhere!
            }
        }

        timer.start()
        timer.stop()
    }
}
