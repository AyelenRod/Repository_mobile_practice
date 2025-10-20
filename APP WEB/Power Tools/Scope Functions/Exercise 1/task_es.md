## Funciones de Ámbito (#1)

El código inicial define `class NumPair`. En `main()`, crea `val np1` y
inicialízalo con `NumPair(10, 20)` con un ámbito `apply` que sume 5 a `x`
y 6 a `y`. Usa `eq` para verificar el resultado de `np1`. Ahora crea `val np2` e
inicialízalo con `NumPair(30, 40)` que tiene un ámbito `also` que suma 7 a
`x` y 8 a `y`. Usa `eq` para verificar el resultado de `np2`.

Define `val result1` inicializado con `np1.run` donde la lambda suma los
resultados de `add()`, `subtract()`, y `multiply()`. Usa `eq` para verificar el
resultado. Duplica esta funcionalidad creando `result2` usando `let` y
`result3` usando `with`.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>