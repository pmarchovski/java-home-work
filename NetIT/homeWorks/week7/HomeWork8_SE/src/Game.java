

public class Game{


	public static void game() {

		SetUpPlayers.playerIndexCreation();
		SetUpPlayers.playerMovements();
		mainPlayerInfo();
		Trap.trap();
		mainPlayerInfo();
		Chance.chance();
		mainPlayerInfo();
	//	Steal.steal();
	//	mainPlayerInfo();
		Invest.invest();
		mainPlayerInfo();
		Party.party();
		mainPlayerInfo();
	//	SetUpPlayers.checkMoney();
		
		SetUpPlayers.myFrame.labelPlayer.setIcon(SetUpPlayers.myFrame.icon1);
		next();
	}	
	public static void next() {
		SetUpPlayers.nextPlayer();
	}
	
	public static void mainPlayerInfo() {
		
		
		SetUpPlayers.myFrame.textInfoPlayerOne.setText(SetUpPlayers.playerOneMain.getName() 
				+ " "+ String.valueOf(SetUpPlayers.playerOneMain.getMoney()) + " лв.");
		
		SetUpPlayers.myFrame.textInfoPlayerTwo.setText(SetUpPlayers.playerTwoMain.getName() 
				+ " "+ String.valueOf(SetUpPlayers.playerTwoMain.getMoney()) + " лв.");
	}

}
