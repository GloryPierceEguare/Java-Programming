/*******************************************
 * Employee:...............................................
 * Author: Glory Pierce Eguare
 * Date: 13/02/19
 */

package com.lab3.test;

public class Employee 
{
	//Attributes
	private String firstName;
	private String surName;
	private int staffNumber;
	private double annualSalary;
	
	//Constructor: Set attributes with values
	Employee(String firstName, String surName, int staffNumber, double annualSalary)
	{
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setStaffNumber(staffNumber);
		this.setAnnualSalary(annualSalary);
	}
	
	//Method: Calculate Pay
	public double calculatePay()
	{
		return getAnnualSalary()/12;
	}
	
	//Method: toString
	public String toString()
	{
		return("The Employee is called: "+getFirstName()+" "+getSurName()+".\n"
				+ "Their Staff Number is: "+getStaffNumber()+".\n"
						+ "Their Annual Salary is: €"+getAnnualSalary()+".");
	}

	//Getter and Setter firstName 
	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	//Getter and Setter surName
	public String getSurName() 
	{
		return surName;
	}

	public void setSurName(String surName) 
	{
		this.surName = surName;
	}

	//Getter and Setter staffNumber
	public int getStaffNumber() 
	{
		return staffNumber;
	}

	public void setStaffNumber(int staffNumber) 
	{
		this.staffNumber = staffNumber;
	}

	//Getter and Setter annualSalary
	public double getAnnualSalary() 
	{
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) 
	{
		this.annualSalary = annualSalary;
	}
}
