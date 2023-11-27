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

public class Faculty extends UEmployee  
{

	private String department;
	
	/*private double FacultySalary;*/
	//Constructor  method UEmployee

	   public Faculty(String fn, String ln, double sal, String dep)
	   {
		   super(fn, ln, sal);
		   
		   department = dep;
		   
		   /*FacultySalary = sal;*/
	   }
	   
	 //Accessor  method
	   
	   public String getdepartment()
	   {
	     return department;
	   }
	   
	   /*public double getFacultySalary()
		{
			return getFacultySalary();
		}
		
		public void setSalary(double sal)
		{
			FacultySalary = sal;
		}
		
		public double pay(double weeks)
		{
			double payEarned;
			payEarned = (FacultySalary/52)*weeks;
			return payEarned;
		}*/
	   
	 //toString  method
	   
	   public String toString()//prints Faculty object
		{
			String fac;
			
			fac = "first Name: " + super.getfirstName() + ", last Name: " + super.getlastName() + ", Salary: $"+ super.getsalary() +
					" Department: "+ department;
		   
		   
		   return(fac);
		}
	   /*   
	@Override
	double salary(double period) {
		// TODO Auto-generated method stub
		return 0;
	}
	*/
	   
		
		
	
	
	
	
}
/* Screen Dump





 */