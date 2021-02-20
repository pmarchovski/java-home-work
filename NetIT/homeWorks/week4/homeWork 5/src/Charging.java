
public class Charging {

	private static int randomNumberOne;
	private static int randomNumberTwo;
	
	public static void charging() {
		
		randomNumberOne = (int) (1 + Math.random() * 1000);	
		randomNumberTwo = (int) (1 + Math.random() * 1000);
	
		if (randomNumberOne >= randomNumberTwo) {
			
			String text = "";		
			Console.showln("There is electricity in the socket... charging");
			Console.showln("The battery is full... "
					     + "Do you want to keep hunting mouses? ");
			Hunting.huntingContinueAfterCharge(text);
		} 
	    else {		
			Console.showln("There isn't electricity in this socket... "
					     + "Please look for other socket");
			charging();
		}
	}

		public static void power() {
	
		if (Hunting.numberOfStrike < Hunting.maxStrike) {
			Hunting.strike();
		} else {
			Console.showln("You don't have enough energy. " 
		                 + "Please charge the batteries");
			charging();
		}
	}
}
