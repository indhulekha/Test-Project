package com.inheritance;

public class OnRoad 
{
	public static void display(Vehiclee v )
	{
		System.out.println("color is:"+v.color);
		if(v instanceof Two)
			System.out.println("Name is"+((Two)v).name);
		if(v instanceof Bike)
			System.out.println("Mileage is"+((Bike)v).mileage);
		System.out.println("_______________________");
	}
	public static void main(String[] args)
	{
		Bike b1=new Bike("black","vespa",50);
		Two t1=new Two("red","jupiter");
		Vehiclee v2=new Vehiclee("brown");
		Bike b2=new Bike("Grey","swift",40);
		display(b1);
		display(t1);
		display(v2);
		display(b2);
		
	}
}
