package com.assignments;

//create three objects in class called rider
public class Rider {

	public static void main(String[] args) 
	{
		Vehicles v1=new Vehicles();
		v1.colour="black";
		v1.speed=80.0;
		v1.name="R15";
		System.out.println("vehicle  name:"+ v1.name +"\nvehicle colour:"+ v1.colour +"\nspeed:"+ v1.speed);
		Vehicles v2=new Vehicles();
		v2.colour="blue";
		v2.speed=120.0;
		v2.name="KTM";
		System.out.println("vehicle name:"+ v2.name+"\nvehicle colour:"+ v2.colour +"\nspeed:"+ v2.speed);
		Vehicles v3=new Vehicles();
		v3.colour="white";
		v3.speed=100.0;
		v3.name="Royal Enfiled";
		System.out.println("vehicle name:"+  v3.name+"\nvehicle colour:"+ v3.colour +"\nspeed:"+ v3.speed);
		
		
	}

}
/*output:
 vehicle  name:R15
vehicle colour:black
speed:80.0
vehicle name:KTM
vehicle colour:blue
speed:120.0
vehicle name:Royal Enfiled
vehicle colour:white
speed:100.0

 */
 
