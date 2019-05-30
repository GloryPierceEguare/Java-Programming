package com.lab7.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileProcessor 
{
	//Attributes
	int i = 0;
	File fleName;
	Scanner myScanner;

	public void Connect(String file)
	{
		try
		{
			fleName = new File(file);
			myScanner = new Scanner(fleName);
		}
		catch(Exception e)
		{
			System.out.println("No File Exists");
		}
	}
	
	//Read the file
	public void ReadFile()
	{
		while(myScanner.hasNextLine())
		{
			System.out.print(myScanner.next());
		}
	}
	
	//Read through the file and remove the commas
	public boolean ValidateRole(String role)
	{
		boolean Valid = false;
		String testing[] = new String[5];
		int i = 0;
		while(myScanner.hasNextLine())
		{
			testing[i] = myScanner.next();
			i += 1;
		}
		
		for(i=0;i<5;i++)
		{
			testing[i] = testing[i].replace(",","");
			if(role.equals(testing[i]))
			{
				Valid = true;
			}
		}
		if(Valid == false)
		{
			System.out.println("Invalid Role");
		}	
		
		return Valid;
	}
	
	//Write to file
	public void WriteFile(String employeeName)
	{
		//Create file
		File names = new File("names.txt");
		
		//Write Content
		try 
		{	
			PrintWriter printWriter = new PrintWriter(names);
		    printWriter.println (employeeName);
		    printWriter.close ();  
		} 
		catch (IOException e) 
		{
			System.out.println("No file!!");
		}
	}
	
	//Close the scanner
	public void ClosingTime()
	{
		myScanner.close();
	}	
}
