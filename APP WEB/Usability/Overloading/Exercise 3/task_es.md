## Sobrecarga (#3)

Implementa versiones sobrecargadas de una función llamada `myJoinToString()`. Pasa valores por defecto para los argumentos en cada invocación de la función sobrecargada, sin utilizar el soporte del lenguaje para esta característica.

¿Por qué no puedes definir ambas funciones siguientes al mismo tiempo?

```text
fun List<Int>.myJoinToString(separator: String, prefix: String): String
fun List<Int>.myJoinToString(prefix: String, postfix: String): String
```

Descomenta la función `myJoinToString(prefix: String, postfix: String)` en el código inicial, y observa qué error obtienes.