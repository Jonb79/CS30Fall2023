/*
Program: UEmployee.java 
Last Date of this Revision: October 13, 2023
Purpose: An application that uses if-else statements to output two
ImageIcons that display the number of broken plates and the prize won by the player.
Author: Jonathan,
School: CHHS
Course: Computer Science 30
private choice
*/
package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;



public class University 
{
	
	public static UEmployee assignEmployee()
	{
		/*NumberFormat money = NumberFormat.getCurrencyInstance(); UEmployee emp, double salaryArg*/
		
		String employeeStatus;
		String firstName;
		String lastName;
		String department;
		String employeeJobTitle;
		double salary;
		String responce;
		int empNum;
		/*return null;
		Staff emp1 = new Staff("Ned", "Rogers", 60000, "Manager");
		Faculty emp2 = new Faculty("Nolan", "Ferguson", 36.00, "Music");*/
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please enter the first and last names of the university employee: ");
		
		System.out.println("first name: ");
		firstName = userinput.next();
		
		System.out.println("Last name: ");
		lastName = userinput.next();
		
		System.out.println("Please enter the salery of the university employee: ");
		salary = userinput.nextDouble();
		
		System.out.println("Please enter the kind of the university employee: ");
		responce = userinput.next();
		
		if(responce.equalsIgnoreCase("F"))
		{
			System.out.println("Please enter the department record of the university employee: ");
			 department = userinput.next();
			 return(new Faculty(firstName, lastName, salary,  department));
		}
		else if(responce.equalsIgnoreCase("S"))
		{
			System.out.println("Please enter the Title of the university employee: ");
			employeeJobTitle = userinput.next();
			 return(new Staff(firstName, lastName, salary, employeeJobTitle));
		}
		/*
        System.out.println(emp);
		
		salary = ((Object) emp).salary(salaryArg);
		
		System.out.println(money.format(salary));
		
        emp = emp1;
		
		do
		{
			System.out.println("\n (E)mployee \\ (P)ay \\ (Q)uit ");
			System.out.println("Enter choice: ");
			responce = userinput.next();
			
			if(!responce.equalsIgnoreCase("Q"))
			{
				System.out.println("Enter Employee number (1, 2 or 3) :");
				empNum = userinput.nextInt();
				
				switch(empNum)
				{
					case 1: emp = emp1; break;
					case 2: emp = emp2; break;
					case 3: emp = emp3; break;
				}
				
				if(responce.equalsIgnoreCase("E"))
				{
					System.out.println(emp);
				}
				else if(responce.equalsIgnoreCase("P"))
				{
					System.out.println("Enter the hours for Associate OR pay period for Manager " );
					salaryArg = userinput.nextDouble();
					
					assignEmployee(emp, salaryArg);
				}
			}
		}while(!responce.equalsIgnoreCase("Q"));
		*/
		return null;
		
		//
	}	

	public static void main(String[] args) 
	{
		UEmployee emp1, emp2, emp3;
		
		emp1 = assignEmployee();
		emp2 = assignEmployee();
		emp3 = assignEmployee();
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
	}

}
/* Screen Dump





 */