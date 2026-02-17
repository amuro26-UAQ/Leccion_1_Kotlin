package edu.example.leccion1

fun main () {
    //var rocks: Int = null
    var marbles: Int? = null


    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

    fishFoodTreats = fishFoodTreats?.dec()
    fishFoodTreats = fishFoodTreats?.dec() ?: 0

    val len = s!!.length   // throws NullPointerException if s is null

}