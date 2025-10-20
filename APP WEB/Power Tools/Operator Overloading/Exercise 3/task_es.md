## Sobrecarga de operadores (#3)

Crea una `class Repository<T>(val initSize: Int = 10)` similar a una colección. Esta
contiene un `private MutableList` llamado `list` de tamaño inicial `initSize`, con
todos los elementos inicializados a `null`. Proporciona soporte para las siguientes
operaciones para un `Repository` llamado `r`:

- `r += rv` Coloca `rv` en la primera ubicación `null` disponible en `list`. Si
  no hay ubicaciones `null` restantes, añade `rv` al final de `list`.

- `r[n] = rv` Coloca `rv` en la ubicación `n` en `list`. Requiere que `n` sea
  mayor o igual a cero y menor que `list.size`. Requiere que `list[n]` no sea `null`.

- `r[n]` Recupera el valor `list[n]`. Requiere que `n` sea mayor o igual a cero y menor que `list.size`. Requiere que `list[n]` no sea `null`.

Añade un `toString()` que genere `list` separada por comas.

El código inicial en `main()` prueba `Repository` y te muestra cómo deben aparecer
los mensajes de error.

<sub> Esta tarea no contiene pruebas automáticas,
así que siempre se marca como "Correcto" cuando ejecutas "Check".
¡Por favor, compara tu solución con la que se proporciona! </sub>