## funciones de orden superior (#2)

Reescribe la siguiente función utilizando una única llamada a `mapNotNull()`:

```kotlin
fun List<Int>.transform(): List<Int> =
  filter { it % 2 == 0 }.map { it * it }
```