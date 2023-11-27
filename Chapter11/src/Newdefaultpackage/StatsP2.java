package Newdefaultpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StatsP2 
{

	public static void main(String[] args) 
	{
		File dataFile;
		FileReader in;
		FileWriter out;
		
		BufferedReader readFile;
		BufferedWriter writeFile;
		
		Scanner input = new Scanner(System.in);
		
		String fileName;
		int numStu;
		String stuName, score;
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		
		double totalScore = 0;
		int numScores = 0;
		
		//Write data to file
		System.out.println("Enter file name for storing names and grades: ");
		fileName = input.next();
		
		System.out.println("How many students? ");
		numStu = input.nextInt();
		
		try
		{
			
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for(int i = 0; i < numStu; i++)
			{
				System.out.println("Enter student name: ");
				stuName = input.next();
				
				System.out.println("Enter test score: ");
				score = input.next();
				
				writeFile.write(stuName);
				writeFile.newLine();
				writeFile.write(score);
				writeFile.newLine();
			}
			writeFile.close();
			out.close();
			System.out.println("Data written to file!");
			
		}catch (IOException e)
		{
			System.out.println("File could not be created.");
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
				score = readFile.readLine();
				System.out.println(stuName + " " + score);
				numScores += 1;
				
				scoreValue = Double.parseDouble(score);
				totalScore += scoreValue;
				
				if(scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				if(scoreValue > highScore)
				{
					highScore = scoreValue;
				}			
			}//end of while loop
			avgScore = totalScore / numScores;
			System.out.println("Low score = " + lowScore);
			System.out.println("High score = " + highScore);
			System.out.println("Average score = " + avgScore);
			
			readFile.close();
			in.close();			
			
		}catch(FileNotFoundException e)
		{
			System.out.println("File does not exist.");
			System.err.println("FileNotFoundException: "+ e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("File could not created.");
			System.err.println("IOException: "+ e.getMessage());
		}

	}

}
