package org.example.lesson_2

fun main() {

    val trainExitHour = 9
    val trainExitMinute = 39

    val travelTime = 457
    val timeToHour = travelTime / 60
    val timeToMinute = travelTime / timeToHour

    var totalTimeHour = trainExitHour + timeToHour
    var totalTimeMinute = trainExitMinute + timeToMinute
    if (totalTimeMinute >= 60) {
        totalTimeMinute = totalTimeMinute - 60
        totalTimeHour++
    }

    print(String.format(("%02d:%02d"), totalTimeHour, totalTimeMinute))

}