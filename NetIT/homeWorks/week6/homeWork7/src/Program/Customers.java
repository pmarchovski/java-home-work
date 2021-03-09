package Program;

import Util.Console;

public class Customers {
	
   String name;
   String jender;
   int age;
   
   
   public void setName(String name) {
	   
	   this.name = name;
   }
   
   public void setAge(int age) {
	   
	   this.age = age;
   }
   
   public void setJender(String jender) {
	   
	   this.jender = jender;
   }
   
   
   public Customers() {
	   
	   this.name = "";
	   this.age = 0;
	   this.jender = "";   
   }
 
   public void renderCustomer() {
		
		Console.showln("Име - " 
		        + this.name + "; "
				+ "Години - " + this.age + "; \n" 
		        + "Пол " + this.jender);
	}	
}

