## Registro de eventos (#3)

Agrega niveles de registro a `AtomicLog.kt`. Crea una enumeración `Level` con los valores `Trace`, `Debug`, `Info`, `Warn` y `Error`. Añade una instancia de este `enum` llamada `debugLevel` a nivel de archivo, inicializada a `Error`. Dentro de tu nueva clase `Logger`, modifica la función `log()` para que su firma sea `private fun log(thisLevel: Level, msg: String)`. Esto requerirá pequeñas modificaciones en algunas otras funciones. El código en `main()` prueba tu solución.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcta" cuando ejecutas "Check". ¡Por favor, compara tu solución con la que se proporciona! </sub>