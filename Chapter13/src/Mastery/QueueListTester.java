package Mastery;

public class QueueListTester 
{

	public static void main(String[] args) 
	{
        QueueList ql = new QueueList();
		
		System.out.println("Adding to ql");
		ql.enqueue("Red");
		ql.enqueue("Orange");
		ql.enqueue("Brown");
		ql.enqueue("Yellow");
		
		System.out.println("Front of ql: "+ ql.front());
		System.out.println("Rear of ql: "+ ql.rear());//
		System.out.println("Items in ql: "+ ql.size());
		
		System.out.println("Removing front item: "+ ql.dequeue());
		System.out.println("Front of ql: "+ ql.front());
		System.out.println("Rear of ql: "+ ql.rear());
		System.out.println("Items in ql: "+ ql.size());

	}

}
