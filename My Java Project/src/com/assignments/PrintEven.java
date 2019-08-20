/*
 WAP to design 2 methods,the name of the 1st method is printEven.
 This method should printEven number upto a given limit and check
 if the given number is even or not.you hould design a method known
  as isEven.call printeven from maain method.
 */
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
/*
OUTPUT:
0
2
4
6
8*/

