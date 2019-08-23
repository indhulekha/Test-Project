//local variables cannot be accessed globally.
package com.staticmembers;

public class S14 
{
	static
	{
		int i=20;
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		System.out.println("from main");
		//System.out.println(i);//CTE
	}
	

}
