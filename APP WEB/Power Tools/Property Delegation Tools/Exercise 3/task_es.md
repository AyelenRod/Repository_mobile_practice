## Herramientas para delegación de propiedades (#3)

Crea una función genérica `observe()` que use `trace()` para capturar
`"$propertyName $oldValue to $newValue"` cada vez que una propiedad cambie. Asegúrate
de que funcione con:

```kotlin
class Product(nm: String = "<0>", id: Int = -1) {
  var name by observable(nm, ::observe)
  var ident by observable(id, ::observe)
  override fun toString() = "$name $ident"
}
```

Y que el código inicial en `main()` se ejecute correctamente.

<sub> Esta tarea no contiene pruebas automáticas,
así que siempre se marca como "Correcto" cuando ejecutas "Check".
¡Por favor compara tu solución con la proporcionada! </sub>