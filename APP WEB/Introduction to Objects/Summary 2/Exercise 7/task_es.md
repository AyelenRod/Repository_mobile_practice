## Resumen 2 (#7)

Convierte un número natural en un número en el sistema de números romanos.

Números romanos:
1000 = M, 900 = CM, 500 = D, 400 = CD, 100 = C, 90 = XC,
50 = L, 40 = XL, 10 = X, 9 = IX, 5 = V, 4 = IV, 1 = I.

Por ejemplo: 23 = XXIII, 44 = XLIV, 100 = C.

<div class="hint">

Realiza la conversión en pasos. Usa una variable auxiliar `remainder`
(resto) para almacenar la parte restante del entero convertido y la variable `result`
para almacenar la representación resultante en números romanos. En cada paso,
el `number` inicial equivale a la suma de `remainder` y `result`.

Almacena los números romanos en un mapeo de `Int` a la representación de `String`
asociada. Para cada par `int = roman` comenzando desde `1000 = M`:

- Divide `remainder` por `int` para descubrir cuántas veces necesitas repetir
  `roman` en el `result`.

- Resta el resultado de `remainder` para actualizarlo:
  `remainder -= remainder / int`.

</div>