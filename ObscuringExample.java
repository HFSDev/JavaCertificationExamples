package net.hfsdev;

public class Main {
	public static void main(String[] args) {
		System.out.println("Initializing app...");
		// The line bellow doesn't compile, the compile cannot know which NUMBER we are referring to.
		// System.out.println("Number: " + NUMBER); 
		// Bellow line compiles fine.
		System.out.println("Number: " + Foo.NUMBER); 
		
		{
			int i = 10;
			System.out.println("Inside a block... i = " + i);
		}
		
		Pooh p = new Pooh();
		p.someMethod();
		p.testNullArgs(args);
		
		
	}
}

public class Foo {
	public static int NUMBER = 100;
}

public class Bar {
	public static int NUMBER = -100;
}

public class Pooh {
	public static int NUMBER = 100;
	public void someMethod() {
		int NUMBER = 10; // OK
		for (int i=0; i<10; i++) {
			System.out.println(NUMBER + " - " + i);
		}
		// NOT OK, compilation error.
		/* for (int NUMBER=0; NUMBER<10; NUMBER++) {
			System.out.println(NUMBER + " - " + i);
		} */
		{
			int i = 50;
			System.out.println(NUMBER + " - " + i);
		}
	}
	
	public void testNullArgs(String[] mainArgs) {
		String[] args = new String[mainArgs.length];
		for(String arg : args) {
			System.out.println(arg);
		}
		String testNotDefinedString;
		System.out.println(testNotDefinedString);
		
	}
}