package org.example.lesson_1

fun main() {

    val totalSeconds = 6480
    val hour = totalSeconds / 3600
    val lastSeconds = totalSeconds - hour * 3600
    val minute = lastSeconds / 60
    val seconds = lastSeconds % 60

    print(String.format("0") + hour + ":" + minute + ":" + String.format("0") + seconds)
}