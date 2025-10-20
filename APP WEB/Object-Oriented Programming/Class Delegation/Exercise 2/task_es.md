## Delegación de clases (#2)

El ejercicio 1 en [Herencia y Extensiones] utiliza
composición para adaptar `Crocodile` a trabajar con `interactWithDuck()`. Esto
produce una inconsistencia al usar `CrocoDuck` con la
función `interactWithCrocodile()` — el `crocodile` compuesto debe ser nombrado explícitamente
durante la llamada:

```kotlin
interactWithCrocodile(honestlyDuck.crocodile)
```

Modifica la solución a ese ejercicio usando delegación de clases para que puedas llamar
a una función `interactWithCrocodile(honestlyDuck)`. Haz que el parámetro `crocodile` de
`CrocoDuck` sea `private` para que *no* puedas exponer la propiedad.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcto" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>