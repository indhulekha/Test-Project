package com.methodchaining;

public class B 
{
	int i;
	public B initialize(int i)
	{
		this.i=i;
		return this;
	}
	public static B createObject()
	{
		return new B();
	}
	 void display()
	{
		System.out.println("i is:"+this.i);
	}
	
	public static void main(String[] args)
	{
		B.createObject().initialize(10).display();
	}

}
