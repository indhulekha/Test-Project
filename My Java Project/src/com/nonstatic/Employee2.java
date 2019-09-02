package com.nonstatic;

public class Employee2 {
	static int countEmployee;
	String id;
	String name;
	
	{
		countEmployee++;
		id="TY"+countEmployee;
	}
	Employee2()
	{
		
	}
	Employee2(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Employee2 e1 =new Employee2();
		System.out.println(e1.name+" has "+ e1.id+" as id");
		Employee2 e2 =new Employee2("sara");
		System.out.println(e2.name+" has "+e2.id+"  as id");
		
		
	}

}
