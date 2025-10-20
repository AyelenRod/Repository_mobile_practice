## Verificar instrucciones (#1)

Crea una función `f(s: String): String`. Añade llamadas a `require()` que utilicen las siguientes cadenas de error (infiera las pruebas de las cadenas):

- `"s no debe estar vacío, es [$s]"`

- `"s no debe estar en blanco, es [$s]"`

- `"s debe contener 3 partes separadas por '-', es [$s]"`

Si todas las llamadas a `require()` tienen éxito, devuelve `s`.

Crea una función `g(d: Double): Double` que utilice `require()` para asegurarse de que `d` sea mayor que cero y menor o igual a 10.0. No proporciones un mensaje de error personalizado para `require()`. Si el `require()` tiene éxito, devuelve `d`.

El código inicial en `main()` prueba `f()` y `g()`.

<sub> Esta tarea no contiene pruebas automáticas, 
por lo que siempre se marca como "Correcta" cuando ejecutas "Check". 
¡Por favor, compara tu solución con la que se proporciona! </sub>