## Registro de Logs (#2)

Comenzando con la solución del Ejercicio 3 en [Manejo de Excepciones], utiliza
`atomiclog` para registrar las excepciones en el archivo `Logger` `"LoggingSoln2.txt"`. Necesitarás modificar `transact()`:

- Añade una llamada a la función `error()` de `Logger` antes de que se lance cualquier excepción desde
  `transact()`.

- Reemplaza las excepciones no recuperables con llamadas a `error()`.

- Busca en el código donde ninguna de las excepciones sea recuperable, y reescríbelo si es posible para registrar en `error()` y fallar, en lugar de tener múltiples cláusulas `catch`.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>