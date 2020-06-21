package net.hfsdev;

public class WrapperClassesTraining {
	
	public static void main(String[] args) {
		int a = 100;

		// Autoboxing
		Integer oI = a;
		// Unboxing
		int b = oI;

		System.out.println(oI.shortValue());
		System.out.println(oI.intValue());
		System.out.println(oI.longValue());
		System.out.println(oI.floatValue());
		System.out.println(oI.doubleValue());

		System.out.println("b: " + b);
		long l = Long.MAX_VALUE;
		int unboxedLongInt = (int)l; // This should fail compilation without casting.

		System.out.println("Long l: " + l);
		System.out.println("Unboxed long max value into int: " + unboxedLongInt);
	}

}