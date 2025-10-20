import kotlin.collections.mutableListOf

class School(var name: String, var address: String, val active: Boolean = true, var numCode: String = "") {
    //var name: String = "UP"
    var staff = mutableListOf<String>()
    private var typeSchool : TypeSchool = TypeSchool.PUBLIC

    init{
        staff = mutableListOf() // Inicializar la lista vacía
    }

    constructor(): this("", "")
    constructor(name: String, address: String, staff: MutableList<String>) : this(name, address) {
       this.staff = staff
    }

    fun mensaje() {
        println("Hola, bienvenidos a $name")
    }

    fun setType(type: TypeSchool){
        this.typeSchool = type
    }

    fun getType(): String{
        return this.typeSchool.type
    }

    override fun toString(): String {
        if (active){
            return if(staff.size > 0){
                "name: $name at $address with staff: ${staff.size} members"
            } else
            return "name: $name at $address"
        }
        else
            return "escuela inactiva"
    }

    companion object { //simula las variables estaticas, no son propiedades de una clase
       const val INACTIVE = false
       const val ACTIVO = true

        //const cuando sabemos que valor tiene y val es cuando no sabemos el valor
    }

}