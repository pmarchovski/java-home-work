
public class ReverseWithCicle {

	static void reverse() {
		
		int number = Input.scanner.nextInt();
		
		int reverseNumber;
		
		for (int i = 10; i <= number * 10; i *= 10) {
			
			reverseNumber = (number % i) / (i / 10);
			
		System.out.print(reverseNumber);	
		}
		
		
	}
	
	
}
