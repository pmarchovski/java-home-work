
public class ConnectWithOwner {

	public static void connection() {

		int startNumber = 1;
		int endNumber   = 10;
		
		for (int i = startNumber; i < endNumber; i++) {
			Console.show(i + ", ");
		}
	    	Console.show(endNumber);  // because the comma
		    Console.showln("");  
		
		for (int i = endNumber; i >= startNumber; i--) {	
			if (i % 2 == 0) {

				Console.showln("I am a Robottttt, " + i);
			}
		}
	}
	
	public static void statistic() {
		
		Console.showln("Statistic");
		Console.showln("");
		Console.showln("Numbers of dead mouse: " 
		              + Hunting.numberOfDeadMouse);
		Console.showln("Numbers of broken furniture: " 
		              + Hunting.numberOfBrokenFurnitures);
	}	
}
