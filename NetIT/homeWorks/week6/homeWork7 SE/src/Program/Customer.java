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
	private double       wallet;
	private int          eventCount;
	boolean              vip = true;
	
	public void setEventCount() {
		this.eventCount++;
		if (this.eventCount > 5) {
			this.eventCount = 0;
		}
	}
	
	public int getEventCount() {
		return this.eventCount;
	}
	
	public void setWallet() {
		Console.showln("Please enter wallet value for this customer");
		this.wallet = Console.inputD();
	}

	public void takeFromWallet() {
		if (vip) {
			this.wallet = this.wallet - 0;
		} else {
			this.wallet = this.wallet - EventOrganizer.getEventPrice();
		}		
	}
	
	public double getWallet() {
		return this.wallet;
	}
	
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
		setWallet();
	}
		
	public void displayCustomer() {
		
		vip = this.eventCount == 5;
		Console.showln("");
		System.out.println("Customer ID: "     + this.customerId);
		System.out.println("Customer Name: "   + this.name);
		System.out.println("Customer Gender: " + this.gender);
		System.out.println("Customer Age: "    + this.age);
		System.out.println("Customer Wallet: " + this.wallet + " BGN");		
		if (vip) System.out.println("--- You are VIP customer---");
		
	}
}
