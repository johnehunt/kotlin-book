package com.midmarsh.inner

enum class DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    object Util {
        const val DAY_TOTAL = 5
    }
    class Printer {
        override fun toString() = "Printer()"
    }
    interface Printable {
        fun convert(): String?
    }
}