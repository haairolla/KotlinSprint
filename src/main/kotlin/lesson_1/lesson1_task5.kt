package org.example.lesson_1

fun main() {

    val totalSeconds = 6480
    val hourToSec = 3600
    val totalTime = 60

    val hour = totalSeconds / hourToSec
    val lastSeconds = totalSeconds - hour * hourToSec
    val minute = lastSeconds / totalTime
    val seconds = lastSeconds % totalTime

    print(String.format("%02d:%02d:%02d", hour, minute, seconds))
}