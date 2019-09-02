package com.nonprimitivearray;

public class Playlist {
	public static void listening(Songs[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].title);
			System.out.println(a[i].duration);
			System.out.println(a[i].singer);
		}
		
	}

	public static void main(String[] args)
	{
		Songs[] playlist=new Songs[7];
		playlist[0]=new Songs("terimeri",4.0,"raha fateh");
		playlist[1]=new Songs("tagru",3.0,"raha fateh");
		playlist[2]=new Songs("nanaku prematho",2.0,"raha fateh");
		playlist[3]=new Songs("vande mataram",5.0,"raha fateh");
		playlist[4]=new Songs("ankhya ka kajal",1.0,"raha fateh");
		playlist[5]=new Songs("malhari",2.0,"raha fateh");
		playlist[6]=new Songs("senorita",1.0,"raha fateh");
		listening(playlist);
		
		
		
	}

}
