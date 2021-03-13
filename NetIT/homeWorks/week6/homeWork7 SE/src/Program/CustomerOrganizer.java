package Program;

import java.util.ArrayList;

import Util.Console;
import Util.Menu;

public class CustomerOrganizer {

	public static int        customerId;
	public static int        customerIdIndex;
	public static int        startCustomerNumber = 1000;
	public static ArrayList<Customer> customerCollection = new ArrayList<>();
	
	public static void createCustomer() {
		
		Customer newCustomer = new Customer();
	
		newCustomer.setCustomer();	
		
		customerCollection.add(newCustomer);	
		
		Console.showln("The customer is created \n");
		Menu.letsContinue();
	}	
	
	public static void customerCollectionDisplay() {
		
		for (int i = 0; i < customerCollection.size(); i++) {
			
			if (customerCollection.get(i) != null) {
				customerCollection.get(i).displayCustomer();
			}
		}
		Console.showln("");
		Menu.letsContinue();
	}

	public static int createCustomerId() {
					
				customerId = ++startCustomerNumber;				
	
		return customerId;
	}
}
