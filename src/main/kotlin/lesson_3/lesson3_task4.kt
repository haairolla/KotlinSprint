package org.example.lesson_3

fun main() {

    val playerOne = "White"
    val playerTwo = "Black"
    var moveFrom = "E2"
    var moveTo = "E4"
    var strokeNumber = 1

    println("Игрок $playerOne начал ход из $moveFrom в $moveTo, номер хода $strokeNumber")

    moveFrom = "D2"
    moveTo = "D4"
    strokeNumber = 2

    println("Игрок $playerTwo начал ход из $moveFrom в $moveTo, номер хода $strokeNumber")

}