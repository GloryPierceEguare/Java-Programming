package com.lab10.test;

public class Control 
{
	public static void main(String[] args) 
	{
		boolean check;
		
		System.out.println("Original HashSet:\n");
		TestHashSet s1 = new TestHashSet();
		s1.printset();
		
		System.out.println("-----------------------------");
		System.out.println("Apppend \"Vatican City\" to HashSet:\n");
		s1.addEntry("Vatican City");
		s1.printset();
		
		System.out.println("-----------------------------");
		System.out.println("Check if HashSet contains a country:\n");
		check = s1.matchEntry("Russia");
		System.out.println(check);
		
		System.out.println("-----------------------------");
		System.out.println("Clear HashSet:\n");
		//s1.clearSet();
		//s1.printset();
		
		System.out.println("-----------------------------");
		System.out.println("Sort HashSet:\n");
		s1.sortSet();
		
		System.out.println("-----------------------------");
		System.out.println("Reverse HashSet:\n");
		s1.reverseSet();
		
		System.out.println("-----------------------------");
		System.out.println("Shuffle HashSet:\n");
		s1.shuffleSet();
	}
}
