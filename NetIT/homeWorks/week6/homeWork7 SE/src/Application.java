import java.util.Collection;

import Program.Collectoin;
import Program.CustomerObjects;
import Program.EventObjects;
import Program.Start;
import Util.Console;
import Util.Menu;

public class Application {

	public static void main(String[] args) {
		
		EventObjects.createEventObjects();
        CustomerObjects.createCustomerObjects();
		Start.getStarted();

	}
}
