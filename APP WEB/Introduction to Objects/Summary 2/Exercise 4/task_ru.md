## Резюме 2 (#4)

Создайте класс `Dictionary`, который хранит переводы для слов. Он включает функцию-член `addTranslations(word: String, translations: String)`. `translations` для `word` разделяются пробелами. Если `word` уже присутствует в `Dictionary`, `addTranslations()` выбрасывает `IllegalArgumentException` с сообщением `"Dictionary already has translations for '$word'"`.

`Dictionary` также содержит свойство `translations` только для чтения, которое представляет собой `Map` из `List`, содержащих `String`. Ключи для `Map` также являются `String`.

<div class="hint">

Используйте `split(" ")` на `String`, чтобы разделить слова по пробелам.

</div>

<div class="hint">

Определите вспомогательное свойство `_translations`, содержащее изменяемый `Map` переводов. Чтение свойства `translations` должно просто возвращать `_translations` как `Map` только для чтения.

</div>