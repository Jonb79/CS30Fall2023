//Add Phidgets Library
import com.phidget22.*;
public class PHIDGETSPROJECT 
{
	public static void main(String[] args)throws Exception 
	{
		//Connect to wireless rover
	    Net.addServer("", "192.168.100.1", 5661, "", 0);

	    //Create 
	    DCMotor leftMotors = new DCMotor();
	    DCMotor rightMotors = new DCMotor();
	    DistanceSensor sonar = new DistanceSensor();

	    //Address
	    leftMotors.setChannel(0);
	    rightMotors.setChannel(1);

	    //Open
	    leftMotors.open(5000);
	    rightMotors.open(5000);
	    sonar.open(5000);

	    while (true) 
	    {

	        System.out.println("Distance: " + sonar.getDistance() + " mm");
	        
	        if(sonar.getDistance() < 200) 
	        {
	        	//Object detected! Stop motors
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(0);
	            
	            //Wait for 1 second
	            Thread.sleep(1000);
	            
	            //Turn in one direction at full speed
	            leftMotors.setTargetVelocity(0.5);
	            rightMotors.setTargetVelocity(-0.5);
	            
	           
	            //Wait for 1 second
	            Thread.sleep(1000);
	            
	            //Object detected! Stop motors
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(0);
	        } 
	        else 
	        {
	        	//Move forward at full speed
	            leftMotors.setTargetVelocity(1);
	            rightMotors.setTargetVelocity(1);

	            //Wait for 1 second
	            Thread.sleep(1500);

	            //Stop motors
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(0);
	            
	            //Wait for 1 second
	            Thread.sleep(1500);
	            
	            //Turn in one direction at full speed
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(-0.3);
	            
	            //Wait for 1 second
	            Thread.sleep(1500);
	            
	            //Move forward at full speed
	            leftMotors.setTargetVelocity(1);
	            rightMotors.setTargetVelocity(1);
	            
	          //Wait for 1 second
	            Thread.sleep(1600);

	            //Stop motors
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(0);
	            
	            //Wait for 1 second
	            Thread.sleep(1500);
	            
	            //Turn in one direction at full speed
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(-0.25);
	            
	            //Wait for 1 second
	            Thread.sleep(1500);
	            
	            //Move forward at full speed
	            leftMotors.setTargetVelocity(1);
	            rightMotors.setTargetVelocity(1);
	            
	          //Wait for 1 second
	            Thread.sleep(1700);

	            //Stop motors
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(0);
	            
	            //Wait for 1 second
	            Thread.sleep(1500);
	            
	            //Turn in one direction at full speed
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(-0.3);
	            
	            //Wait for 1 second
	            Thread.sleep(1500);
	            
	            //Move forward at full speed
	            leftMotors.setTargetVelocity(1);
	            rightMotors.setTargetVelocity(1);
	            
	          //Wait for 1 second
	            Thread.sleep(1700);

	            //Stop motors
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(0);
	            
	            //Wait for 1 second
	            Thread.sleep(1500);
	            
	            //Turn in one direction at full speed
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(-0.3);

	            
	            /*
	            //Wait for 1 minute
	            Thread.sleep(15,000);
	            
	            //Turn in one direction at half speed
	            leftMotors.setTargetVelocity(0.5);
	            rightMotors.setTargetVelocity(-0.5);
	            
	            //Wait for 1 minute
	            Thread.sleep(15,000);
	            
	            //Move forward at full speed
	            leftMotors.setTargetVelocity(1);
	            rightMotors.setTargetVelocity(1);

	            //Wait for 1 minute
	            Thread.sleep(15,000);

	            //Stop motors
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(0);
	            
	            //Wait for 1 minute
	            Thread.sleep(15,000);
	            
	            //Turn in one direction at half speed
	            leftMotors.setTargetVelocity(0.5);
	            rightMotors.setTargetVelocity(-0.5);
	            
	            //Wait for 1 minute
	            Thread.sleep(15,000);
	            
	            //Move forward at full speed
	            leftMotors.setTargetVelocity(1);
	            rightMotors.setTargetVelocity(1);

	            //Wait for 1 minute
	            Thread.sleep(15,000);

	            //Stop motors
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(0);
	            
	            //Wait for 1 minute
	            Thread.sleep(15,000);
	            
	            //Turn in one direction at half speed
	            leftMotors.setTargetVelocity(0.5);
	            rightMotors.setTargetVelocity(-0.5);
	            
	            //Wait for 1 minute
	            Thread.sleep(15,000);
	            
	            //Move forward at full speed
	            leftMotors.setTargetVelocity(1);
	            rightMotors.setTargetVelocity(1);

	            //Wait for 1 minute
	            Thread.sleep(15,000);

	            //Stop motors
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(0);
	            
	            //Wait for 1 minute
	            Thread.sleep(15,000);
	            
	            //Turn in one direction at half speed
	            leftMotors.setTargetVelocity(0.5);
	            rightMotors.setTargetVelocity(-0.5);
	            
	            //Wait for 1 minute
	            Thread.sleep(15,000);
	            
	            //Stop motors
	            leftMotors.setTargetVelocity(0);
	            rightMotors.setTargetVelocity(0);
	            */
	        }

	        //Wait for 250milliseconds
	        Thread.sleep(250);
	    }
	}
	

}
