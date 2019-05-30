/*******************************************
 * Vehicle: the purpose of this class is to set up the different objects in the vehicle class
 * so that they can be returned to the Control class.
 * Author: Glory Pierce Eguare
 * Date: 31/01/19
 */

package com.lab1.test;

public class Vehicle 
{
	//Attributes
	String Owner;
	String RegNo;
	int MaxSpeed;
	String Colour;
	String Engine;
	int Wheels;
	
	//1st Constructor
	Vehicle(String Owner)
	{
		this.Owner = Owner;
	}
	
	//2nd Constructor
	Vehicle(String Owner, String RegNo, int MaxSpeed, String Colour, String Engine, int Wheels)
	{
		this.Owner = Owner;
		this.RegNo = RegNo;
		this.MaxSpeed = MaxSpeed;
		this.Colour = Colour;
		this.Engine = Engine;
		this.Wheels = Wheels;
		
		System.out.println("Owner: " +Owner);
		System.out.println("Registration Number: " +RegNo);
		System.out.println("Maximum Speed: " +MaxSpeed);
		System.out.println("Colour: " +Colour);
		System.out.println("Engie: " +Engine);
		System.out.println("No. of Wheels: " +Wheels);
		//System.out.println("Owner: " +Owner+ " Colour: "+Colour);
	}
	
	//3rd Constructor
	public String toString()
	{
		return ("The owner of this vehicle is "+Owner+".\n"
				+ "The registration number of the vehicle is "+RegNo+".\n"
						+ "The maximum speed of the vehicle is "+MaxSpeed+"km/h.\n"
								+ "The colour of the vehicle is "+Colour+".\n"
										+ "This vehicle is "+Engine+".\n"
												+ "This car has "+Wheels+" wheels.");
	}	
}
