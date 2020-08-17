fun main() {
    val age = 18

    val status = if (age > 12 && age < 20)
        "a teenager"
    else
        "not a teenager"

    println("$age – you are $status")

}