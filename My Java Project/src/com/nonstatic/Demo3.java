package com.nonstatic;

public class Demo3
{
	int i=10;
	{
		System.out.println(i);
		this.i=20;

	}
	Demo3()
	{
		System.out.println("from Demo3()");
	}

}
