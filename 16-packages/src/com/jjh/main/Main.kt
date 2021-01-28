package com.jjh.main

import com.jjh.util.Person
import com.jjh.util.Course.present
import com.jjh.util.add
import com.jjh.util.CarTypes.GOLD

fun main() {
    val p = Person("John", 55)
    println(p)

    present()

    println(add(4, 5))

    val cardType = GOLD
}