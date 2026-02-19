package edu.example.lambdas_y_funciones_de_orden_superior

fun main() {
    val instrumentos = listOf(
        Pair("Osciloscopio Digital", 1500.0),
        Pair("Voltímetro Digital", 120.0),
        Pair("Generador de Ondas", 980.0),
        Pair("Cable BNC", 15.0),
        Pair("Resistencia 1kΩ", 0.10),
        Pair("Protoboard", 25.0)
    )

    println("Taller: Laboratorio de automatización")

    instrumentos.forEach { println("${it.first} -> ${it.second}") }

    val costosos = instrumentos.filter { it.second > 500 }
    println("\nInstrumentos costosos (> 500):")
    costosos.forEach { println(it.first) }

    val menosCostosos = instrumentos.filter { it.second > 100 }
    println("\nInstrumentos menos costosos (> 100):")
    menosCostosos.forEach { println(it.first) }

    val nombres = instrumentos.map { it.first }
    val costos = instrumentos.map { it.second }
    println("\nNombres de instrumentos:")
    nombres.forEach { println("${it} cuesta ${costos[nombres.indexOf(it)]}") }

    val total = instrumentos.sumOf { it.second }
    println("\nCosto total del laboratorio: $total")

    val total100 = instrumentos.filter { it.second > 100 }.sumOf { it.second }
    println("\nCosto total del laboratorio(>100): $total100")


    val ordenados = instrumentos.sortedBy { it.second }
    println("\nInstrumentos ordenados por precio:")
    ordenados.forEach { println("${it.first} - ${it.second}") }


    val ordenadosDecendiente = instrumentos.sortedByDescending { it.second }
    println("\nInstrumentos ordenados por precio descendiente:")
    ordenadosDecendiente.forEach { println("${it.first} - ${it.second}") }


    val costosos2 = filtrarInstrumentos(instrumentos) { it.second > 500 }
    println("\n(Con función de orden superior) Costosos (> 500):")
    costosos2.forEach { println(it.first) }
    val costososCable = filtrarInstrumentos(instrumentos) { it.first.contains("Cable") }
    println("\n(Con función de orden superior) Cables:")
    costososCable.forEach { println(it.first) }


    val nombres2 = transformarInstrumentos(instrumentos) { it.first }
    println("\n(Con función de orden superior) Nombres:")
    nombres2.forEach { println(it) }

    val costos2 = transformarInstrumentos(instrumentos) { it.second }
    println("\n(Con función de orden superior) Costos:")
    costos2.forEach { println(it) }


    val total2 = calcular(instrumentos) { lista -> lista.filter { it.first.contains("Digital") }.sumOf { it.second } }
    println("\n(Con función de orden superior) Total: $total2")
}

fun filtrarInstrumentos(
    lista: List<Pair<String, Double>>,
    criterio: (Pair<String, Double>) -> Boolean
): List<Pair<String, Double>> {
    return lista.filter(criterio)
}

fun <T> transformarInstrumentos(
    lista: List<Pair<String, Double>>,
    transformacion: (Pair<String, Double>) -> T
): List<T> {
    return lista.map(transformacion)
}

fun calcular(
    lista: List<Pair<String, Double>>,
    operacion: (List<Pair<String, Double>>) -> Double
): Double {
    return operacion(lista)
}