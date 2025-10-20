## Lambdas de extensión (#1)

Define las siguientes funciones para que se comporten igual que sus equivalentes en la biblioteca estándar:

- `createString()` se comporta como `buildString()`. Comienza creando una nueva instancia de `StringBuilder`, llama al argumento lambda de extensión sobre ella, y luego devuelve el resultado `String`.

- `createList()` se comporta como `buildList()`. Esta función tiene un parámetro genérico. Crea un `ArrayList<T>`, llama al argumento lambda de extensión sobre ella, y devuelve una `List` de solo lectura.

- `createMap()` se comporta como `buildMap()`. Esta función tiene dos parámetros genéricos. Crea un `HashMap<K, V>`, llama al argumento lambda de extensión sobre ella, y devuelve un `Map` de solo lectura.

El código en `main()` prueba tus funciones contra las versiones de la biblioteca estándar. Nota que `buildList()` y `buildMap()` infieren sus parámetros genéricos.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcto" cuando ejecutas "Verificar". ¡Por favor, compara tu solución con la proporcionada! </sub>