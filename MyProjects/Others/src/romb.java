import java.util.Scanner; //РОМБ

public class romb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Въведи число: ");

		int num = Integer.parseInt(scan.nextLine());

		 scan.close();
		
		for (int row = 0; row < num; row++) {

			String firstPart = repString(" ", num - row - 1) + repString("*", 1) + repString(" *", row);

			System.out.println(firstPart);
		}

		for (int row = 0; row < num - 1; row++) {
			String secPart = repString(" ", row + 1) + repString("*", 1) + repString(" *", num - row - 2);

			System.out.println(secPart);
		}

	}

	static String repString(String repToStr, int input) {

		String text = "";

		for (int i = 0; i < input; i++) {

			text = text + repToStr;

		}
		return text;
	}

}
