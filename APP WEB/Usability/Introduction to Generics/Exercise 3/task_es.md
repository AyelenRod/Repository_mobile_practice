## Introducción a Genéricos (#3)

Crea una clase genérica llamada `CountingSet` que cuente el número de veces que cada elemento fue agregado a ella. Impleméntala utilizando un `Map` privado. Debería definir tres funciones miembro:

+ `add(element: E)` agrega un nuevo elemento. Si el programador cliente intenta `add()` un elemento que ya está en el `CountingSet`, el contador correspondiente debería incrementarse.

+ `count(element: E)` devuelve el número de veces que cada elemento fue agregado al `CountingSet`. Si el elemento no está presente en `CountingSet`, el resultado es cero.

+ `toSet()` devuelve un conjunto de elementos almacenados.