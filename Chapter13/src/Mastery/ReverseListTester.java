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
		
		int a = rL.size();  
		 
		int b = 0;
		
		int answer;
		
		/*String c;
		
	    a = 10;*/
		System.out.println("Items in ReverseList: "+ rL.size());
		
		
		while(b < 11)//Check if the stack size is less than or equal 10 && a <= 10 && rL.size() < 10 && rL.size() != 11.
		{
			
				System.out.println("Please enter TEN numbers as items for ReverseList or enter (999 to quit): ");
				
			    answer = userinput.nextInt();
			    
			    b++;
			    
			    System.out.println("Items in ReverseList: "+ rL.size());
			    
				if(answer == 999) 
	            { 
					System.out.println("exit..."); 
	            	System.out.println("End of Program");  
	                System.exit(0);
	            } 
	            else if(answer != 999)
	            {
	            	
	            	String str1 = Integer.toString(answer);
				    
				    rL.push(str1);
				    System.out.println("The users answer is: " + str1 + "\n"); 
	            }
				
				System.out.println(rL.toString());
				/*
				if(answer != 999) 
	            { 
					rL.push(answer);
	            } 
	            else if(answer == 999)
	            {
	            	System.out.println("exit..."); 
	            	System.out.println("End of Program");  
	                System.exit(0);
	            }
         	*/
		}
		System.out.println("Items in ReverseList: "+ rL.size());
		System.out.println("Top of ReverseList: " + (String)rL.top());
		System.out.println("Items in ReverseList: "+ rL.size());
		System.out.println(rL);
		rL.pop();
		System.out.println("Top of ReverseList: " + (String)rL.top());
		System.out.println("Items in ReverseList: "+ rL.size());
		System.out.println(rL); 
    	System.out.println("End of Program");
    	System.out.println("exit...");
        System.exit(0);
		
		
		/*
		if(rL.size() < 10) 
        { 
			while(rL.size() != 10)//Check if the stack size is less than or equal 10 rL.size() < 10.
			{
				
					System.out.println("Please enter TEN numbers as items for ReverseList or enter (999 to quit): ");
					
					int answer = userinput.nextInt();
					
					if(answer != 999) 
		            { 
						rL.push(answer);
		            } 
		            else if(answer == 999)
		            {
		            	System.out.println("exit..."); 
		            	System.out.println("End of Program");  
		                System.exit(0);
		            }
	         	
			}
			System.out.println("End of Program");

        }
		else if(rL.size() == 10)
        {
			System.out.println("Top of ReverseList: " + (String)rL.top());
			System.out.println("Items in ReverseList: "+ rL.size());
			System.out.println(rL);
			rL.pop();
			System.out.println("Top of ReverseList: " + (String)rL.top());
			System.out.println("Items in ReverseList: "+ rL.size());
			System.out.println(rL);
        	System.out.println("exit..."); 
        	System.out.println("End of Program");  
            System.exit(0);
        }
		*/
		/*
			while(rL.size() < 10 && rL.size() != 11)//Check if the stack size is less than or equal 10 rL.size() < 10.
			{
				
					System.out.println("Please enter TEN numbers as items for ReverseList or enter (999 to quit): ");
					
					int answer = userinput.nextInt();
					
					if(answer != 999) 
		            { 
						rL.push(answer);
		            } 
		            else if(answer == 999)
		            {
		            	System.out.println("exit..."); 
		            	System.out.println("End of Program");  
		                System.exit(0);
		            }
	         	
			}
			System.out.println("End of Program");
			
			if(rL.size() != 10) 
	        { 
				
	        }
		
		
		  5
		rL.push("Red");
		rL.push("Green");
		rL.push("Yellow");
		
		System.out.println("Top of ReverseList: " + (String)rL.top());
		System.out.println("Items in ReverseList: "+ rL.size());
		System.out.println(rL);
		rL.pop();
		System.out.println("Top of ReverseList: " + (String)rL.top());
		System.out.println("Items in ReverseList: "+ rL.size());
		System.out.println(rL);
		*/
		/*
		System.out.println("Adding a new item! ");
		rL.push("Blue");
		System.out.println("Top of ReverseList: " + (String)rL.top());
		System.out.println("Items in ReverseList: "+ rL.size());
        System.out.println(rL);
		
        rL.makeEmpty();
		
		System.out.println("ReverseList has " + rL.size() + " items.");
		System.out.println(rL);
		*/
		
		
		/*
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}; 
		  
        for (int i = 0; i < arr.length; i++) 
        { 
            if (arr[i] >= 5) 
            { 
                System.out.println("exit..."); 
  
                // Terminate JVM 
                System.exit(0); 
            } 
            else
                System.out.println("arr["+i+"] = " + 
                                  arr[i]); 
        } 
        System.out.println("End of Program");
		*/
		

	}

}
