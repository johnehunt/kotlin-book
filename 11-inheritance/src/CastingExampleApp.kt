

fun getData(): Any {
  return "Hello"
  //return 42.5
}

fun main() {
    val any: Any = getData()
    // println(any.length)
    val message: String = any as String
    println(message.length)
}