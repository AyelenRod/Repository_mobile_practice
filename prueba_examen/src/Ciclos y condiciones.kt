fun main() {

    //Condicion if-else
    val edad = 20

    if (edad >= 18) {
        println("Eres mayor de edad.")
    } else {
        println("Eres menor de edad.")
    }

    //If como expresion
    val edad2 = 16
    val mensaje = if (edad2 >= 18) {
        "Puedes votar."
    } else {
        "Aún no puedes votar."
    }
    println(mensaje)

    //If/Else-If/Else
    val calificacion = 85

    if (calificacion >= 90) {
        println("Excelente")
    } else if (calificacion >= 80) {
        println("Muy bien")
    } else if (calificacion >= 70) {
        println("Bien")
    } else {
        println("Necesitas mejorar")
    }

    //When basico
    val dia = 3

    when (dia) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> println("Día inválido")
    }

    //Whe como expresion
    val numero = 2
    val tipo = when (numero) {
        1, 3, 5, 7, 9 -> "Impar"
        2, 4, 6, 8, 10 -> "Par"
        else -> "Otro número"
    }
    println("El número $numero es $tipo.")

    //Ciclo for
    // Itera del 1 al 5
    for (i in 1..5) {
        println("Número: $i")
    }

    // Itera del 5 al 1 (descendente)
    for (i in 5 downTo 1) {
        println("Número: $i")
    }

    // Itera de 1 a 10, de 2 en 2
    for (i in 1..10 step 2) {
        println("Número: $i")
    }

    //Ciclo for con array
    val frutas = arrayOf("Manzana", "Pera", "Naranja")

    // Itera sobre los elementos
    for (fruta in frutas) {
        println("Fruta: $fruta")
    }

    // Itera con el índice y el valor
    for (i in frutas.indices) {
        println("La fruta en la posición $i es ${frutas[i]}.")
    }

    //Ciclo while
    var contador = 0
    while (contador < 5) {
        println("El contador es: $contador")
        contador++
    }

    //Ciclo do-while
    var numero2 = 5
    do {
        println("El número es: $numero2")
        numero2++
    } while (numero2 < 5)
}

