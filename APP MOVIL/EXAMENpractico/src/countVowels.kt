import kotlin.text.iterator

fun countVowels(text: String): Int{
    return text.lowercase().count() {it in "aeiou"}
}

fun main (){
    println("Ingrese una cadena de texto")

    var text = readln().toString()
    val vocales = countVowels(text)
    println("La cadena de texto es $text y tiene $vocales vocales")
}

