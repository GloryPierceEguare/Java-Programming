package com.lab7.test;

public class Employee extends Person
{
	//Attributes
	Job job;
	int personnelNumber;
	Date startDate;
	static int nextNum = 0;
	
	//Constructor: Set attributes with values
	public Employee(String firstName, String surname, int day, int month, int year, String gender,double salary, String role,int jobID,int personnelNumber,int sday, int smonth,int syear)
	{
		super(firstName, surname, day, month, year, gender);
		
		this.job = new Job(salary,role,jobID);
		this.personnelNumber = personnelNumber;
		this.startDate = new Date(sday,smonth,syear);
		nextNum += 1;
	}
	
	//Method: toString
	public String toString()
	{
		FileProcessor f1 = new FileProcessor();
		f1.WriteFile(getFirstName()+" "+getSurName()+"\n");
		
		return super.toString()+job+"\nPersonnel Number: "+personnelNumber+". "
				+ "\nStart Date: "+startDate+".";
	}
}
