## Освоение IDE: Извлечение функции

IntelliJ IDEA позволяет извлекать повторяющийся код в отдельную функцию. Выберите следующий код в теле первой функции:

```text
if (x <= 0) {
    println("Некорректный ввод: $x должен быть положительным")
    return
}
```

Введите действие <span class="control">`Extract Function`</span>, или используйте сочетание клавиш <span class="shortcut">&shortcut:ExtractMethod;</span>, или выберите в главном меню <span class="control">`Refactor | Extract | Function`</span>. Введите новое имя функции `checkArgument` и нажмите <span class="shortcut">&shortcut:EditorEnter;</span>.

Согласитесь с <span class="control">`Process Duplicates`</span>, чтобы второй случай с тем же фрагментом кода также был извлечен.