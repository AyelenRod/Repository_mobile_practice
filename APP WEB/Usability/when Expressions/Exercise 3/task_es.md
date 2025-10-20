## Expresiones `when` (#3)

Implementa la función `balanced()` que toma un parámetro de tipo `String`. El argumento debe consistir en paréntesis y espacios opcionales; por ejemplo: `"()(())"`. Cuando pasas este argumento a `balanced()`, verifica si cada paréntesis de apertura tiene un paréntesis de cierre correspondiente y si todos los paréntesis están correctamente anidados.

Ignora los espacios en blanco en la cadena de entrada `String`. Si el `String` contiene caracteres distintos a paréntesis y espacios en blanco, lanza una `IllegalArgumentException`.

Algunos ejemplos:

- `"()"` está equilibrado

- `"(()"` no está equilibrado

- `")("` no está equilibrado

- `"( ()() )"` está equilibrado

- `"*()"` produce una `IllegalArgumentException`

<div class="hint">

Itera sobre el `String` y cuenta el número de paréntesis izquierdos que están desparejados después de cada paso. Al final, este número debe ser 0. Si en algún momento el número es menor que cero, el `String` no está equilibrado.

</div>