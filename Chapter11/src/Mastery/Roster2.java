package Mastery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;





public class Roster2 
{
	
	public static void giveStuName(StuName emp)
	{
		
		System.out.println(emp);
		
	
	}	

	public static void main(String[] args) 
	{
		File dataFile;
		FileReader in;
		FileWriter out;
		
		BufferedReader readFile;
		BufferedWriter writeFile;
		
		/*File textFile;*/
		Scanner input = new Scanner(System.in);
		String fileName;
		String response;
		String stuName;
		int numStu;
		
		 
		
		//create the file
		File textFile = new File("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter11\\src\\Mastery\\StudentNames.txt");
		
		/*fileName = textFile;*/
		
		//Obtain file name and the number of students from the user/Write data to file
		System.out.println("Enter the file name for storing the students names: ");
		fileName = input.nextLine();
		
		
		System.out.println("How many students? ");
		numStu = input.nextInt();
		
		
		
		/*int empNum;
		
		System.out.println("Enter Employee number (1 or 2) :");
		empNum = input.nextInt();
		
		switch(empNum)
		{
			case 1: emp = emp1; break;
			
		}*/
		
		//Determine/Check to see if the file exists
		textFile = new File(fileName);
		
		if(textFile.exists())
		{
			System.out.println("StudentNames.txt file exists! ");
		}
		else
		{
			try
			{
				textFile.createNewFile();
				System.out.println("StudentNames.txt file has been created! ");
			}
			catch(IOException e)
			{
				
				System.out.println("File could not be created. ");
				System.err.print("IOException: " + e.getMessage());
			}
			
			System.out.println("File Does Not Exists! ");
		}
	
				try
				{
					
					dataFile = new File(fileName);
					out = new FileWriter(dataFile);
					writeFile = new BufferedWriter(out);
					
					for(int i = 0; i < numStu; i++)
					{
						System.out.println("Enter the students name: ");
						/*stuName = input.next();*/
						System.out.println("First name: ");
						String firstName = input.next();
						System.out.println("Last name: ");
						String lastName = input.next();
						
						stuName = firstName + " " + lastName;
						
						/*StuName emp1 = new StuName(firstName, lastName);
				        static final "tiger plush"; "sticker"; " ", " " stuName
						StuName emp = emp1;*/
						
						writeFile.write(firstName);
						writeFile.newLine();
						writeFile.write(lastName);
						writeFile.newLine();
						
					}
					writeFile.close();
					out.close();
					System.out.println("Data written to file! ");
					
				}catch (IOException e)
				{
					System.out.println("File could not be created. ");
					System.err.println("IOException: "+ e.getMessage());
				}
				
				//Read data from file and process
				try
				{
					dataFile = new File(fileName);
					in = new FileReader(dataFile);
					readFile = new BufferedReader(in);
					
					while((stuName = readFile.readLine()) != null)
					{
						/*score = readFile.readLine();*/
						System.out.println(stuName + " " + " ");
						/*System.out.println();*/
							
					}//end of while loop
					
					
					readFile.close();
					in.close();			
					
				}catch(FileNotFoundException e)
				{
					System.out.println("File does not exist. ");
					System.err.println("FileNotFoundException: "+ e.getMessage());
				}
				catch (IOException e)
				{
					System.out.println("File could not created. ");
					System.err.println("IOException: "+ e.getMessage());
				}

				//Delete the file if user chooses
				System.out.println("Would you like to (K)eep or (D)elete the file? ");
				response = input.next();
				
				if(response.equalsIgnoreCase("D"))//Delete file
				{
					if(textFile.delete()) 
					{
						System.out.println("StudentNames.txt File has been deleted. ");
					}
				}
				else
				{
					if(response.equalsIgnoreCase("K"))//Keep file 
					{
						System.out.println("StudentNames.txt File is kept and stays the same. ");
					}
				}

	}

}
