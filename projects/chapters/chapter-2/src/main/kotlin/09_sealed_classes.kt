import java.io.IOException
import java.net.URL

sealed class Response
class Success(val data: String) : Response()
class Error(val exception: IOException) : Response()

fun getDataFromAPI(): Response {
    return try {
        val data = URL("https://www.kotlinlang.org/").readText()
        Success(data)
    } catch (e: IOException) {
        Error(e)
    }
}

fun main() {
    when (val response = getDataFromAPI()) {
        is Success -> {
            println("Network success")
            println(response.data.take(100))
        }
        is Error ->{
            System.err.println("Network error")
            response.exception.printStackTrace()
        }
    }

    val message = when (getDataFromAPI()) {
        is Success -> "Network success"
        is Error -> "Network error"
    }
    println(message)
}
