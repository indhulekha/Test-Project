//To print the even numbers between the given limits
package com.assignments;

public class DisplayEven {
	public static void displayEven(int a,int b)
	{
		while(a<=b)
		{
			if(a%2==0)
			System.out.println(a);
			a++;
		}
	}
	public static void main(String[] args) 
	{
		displayEven(2,20);

	}

}
/*
OUTPUT:
2
4
6
8
10
12
14
16
18
20
*/