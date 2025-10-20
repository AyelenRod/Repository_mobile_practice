## Работа со списками (#4)

Реализуйте функцию `friendSuggestions(person: Person)`, чтобы возвращать друзей друзей `person`, исключая тех, кто уже является его или её друзьями. Учитывайте следующие дружественные связи:

```text
Alice - Bob
Bob - Charlie
```

`friendSuggestions()` должна возвращать Charlie для Alice, потому что Charlie является другом друга Alice — Bob, и ещё не является другом Alice.

Следующий пример не даёт предложений друзей для Alice, потому что Bob и Charlie уже её друзья:

```text
Alice - Bob
Alice - Charlie
Bob - Charlie
```