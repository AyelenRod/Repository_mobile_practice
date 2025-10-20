## El tipo `Nothing` (#3)

Crea `Failure` y `fail()` como en los dos ejercicios anteriores, pero no llames a `trace()` en `fail()`. Añade una `private var _debug` a nivel de archivo e inicialízala en `true`. Define `fun debug(test: Boolean)` para que siempre llame a `trace()` y verifique que fue llamada (consulta el código inicial en `main()` para descubrir el formato del mensaje de `trace()`), pero solo realiza la actividad `debug()` si `_debug` es `true`. El código inicial en `main()` prueba tu trabajo.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor, compara tu solución con la proporcionada! </sub>