0. Create directory
mkdir target
1. Compiling 
javac -d target -cp lib/JColor-5.5.1.jar:lib/jcommander-1.82.jar:/src ./src/java/edu/school21/printer/**/*.java
2. Copy resources
cp -r src/resources target/
3. Unpacking lib
cd target&&jar xf ../lib/jcommander-1.82.jar&&jar xf ../lib/JColor-5.5.1.jar
4. Create archive with existing manifest, will all the file in target/
cd ../&&jar -cmf src/manifest.txt target/images-to-chars-printer.jar -C target/ . 
5. Running
java -jar ./target/images-to-chars-printer.jar --white=RED --black=white