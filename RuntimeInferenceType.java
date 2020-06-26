package net.hfsdev;

public class RuntimeInferenceType {
	
	public static void main(String[] args){
		// Feature LVTI - Also known as var declaration.
		var name = "Hugo Frederico Soares";
		System.out.println("Hello, "+name);
		var intArray = new int[]{1, 2, 3};//OK
		for (var n : intArray) {
			System.out.println("Number: "+ n);
		}
		
		int[] myArray = {1, 2, 3, 4, 5}; //OK
		for (var n : myArray) {
			System.out.println("Number: "+ n);
		}
		
		//NOT OK - Compilation Error
		var myArray = {1, 2, 3, 4, 5}; 
		for (var n : myArray) {
			System.out.println("Number: "+ n);
		}
	}
}