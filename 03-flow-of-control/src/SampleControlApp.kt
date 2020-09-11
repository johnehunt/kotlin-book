fun main() {
//    for (i in 0 until 10) {
//        print("$i ")
//        if ((i % 2) == 1) {
//            continue
//        }
//        println("hey its an even number")
//        println("we love even numbers")
//    }
//    println("Done")

    println("----------------")

    outer@ for (i in 1..4) {
        println("i = $i")
        for (j in 1..4) {
            val result = i + j
            if (result == 5) continue@outer
            println("\t$i + $j = $result ")
        }
    }
}