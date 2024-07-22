package org.example.lesson_4

fun main() {

    val isSunnyToday: Boolean = true
    val isTentOpenToday: Boolean = true
    val todayWetness: Int = 20
    val todaySeason: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunnyToday == IS_SUNNY && isTentOpenToday == IS_TENT_OPEN && todayWetness == NEED_WETNESS && todaySeason == NEED_SEASON}")

}

const val IS_SUNNY: Boolean = true
const val IS_TENT_OPEN: Boolean = true
const val NEED_WETNESS = 20
const val NEED_SEASON = "Не зима"