package com.assignments;

public class PrintEven {
	
	public static boolean isEven(int a)
	{
		if(a%2==0)
			return true;
		else
			return false;
	}
	public static void printEven(int n)
	{
		for(int a=0;a<n;a++)
		{
			if(isEven(a))
			System.out.println(a);
		}
	}

	public static void main(String[] args)
	{
		
		printEven(10);
		/*if(isEven(21))
			System.out.println("number is even" );
		else
			System.out.println("num is odd");
*/
	}

}
