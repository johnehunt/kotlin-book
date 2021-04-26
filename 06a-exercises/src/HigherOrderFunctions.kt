
fun myHigherOrderFunction(i: Int, func: (Int) -> Int): Int {
    return func(i)
}

fun doubler(i: Int) = i * 2
fun tripler(i: Int) = i * 3

fun main() {
    println(myHigherOrderFunction(5) { it + 1 })
    println(myHigherOrderFunction(5) { it - 1 })
    println(myHigherOrderFunction(5) { it * 2 })

    println(myHigherOrderFunction(5, fun (i: Int): Int {
        return i + 2
    }))

    println(myHigherOrderFunction(5, ::doubler))
    println(myHigherOrderFunction(5, ::tripler))
}