## Funciones de ámbito (#3)

El código de inicio incluye una definición para `class Math`. Crea una instancia de `Math` con un ámbito `run`. Dentro de ese ámbito, define `val z` que se inicializa llamando a `np(11, 7)` con un ámbito `apply`. Dentro de ese ámbito, llama a `add() + subtract()` y después de cerrar el ámbito, llama a `calc()`. Usa `eq` para comprobar que el resultado es 77. El valor de retorno del ámbito `run()` es `z + add()`; usa `eq` para comprobar que el resultado es 1077.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcto" cuando ejecutas "Check". ¡Por favor, compara tu solución con la que se proporciona! </sub>