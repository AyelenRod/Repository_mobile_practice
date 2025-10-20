## Upcasting (#1)

El código inicial contiene una interfaz `Rodent` y sus dos implementaciones: `Mouse` y `KangarooRat`. `Rodent` declara las funciones `eat()` y `speak()`, que deben ser implementadas en las subclases. `KangarooRat` agrega una función `jump()`.

Crea una función `upcast(rodent: Rodent)` que muestre el resultado de `eat()` y `speak()` usando `trace()`. Demuestra que el compilador no te permitirá llamar a `jump()`.

`main()` crea una instancia de `Mouse` y `KangarooRat`, y muestra que puedes llamar a `jump()` para este último y pasar ambos objetos a `upcast()`. Adivina la salida de `main()`, luego ejecuta `main()` para verificar tu suposición.