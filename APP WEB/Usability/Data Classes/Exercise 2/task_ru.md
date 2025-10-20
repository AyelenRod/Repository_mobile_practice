## Классы данных (#2)

Создайте функцию-расширение `transferTicket()`, которая копирует объект `AirlineTicket`, заменяя `firstName` и `lastName` на новые значения во время копирования:

```kotlin
fun AirlineTicket.transferTicket(
  otherFirstName: String,
  otherLastName: String
): AirlineTicket
```