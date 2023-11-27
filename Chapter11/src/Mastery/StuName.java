package Mastery;

import java.io.Serializable;

public class StuName implements Serializable 
{
	private String firstName, lastName;
	
	/**
	 * Construstor  method
	 * pre: none
	 * post: A Student object has been created.
	 * Student data has been initialized with parameters.
	 */

	   public StuName(String fn, String ln)
	   {
		   firstName = fn;
		   lastName = ln;
	   }
	   
	   /**
		 * Creates a string representing the student object
		 * pre: none
		 * post: A string representing the student object has been returned.
		 */

	   public String toString()
	   {
		   String StuName;
		   
		   StuName = firstName + ", " + lastName;
		   
		   return(StuName);
	   }
	   
	   /*abstract double pay(double period);*/

	
}
