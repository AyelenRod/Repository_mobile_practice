## Limpieza de recursos (#1)

El código inicial define un `String` llamado `text`. Define una función `writeAndRead()`
que use `java.io.File`. Crea un objeto `File` inicializado a
`"DataFiles/CleanupSoln1.txt"`. Elimina el archivo si existe. Luego créalo y
añade `text` al archivo (IntelliJ IDEA te dará pistas para ayudarte a elegir las
funciones miembro para llamar a `File`). Usa `useLines()` para leer el archivo y
capturarlo con `trace()`, luego usa `forEachLine()` para leer el archivo y
capturarlo con `trace()`. El código inicial en `main()` prueba `writeAndRead()`.

<sub> Esta tarea no contiene pruebas automáticas,
por lo que siempre se marca como "Correcto" cuando ejecutas "Check".
¡Por favor, compara tu solución con la que se proporciona! </sub>