## Inicialización tardía (#2)

Crea una clase `A` que contenga un `String` con `lateinit` llamado `s`, y una función `initialize()` que establezca `s` a "Initialized" y devuelva `this`.

Crea una clase `B` que contenga una propiedad `a` usando inicialización `lazy` para crear e inicializar una `A`. El código en `main()` prueba tu solución.

Si `A` es la biblioteca que alguien más ha creado y que estás usando, la inicialización `lazy` puede ser una forma conveniente de configurar sus propiedades `lateinit`.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcta" cuando ejecutas "Check". ¡Por favor, compara tu solución con la proporcionada! </sub>