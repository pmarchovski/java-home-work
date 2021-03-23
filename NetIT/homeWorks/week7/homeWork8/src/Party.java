
public class Party {

	public static void party() {
		
		if (Board.boardPosition[SetUpPlayers.playerIndex.getPosition()].getFieldsName().
				equals(Board.party.getFieldsName())) {
			
			System.out.println("Вие попаднахте на поле *** PARTY ***");
			System.out.println("Това купонясване доведе до " + partyCharge() + " лв. разход");
			
		}		
	}
	
	public static int partyCharge() {
		int partyTax = 25;
		
		SetUpPlayers.playerIndex.partyCharge(partyTax);
		
		return partyTax;
	}
	
}
