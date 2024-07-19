package org.example.lesson_4

fun main() {

    val weather = "Солнечная"
    val tent = "Открыт"
    val wetness = 20
    val season = "Зима"

    val trueOrNotWeather = weather.equals("Солнечная")
    val trueOrNotTent = tent.equals("Открыт")
    val trueOrNotSeason = season.equals("не Зима")

    println("Благоприятные ли условия сейчас для роста бобовых? ${trueOrNotWeather == true && trueOrNotTent == true && wetness == 20 && trueOrNotSeason == true}")

}