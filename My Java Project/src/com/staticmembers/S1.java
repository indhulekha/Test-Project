//sample program to access static members
package com.staticmembers;

public class S1 {
	static int a;
	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(b);
	}
	static boolean b;
}

/*output:
0
false
*/