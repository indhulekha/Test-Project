package com.inheritance;

public class Animal
{
	double height;
	double weight;
	
	void talk()
	{
		System.out.println("animal talks");
	}
	Animal()
	{
	
	}
	Animal(double height,double weight)
	{
		this.height=height;
		this.weight=weight;
	}
}
