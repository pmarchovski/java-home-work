// 1. First point

public class ReverseNumber {

	static int reverseNumber = 0;
	static int number = 0;

	static void reverseNumber() {

		number = Input.scanner.nextInt();

		int digitNumber = number % 10;
		int digitNumber1 = (number % 100) / 10;
		int digitNumber2 = (number % 1000) / 100;
		int digitNumber3 = number / 1000;

		reverseNumber = Integer.parseInt(digitNumber + "" + digitNumber1 + "" + digitNumber2 + "" + digitNumber3);

		Print.print("The reverse number is: " + reverseNumber);
		Print.print("");
	}

}
