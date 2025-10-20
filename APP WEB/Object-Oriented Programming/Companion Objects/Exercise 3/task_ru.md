## Объекты-компаньоны (#3)

Создайте этот класс:

```kotlin
data class ID(
  val name: String,
  val id: String = idGenerator()
) {
  companion object {
    // ...
    private fun idGenerator() = TODO()
    fun test(n: Int) = List(n) {
      ID(('a' + it).toString())
    }
  }
}
```

`ID` содержит только объект-компаньон с функцией `idGenerator()` и код для поддержания этой функции: `size` каждого `id`, генератор случайных чисел, инициализированный значением `47`, и `source` символов, используемых для случайного создания `id`. В `main()` вывод проверяется с помощью `test()`, который генерирует `List` из `n` объектов `ID` — модифицируйте ваш код до тех пор, пока он не будет соответствовать выходным данным `test()` в `main()`.

Теперь завершите этот класс:

```kotlin
class Bank(val name: String) {
  // Заявки на счета поданы, но не завершены:
  private val applied = TODO()
  private val accounts = TODO() // Завершенные
  private class Account(val name: String) {
    var id: ID? = null
    private var number: Long? = null
    fun addID(verifiedID: ID) = TODO()
    companion object Numbers {
      private fun nextAccountNumber() = TODO()
    }
    fun finish() = TODO()
    override fun toString() = "$id $number"
  }
  fun applyForAccount(name: String) = TODO()
  fun addID(id: ID) = TODO()
  fun completeAccount(verifiedID: ID) = TODO()
  override fun toString() =
    accounts.joinToString("\n")
}
```

Это пример шаблона *Builder* (Строитель) для класса, требующего нескольких шагов во время создания объекта. `applyForAccount()` начинает создание нового `Account` и добавляет его в список `applied`. `addID()` добавляет объект `ID` в `Account`, а `completeAccount()` принимает `ID`, добавляет номер счета и перемещает `Account` из списка `applied` в `accounts`.

Стартовый код в `main()` проверит ваше решение.

<sub> Эта задача не содержит автоматических тестов, поэтому она всегда помечена как "Правильно", когда вы запускаете "Проверить". Пожалуйста, сравните ваше решение с предоставленным! </sub>