## Uso de operadores (#3)

Crea una `data class N(var n: Int)` y hazla `Comparable`. Haz que `N` produzca una
representación `String` de `"N($n)"`. En `main()`, crea una `key` inicializada a
`N(11)`, y un `map` inicializado a un `MutableMap` que contenga una sola entrada,
con `key` mapeada a `47`. Rastrea `map[key]`. Ahora incrementa `n` y rastrea
`map[key]` de nuevo.

Crea una `List<N>` de tamaño cinco, inicializada automáticamente a `N(it)`, y
barájala usando el objeto `Random` proporcionado. Muestra la `List`, luego conviértela en un `SortedSet` y muéstrala para ver que está realmente ordenada. Encuentra el valor mínimo y suma dos a su `n`. Muestra el conjunto de nuevo para ver qué
sucedió.

Adapta tu código hasta que produzca el mismo resultado que se ve en la traza de salida.

El cálculo en `compareTo()` impacta numerosas operaciones incluyendo aquellas para
usar el objeto como clave en un `Map` y un elemento en un `Set`. Como muestra este ejercicio, debes ser muy reacio a permitir que los valores utilizados en el
cálculo de `compareTo()` varíen.

<sub> Esta tarea no contiene pruebas automáticas,
así que siempre se marca como "Correcta" cuando ejecutas "Comprobar".
¡Por favor compara tu solución con la proporcionada! </sub>