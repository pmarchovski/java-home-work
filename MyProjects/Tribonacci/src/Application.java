import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Integer> tribonacciList = new ArrayList<Integer>();
	static ArrayList<Integer> spiralList = new ArrayList<Integer>();

	static void tribonacci() {

		int numberOfCounts = 1000;

		Print.print("Input first number");
		int firstNumber = scanner.nextInt();

		Print.print("Input second number");
		int secondNumber = scanner.nextInt();

		Print.print("Input thirth number");
		int thirthNumber = scanner.nextInt();
		int tribonacci;

		tribonacciList.add(firstNumber);
		tribonacciList.add(secondNumber);
		tribonacciList.add(thirthNumber);

		for (int i = 0; i < numberOfCounts; i++) {

			tribonacci = firstNumber + secondNumber + thirthNumber;

			firstNumber = secondNumber;
			secondNumber = thirthNumber;
			thirthNumber = tribonacci;

			tribonacciList.add(tribonacci);

		}
		System.out.print(tribonacciList);
		Print.print("");
	}

	static void spiral() {

		int numberOfCounts = 1000;

		Print.print("");

		Print.print("Spiral start number");
		int startNumber = scanner.nextInt();

		Print.print("Spiral step number");
		int stepNumber = scanner.nextInt();

		int spiral = 0;

		for (int i = 0; i < numberOfCounts; i++) {

			spiral = startNumber + (i + i * (stepNumber - 1));
			spiralList.add(spiral);

		}

		System.out.print(spiralList);

	}

	static void findFirstEqualsNumber() {

		boolean found = false;

		for (int i = 0; i < tribonacciList.size(); i++) {
			for (int j = 0; j < spiralList.size(); j++) {

				if (tribonacciList.get(i).equals(spiralList.get(j)) && tribonacciList.get(i) <= 1000) {

					int result = tribonacciList.get(i);

					Print.print("");
					Print.print("");
					System.out.println("The first equal number is: " + result);
					found = true;
					break;
				}

			}

			if (found) {
				break;
			}
		}
		if (!found) {
			System.out.println("NO");
		}

	}

}
