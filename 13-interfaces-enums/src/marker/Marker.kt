package marker

interface Decorator
interface Service

object MyPrinter : Decorator, Service {
    fun print() {
        println("MyPrinter")
    }
}

fun main() {
    MyPrinter.print()
}