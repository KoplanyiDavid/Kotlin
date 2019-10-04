package com.example.something

fun execute(actions: () -> Unit) {
    actions()
}

fun repeat(times: Int, actions: () -> Unit) {
    for (i in 0 until times) {
        actions()
    }
}

fun main() {
    execute({ println("Hello world") })

    repeat(3, { println("Hello world") })

    repeat(3) { println("Hello world") }

    repeat(3) {
        println("Hello world")
    }
}
