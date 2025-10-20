class Libro (var titulo:String, var autor:String) {
    var estaPrestado = false

    fun prestarLibro(){
        estaPrestado = true
        println("El libro $titulo ha sido prestado.")
    }


}