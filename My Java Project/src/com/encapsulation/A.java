package com.encapsulation;

public class A {

	public static void main(String[] args) {
		Voter v1=new Voter(20,02);
		System.out.println("Age of voter with id "+v1.getId()+" is "+v1.getAge());
		v1.setAge(18);
		v1.setAge(30);
		v1.setAge(12);
		v1.setId(0);
		v1.setId(12);
		
	}

}
