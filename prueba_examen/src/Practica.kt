open class Persona(private var nombre: String, private var edad: Int = 18) {

    // Constructor secundario solo con nombre
    constructor(nombre: String) : this(nombre, 18)

    fun getNombre(): String {
        return nombre
    }

    fun setNombre(nuevoNombre: String) {
        nombre = nuevoNombre
    }

    fun getEdad(): Int {
        return edad
    }

    fun setEdad(nuevaEdad: Int) {
        edad = nuevaEdad
    }
}

