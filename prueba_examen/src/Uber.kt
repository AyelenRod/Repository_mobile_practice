fun main(){
    println("Ingrese la distancia del conductor en km \n")
    var distance = readln().toDouble()

    println("¿El conductor esta disponible?")
    var conductor = readln().toBoolean()

    if (conductor == true){
        println("Disponible")
    }else{
        println("No disponible")
    }

    if (distance <= 0.5 && conductor == true){
        println("Listo para iniciar recorrido")
    }
    else if(distance <= 0.5 && conductor == false){
        println("Conductor cercano pero no disponible")
    }
    else if(distance > 0.5 && conductor == true){
        println("Conductor disponible pero muy lejos, aplicara tarifas mas altas")
    }
    else if(distance > 0.5 && conductor == false){
        println("No hay conductores disponibles")
    }
}