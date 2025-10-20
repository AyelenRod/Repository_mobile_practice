## Funciones de alcance (#2)

El código inicial utiliza la clase `SpaceShipControls` de `ClassDelegation/SpaceShipControls.kt`. Contiene un `main()` que comienza con:

```kotlin
fun main() {
  var velocity = 1
  with(SpaceShipControls()) {
    trace(forward(velocity))
```

Agrega llamadas a `right(velocity)` y `down(velocity)`, rastreando los resultados de cada una. En el cierre `}` de la función de alcance, encadena el resultado a un bloque `let`, que incrementa `velocity`, luego realiza las mismas operaciones. Al final de ese bloque, encadena a un bloque `run`, luego un bloque `apply` y un bloque `also`, realizando las mismas operaciones en cada bloque. Usa `trace` para verificar la salida.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcta" cuando ejecutas "Check". ¡Por favor, compara tu solución con la proporcionada! </sub>