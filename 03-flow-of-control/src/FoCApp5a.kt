fun main() {
    val age = 18
    var status = ""

    if (age > 12 && age < 20)
        status = "a teenager"
    else
        status = "not a teenager"

    println("$age – you are $status")

}