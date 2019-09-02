package com.nonprimitivearray;

public class Song {

	public static void main(String[] args) 
	{
		Songs[] s={new Songs("tt",4.2,"rf"),new Songs("rr",4.2,"kk")};
		for(Songs s2 :s)
		{
			System.out.println("title:"+s2.title);
			System.out.println("duration:"+s2.duration);
			System.out.println("singer:"+s2.singer);
		}
	}

}
