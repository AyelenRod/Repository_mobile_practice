## Referencias de miembro (#1)

El código inicial incluye una clase `data` llamada `Pet`, que contiene una propiedad `var String` `name` y una propiedad `enum` `habitat`. La enumeración `Habitat` puede ser `LAND`, `WATER` o `AMPHIBIOUS`, y también contiene una función miembro `livesIn(pet: Pet)` que prueba si `pet` vive en un `Habitat` particular.

El código inicial del `main()` crea una `List<Pet>`. Usando `filter()` junto con referencias de miembro, implementa tres funciones: `liveOnLand()`, `liveInWater()` y `areAmphibious()`, que descubren qué mascotas en la lista viven en tierra, en el agua o son anfibias. Por último, utiliza `partition()` para implementar la función `partitionAmphibious()`, que divide las mascotas en aquellas que son anfibias y aquellas que no lo son.