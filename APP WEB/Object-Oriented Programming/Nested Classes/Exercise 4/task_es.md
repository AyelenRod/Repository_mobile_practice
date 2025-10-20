## Clases anidadas (#4)

Mejora la implementación del patrón *State* en `Ticket.kt`. Cambia `Seat` de una enumeración a una `clase abstracta` no anidada, con una subclase anidada para cada tipo de `Seat`. `Seat` contiene funciones miembro `abstract` para `upgrade()` y `meal()`. También hay un `toString()` para `Seat` que produce el `simpleName` de la subclase específica.

`Ticket` ahora se convierte en un contenedor simple para un objeto `Seat`, junto con las funciones `upgrade()` y `meal()` que trasladan sus acciones al objeto `Seat`.

Bonus (Desafiante): ¿Por qué no puedes usar delegación para `seat` en `Ticket`?

<sub> Esta tarea no contiene pruebas automáticas, así que siempre se marca como "Correcta" cuando ejecutas "Check". Por favor, compara tu solución con la proporcionada. </sub>