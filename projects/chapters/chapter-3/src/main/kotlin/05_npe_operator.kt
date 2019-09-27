@file:Suppress("SENSELESS_COMPARISON")

fun main() {
    val person: Person? = null

    // 1
    println(person!!.name)

    // 2
    if (person == null) {
        throw KotlinNullPointerException("person was null")
    }
    println(person.name)
}
