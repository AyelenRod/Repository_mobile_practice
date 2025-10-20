class Password (){
    var longitud: Int = 8
    var contrasena: String = ""

    init {
        generarPassword()
    }

    constructor(longitud: Int, contrasena: String) : this() {
        this.longitud = longitud
        this.contrasena = contrasena
    }
}


fun esFuerte(): Boolean{
    val mayuscula = contrasena.count { it.isUpperCase() }
    val miniscula = contrasena.count { it.isLowerCase() }
    val numero = contrasena.count { it.isDigit() }

    return mayuscula > 2 && miniscula  1 && numero > 5
}

fun generarPassword(){
    val
}

fun main(){

}