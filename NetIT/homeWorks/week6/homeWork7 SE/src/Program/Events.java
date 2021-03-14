package Program;
import java.time.LocalDate;
import java.util.ArrayList;

import Util.Console;
import Util.Menu;

public class Events {
	
	private ArrayList<Customer> customerEvent = new ArrayList<>();
	private String     title;
	private int        flag;
	private int        id;
	private LocalDate  date; 
	private double     eventPrice;
	
	
	public void setEventPrice() {
		Console.showln("Please enter event price");		
		this.eventPrice = Console.inputD();
	}
	
	public double getEventPrice() {
	
			return this.eventPrice;
	}
	
	public void setDate() {
		this.date = LocalDate.now();
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public void setTitle() {	
		Console.showln("Please enter event title");
		this.title = Console.inputStr();	
	}
	
	public void setFlag(int flag) {
		Console.showln("Please enter event flag");	
		this.flag = Console.input();
	}
	
	public int getFlag() {
		return this.flag;
	}

	public void setId() {
		this.id = EventOrganizer.createEventId();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setCustomerToEvent() {
	
		Customer tempInfo = new Customer();
		tempInfo = EventOrganizer.takeCustomerById();
		
		for (int i = 0; i < customerEvent.size(); i++) {
			if (customerEvent.get(i).getId() == tempInfo.getId()) {
				Console.showln("---There is such customer in this event---");
				return;
			}
		}			
		if (this.flag > tempInfo.getAge()) {
			Console.showln("---This customer does not allowed "
		                    + "for this event---");
		   Menu.letsContinue();
		}
		else if (tempInfo.getWallet() - this.eventPrice < 0) {
			
			Console.showln("--- You don't have enough money in the wallet ---");
			Menu.letsContinue();
		}
		        
		else {	
			this.customerEvent.add(tempInfo);
			tempInfo.takeFromWallet();
			Console.showln("The customer is added succesfuly \n");
		}
		
		
	}
	
	public void removeCustomerFromEvent() {
		
		Console.showln("Please enter customer ID for remove");
		int id = Console.input();
		
		for (int i = 0; i < customerEvent.size(); i++) {
			if (customerEvent.get(i).getId() == id) {
				this.customerEvent.remove(i);
			} 
		}
	}
	
	public void setEvent() {
		setDate();
		setTitle();
		setFlag(flag);
		setEventPrice();
	}
	
	public int getMaxNumberOfCustomer() {

	   return this.customerEvent.size();
	    
	}
	
	public void displayCustomerCount() {
		Console.showln("");
		Console.showln("The bigger number of customer for this event is: " + this.customerEvent);
	}

	public void displayEvent() {
	
		int years = 18;
		boolean price = this.eventPrice > 0;
		
		Console.showln("");
		Console.showln("The event date is: " + this.date);
		Console.showln("The event id is: "   + this.id);
		
		
		if (price) Console.showln("The event name is: " + "$ " + this.title);
		else Console.showln("The event name is: " + " !" + this.title);
		
		if (price) Console.showln("The event price is: " + this.eventPrice + " BGN");
		else Console.showln("This event is without price");
		
		if (this.flag < years) Console.showln("* The event is allowed for everybody");
		else Console.showln("# The event is allowed only for people over 18 years old");

		Console.showln("");
		Console.showln("The customer for this event are:");
		for (int i = 0; i < this.customerEvent.size(); i++) {
			if(this.customerEvent.get(i) != null) {
			this.customerEvent.get(i).displayCustomer();
			}
		}
		Console.showln("");

	}

}
