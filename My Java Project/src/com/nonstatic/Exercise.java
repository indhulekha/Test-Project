package com.nonstatic;

public class Exercise {
	static int i;
	int j;
	public void Sample()
	{
		//accessing the static member in non-static context
		System.out.println(i);	//using directly
		Exercise.i=200;
		System.out.println(Exercise.i);	//using classname
		//accessing non-static member from non-static context
		System.out.println(j);	//directly   //10
		System.out.println(this.j);		//using this  //10
		
	}
	public static void main(String[] args) 
	{
		System.out.println(i); //directly by membername
		Exercise.i=20;
		System.out.println(Exercise.i);  //using classname
		//accessing the non-static in static context
		Exercise ob1= new Exercise();	//creating object
		ob1.j=10;
		ob1.Sample();
		System.out.println(ob1.j);
		
		
	}

}
