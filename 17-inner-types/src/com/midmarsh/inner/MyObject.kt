package com.midmarsh.inner

object MyObject {
    class Author(val name: String)
    interface Reviewable {
        fun review(): BooleanArray
    }
    object InnerObject {
        fun prettyPrint() {
            println("prettyPrint")
        }
    }
    enum class DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY
    }
}
