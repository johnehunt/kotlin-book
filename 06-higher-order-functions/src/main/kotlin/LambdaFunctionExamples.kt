
fun main() {
    val func: () -> Unit = { println("Hello World") }
    val func1 = func
    func()
    func1()
}