inline fun buildString(actions: StringBuilder.() -> Unit): String {
    val builder = StringBuilder()
    builder.actions()
    return builder.toString()
}

fun main() {

    val age = 6

    val result = buildString {
        this.append("Little Timmy is ")
        append(age)
        append(" years old today")
    }
    println(result)

}
