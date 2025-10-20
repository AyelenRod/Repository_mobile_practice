## Dominando el IDE: Edición básica

En IntelliJ IDEA puedes utilizar atajos típicos del sistema operativo para realizar ediciones básicas:

| Operación | Atajo                                            | Descripción                                                   |
|-----------|--------------------------------------------------|---------------------------------------------------------------|
| Cortar    | <span class="shortcut">&shortcut:$Cut;</span>    | Cortar una línea actual o un bloque de código seleccionado al portapapeles. |
| Copiar    | <span class="shortcut">&shortcut:$Copy;</span>   | Copiar una línea actual o un bloque de código seleccionado al portapapeles.|
| Pegar     | <span class="shortcut">&shortcut:$Paste;</span>  | Pegar desde el portapapeles a la ubicación del cursor.        |
| Deshacer  | <span class="shortcut">&shortcut:$Undo;</span>   | Deshacer la última operación.                                 |
| Rehacer   | <span class="shortcut">&shortcut:$Redo;</span>   | Rehacer la última operación deshecha.                         |

Para seleccionar texto, presiona la tecla "Shift" mientras mueves el cursor por el texto.
Luego puedes mover el cursor arriba, abajo, a la izquierda o a la derecha, o moverlo al final o
al principio de una línea:

| Operación                            | Atajo                                                                 | Descripción                                                   |
|--------------------------------------|----------------------------------------------------------------------|---------------------------------------------------------------|
| Arriba con selección                 | <span class="shortcut">&shortcut:EditorUpWithSelection;</span>       | Mover el cursor una línea hacia arriba, seleccionando el texto. |
| Derecha con selección                | <span class="shortcut">&shortcut:EditorRightWithSelection;</span>    | Mover el cursor un carácter a la derecha, seleccionando el texto.|
| Mover al final de línea con selección | <span class="shortcut">&shortcut:EditorLineEndWithSelection;</span>  | Mover el cursor al final de la línea, seleccionando el texto.  |
| Mover al inicio de línea con selección | <span class="shortcut">&shortcut:EditorLineStartWithSelection;</span> | Mover el cursor al inicio de la línea, seleccionando el texto. |

Duplica la línea `println("Hello, Kotlin!")` en el ejemplo seleccionándola
y luego copiándola y pegándola.