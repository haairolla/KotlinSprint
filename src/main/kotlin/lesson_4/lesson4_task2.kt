package org.example.lesson_4

fun main() {

    val averageWeightMin = 35
    val averageWeightMax = 100
    val averageSizeMax = 100

    val cargoOneWeight = 20
    val cargoOneSize = 80

    val cargoTwoWeight = 50
    val cargoTwoSize = 100

    println("Груз с весом $cargoOneWeight кг и обьемом $cargoOneSize л соответствует категории 'Average:' ${cargoOneWeight >= averageWeightMin && cargoOneWeight <= averageWeightMax && cargoOneSize <= averageSizeMax} ")
    println("Груз с весом $cargoTwoWeight кг и обьемом $cargoTwoSize л соответствует категории 'Average:' ${cargoTwoWeight >= averageWeightMin && cargoTwoWeight <= averageWeightMax && cargoTwoSize <= averageSizeMax} ")

}