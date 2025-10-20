## Функции высшего порядка (#2)

Перепишите следующую функцию, используя один вызов `mapNotNull()`:

```kotlin
fun List<Int>.transform(): List<Int> =
  filter { it % 2 == 0 }.map { it * it }
```