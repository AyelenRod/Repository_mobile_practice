class Student(var Studentname: String) : Person (Studentname){
    companion object{
        const val STUDENT_NAME = "Ayelen"
        fun createUnitStudent() : Student{
            return Student(STUDENT_NAME)
        }
    }


}