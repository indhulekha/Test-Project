/*WAP to design a class representing an entity known as marker having the following properties:
1.string color
2. string name
3.string length
4.integer price
design a method known as initialize to assign a value ,the method should accept 
the values which are to be initialized
 */
package com.nonstatic;

public class Marker
{
	String color;
	String name;
	double length;
	int price;
	public void initialize(String color,String name,double length,int price)
	{
		this.color=color;
		this.name=name;
		this.length=length;
		this.price=price;
		System.out.println("the color is:"+this.color+"\n the name is:"+this.name+
							"\n the length is:"+this.length+"\n the price is:"+this.price);
	}
	
	public static void main(String[] args)
	{
		Marker ob=new Marker();
		ob.initialize("black","zelo",5.0,30);
		Marker ob1=new Marker();
		ob1.initialize("blue","rorito",5.0,30);
	}

}
