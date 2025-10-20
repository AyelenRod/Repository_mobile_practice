## mapas (#3)

Si comúnmente seleccionas elementos de una `List` usando claves, tiene sentido optimizar usando un `Map` en lugar de una `List`.

Cambia la implementación interna de la clase `Cage` para almacenar elementos en un `Map` en lugar de una `List`. Para obtener un elemento, utiliza la función miembro `getValue()`, que lanza `NoSuchElementException` si la clave no existe.