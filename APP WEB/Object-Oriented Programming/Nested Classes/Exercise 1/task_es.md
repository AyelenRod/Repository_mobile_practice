## Clases anidadas (#1)

En `FillIt.kt`, `State` solo se utiliza para determinar cuándo no hay más espacios `Blank` en `grid`. Simplifica el programa eliminando `State` y devolviendo un `Boolean` desde `turn()`. Una vez que eso funcione, añade un tercer jugador cambiando `enum class Mark { Blank, X, O }` a `enum class Mark { Blank, X, Y, Z }`. En `turn()`, utiliza una expresión `when` para moverte al siguiente valor de `player`.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcto" cuando ejecutas "Check". ¡Por favor, compara tu solución con la que se proporciona! </sub>