## Creación de genéricos (#1)

Crea una interfaz genérica llamada `Items` con una única función `next()` que
devuelve un objeto del tipo genérico, o `null`. Haz que `Items` sea utilizable para [conversiones SAM].

Crea una función genérica llamada `itemIter()` que tome un `vararg items` del
parámetro de tipo y devuelva un objeto `Items` producido con una conversión SAM. El
objeto `Items` contiene un `var index` para indicar el elemento actual en
`items`. Cada llamada a `next()` produce el elemento actual e incrementa
`index`. Cuando no hay más `items`, `next()` devuelve `null`.

El código en `main()` prueba tu solución.

<sub> Esta tarea no contiene pruebas automáticas,
así que siempre se marca como "Correcto" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>