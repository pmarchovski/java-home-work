package Program;
import Util.Menu;

public class Application {
	
	static NumberEvents events = new NumberEvents();

	public static void main(String[] args) {

		
		Menu.displayMenu();
		Manager.start();
		
	}

}
