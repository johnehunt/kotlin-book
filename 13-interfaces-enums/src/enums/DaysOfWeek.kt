package enums

enum class DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

fun main() {
    val day = DaysOfWeek.WEDNESDAY
    println(day)
    println(day < DaysOfWeek.FRIDAY)
    println(day < DaysOfWeek.MONDAY)
}