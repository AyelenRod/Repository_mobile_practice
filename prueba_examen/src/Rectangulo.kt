class Rectangulo(val base: Double, val altura: Double) {

    fun getArea(): Double{
        return base * altura
    }

    fun getPerimetro(): Double{
        return base * 2 + altura * 2
    }

    fun esCuadrado(): Boolean{
        return base == altura

    }

    fun mostrarDimensiones() {
        println("El area del rectangulo es: ${getArea()}")
        println("El perimetro del rectangulo es: ${getPerimetro()}")
        println("El rectangulo es un cuadrado? ${esCuadrado()}")
        println("La base del rectangulo es: $base")
        println("La altura del rectangulo es: $altura")
    }

}

fun main(){
    val rectangulo = Rectangulo(10.0, 20.0)
    rectangulo.mostrarDimensiones()
}