package org.example.lesson_4

fun main() {

    println("Есть ли повреждения на корпусе?")
    val isDamage = readln().toBoolean()
    println("Введите текущий состав экипажа")
    var crewComplement = readln().toInt()
    println("Введите количество ящиков с провизией на борту")
    var provisions = readln().toInt()
    println("Благоприятная ли погода для плавания?")
    val isWeatherFavor = readln().toBoolean()

    println("Корабль может отправиться в плавание: ${isDamage == IS_DAMAGE && crewComplement in CREW_COMPLEMENT_MIN..CREW_COMPLEMENT_MAX 
            && provisions >= PROVISIONS_MIN && isWeatherFavor == IS_WEATHER_FAVOR || crewComplement == CREW_COMPLEMENT_MAX && 
            isWeatherFavor == IS_WEATHER_FAVOR && provisions >= PROVISIONS_MIN}")

}
const val CREW_COMPLEMENT_MIN = 55
const val CREW_COMPLEMENT_MAX = 70
const val PROVISIONS_MIN = 50
const val IS_DAMAGE = false
const val IS_WEATHER_FAVOR = true