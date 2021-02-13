// Fourth point

public class FourthPoint {

	static void degreece() {
		
		Print.print("Please enter type: 1 - fahrenheit; 2 - celsius");
		int type = Input.scanner.nextInt();
		
		Print.print("Please enter number");
		int number = Input.scanner.nextInt();
		
		double fahrenheit = (number * 1.8) + 32;
		
		if (type == 2) {
			Print.print("The degreece is: " + number + "°C");
			
		} else if (type == 1) {
			Print.print("The degreece is: " + fahrenheit + " °F");
			
		} else {
			Print.print("Нещо жестоко се обърка");
		}
		
	}
	
	
}
