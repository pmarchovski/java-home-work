package Util;
import java.util.Scanner;

import Program.Events;

public class Console {

	
	public static void showln(String text) {
		System.out.println(text);

	}
	
	public static void showln(boolean text) {
		System.out.println(text);

	}

	public static void showln(int number) {
		System.out.println(number);

	}

	public static int input() {
		Scanner scanner = new Scanner(System.in);
		
		return scanner.nextInt();
	}
	
	public static String inputStr() {
		Scanner scanner = new Scanner(System.in);
		
		return scanner.nextLine();
	}

	public static void show(String text) {
		System.out.print(text);
	}
	
	public static void show(int number) {
		System.out.print(number);
	}
	
	public static void show(int[] number) {
		System.out.print(number);
	}
	


}
