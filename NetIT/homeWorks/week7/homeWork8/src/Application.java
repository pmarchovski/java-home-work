
public class Application {

	public static void main(String[] args) {

		SetUpPlayers.createPlayer();
		Board.createBoard();
		Invest.createInvestCollection();
		Game.game();
	}
}
