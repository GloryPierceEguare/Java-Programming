package com.lab7.test;

public class Control 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date(25,02,1996);
		System.out.println(d1);
		System.out.println("----------------------------------------------");
		
		Job j1 = new Job(40000,"Lawyer",2745);
		System.out.println(j1);
		System.out.println("----------------------------------------------");
		
		Person p1 = new Person("John","Smith",25,03,2019,"Male");
		System.out.println(p1);
		System.out.println("----------------------------------------------");
		
		Employee e1 = new Employee("Tanny","Channing",26,5,1998,"Male",246810,"Teacher",780,1234,21,3,2019);
		System.out.println(e1);
		System.out.println("----------------------------------------------");
		
		
	}
}
