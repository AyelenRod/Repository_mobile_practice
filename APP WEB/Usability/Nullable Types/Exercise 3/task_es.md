## Tipos nulos (#3)

Crea una función llamada `countHexadecimalNumbers(codes: List<String>)` que cuente los números hexadecimales contenidos en `codes`. Devuelve un `Map<Int, Int>` donde la clave es un número hexadecimal y el valor es la cantidad de veces que ese número aparece en `codes`. Si una `String` en `codes` no contiene un número hexadecimal, la función lo ignora.

<div class="hint">

Convierte una `String` que contenga un código hexadecimal en un `Int` usando `toIntOrNull(radix: Int)`, una función de extensión para `String`. Pasa `16` como la base.

</div>