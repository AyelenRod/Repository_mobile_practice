## Propiedades (#2)

Un objeto `Robot` comienza en la celda `(0, 0)` y puede moverse a la derecha, izquierda, arriba y abajo. Su ubicación se almacena como un par de coordenadas `(x, y)`, donde `(0, 0)` es la esquina superior izquierda:

```text
(x, y)
(0, 0) (1, 0)
(0, 1) (1, 1)
```

Moverse a la derecha aumenta la coordenada `x`, moverse hacia abajo aumenta la coordenada `y`, mientras que moverse a la izquierda y arriba disminuye las coordenadas `x` y `y`.

Implementa las funciones miembro de `Robot` `right()`, `left()`, `up()` y `down()`, cada una de las cuales recibe un parámetro `steps`. También implementa `getLocation()`, que devuelve las coordenadas del `Robot` como un `String` en la forma `(x, y)`.