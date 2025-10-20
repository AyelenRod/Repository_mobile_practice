## Declaraciones de desestructuración (#3)

El código inicial contiene una clase `data` `Person` con dos propiedades: `name: String` y `age: Int`. Escribe una función `displayPersonInfo()` que tome un parámetro de `person: Person`, que desestructure usando la siguiente sintaxis:

```kotlin
val (name, age) = person
```

`displayPersonInfo()` debería mostrar los valores correspondientes en la consola:

```text
Name: $name
Age: $age
```

Agrega una nueva segunda propiedad `surname` entre `name` y `age` en `Person`. La primera propiedad debería ser `name` y la tercera propiedad debería ser `age`. No modifiques `displayPersonInfo()`. En `main()`, demuestra que `displayPersonInfo()` ahora funciona incorrectamente.