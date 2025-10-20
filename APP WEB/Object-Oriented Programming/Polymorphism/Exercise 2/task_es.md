## Polimorfismo (#2)

El código inicial contiene la clase `Frog`, que extiende `Animal`. `Animal` define dos funciones miembro `talk()` y `jump()` que son sobrescritas por `Frog`. Todas las funciones muestran su información usando `trace()`. Nota que un `Animal` siempre `talk()` justo después de que `jump()`.

`main()` crea un `Frog`, lo almacena como `Animal`, y luego llama a `jump()`. Tu tarea es adivinar cuál será la salida.