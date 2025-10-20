## Constructores complejos (#3)

Muestra que se ejecutan varias secciones de inicialización en el orden de declaración. El código de inicio contiene la clase `MultipleInit` con una propiedad `val initOrder = mutableListOf<String>()`. Añade las `String`s `"one"`, `"two"` y `"three"` a la propiedad `initOrder` en tres bloques de `init` diferentes.