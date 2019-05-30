package com.lab4.test;

public class Control 
{
	public static void main(String args[])
	{
		//Create a New Employee (Employee)
				Account a1 = new Account("John Smith","IE3836","BOI",true,1000.00);
				DepositAccount a2 = new DepositAccount("Ryan Moore","IE8463","AIG",true,40000,4);
				CurrentAccount a3 = new CurrentAccount("James Lee","IE9920","TSB",true,2000,2);
				a1.deposit(300);
				a1.withdraw(1200);
				System.out.println("----------------------------------------------------");
				a2.withdraw(50);
				System.out.println("----------------------------------------------------");
				a3.withdraw(2100);
				a3.checkCredit();
	}
}
