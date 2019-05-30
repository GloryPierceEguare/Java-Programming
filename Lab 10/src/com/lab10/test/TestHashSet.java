package com.lab10.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestHashSet 
{
	String europe[] = {"Albania", "Andorra", "Austria", "Belarus", "Belgium", "Bosnia Herzegovina", "Bulgaria",
					   "Croatia", "Cyprus", "CzechRepublic", "Denmark", "Estonia", "Hungary", "Iceland", "Ireland", "Italy",
					   "Kosovo", "Latvia", "Liechtenstein","Lithuania", "Luxemburg", "Macedonia", "Malta", "Moldova", "Monaco", 
					   "Montenegro", "Norway", "Poland","Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", 
					   "Slovenia", "Spain","Sweden", "Switzerland", "the Netherlands", "the United Kingdom", "Turkey", "Ukraine"};
	
	//Create Hash Set
	HashSet<String> h = new HashSet<String>(Arrays.asList(europe));
	
	//Method: Print Hash Set
	public void printset()
	{
		Iterator<String> itr = h.iterator();
	      
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
	
	//Method: Add to Hash Set
	public void addEntry(String country)
	{
		h.add(country);
	}
	
	//Method: Search for element in Hash Set
	public boolean matchEntry(String country)
	{
		if(h.contains(country))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	//Method: Clear Hash Set
	public void clearSet()
	{
		h.clear();
	}
	
	//Method: Sort Hash Set
	public void sortSet()
	{
		List<String> list = new ArrayList<String>(h); 
		Collections.sort(list);
		
		for (String line : list) 
		{
			System.out.println(line);
		}
	}
	
	//Method: Reverse Hash Set
	public void reverseSet()
	{
		List<String> list = new ArrayList<String>(h); 
		Collections.reverse(list);
		
		for (String line : list) 
		{
			System.out.println(line);
		}
	}
	
	//Method: Shuffle Hash Set
	public void shuffleSet()
	{
		List<String> list = new ArrayList<String>(h); 
		Collections.shuffle(list);
		
		for (String line : list) 
		{
			System.out.println(line);
		}
	}
}
