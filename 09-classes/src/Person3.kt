class Person3(private val id: String,
              val name: String = "",
              val age: Int = 0) {
}

fun main() {
    val p1 = Person3("id1", "John", 50)
    println("${p1.name} is ${p1.age}")
     // println("${p1.id}") compile time error id is a private property
}