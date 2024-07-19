package org.example.lesson_4

fun main() {

    var trainigDay = 2

    if(trainigDay % 2 == 1){
        val arms:Boolean = true
        val legs:Boolean = false
        val back: Boolean = false
        val abs: Boolean = true
        println("""
        Упражнения для рук:     $arms
        Упражнения для ног:     $legs
        Упражнения для спины:   $back
        Упражнения для пресса:  $abs
    """.trimIndent())
    } else {
        val arms:Boolean = false
        val legs:Boolean= true
        val back: Boolean = true
        val abs: Boolean = false
        println("""
        Упражнения для рук:     $arms
        Упражнения для ног:     $legs
        Упражнения для спины:   $back
        Упражнения для пресса:  $abs
    """.trimIndent())
    }



}