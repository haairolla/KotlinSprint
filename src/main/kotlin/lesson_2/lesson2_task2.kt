package org.example.lesson_2

fun main() {

    var permEmployees = 50
    var salaryPerm = 30000
    var interns = 30
    var salaryInterns = 20000

    val permEmployeesExpenses = permEmployees * salaryPerm
    val totalSalary = permEmployeesExpenses + (interns * salaryInterns)
    val averageSalary = totalSalary / (permEmployees + interns)

    println("Зарплата постоянных работников: " + permEmployeesExpenses)
    println("Общая зарплата всех сотрудников: " + totalSalary)
    println("Средняя зарплата всех сотрудников: " + averageSalary)
}