# First Task Array

Разработать приложение согласно требованиям, приведенным ниже. В приложении должна быть реализована функциональность, определенная заданием.

# Requirements
- Разработать entity-класс: «класс Массив»
- Entity-класс не следует наполнять методами, выполняющими функциональные действия (методами бизнес-логики, такими как вычисление, поиск и т.д.).
- Все классы приложения должны быть структурированы по пакетам (package).
- Оформление кода должно соответствовать Java Code Convention.
- Для записи логов использовать Log4J2
- Разработать тесты на TestNG.
- Решение задания хранить на Github.
- Методы класса Objects использовать запрещено.

## Part 1
- Создать класс Массив.
- Разработать service-классы реализующие функциональности:
  * поиск min\max значения массива,
  * замену элементов массива по условию,
  * определение среднего значения элементов массива,
  * определение суммы элементов массива,
  * определение числа положительных\отрицательных элементов массива.

## Part 2
- Сортировка массива тремя различными алгоритмами.
- Параметры, необходимые для создания массивов, получить чтением информации из файла (.txt). Часть данных должна быть некорректной. Если встретилась некорректная строка, приложение должно переходить к следующей строке. Чтение может быть прекращено по достижении первой корректной строки. Файл данных должен находиться в отдельном каталоге.
- Для чтения из файла можно использовать методы, появившиеся в Java8.
- Использовать собственные классы исключительных ситуаций.
- Разработать validation-классы для валидации исходных данных при создании массивов.
Например: корректная строка в файле для создания массива: «1, 2, 3» или «1 – 2 - 3»;
Некорректная строка в файле для создания массива: «1z1 21 32». Присутствует недопустимый символ
«z», следовательно всю строку следует считать некорректной.

## Part 3
- Решить задачи, поставленные в part 1 и 2, с помощью возможностей IntStream
