## Dominando el IDE: Extraer Variable

IntelliJ IDEA puede extraer un `val` o `var` automáticamente. Selecciona la expresión `getFooResult()` dentro de una plantilla de cadena, luego haz una de las siguientes acciones:

- Invoca <span class="control">`Buscar acción`</span> (presionando <span class="shortcut">&shortcut:GotoAction;</span>), luego escribe `Extraer variable` para encontrar la acción correspondiente

- Presiona <span class="shortcut">&shortcut:IntroduceVariable;</span>;

- Elige <span class="control">`Refactorizar | Extraer | Variable...`</span> en el menú de la aplicación.

Escribe el nombre de la nueva variable. IntelliJ IDEA intenta sugerir un nombre basado en la expresión. Pulsa <span class="shortcut">&shortcut:EditorEnter;</span> para finalizar.