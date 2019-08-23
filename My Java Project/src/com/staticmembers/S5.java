//to access static variables when local and global variables have same name.
package com.staticmembers;

public class S5 
{
	static int a=10;
	public static void main(String[] args)
	{
		int a=20;
		System.out.println(a);
		System.out.println(S5.a);
	}
	

}
/*
output:
20
10
*/