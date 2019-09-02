package com.polymorphism;

public class B extends A
{
	void test()
	{
		System.out.println("From tes() of B");
	}
	public static void main(String[] args) {
		A ob;
		ob=new A();
		ob.test();
		System.out.println("_____________");
		
		ob=new B();//auto upcasting
		ob.test();
		System.out.println("_____________");
		A ob2=new B();//is-a,UC,Methodoverriding
		ob2.test();
		
		A[] array={ new A(),new B(),new A(),new B()};
		{
			for(int i=0;i<array.length;i++)
			{
				array[i].test();
				System.out.println("___________");
			}
		}
		
	}
}
