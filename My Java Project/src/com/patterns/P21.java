/*
        A 
      B B 
    C C C 
  D D D D 
E E E E E 

 */
package com.patterns;

public class P21 {

	public static void main(String[] args)
	{
		int n=5;char k='A';
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j < n; j++)
			{
				if(i+j>=n-1)
					System.out.print(k+" ");
				else
					System.out.print("  ");
			}
			k++;
			System.out.println();
			
		}
		
		
	}

}
