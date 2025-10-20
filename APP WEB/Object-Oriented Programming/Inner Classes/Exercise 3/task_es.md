## Clases internas (#3)

Define una `clase Container<T>(iterable: Iterable<T>)` con una propiedad `items`
que es un `MutableList<T>`. Inicializa `items` usando `iterable` como su fuente de datos. Incluye una función `add(x: T)` que agrega un elemento a `items`. Define una función miembro `selector()` que devuelve un objeto de una clase interna anónima que implementa:

```kotlin
interface Selector<T> {
  fun end(): Boolean
  fun current(): T
  fun next()
}
```

- `end()` indica si estás al final de la `Lista` `items`.

- `current()` devuelve el elemento actual al que apunta el `Selector`.

- `next()` avanza al siguiente elemento en la `Lista`.

Define una función independiente `<T> traceAll(select: Selector<T>)` que utiliza
`select` para agregar todos los valores de `current()` a `trace`, luego
devuelve `trace`.

Ahora haz que `Container` herede de `Iterable<T>`, y añade una función llamada
`iterator()` que devuelve una instancia de una clase interna anónima que hereda
de `Iterator<T>`. Añade una función independiente `<T> traceAll2(ib: Iterable<T>)`
que produzca el mismo comportamiento que `traceAll()`.

El código inicial contiene un `main()` con pruebas para verificar tu código.

<sub> Esta tarea no contiene pruebas automáticas,
así que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>