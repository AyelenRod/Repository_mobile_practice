## Dominando el IDE: Analizar Stacktrace

Puedes navegar automáticamente a la línea donde se lanzó una excepción
haciendo clic en ella en el stacktrace. Ejecuta `Task.kt` para ver el stacktrace y
navegar a diferentes líneas.

También puedes analizar el stacktrace copiado de otro lugar, como un sistema de seguimiento de errores. Copia el siguiente stacktrace y llama a la acción
<span class="control">`Analizar stacktrace`</span>:

```text
Exception in thread "main" java.lang.IllegalStateException: something is wrong
    at stacktrace.TaskKt.foo(Task.kt:4)
    at stacktrace.TaskKt.bar(Task.kt:8)
    at stacktrace.TaskKt.main(Task.kt:12)
```