package com.lab7.test;

public class Job 
{
	private double salary;
	private String role;
	private int jobID;
	
	//Constructor: Set attributes with values
	Job(double salary, String role, int jobID)
	{
		this.setSalary(salary);
		this.setRole(role);
		this.setJobID(jobID);
	}
	
	//Method: toString
	public String toString()
	{
		return("\nSalary: €"+getSalary()+"/year.\n"
				+ "Role name: "+getRole()+".\n"
						+ "Job ID: "+getJobID()+".");
	}

	//Getter & Setter: Salary
	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	//Getter & Setter: Role
	public String getRole() 
	{
		return role;
	}

	public void setRole(String role) 
	{
		//Code to check if the employees role is valid
		boolean Valid;
		FileProcessor f1 = new FileProcessor();
		f1.Connect("roles.txt");
		Valid = f1.ValidateRole(role);
		if(Valid == true)
		{
			this.role = role;
		}
		f1.ClosingTime();
	}

	//Getter & Setter: JobID
	public int getJobID() 
	{
		return jobID;
	}

	public void setJobID(int jobID) 
	{
		this.jobID = jobID;
	}
}
