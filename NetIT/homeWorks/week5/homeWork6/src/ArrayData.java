public class ArrayData {

	public static int arrayLenght;
	public static int[] array;

	public static void addArray() {
		
		Console.showln("Please enter array lenght:");
		arrayLenght      = Console.input();
		array            = new int[arrayLenght];
		int arrayNumbers = 0;
				
		for (int i = 0; i < arrayLenght; i++) {
			
			arrayNumbers = Console.input();
			array[i]     = arrayNumbers;			
		}			
	}

	public static int[] arrayData(int arrayLenght, int[] array) {
		for (int i = 0; i < arrayLenght; i++) {
			Console.show(array[i] + " ");		
		}	
		Console.showln("\n");
		return array;
	}
}
