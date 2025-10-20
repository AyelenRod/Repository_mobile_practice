## Resumen 2 (#4)

Crea una clase `Dictionary` que almacene traducciones para palabras. Incluye una función miembro `addTranslations(word: String, translations: String)`. Las `translations` para `word` están delimitadas por espacios en blanco. Si `word` ya está presente en el `Dictionary`, `addTranslations()` lanza una `IllegalArgumentException` con el mensaje `"El diccionario ya tiene traducciones para '$word'"`.

`Dictionary` también contiene una propiedad de solo lectura `translations` que es un `Map` de `List`s que contienen `String`s. Las claves para el `Map` también son `String`s.

<div class="hint">

Usa `split(" ")` en `String` para separar palabras por espacios en blanco.

</div>

<div class="hint">

Define una propiedad auxiliar llamada `_translations` que contenga un `Map` mutable de traducciones. Leer la propiedad `translations` simplemente debería devolver `_translations` como un `Map` de solo lectura.

</div>