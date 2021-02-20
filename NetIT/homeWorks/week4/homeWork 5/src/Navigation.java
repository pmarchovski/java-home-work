
public class Navigation {
 
	public static void getОbstacle() {
		
		int typeOfObstacle;
			
		// 1 - Wall
		// 2 - Chair
		// 3 - Nothing
		
		typeOfObstacle = (int) (1 + Math.random() * 3);
		
		if (typeOfObstacle == 1) {
			Console.showln("Wall - Go Sideway");
		}
		
		if (typeOfObstacle == 2) {
			Console.showln("Chair - Jump");
		}
		
		if (typeOfObstacle == 3) {
			Console.showln("Nothing - Go Forward");
		}
		
		Console.showln("Looking for mice");
	}
}
