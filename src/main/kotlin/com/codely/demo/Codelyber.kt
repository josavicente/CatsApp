package com.codely.demo

import java.time.LocalDate

fun main() {
    println("Please enter a date with the format <yyyy-MM-dd>")
    val inputDate = LocalDate.parse(readLine())
    println("You wrote $inputDate ${inputDate.dayOfWeek}")
}