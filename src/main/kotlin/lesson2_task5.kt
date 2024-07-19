package org.example

import kotlin.math.pow

fun main() {

    val sum = 70000
    val year = 20
    val rate = 16.7
    val finallSum = sum * (1 + rate / 100).pow(year)
    print(String.format("%.3f", finallSum))

}