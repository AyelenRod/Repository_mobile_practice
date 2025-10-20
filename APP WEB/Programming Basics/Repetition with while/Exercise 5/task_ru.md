## Освоение IDE: извлечение переменной

IntelliJ IDEA может автоматически извлечь `val` или `var`. Выберите выражение
`getFooResult()` внутри строкового шаблона, затем выполните одно из следующих действий:

- Вызовите <span class="control">`Найти действие`</span> (нажав <span class="shortcut">&shortcut:GotoAction;</span>),
затем введите `Extract variable`, чтобы найти соответствующее действие

- Нажмите <span class="shortcut">&shortcut:IntroduceVariable;</span>;

- Выберите <span class="control">`Рефакторинг | Извлечь | Переменную...`</span>
в меню приложения.

Введите имя новой переменной. IntelliJ IDEA пытается предложить имя
на основе выражения. Нажмите
<span class="shortcut">&shortcut:EditorEnter;</span>, чтобы завершить.