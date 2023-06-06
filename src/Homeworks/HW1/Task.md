## Урок 1. Компиляция и интерпретация кода

Создать проект из трёх+ классов (основной с точкой входа и два класса в другом пакете),
которые вместе должны составлять одну программу (простое приложение на Ваш выбор),
которое просто демонстрирует работу некоторого механизма).

(*) Создать Dockerfile, позволяющий откопировать исходный код вашего приложения в образ
для демонстрации работы вашего приложения при создании соответствующего контейнера.

```bash
javac -sourcepath ./src -d out src/Homeworks/HW1/sample/Main.java

java -classpath ./out Homeworks.HW1.sample.Main

javadoc -d docs -sourcepath src -cp out -subpackages Homeworks -locale ru_RU -encoding utf-8 -docencoding cp1251

docker build -t mygame .

docker run -it mygame
```

