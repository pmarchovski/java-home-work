
public class Party {

	public static void party() {
		
		if (Board.boardPosition[SetUpPlayers.playerIndex.getPosition()].getFieldsName().
				equals(Board.party.getFieldsName())) {
			
			SetUpPlayers.myFrame.textInfoFields.setText("");
			SetUpPlayers.myFrame.textInfoFields.setText(" Вие попаднахте на поле"
					                                   + " *** PARTY *** " 
					+ " Това купонясване доведе до " + partyCharge() + " лв. разход");

			SetUpPlayers.myFrame.textInfoMoneyLeft.setText(SetUpPlayers.playerIndex.getName() + " разполaгате с: " 
					+ String.valueOf(SetUpPlayers.playerIndex.getMoney()) + " лв.");
		}		
	}
	
	public static int partyCharge() {
		int partyTax = 25;
		
		SetUpPlayers.playerIndex.partyCharge(partyTax);
		
		return partyTax;
	}
	
}
