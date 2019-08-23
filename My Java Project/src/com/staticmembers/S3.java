//accessing static members directly and using classname
package com.staticmembers;

public class S3
{
	static int i=20;
	public static void main(String[] args) 
	{
		System.out.println(i);// directtly
		System.out.println(S3.i); //using classname
		S3.i=30;
		System.out.println(i);
	}

}
/* 
output:
20
20
30
*/