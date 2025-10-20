## Inicialización Perezosa (#2)

Crea una clase `Outer` que contenga una `clase interna` llamada `Inner`, ambas con un `init` usando `trace()` que anuncie "constructor de <nombre de la clase>". Añade tres `val` de tipo `String` `lazy`, cada uno con un inicializador que rastree "Inicializando <nombre de la clase>.<nombre de la propiedad>": `s1` y `s2` en `Outer`, y `si` en `Inner`. Los inicializadores producen "Hi" para `s1`, "Hello $s1" para `s2`, y "Howdy $s2" para `si`. El código en `main()` prueba tu solución.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcto" cuando ejecutas "Check". ¡Por favor, compara tu solución con la proporcionada! </sub>