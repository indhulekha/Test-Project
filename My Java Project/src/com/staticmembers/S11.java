//calling a static method directly in the same class.
package com.staticmembers;

public class S11 
{
	static int a=20;
	static void test()
	{
		int a=10;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(S6.i);
		test();
		System.out.println(a);
	}

}
/*
output:
20
10
10
20
*/