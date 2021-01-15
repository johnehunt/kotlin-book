class Player

fun main() {
    val any: Any = "Hello"
    if (any is String) {
        println(any.length)
    }

    if (any !is String) { // same as !(obj is String)
        println("Not a String")
    }

    // Using an 'unsafe' cast
    val message: String = any as String
    println(message)

    // val p: Player = any as Player
    // println(p)

    val p: Player? = any as? Player
    println(p)

}