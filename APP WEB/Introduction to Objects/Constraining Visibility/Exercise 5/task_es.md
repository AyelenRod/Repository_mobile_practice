## Dominando el IDE: Extraer Función

IntelliJ IDEA te permite extraer código repetitivo en una función. Selecciona el siguiente código en el cuerpo de la primera función:

```text
if (x <= 0) {
    println("Entrada incorrecta: $x debería ser positiva")
    return
}
```

Escribe la acción <span class="control">`Extract Function`</span>,
o utiliza el atajo <span class="shortcut">&shortcut:ExtractMethod;</span>,
o haz clic en el menú principal para elegir
<span class="control">`Refactorizar | Extraer | Función`</span>.
Escribe el nuevo nombre de la función `checkArgument` y presiona
<span class="shortcut">&shortcut:EditorEnter;</span>.

Acepta <span class="control">`Process Duplicates`</span>, para que la segunda ocurrencia del mismo fragmento de código también sea extraída.