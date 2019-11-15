package nothing

fun loopy(): Nothing {
    while (true) {
        println("Loop!")
    }
}

fun exceptional(): Nothing {
    throw IllegalStateException()
}

fun processData(data: List<String>) {
    // Use data
}

fun main() {
    loopy()
    println("Hello world!")

    val data: Nothing = loopy()
    processData(data)
}

fun getValue(): Int {
    TODO("implement later")
}

fun calculate(x: Int): Int = TODO()

fun useCalculate() {
    calculate(TODO())
}
