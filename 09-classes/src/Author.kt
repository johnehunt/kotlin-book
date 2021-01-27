class Author(val name: String) {
    fun printMe1() {
        println("Author - $name")
    }
    fun printMe2(): Unit = println("Author - $name")
    fun printMe3() = println("Author - $name")
}

fun main() {
    val author = Author("John")
    author.printMe1()
    author.printMe2()
    author.printMe3()
}