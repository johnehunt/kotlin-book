fun greeter4(vararg params: String) {
    params.forEach { print("$it , ") }
    println()
}

fun main() {
    greeter4("John")
    greeter4("John", "Denise")
    greeter4("John", "Denise", "Phoebe", "Adam")
    greeter4("John", "Denise", "Phoebe", "Adam", "Jasmine", "Gryff")
}