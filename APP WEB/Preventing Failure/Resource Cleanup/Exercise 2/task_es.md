## Limpieza de recursos (#2)

Crea tu propia clase `AutoCloseable` llamada `Cleanup`, que contenga `f()`, `g()`,
`h()` y `close()` que usen `trace()` para mostrar `"f()"`, `"g()"`, `"h()"`
y `"close()"`, respectivamente. En `main()`, crea un objeto `Cleanup` y llama a
`f()`, `g()` y `h()` mediante `use()`.

<sub> Esta tarea no contiene pruebas automáticas,
así que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor compara tu solución con la proporcionada! </sub>