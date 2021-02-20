
public class Start {

	public static void start() {
		
		Console.show("Please press 1 to start hunting mouses");
		int start = Console.input();
		
		if (start == 1) {
			
		Navigation.getОbstacle();
        ReadyForFight.mouseAvailable();	
			
		} else if (start !=1) {
		
		Console.show("Please press 1 to start hunting mouses");				
		}
	}
}
