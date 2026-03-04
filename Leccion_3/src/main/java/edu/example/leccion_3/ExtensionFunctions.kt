package edu.example.leccion_3

/*fun String.hasSpaces(): Boolean {
    val found = this.indexOf(' ')
    // also valid: this.indexOf(" ")
    // returns positive number index in String or -1 if not found
    return found != -1
}*/

fun String.hasSpaces() = indexOf(" ") != -1

class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant.isRed() = color == "red"    // OK
//fun AquariumPlant.isBig() = size > 50         // gives error


val AquariumPlant.isGreen: Boolean
    get() = color == "green"

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun main() {
    val plant: AquariumPlant? = null
    plant.pull()
}