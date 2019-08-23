//sample program using static method in main method.
package com.staticmembers;

public class S8 {
	static void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		test();
		System.out.println("+++++++++++");
		S8.test();
		System.out.println("main ends");
	}

}
/*
output:
main starts
from test
+++++++++++
from test
main ends
*/