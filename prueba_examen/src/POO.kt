fun main (){
    println("POO")
    println("Clases")
    println(School().name) //instanciar la clase

    println("Constructor")
    println(School("UP", "Suchiapa"))

    println("Metodos y override")
    val school = School("politecnica", "Suchiapa", false)
    school.mensaje()

    println("This")
    val juan = Person("Juan", "Perez")
    val pedro = Person("Pedro", "Lopez")
    val hughSchool = School("cecyt", "real del bosque", mutableListOf("juan", "pedro", "maria"))
    println(hughSchool)

    println("Metodos y propiedades pt2")
    println(juan.fullName())
    println(juan.showWork())
    juan.salary = 1000f
    println(juan.salary)
    println("Set  y get")
    pedro.salary = 500f
    pedro.tax = 20f
    println(pedro.salary)

    println("Herencia")
    val teacher = Teacher("Ana", "Gomez", 30)
    hughSchool.staff.add(teacher.fullName())
    val admin = Admin("Luis", "Martinez", 101)
    hughSchool.staff.add(admin.fullName())
    println(hughSchool)

    println("Encapsulamiento")
    //println(teacher.firstName)
   // println(teacher.lastName)
    println(teacher.fullName())

    println("Companion object y constantes")
    val schoolActive = School("politecnica", "Suchiapa", School.INACTIVE)
    println(schoolActive)

    println("enum class")
    school.setType(TypeSchool.PUBLIC)
    println(school.getType())


}
