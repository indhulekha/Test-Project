package com.inheritance;

public class Road {

	public static void main(String[] args)
	{
		Car ob=new Car("red",07,"mahindra");
		System.out.println("color of car is:   "+ob.color);
		System.out.println("the vehicle number is"+ob.vno);
		System.out.println("the brand is  "+ob.brand);
		ob.move();
		Vehicle ob1=new Vehicle("black",03);
		System.out.println("the color is:"+ob1.color);
		System.out.println("the vehicle number is"+ob1.vno);
		ob1.move();
	}

}
