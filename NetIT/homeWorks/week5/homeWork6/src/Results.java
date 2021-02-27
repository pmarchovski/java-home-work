import java.util.Random;

public class Results {

	static int externalIndex;
	static int internalIndex;

	public static void sortLowestToHighest(int[] array) {

		sortLowestToHighestWitoutExit(array);
		exit();	
	}

	public static void sortHighestToLowest(int[] array) {

		for (externalIndex = 0; externalIndex < array.length; externalIndex++) {

			for (internalIndex = 0; internalIndex < array.length - 1; internalIndex++) {

				int firstNumber  = array[internalIndex];
				int secondNumber = array[internalIndex + 1];

				if (firstNumber < secondNumber) {

					array[internalIndex]     = secondNumber;
					array[internalIndex + 1] = firstNumber;
				}
			}
		}
	 	for (externalIndex = 0; externalIndex < array.length; externalIndex++) {
			Console.show(array[externalIndex] + " ");
		}
		Console.showln(" \n");
		exit();
	}

	public static void searchNumberPosition(int[] array) {

		sortLowestToHighestWitoutExit(array);

		Console.showln("Please enter the number looking for");

		int middleIndex    = 0;
		int middleNumber;
		int searchNumber   = Console.input();
		int myIndex        = 0;

		int leftIndex      = 0;
		int rightIndex     = ArrayData.arrayLenght - 1;

		while (leftIndex <= rightIndex) {

			middleIndex  = (leftIndex + rightIndex) / 2;
			middleNumber = ArrayData.array[middleIndex];

			if (middleNumber == searchNumber) {
				myIndex = middleIndex;
			}
			if (middleNumber < searchNumber) {

				leftIndex = middleIndex + 1;

			} else {
				rightIndex = middleIndex - 1;
			}
		}

		Console.show("The number is: " + searchNumber);
		Console.showln("");
		Console.show("The index is :" + myIndex);

		Console.showln(" \n");
		exit();
	}

	public static void randomNumberPosition(int[] array) {

		Random random = new Random();

		ArrayData.arrayData(ArrayData.arrayLenght, ArrayData.array);

		for (int i = 0; i < ArrayData.arrayLenght; i++) {
			int randomIndex    = random.nextInt(ArrayData.arrayLenght);
			int temp           = array[randomIndex];
			array[randomIndex] = array[i];
			array[i]           = temp;

			Console.show(array[i] + " ");
		}
		Console.showln(" \n");
		exit();
	}

	public static void sumArrayNumber(int[] array) {

		ArrayData.arrayData(ArrayData.arrayLenght, ArrayData.array);
		int arraySum = 0;

		for (int i = 0; i < ArrayData.arrayLenght; i++) {

			arraySum = arraySum + array[i];
		}
		Console.show("The sum is: " + arraySum + " ");

		Console.showln(" \n");
		exit();
	}

	public static void findingLargestNumber(int[] array) {

		ArrayData.arrayData(ArrayData.arrayLenght, ArrayData.array);

		int maxArrayNumber = array[0];

		for (int i = 0; i < ArrayData.arrayLenght; i++) {

			int arrayIndex = array[i];

			if (arrayIndex > maxArrayNumber) {
				maxArrayNumber = arrayIndex;
			}
		}
		Console.show("The largest number is: " + maxArrayNumber);
		Console.showln(" \n");
		exit();
	}

	public static void findingLowestNumber(int[] array) {

		ArrayData.arrayData(ArrayData.arrayLenght, ArrayData.array);

		int minArrayNumber = array[0];

		for (int i = 0; i < ArrayData.arrayLenght; i++) {

			int arrayIndex = array[i];

			if (arrayIndex < minArrayNumber) {
				minArrayNumber = arrayIndex;
			}
		}
		Console.show("The lowest number is: " + minArrayNumber);
		Console.showln(" \n");
		exit();
	}

	public static void averageValueOfArray(int[] array) {

		ArrayData.arrayData(ArrayData.arrayLenght, ArrayData.array);

		int numberOfLenght = array.length;
		int sumArrayValue  = 0;
		int averageValue;

		for (int i = 0; i < array.length; i++) {

			sumArrayValue = sumArrayValue + array[i];
		}

		averageValue = sumArrayValue / numberOfLenght;

		Console.show("The average value is: " + averageValue);
		Console.showln(" \n");
		exit();
	}

	public static void symetryArray(int[] array) {

		ArrayData.arrayData(ArrayData.arrayLenght, ArrayData.array);

		boolean symetry = true;
		for (int i = 0; i < array.length; i++) {

			if (array[i] != array[(array.length - 1) - i]) {

				symetry = false;
			}
		}
		Console.showln("Is the array symetry? - " + symetry);

		Console.showln(" \n");
		exit();
	}

	public static void invertingArray(int[] array) {

		ArrayData.arrayData(ArrayData.arrayLenght, ArrayData.array);

		int[] invertArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			invertArray[array.length - 1 - i] = array[i];
			invertArray[i] = array[array.length - 1 - i];
		}

		for (int i = 0; i < invertArray.length; i++) {

			Console.show(invertArray[i] + " ");
		}
		Console.showln(" \n");
		exit();

	}

	public static void showNumber(int[] array) {

		ArrayData.arrayData(ArrayData.arrayLenght, ArrayData.array);
		Console.showln(" \n");
		exit();
	}

	public static void exit() {

		Console.showln("Do you want to continue with option?");
		Console.showln("YES --> please enter 1");
		Console.showln("NO  --> please enter 0");

		int choiseNumber = Console.input();

		if (choiseNumber == 1) {
			Console.showln("Please select an option from the menu\n");
			OptionMenu.menuIndex();

		} else if ((choiseNumber == 0)) {
		
		  Console.showln("....GAME OVER....");
		}
          else {
			exit();
		}
	}
	
	private static void sortLowestToHighestWitoutExit(int[] array) {
		for (externalIndex = 0; externalIndex < array.length; externalIndex++) {

			for (internalIndex = 0; internalIndex < array.length - 1; internalIndex++) {

				int firstNumber  = array[internalIndex];
				int secondNumber = array[internalIndex + 1];

				if (firstNumber > secondNumber) {

					array[internalIndex]     = secondNumber;
					array[internalIndex + 1] = firstNumber;
				}
			}
		}
		for (externalIndex = 0; externalIndex < array.length; externalIndex++) {
			Console.show(array[externalIndex] + " ");
		}
		Console.showln(" \n");
	}
}
