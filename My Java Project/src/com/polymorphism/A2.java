package com.polymorphism;

public class A2
{
	public static void main(String[] args) {
		
	A[] array={ new A(),new B(),new A(),new B()};
	for(A obj:array)
	{
		obj.test();
		System.out.println("**********");
	}

}
}
