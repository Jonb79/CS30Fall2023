package Newdefaultpackage;

import java.io.File;
import java.util.Scanner;

public class myFile {

	public static void main(String[] args) 
	{
		File textFile;
		Scanner input = new Scanner(System.in);
		String fileName;
		
		//Obtain file name from the user
		System.out.println("Enter file name: ");
		fileName = input.nextLine();
		
		//Determine if the file exists
		textFile = new File(fileName);
		
		if(textFile.exists())
		{
			System.out.println("File Exists!");
		}
		else
		{
			System.out.println("File Does Not Exists!");
		}
			
			

	}

}
