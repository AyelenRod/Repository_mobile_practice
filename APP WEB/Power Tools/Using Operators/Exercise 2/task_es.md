## Usando operadores (#2)

Define una función `create()` que produzca una `MutableList` que contenga diez
`Int`s, inicializados a los valores del 0 al 9.

Cada función restante primero rastrea su nombre de función.

- `assignAppendIncrementContains()`: Llama a `create()` y captura el resultado en
  `list`. Establece el último elemento de `list` en 99, luego añade 100 a `list`.
  Incrementa este nuevo último elemento y rastrea la lista. Finalmente, rastrea
  si 101 está presente en `list`.

- `minus()`: Llama a `create()` y captura el resultado en `val list`. Rastrea la
  `list` con el elemento 5 removido. Rastrea la lista con los elementos 5, 6, 7
  y 8 removidos. Rastrea la lista con el elemento 10 removido. Usa "decrementar-igual" para eliminar los elementos 0, 1 y -1 y rastrea el resultado.

- `plus()`: Crea una `var list` añadiendo 11, 12 y 13 al resultado de
  `create()`. Usa "incrementar-igual" para añadir 14, y rastrea el resultado.

El código inicial en `main()` prueba tu trabajo.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor, compara tu solución con la que se proporciona! </sub>