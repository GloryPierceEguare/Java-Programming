package com.lab9.test;

import java.util.ArrayList;

public class Control 
{
	public static void main(String[] args) 
	{	
		Person p1 = new Person("John","Smith","Dublin");
		Person p2 = new Person("Michael","Greyson","Kildare");
		Person p3 = new Person("Samuel","Johnson","Wicklow");
		
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		ArrayList personList2 = (ArrayList)personList.clone();
		
		System.out.println(personList);
		System.out.println("----------------------------------------------------");
		System.out.println(personList2);
		
		MyGUI gui = new MyGUI("Lab 9");   
	}
}
