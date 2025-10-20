## Excepciones (#1)

Muestra en la consola todos los `String` siguientes que no se pueden convertir a `Double` (es decir, aquellos donde un intento de conversión lanza una excepción):

```text
"12", "1.2", "1,2", "1.2e0", "1.2e1",
"1.2e2", "1.2e3", "1.2e10", "12.3e10",
"1.2e-1", "1.2e-10".
```