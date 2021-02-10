import java.util.Scanner; // КВАДРАТ 1

public class figuraTwo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Въведи число:");

		int num = Integer.parseInt(scan.nextLine());
		
		 scan.close();

		for (int row = 0; row < num; row++) {

			for (int col = 1; col < num - row; col++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int col = 0; col < row; col++) {
				System.out.print(" *");

			}
			System.out.println();
		}

		for (int row = 0; row < num - 1; row++) {

			for (int col = 0; col < row + 1; col++) {
				System.out.print(" ");
			}

			System.out.print("*");
			for (int col = 0; col < num - row - 2; col++) { // 5(num) - 0(row в главния цикъл) - 2
				System.out.print(" *");
			}

			System.out.println();
		}

	}
}
