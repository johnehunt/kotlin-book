package com.jjh.sealed

fun describe(x: Trade): String {
    return when (x) {
        is EquityTrade -> "EquityTrade"
        is FxTrade -> "FxTrade"
        is InterestRateSwap -> "An InterestRateSwap"
        is Swaption -> "A Swaption"
        else -> "Unknown"
    }
}

fun main() {
    println(describe(EquityTrade("IBM")))
    println(describe(FxTrade("GBP", "USD")))
    println(describe(InterestRateSwap(5.0, 3.4)))
    println(describe(Swaption("Bermudan")))
}