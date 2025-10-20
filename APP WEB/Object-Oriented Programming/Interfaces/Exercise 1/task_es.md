## Interfaces (#1)

Crea una clase `Cloud` que implemente `Computer` y contenga una `List<Node>`. La `class Node(private val result: Int)` también debería implementar `Computer` y debería implementar `calculateAnswer()` para que simplemente retorne `result`.

Escribe el constructor de `Cloud` para tomar un argumento `n` que indique el número de `Node`s en la nube. Cuenta hasta `n` y coloca cada conteo como el valor de `result` del `Node` que estés creando. Implementa `calculateAnswer()` de `Cloud` para retornar la suma de las respuestas en todos los `Node`s.