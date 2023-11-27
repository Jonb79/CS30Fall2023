package Mastery;

public class GameBooth 
{
	private double cost;
	
	private String FIRST_PRIZE, CONSOLATION_PRIZE; 
	
	/**
	 * constructor
	 * pre: none
	 * post: A GameBooth object created.
	 * The cost of prizes are set.
	
	*/

	public GameBooth(double charge, String p1, String p2) 
	{
		cost = charge;
		FIRST_PRIZE = p1;
		CONSOLATION_PRIZE = p2;
		charge = 0;
		
	}
	
	/**
	 * Game is played and prize is awarded
	 * pre: none
	 * post: Player had three tries. 
	 * Player is successful all three times received the first prize.
	 * A consolation prize has been awarded otherwise. 
	
	*/
	
	public String start()
	{
		int toss;
		int successes = 0;
		
		/* play game */
		
		for(int i = 0; i < 3; i++)//player gets three tries
		{
			toss = (int)(Math.random() + 0.5); //0 or 1
			if(toss ==1)
			{
				successes += 1; //1 is a successful toss
			}
		}
		
		/* award prize*/
		if(successes ==3)
		{
			return(FIRST_PRIZE);
		}
		else
		{
			return(CONSOLATION_PRIZE);
		}
		
	}
	
	/**
	 * Returns the cost to play the game.
	 * pre: none
	 * post: Cost of the game has been returned. 
	*/
	/**/public double getCost()
	{
		return(cost);
	}
	

}
