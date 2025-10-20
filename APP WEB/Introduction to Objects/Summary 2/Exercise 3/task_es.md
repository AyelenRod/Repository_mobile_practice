## Resumen 2 (#3)

Crea una clase `FixedSizeHolder` con un parámetro de constructor que establezca el número máximo de objetos `Any` que se pueden contener. Añade propiedades de solo lectura `size` y `full`. Si el usuario llama a `add()` cuando está `full`, lanza una `IllegalStateException`.