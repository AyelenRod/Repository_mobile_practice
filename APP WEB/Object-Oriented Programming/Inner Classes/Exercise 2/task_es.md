## Clases internas (#2)

Aunque una clase interna contiene una referencia al objeto de la clase externa que la crea, lo contrario no es cierto. Si la clase externa necesita una referencia al objeto de la clase interna, debe crear y inicializar esa referencia por sí misma.

Crea una `class Box(contains: String, label: String)`, con clases `inner` llamadas `Contents` que contiene `contains` como `val`, y `Destination` que contiene `label` como `val`. Haz dos referencias `private`: `contents` y `destination`, inicializadas a instancias de sus clases `inner` asociadas.

Ahora crea una `private val x` que se inicializa a un objeto de una clase interna anónima. En este caso, sin embargo, la clase base es `Any`. Incluye una función miembro `f()` que devuelva `"Any-based"`.

Agrega una función miembro `manifest()` que produzca un `String` que contenga las propiedades `contains` y `label` y el resultado de `f()`. El código inicial en `main()` prueba tu solución.

<sub> Esta tarea no contiene pruebas automáticas, por lo que siempre se marca como "Correcto" cuando ejecutas "Check". ¡Por favor compara tu solución con la proporcionada! </sub>