// Illustrates use of continue and break within a
// when expression and a for loop
// Only supported in Kotlin 1.4 onwards

fun main() {
    for (i in 0..10) {
        when (i) {
            2 -> continue
            4 -> break
            else -> println(i)
        }
    }
}