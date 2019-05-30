package com.lab3.test;

public class HourlyEmployee extends Employee
{
	//Attributes
	double hoursWorked;
	double hourlyRate;
	
	//Constructor: Set attributes with values
	public HourlyEmployee(String firstName,String surName,int staffNumber,double annualSalary,double hoursWorked, double hourlyRate)
	{
		super(firstName,surName,staffNumber,annualSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	//Method: Calculate Pay
	public double calculatePay()
	{
		return (hoursWorked * hourlyRate);
	}
	
	//Method: toString
	public String toString()
	{
		return super.toString() + "\nThey worked: "+hoursWorked+"hrs.\n"
						+ "The Hourly Rate is: €"+hourlyRate+".";
		/*return("The Employee is called: "+getFirstName()+" "+getSurName()+".\n"
					+ "Their Staff Number is: "+getStaffNumber()+".\n"
						+ "They worked: "+hoursWorked+"hrs.\n"
								+ "The Hourly Rate is: €"+hourlyRate+".");*/
	}
}