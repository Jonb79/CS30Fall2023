package Newdefaultpackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class myFileP2 
{

	public static void main(String[] args) 
	{
		File textFile;
		Scanner input = new Scanner(System.in);
		String response;
		
		//create the file
		
		textFile = new File("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter11\\src\\Newdefaultpackage\\MyFile.txt");
		
		//Check to see if file exists
				if(textFile.exists())
				{
					System.out.print("MyFile.txt file exists! ");
				}
				else
				{
					try
					{
						textFile.createNewFile();
						System.out.println("MyFile.txt file has been created! ");
					}
					catch(IOException e)
					{
						System.out.println("File could not be created. ");
						System.err.print("IOException: " + e.getMessage());
					}
					
					
				}
				
				//Delete the file if user chooses
				System.out.println("Would you like to (K)eep or (D)elete the file? ");
				response = input.next();
				
				if(response.equalsIgnoreCase("D"))//Delete file
				{
					if(textFile.delete()) 
					{
						System.out.println("MyFile.txt File has been deleted.");
					}
				}
				else
				{
					if(response.equalsIgnoreCase("K"))//Keep file 
					{
						System.out.println("MyFile.txt File is kept and stays the same.");
					}
				}

	}

}
