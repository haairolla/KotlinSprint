package org.example.lesson_4

fun main() {

    val isSunnyToday: Boolean = true
    val isTentOpenToday: Boolean = true
    val todayWetness: Int = 20
    val todaySeason: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunnyToday == isSunny && isTentOpenToday == isTentOpen && todayWetness == needWetness && todaySeason == needSeason}")

}

const val isSunny: Boolean = true
const val isTentOpen: Boolean = true
const val needWetness = 20
const val needSeason = "Не зима"