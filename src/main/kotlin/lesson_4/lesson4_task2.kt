package org.example.lesson_4

fun main() {

    val cargoOneWeight = 20
    val cargoOneSize = 80

    val cargoTwoWeight = 50
    val cargoTwoSize = 100

    println("Груз с весом $cargoOneWeight кг и обьемом $cargoOneSize л соответствует категории 'Average:' ${cargoOneWeight in AVERAGE_WEIGHT_MIN ..AVERAGE_WEIGHT_MAX && cargoOneSize <= AVERAGE_SIZE_MAX} ")
    println("Груз с весом $cargoOneWeight кг и обьемом $cargoOneSize л соответствует категории 'Average:' ${cargoTwoWeight in AVERAGE_WEIGHT_MIN ..AVERAGE_WEIGHT_MAX && cargoTwoSize <= AVERAGE_SIZE_MAX} ")

}

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_SIZE_MAX = 100