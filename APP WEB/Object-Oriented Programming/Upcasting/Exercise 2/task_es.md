## Upcasting (#2)

El upcasting también ocurre cuando añades un objeto de un tipo derivado a un contenedor que contiene el tipo base.

El código inicial contiene una interfaz `Apple` que incluye una función miembro abstracta `consume()`. De `Apple`, hereda `GrannySmith`, `Gala`, `Fuji` y `Braeburn`. Sobrescribe `consume()` para que, respectivamente, devuelvan `chomp GrannySmith`, `bite Gala`, `press Fuji` y `peel Braeburn`.

`main()` crea una `List<Apple>` y la llena con los tipos específicos de `Apple`. Utiliza `map()` para aplicar `consume()` a cada objeto.