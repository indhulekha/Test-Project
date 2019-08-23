//create an non-static array of size 10
//store the array with multiples of 8 and display the array.
package com.primitivearray;

public class A3 
{

	public static void main(String[] args) 
	{
	int a[]=new int[10];//local array variable
	//storing  the array with multiples of 8
	for(int i=0,j=50;i<a.length;j++)
	{
		if(j%8==0)
		{
			a[i]=j;
			i++;
		}
	}
	//displaying the array
	for(int i=0;i<a.length;i++)
		{
			System.out.println("the elements at" +i+ "position is"+a[i]);
		}
	}
	
}



