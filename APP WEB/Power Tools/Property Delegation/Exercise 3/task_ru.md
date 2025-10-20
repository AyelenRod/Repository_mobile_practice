## Делегирование свойств (#3)

Создайте обобщённый класс, который начинается так:

```kotlin
class Holder<E> {
  private var list = listOf<E>()
```

Определите `getValue()` и `setValue()` для `Holder`, чтобы вы могли успешно написать:

```kotlin
class Holders {
  var strings by Holder<String>()
  var ints by Holder<Int>()
  var bools by Holder<Boolean>()
}
```

Начальный код в `main()` тестирует ваше решение.

<sub> Эта задача не содержит автоматических тестов, 
поэтому она всегда помечается как "Правильно", когда вы запускаете "Проверку". 
Пожалуйста, сравните ваше решение с предоставленным! </sub>