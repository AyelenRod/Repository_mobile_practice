## Manipulación de listas (#4)

Implementa la función `friendSuggestions(person: Person)` para devolver amigos de
amigos de `person`, excluyendo a aquellas personas que ya son sus amigos.
Considera las siguientes conexiones de amistad:

```text
Alice - Bob
Bob - Charlie
```

`friendSuggestions()` debería devolver Charlie para Alice, porque Charlie es un
amigo del amigo de Alice, Bob, y aún no es un amigo de Alice.

El siguiente ejemplo no produce sugerencias de amigos para Alice, porque Bob y
Charlie ya son sus amigos:

```text
Alice - Bob
Alice - Charlie
Bob - Charlie
```