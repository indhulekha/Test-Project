package com.prmitivetypecasting;

public class P2
{
	public static void addition(double a,double b)
	{
		double sum=a+b;
		System.out.println("the sum is"+sum);
	}
	public static void main(String[] args) 
	{
		addition(10.0,'a');
		addition('a','b');
		addition(10.0f,2);
		addition(10.0,22.9);
	}
	

}
/*
the sum is107.0
the sum is195.0
the sum is12.0
the sum is32.9
*/