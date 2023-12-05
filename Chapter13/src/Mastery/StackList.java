package Mastery;


import java.util.LinkedList;

public class StackList 
{
	private LinkedList<Object> data;
	private int top;
	
	public StackList()
	{
		data = new LinkedList<Object>();
		top = -1;//no items in the arraylist
	}
	
	public Object top()
	{
		return(data.get(top));
	}
	
	public Object pop()
	{
		Object topItem;
		topItem = data.get(top);
		data.remove(top);
		top = top - 1;
		return topItem;
	}
	
	public void push(Object item)
	{
		top = top + 1;
		data.add(top, item);
	}

	public boolean isEmpty()
	{
		if(top == -1)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public int size()
	{
		if(isEmpty())
		{
			return(0);
		}
		else
		{
			return(top + 1);
		}
	}
	
	public void makeEmpty()
	{
		top = -1;
	}
}

