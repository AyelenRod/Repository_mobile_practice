## Делегирование класса (#1)

Измените `ModelingMI.kt`, добавив `fun resize(scale: Int): Int` в `Rectangle`, которая просто возвращает `scale`. Добавьте `fun rightClicked(): Boolean` в `MouseManager`. Вызовите новые функции в `main()` и убедитесь, что `Button` не требует изменений для поддержки новых интерфейсов.