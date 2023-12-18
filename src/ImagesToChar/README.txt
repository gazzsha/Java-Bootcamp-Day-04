1. Компиляция 
javac -verbose -d target -sourcepath ./src ./src/java/edu/school21/printer/**/*.java
javac -d target -sourcepath ./src ./src/java/edu/school21/printer/**/*.java
2. Запуск
java -cp target edu/school21/printer/app/Main . 0 it.bmp