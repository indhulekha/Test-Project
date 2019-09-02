package com.nonstatic;

public class P3 {

	
		int i;
		void test()				//called method
		{
			System.out.println("from test");
			System.out.println(i);
			System.out.println("this:"+this);//A@100
			i=20;
			System.out.println(this.i);
			System.out.println("end of test()");
			
		}
		public static void main(String[] args) //calling method
		{
			System.out.println("from main");
			P3 ob=new P3();
			ob.i=10;
			ob.test();	//calling test()
			//System.out.println(this);  CTE
			System.out.println("ob:"+ob);
			System.out.println("end main");
	}

}
