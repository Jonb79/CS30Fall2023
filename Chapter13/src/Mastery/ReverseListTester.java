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
		
		/*String c;
		int a;
		
		a = rL.size();
	    a = 10;*/
		System.out.println("Items in ReverseList: "+ rL.size());
		
		while(a < 11 && a != 11)//Check if the stack size is less than or equal 10 && a <= 10 && rL.size() < 10 && rL.size() != 11.
		{
			
			System.out.println("Please enter TEN numbers as items for ReverseList or enter (999 to quit): ");
			
		    answer = userinput.nextInt();
		    
		    l = answer;
		    
		    rL.push(answer);
		    
		    a++;
		    /*
		     (String)
		    String str1 = Integer.toString(a);
		    
		    rL.push(str1);
		    
		    */
		    
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
				
				
				/*
				 System.out.println(rL.toString());
				 System.out.println(rL);
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
		
		/*
		System.out.println("Top of ReverseList: " + rL.top());//10
		System.out.println("Items in ReverseList: "+ rL.size());
		b = (int) rL.top();
		System.out.println("Top of ReverseList: " + b);
		rL.pop();
		System.out.println("Top of ReverseList: " + rL.top());//9
		System.out.println("Items in ReverseList: "+ rL.size());
		c = (int) rL.top();
		System.out.println("Top of ReverseList: " + c);
		rL.pop();
		System.out.println("Top of ReverseList: " + rL.top());//8
		System.out.println("Items in ReverseList: "+ rL.size());
		d = (int) rL.top();
		System.out.println("Top of ReverseList: " + d);
		rL.pop();
		System.out.println("Top of ReverseList: " + rL.top());//7
		System.out.println("Items in ReverseList: "+ rL.size());
		e = (int) rL.top();
		System.out.println("Top of ReverseList: " + e);
		rL.pop();
		System.out.println("Top of ReverseList: " + rL.top());//6
		System.out.println("Items in ReverseList: "+ rL.size());
		f = (int) rL.top();
		System.out.println("Top of ReverseList: " + f);
		rL.pop();
		System.out.println("Top of ReverseList: " + rL.top());//5
		System.out.println("Items in ReverseList: "+ rL.size());
		g = (int) rL.top();
		System.out.println("Top of ReverseList: " + g);
		rL.pop();
		System.out.println("Top of ReverseList: " + rL.top());//4
		System.out.println("Items in ReverseList: "+ rL.size());
		h = (int) rL.top();
		System.out.println("Top of ReverseList: " + h);
		rL.pop();
		System.out.println("Top of ReverseList: " + rL.top());//3
		System.out.println("Items in ReverseList: "+ rL.size());
		i = (int) rL.top();
		System.out.println("Top of ReverseList: " + i);
		rL.pop();
		System.out.println("Top of ReverseList: " + rL.top());//2
		System.out.println("Items in ReverseList: "+ rL.size());
		j = (int) rL.top();
		System.out.println("Top of ReverseList: " + j);
		rL.pop();
		System.out.println("Top of ReverseList: " + rL.top());//1
		System.out.println("Items in ReverseList: "+ rL.size());
		k = (int) rL.top();
		System.out.println("Top of ReverseList: " + k);
		*/
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
		
		
        /*
		System.out.println(rL.toString()); 
		System.out.println(rL);
		*/
    	System.out.println("End of Program");
    	System.out.println("exit...");
        System.exit(0);
        /*
		if(a != 11) 
        { 
			
        } 
	    else if(a == 11)
        {
        	System.out.println("The ReverseList cannot have more than 10 items" + "\n");
        	System.out.println("End of Program");
			System.out.println("exit..."); 
            System.exit(0);
        	
        }
		*/
		
		
		

	}

}
