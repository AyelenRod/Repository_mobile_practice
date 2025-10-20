fun main(){
    fun main() {
        println("Ingresa un número para calcular la sumatoria:")
        val n = readLine()?.toIntOrNull() ?: return // Salir si la entrada no es un número válido

        println("--- Usando el bucle FOR ---")

        var sumaFor = 0
        // El bucle 'for' es la forma más idiomática y concisa para este problema
        for (i in 1..n) {
            sumaFor += i
        }
        println("La suma (con for) es $sumaFor")

        println("\n--- Usando el bucle WHILE ---")

        var sumaWhile = 0
        var contadorWhile = 1
        // El bucle 'while' requiere que manejes el contador manualmente
        while (contadorWhile <= n) {
            sumaWhile += contadorWhile
            contadorWhile++
        }
        println("La suma (con while) es $sumaWhile")
    }

}