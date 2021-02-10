import java.util.Scanner;

public class helloNameMethod {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Въведи дума: ");
			String duma = scan.nextLine();

			System.out.println("Въведи цифра:");
			int inputNum = Integer.parseInt(scan.nextLine());

			String result = repeatString(duma, inputNum);
			System.out.println(result);
		}

	}

	static String repeatString(String repStr, int num) {

		String text = "";

		for (int i = 0; i < num; i++) {
			text = text + repStr;
		}

		return text;
	}

}
