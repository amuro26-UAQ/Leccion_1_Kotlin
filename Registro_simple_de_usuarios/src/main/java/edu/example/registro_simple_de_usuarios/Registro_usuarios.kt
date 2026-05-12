package edu.example.registro_simple_de_usuarios

fun main() {

    var nombre: String = "Angel David Muro Gonzalez"
    var nombreVal: Boolean = true
    var edad: Int = 25
    var edadVal: Boolean = true
    var acceso: Boolean = false
    var email: String? = null
    var entradaEmail: String? = null
    var suscrito: Boolean = true
    var respuestaSuscripcion: String? = null


   while (nombreVal) {
    println("Por favor, ingresa tu nombre:")
    nombre = readln()
       if(nombre == null){
           nombreVal = true
       }
       else {
           nombreVal = false
       }
   }

    while (edadVal) {
        println("Ingresa tu edad:")
        edad = readln().toInt()
        if(edad == null){
            edadVal = true
        }
        else {
            edadVal = false
        }
    }

    println("Ingresa tu email:")
    email = readlnOrNull()?: "Email no registrado"



    println("¿Estás suscrito? (si/no):")
    respuestaSuscripcion = readlnOrNull()?.lowercase()
    suscrito = respuestaSuscripcion == "si"


    println("--- Información del Usuario ---")
    println("Nombre: $nombre")

    if (esMayorDeEdad(edad)) {
        println("Estado: Acceso permitido")
        acceso = true
    } else {
        println("Estado: Acceso denegado")
        acceso = false
    }

    println("Email: $email")

    // 6. Uso de when para clasificar por edad
    var clasificacion = when (edad) {
        in 0..12 -> "Niño"
        in 13..17 -> "Adolescente"
        in 18..64 -> "Adulto"
        else -> "Adulto mayor"
    }
    println("Categoría: $clasificacion")
    println("Suscripción activa: ${if (suscrito) "Sí" else "No"}")

    println("\n--- Lista de Usuarios Registrados ---")
    var listaUsuarios: MutableList<String> = mutableListOf()
    listaUsuarios.add("Juan Pérez")
    listaUsuarios.add("María García")
    listaUsuarios.add("Carlos López")
    listaUsuarios.add("Ana Martínez")
    if (acceso==true) {
        listaUsuarios.add(nombre)
    }

    for (usuario in listaUsuarios) {
        println("- $usuario")
    }
}


fun esMayorDeEdad(edad: Int): Boolean {
    return edad >= 18
}