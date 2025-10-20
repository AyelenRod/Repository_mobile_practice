## Resumen 1 (#4)

Este ejercicio modifica `Overflow.kt` para probar `Long` y `Double`. Implementa
`testLong()` para mostrar el valor máximo de `Long` incrementado por `1`. Haz que
`testDouble()` muestre el valor máximo de `Double` incrementado por `1`. Haz que
`testDouble2()` muestre el resultado de verificar si `Double.MAX_VALUE` y
`Double.MAX_VALUE + 1` son iguales.

El tipo `Double` generalmente ocupa 64 bits en memoria.
Debido a las limitaciones de memoria, `Double` representa números con cierta
precisión.
Puedes leer más sobre su representación interna en
[Wikipedia](https://es.wikipedia.org/wiki/Double-precision_floating-point_format).

La constante `Double.MAX_VALUE` tiene un significado especial: contiene el mayor
valor finito positivo de `Double`. No puedes incrementarlo; si intentas añadir
un número positivo, resulta en el mismo valor máximo. Funciona de manera algo
similar a `Double.POSITIVE_INFINITY`: es una constante con un tratamiento especial
que contiene el valor de infinito positivo de `Double`. Puedes usar estas constantes
para comparaciones con valores regulares de `Double`.