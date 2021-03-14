package Util;
import Program.CustomerOrganizer;
import Program.EventOrganizer;

public class Menu {

	public static void menu() {
		
		Console.showln("**** MAIN MENU ****");
		
		Console.showln("[1] - EVENTS");
		Console.showln("[2] - CUSTOMERS");
		Console.showln("[3] - REPORTS");
		
		int chooseNumberMainMenu = Console.input();
		
		if (chooseNumberMainMenu == 1) eventMenu();
		if (chooseNumberMainMenu == 2) customerMenu();
		if (chooseNumberMainMenu == 3) reportMenu();	
	}
	
	public static void letsContinue() {
		
		Console.showln("*** Short menu ***");
		Console.showln("");
		Console.showln("1 ==> Go in main menu");
		Console.showln("2 ==> Create new event");
		Console.showln("3 ==> Create new customer");
		
		int choose = Console.input();
		if (choose == 1) Menu.menu();
		if (choose == 2) EventOrganizer.createEvent();
		if (choose == 3) CustomerOrganizer.createCustomer();
		else {
			Menu.menu();
		}	
	}
	
	private static void eventMenu() {
		
		Console.showln("*** Event menu ***");
		Console.showln("[1] - Create event" + "\n"
		             + "[2] - Edit event"   + "\n"
		             + "[3] - Remove event" + "\n"
		             + "[4] - Display all events \n");
		Console.showln("[5] - Back to MAIN MENU");
		
		int chooseNumberEventMenu = Console.input();
		
		if (chooseNumberEventMenu == 1) EventOrganizer.createEvent();
		if (chooseNumberEventMenu == 2) EventOrganizer.editEvent();
		if (chooseNumberEventMenu == 3) EventOrganizer.removeEvent();
		if (chooseNumberEventMenu == 4) EventOrganizer.displayEventCollection();
		if (chooseNumberEventMenu == 5) menu();
	}
		
    private static void customerMenu() {
		
        Console.showln("*** Customer menu ***");
		
		Console.showln("[1] - Create new customer"     + "\n"
	                 + "[2] - Display all customers"   + "\n"
	                 + "[3] - Add customer into event" + "\n"
	                 + "[4] - Remove customer from event  \n");
	    Console.showln("[5] - Back to MAIN MENU");
	    
	    int chooseNumberReportMenu = Console.input();
	    
	    if (chooseNumberReportMenu == 1) CustomerOrganizer.createCustomer();
	    if (chooseNumberReportMenu == 2) CustomerOrganizer.customerCollectionDisplay();
	    if (chooseNumberReportMenu == 3) EventOrganizer.addCustomerIntoEvent();
	    if (chooseNumberReportMenu == 4) EventOrganizer.removeCustomerFromEvent();
	    if (chooseNumberReportMenu == 5) menu();
	}
	
	private static void reportMenu() {
		Console.showln("*** Report menu ***");
		
		Console.showln("[1] - Display event by ID"     + "\n"
	                 + "[2] - Display customer by ID"   + "\n"
	                 + "[3] - Take events appropriate "
	                 +        "for people under 18 years only" + "\n"
	                 + "[4] - The event with max number of customers  \n");
	    Console.showln("[5] - Back to MAIN MENU");
	    
	    int chooseNumberCustomerMenu = Console.input();
	    
	    if (chooseNumberCustomerMenu == 1) EventOrganizer.takeEventById();
	    if (chooseNumberCustomerMenu == 2) EventOrganizer.takeCustomerById();
	    if (chooseNumberCustomerMenu == 3) EventOrganizer.displayEventsUnderYears();
	    if (chooseNumberCustomerMenu == 4) EventOrganizer.displayEventWithBiggerNumberOfCustomer();
	    if (chooseNumberCustomerMenu == 5) menu();
	    
	}
}
