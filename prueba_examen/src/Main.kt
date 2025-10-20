//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Ingresa una cantidad para crear tu pocion multijugos")
    var cantidad = readln().toInt()
    if (cantidad > 100) {
        println("¡Felicidades, es una buena pocion multijugos")
    } else {
        println("La pocion es mediocre, sangre sucia inmunda")
    }
}