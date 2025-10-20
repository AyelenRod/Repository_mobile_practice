fun main() {
    println("Ingrese la distancia del conductor en km")
    val distance = readLine()?.toDoubleOrNull() ?: 0.0

    println("¿El conductor está disponible? (true/false)")
    val conductor = readLine()?.toBooleanStrictOrNull() ?: false

    when {
        // Opción 1: Conductor disponible y muy cerca
        distance <= 0.5 && conductor -> {
            println("Disponible") // Mensaje de disponibilidad
            println("Listo para iniciar recorrido")
        }
        // Opción 2: Conductor cerca pero no disponible
        distance <= 0.5 && !conductor -> {
            println("No disponible") // Mensaje de no disponibilidad
            println("Conductor cercano pero no disponible")
        }
        // Opción 3: Conductor disponible pero lejos
        distance > 0.5 && conductor -> {
            println("Disponible") // Mensaje de disponibilidad
            println("Conductor disponible pero muy lejos, aplicará tarifas más altas")
        }
        // Opción 4: Conductor lejos y no disponible
        distance > 0.5 && !conductor -> {
            println("No disponible") // Mensaje de no disponibilidad
            println("No hay conductores disponibles")
        }
    }
}