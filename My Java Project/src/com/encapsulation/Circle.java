package com.encapsulation;

public class Circle extends Shape
{
	double radius=0;
	double area(int length)
	{
		radius=PI*length*length;
		return radius;
	}

}
