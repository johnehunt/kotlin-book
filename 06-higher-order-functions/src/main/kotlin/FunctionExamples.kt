
fun getMessage(): String {
    return "Hello Kotlin World!"
}

fun main() {
    // Directly call the function
    val message = getMessage()
    println(message)

    println("-----------")

    // Get a reference to the function
    val message2 = ::getMessage
    println(message2)
    println(message2::class.qualifiedName)
}