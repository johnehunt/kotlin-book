fun getSomeData(): Any {
    return "Hello"
    //return 42.5
}

fun main() {
    val any: Any = getSomeData()
    val message: String? = any as? String
    println(message?.length)
}