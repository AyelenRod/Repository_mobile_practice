## Manejo de Excepciones (#1)

Crea `Hamster` como una `data class` con un parámetro de constructor de `val name: String`.

Ahora crea una clase `HamsterCageException` que herede de `Exception`. `HamsterCageException` toma un parámetro de constructor `val msg: String` y sobrescribe `toString()` para que produzca `"HamsterCageException: $msg"`. Crea tres excepciones que hereden de `HamsterCageException`:

- `CageFullException(val limit: Int)`: Llama al constructor de la clase base con `"Jaula llena > $limit"`.

- `NoSuchHamsterException(val id: String)`: Llama al constructor de la clase base con `"No Hamster $id"`.

- `OutOfWaterException`: Llama al constructor de la clase base con `"Jaula sin agua"`.

Crea la clase `HamsterCage(val capacity: Int)`. No puedes poner otro `Hamster` en una `HamsterCage` si ha alcanzado la `capacidad`.

En `HamsterCage`, guarda los `Hamsters` en un `HashSet`. Escribe las siguientes funciones miembro:

- `add(h: Hamster)` lanza `CageFullException(capacity)` si la jaula ha alcanzado la `capacidad`.

- `get(name: String)` lanza `NoSuchHamsterException(name)` si no se puede encontrar un `Hamster` con ese `name`.

- `feed()` genera un número aleatorio entre 0 y 10 y lanza `OutOfWaterException()` si el resultado es mayor que 8. Si tiene éxito, devuelve `"Alimentación completa"`.

El código inicial contiene una `List` inicializada de `Hamsters`. Escribe una función `test(hc: HamsterCage)` que pruebe cada función miembro:

- `add()` intentando añadir cada objeto en `hamsters`.

- `get()` usando como `name` el primer `Hamster` en `hamsters`, luego usa `"Morty"`.

- Llama a `feed()` tres veces.

`test()` llama a `trace()` para cualquier operación que produzca un resultado. En cada caso, captura la potencial excepción y llama a `trace()` sobre esa excepción.

`main()` contiene código inicial pasando un `HamsterCage` a `test()`, y el resultado esperado para `trace`.

Considera la complejidad del código resultante y evalúa qué excepciones podrían ser reemplazadas con código común no excepcional. 

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcta" cuando ejecutas "Comprobar".
¡Por favor compara tu solución con la que se proporciona! </sub>