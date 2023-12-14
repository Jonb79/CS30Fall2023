package Mastery;

public class ReverseListv1 
{
	private Object[] data;
	private int top;
	
	public ReverseListv1(int maxItems)
	{
		maxItems = 10;
		data = new Object[maxItems];//an empty Stack that can hold up to maxItems
		top = -1;//no items in the array
	}
	
	public Object top()
	{
		return(data[top]);
	}
	
	public Object pop()
	{
		top = top - 1;
		return(data[top]);
	}
	
	public void push(Object item)
	{
		
		
		if(top < data.length - 1)
		{
			top  = top + 1;
			data[top] = item;
		}
		
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
