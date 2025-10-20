## Limpieza de recursos (#3)

El objetivo de este ejercicio es verificar que, independientemente de cómo salga tu código de un bloque `use()`, la función `close()` se llame siempre. Reutiliza la clase `Cleanup` que creaste en el Ejercicio 2, la cual está incluida en el código inicial, junto con un `enum class Option { Normal, Return, Throw }`.

Define una función `verifyClose(opt: Option)`. `verifyClose()` crea un objeto `Cleanup` e invoca `use()` sobre él. La lambda para `use()` contiene una expresión `when` que implementa estas reglas. Cuando `opt` es:

- `Normal`: Se llama a `f()`, luego a `g()` (dentro de la expresión `when`), y después a `h()`, antes de salir del bloque `use()`.

- `Return`: Se llama a `f()` y luego se hace `return`. Esto sale a la mitad del bloque `use()`.

- `Throw`: Se llama a `f()` y luego se lanza una `Exception` desde el medio del bloque `use()`.

`main()` prueba tu código.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcto" cuando ejecutas "Check". Por favor, compara tu solución con la proporcionada. </sub>