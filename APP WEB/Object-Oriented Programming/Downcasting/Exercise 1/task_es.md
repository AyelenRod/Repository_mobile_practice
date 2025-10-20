## Conversión descendente (#1)

Modifica `NarrowingUpcast.kt` para llamar a las funciones en la interfaz extendida. Primero, cambia `Derived1` y `Derived2` agregando llamadas a `trace` para cada función. El argumento `trace` es el nombre de la clase y la función. Por ejemplo `fun h() = trace("Derived2.h()")`.

Ahora escribe una función `checkAndCall(b: Base)` que llame a la función miembro polimórfica, luego use un `when` para hacer la conversión descendente y llame a las funciones de la interfaz extendida.

<sub> Esta tarea no contiene pruebas automáticas, 
por lo que siempre se marca como "Correcto" cuando ejecutas "Check". 
¡Por favor, compara tu solución con la que se proporciona! </sub>