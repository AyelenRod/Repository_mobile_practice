## Enumeraciones (#1)

Este ejercicio refactoriza la clase `Robot` utilizada en la sección II. Reemplaza las cuatro funciones `right()`, `left()`, `down()` y `up()` con una función `go()` que tome un parámetro adicional `Direction` especificando la dirección del movimiento.

La ubicación se almacena como un par de coordenadas `(x, y)`, donde `(0, 0)` es la esquina superior izquierda:

```text
(x, y)
(0, 0) (1, 0)
(0, 1) (1, 1)
```

Mover a la derecha incrementa la coordenada `x`, mover hacia abajo incrementa la coordenada `y`, mover hacia la izquierda y hacia arriba decrementan las coordenadas `x` y `y`.