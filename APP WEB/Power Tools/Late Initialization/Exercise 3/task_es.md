## Inicialización tardía (#3)

El código inicial proporciona:

```kotlin
data class Generator(val id: Int)

class Turbine(val id: Int) {
  private lateinit var _generator: Generator
  val generator: Generator
...
```

Agrega un `get()` para `generator` que verifique si `_generator` ha sido inicializado, y si no, lo inicializa antes de devolver `_generator`. Agrega un `toString()` que comience con "Generator $id running: " y luego indique si el generador está en funcionamiento.

El código inicial proporciona:

```kotlin
class PowerPlant(nTurbines: Int = 4) {
  private val turbines: List<Turbine> =
...
```

Termina la inicialización para `turbines`, luego agrega `fun generator(number: Int): Generator` que verifique que `number` esté en el rango, y luego devuelva el generador deseado. Finalmente, agrega una función miembro `status()` que use `forEach` para mostrar el estado de cada generador en la `PowerPlant`. El código en `main()` prueba tu solución.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcto" cuando ejecutas "Check". ¡Por favor, compara tu solución con la proporcionada! </sub>