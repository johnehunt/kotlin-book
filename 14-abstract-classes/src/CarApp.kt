
fun main() {
    val c: Conveyance = Car()
    c.startup()
    val result = c.drive(10)
    println(result)
}