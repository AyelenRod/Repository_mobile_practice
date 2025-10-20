## Освоение IDE: Расширение выделения

Когда вы выполняете рефакторинги, такие как <span class="control">`Extract Property`</span>, вам необходимо выбрать выражение, которое вы хотите извлечь. Это выражение может быть довольно сложным.

Действие <span class="control">`Extend Selection`</span>, доступное с помощью ярлыка <span class="shortcut">&shortcut:EditorSelectWord;</span>, очень полезно в данном случае: оно выделяет внешнее выражение, увеличивая выделение на каждом шаге. Обратное действие называется <span class="control">`Shrink selection`</span> и доступно через <span class="shortcut">&shortcut:EditorUnSelectWord;</span>.

Поместите курсор на строку `println("Incorrect input: $x should be positive")` и расширяйте и сужайте выделение, чтобы увидеть, как это работает. Продолжайте расширять выделение, пока не будет выделен весь файл.