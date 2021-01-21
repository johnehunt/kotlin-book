package com.jjh.exp.func

fun main() {

    val r1 = runCatching {
        "32".toInt()
    }
    println(r1)
    println(r1.isSuccess)

    val r2 = runCatching {
        "32a".toInt()
    }
    println(r2)
    println(r2.isFailure)
    println(r2.exceptionOrNull())

    val result0 = runCatching {
        "32".toInt()
    }.getOrDefault(-1)
    println("result0 $result0")

    val result1 = runCatching {
        "32a".toInt()
    }.getOrElse {
        println(it)
        0
    }
    println("result1 $result1")

    val result2 = runCatching {
        "32a".toInt()
    }.getOrNull()
    println("result2 $result2")

    val result3 = runCatching {
        "32".toInt()
    }.getOrThrow()
    println("result3: $result3")

    runCatching { "32".toInt() }
        .map { println(it) }

    runCatching { "32a".toInt() }
        .map { println(it) }

    runCatching { "32a".toInt() }
        .recover {
            it.printStackTrace()
            -1 }
        .map { println(it) }

    runCatching {
        "32a".toInt()
    }.onFailure {
        when (it) {
            is NumberFormatException -> {
                print("Oops - number wasn't formatted correctly: ")
                println(it.message)
            }
            is Exception -> {
                println("some other exception")
                it.printStackTrace()
            }
            else -> throw it
        }
    }.onSuccess {
        println("All went well")
        println(it)
    }

}