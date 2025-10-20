## Clases selladas (#1)

Modifica `SealedClasses.kt`. Primero, mueve la propiedad `capacity` de `Bus` a la clase `Transport` y añade `trace("size ${transport.capacity}")` después de la expresión `when` en `travel()`. Luego, añade nuevas subclases:

- `Tram`, que contiene un `val route: String`
- `Plane`, que contiene un `val flightNumber: String`

Modifica `travel()` para acomodar estas nuevas subclases. Añade `Tram` y `Plane` a la `List` en `main()`.