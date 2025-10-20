## Polimorfismo (#3)

Crea una interfaz llamada `Connection` con una función miembro `send(mensaje: String)`. Implementa esta interfaz como `Text`, `Phone` y `Email`. En cada implementación, sobrescribe `send()` de modo que llame a `trace()` con un `String` como `"'$mensaje' vía Texto"` (para la clase `Text`).

Ahora crea una clase `Message` que tome como argumentos del constructor un `val texto: String` y un `val connection: Connection`. Define una función miembro `transmit()` que envíe el `texto`.

El código en `main()` prueba tu solución.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcto" cuando ejecutas "Verificar". ¡Por favor, compara tu solución con la proporcionada! </sub>