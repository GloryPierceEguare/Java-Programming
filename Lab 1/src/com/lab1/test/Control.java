/*******************************************
 * Control: the purpose of this class is to print the a string "Hello Word"
 * Author: Glory Pierce Eguare
 * Date: 31/01/19
 */

package com.lab1.test;

public class Control
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
		
		//Create a new vehicle
		//Vehicle v1 = new Vehicle("Glory Pierce Eguare");
		Vehicle v2 = new Vehicle("John Smith","131-KE-1234",80,"Red","Automatic",4);
		System.out.println(v2);
	}
}