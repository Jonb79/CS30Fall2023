package Mastery;


import java.util.LinkedList;






public class QueueList 
{
	private LinkedList<Object> data;
	private int front, rear;
	
	public QueueList ()
	{
		data = new LinkedList<Object>();
		front = -1;
		rear = -1;
	}
	
	public Object front()
	{
		return data.get(front);
	}
	
	public Object rear()
	{
		return data.get(rear);
	}
	
	public void makeEmpty()
	{
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty()
	{
		if(front == -1 && rear == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int size()
	{
		if(isEmpty())
			return 0;
		else
			return((rear - front) + 1);
	}
	
	public Object dequeue()//Remove method
	{
		Object item;
		
		item = data.get(front);
		
		data.remove(front);
		
		if(front == rear)
		{
			makeEmpty();
		}
		else
		{
			rear -= 1;
		}
		
		return (item);
	}
	
	public void enqueue(Object item)
	{
		if(isEmpty())
		{
			rear = 0;
			front = 0;
			data.add(item);
		}
		else
		{
			rear = rear + 1;
			data.add(item);
		}
	}
	
   
}
