import java.util.Scanner; // Квадрат

public class figura {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Въведи число: ");

		int num = Integer.parseInt(scan.nextLine());

		System.out.print("+");
		
		for (int row = 0; row < num - 2; row++) {
			System.out.print(" -");
		}
		System.out.println(" +");

		for (int row = 0; row < num - 2; row++) {
			System.out.print("|");
			for (int col = 0; col < num - 2; col++) {
				System.out.print(" -");

			}
			System.out.println(" |");
		}
		System.out.print("+");
		for (int row = 0; row < num - 2; row++) {
			System.out.print(" -");
		}
		System.out.println(" +");
	}

}
