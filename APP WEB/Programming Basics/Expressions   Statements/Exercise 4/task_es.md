## Dominando el IDE: Depurar

La depuración es una manera poderosa de descubrir lo que está sucediendo en tu código. Puedes observar estados intermedios del programa y cambios entre estos estados.

Haz clic en el ícono junto a la función `main()` y elige <span class="control">`Depurar`</span>.
Ten en cuenta que hay un atajo especial para eso:
<span class="shortcut">&shortcut:DebugClass;</span>.
El programa simplemente se ejecuta y muestra el resultado, porque no has establecido ningún punto donde la ejecución deba ser pausada.

Los puntos donde deseas pausar la ejecución para observar el estado de las variables se llaman *puntos de interrupción*. Para crear puntos de interrupción en el editor, primero coloca el cursor en la línea deseada del código fuente. Luego haz una de las siguientes acciones:

- Haz clic en el área del margen izquierdo en una línea donde quieras alternar un punto de interrupción.

- En el menú principal, elige <span class="control">`Ejecutar | Alternar Punto de Interrupción`</span>.

- Presiona <span class="shortcut">&shortcut:ToggleLineBreakpoint;</span>.

Establece puntos de interrupción en las líneas 6 y 7:

```kotlin
x = 2
println(x)
```

Luego comienza a depurar nuevamente el programa y observa cómo se detiene en el primer punto de interrupción. La ventana de depuración debajo de la pantalla te muestra los valores de todas las variables. Continúa el proceso haciendo clic en
<span class="control">`Continuar programa`</span> a la izquierda de la ventana de depuración o presionando <span class="shortcut">&shortcut:Resume;</span>. Observa cómo cambia el valor de la variable `x` después de la asignación.

Para detener la depuración, puedes finalizar el programa y ver el resultado o detenerlo explícitamente. Presiona el botón <span class="control">`Detener`</span> para detener el proceso de depuración.