## Restringir la visibilidad (#3)

Un `Robot` solo puede avanzar. Verifica que el argumento `steps` sea un número positivo. Para `right()`, `left()`, `down()` y `up()`, un argumento `steps` negativo o cero no debería actualizar la ubicación. En su lugar, debería producir una salida en consola usando este `String`:

```text
"steps argument must be positive, is $steps"
```

En `main()`, prueba tu código usando valores positivos, negativos y cero para `steps`.