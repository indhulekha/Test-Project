package com.inheritance;

public class MainClass1 
{
	public static void main(String[] args) {
		X1 ob1=new X1();
		System.out.println("i:"+ob1.i);
		//System.out.println("j:"+ob1.j);
		Y1 ob2=new Y1();
		System.out.println("i:"+ob2.i);
		System.out.println("j:"+ob2.j);
		
	}
}
/* output:
i:10
i:10
j:20
*/