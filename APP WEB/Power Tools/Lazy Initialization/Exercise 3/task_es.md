## Inicialización Perezosa (#3)

No utilices tipado explícito en este ejercicio, para demostrar que el tipo se infiere del resultado del inicializador `lazy`.

Crea dos clases, `A` y `B`, cada una con un `init` que utiliza `trace()` para anunciar "constructor de <nombre de la clase>". Añade las siguientes propiedades `val` `lazy`:

- `b` en `A`, que inicializa perezosamente un objeto `B`.
- `i` en `A`, que inicializa perezosamente un `Int` a `1`.
- `j` en `B`, que inicializa perezosamente un `Int` a `2`.

Cada inicializador perezoso debe trazar "Inicializando <nombre de la clase>.<nombre de la propiedad>".

En `B`, añade `fun g()` que produce `j`. En `A`, añade `fun f()` que produce `i + b.g()`.

En `main()`, añade un `val a` inicializado perezosamente que traza su inicialización como se indicó anteriormente y luego produce un objeto `A`. El resto de `main()` es un código inicial que prueba tu solución.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcto" cuando ejecutas "Check". ¡Por favor, compara tu solución con la proporcionada! </sub>