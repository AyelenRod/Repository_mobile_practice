## Объекты-компаньоны (#2)

Начните с этих двух интерфейсов:

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

Создайте два класса, `Checkers` и `Chess`, которые наследуют `BoardGame`. Дайте им обоим `private` конструкторы без аргументов. Каждый класс должен содержать `companion object Factory: GameFactory`, который вызывает `createBoard()` в своем конструкторе. Каждый объект-компаньон содержит `const val max`, которая используется внутри `move()`. Определения `playGame()` и `main()` предоставлены; завершите код в `Checkers` и `Chess`, чтобы он удовлетворял тестам в `main()`.

<sub> Эта задача не содержит автоматических тестов, поэтому она всегда помечается как "Correct", когда вы запускаете "Check". Пожалуйста, сравните свое решение с предоставленным! </sub>