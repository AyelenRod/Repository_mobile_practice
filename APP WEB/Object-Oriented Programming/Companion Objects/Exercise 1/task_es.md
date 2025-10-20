## Objetos Companion (#1)

La idea de la *Fábrica* mostrada en `CompanionFactory.kt` se vuelve más interesante cuando introduces múltiples fábricas, de modo que la misma configuración puede crear fácilmente diferentes tipos de objetos.

Comienza con dos interfaces:

```kotlin
interface Vendor {
  fun pencil()
  fun pen()
}

interface VendorFactory {
  fun create(): Vendor
}
```

Crea `Vendor1` y `Vendor2` que implementen `Vendor`. Las funciones miembro usan `trace()` para reportar el nombre de la clase `Vendor` y "pencil" o "pen". Cada implementación de `Vendor` también tiene un objeto companion con una propiedad `factory` que contiene una clase interna anónima que implementa `VendorFactory`.

Ahora escribe una función independiente `consumer(factory: VendorFactory)` que use `factory` para crear un `Vendor`. Usa ese `Vendor` para llamar a `pencil()` y `pen()`. El código inicial en `main()` validará tu solución.

<sub> Esta tarea no contiene pruebas automáticas,
así que siempre se marca como "Correcta" cuando ejecutas "Check".
¡Por favor, compara tu solución con la que se proporciona! </sub>