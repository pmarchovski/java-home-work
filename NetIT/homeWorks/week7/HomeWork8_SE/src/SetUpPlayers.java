
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class SetUpPlayers {

	public static FrameDisplay myFrame = new FrameDisplay();
	public static ArrayList<Players> playersCollection = new ArrayList<>();
	public static Players player;
	public static Players playerIndex;
	public static int playerId;
	public static int numberPlayer;
	public static int money;	
	public static int dice;
	public static int currentPosition;
	public static int oldPosition;
	public static Random random = new Random();
	public static String playerOne = "Мариана";
	public static String playerTwo = "Никол";
	public static Players playerOneMain;
	public static Players playerTwoMain;
	
	public static void addPlayersIntoCollection(int id, String name) {
		
		player = new Players(id, name);
		playersCollection.add(player);
		
	}
	public static int setPlayerId() {
		playerId++;	
		return playerId;		
	}
	
	public static void createPlayer() {
		addPlayersIntoCollection(setPlayerId(), playerOne);
		addPlayersIntoCollection(setPlayerId(), playerTwo);
		playerOneMain = playersCollection.get(0);
	    playerTwoMain = playersCollection.get(1);
		
	}
	
	public static void playerIndexCreation() {
		
		if (playerIndex == null) {
			playerIndex = playersCollection.get(firstPlayer());
		} else {
			
	    
		playerIndex = playersCollection.get(numberPlayer);
		}
			
	}
		
	public static void playerMovements() {	
		
		dice = (int) ( 1 + Math.random() * 6);
		currentPosition = playerIndex.getPosition();
			
		playerIndex.setPosition(dice, currentPosition, money);

		money = playerIndex.getMoney();
		playerIndex.setMoney(money);
		
		myFrame.textInfoPlayerPosition.setText("");
		myFrame.textInfoPlayerPosition.setText(" " + playerIndex.getName() + " вие попаднахте на поле :" 
		        + Board.boardPosition[playerIndex.getPosition()].getFieldsName());

		for (int i = 0; i < myFrame.labelsPlayer.length; i++) {
			if (myFrame.labelsPlayer[i].getText().equals(playerIndex.getName())) {
				myFrame.labelsPlayer[i].setText("");
			}
			
		}
		
		myFrame.labelsPlayer[playerIndex.getPosition()].setText(playerIndex.getName());

		playerIndex.displayPosition();

	}
    public static void nextPlayer() {
    	
    	if (playerIndex.getName().equals(playerTwo)) {
    		myFrame.buttonPlayer.setText(playerOne);
    		
    		numberPlayer = 0;	

    	}
    	if (playerIndex.getName().equals(playerOne)) {
    		myFrame.buttonPlayer.setText(playerTwo);

    		numberPlayer = 1;
    	}
    		  	
    	Board.displayBoard();
   
    }
    public static int firstPlayer() {
    	Random random = new Random();
    	int firstPlayer = random.nextInt(1);
    	return firstPlayer;
    }
    
    public static void result() {
    	
    	System.out.println("**** GAME OVER ****");
    		playersCollection.get(0).displayRsults();
    		playersCollection.get(1).displayRsults();
    	}
    public static void checkMoney() {
    	if (playerIndex.getMoney() < 0) {
    		result();
    	}
    }

}
