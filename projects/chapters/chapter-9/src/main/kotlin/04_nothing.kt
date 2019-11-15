package moreaboutnothing

import nothing.exceptional

fun calculate(someParam: Int?) {
    val x = someParam ?: exceptional()
    val y = x * 2
    println(y)
}

fun oddity() {
    throw return return throw return
}
