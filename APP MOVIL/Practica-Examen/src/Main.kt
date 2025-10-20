//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val libro = Libro("Romeo y Julieta", "William Shakespeare")
    println("Estado inicial de la propiedad 'estaPrestado' : ${libro.estaPrestado}")
    libro.prestarLibro()
    println("Estado de la propiedad 'estaPrestado' después de llamar a prestarLibro(): ${libro.estaPrestado}")
}