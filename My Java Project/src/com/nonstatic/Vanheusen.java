//WAP to create a class known as Vanheusen shirts
//having properties String color;
//integer size;
//String product code;
//the product code for the 1st shirt is van1.
//create two constructors for the class.
package com.nonstatic;

public class Vanheusen 
{
	String productcode;
	int size;
	String color;
	static int countshirt;
	{
		countshirt++;
		productcode="VAN"+countshirt;

	}
	
	Vanheusen()
	{
	}
	Vanheusen(String color,int size)
	{
		this.color=color;
		this.size=size;
	}
	public static void main(String[] args) 
	{
		Vanheusen ob1=new Vanheusen();
		System.out.println("the color is:"+ob1.color+"the size is:"+ob1.size+"the productcode is:"+ob1.productcode);
		Vanheusen ob2=new Vanheusen("red",32);
		System.out.println("the color is:"+ob2.color+"the size is:"+ob2.size+"the productcode is:"+ob2.productcode);
	
	}

}
