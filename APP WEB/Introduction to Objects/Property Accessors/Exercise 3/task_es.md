## Accesores de Propiedades (#3)

Crea una clase `MessageStorage` con dos propiedades: una `privada` llamada `_messages` de tipo `MutableList<String>` y una `pública` llamada `messages` de tipo `List<String>`. El getter personalizado para `messages` devuelve `_messages`.

Debido a que `_messages` es `privado`, su contenido solo puede ser modificado dentro de la clase `MessageStorage`. Define una función miembro `addMessage()` que tome un parámetro de tipo `String` y lo agregue a la lista `_messages`.