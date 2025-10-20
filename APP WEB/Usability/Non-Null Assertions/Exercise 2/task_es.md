## Aserciones no nulas (#2)

Define una función de extensión `List<Int>.headPlusTail()` que devuelva un `Triple`
que contenga (1) el primer elemento de la `List<Int>`, (2) el último elemento de la
`List<Int>`, (3) la suma del primero y último elementos. Si la `List<Int>` está
vacía, devuelve `null` para las tres entradas del `Triple`. Si la `List<Int>` 
consiste en un solo elemento, devuelve ese elemento como la primera entrada, seguido
de `null`, seguido de ese mismo elemento como el resultado.

En `main()`, crea un `mutableListOf<Int>` llamado `ints`. Llama a
`trace(ints.headPlusTail())`. A continuación, crea un bucle `for` que recorra `n`
a través del rango `-2..10`, saltando cada otro elemento. El bucle llama a
`ints.add(n)`, luego a `trace(ints.headPlusTail())` y finalmente selecciona el 
resultado de la llamada a `ints.headPlusTail()` usando una aserción no nula.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>