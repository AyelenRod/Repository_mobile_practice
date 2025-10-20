## Propiedades (#3)

Un `Robot` puede moverse dentro de un campo cuadrado de tamaño `100 x 100`. Los bordes
de este campo están "conectados": si el robot está en la celda `(0, 0)` y se mueve un
paso hacia arriba, llega a la celda `(0, 99)`.

```text
(0, 0)
// arriba(1)
(0, 99)
// izquierda(10)
(90, 99)
```

Modifica `right()`, `left()`, `up()` y `down()` para implementar este comportamiento.

<div class="hint">

Escribe una función miembro auxiliar ("helper") llamada `crossBoundary()` para
comprobar los límites. Esto elimina la repetición y simplifica el código resultante.

</div>