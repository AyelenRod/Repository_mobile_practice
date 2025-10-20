## Objetos Companion (#3)

Crea esta clase:

```kotlin
data class ID(
  val name: String,
  val id: String = idGenerator()
) {
  companion object {
    // ...
    private fun idGenerator() = TODO()
    fun test(n: Int) = List(n) {
      ID(('a' + it).toString())
    }
  }
}
```

`ID` solo contiene un objeto companion con `idGenerator()` y el código para
soportar esa función: el `size` de cada `id`, un generador de números aleatorios
sembrado con el valor `47`, y una `source` de los caracteres usados para crear
aleatoriamente el `id`. En `main()`, la salida se verifica usando `test()`, que
genera una `List` de `n` objetos `ID` -- modifica tu código hasta que coincida con
la salida de `test()` en `main()`.

Ahora completa esta clase:

```kotlin
class Bank(val name: String) {
  // Cuentas solicitadas, pero no completadas:
  private val applied = TODO()
  private val accounts = TODO() // Completadas
  private class Account(val name: String) {
    var id: ID? = null
    private var number: Long? = null
    fun addID(verifiedID: ID) = TODO()
    companion object Numbers {
      private fun nextAccountNumber() = TODO()
    }
    fun finish() = TODO()
    override fun toString() = "$id $number"
  }
  fun applyForAccount(name: String) = TODO()
  fun addID(id: ID) = TODO()
  fun completeAccount(verifiedID: ID) = TODO()
  override fun toString() =
    accounts.joinToString("\n")
}
```

Este es un ejemplo del patrón *Builder*, para una clase que requiere múltiples
pasos durante la creación del objeto. `applyForAccount()` comienza la creación de un nuevo
`Account` y lo agrega a la lista `applied`. `addID()` agrega un objeto `ID` al
`Account`, y `completeAccount()` toma un `ID`, agrega un `number` de cuenta,
y mueve el `Account` de `applied` a la lista `accounts`.

El código de inicio en `main()` validará tu solución.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>