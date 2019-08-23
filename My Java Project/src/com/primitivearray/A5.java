//create an non-static array of size 5
//store the values which are multiples of 5
//display the array values
//copy them in to another array
//Display the values present odd indices

package com.primitivearray;

public class A5 {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		for(int i=0,j=0;i<a.length;j++)
		{
			if(j%5==0)
			{
				a[i]=j;
				i++;
			}
		}
		System.out.println("the values in natural array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int b[]=new int [5];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("the values in copied array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("the values at odd indices are");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==1)
			{
				System.out.println(b[i]);
			}
		}

		
	}

}
