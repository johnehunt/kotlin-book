package interfaces

class Person : Speaker {
    override fun saySomething() {
        println("Person - Howdy")
    }
}

fun main() {
    val p = Person()
    p.sayHello()
    p.saySomething()
}