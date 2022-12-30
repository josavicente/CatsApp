package com.codely.demo

import java.time.LocalDate
import java.time.Period
import kotlin.system.exitProcess

fun main() {
    println("Please enter your birthday with the format <yyyy-MM-dd>")
    supportNullableString(readLine()).takeIf {
        !it.isNullOrEmpty() && !it.isNullOrBlank()
//        .takeUnless {
//        it.isNullOrEmpty() || it.isNullOrBlank()
    }?.let {
        LocalDate.parse(it)
    }.apply {
        if(this == null){
            println("The date is not valid")
            exitProcess(1)
        }
    }?.also{
            println("You wrote $it")
    }?.run{
        this.calculateDifference()
    }

}

fun supportNullableString(line: String?) = line

// Extension function (Como las extensiones en Swift
fun LocalDate.calculateDifference() = with(Period.between(this, LocalDate.now())) {
    when {
        // Podría no ponerse el; this, ya que lo infiere
        this.years > 0 -> println("The difference between the date you wrote and today is ${this.years} years")
        this.months > 0 -> println("The difference between the date you wrote and today is ${this.months} months")
        this.days > 0 -> println("The difference between the date you wrote and today is ${this.days} days")
    }
}