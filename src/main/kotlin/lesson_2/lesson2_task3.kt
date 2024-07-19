package org.example.lesson_2

fun main() {

    val trainExitHour = 9
    val trainExitMinute = 39
    val totalMinuteSum = (trainExitHour * HOUR_TO_MINUTE) + trainExitMinute


    val travelTime = 457
    val timeToMinute = travelTime % HOUR_TO_MINUTE
    val arrivalTime = (totalMinuteSum + travelTime) % HOUR_TO_MINUTE


    print(String.format(("%02d:%02d"), arrivalTime, timeToMinute))

}

const val HOUR_TO_MINUTE = 60