open class Person (protected val firstName: String, private val lastName: String) {
    var tax: Float = 10.0f
        get() = 1 - field * 0.01f


    var salary: Float = 0f
        set(value){
            field = value * 1000
        }
        get() = field * tax

    fun fullName() = "$firstName $lastName"

    open fun showWork() = "Tomando cursos..."



}