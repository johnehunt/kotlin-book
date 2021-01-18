fun main() {
    //val any: Any = "Hello"
    val any: Any = 43.5
    if (any is String) {
        println("any contains a String")
        println(any.length)
    }
    if (any !is String) {
        println("any does not contain a string")
        println(any::class.simpleName)
    }
}