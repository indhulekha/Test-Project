/*
A A A A A 
  * * * * 
    B B B 
      * * 
        C 

 */
package com.patterns;

public class P39 {

	public static void main(String[] args)
	{
		int n=5;char k='A';
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j < n; j++)
			{
				if(i<=j)
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
