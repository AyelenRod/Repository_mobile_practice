## Creando Genéricos (#2)

Crea una clase genérica `CrateList` que herede de un `ArrayList` de `Crate`.
`Crate` no tiene un `toString()`. Para resolver este problema, crea una clase
`private` anidada llamada `DecoratedCrate` que tome un argumento genérico de
`contents` y herede de `Crate`. Agrega un `toString()` a `DecoratedCrate` que
produzca un `String` que consista en el resultado de llamar a `get()` dentro de
corchetes.

Define una función miembro `add()` que tome un argumento genérico `item`, cree un
`DecoratedCrate` con ese argumento y agregue el resultado al `ArrayList`. El
código en `main()` pone a prueba tu solución.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>