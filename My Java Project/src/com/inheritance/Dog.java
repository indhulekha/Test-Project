package com.inheritance;

public class Dog extends Animal
{
	String breed;
	void sniff()
	{
		System.out.println("dog sniffs");
	}
	Dog()
	{
		
	}
	Dog(double height,double weight,String breed)
	{
		super(height,weight);
		this.breed=breed;
	}

}
