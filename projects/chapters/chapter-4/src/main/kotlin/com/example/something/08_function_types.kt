package com.example.something

data class Person(val name: String, val age: Int)

fun createGreeting(person: Person): String {
    return "Hello, ${person.name}"
}

val greetingCreator: (Person) -> String = ::createGreeting

val greetingCreator2: (Person) -> String = fun(person: Person): String {
    return "Hello, ${person.name}"
}

val greetingCreator3 = { person: Person -> "Hello, ${person.name}" }

val greetingCreator4 = { person: Person ->
    println("Creating greeting for ${person.name}...")
    "Hello, ${person.name}"
}

val greetingCreator5: (Person) -> String = { person -> "Hello, ${person.name}" }

val greetingCreator6: (Person) -> String = { "Hello, ${it.name}" }

fun main() {
    val julie = Person("Julie", 36)

    println(greetingCreator(julie)) // Hello, Julie
    println(greetingCreator2(julie)) // Hello, Julie
    println(greetingCreator3(julie)) // Hello, Julie
    println(greetingCreator4(julie)) // Creating greeting for Julie... Hello, Julie
    println(greetingCreator5(julie)) // Hello, Julie
    println(greetingCreator6(julie)) // Hello, Julie
}
