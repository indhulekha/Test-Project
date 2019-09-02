package com.nonprimitivearray;

public class Company {

	public static void main(String[] args)
	{
		Employee[] employee=new Employee[5];
		employee[0] =new Employee(1,"sherkhan",2);
		employee[1] =new Employee(2,"baghira",3.0);
		employee[2] =new Employee(3,"mowgly",14);
		employee[3] =new Employee(4,"bhalu",21);
		employee[4] =new Employee(5,"moti",22);
		for(int i=0;i<employee.length;i++)
		{
			System.out.println("employee id:"+employee[i].id+"\n employee name:"+employee[i].name+
								"employee salary:"+employee[i].salary);
			
		}
	}

}
/*output:
employee id:1
employee name:sherkhanemployee salary:2.0
employee id:2
employee name:baghiraemployee salary:3.0
employee id:3
employee name:mowglyemployee salary:14.0
employee id:4
employee name:bhaluemployee salary:21.0
employee id:5
employee name:motiemployee salary:22.0
*/