
public class FifthPoint {

	static void decimalNumber() {
		
		Print.print("Please enter decimal number with more then four number after coma");
		double number = Input.scanner.nextDouble();
		int numberInt = (int) number;
	
		// Print.print("The number is: " + number);
		// Print.print("The number is: " + numberInt);
		
		number = number - numberInt;
		// Print.print("The number is: " + number);
		
		number = number * 1000;
		// Print.print("The number is: " + number);
		
		int result = (int) (number % 10);
		Print.print("The number is: " + result);
	}
}
