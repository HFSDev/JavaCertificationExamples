# Java 11 Incongruences #

## java compilation and execution in single command line - java <java_file.java> ##
Java 11 introduced a nice feature for running single file programs in an easier way, which implicates the execution of the program without interacting with the javac utility directly. The incongruence I found with this new feature is the following.

Java compiler doesn't accept a java source code file with more than one public class. You cannot have the following:

//In file JavaIncongruenceExample.java
package hfsdev.net;

public class JavaIncongruenceExample {
	public static void main(String[] args) {
		System.out.println("Here, hold my incongruence.");

		Foo foo = new Foo();
		foo.greeting();
	}
}

public class Foo {
	public void greeting() {
		System.out.println("Hello, I'm an object of the public Foo class.");
	}
}

The Java compiler will complain and will not compile the above source code.

$ javac -d . JavaIncongruenceExample.java 
JavaIncongruenceExample.java:12: error: class Foo is public, should be declared in a file named Foo.java
public class Foo {
       ^
1 error

But if you run with java command, everything works fine.
$ java JavaIncongruenceExample.java
Here, hold my incongruence.
Hello, I'm an object of the public Foo class.

Another incongruence in this topic is that the file's name can be other than the class inside the file. That is, we can have a file named MyJavaFile.java and the main class may be named Foo, and while javac will not compile the source code, the java command will run the file happily.
This prompts the question: what version of the compiler is the java command using to compile the code in memory? Why it is different from the javac compiler?

## Another compilation incongruence - Uninitialized variables ##



In UninitializedVars.java
/**********************/
package net.hfsdev;

public class UninitializedVars {
	
	public static void main(String[] args){
		String[] uninitializedStrings = new String[10];
		for(String uninitializedString : uninitializedStrings) {
			System.out.println(uninitializedString);
		}
		
		int[] uninitializedIntegers = new int[10];
		for(int uninitializedInteger : uninitializedIntegers) {
			System.out.println(uninitializedInteger);
		}
	}
}