package org.example.lesson_5

fun main() {

    var winNumOne = 22
    var winNumTwo = 5

    println("Нужно угадать два числа от 0 до 42")
    print("Введите первое число: ")
    val userNumOne = readln().toInt()
    print("Введите второе число: ")
    val userNumTwo = readln().toInt()

    if (userNumOne == winNumOne && userNumTwo == winNumTwo) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if(userNumOne == winNumTwo && userNumTwo == winNumOne) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if(userNumOne == winNumOne || userNumTwo == winNumTwo) {
        println("Вы выиграли утешительный приз!")
    } else if(userNumOne == winNumTwo || userNumTwo == winNumOne) {
        println("Вы выиграли утешительный приз!")
    } else if(userNumOne != winNumOne && userNumTwo != winNumTwo) {
        println("Неудача!")
    }

}