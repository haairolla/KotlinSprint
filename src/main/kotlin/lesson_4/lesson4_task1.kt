package org.example.lesson_3

fun main() {

    val bookedToday = 13
    val bookedTomorrow = 4

    val bookedTodayResult = bookedToday <= TOTAL_TABLES_NUM
    val bookedTomorrowResult = bookedTomorrow <= TOTAL_TABLES_NUM

    println("Доступность столиков на сегодня: " + bookedTodayResult)
    println("Доступность столиков на завтра: " + bookedTomorrowResult)
}

const val TOTAL_TABLES_NUM = 13