package net.hfsdev;

public class StringManipulation{
	public static void main(String[] args){
		String str1 = "7" + 5 + 10;
		String str2 = 7 + 5 + "10";
		String str3 = "7" + (5 + 10);
		
		System.out.println("1: " + str1);//"7510"
		System.out.println("2: " + str2);//"1210"
		System.out.println("3: " + str3);//"715"

		int m = 50;
		int n = ++m; // n = 51, m = 51
		int o = m--; // o = 51, m = 50
		int p = --o+m--; // p = 50+50 = 100, m = 49 o = 50
		int x = m<n?n<o?o<p?p:o:n:m; // m<n?(n<o?(o<p?p:o):n):m;  x = 47
		// m = 49, n = 51, o = 50, p = 100
		//49<51?51:m;  x = 51
		
		System.out.println(String.format("m = %d, n = %d, o = %d, p = %d, x = %d", m, n, o, p, x));
		
		int k = 4;
		boolean flag = k++ == 5; // false
		flag = !flag; // true
		System.out.println(flag);// true
		
		//byte b = 1; // b = 0x01
		//b = b << 1; // b = 0x10
		//int c = b << 1; // c = 0x0100
		////byte d += b; // d -> not initialized: Error
		//byte e = 0; //e = 0
		//e += b; // e = 0x10
		//System.out.println(String.format("b = %d, c = %d, e = %d", b, c, e));
		
		System.out.println("----------");
		String s = "a";
		String[] sa = {"a", s, s.substring(0,1), new String("a"), ""+'a'};
		for(int i = 0; i < sa.length; i++){
			System.out.println(i);
			System.out.println(s == sa[i]);
			System.out.println(s.equals(sa[i]));
		}
		
	}
}