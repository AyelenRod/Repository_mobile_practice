## Доступ к свойствам (#3)

Создайте класс `MessageStorage` с двумя свойствами: `private` свойством под именем `_messages` типа `MutableList<String>` и `public` свойством под именем `messages` типа `List<String>`. Пользовательский геттер для `messages` возвращает `_messages`.

Поскольку `_messages` является `private`, его содержимое может быть изменено только внутри класса `MessageStorage`. Определите функцию-член `addMessage()`, которая принимает параметр типа `String` и добавляет его в список `_messages`.