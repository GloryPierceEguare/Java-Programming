package com.lab7.test;

public class Person 
{
	//Attributes
	private String firstName;
	private String surName;
	private Date dateOfBirth;
	private String gender;
	
	//Constructor: Set attributes with values
	public Person(String firstName, String surName, int day, int month, int year,String gender)
	{
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setGender(gender);
		this.dateOfBirth = new Date(day, month, year);
	}
	
	//Method: toString
	public String toString()
	{
		return("First Name: "+getFirstName()+"."
				+ "\nSur Name: "+getSurName()+"."
						+ "\nDate of Birth: "+dateOfBirth+"."
								+ "\nGender: "+getGender()+".");
	}

	//Getter & Setter: FirstName
	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	//Getter & Setter: SurName
	public String getSurName() 
	{
		return surName;
	}

	public void setSurName(String surName) 
	{
		this.surName = surName;
	}

	//Getter & Setter: Gender
	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}
}
