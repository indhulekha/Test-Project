//using static blocks,initializing variables in static blocks,calling one class into another class.
package com.staticmembers;

public class S15
{
	static int i=10;
	static
	{
		int i=20;
		System.out.println(i);
		System.out.println(S13.i);
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
	}

}
 