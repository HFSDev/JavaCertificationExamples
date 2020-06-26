package net.hfsdev;

public class StringsTesting{
	public static void main(String[] args) {
		String empty = new String();
		StringBuilder stringBuilder = new StringBuilder("Initial Content");
		String fromCharSequence = new String(new char[]{'c', 'h', 'a', 'r', ' ', 's', 'e', 'q', '.'});
		String fromBytesArray = new String(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
		
		System.out.println("Empty = " + empty);
		System.out.println("stringBuilder = " + stringBuilder);
		System.out.println("fromCharSequence = " + fromCharSequence);
		System.out.println("fromBytesArray = " + fromBytesArray);
		
		StringsTesting stringsTesting = new StringsTesting();
		stringsTesting.stringsSlippery();
		stringsTesting.checkInternning();
		System.out.println("My name is Hugo!");
		System.out.println(stringsTesting.replaceBeginningWithX("My name is Hugo!"));
	}
	
	public void stringsSlippery(){
		System.out.println(10 + 10 + " Not so easy to spot the result!");
		
		Object disguisedInt = 10;
		disguisedInt += " Indeed, it works";
		
		System.out.println(disguisedInt);
		
		String example1 = "Hey there!";
		String example2 = new String("Hey there!");
		String example3 = example2.intern();
		
		System.out.println("example1 == example2 = " + (example1 == example2));
		System.out.println("example2 == example3 = " + (example2 == example3));
		System.out.println("example1 == example3 = " + (example1 == example3));
	}
	
	public void checkInternning() {
		String strHello = "hello";
		
		StringBuilder sbHello = new StringBuilder("hello");
		
		System.out.println("String ->" + ("hello" == strHello.toString()));
		System.out.println("StringBuilder ->" + ("hello" == sbHello.toString()));
		
		
	}
	
	public String replaceBeginningWithX(String content) {
		final int preservedFinalPartLength = 5;
		if(null == content) return null;
		if(content.length() <= preservedFinalPartLength) return new String(content);
		
		StringBuilder template = new StringBuilder(content);
		int changebleCharsLength = content.length() - preservedFinalPartLength;
		for(int i = 0; i<changebleCharsLength; i++) {
			template.replace(i, i+1, "X");
		}
		return template.toString();
	}
}