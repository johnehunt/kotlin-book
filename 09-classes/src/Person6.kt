class Person6(val name: String = "",
              var age: Int = 0) {

    fun birthday() {
        println("Happy birthday you were $age")
        age++
        println("You are now $age")
    }

}

fun main() {
    val p1 = Person6("Adam", 21)
    println("${p1.name} is ${p1.age}")
    p1.birthday()
    println("${p1.name} is now ${p1.age}")
}