package com.polymorphism;

public class P2 extends P1 {
		void bulletPrakash()
		{
			System.out.println("from bulletprakash of P2");
		}
		static void klRahul()
		{
			System.out.println("from KLRahul of P2");
		}
		public static void main(String[] args) 
		{
			
			P1.klRahul();//from KLRahul of P1
			P2.klRahul();//from KLRahul of P2
			P1 ob1=new P2();
			ob1.klRahul();//from KLRahul of P1
			ob1.bulletPrakash();//from bulletprakash of P2
			P1 ob2=new P1();
			ob2.klRahul();//from KLRahul of P1
			ob2.bulletPrakash();//from bulletprakash of P1
			P2 ob=new P2();
			ob.klRahul();//from KLRahul of P2
			ob.bulletPrakash();//from bulletprakash of P2
			
		}
	}











