package com.jjh.exp.people

class InvalidAgeException(val invalidAge: Int,
                           _message: String) : Exception(_message)

class Person(val name: String, _age: Int) {

    var age: Int = 0
        private set(value) {
            if (value < 0 || value > 120) {
                throw InvalidAgeException(value,
                    "Age must be between 0 and 120")
            } else {
                field = value
            }
        }

    init {
        age = _age
    }

}

fun main() {
    try {
        val p1 = Person("Adam", -1)
        println(p1)
    } catch (exp: InvalidAgeException) {
        println(exp.invalidAge)
        println(exp.message)
        println(exp)
    }
}