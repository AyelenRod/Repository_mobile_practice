## Clases de datos (#2)

Crea una función de extensión llamada `transferTicket()` que copie un objeto `AirlineTicket`, reemplazando `firstName` y `lastName` con los nuevos valores durante la copia:

```kotlin
fun AirlineTicket.transferTicket(
  otherFirstName: String,
  otherLastName: String
): AirlineTicket
```