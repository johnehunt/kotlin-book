fun greeter2(name: String, message: String = "Live Long and Proper") {
    println("Welcome $name - $message")
}

fun main() {
    greeter2("Adam")
    greeter2("Jasmine", "Have a Nice Day!")
}