## Delegación de Propiedades (#3)

Crea una clase genérica que comience:

```kotlin
class Holder<E> {
  private var list = listOf<E>()
```

Define `getValue()` y `setValue()` para `Holder`, de modo que puedas
escribir exitosamente:

```kotlin
class Holders {
  var strings by Holder<String>()
  var ints by Holder<Int>()
  var bools by Holder<Boolean>()
}
```

El código de inicio en `main()` prueba tu solución.

<sub> Esta tarea no contiene pruebas automáticas,
así que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor compara tu solución con la proporcionada! </sub>