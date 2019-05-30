package com.lab7.test;

public class Date 
{
	//Attributes
	private int day;
	private int month;
	private int year;
	
	//Constructor: Set attributes with values
	Date(int day, int month, int year)
	{
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}
	
	//Method: toString
	public String toString()
	{
		return +day+"/"+month+"/"+year;
	}

	//Getter & Setter: Day
	public int getDay() 
	{
		return day;
	}

	public void setDay(int day) 
	{
		//Check if the day is valid
		if(day < 32 && day > 0 )
		{
			this.day = day;
		}
		else
		{
			System.out.println("Invalid Day");
		}
	}

	//Getter & Setter: Month
	public int getMonth() 
	{
		return month;
	}

	public void setMonth(int month) 
	{
		//Check if the month is valid
		if(month < 13 && month > 0) 
		{
			this.month = month;
		}
		else
		{
			System.out.println("Invalid Month");
		}
	}

	//Getter & Setter: Year
	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}
}
