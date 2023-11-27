/*
Program: UEmployee.java 
Last Date of this Revision: October 13, 2023
Purpose: An application that uses if-else statements to output two
ImageIcons that display the number of broken plates and the prize won by the player.
Author: Jonathan,
School: CHHS
Course: Computer Science 30
*/
package Mastery;

public abstract class UEmployee 
{
	private String firstName;
	
	private String lastName;
	
	private double salary;
	
	//Constructor  method

	   public UEmployee(String fn, String ln, double sal)
	   {
		   firstName = fn;
		   lastName = ln;
		   salary = sal;
	   }
	   
	 //Accessor  method
	   
	   public String getfirstName()
	   {
	     return firstName;
	   }
	   
	   public String getlastName()
	   {
	     return lastName;
	   }
	   
	   public double getsalary()
	   {
	     return salary;
	   }
	   
	   /*abstract double salary(double period);*/
	   
	   /*abstract*/
}
/* Screen Dump





 */