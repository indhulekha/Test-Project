/*
A A A A A 
  B B B B 
    C C C 
      D D 
        E 

 */
package com.patterns;

public class P40 {

	public static void main(String[] args)
	{
		int n=5;char k='A';
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j < n; j++)
			{
				if(i<=j)
					System.out.print(k+" ");
				else
					System.out.print("  ");
			}
			k++;
			System.out.println();
			
		}
		
	}

}
