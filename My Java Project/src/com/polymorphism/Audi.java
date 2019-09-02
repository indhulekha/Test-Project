package com.polymorphism;

public class Audi extends Car
{
	String type;
	Audi()
	{
		
	}
	Audi(String color,String name,String type)
	{
	super(color,name);
	this.type=type;
	}
	@Override
	void move(String location)
	{
		System.out.println(type+" color car is moving towards "+ location);
		
	}
	

}
