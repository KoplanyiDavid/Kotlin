fun printAll(vararg words: String) {
    for (word in words) {
        println(word)
    }
}

fun main() {
    printAll("Nitwit", "Blubber", "Oddment", "Tweak")

    val words = arrayOf("Nitwit", "Blubber", "Oddment", "Tweak")
    printAll(*words, "Thank", "You")
}
