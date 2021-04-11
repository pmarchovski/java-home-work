import java.util.Random;

public class Steal {

	public static int choosePlan;
	public static boolean isStealFree = true;
	private static int stealBonus = 100;
	
	public static void steal() {
		
		if (Board.boardPosition[SetUpPlayers.playerIndex.getPosition()].getFieldsName().
				equals(Board.steal.getFieldsName()) && isStealFree) {
			
			System.out.println("Вие попаднахте на поле *** STEAL ***");
			System.out.println("Активиран е зъл план");
			generatePlan();
			isStealFree = false;
			SetUpPlayers.playerIndex.setStealProtected(true);	
			
		} 
		else if (Board.boardPosition[SetUpPlayers.playerIndex.getPosition()].getFieldsName().
				equals(Board.steal.getFieldsName()) && !isStealFree) {
			System.out.println("Вие попаднахте на поле *** STEAL ***");
			System.out.println("Към полето има активиран план");
		}	
		
		if (!Steal.isStealFree && SetUpPlayers.playerIndex.isStealProtected() == true && Steal.choosePlan == 2) {
			System.out.println("Получавате награда от злият план");
			Steal.thirdPlan();
		}
		
	}
	
	public static void generatePlan() {
		
		Random random = new Random();
		choosePlan = random.nextInt(2);
		
	}
	
	public static void firstPlan() {

			SetUpPlayers.playerIndex.stealBonus(stealBonus);
	}
	
	public static void secondPlan() {
	
			SetUpPlayers.playerIndex.stealBonus(stealBonus);
	}
	
	public static void thirdPlan() {
		
			SetUpPlayers.playerIndex.stealBonus(stealBonus);
	}
}
