## Limitar visibilidad (#1)

Crea una clase `Alien` con un constructor que inicialice las propiedades `public val name` y `public val species`. Añade una propiedad `private var planet` inicializada por el constructor. `planet` puede ser modificada con la función miembro `movePlanet()`. `movePlanet()` toma como parámetro el planeta al que se está moviendo el `Alien`. Todas las propiedades y parámetros son de tipo `String`. Sobrescribe `toString()` para devolver `name`, `species` y `planet` en el formato `"Alien $name, $species: $planet"`.

En `main()`, crea dos `Alien`s y muévelos de un `planet` de origen a un `planet` de destino, probándolos usando `toString()` junto con los datos:

| `name`    | `species`  | Origen      | Destino     |
|-----------|------------|-------------|-------------|
| Arthricia | Cat Person | PurgePlanet | Earth C-137 |
| Dale      | Giant      | Gearworld   | Parblesnops |

Nótese que una propiedad `val` es segura para acceder directamente como una propiedad `public` en lugar de hacerla `private`.