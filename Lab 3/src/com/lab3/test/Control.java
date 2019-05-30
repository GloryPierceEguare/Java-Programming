package com.lab3.test;

public class Control 
{
	public static void main(String args[])
	{
		//Create a New Employee (Employee)
		Employee e1 = new Employee("John","Smith",1234,120000);
		e1.calculatePay();
		System.out.println(e1);
		System.out.println("Pay per Month: €"+e1.calculatePay());
		System.out.println("----------------------------------------------------");
		
		//Create a New Employee (Hourly Employee)
		HourlyEmployee e2 = new HourlyEmployee("Sam","Johnson",2468,0,20,9.55);
		e2.calculatePay();
		System.out.println(e2);
		System.out.println("Hourly Employee gets paid: €"+e2.calculatePay());
		System.out.println("----------------------------------------------------");
		
		//Create a New Employee (Commission Employee)
		CommissionEmployee e3 = new CommissionEmployee("Tony","Lawler",1357,12000,400);
		e3.calculatePay();
		System.out.println(e3);
		System.out.println("Commission Pay: €"+e3.calculatePay());
		System.out.println("----------------------------------------------------");
		
		//Polymorphism
		Employee[] myEmployee = new Employee[3];
		myEmployee[0] = new Employee("Adam","Boyde",2309,120000);
		myEmployee[1] = new HourlyEmployee("Conor","Dowling",9732,0,35,10.42);
		myEmployee[2] = new CommissionEmployee("Eoin","Fagan",6483,24000,200);
		
		//myEmployee[0].calculatePay();
		System.out.println("Polymophism with Statements");
		System.out.println("€"+myEmployee[0].calculatePay());
		//myEmployee[1].calculatePay();
		System.out.println("€"+myEmployee[1].calculatePay());
		//myEmployee[2].calculatePay();
		System.out.println("€"+myEmployee[2].calculatePay());
		System.out.println("----------------------------------------------------");
		
		System.out.println("Polymophism with For Loop");
		for(int i = 0; i < myEmployee.length; i++)
		{
			System.out.println("€"+myEmployee[i].calculatePay());
		}
	}
}
