package com.jjh.exp.expressions

class Rational(n: Int, d: Int) {

    val numerator: Int
    val denominator: Int

    init {
        if (d == 0) {
            throw RuntimeException("Denominator cannot be Zero")
        }
        numerator = n
        denominator = d
    }

    override fun toString(): String {
        return "Rational(numerator=$numerator, denominator=$denominator)"
    }

}