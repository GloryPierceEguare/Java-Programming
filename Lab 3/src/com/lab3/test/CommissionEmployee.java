package com.lab3.test;

public class CommissionEmployee extends Employee
{
	//Attribute
	double commissionEarned;
	
	//Constructor: Set attributes with values
	public CommissionEmployee(String firstName,String surName,int staffNumber,double annualSalary,double commissionEarned) 
	{
		super(firstName,surName,staffNumber,annualSalary);
		this.commissionEarned = commissionEarned;
	}
	
	//Method: Calculate Pay
	public double calculatePay()
	{
		return (getAnnualSalary()/12)+commissionEarned;
	}
	
	/*//Method: toString
		public String toString()
		{
			return super.toString() + "They get: €"+
			
			return("The Employee is called: "+getFirstName()+" "+getSurName()+".\n"
					+ "Their Staff Number is: "+getStaffNumber()+".\n"
							+ "Their Annual Salary is: €"+getAnnualSalary()+".");
		}*/
}