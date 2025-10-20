## Resumen 1 (#7)

Escribe una función que use un bucle `while` para contar las ocurrencias de un dígito dado dentro de un número decimal. Coloca el número decimal en una `var` llamada `worker`. Cada pasada por el bucle prueba el dígito más a la derecha de `worker`, luego al final del bucle, elimina ese dígito más a la derecha de `worker`. La `var occurrences` contiene el número de ocurrencias del dígito que buscas.

Esta tabla muestra los valores durante cada bucle mientras se buscan ocurrencias de `1` en `121341`:

| `worker` | Eliminado | `occurrences` |
|----------|-----------|---------------|
| 121341   | -         | 0             |
| 12134    | 1         | 1             |
| 1213     | 41        | 1             |
| 121      | 341       | 1             |
| 12       | 1341      | 2             |
| 1        | 21341     | 2             |
| -        | 121341    | 3             |

Los valores "Eliminado" están en la tabla para mayor claridad, pero no necesitas una variable "Eliminado" en tu solución.