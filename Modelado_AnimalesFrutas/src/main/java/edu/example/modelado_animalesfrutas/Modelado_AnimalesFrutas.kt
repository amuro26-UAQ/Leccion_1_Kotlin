package edu.example.modelado_animalesfrutas

interface Comestible {
    fun formaDeComer(){

    }
    fun caloriasAportadas(){
    }

    abstract class Animal{
        abstract var nombre: String
        abstract var edad:Int
        abstract var peso:Double
        abstract var habitat:Habitat
        abstract var cuidador:Cuidador

        abstract fun hacerSonido()
        fun mostrarInfo(){

        }
    }

   abstract class Fruta{
       abstract var nombre: String
       abstract var color:Int
       abstract var peso:Double
       abstract var nivelDulzura:Int
       abstract var origen:Origen
       abstract var informacionNutricional:InformacionNutricional

       abstract fun tipoSabor()

       }

   }

class InformacionNutricional

class Origen

class Cuidador

class Habitat


class Leon : Comestible.Animal(){
    override fun hacerSonido() {
        println("rugido")
    }
}
class Gallina: Comestible.Animal(){
    override var nombre: String = "Gallina"

    override fun hacerSonido() {
        println("Cacareo")
    }
    override fun caloriasAportadas() {
        println("100")
    }
    override fun formaDeComer(): String {
        println("Asado")
        return "Asado"
    }

}
class Vaca: Comestible.Animal(){
    override fun hacerSonido() {
        println("Mugido")
    }
    }