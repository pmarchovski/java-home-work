package Program;

import java.util.ArrayList;

import Util.Console;
import Util.Menu;

public class EventOrganizer {
	
    public static ArrayList<Events> eventCollection = new ArrayList<>();
	public static Events event;
    public static Customer customer;
    
	private static int eventId          = 0;
    private static int startNumberId    = 1000;
    private static int startNumberIndex = 1000;
    private static int years            = 18;
    private static int id;
    
    public static int createEventId() {
    	
		eventId = ++startNumberId;	
    	return eventId;
    }
    
	public static void createEvent() {
		
		Events newEvent = new Events();		
		newEvent.setId();
		newEvent.setEvent();

		eventCollection.add(newEvent);			
	
		Menu.letsContinue();
	}
	
	public static void displayEventCollection() {
		
		for (int i = 0; i < eventCollection.size(); i++) {		
			if (eventCollection.get(i) != null) {				
			eventCollection.get(i).displayEvent();
			}
		}		
		
		Console.showln("");
		Menu.letsContinue();
	}
	
	public static void editEvent() {
		
		Console.showln("Please enter event id for edit");
		id = Console.input();
		
		for (int i = 0; i < eventCollection.size(); i++) {		
		      if (i + startNumberIndex == id - 1) {  
			eventCollection.get(i).setEvent();
	    	}		
		}		
		Console.showln("");
		Console.showln("The event is edited succesfuly \n");
		Menu.letsContinue();
	}
	
	public static void removeEvent() {
		
		Console.showln("Please enter event ID for edit");
		id = Console.input();
		
		for (int i = 0; i < eventCollection.size(); i++) {		
		      if (i + startNumberIndex == id - 1) {  
		    eventCollection.remove(i);
	    	}		
		}		
		Console.showln("");
		Console.showln("The event is removed succesfuly \n");
		Menu.letsContinue();
	}
	
	public static Events takeEventById() {
		Console.showln("Please make a choose of event");
		int chooseNumber = Console.input();	
		for (int i = 0; i < eventCollection.size(); i++) {	
		if (eventCollection.get(i) != null 
			&& eventCollection.get(i).getId() == chooseNumber) {
			event = eventCollection.get(i);
			eventCollection.get(i).displayEvent();
		}		
		}
	    Menu.letsContinue();
		return event;	
	}
	
	public static Customer takeCustomerById() {
		
		Console.showln("");
		Console.showln("Please make a choose customer ID");
		int customerId = Console.input();
		for (int i = 0; i < CustomerOrganizer.customerCollection.size(); i++) {
			
			if (CustomerOrganizer.customerCollection.get(i) != null 
			    && CustomerOrganizer.customerCollection.get(i).getId() == customerId) {
				customer = CustomerOrganizer.customerCollection.get(i);
				//customer.displayCustomer();
			}	
		}
		return customer;
	}
	
	public static void addCustomerIntoEvent() {
		
		Console.showln("Please enter event ID for adding customer");
		id = Console.input();
		
		for (int i = 0; i < eventCollection.size(); i++) {		
		      if (i + startNumberIndex == id - 1) { 		    	  
			eventCollection.get(i).setCustomerToEvent();
		      }
		}		
		Console.showln("");	
		Menu.letsContinue();		
	}
	
	public static double getEventPrice() {
		double eventPrice = 0;
		for (int i = 0; i < eventCollection.size(); i++) {		
		      if (i + startNumberIndex == id - 1) { 		    	  
		eventPrice = eventCollection.get(i).getEventPrice();
		      }
		}		
         return eventPrice;
	}
	
	public static void removeCustomerFromEvent() {
		
		Console.showln("Please enter event ID for remove customer");
		id = Console.input();
		
		for (int i = 0; i < eventCollection.size(); i++) {
			if (i + 1000 == id - 1) {
				eventCollection.get(i).removeCustomerFromEvent();
			}
		}
		Console.showln("The customer is deleted successfuly");		
	}
	
	public static void displayEventsUnderYears() {
		
		for (int i = 0; i < eventCollection.size(); i++) {
			if (eventCollection.get(i).getFlag() < years) {
				eventCollection.get(i).displayEvent();
			} 
			if (eventCollection.get(i).getFlag() >= years) {
				Console.showln("There is no such events");
			} 
		}
		Console.showln("");	
		Menu.letsContinue();
	}
	
	public static void displayEventWithBiggerNumberOfCustomer() {
		int next = 0;
		int max;
		Events maxCustomerEvent = new Events();
		if (eventCollection.size() == 0) Console.showln("There are not events");
		
		max = eventCollection.get(0).getMaxNumberOfCustomer();
		for (int i = 0; i < eventCollection.size() - 1; i++) {

		next = eventCollection.get(i).getMaxNumberOfCustomer();	
		
		if (max < next) {
			
			max = next;
			maxCustomerEvent = eventCollection.get(i);
		}	
		}
		Console.showln("The event with bigger customer number is:");
		maxCustomerEvent.displayEvent();
		Console.showln("The number of customers are: " + next);
		Menu.letsContinue();
	}
}
