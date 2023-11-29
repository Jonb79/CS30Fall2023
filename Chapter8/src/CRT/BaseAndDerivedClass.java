package CRT;

public class BaseAndDerivedClass 
{

	// Java program to illustrate the
	// Base & Derived Class
	// concept of inheritance
	
	// Declare Base Class
	// base class
	public static class Bicycle 
	{
	    // the Bicycle class has two fields
	    public int gear;
	    public int speed;
	 
	    // the Bicycle class has one constructor
	    public Bicycle(int gear, int speed)
	    {
	        this.gear = gear;
	        this.speed = speed;
	    }
	 
	    // the Bicycle class has three methods
	    public void applyBrake(int decrement)
	    {
	        speed -= decrement;
	    }
	 
	    public void speedUp(int increment)
	    {
	        speed += increment;
	    }
	 
	    // toString() method to print info of Bicycle
	    public String toString()
	    {
	        return ("No/number of gears are " + gear + "\n"
	                + "speed of bicycle is " + speed);
	    }
	}
	
	// Declare Derived Class
	// derived class 
	public static class MountainBike extends Bicycle 
	{
	 
	    // the MountainBike subclass adds one more field
	    public int seatHeight;
	 
	    // the MountainBike subclass has one constructor
	    public MountainBike(int gear, int speed,
	                        int startHeight)
	    {
	        // invoking base-class(Bicycle) constructor
	        super(gear, speed);
	        seatHeight = startHeight;
	    }
	 
	    // the MountainBike subclass adds one more method
	    public void setHeight(int newValue)
	    {
	        seatHeight = newValue;
	    }
	 
	    // overriding toString() method
	    // of Bicycle to print more info
	    @Override public String toString()
	    {
	        return (super.toString() + "\nseat height is "
	                + seatHeight);
	    }
	}
	
	// Driver Code
	// driver class 
	public static class Test 
	{
	    public static void main(String args[])
	    {
	 
	        MountainBike mb = new MountainBike(3, 100, 25);
	        System.out.println(mb.toString());
	    }
	}
	
	/*import java.io.*;
 
public class Book implements Cloneable {
    private String title;
    private String author;
    private int year;
 
    public Book(String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }
 
    // Override the toString method
    @Override public String toString()
    {
        return title + " by " + author + " (" + year + ")";
    }
 
    // Override the equals method
    @Override public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Book)) {
            return false;
        }
        Book other = (Book)obj;
        return this.title.equals(other.getTitle())
            && this.author.equals(other.getAuthor())
            && this.year == other.getYear();
    }
 
    // Override the hashCode method
    @Override public int hashCode()
    {
        int result = 17;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + year;
        return result;
    }
 
    // Override the clone method
    @Override public Book clone()
    {
        try {
            return (Book)super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
 
    // Override the finalize method
    @Override protected void finalize() throws Throwable
    {
        System.out.println("Finalizing " + this);
    }
 
    public String getTitle() { return title; }
 
    public String getAuthor() { return author; }
 
    public int getYear() { return year; }
    
    // Java program to demonstrate working of getClass()
 
    public class Test 
    {
         public static void main(String[] args)
         {
            Object obj = new String("GeeksForGeeks");
            Class c = obj.getClass();
            System.out.println("Class of Object obj is : "
                           + c.getName());
         }
    }
    
    public static void main(String[] args)
    {
    
    
        // Create a Book object and print its details
        Book book1 = new Book(
            "The Hitchhiker's Guide to the Galaxy",
            "Douglas Adams", 1979);
        System.out.println(book1);
 
        // Create a clone of the Book object and print its
        // details
        Book book2 = book1.clone();
        System.out.println(book2);
 
        // Check if the two objects are equal
        System.out.println("book1 equals book2: "
                           + book1.equals(book2));
 
        // Get the hash code of the two objects
        System.out.println("book1 hash code: "
                           + book1.hashCode());
        System.out.println("book2 hash code: "
                           + book2.hashCode());
 
        // Set book1 to null to trigger garbage collection
        // and finalize method
        book1 = null;
        System.gc();
    }
} */
}	
	

