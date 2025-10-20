## Funciones locales (#2)

La función `createCounter()` crea un par de funciones para manejar un `contador`. En lugar de crear una clase, manipulamos el `contador` usando solo funciones.

En `createCounter()`, define una variable local `counter`. Luego, define dos funciones locales:

+ `inc()`: incrementa el valor de `counter` en uno

+ `value()`: devuelve el valor del `counter`

Finalmente, devuelve un par de referencias de funciones a estas funciones locales:

`return Pair(::inc, ::value)`

Las dos funciones locales capturan la misma variable local `counter`. Este estilo de manejo de estado es comúnmente utilizado en lenguajes de programación funcional pura que no tienen clases.