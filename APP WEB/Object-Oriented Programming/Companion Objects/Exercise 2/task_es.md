## Objetos companion (#2)

Empieza con estas dos interfaces:

```kotlin
interface BoardGame {
  fun move(): Boolean
  companion object {
    fun createBoard() {
      trace("BoardGame.createBoard()")
    }
  }
}

interface GameFactory {
  fun create(): BoardGame
}
```

Crea dos clases, `Checkers` y `Chess`, que hereden de `BoardGame`. Dales a ambas constructores `private` sin argumentos. Cada clase debe contener un `companion object Factory: GameFactory` que llame a `createBoard()` en su constructor. Cada objeto companion contiene un `const val max` que se utiliza dentro de `move()`. Se proporcionan las definiciones de `playGame()` y `main()`; completa el código en `Checkers` y `Chess` para que satisfaga las pruebas en `main()`.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcta" cuando ejecutas "Check". ¡Por favor, compara tu solución con la proporcionada! </sub>