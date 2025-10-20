## Upcasting (ascenso de tipo) (#3)

Cuando combinas interfaces para crear una clase, puedes ascender un objeto de esa clase a cada interfaz diferente.

El código de inicio contiene tres interfaces: `Fighter` con una función `fight()`, `Swimmer` con una función `swim()`, y `Flyer` con una función `fly()`, y una clase `ActionCharacter` con una función `fight()` que devuelve `"ActionCharacter fight"`.

Define una clase `Hero` que combine `ActionCharacter`, `Fighter`, `Swimmer` y `Flyer`. Observa que `fight()` en `ActionCharacter` proporciona la implementación de `fight()` que necesita la interfaz `Fight`. Define `swim()` para que devuelva `"Hero swim"` y `fly()` para que devuelva `"Hero fly"`.

A continuación, implementa `tryFight(x: Fighter)`, `trySwim(x: Swimmer)`, `tryFly(x: Flyer)`, y `doAction(x: ActionCharacter)`, de modo que cada función llame a la función miembro disponible para su parámetro y registre su resultado.

En `main()`, crea un objeto `Hero` y pásalo a cada una de las funciones `tryFight()`, `trySwim()`, `tryFly()`, y `doAction()`. Ejecuta `main()` para verificar la salida. Observa que pasar un `Hero` a cada función lo convierte, de modo que, dentro de la función, `Hero` pierde su tipo específico y se convierte en el tipo del parámetro.