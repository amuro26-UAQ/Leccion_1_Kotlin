package edu.example.leccion_3

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

   /* println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")*/

    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main () {
    makeFish()
}

