import java.util.Scanner; // КВАДРАТ

public class figuraWithMethod {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Въведи цифра: ");

		int num = Integer.parseInt(scan.nextLine());
		String rowMiddle = "";
		String stars = "+";

		String row1 = repStr(stars, 1) 
				+ repStr(" -", num - 2)
				+ repStr(" +", 1);
		System.out.println(row1);

		for (int row = 0; row < num - 2; row++) {
			rowMiddle = repStr("|", 1) 
					+ repStr("  ", num - 2) 
					+ repStr(" |", 1);
			System.out.println(rowMiddle);
		}

		row1 = repStr(stars, 1) 
				+ repStr(" -", num - 2) 
				+ repStr(" +", 1);
		System.out.println(row1);

	}

	static String repStr(String strToRep, int count) {

		String text = "";

		for (int i = 0; i < count; i++) {
			text = text + strToRep;

		}
		return text;
	}

}
