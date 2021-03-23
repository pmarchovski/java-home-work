
public class Invest {

	public static void invest() {
			
		if (Board.boardPosition[SetUpPlayers.playerIndex.getPosition()].getFieldsName().
				equals(Board.invest.getFieldsName())) {
			
			System.out.println("Вие попаднахте на поле *** INVEST ***");
			
			if (!Steal.isStealFree && SetUpPlayers.playerIndex.isStealProtected() == true && Steal.choosePlan == 1) {
			System.out.println("Получавате награда от злият план");
			Steal.secondPlan();
		}
			
		}
	}
}
