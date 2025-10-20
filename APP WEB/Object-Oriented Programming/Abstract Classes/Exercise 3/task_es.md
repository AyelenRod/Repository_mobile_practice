## Clases abstractas (#3)

El código inicial contiene una clase `abstract` llamada `Instrument` que contiene una función miembro `abstract` `play(n: Note)`. `Note` se define como un `enum` con valores de `A` a `G`.

Las clases `Wind`, `Percussion` y `Stringed` heredan de `Instrument`, sobrescribiendo `play()` en cada caso para que devuelva un `String` que contiene el nombre de la clase, luego `blow` para `Wind`, `strike` para `Percussion`, y `pluck` para `Stringed`, y finalmente la `Note` que se está tocando.

Añade dos argumentos de constructor a `Instrument`: `name` y `action`, y pasa los valores correspondientes desde las subclases. Haz que `name` y `action` sean propiedades `val` y proporciona una implementación de `play()` en la superclase para que devuelva el mismo valor que previamente era producido por `play()` en cada subclase. Elimina las implementaciones de `play()` de las subclases.