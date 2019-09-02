package com.nonstatic;

public class Employ {
	String id;
	static int count;
	{
		count++;
		id="TY"+count;
		
		
	}

	public static void main(String[] args)
	{
		Employ ob =new Employ();
		System.out.println(ob.id);
		Employ ob1 =new Employ();
		System.out.println(ob1.id);
		Employ ob2 =new Employ();
		System.out.println(ob2.id);
		Employ ob3 =new Employ();
		System.out.println(ob3.id);
		//System.out.println("the number of employees are:"+count);
	}

}
