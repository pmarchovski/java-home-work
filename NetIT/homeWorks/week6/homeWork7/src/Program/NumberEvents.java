package Program;

import Util.Console;

public class NumberEvents {

	Customers[] customerCollection = new Customers[10];
	Events[] eventCollection = new Events[5];
	public static int eventIndex;
	
	
	public void setCustomerCollection(Customers customer){
		
		for (int i = 0; i < customerCollection.length; i++) {

			if (this.customerCollection[i] == null) {

				this.customerCollection[i] = customer;

				break;
			}
		}
		
	}
	

	public void setEventCollection(Events event) {

		for (int i = 0; i < eventCollection.length; i++) {

			if (this.eventCollection[i] == null) {

				this.eventCollection[i] = event;

				break;
			}
		}

		for (int i = 0; i < eventCollection.length; i++) {

			if (event == eventCollection[i]) {

				eventIndex = i + 1;
			}
		}
	}

	public void getEventCollection() {

		for (int i = 0; i < eventCollection.length; i++) {
			if (eventCollection[i] != null) {
				eventCollection[i].render();
			} 
			
			if (eventCollection[i] == null) {
				Console.showln("Няма създадени събития");
			}
		}
	}
	
	public void getCustomerCollection() {
		
		for (int i = 0; i < customerCollection.length; i++) {
			if (customerCollection[i] != null) {
				customerCollection[i].renderCustomer();
			} 
			
			if (customerCollection[i] == null) {
				Console.showln("Няма създадени клиенти");
			}
		}
	}
	
	public Events getEvent(int chooseNumber) {

		Events event = new Events();
		for (int i = 0; i < eventCollection.length; i++) {
			
			if (i == chooseNumber - 1) {
				
				event = eventCollection[i];
				eventCollection[i].render();
			}
		}
		return event;
	}
	
	
	public Customers getCustomer(int number) {
		
		Customers customer = new Customers();
		
		for (int i = 0; i < customerCollection.length; i++) {
			
			if (i == number - 1) {
				customer = customerCollection[i];
				customerCollection[i].renderCustomer();
			} 
		}
		
		return customer;
	}
	
	public void getOnlyFlag() {
		
		for (int i = 0; i < eventCollection.length; i++) {
			
			if (eventCollection[i] == null) {
				Console.showln("Няма създадени събития");
			}		
			
			if (eventCollection[i].getFlag() >= 18) {
				
				eventCollection[i].render();
			}

		}
	}
	
}
