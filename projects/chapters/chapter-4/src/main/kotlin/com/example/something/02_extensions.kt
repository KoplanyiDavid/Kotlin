package com.example.something

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun main() {
    println("Steve".lastChar())
}
