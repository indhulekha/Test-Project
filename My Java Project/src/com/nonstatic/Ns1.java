package com.nonstatic;

public class Ns1 
{
	{
		int i=10;
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		Ns1 ob=new Ns1();
		System.out.println(new Ns1());
		
		
	}

}
/* 
 output:
10
10
com.nonstatic.Ns1@15db9742

 */