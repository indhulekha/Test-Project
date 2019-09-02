package com.nonstatic;

public class School {

	public static void main(String[] args)
	{
		Student s1=new Student();
		System.out.println("student name:"+s1.name+"\n student marks "+ s1.marks);
		s1.name="indu";
		s1.marks=75;
		System.out.println("student name:"+s1.name+"\n student marks "+ s1.marks);
		Student s2=new Student();
		System.out.println("student name:"+s2.name+"\n student marks "+ s2.marks);
		s2.name="Anju";
		s2.marks=80;
		System.out.println("student name:"+s2.name+"\n student marks "+ s2.marks);
		
	}

}
