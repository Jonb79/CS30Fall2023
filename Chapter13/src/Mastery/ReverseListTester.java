package Mastery;

import java.util.Scanner;

public class ReverseListTester 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub how to code the option to terminate an application in java
		/**/
		Scanner userinput = new Scanner(System.in);
		
		ReverseList rL = new ReverseList(5);
		
		int a = 1;
		 
        int b;
		
		int c;
		
		int d;
		
		int e;
		
        int f;
		
		int g;
		
		int h;
		
		int i;
		
        int j;
		
		int k;
		
		int l;
		
		int answer;
		
		
		System.out.println("Items in ReverseList: "+ rL.size());
		
		while(a < 11 && a != 11)//Check if the stack size is less than or equal 10 && a <= 10 && rL.size() < 10 && rL.size() != 11.
		{
			
			System.out.println("Please enter TEN numbers as items for ReverseList or enter (999 to quit): ");
			
		    answer = userinput.nextInt();
		    
		    l = answer;
		    
		    rL.push(answer);
		    
		    a++;
		   
		    
		    System.out.println("Items in ReverseList: "+ rL.size());
		    
		    
		    
				if(answer == 999) 
	            { 
					System.out.println("The users answer is: " + l + "\n");
					System.out.println("End of Program");
					System.out.println("exit..."); 
	                System.exit(0);
	            } 
	            else if(answer != 999)
	            {
	            	System.out.println("The users answer is: " + l + "\n");
	            	
	            }
				
				
				
		}
		
		
		b = (int) rL.top();
		rL.pop();
		c = (int) rL.top();
		rL.pop();
		d = (int) rL.top();
		rL.pop();
		e = (int) rL.top();
		rL.pop();
		f = (int) rL.top();
		rL.pop();
		g = (int) rL.top();
		rL.pop();
		h = (int) rL.top();
		rL.pop();
		i = (int) rL.top();
		rL.pop();
		j = (int) rL.top();
		rL.pop();
		k = (int) rL.top();
		
		System.out.println("The list Normally is: "+ k + " " + j + " " + i + " " + h + " " + g + " " + f + " " + e + " " + d + " " + c + " " + b + "\n");
		
        System.out.println("The list Reversed is: "+ b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i + " " + j + " " + k + "\n");
		
		
       
    	System.out.println("End of Program");
    	System.out.println("exit...");
        System.exit(0);
        
		
		
		

	}

}
