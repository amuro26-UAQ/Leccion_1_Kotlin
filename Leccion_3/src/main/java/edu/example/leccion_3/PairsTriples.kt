package edu.example.leccion_3

fun main () {
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")


    val (tool, use) = equipment
    println("$tool is used for $use")

    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")

    val numbers2 = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers2
    println("$n1 $n2 $n3")


    val list = listOf(1, 5, 3, 4)
    println(list.sum())

    //val list2 = listOf("a", "bbb", "cc")
    //println(list2.sumBy { it.length })
    val list2 = listOf("a", "bbb", "cc")
    for (s in list2.listIterator()) {
        println("$s ")
    }
    val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
    println (scientific.get("guppy"))
    println(scientific.get("zebra fish"))

    //println("scientific.get("swordtail"")

    println(scientific.getOrDefault("swordtail", "sorry, I don't know"))

    println(scientific.getOrElse("swordtail") {"sorry, I don't know"})

}