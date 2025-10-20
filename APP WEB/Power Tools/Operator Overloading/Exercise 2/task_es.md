## Sobrecarga de operadores (#2)

Comenzando con:

```kotlin
enum class Count {
  Eeny, Meeny, Miney, Moe;
  companion object {
    val max = Moe
  }
}
```

Crea funciones de extensión para realizar las operaciones `++` y `--` en un `Count` de tal manera que si `++` intenta pasar más allá de `Moe`, se reinicie en `Eeny`, y si `--` intenta bajar de `Eeny`, se reinicie en `Moe`. El código de inicio en `main()` verificará tu trabajo.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcto" cuando ejecutas "Check". ¡Por favor, compara tu solución con la proporcionada! </sub>