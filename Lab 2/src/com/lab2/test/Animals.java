/*******************************************
 * Animals: the purpose of this class is display all
 * the attributes of animals.
 * Author: Glory Pierce Eguare
 * Date: 07/02/19
 */

package com.lab2.test;

public class Animals 
{
	//Attributes
	private String name;
	private String breed;
	private int age;
	private boolean domestic;
	private String colour;
	
	//1st constructor
	Animals(String name)
	{
		this.name = name;
	}
	
	//2nd Constructor
	Animals(String name, String breed, int age, boolean domestic, String colour)
	{
		this.setName(name);
		this.setBreed(breed);
		this.setAge(age);
		this.setDomestic(true);
		this.setColour(colour);
		
		System.out.println("Name: " +name);
		System.out.println("Breed: " +breed);
		System.out.println("Age: " +age);
		System.out.println("Domestic: " +domestic);
		System.out.println("Colour: " +colour);
	}
	
	//toString Method
	public String toString()
	{
		return("\nThis animal is "+name+".\n"
				+ "It is a "+getBreed()+".\n"
						+ "It is "+getAge()+" years old.\n"
								+ "This animal is "+isDomestic()+".\n"
										+ "The colour of this animal is"+getColour() +".");
	}
	
	//1st Method (Getter) name
	public String getName()
	{
		return name;
	}
		
	//2nd Method (Setter) name
	public void setName (String name)
	{
		this.name = name;
	}
	
	//3rd Method (Getter) breed
	public String getBreed() 
	{
		return breed;
	}

	//4th Method (Setter) breed
	public void setBreed(String breed) 
	{
		this.breed = breed;
	}
	
	//5th Method (Getter) age
	public int getAge() 
	{
		return age;
	}

	//6th Method (Setter) age
	public void setAge(int age) 
	{
		this.age = age;
	}

	//7th Method (Getter) domestic
	public boolean isDomestic() 
	{
		return domestic;
	}

	//8th Method (Setter) domestic
	public void setDomestic(boolean domestic) 
	{
		this.domestic = domestic;
	}

	//9th Method (Getter) colour
	public String getColour() 
	{
		return colour;
	}

	//10th Method (Setter) colour
	public void setColour(String colour) 
	{
		this.colour = colour;
	}

	//3rd Method
	public void makeNoise()
	{
		if(getBreed().equals ("dog"))
		{
			System.out.println("Woof, woof");
		}
		else if(getBreed().equals ("cat"))
		{
			System.out.println("Meow, meow");
		}
		else if(getBreed().equals ("cow"))
		{
			System.out.println("Moooo");
		}
		else if(getBreed().equals("mouse"))
		{
			System.out.println("Squeak");
		}
	}
	
	public void makeNoise(boolean old)
	{
		if(old)
		{
			System.out.println("Quiet animal.");
		}
		else
		{
			makeNoise();
		}
	}
}
