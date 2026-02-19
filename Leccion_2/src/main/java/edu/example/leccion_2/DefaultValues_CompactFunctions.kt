package edu.example.leccion_2

import java.util.Random
import java.util.*


fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun main(args: Array<String>) {
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter

    feedTheFish2()
    println(shouldChangeWater(randomDay(), 20, 50))
    println(shouldChangeWater2(randomDay(), 20, 50))
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}
fun shouldChangeWater2 (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}

fun feedTheFish2() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun getDirtySensorReading(): Int {
    val dirty = Random().nextInt(50)
    return dirty
}

