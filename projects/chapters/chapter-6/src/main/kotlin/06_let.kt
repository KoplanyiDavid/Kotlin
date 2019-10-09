import javafx.animation.AnimationTimer
import java.io.File

private var timer: AnimationTimer? = null

fun main() {

    val length = File("../../../README.md").let {
        println(it.name)
        println(it.absoluteFile)
        println(it.length())
        it.length()
    }

    File("./README.md").let { file ->
        println(file.name)
        println(file.length())
        println(file.absoluteFile)
    }

    val someFile: File? = null
    someFile?.let { file: File ->
        println(file.name)
    }

    timer?.let {
        it.stop()
    }

}
