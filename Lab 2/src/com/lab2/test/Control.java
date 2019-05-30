package com.lab2.test;

import java.util.Scanner;

public class Control 
{
	public static void main(String args[])
	{
		//Create a new animal
		Animals a1 = new Animals("Spot","dog",4,true,"brown");
		Animals a2 = new Animals("Leo","mouse",12,false,"black");
		//Animals a3 = new Animals("Bo","cow",25,false,"white");
		//System.out.println(a1);
		
		//System.out.println(a1.name);
		//System.out.println(a1.breed);
		//System.out.println(a1.age);
		//System.out.println(a1.domestic);
		//System.out.println(a1.colour);
		
		//Getter and Setters
		a1.setName("Doug");
		System.out.println(a1.getName());
		a1.makeNoise(true);
		
		a2.setName("Jerry");
		System.out.println(a2.getBreed());
		a2.makeNoise(false);
		
		// Code to read an input string from the keyboaard
		Scanner input = new Scanner(System.in);
		System.out.print("Enter something > ");
		String inputString = input.nextLine();
		System.out.print("You entered : ");
		System.out.println(inputString);
		
		a1.setName(inputString);
	}
}
