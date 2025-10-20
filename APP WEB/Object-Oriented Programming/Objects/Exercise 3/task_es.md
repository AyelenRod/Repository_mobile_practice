## Objetos (#3)

Empezando con:

```kotlin
interface AdventureGame {
  interface Environment
  interface Character
  val environment: Environment
  val characters: MutableList<Character>
  fun populate()
}
```

Define una clase `Jungle` que sea un `Environment`, y clases `Monkey` y `Snake` que sean cada una `Character`s. Dentro de cada clase, coloca un `object Factory` con una función `create()`. Dale a `Monkey` y `Snake` un `toString()` que devuelva su nombre de clase.

Ahora define un `object MonkeysVsSnakes` que sea un `AdventureGame`, usando las diversas funciones `create()` para inicializarlo. `populate()` solo necesita agregar un `Monkey` y un `Snake`. El `main()` predefinido probará tu código.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcto" cuando ejecutas "Check".
¡Por favor compara tu solución con la proporcionada! </sub>