## Sobrecarga de Operadores (#1)

Crea una clase que comience:

```kotlin
class WrapRange(
  val range: IntRange,
  private var current: Int = range.start
) {
```

Escribe funciones miembro para que puedas incrementar y decrementar un objeto `WrapRange`, pero `current` se mantenga automáticamente dentro de `range`.

Haz las modificaciones necesarias para que el código inicial en `main()` produzca la salida del ejercicio mostrada.

<sub> Esta tarea no contiene pruebas automáticas, 
por lo que siempre se marca como "Correcto" cuando ejecutas "Check". 
¡Por favor compara tu solución con la proporcionada! </sub>