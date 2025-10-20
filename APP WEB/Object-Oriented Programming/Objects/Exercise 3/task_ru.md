## Объекты (#3)

Начнем с:

```kotlin
interface AdventureGame {
  interface Environment
  interface Character
  val environment: Environment
  val characters: MutableList<Character>
  fun populate()
}
```

Определите класс `Jungle`, который является `Environment`, и классы `Monkey` и
`Snake`, которые являются `Character`. В каждом классе разместите объект
`Factory` с функцией `create()`. Дайте `Monkey` и `Snake` метод `toString()`,
который возвращает имя их класса.

Теперь определите объект `MonkeysVsSnakes`, который является `AdventureGame`, используя различные функции `create()`, чтобы его инициализировать. `populate()` должен только добавить одну `Monkey` и одну `Snake`. Предопределенный `main()` протестирует ваш код.

<sub> Эта задача не содержит автоматических тестов,
поэтому при запуске "Check" она всегда отмечается как "Correct".
Пожалуйста, сравните ваше решение с предоставленным! </sub>