## Expresiones `when` (#1)

Crea una función `cloudiness(cloudPercent: Int)` que devuelva una descripción basada en el porcentaje de nubosidad: "Nublado" (cuando `cloudPercent` está en el rango 81..100), "Mayormente Nublado" (61..80), "Parcialmente Soleado" (41..60), "Mayormente Soleado" (21..40) y "Soleado" (0..20). Si el argumento no está en el rango 0..100, lanza `IllegalArgumentException`.