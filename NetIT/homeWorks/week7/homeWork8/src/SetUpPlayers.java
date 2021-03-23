import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SetUpPlayers {

	public static ArrayList<Players> playersCollection = new ArrayList<>();
	public static Players player;
	public static Players playerIndex;
	public static int playerId;
	public static int numberPlayer;
	public static int money;	
	public static int dice;
	public static int currentPosition;
	public static Random random = new Random();
	private static Scanner scan = new Scanner(System.in);
	private static String playerOne = "Мариана";
	private static String playerTwo = "Никол";
	
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
		
	}
	
	public static void playerMovement() {
		
		if (playerIndex == null) {
			playerIndex = playersCollection.get(firstPlayer());
		} else {
			numberPlayer = scan.nextInt();	
		playerIndex = playersCollection.get(numberPlayer);
		}
			
		dice = random.nextInt(4);
			
		playerIndex.setPosition(dice, currentPosition, money);

		money = playerIndex.getMoney();
		playerIndex.setMoney(money);
		
		currentPosition = playerIndex.getPosition();
		
		System.out.println("");
		System.out.println(playerIndex.getName() + " вие сте на поле :" 
		        + Board.boardPosition[playerIndex.getPosition()].getFieldsName());
		
		Board.boardPosition[playerIndex.getPosition()].getFieldsName();
		playerIndex.displayPosition();
		
	}
    public static void nextPlayer() {
    	System.out.println("");
    	if (playerIndex.getName().equals("Никол")) System.out.println(playerOne + " е наред \n" + "кликни 0");
    	if (playerIndex.getName().equals(playerOne)) System.out.println(playerTwo + " е наред \n" + "кликни 1");
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
