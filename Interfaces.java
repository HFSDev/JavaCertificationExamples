package net.hfsdev;

public class Main implements Foo, Bar{
	public static void main(String[] args) {
	
		Main m = new Main();
		m.method();
	
	}
}

public interface Foo {
	default void method() {
		System.out.println("Foo Default Method.");
	}
}

public interface Bar {
	default void method() {
		System.out.println("Bar Default Method.");
	}
}