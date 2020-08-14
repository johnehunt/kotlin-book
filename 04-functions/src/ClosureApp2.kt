var inc: (Int) -> Int = { x -> x + 1 }

fun main() {
    println(inc(5))
    resetFunc()
    println(inc(5))
}

fun resetFunc() {
    // Local val is bound and stored in function
    // as it is used within the function body
    val addition = 50
    inc = { a -> a + addition }
}