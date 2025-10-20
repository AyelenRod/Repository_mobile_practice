## Instrucciones de verificación (#4)

Crea una `clase Tanque(val capacidad: Double)`, donde `capacidad` es la cantidad máxima que el `Tanque` puede contener. Agrega una propiedad `margenDeSeguridad` que calcula un margen de vacío del 2% que debe mantenerse en la parte superior del `Tanque`. La cantidad actual en el `Tanque` se mantiene en una propiedad de solo lectura llamada `nivel`. La cantidad realmente permitida que el tanque puede contener es `nivelMax`.

Define dos funciones miembro para `Tanque`:

- `añadir(cantidad: Double): Double`, donde `cantidad` debe ser positiva. Solo agrega suficiente de la `cantidad` para llenar el tanque hasta `nivelMax` y coloca el resto en `sobrante`. Al final de la función, verifica que `nivel` sea mayor que cero, que `nivel` sea menor o igual a `nivelMax`, y que `sobrante` sea mayor o igual a cero. Luego devuelve `sobrante`.

- `drenar(cantidad: Double)`, donde `cantidad` debe ser positiva y no puede exceder el `nivel` en el `Tanque`. Después de remover `cantidad` del tanque, verifica que el `nivel` sea mayor o igual a cero.

El código de inicio en `main()` prueba tu clase `Tanque` y muestra qué mensajes de error usar en tus llamadas a `require()` y `check()`.

Nota que las llamadas a `check()` no fallan mientras la lógica interna de la función sea correcta. Es decir, si un `check()` lanza una excepción, indica un error de programación. Por esta razón, las llamadas a `check()` pueden ser eliminadas una vez que el código está verificado, para mejorar el rendimiento. Es mejor dejarlas para mantener la verificación del código, pero si eso no es posible, puedes convertir las pruebas de `check()` en pruebas unitarias (ver [Testing Unitario]).

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcta" cuando ejecutas "Verificar". ¡Por favor compara tu solución con la proporcionada! </sub>