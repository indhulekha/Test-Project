package com.encapsulation;

public class Voter {
	private int age;
	private int id;
	public int getAge() {
		return age;
	}
	public void setAge(int age) { 
		if(age==18)
		{
		this.age = age;
		System.out.println("the voter age is 18 and Id is to be generated");
		}
		else if(age>18)
		{
			this.age=age;
			System.out.println("The candidate age is"+this.age+" eligible to vote");
		}
		else
		{
			System.out.println("voter id is no provided below 18");
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>1)
		{
		this.id = id;
		System.out.println("the entered id is"+id);
		}
		else
			System.out.println("enter id is invalid");
	}
	Voter(int age,int id)
	{
		this.age=age;
		this.id=id;
	}

}
