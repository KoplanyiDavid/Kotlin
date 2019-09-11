class Outer {
    var outerValue = 0

    inner class Inner {
        init {
            println(outerValue)
        }
    }
}
