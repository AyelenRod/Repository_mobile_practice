## Pruebas unitarias (#3)

Prueba la clase `SpaceShipControls` de `ClassDelegation/SpaceShipControls.kt`.
Usa una velocidad de 10 para cada prueba. Verifica que se crea un nuevo objeto de prueba para cada prueba imprimiendo "init" cada vez que se crea un objeto de prueba.

En lugar de llamar a `assertEquals()` de `kotlin.test` directamente, añade la siguiente función genérica en el alcance del archivo:

```kotlin
infix fun <T> T.aeq(actual: T) = assertEquals(this, actual)
```

Para usar `aeq`: *valorEsperado* `aeq` *valorReal*.

<sub> Esta tarea no contiene pruebas automáticas,
así que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor compara tu solución con la proporcionada! </sub>