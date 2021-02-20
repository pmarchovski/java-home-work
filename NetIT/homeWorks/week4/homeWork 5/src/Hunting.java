
public class Hunting {

	public static int maxStrike = 4;
	public static int numberOfStrike = 0;
	public static int numberOfDeadMouse;
	public static int numberOfBrokenFurnitures;
	private static int randomNumber;
	private static int remainStrike;

	public static int strike() {

		randomNumber = (int) (1 + (Math.random() * 10));

		if (randomNumber != 5) {
			numberOfStrike++;
			numberOfDeadMouse++;
			Console.showln("Hit - The mouse is dead");
		} else if (randomNumber == 5) {
			numberOfStrike++;
			numberOfBrokenFurnitures++;
			Console.showln("Ohhh no... the furniures was broken");
		}

		Console.showln("Numbers of strike: " + numberOfStrike);
		huntingContinueAfterStrike();

		return numberOfStrike;
	}

	private static void checkRemainStrikes() {

		if (remainStrike > 0) {
			Console.showln("You have " + remainStrike + " remain strikes");
			Console.showln("Do you want to keep hunting?");
			Console.showln("y = YES, n = NO ");
		} else {
			Console.showln("You don't have more strikes... Please charge");
			Charging.charging();
		}
	}

	static void huntingContinueAfterCharge(String text) {

		Console.showln("y = YES; n = NO ");

		if (Console.input(text).equals("n")) {
			ConnectWithOwner.connection();
			ConnectWithOwner.statistic();
		} else {
			numberOfStrike = 0;
			ReadyForFight.mouseAvailable();
		}
	}

	private static void huntingContinueAfterStrike() {

		remainStrike = maxStrike - numberOfStrike;
		checkRemainStrikes();

		String text = "";
		if (Console.input(text).equals("y")) {
			ReadyForFight.mouseAvailable();
		} else {
			ConnectWithOwner.connection();
		}
	}
}
