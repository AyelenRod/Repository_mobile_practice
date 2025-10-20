## Inicialización de clases base (#2)

El código inicial define clases que describen una disposición de mesa para la cena:

- `Plate` y `DinnerPlate` heredan de `Plate`
- `Utensil`, y luego `Spoon`, `Fork` y `Knife` que todos heredan de `Utensil`
- `Custom` (como en "una tradición cultural")

Hereda `PlaceSetting` de `Custom`. Dentro de `PlaceSetting`, crea propiedades de tipo `Spoon`, `Fork`, `Knife` y `DinnerPlate`, en ese orden. `main()` crea una instancia de `PlaceSetting` para mostrar el orden de inicialización.