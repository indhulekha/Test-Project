package com.inheritance;

public class MainClass2 {

	public static void main(String[] args) 
	{
		X2 ob1=new X2();
		System.out.println("i:"+ob1.i);
		//System.out.println("j:"+ob1.j);
		//System.out.println("k:"+ob1.k);
		Y2 ob2=new Y2();
		System.out.println("i:"+ob2.i);
		System.out.println("j:"+ob2.j);
		//System.out.println("k:"+ob2.k);
		Z2 ob3=new Z2();
		System.out.println("i:"+ob3.i);
		System.out.println("j:"+ob3.j);
		System.out.println("k:"+ob3.k);
	}

}
/* output:
i:10
i:10
j:20
i:10
j:20
k:30
*/