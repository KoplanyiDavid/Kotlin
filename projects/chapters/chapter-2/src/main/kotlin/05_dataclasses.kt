package dataclasses

data class Person(val name: String, var age: Int)

fun main() {
    val emma = Person("Emma", 19)
    println(emma) // Person(name=Emma, age=19)

    val (name, age) = emma
    println(name) // Emma

    val clone = emma.copy()
    println(clone) // Person(name=Emma, age=19)

    val olderEmma = emma.copy(age = 26)
    println(olderEmma) // Person(name=Emma, age=26)
}
