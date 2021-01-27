class Person4(val name: String, var age: Int) {
    constructor(age: Int) : this("unnamed", age) {
        println("In auxiliary constructor")
    }
}

fun main() {
    val p1 = Person4(21)
    println("${p1.name} is ${p1.age}")
}
