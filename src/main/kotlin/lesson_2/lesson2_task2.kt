package org.example.lesson_2

fun main() {

    var permEmployees = 50
    var salaryPerm = 30000
    var internss = 30
    var salaryInterns = 20000

    val permEmployeesExpenses = permEmployees * salaryPerm
    val totalSalary = permEmployeesExpenses + (internss * salaryInterns)
    val averageSalary = totalSalary / (permEmployees + internss)

    println("Зарплата постоянных работников: " + permEmployeesExpenses)
    println("Общая зарплата всех сотрудников: " + totalSalary)
    println("Средняя зарплата всех сотрудников: " + averageSalary)
}