## Перегрузка (#3)

Реализуйте перегруженные версии функции, называемой `myJoinToString()`. Передайте
значения по умолчанию для аргументов в каждом перегруженном вызове функции, не используя
поддержку этого функционала, предоставляемую языком.

Почему вы не можете определить обе следующие функции одновременно?

```text
fun List<Int>.myJoinToString(separator: String, prefix: String): String
fun List<Int>.myJoinToString(prefix: String, postfix: String): String
```

Раскомментируйте функцию `myJoinToString(prefix: String, postfix: String)` в
начальном коде и посмотрите, какую ошибку вы получите.