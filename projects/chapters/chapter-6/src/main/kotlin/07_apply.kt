package apply

import javafx.scene.shape.Rectangle

fun main() {

    val rect = Rectangle().apply {
        x = 8.0
        y = 9.0
        width = 100.0
        height = 200.0
    }

}

inline fun buildString(builderAction: StringBuilder.() -> Unit): String =
    StringBuilder().apply(builderAction).toString()
