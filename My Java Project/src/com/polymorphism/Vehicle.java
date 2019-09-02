package com.polymorphism;

public class Vehicle
{
	String vno;
	String color;
	static int vehiclecount;
	Vehicle()
	{
		vehiclecount++;
		vno="KA"+vehiclecount;
	}
	public Vehicle(String color) {
		this();
		this.color = color;
	}
	void move()
	{
		System.out.println("vehicle is moving");
	}
	void move(String location)
	{
		System.out.println("Vehicle is moving towards:"+location);
	}
}
