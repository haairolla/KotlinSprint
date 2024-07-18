package org.example.lesson_1

fun main() {

    val crystall = 7
    val iron = 11
    val baff = 20
    val sum = 100

    val crystalWithBaff = (crystall * baff) / sum
    val ironWithBaff = (iron * baff) / sum

    println("Бонус благодаря баффу: " + crystalWithBaff + " кристалл")
    println("Бонус благодаря баффу: " + ironWithBaff + " железа")

}