package org.example.lesson_5

fun main() {

    print("Введите ваш год рождения: ")
    val userYear = readln().toInt()
    val userAge = THIS_YEAR - userYear

    if(userAge >= USER_AGE_MIN) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен!")
    }


}

const val THIS_YEAR = 2024
const val USER_AGE_MIN = 18