import kotlin.math.sqrt

class Raices (var a: Int, var b: Int, var c: Int) {

    val Discriminante: Double = (b*b -4*a*c).toDouble()

    fun obtenerRaices(){
        if (tieneRaices()){
            val Discrim = getDiscriminante()
            println("Solucion 1: " + (-b + sqrt((b*b).toDouble() - (4*a*c))) /(2*a))
            println("Solucion 2: " + (-b - sqrt((b*b).toDouble() - (4*a*c))) /(2*a))
        }
    }

    fun obtenerRaiz(): Double{

    }

    fun getDiscriminante(): Double{
        return Discriminante

    }

    fun tieneRaices(): Boolean{
        if (Discriminante >= 0){
            return true
        }else {
            return false
        }

    }

    fun tieneRaiz(): Boolean{
        if (Discriminante == 0.0){
            return true
        }else{
            return false
        }
    }

    fun calcular(){

    }
}