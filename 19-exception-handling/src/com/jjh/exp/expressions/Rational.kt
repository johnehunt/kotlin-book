package com.jjh.exp.expressions

class Rational(val numerator: Int, d: Int) {
    val denominator: Int

    init {
        if (d == 0)
            throw RuntimeException("Denominator cannot be Zero")
        denominator = d
    }

    override fun toString()=
        "Rational($numerator, $denominator)"

}