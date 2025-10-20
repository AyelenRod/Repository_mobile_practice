## Delegación de clase (#3)

¿Qué ocurre cuando delegas a dos interfaces que tienen uno o más miembros en común? El código inicial contiene dos interfaces `A` y `B` que ambas tienen una función miembro `foo()`.

Crea una clase `AA` que implemente `A` y rastree `"A.foo()"` para `foo()` y `"A.bar()"` para `bar()`. Crea una implementación similar `BB` que implemente `B`. Ahora crea una clase `Delegation` que delegue a ambas, `A` y `B`. El código en `main()` prueba tu solución. IntelliJ o el compilador te guiarán para resolver los problemas resultantes.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcta" cuando ejecutas "Check". ¡Por favor, compara tu solución con la proporcionada! </sub>