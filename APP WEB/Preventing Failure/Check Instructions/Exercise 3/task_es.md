## Verificar instrucciones (#3)

Este ejercicio explora más a fondo los rangos, introducidos en [Bucles &
Rangos], y muestra cómo se pueden usar con instrucciones de verificación.

Crea una clase `Level` con dos argumentos de constructor: `val range: IntRange`,
y `private var level: Int`. `level` tiene un argumento por defecto que es el valor inferior de `range`. El constructor debe asegurar que `level` es uno de los valores dentro de `range`.

Añade una propiedad de solo lectura `value` que genere el valor de `level`.

Añade una función `up()` que incremente `level` solo si el resultado está dentro de `range`, y una función `down()` que decremente `level` solo si el resultado está dentro de `range`. Finalmente, añade una función `set(new: Int)` que primero asegure que `new` está dentro de `range` y luego asigne `new` a `level`.

`Level` se prueba con el código inicial en `main()`.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcto" cuando ejecutas "Verificar".
¡Por favor, compara tu solución con la que se proporciona! </sub>