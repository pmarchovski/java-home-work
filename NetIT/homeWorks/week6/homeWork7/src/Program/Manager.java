package Program;

import Util.Console;
import Util.Menu;

public class Manager {
	
	static NumberEvents events = new NumberEvents();
	static NumberEvents customer = new NumberEvents();
    static int customerNumber;
	
	public static int chooseNumber;

	public static void start() {
		
		if (Menu.position == 1) createEvent();
		if (Menu.position == 2) displayEvents();
		if (Menu.position == 3) deleteEvent();
		if (Menu.position == 4) createUpdateEvent();
		if (Menu.position == 5) flag();
		if (Menu.position == 6) myCustomers();
		if (Menu.position == 7) addCustomer();
		
	}
	
    public static void createEvent() {
			
		Events firstEvent = new Events();
		Events secondEvent = new Events();
	    Events thirdEvent = new Events();
	    Events fourthEvent = new Events();
	    Events fifthEvent = new Events();
	    
		events.setEventCollection(firstEvent);
        firstEvent.setNumber();

		events.setEventCollection(secondEvent);
		secondEvent.setNumber();
	
        events.setEventCollection(thirdEvent);
		thirdEvent.setNumber();

        events.setEventCollection(fourthEvent);
        fourthEvent.setNumber();

        events.setEventCollection(fifthEvent);
        fifthEvent.setNumber();
        
        events.getEventCollection();
       
		createUpdateEvent();
		
		letsContinue();
		
	     
	}

	public static void createUpdateEvent() {
		Console.showln("Създай/редактирай събитие - избери номер за събитието");
		chooseNumber = Console.input();	
	    events.getEvent(chooseNumber).updateEvent(chooseNumber);    
	    events.getEventCollection();
	    Console.showln("");
	    Console.showln("Събитието е създадено / променено успешно");
	    Console.showln("");
	    letsContinue();
	}
     
	public static void letsContinue() {
		
		Console.showln("Как искате да продължите?");
		Console.showln("Главно меню - menu");
		Console.showln("Продължи да създаваш събития - new");
		String answer = Console.inputStr();
		if (answer.equals("new")) createUpdateEvent();
		if (answer.equals("menu")) {
			Menu.displayMenu();	
			start();
		}
		
	}
	
	public static void deleteEvent() {
		events.getEventCollection();
		Console.showln("Изтрии събитие - избери номер за събитието");
		chooseNumber = Console.input();	
	    events.getEvent(chooseNumber).deleteEvent(chooseNumber);    
	    events.getEventCollection();
	    Console.showln("");
	    Console.showln("Събитието е изтрито");
	    Console.showln("");
	    letsContinue();
	}
	
	public static void flag() {
		
		Console.showln("");
		Console.showln("Събитията за над 18 години са:");
		events.getOnlyFlag();
		Console.showln("");
		letsContinue();
	}
	
	public static void displayEvents(){
		events.getEventCollection();
		Console.showln("");
		letsContinue();
	}
	
	public static void addCustomer() {
		
		
		Console.showln("Избери събитие");
		int eventNumber = Console.input();
		events.getEvent(eventNumber);
		
		Console.showln("Избери клиент");
		customerNumber = Console.input();
		customer.getCustomer(customerNumber).renderCustomer();
		
		
	}
	
	public static void myCustomers() {
		Customers customer1 = new Customers();
		Customers customer2 = new Customers();
		Customers customer3 = new Customers();
		Customers customer4 = new Customers();
		Customers customer5 = new Customers();
		Customers customer6 = new Customers();
		Customers customer7 = new Customers();
		Customers customer8 = new Customers();
		Customers customer9 = new Customers();
		Customers customer10 = new Customers();
		
		customer.setCustomerCollection(customer1);
		customer.setCustomerCollection(customer2);
		customer.setCustomerCollection(customer3);
		customer.setCustomerCollection(customer4);
		customer.setCustomerCollection(customer5);
		customer.setCustomerCollection(customer6);
		customer.setCustomerCollection(customer7);
		customer.setCustomerCollection(customer8);
		customer.setCustomerCollection(customer9);
		customer.setCustomerCollection(customer10);
		
		customer1.setName("Петър");
		customer1.setAge(18);
		customer1.setJender("мъж");
		
		customer2.setName("Георги");
		customer2.setAge(22);
		customer2.setJender("мъж");
		
		customer3.setName("Петя");
		customer3.setAge(18);
		customer3.setJender("жена");
		
		customer4.setName("Димитър");
		customer4.setAge(16);
		customer4.setJender("мъж");
		
		customer5.setName("Мариана");
		customer5.setAge(17);
		customer5.setJender("жена");
		
		customer6.setName("Никол");
		customer6.setAge(21);
		customer6.setJender("жена");
		
		customer7.setName("Костадин");
		customer7.setAge(25);
		customer7.setJender("мъж");
		
		customer8.setName("Николай");
		customer8.setAge(18);
		customer8.setJender("мъж");
		
		customer9.setName("Радка");
		customer9.setAge(18);
		customer9.setJender("жена");
		
		customer10.setName("Бранимир");
		customer10.setAge(18);
		customer10.setJender("мъж");
		
		customer.customerCollection[0] = customer1;
		customer.customerCollection[1] = customer2;
		customer.customerCollection[2] = customer3;
		customer.customerCollection[3] = customer4;
		customer.customerCollection[4] = customer5;
		customer.customerCollection[5] = customer6;
		customer.customerCollection[6] = customer7;
		customer.customerCollection[7] = customer8;
		customer.customerCollection[8] = customer9;
		customer.customerCollection[9] = customer10;
		
		customer.getCustomerCollection();
		Console.showln("");
		letsContinue();
		
	}
}
