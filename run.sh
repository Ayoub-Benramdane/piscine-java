cd $1
javac *.java -d build
java -cp build ExerciseRunner
cd ..