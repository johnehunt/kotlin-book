package interfaces

class Employee : Speaker, Translator {
    override fun saySomething() {
        println("Employee- Say Something")
    }

    override fun sayHello() {
        super<Speaker>.sayHello()
    }
}

fun main() {
    val e = Employee()
    e.sayHello()
    e.saySomething()
}