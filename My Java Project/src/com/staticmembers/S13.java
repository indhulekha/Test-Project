//sample progress using static initializer block
package com.staticmembers;

public class S13 
{
	static int i;
	static
	{
		System.out.println(i);
		i=10;
	
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
	}

}
/*
 output:
 0
10
*/
