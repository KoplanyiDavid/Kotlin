import java.io.File

fun main() {
    val file = File("images")

    val walk: FileTreeWalk = file.walk()

    walk.filter { it.isFile }
        .filter { it.nameWithoutExtension.contains("IMG") }
        .filter { it.extension.equals("jpg", ignoreCase = true) }
        .forEach { file ->
            println(file.name)
        }
}
