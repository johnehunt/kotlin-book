package com.jjh.sealed

sealed class Genre

object Fiction : Genre() {
    override fun toString() = "Fiction"
}

object Technical : Genre() {
    override fun toString() = "Technical"
}

object History : Genre() {
    override fun toString() = "History"
}