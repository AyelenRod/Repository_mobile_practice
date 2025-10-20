## Declaraciones de desestructuración (#1)

Usando `Pairs.kt` como modelo, escribe una función `calculate(n1: Int, n2: Int)`
que devuelva un `Triple` que contenga un `Boolean` y dos `Int`. Si `n1` o `n2` son menores que cero, la función devuelve un `Triple` que contiene `false` y dos ceros. De lo contrario, devuelve un `Triple` que contiene:

+ `true`

+ La suma de `n1` y `n2`

+ `n1` multiplicado por `n2`

El código inicial contiene un `main()` con pruebas, mostrando la diferencia entre desempaquetar el `Triple` usando `first`, `second` y `third` frente a una declaración de desestructuración.