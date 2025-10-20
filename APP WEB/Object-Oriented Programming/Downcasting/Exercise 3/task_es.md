## Downcasting (#3)

Crea una interfaz vacía `Animal1`. Hereda una clase `Worm1` con una función
miembro `wriggle()` que llama a `trace("Wriggle")`. Hereda una clase `Snail1`
con una función miembro `slide()` que llama a `trace("Slide")`. Hereda una clase
`Beetle1` con una función miembro `walk()` que llama a `trace("Walk")`.

Escribe una función `move(a1: Animal1)` que use un `when` para detectar cada tipo y
llamar a la función de ese tipo. En `main()`, crea una `List` de objetos `Animal1` y
llama a `move()` para cada uno.

Crea una jerarquía duplicada desde una interfaz `Animal2`, pero en este caso haz
`move()` un miembro de `Animal2` e impleméntalo en `Worm2`, `Snail2` y
`Beetle2`. En `main()`, crea una `List` de objetos `Animal2` y llama a `move()`
para cada uno.

Compara la jerarquía verificada por tipos con la jerarquía polimórfica.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcto" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>