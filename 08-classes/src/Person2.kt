class Person2(val name: String = "", val age: Int = 0)

fun main() {
    val p1 = Person2("John", 36)
    val p2 = Person2("Denise")
    val p3 = Person2()

    val p4 = Person2("Adam", age=42)
    val p5 = Person2(age=23, name="Jasmine")
    val p6 = Person2(age=21)

}