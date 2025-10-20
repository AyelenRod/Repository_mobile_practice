## Ограничение видимости (#1)

Создайте класс `Alien` с конструктором, который инициализирует свойства `public val name` и `public val species`. Добавьте свойство `private var planet`, инициализируемое в конструкторе. `planet` может быть изменена с помощью функции-члена `movePlanet()`. `movePlanet()` принимает в качестве параметра планету, на которую перемещается `Alien`. Все свойства и параметры имеют тип `String`. Переопределите `toString()`, чтобы возвращать `name`, `species` и `planet` в формате `"Alien $name, $species: $planet"`.

В `main()`, создайте двух `Alien` и переместите их с исходной `planet` на целевую `planet`, протестировав их с помощью `toString()` вместе с данными:

| `name`    | `species`  | Origin      | Destination |
|-----------|------------|-------------|-------------|
| Arthricia | Cat Person | PurgePlanet | Earth C-137 |
| Dale      | Giant      | Gearworld   | Parblesnops |

Обратите внимание, что свойство `val` безопасно для прямого доступа как `public` свойство и не обязательно делать его `private`.