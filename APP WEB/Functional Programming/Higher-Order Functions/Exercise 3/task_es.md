## Funciones de orden superior (#3)

Escribe tu propia versión de `mapIndexedNotNull()`. Al igual que `mapNotNull()`, aplica la transformación dada a cada elemento y filtra los `null`. Como `mapIndexed()`, basa la transformación tanto en el elemento como en su índice.

Nota los tipos genéricos `R?` (en `(Int, T) -> R?`) y `List<R>`. El `?` en `R?` significa que el tipo de retorno de la lambda es nullable. `mapIndexedNotNull()` devuelve una lista de elementos no-nullables, por lo que el tipo de retorno de la función es `List<R>`. Para expresar que `R` es un tipo no-nullable, especificamos una *restricción* en el parámetro de tipo genérico: `R: Any`.