package com.jjh.sealed

import com.jjh.sealed.TypeDescripter.describe

sealed class Trade(protected val id: Int=0) {
    var counterParty: String = ""
    fun printId() {
        println(id)
    }
}

class EquityTrade(val name: String) : Trade()
class FxTrade(val currency1: String, val currency2: String) : Trade()
class InterestRateSwap(val fixedRate: Double, val floatingRate: Double) : Trade()
class Swaption(val data: String) : Trade()

object TypeDescripter {
    fun describe(x: Trade): String {
        return when (x) {
            is EquityTrade -> "EquityTrade"
            is FxTrade -> "FxTrade"
            is InterestRateSwap -> "An InterestRateSwap"
            is Swaption -> "A Swaption"
            else -> "Unknown"
        }
    }
}

fun main() {
    println(describe(EquityTrade("IBM")))
    println(describe(FxTrade("GBP", "USD")))
    println(describe(InterestRateSwap(5.0, 3.4)))
    println(describe(Swaption("Bermudan")))
}