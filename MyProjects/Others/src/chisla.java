import java.util.Scanner; //ПОРЕДИЦА НА ФИБОНАЧИ

public class chisla {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Въведи число: ");
		
		int n = Integer.parseInt(scan.nextLine());
		int num1 = 1;
		int num2 = 1;
		
		
		for (int i = 0; i < n - 1; i++) {
			int num3 = num1 + num2;
		num1 = num2;
		num2 = num3;
		System.out.println(num2);
		
		}

	}

}
