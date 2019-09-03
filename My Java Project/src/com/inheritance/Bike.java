package com.inheritance;

public class Bike extends Two
{
	double mileage;
	Bike()
	{
		
	}
	Bike(String color,String name,double mileage)
	{
		super(color,name);
		this.mileage=mileage;
	}
	
}
