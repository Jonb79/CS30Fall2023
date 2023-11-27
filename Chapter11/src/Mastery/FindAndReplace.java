package Mastery;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindAndReplace 
{

	public static void main(String[] args) 
	{
		FileReader in;
		FileWriter out;
		
		BufferedReader readFile;
		BufferedWriter writeFile;
		Scanner input = new Scanner(System.in);
		String fileName;
		String searchWOP;
		String replacementWOP;
		File textFile;
		File newFile;
		String lineOfText;
		
		
		
		//create the file
		/*textFile = new File("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter11\\Find&Replace.txt");*/

		
		//Obtain the file name, the search word or phrase and the replacement word or phrase from the user/Write data to file
		System.out.println("Enter the file name: ");
		fileName = input.nextLine();
		textFile = new File(fileName);
		System.out.println("Enter search word or phrase: ");//the search word or phrase is "No"
		searchWOP = input.nextLine();
		
		System.out.println("Enter replacement word or phrase: ");//the replacement word or phrase is "Yes"
		replacementWOP = input.nextLine();
		//Read each line of text from the file, make replacement, and write line to the new file
		try
		{
			
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			fileName = fileName.replace(".", "NEW."); //create a file name for the new file
			newFile = new File(fileName);
			out = new FileWriter(newFile);
			writeFile = new BufferedWriter(out);
			
			while((lineOfText = readFile.readLine()) != null)
			{
				lineOfText = lineOfText.replaceAll(searchWOP, replacementWOP);
				writeFile.write(lineOfText);
				writeFile.newLine();
					
			}//end of while loop
			
			writeFile.close();
			out.close();
			System.out.println("Data written to file! ");
			readFile.close();
			in.close();			
			
		}catch(FileNotFoundException e)
		{
			System.out.println("File does not exist. ");
			System.err.println("FileNotFoundException: "+ e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("File could not be created. ");
			System.err.println("IOException: "+ e.getMessage());
		}
		
		
		
		
		

	}

}
