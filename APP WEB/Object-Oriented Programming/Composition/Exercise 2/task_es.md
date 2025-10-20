## Composición (#2)

El código de inicio contiene implementaciones de las clases `Stack` y `Queue`.

`Stack` proporciona un acceso de último en entrar, primero en salir a los elementos. Puedes `push()` elementos nuevos en él y `pop()` el último elemento que fue añadido.

`Queue` proporciona un acceso de primero en entrar, primero en salir a los elementos. Puedes `put()` nuevos elementos en él, mientras que `poll()` devuelve el primer elemento.

En el código de inicio, tanto `Stack` como `Queue` extienden `ArrayList`, lo cual abre demasiados métodos en la API pública (por ejemplo, se puede obtener el primer elemento en `Stack`, lo cual contradice su diseño). Usa composición en lugar de herencia para implementar `Stack` y `Queue`.