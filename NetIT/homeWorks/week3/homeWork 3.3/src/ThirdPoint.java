// 3. Third point

public class ThirdPoint {

	static void checkZero() {

		Print.print("Please enter number");
		int number = Input.scanner.nextInt();

		if (number > 0) {
			number *= 10;
			Print.print("The number is: " + number);
		}

		if (number == 0) {
			number -= 10;
			Print.print("The number is: " + number);

		} else {
			number /= 10;

			Print.print("The number is: " + number);
		}

	}

}
