0. Create directory
mkdir target
1. Compiling 
javac -verbose -d target -sourcepath ./src ./src/java/edu/school21/printer/**/*.java
2. Copy resources
cp -r src/resources target/
3. Create archive with existing manifest, will all the file in target/
jar -cmf src/manifest.txt target/images-to-chars-printer.jar -C target/ . 
4. Running
java -jar target/images-to-chars-printer.jar . 0