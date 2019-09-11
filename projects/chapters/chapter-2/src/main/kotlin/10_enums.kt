enum class Sizes {
    S, M, L
}

enum class MenuItem(val price: Double) {
    Hamburger(4.65),
    Fries(3.50),
    Coke(2.50) {
        override fun purchase() {
            super.purchase()
            println("It's a coke!")
        }
    };

    open fun purchase() {
        println("Spending $price")
    }
}
