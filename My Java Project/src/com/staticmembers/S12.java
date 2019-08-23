//sample program foe static blocks and classloading
package com.staticmembers;

public class S12 
{
	static
	{
		System.out.println("SIB-2");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
	}
	static
	{
		System.out.println("SIB-1");
	}

}
/* 
 output:
 SIB-2
SIB-1
from main

 */