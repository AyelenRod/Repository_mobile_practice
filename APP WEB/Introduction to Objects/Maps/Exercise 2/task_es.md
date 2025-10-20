## Mapas (#2)

Los objetos `Cage` almacenan `Hamster`s. `Cage` tiene un tamaño fijo, por lo que no puedes poner otro `Hamster` en un `Cage` si ya está lleno.

Para este ejercicio, los `Hamster`s se almacenan en una `List`. En el próximo ejercicio, se usará `Map` en lugar de `List`.

Implementa `get(name: String)` como una función miembro de `Cage` para que devuelva el `Hamster` con `name`. Si no hay un `Hamster` con ese `name`, lanza `NoSuchElementException`.