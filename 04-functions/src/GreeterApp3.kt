fun greeter3(name: String,
             title: String = "Dr",
             prompt: String = "Welcome",
             message: String = "Live Long and Proper") {
    println("$prompt $title $name - $message")
}

fun main() {
    greeter3("Adam")
    greeter3(name ="Adam")
    greeter3("Jasmine", message="Have a Nice Day!")
    greeter3(message="Have a Nice Day!", name="Jasmine")
    // illegal once you have used named parameters any further parameters must also be named
    // greeter3(message="Have a Nice Day!", "Jasmine")
    greeter3("Jasmine",
            title = "Ms",
            message="Have a Nice Day!")
}