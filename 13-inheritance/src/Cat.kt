package com.jjh.overriding

open class Cat {
    open val dangerous = false
    open val name: String = "Sammy"
    override fun toString(): String = "$name is " +
            (if (dangerous) "dangerous" else " timid")
}

class Tiger(override val name: String) : Cat() {
    override val dangerous = true
}
