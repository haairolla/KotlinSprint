package org.example.lesson_5

fun main() {

    val randomNumOne = 5
    val randomNumTwo = 2
    val rightAnswer = randomNumOne + randomNumTwo

    println("Вычислите пример: '$randomNumOne + $randomNumTwo' и введите свой ответ")
    val userNum = readLine()!!.toInt()

    if (userNum == rightAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }

}