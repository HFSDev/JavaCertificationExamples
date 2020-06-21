package net.hfsdev;

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