package org.example.lesson_4

fun main() {

    val day = 1
    val isEven = day % 2 == 1
    val isNotEven = day % 2 == 0


    println("""
        Упражнения для рук:    $isEven
        Упражнения для ног:    $isNotEven
        Упражнения для спины:  $isNotEven
        Упражнения для пресса: $isEven
    """.trimIndent())


}