## downcasting (#2)

Modifica `FindType.kt` para usar `filterIsInstance()`. Primero encuentra todos los objetos `Dog`, luego mapea cada uno de los objetos resultantes en `bark()` y prueba el resultado usando `atomictest.eq`. Observa que `filterIsInstance()` produce una secuencia de objetos `Dog` ya convertidos.

Hay una segunda forma, más dinámica, de `filterIsInstance()`, que toma un *objeto de clase* como parámetro. Pasa `Dog::class.java` como el argumento a `filterIsInstance()`, con el resto de la expresión como se describe en el párrafo anterior. ¿En qué se diferencia esta versión de `filterIsInstance()` de la versión que utiliza un argumento genérico?

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor, compara tu solución con la que se proporciona! </sub>