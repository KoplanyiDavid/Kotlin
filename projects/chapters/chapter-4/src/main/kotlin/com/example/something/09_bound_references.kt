package bound

class Person(val name: String) {
    fun speak() {
        println("Hi, I'm $name!")
    }
}

fun main() {
    val speak: (Person) -> Unit = Person::speak

    val grace = Person("Grace")
    val rebecca = Person("Rebecca")
    speak(grace) // "Hi, I'm Grace!"
    speak(rebecca) // "Hi, I'm Rebecca!"

    val speak2: () -> Unit = grace::speak
    speak2() // "Hi, I'm Grace!"
}
