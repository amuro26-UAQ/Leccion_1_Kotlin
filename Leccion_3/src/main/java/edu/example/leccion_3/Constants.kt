package edu.example.leccion_3


const val rocks = 3

object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

