package safe

class Service {
    fun sendEmail() {}
}

fun main() {
    val service: Service? = null

    service?.sendEmail()

    if (service != null) {
        service.sendEmail()
    } else {
        /* ¯\_(ツ)_/¯ */
    }
}
