import java.util.Scanner; // ЕЛХИЧКА

public class figuraElha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Въведи цифра: ");

		int num = Integer.parseInt(scan.nextLine());

		String rowMiddle = "";

		for (int row = 0; row < num + 1; row++) {
			rowMiddle = repeatF(" ", num - row)
			+ repeatF("*", row)
			+ repeatF(" | ", 1)
			+ repeatF("*", row);
			System.out.println(rowMiddle);
		}
	}

	static String repeatF(String petarF, int count) {

		String text = "";

		for (int i = 0; i < count; i++) {
			text = text + petarF;
		}
		return text;
	}
	

}
