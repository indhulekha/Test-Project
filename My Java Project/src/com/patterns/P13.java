package com.patterns;

public class P13 {

	public static void main(String[] args)
	{
		int n=5;int k=1;
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j < n; j++)
			{
				if(i>=j)
				{
						System.out.print(k%2+" ");
						k++;
				}
			}
			System.out.println();
			
		}
		
		
	}

}
