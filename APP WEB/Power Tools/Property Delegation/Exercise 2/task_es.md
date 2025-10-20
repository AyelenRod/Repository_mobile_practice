## Delegación de propiedades (#2)

Comienza con:

```kotlin
class Delegator {
  private var list = List(8) { "$it" }
  var strings by list
}
```

Define `getValue()` y `setValue()` como funciones de extensión para `List<String>`
(Pista: IntelliJ IDEA generará esqueletos para ti). El código en `main()`
prueba tu solución.

BONUS: Intenta ajustar `getValue()` y `setValue()` para funcionar con:

```kotlin
class Delegator {
  var strings by List(8) { "$it" }
  ...
```

Y explica qué sucede.

<sub> Esta tarea no contiene pruebas automáticas, 
por lo que siempre se marca como "Correcta" cuando ejecutas "Verificar".
¡Por favor, compara tu solución con la proporcionada! </sub>