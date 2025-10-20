## Recursión (#4)

El código inicial proporciona una clase `City`. Implementa una función de extensión `City.allReachable()` que construya un conjunto de todas las ciudades accesibles desde la `City` actual. Implementa esta función tanto de forma recursiva como iterativa.

Las conexiones directas para cada `City` se almacenan en su propiedad `connections`. `allReachable()` debe devolver todas las ciudades accesibles desde la ciudad dada a través de otras ciudades. La ciudad es accesible desde sí misma, por lo que también debe estar presente en el conjunto resultante.

Por ejemplo, considera el siguiente gráfico de conexiones:

```text
Ciudades: Dublín, Liverpool, Manchester, Leeds
Conexiones: Liverpool - Manchester; Manchester - Leeds
```

Tanto Manchester como Leeds son accesibles desde Liverpool, mientras que Dublín no lo es. El camino de Liverpool a Leeds pasa por Manchester. Por lo tanto, `allReachable()` para Liverpool debería devolver el conjunto de tres ciudades: Liverpool, Manchester, Leeds.