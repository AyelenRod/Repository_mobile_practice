## Dominando el IDE: renombrar

El IDE simplifica muchas acciones comunes. Por ejemplo, supongamos que quieres renombrar un identificador. Inventar un buen nombre es difícil, por lo que a menudo es un proceso iterativo. Después de usar una función, por ejemplo, podrías pensar en un mejor nombre para ella.

<span class="control">`Buscar`</span> y <span class="control">`Reemplazar`</span> pueden llevar a resultados inesperados, porque el nombre podría aparecer en diferentes contextos, por ejemplo, dentro de cadenas de texto o comentarios. En el ejemplo de código puedes ver `answer` tanto como un nombre para un `val` como una parte de un literal de cadena. Es aún más complicado al renombrar una función, porque esa función podría ser usada en muchos archivos.

El IDE te permite renombrar una declaración automáticamente. Coloca el cursor sobre el nombre del `val` y presiona <span class="shortcut">&shortcut:RenameElement;</span>. También puedes elegir <span class="control">`Refactorizar`</span> en el menú de la aplicación, luego elegir <span class="control">`Renombrar`</span>.

Renombra el nombre del `val` a `result` sin cambiar la palabra "answer" en el literal de cadena. La cadena debería convertirse en: "The answer is $result".