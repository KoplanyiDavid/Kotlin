package properties


class Person(val name: String, age: Int) {

    var age: Int = age
        get(): Int = field - 5
        set(value: Int) {
            if (value > field) {
                field = value
            }
        }

}
