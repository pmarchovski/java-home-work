
public class ReadyForFight {


	public static void mouseAvailable() {

		int numberOfPixels;

		

		numberOfPixels = (int) (1 + Math.random() * 10);
		// numberOfPixels = Console.input();

		if (numberOfPixels % 2 == 0) {
			Console.showln("The pixels are: " + numberOfPixels 
					+ " (Mouse found)");
			Charging.power();
		}

		else if (numberOfPixels % 2 == 1) {
			Console.showln("The pixels are: " + numberOfPixels 
					+ " (There isn't mouse). "
					+ "Please continue to looking for...");
			mouseAvailable();
		}
	}

}
