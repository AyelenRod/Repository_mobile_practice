## Resumen 1 (#10)

Crea una función `showSnake(rows: Int, columns: Int)` que muestre una tabla
llena de números secuenciales en forma de serpiente. Por ejemplo, `showSnake(3, 3)` debería producir lo siguiente:

```text
 0 1 2
 5 4 3
 6 7 8
```

Para una alineación adecuada, utiliza un formato de cadena como `"%3d".format(number)` para colocar espacios adicionales antes del número. El número antes de `d` indica cuántos caracteres debe ocupar el número junto con los espacios adicionales. Depende del número más grande, el último: coloca exactamente un espacio antes de él.

<div class="hint">

Usa la cadena `"%${width}d".format(value)`, donde la variable `width` almacena
el ancho de cada celda de número, para dar formato al valor según los valores de entrada actuales (`rows` y `columns`).

</div>