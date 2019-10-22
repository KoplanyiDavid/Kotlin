class Address(map: MutableMap<String, String>) {
    var country: String by map
    var zip: String by map
    var city: String by map
    var street: String by map
}

fun main() {
    val map = mutableMapOf<String, String>()
    val address = Address(map)
    address.country = "Hungary"
    address.city = "Budapest"
    address.zip = "1117"

    println(address.city) // Budapest
}
