package Mastery;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class QueueListv1 
{
	private LinkedList<Object> data;
	private int front, rear;
	
	public QueueListv1 ()
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
	
    private Node head;
	
	
	public LinkedList<Object>()//Constructor Method
	{
		head = null;
	}
	
	//Adds a node to the linked list
	public void addAtFront(String str)
	{
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
	}
	
	
	//Linked List part 2 of 3 task
	//Add a node to the end of the linked list
	public void addAtEnd(String str)
	{
		Node newNode = new Node(str);
		Node current = head;
		
		if(head == null)
		{
			newNode.setNext(head);
			head = newNode;
		}
		else
		{
			while(current.getNext() != null)
			{
				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}
	
	//Returns the number of items in the list
		public int size()
		{
			Node current = head;
			int count = 0;
			
			if(current != null)
			{
				count += 1;
				while(current.getNext() != null)
				{
					current = current.getNext();
					count += 1;
				}
				return count;
			}
			else
			{
				return 0;
			}
			
		}
		
		public String toString() 
		{
			Node current = head;
			String listString;
			
			if (current != null) 
			{
				listString = current.getData() + "\n";
				while (current.getNext() != null) 
				{
					current = current.getNext();
					listString += current.getData() + "\n";
				}
				return(listString);
			} 
			else 
			{
				return("There are no items in list.");
			}
		}
}
