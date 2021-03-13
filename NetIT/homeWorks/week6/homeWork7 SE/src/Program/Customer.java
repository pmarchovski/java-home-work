package Program;

import Util.Console;
import Util.Menu;

public class Customer {

	private final int    MAX_AGE = 80;
	private final int    MIN_AGE = 4;
	private String       name;
	private String       gender;
	private int          customerId;
	private int          age;
	
	public void setId() {
		this.customerId = CustomerOrganizer.createCustomerId();	
	}
	
	public int getId() {
		return this.customerId;
	}
	
	public void setName() {
		
		Console.showln("Please enter customer name");
		this.name = Console.inputStr();
	}
	
    public void setAge() {		
		Console.showln("Please enter customer age");
		int age = Console.input();
		if (age > MIN_AGE && age < MAX_AGE) this.age = age;
			
		else {
			Console.showln("-----The age are not allowed-----");
			Menu.letsContinue();
		}

	}
    
    public int getAge() {
    	return this.age;
    }
    
   public void setGender() {
		
		Console.showln("Please enter customer gender [m -> male]; \n"
				+ "                             [f -> famale]");
		
		String gender = Console.inputStr();
		
		if (gender.equals("m") || gender.equals("f")) {
		this.gender = gender;
		
	    } else {
	    Console.showln("Incorect character!");
		setGender();
	 }
   }
   
	public void setCustomer() {	
		setId();		
		setName();
		setAge();
		setGender();
	}
		
	public void displayCustomer() {
		
		Console.showln("");
		System.out.println("Customer ID: "     + this.customerId);
		System.out.println("Customer name: "   + this.name);
		System.out.println("Customer gender: " + this.gender);
		System.out.println("Customer age: "    + this.age);	
		
	}
}
