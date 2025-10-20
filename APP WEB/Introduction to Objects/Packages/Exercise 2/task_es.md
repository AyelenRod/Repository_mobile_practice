## Paquetes (#2)

El código de inicio define tres paquetes `aaa`, `bbb` y `ccc` a través de los archivos
`aaa.kt`, `bbb.kt` y `ccc.kt`.

En el primer paquete `aaa`, define:

- `val x = 10`

- Una función de nivel superior `fa()` que toma un parámetro `Int` y devuelve ese
  argumento multiplicado por `x`

- Una clase `K` con un `toString()` que devuelve `"K"`

En el `paquete bbb`, `importa` todos los componentes de `aaa` y úsalos en una
función `g()`, que toma un parámetro `Int` `i` y devuelve el siguiente
literal `String` usando miembros de `aaa`:

```text
"${K()} ${fa(i)}"
```

Importa todo desde `bbb` en el `paquete ccc`. En `main()`, llama a
`println(g(1))`. Puedes ver que sin importar los 
componentes del `paquete aaa` no puedes acceder a ninguno de ellos.