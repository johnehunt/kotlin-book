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
class Person8(val name: String = "", var age: Int = 0) {

    init {
        println("In Init")
    }

    fun birthday() {
        println("Happy birthday you were $age")
        age++
        println("You are now $age")
    }




    override fun toString() = "Person($name, $age)"
}