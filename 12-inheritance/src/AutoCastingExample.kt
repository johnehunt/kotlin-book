class Player

fun main() {
    val any: Any = "Hello"

    when (any) {
        is String -> {
            println("any contains a String")
            println(any.length)
        }
        !is String -> {
            println("any does not contain a string")
            println(any::class.simpleName)
        }
    }

    // Using an 'unsafe' cast
    val message: String = any as String
    println(message)

    val p: Player? = any as? Player
    println(p)

}