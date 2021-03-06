# Scripting with Java

This repository shows several approaches to writing scripts with Java:

1. JShell Scripts (Java 9, [JEP 222](https://openjdk.java.net/jeps/222))
2. Single-File Source-Code Programs (Java 11, [JEP 330](https://openjdk.java.net/jeps/330))
3. Single-File Source-Code Programs with a Shebang

References:

* https://docs.oracle.com/javase/9/jshell/scripts.htm
* https://cr.openjdk.java.net/~rfield/tutorial/JShellTutorial.html
* https://stackoverflow.com/questions/44916618/how-to-execute-a-java-script-with-jshell
* https://www.baeldung.com/java-single-file-source-code

Scripts:

* hello:
  * JShell: `jshell hello.jsh`
  * JShell with a Shebang: `./hello.jsh`
  * Single-File Source-Code Program: `java Hello.java`
  * Single-File Source-Code Program with a Shebang: `./hello`
* ls: `./ls [dir]`
* curl: `./curl <url>`
* comm: `./comm <file1> <file2> <outfile>`
