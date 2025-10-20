## Manejo de excepciones (#3)

El código inicial contiene una clase `DataBase` y excepciones asociadas, y una clase `NetConnection` y excepciones asociadas. También hay una enumeración `Status` para reportar `Success` y `Failed` como una alternativa a las excepciones.

Tu objetivo es completar la función `transact()`, que contiene referencias a una `DataBase` y dos `NetConnection`. El código inicial muestra cómo abrir la `DataBase`.

En la función anidada `transfer(net: NetConnection): Status` debes escribir código para abrir `net`, leer de él, y escribir los resultados en la `DataBase`. También debes capturar excepciones y devolver `Failed` si ocurre alguna. Como la última parte de `transfer()`, la cláusula `finally` cierra `net` y maneja las excepciones de eso. Si logras completar `transfer()` con éxito, devuelve `Success`.

El resto de `transact()` llama a `transfer()` para cada uno de los objetos `NetConnection`, revisando el resultado y devolviendo `Failed` desde `transact()` si `transfer()` devuelve `Failed`. Por último, una cláusula `finally` intenta cerrar el objeto `DataBase`.

Muchas de las funciones miembro de `DataBase` y `NetConnection` toman parámetros de `id: Int` y `level: Int`. El `id` es un número diferente para cada llamada diferente, y `transact()` toma un parámetro `level` que se pasa a cada llamada. En las definiciones de las funciones miembro verás que el `id` se compara con el `level` para decidir si lanzar una excepción. De esta manera, todas las diferentes posibilidades de excepción se prueban una por una, pasando diferentes valores de `level` en el código inicial de `main()`.

Debes considerar si una operación lanza una excepción, *y* si puedes hacer algo para recuperarte de esa excepción. Por ejemplo, si abrir la base de datos falla dentro de `transact()`, no hemos perdido ningún dato, por lo que simplemente podemos `return Failed` y el programa puede intentar de nuevo. Pero si cerrar la base de datos falla, significa que no conocemos el estado de la base de datos y probablemente deberíamos lanzar la excepción en lugar de devolver `Failed`. En cambio, una falla al cerrar una conexión de red no es particularmente problemática.

De nuevo, observa lo rápido que las cosas se complican al intentar recuperarse de todos los posibles fallos.

<sub> Esta tarea no contiene pruebas automáticas, así que siempre se marca como "Correcta" cuando ejecutas "Check". ¡Por favor, compara tu solución con la proporcionada! </sub>