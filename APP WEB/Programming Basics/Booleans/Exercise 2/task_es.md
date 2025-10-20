## Booleanos (#2)

Crea una "tabla de verdad" para `&&` y `||`. Escribe una función `showAnd(primero: Boolean, segundo: Boolean)` que use una plantilla `String` para mostrar `primero`, el símbolo `&&`, `segundo`, el símbolo `==`, y luego el resultado de `primero && segundo`. Escribe una función similar para `showOr()`.

La salida de muestra para `showAnd(true, true)` debería ser:

```text
true && true == true
```

Ahora escribe una función `showTruthTable()` que muestre la tabla producida por todas las combinaciones posibles de `true` y `false` tanto para `showAnd()` como para `showOr()`. Asegúrate de incluir todas las órdenes posibles.