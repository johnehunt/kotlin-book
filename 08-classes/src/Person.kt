/**
 * Creates a public class Person with 'properties' name and age.
 * Name is a public read only property (i.e. a val)
 * age is a public read-write property (i.e. a var)
 *
 * To construct the class must provide a name and age as part of constrcutor
 * Note keyword constructor is optional
 *
 * Note {} for class body are optional here as there is no class body
 */
class Person constructor(val name: String,
                         var age: Int) {}

fun main() {
    val p1 = Person("John", 36)
    val p2 = Person("Phoebe", 21)

    println(p1)
    println(p2)

    println(p1.name)
    println(p1.age)

    println("${p1.name} is ${p1.age}")
    println("${p2.name} is ${p2.age}")

    p1.age = 55
    // p.name = "Bob" // Compilation error read only val
    println("${p1.name} is ${p1.age}")

    val p3 = Person("Denise", 52)
    val p4 = Person("Adam", 20)

    println(p2)
    println(p3)
    println(p4)

}