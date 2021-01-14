/**
 * This is a simple class representing information
 * about a person.
 *
 * @property name the name of this person.
 * @property age the age of this person
 * @constructor Creates a new person.
 *
 * @author John Hunt
 * @since 1.0
 */
class Person7(val name: String = "", var age: Int = 0) {
    override fun toString() = "Person($name, $age)"
}

fun main() {
    val p1 = Person7("John", 56)
    val p2 = Person7("Denise", 53)
    val p3 = Person7("Phoebe", 23)
    val p4 = Person7("Adam", 21)
    println(p1)
    println(p2)
    println(p3)
    println(p4)
}