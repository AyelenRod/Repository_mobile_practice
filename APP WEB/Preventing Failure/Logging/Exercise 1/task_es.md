## Registro de eventos (#1)

El código de inicio incluye `class Level`, que es la solución del Ejercicio 3 de [Revisar Instrucciones].

Crea una clase llamada `Pipe` que tome `val level: Level` como un parámetro del constructor. Dale a este parámetro un argumento por defecto con un rango `0..10`.

Dentro de `Pipe`, define un `val logger` usando `atomiclog` con un archivo asociado `"PipeLog.txt"`. Crea una función miembro `checkLevel()` que use una expresión `when`. Cuando `value` sea:

- 2: llama a `trace()`
- 4: llama a `debug()`
- 6: llama a `info()`
- 8: llama a `warn()`
- 10: llama a `error()`

El mensaje del registro para cada llamada es simplemente "Level " seguido del valor coincidido. El código de inicio en `main()` prueba tu solución.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcta" cuando ejecutas "Check". ¡Por favor, compara tu solución con la proporcionada! </sub>