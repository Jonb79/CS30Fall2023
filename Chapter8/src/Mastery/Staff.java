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

public class Staff extends UEmployee 
{

	private String employeeJobTitle;
	
	//Constructor  method

	   public Staff(String fn, String ln, double sal, String ejt)
	   {
		   super(fn, ln, sal);
		   
		   employeeJobTitle = ejt;
		   
	   }
	   
	 //Accessor  method
	   
	   public String getemployeeJobTitle()
	   {
	     return employeeJobTitle;
	   }
	
	 //toString  method
	   
	   public String toString()//prints Staff object
	   {
		   String Sta;
			
		   Sta = "first Name: " + super.getfirstName() + ", last Name: " + super.getlastName() + ", Salary: $"+ super.getsalary() +
					" Job Title: "+ employeeJobTitle;
		   
			return(Sta);
	   }

	
	   

}
/* Screen Dump





 */