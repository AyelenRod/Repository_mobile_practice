## Resumen 2 (#8)

Convierte de un número romano a un número natural. Por ejemplo: XXIII = 23, XLIV = 44, C = 100.

<div class="hint">

Simplemente itera sobre cada dígito en el número romano y calcula la respuesta. Recorre un número romano en orden inverso, un solo dígito a la vez (por ejemplo, `IV` contiene dos dígitos) y guarda el valor máximo encontrado hasta ahora. Si el siguiente dígito romano es mayor o igual al valor máximo actual, súmalo al resultado. Si es menor que el máximo, réstalo. Por ejemplo, para convertir `XLIV = 44`, itera sobre `VILX` que es el inverso de `XLIV`. Sumas `5`(`V`) y restas `1`(`I`) porque es menor que el máximo actual `5`(`V`), luego sumas `50`(`L`) y restas `10`(`X`) porque es menor que el máximo actualizado `10`(`X`):

| numeral | máximo actual  | acción |
| ------- |---------------|--------|
| V       | 5             | + 5    |
| I       | 5             | - 1    |
| L       | 50            | + 50   |
| X       | 50            | - 10   |

El resultado es `+ 5 - 1 + 50 - 10 = 44`

</div>