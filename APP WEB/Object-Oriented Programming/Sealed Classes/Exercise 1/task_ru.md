## Запечатанные классы (#1)

Измените файл `SealedClasses.kt`. Сначала переместите свойство `capacity` из класса `Bus` в класс `Transport` и добавьте `trace("size ${transport.capacity}")` после выражения `when` в методе `travel()`. Затем добавьте новые подклассы:

- `Tram`, содержащий `val route: String`
- `Plane`, содержащий `val flightNumber: String`

Измените метод `travel()`, чтобы учесть эти новые подклассы. Добавьте `Tram` и `Plane` в `List` в `main()`.