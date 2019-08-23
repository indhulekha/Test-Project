//accessing one class in another class,accessing static variables usind directly and by using clssname.
package com.staticmembers;

public class S7 {
	static int i=20;
	public static void main(String[] args)
	{
		int i=30;
		System.out.println(i);
		System.out.println(S7.i);
		System.out.println(S6.i);
	}

}
/*
output:
30
20
10
*/