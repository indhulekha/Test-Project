package com.assignments;

public class Product {
	public static void mul(int a, int b)
	{
		System.out.println("the product of" +a+ "and" +b+ "is" +(a*b));
	}
	public static void mul(double a, double b, double c)
	{
		System.out.println(" the product is" +(a*b*c));
	}
	
	public static void mul(int a, int b, int c)
	{
		System.out.println("the product is" +(a*b*c));
	}
	public static void mul(float a, float b, float c)
	{
		System.out.println(" the product is" +(a*b*c));
	}
	
	
	
	public static void main(String[] args) 
	{
		mul(7,9);
		mul(2.0,1.3,2.9);
		mul(91,2,1);
		mul(2.0f,2.2f,2.9f);
		
	}

}
/*
the product of7and9is63
 the product is7.54
the product is182
 the product is12.76

*/