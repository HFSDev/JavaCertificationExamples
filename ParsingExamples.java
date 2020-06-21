package net.hfsdev;

/**
	Testing Java basics for exam 1Z0-815.
*/
public class ParsingExamples {
	public static void main(String[] args) {
		CalculatorTester calcTester = new CalculatorTester();
		calcTester.calculate(args);

		ShadowTester shadowTester = new ShadowTester();
		shadowTester.doSomething();

		MomentumTester mt = null;

		mt = new MomentumTester();
		mt = new MomentumTester();
		mt = new MomentumTester();
	}
}

class CalculatorTester {
	public void calculate(String[] args) {
		// Assertions are turned off by default. The JVM needs to be ran with -ea flag.
		assert(args.length > 0);
		int i = 0;
		Calculator calculator = new Calculator();
		try
		{
			i = 0;
			for(String arg : args) {
				calculator.add(Integer.parseInt(arg));
				i++;
			}
			System.out.println("Sum of N integers passed as arguments: " + calculator.result());
		} catch (NumberFormatException ex) {
			System.out.println("Exception occurred in position " + i + ".");
			ex.printStackTrace();
		}
	}
}

class Calculator {

	private int sum;

	public Calculator() {
		this.sum = 0;
	}

	public void add(int value) {
		this.sum += value;
	}

	public void subtract(int value) {
		this.sum -= value;
	}

	public int result() {
		return this.sum;
	}
}

class ShadowTester {
	public static int a;
	public void doSomething() {
		int a = 10;
		a = a;
		System.out.println (a);
		System.out.println (this.a); // This should not be allowed, but it is.
		System.out.println (ShadowTester.a);
		System.out.println("a == this.a => " + (a == this.a));
		System.out.println("this.a == ShadowTester.a => " + (this.a == ShadowTester.a));
	}

	public void crash() {
		ShadowTester st = new ShadowTester();
		// this = st; // Compiler error
	}
}

class MomentumTester {
	static {
		System.out.println("This text should be the first thing you see when loading MomentumTester.");
	}

	{
		System.out.println("This text, in the other hand, is seen whe an object is initialized.");
	}



}