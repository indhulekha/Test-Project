package com.patterns;

public class P9 {

	public static void main(String[] args)
	{
		int n=5;char k='A';
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j < n; j++)
			{
				if(i>=j)
					System.out.print(k+" ");
			}
			k++;
			System.out.println();
			
		}
		
		
	}

}
