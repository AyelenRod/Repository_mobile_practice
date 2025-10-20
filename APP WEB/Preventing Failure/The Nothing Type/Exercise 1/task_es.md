## El tipo `Nothing` (#1)

Crea una clase de excepción llamada `Failure` que tome un parámetro `msg: String` y lo pase al constructor de la clase base. Escribe una función `fail(msg: String)` que pase `msg` a `trace()`, y luego lance un `Failure(msg)`.

Ahora escribe tus propias versiones de `require()` y `check()` (de [Instrucciones de Verificación]) que usen `fail()`. El código de inicio en `main()` prueba tus funciones.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcto" cuando ejecutas "Verificar". ¡Por favor, compara tu solución con la proporcionada! </sub>