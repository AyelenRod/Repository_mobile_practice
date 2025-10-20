## Listas de argumentos variables (#2)

Escribe una función `printArgs()` con un `String` como primer parámetro, y un
parámetro `vararg` de `Int` como segundo parámetro. `printArgs()` muestra sus
argumentos en la consola: primero el `String`, luego los `Int`, separados por
comas y rodeados por corchetes.

Por ejemplo, la salida para `printArgs("Numbers: ", 1, 2, 3)` debería ser:

```text
Numbers: [1, 2, 3]
```

<div class="hint">

Usa `toList()` en el parámetro `vararg` para obtener la representación `String`
solicitada.

</div>