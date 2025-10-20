## Herramientas de Delegación de Propiedades (#2)

El código inicial define una `data class` llamada `Flag` que contiene un `Boolean` llamado `b` con un valor predeterminado de `false`. En `main()`, crea tres `var`s: `d` de tipo `Double`, `s` de tipo `String` y `f` de tipo `Flag`, todos delegados a `notNull()`. Para `d` y `f`, utiliza declaraciones de tipo explícitas, pero para `s` usa un parámetro de tipo para `notNull()`.

Usando `capture` de `atomictest`, intenta leer `d`, `s` y `f` antes de que se inicialicen y valida la salida usando `atomictest.eq`. Luego establece `d` en `1.1`, `s` en `"yes"` y `f` en `Flag(true)` y usa `eq` para verificar que todos adopten los nuevos valores.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcto" cuando ejecutas "Check".
¡Por favor, compara tu solución con la que se proporciona! </sub>