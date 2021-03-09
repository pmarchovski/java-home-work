package Program;

import Util.Console;

public class Events {

	private String name;
	private int flag;
	private int numbers;
	private Customers customer;
	
    public void setCustomer() {
	
    NumberEvents temp = new NumberEvents();
    this.customer = temp.getCustomer(Manager.customerNumber);
	}
	
	public void setName() {
		
		this.name = Console.inputStr();
		
		}
	
	public void setFlag() {
		
		this.flag = Console.input();
	}
	
	public void setNumber() {
	
	this.numbers = NumberEvents.eventIndex;
		
	}
	
	public int getFlag() {
		
		int flag = this.flag;
		return flag;
	}
	
	
	public void render() {
		
		if (this.name.equals("")) {
			
			Console.showln("Номер: " + this.numbers);
		} else {
		
		Console.showln("Номер: " + this.numbers 
				+ "; " + "Име на събитието - " 
		        + this.name + "; "
				+ "Години - " + this.flag + " \n" 
		        + "Клиенти - " + this.customer);
		       
		}
	}	
	
	public Events() {
		this.name = "";
		this.flag = 0;
	}
	
	public void updateEvent(int eventNumber) {
 
		if (this.numbers == eventNumber) {
			
			Console.showln("Въведи име на събитието");
			setName();
			Console.showln("Въведи ограничение за посещаване - години");
			setFlag();
			setCustomer();
		}
	}
	
	public void deleteEvent(int eventNumber) {

		if (this.numbers == eventNumber) {
			this.name = "";
			this.flag = 0;
	}
	}
}
