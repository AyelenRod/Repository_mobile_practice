class Teacher(firstName: String, lastName: String, var students: Short) : Person(firstName, lastName) {
    override fun showWork(): String {
        return super.showWork()
    }
}