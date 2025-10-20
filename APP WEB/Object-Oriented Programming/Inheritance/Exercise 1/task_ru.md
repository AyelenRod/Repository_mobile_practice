## Наследование (#1)

Начальный код содержит `open` класс `Cleanser` и класс `Detergent`, который его наследует. Добавьте в класс `Cleanser` свойство `var ops: MutableList<String>` и функции `dilute()`, `apply()` и `scrub()`, которые просто добавляют свои имена в `ops`. В `main` убедитесь, что `Detergent` теперь имеет те же функции, что и `Cleanser`.