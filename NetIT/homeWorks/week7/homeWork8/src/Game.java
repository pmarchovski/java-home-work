
public class Game {

	public static void game() {

		SetUpPlayers.playerMovement();
		Trap.trap();
		Chance.chance();
		Steal.steal();
		Invest.invest();
		Party.party();
		SetUpPlayers.nextPlayer();
		SetUpPlayers.checkMoney();
		game();
	}
}
