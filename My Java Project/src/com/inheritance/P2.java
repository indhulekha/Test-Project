package com.inheritance;

public class P2 extends P1
{
	int j=20;
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println("from IIB of P2");
		
	}
	P2()
	{
		System.out.println("from P2()");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		P2 obj1=new P2();
		System.out.println(obj1);
		System.out.println("i:"+obj1.i+"j:"+obj1.j);
	}
}
