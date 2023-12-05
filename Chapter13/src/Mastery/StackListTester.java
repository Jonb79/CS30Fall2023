package Mastery;

public class StackListTester {

	public static void main(String[] args) 
	{
		StackList sl = new StackList();
		
        sl.push(16);
        sl.push(9);
        sl.push(51);
		System.out.println("Top of StackList: " + sl.top());
		System.out.println("Items in Stack sl: "+ sl.size());
		
		System.out.println("Removing top item!");
		sl.pop();
		
		System.out.println("Top of StackList: " + sl.top());
		System.out.println("Items in Stack sl: "+ sl.size());
		
		System.out.println("Adding a new item");
		sl.push("Crescent");
		
		System.out.println("Top of StackList: " + sl.top());
		System.out.println("Items in Stack sl: "+ sl.size());

	}

}
