## Изучение IDE: анализ стектрейса

Вы можете автоматически перейти к строке, в которой было выброшено исключение, нажав на неё в стектрейсе. Запустите `Task.kt`, чтобы увидеть стектрейс и перейти к разным строкам.

Вы также можете проанализировать стектрейс, скопированный из другого источника, например, из системы отслеживания ошибок. Скопируйте следующий стектрейс и выполните действие <span class="control">`Analyze stacktrace`</span>:

```text
Exception in thread "main" java.lang.IllegalStateException: something is wrong
    at stacktrace.TaskKt.foo(Task.kt:4)
    at stacktrace.TaskKt.bar(Task.kt:8)
    at stacktrace.TaskKt.main(Task.kt:12)
```