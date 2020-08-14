fun factorial(n: Int): Int {
    return if (n == 1)
        1 // Base case
    else
        n * factorial(n - 1) // Recursive call
}

fun spacer(str: String, times: Int) {
    for (i in 0..times) {
        print(str)
    }
}

fun factorial2(n: Int, depth: Int = 1): Int {
    return if (n == 1) {
        spacer("\t", depth)
        println("Returning 1")
        1 // Base case
    } else {
        spacer("\t", depth)
        println("Recursively calling factorial(${n-1})")
        val result = n * factorial2(n - 1, depth + 1) // Recursive call
        spacer("\t", depth)
        println("Returning: $result")
        result
    }
}

tailrec fun factorialTailRec(acc: Int = 1, n: Int): Int {
    // Termination condition
    return if (n == 1)
        acc // Base case
    else
        factorialTailRec(acc * n, n - 1) // Tail Recursive call
}

// Method isn't tail recursive
fun bang(x: Int): Int {
    return if (x == 0) throw RuntimeException("Bang!")
    else bang(x - 1) + 1
}

tailrec fun bangTailRec(x: Int): Int {
    return if (x == 0)
        throw Exception("Bang!")
    else
        bangTailRec(x - 1)
}

class Processor {
    tailrec fun bangTailRecMethod(x: Int): Int {
        return if (x == 0)
            throw Exception("Bang!")
        else
            bangTailRecMethod(x - 1)
    }
}

fun main() {
    println(factorial(5))
    //println("Calling factorial2(5)")
    //println(factorial2(5))

    // println(factorialTailRec(n = 5))
    // println(bang(4))
    // println(bangTailRec(4))
    // val processor = Processor()
    // processor.bangTailRecMethod(4)
}
