
// Takes a function and an int
fun processor(x: Int, func: (Int) -> Int): Int {
    return func(x)
}


fun main() {
    // Anonymous function
    val increment = fun(i: Int)= i + 1
    println(processor(5, increment))

    // Lambda function
    val mult: (Int) -> Int = { x -> x * x }
    println(processor(5, mult))

    // Lambda declared inline
    println(processor(5, { x -> x - 1 }))

    // Idiomatic Kotlin form
    println(processor(5) { x -> x - 1 })

    // Short hand form - only available if just one parameter
    println(processor(5) { it - 1 } )

}