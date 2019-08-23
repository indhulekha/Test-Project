//create an non-static array of size 10
//store the even values in the array
//print the value which present at multiples of 3
package com.primitivearray;

public class A4
{

	public static void main(String[] args) 
	{
	int a[]=new int[10];//local array variable
	//storing  the array with multiples of 8
	for(int i=0,j=10;i<a.length;j++)
	{
		if(j%2==0)
		{
			a[i]=j;
			i++;
		}
	}
	//displaying the array
	for(int i=0;i<a.length;i++)
		{
			if(i%3==0)
			{
				System.out.println("the elements at " +i+ "  position is "+a[i]);
			}
		}
	}
	
}



