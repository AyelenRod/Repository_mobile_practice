## Tipos de números (#4)

Escribe una función que produzca el tiempo en milisegundos dada una duración en horas, minutos y segundos. (Un segundo son mil milisegundos). Por ejemplo, una hora y media son `5_400_000` milisegundos.

<div class="hint">

Asegúrate de almacenar todos los cálculos intermedios en un `Long`, de lo contrario, puedes obtener resultados incorrectos. Por ejemplo, si conviertes mil millones de horas a milisegundos pero no almacenas esos milisegundos en un `Long`, obtendrás un desbordamiento:

```kotlin
// El cálculo con Int causa desbordamiento de enteros:
1_000_000_000 * 60 = -129542144
// El cálculo con Long tiene éxito:
1_000_000_000 * 60L = 60000000000L
```

</div>