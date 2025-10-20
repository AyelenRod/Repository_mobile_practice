## Herencia y extensiones (#2)

El código inicial define la siguiente jerarquía: una superclase `Dog` y dos subclases, `ToyDog` y `RealDog`. Implementa una función de extensión que extienda `Dog`. `play()` primero llama a `speak()`, luego a `sit()`.

Implementa dos funciones de extensión más con el mismo nombre `play()` que extiendan `RealDog` y `ToyDog`. Ambas funciones deberían llamar primero a `Dog.play()`, luego `RealDog.play()` debería llamar a `feed()`, mientras que `ToyDog.play()` debería llamar a `changeBatteries()`.

Adivina qué trazará el código en `main()` y luego verifica tú mismo.

<div class="hint">

Para llamar a una función `Dog.play()` dentro de una extensión a una subclase de `Dog` (por ejemplo, dentro de `ToyDog.play()`), convierte `this` a `Dog` explícitamente:

```kotlin
(this as Dog).play()
```

</div>