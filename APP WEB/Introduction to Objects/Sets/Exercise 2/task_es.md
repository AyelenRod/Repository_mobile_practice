## Conjuntos (#2)

Escribe la función `experiment()` para generar `Int`s aleatorios del 1 al 25 y colocar los resultados en un `Set`. Cuenta el número de `Int`s generados aleatoriamente necesarios antes de que el `Set` contenga todos los valores del 1 al 25. Devuelve este valor como resultado de la función `experiment()`. Nota que los resultados son diferentes para cada llamada de `experiment()` porque dependen de valores aleatorios.

Usa `Random.nextInt(25) + 1` para obtener un número aleatorio del 1 al 25.

`main()` repite tu experimento 1000 veces y muestra el resultado promedio.