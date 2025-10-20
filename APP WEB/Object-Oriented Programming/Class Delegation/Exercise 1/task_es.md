## Delegación de clase (#1)

Modifica `ModelingMI.kt` añadiendo `fun resize(scale: Int): Int` a `Rectangle`,
que simplemente devuelva `scale`. Añade una `fun rightClicked(): Boolean` a
`MouseManager`. Llama a las nuevas funciones en `main()` y verifica que `Button`
no necesita modificaciones para soportar las nuevas interfaces.