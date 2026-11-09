# Блок 2

Для работы нужен JDK 21. Распакуйте архив и откройте папку Block2 в IntelliJ IDEA. В File → Project Structure → Project SDK выберите JDK 21. Откройте нужный класс с методом main и нажмите кнопку запуска рядом с ним.

| Практика | Задания и объяснения |
|---|---|
| 8 | [5, 8, 14](Practical8/README.md) |
| 9 | [1, 2](Practical9/README.md) |
| 10 | [1, 3](Practical10/README.md) |
| 11 | [1, 2, 3, 4, 5](Practical11/README.md) |
| 13 | [1, 2, 3, 4, 5, 6](Practical13/README.md) |
| 14 | [1, 2, 7, 9](Practical14/README.md) |

Практика 8 соответствует варианту 5. Класс Student для практик 9 и 10 хранится в Practical10. При отдельном открытии Practical9 папка Practical10 должна находиться рядом.

Для сборки из PowerShell в папке Block2 выполните

```powershell
.\build-all.cmd 'C:\Tools\jdk-21'
```

Замените путь на папку своего JDK. Если JDK 21 указан в JAVA_HOME или доступен через PATH, путь можно опустить. Для сборки одной практики используйте её build.cmd. Готовые классы появятся в её папке build/classes.

Для запуска из папки нужной практики выполните команду с полным именем класса из её README

```powershell
& 'C:\Tools\jdk-21\bin\java.exe' -cp build/classes ru.mirea.block2.practical8.Task5
```

Исходники и текстовые файлы используют UTF-8.
