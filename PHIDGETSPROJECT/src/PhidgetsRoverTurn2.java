//Add Phidgets Library
import com.phidget22.*;
public class PhidgetsRoverTurn2 
{

	public static void main(String[] args)throws Exception 
	{
		//Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        
        /*
        //Wait for half a second
        Thread.sleep(500);
*/
        
        //Move forward at half speed
        leftMotors.setTargetVelocity(0.5);
        rightMotors.setTargetVelocity(0.5);
        
        //Wait for half a second
        Thread.sleep(500);
        
        //Turn in one direction at full speed
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(-1);
        
       
        //Wait for 1 second
        Thread.sleep(1000);
        
        //Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        //Wait for half a second
        Thread.sleep(500);
        
        //Move forward at half speed
        leftMotors.setTargetVelocity(0.5);
        rightMotors.setTargetVelocity(0.5);
        
        //Wait for half a second
        Thread.sleep(500);
        
        //Turn in one direction at full speed
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(-1);
        
       
        //Wait for 1 second
        Thread.sleep(1000);
        
        //Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);

	}

}
