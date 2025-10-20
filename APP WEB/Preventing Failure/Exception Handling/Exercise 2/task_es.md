## Manejo de Excepciones (#2)

El código inicial define una jerarquía de excepciones y tres funciones:

- `findNumber(s: String)` busca en `s` y devuelve un `String` que contiene un
  número. Lanza `NoNumber` si no se encuentra ningún número.

- `convertNumber(s: String)` convierte `s` a un `Int`. Lanza `BadNumber` si
  `s` no puede ser convertido a un `Int`.

- `embedNumber(n: Int)` produce un `String` que contiene `n` dentro de algunas letras.

Tu tarea es definir dos funciones:

- `justFail(s: String)` llama a las tres funciones anteriores, anidando llamadas
  dentro de llamadas. Encuentra un número dentro de un `String`, lo convierte a
  un `Int`, incrusta ese `Int` dentro de un `String`, y llama a `trace()` con el resultado.

- `recover(s: String)` llama a cada una de las funciones anteriores una a la vez,
  recuperándose de cualquier fallo para que la siguiente llamada pueda tener éxito.
  Si `findNumber()` falla, la recuperación produce el `String` `"0"`. Si
  `convertNumber()` falla, la recuperación produce `-1`. Al final de
  `recover()`, llama a `trace()` con el resultado.

El código inicial restante prueba las dos funciones anteriores.

Observa los posibles efectos producidos por las excepciones:

1. Si una función puede producir una o más excepciones, las llamadas a esa función
   pueden ser significativamente más complicadas.

2. El concepto de recuperación asume que hay una *forma* de recuperarse de una
   llamada a función fallida. Sin embargo, a menudo, esto simplemente no es cierto.

<sub> Esta tarea no contiene pruebas automáticas,
así que siempre se marca como "Correcto" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>