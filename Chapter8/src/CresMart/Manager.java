package CresMart;

public class Manager extends Employee
{
    private double yearlySalary;
	
	public Manager(String fn, String ln, double salary)
	{
		super(fn, ln);
		yearlySalary = salary;
	}
	
	public double getYearlySalary()
	{
		return yearlySalary;
	}
	
	public void setYearlySalary(double salary)
	{
		yearlySalary = salary;
	}
	
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = (yearlySalary/52)*weeks;
		return payEarned;
	}
	
	public String toString()//prints manager object
	{
		return(super.toString() + ", manager" + " "+
						"Yearly Salary: "+ yearlySalary);
	}
	
	
	
	
	
}
