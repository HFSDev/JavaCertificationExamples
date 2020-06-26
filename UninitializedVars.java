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