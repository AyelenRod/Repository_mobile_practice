## Expresiones y sentencias (#3)

Adivina qué mostrará el siguiente código y luego compruébalo usando Kotlin:

```kotlin
var i = 1
println(i-- - --i)
```

Abre la pista en IntelliJ IDEA para ver la explicación.

<div class="hint">

Este código se puede reescribir como:

```kotlin
// i-- significa:
// Primero se produce el valor actual,
// luego se decrementa el valor.
val left = i // i: 1, left: 1
i -= 1 // i: 0

// --i significa:
// Primero se decrementa el valor,
// luego se produce el valor actual.
i -= 1 // i: -1
val right = i // i: -1, right: -1

val result =
  left - right // 1 - (-1) = 1 + 1 = 2
println(result)
```

</div>