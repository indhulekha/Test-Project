/*
E E E E E 
D D D D   
C C C     
B B       
A         

 */
package com.patterns;

public class P31 {

	public static void main(String[] args)
	{
		int n=5;char k='E';
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j < n; j++)
			{
				if(i+j<=n-1)
					System.out.print(k+" ");
				else
					System.out.print("  ");
			}
			k--;
			System.out.println();
			
		}
		
	}

}
