package Mastery;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;





public class Roster 
{
	
	
	public static void main(String[] args) 
	{
		
		
		File textFile;
		Scanner input = new Scanner(System.in);
		String fileName;
		int numStu;
		
		 
		
		//create the file
		textFile = new File("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter11\\src\\Mastery\\StudentNames.txt");
		
		/*fileName = textFile;*/
		
		//Obtain file name and the number of students from the user/Write data to file
		System.out.println("Enter the file name for storing the students names: ");
		fileName = input.nextLine();
		
		
		System.out.println("How many students? ");
		numStu = input.nextInt();
		
		/*System.out.println("Enter the students name: ");
		System.out.println("First name: ");
		String firstName = input.next();
		System.out.println("Last name: ");
		String lastName = input.next();
		
		stuName = firstName + " " + lastName;
		
		writeFile.write(firstName);
		writeFile.newLine();
		writeFile.write(lastName);
		writeFile.newLine();
		
		
		writeFile.close();
		out.close();
		System.out.println("Data written to file! ");*/
		
				try
				{
					/* write objects*/
					
					FileOutputStream out = new FileOutputStream(textFile);
					ObjectOutputStream writeStu = new ObjectOutputStream(out);
					
					
					for(int i =0; i < numStu; i++)
					{
						//Enter fn
						System.out.println("Enter the students name: ");
						System.out.println("Enter the First Name: ");
						String firstName = input.next();
						
						//Enter ln
						System.out.println("Enter the Last Name: ");
						String lastName = input.next();
						
						String fn = firstName; 
						String ln = lastName;
						
						/*firstName = fn;
						
						lastName = ln;*/
						
						writeStu.writeObject(new StuName(fn, ln));
						
					}
					writeStu.close();
					System.out.println("Data written to file! ");
					
					/* read objects*/
					FileInputStream in = new FileInputStream(textFile);
					ObjectInputStream readStu = new ObjectInputStream(in);
					
					
					for(int i =0; i < numStu; i++)
					{
						System.out.println((StuName)readStu.readObject());
					}
					
					readStu.close();
					
					
					
				}catch(FileNotFoundException e)
				{
					System.out.println("File could not be found or File does not exist. ");
					System.err.println("FileNotFoundException: "+ e.getMessage());
				}
				catch (IOException e)
				{
					System.out.println("Problem with input/output or File could not created. ");
					System.err.println("IOException: "+ e.getMessage());
				} 
				catch (ClassNotFoundException e) 
				{
					System.out.println("Class could not be used to cast object. ");
					System.err.println("ClassNotFoundException: "+ e.getMessage());
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				

	}

}
