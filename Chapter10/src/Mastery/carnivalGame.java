package Mastery;

public class carnivalGame 
{

	public static void main(String[] args) 
	{
		GameBooth BreakAPlate = new GameBooth(2,"tiger plush", "sticker");
		Player jon = new Player(0);
		System.out.print("Jon goes to Break A Plate. ");
		System.out.println(jon.play(BreakAPlate));
		System.out.println("Jon won: " + jon.showPrizes());
	}

}
