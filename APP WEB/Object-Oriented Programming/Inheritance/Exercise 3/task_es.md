## Herencia (#3)

El código inicial contiene la jerarquía de clases:

- `Game`
- `BoardGame` que hereda de `Game`
- `Chess` que hereda de `BoardGame`

Agrega una propiedad `val initOrder = mutableListOf<String>()` a `Game`. Da a cada clase una cláusula `init` que agregue el nombre de su clase a `initOrder`. En `main()`, crea un objeto `Chess` y muestra el orden de inicialización de las clases base.