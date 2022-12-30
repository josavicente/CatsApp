package com.codely.demo

import java.time.LocalDate
import java.time.Period
import kotlin.system.exitProcess

fun main() {
    println("Please enter your birthday with the format <yyyy-MM-dd>")
    supportNullableString(readLine()).takeUnless {
        it.isNullOrEmpty() || it.isNullOrBlank()
    }?.let{ line ->
        val inputDate = LocalDate.parse(line).also{
            println("You wrote $it")
        }
        with(Period.between(inputDate, LocalDate.now())) {
            println("The difference between the date you wrote and today is ${this.years}")
        }

    }

}

fun supportNullableString(line: String?) = line
