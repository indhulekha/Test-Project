/*
 1 0 1 0 1 
   0 1 0 1 
     0 1 0 
       1 0 
         1 

 */
package com.patterns;

public class P26
{

	public static void main(String[] args)
	{
		int n=5;int k=1;
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j < n; j++)
			{
				if(i<=j)
				{
						System.out.print(k%2+" ");
						k++;
				}
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
		
	}

}
