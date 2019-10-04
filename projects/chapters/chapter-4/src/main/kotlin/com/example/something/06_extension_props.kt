package com.example.something

import java.math.BigDecimal

val Int.bd: BigDecimal
    get() = BigDecimal(this)

fun main() {
    val thousand: BigDecimal = 1000.bd
    println(thousand)
}
