package com.patterns;

public class P15
{
	public static void main(String[] args)
	{
		int n=5;
		int k=1;
		char ch='A';
		for (int i = 0; i <n; i++) 
		{
			ch='A';
			k=1;
			for (int j = 0; j < n; j++)
			{
			if(i>=j)
					if(i%2==0)
						System.out.print(ch++ +" ");
				else
						System.out.print(k++ +" ");
			}
			System.out.println();
		}
		
	}
}
