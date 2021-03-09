package Util;

public class Menu {

	public static int position;
 static String menu[] = {"[1] Създай събитие",
				         "[2] Покажи събитията",
				         "[3] Изтрии събитие",
				         "[4] Промени събитие",
                         "[5] Покажи събитията за над 18 години",
                         "[6] Покажи списък с клиентите",
                         "[7] Добави клиент към събитие"};


	public static int displayMenu() {
	
		for (String i : menu) {
			Console.show(i + "\n");
		}
		
		Console.showln("");
		Console.showln("Моля изберете опция от главното меню");		
		position = Console.input();		
	    Console.showln(menu[position - 1]);				
		return position;
	}

}
