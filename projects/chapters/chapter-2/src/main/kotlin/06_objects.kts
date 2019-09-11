
object Logger {
    var isEnabled = true

    fun log(message: String) {
        if (isEnabled) {
            println(message)
        }
    }
}

Logger.log("Hello world") // Hello world
Logger.isEnabled = false
Logger.log("Oh no, where's my log") //
