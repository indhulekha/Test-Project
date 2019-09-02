package com.nonstatic;

public class Ns2 
{
	{
		System.out.println("from IIB1");
	}

	public static void main(String[] args)
	{
		System.out.println("from main");
		Ns2 ob1=new Ns2();
		System.out.println("main ends");
	}
	{
		System.out.println("from IIB2 ");
	}

}
/* output:
from main
from IIB1
from IIB2 
main ends
*/