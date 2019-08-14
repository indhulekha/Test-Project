/*
        A 
      * * 
    B B B 
  * * * * 
C C C C C 

 */
package com.patterns;

public class P20 {

	public static void main(String[] args)
	{
		int n=5;char k='A';
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j < n; j++)
			{
				if(i+j>=n-1)
				{
					if(i%2==0)
					{
						System.out.print(k+" ");
					}
					else
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			System.out.println();
			if(i%2==0)
			k++;
			
		}
		
		
	}

}
