## Inicialización tardía (#1)

Comienza con una interfaz `PowerPlant` vacía y, a partir de ella, crea las clases
`ElectricMotor` y `CombustionEngine`. Crea una clase `Vehicle` que contenga una
propiedad `lateinit` llamada `powerPlant`.

Crea un `lateinit` `car` a nivel de archivo y un `lateinit` `truck` dentro de
`main()`. Inicializa `car` dentro de `main()`, asignándole un motor eléctrico, luego
inicializa `truck`, asignándole un motor de combustión.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre está marcada como "Correcta" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>