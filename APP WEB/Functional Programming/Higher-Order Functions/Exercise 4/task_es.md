## Funciones de orden superior (#4)

Implementa `andThen()` para combinar las acciones de dos funciones. `f.andThen(g)` devuelve una nueva función que primero aplica `f` y luego aplica `g` al resultado: `{arg -> g(f(arg))}`. Define `andThen()` como una función de extensión en un tipo de función.