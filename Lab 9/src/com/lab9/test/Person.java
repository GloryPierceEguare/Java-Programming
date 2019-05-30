package com.lab9.test;

public class Person 
{
	//Attributes
	private String firstName;
	private String surName;
	private String city;
	
	//Constructor: Set attributes with values
	public Person(String firstName, String surName, String city)
	{
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setCity(city);
	}
	
	//Method: toString
	public String toString()
	{
		return("First Name: "+getFirstName()+"."
				+ "\nSurname: "+getSurName()+"."
						+ "\nCity: "+getCity()+".\n");
	}

	//Getter & Setter: First Name
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//Getter & Setter: Surname
	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	//Getter & Setter: City
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
