
import java.util.Random;
import java.util.Scanner;

public class Trap {

	
	public static Random random = new Random();
	private static Scanner scan = new Scanner(System.in);
	
	public static void trap() {
		int trapInvestments1 = 10;
		int trapInvestments2 = 20;
		int trapInvestments3 = 100;
		int trapInvestments4 = 50;
		int trapInvestments5 = 100;
		int charge1 = 10;
		int charge2 = 100;
		int charge3 = 400;
		int charge4 = 200;
		int charge5 = 150;
		
		if (Board.trap.isFieldsActive() && Board.boardPosition[SetUpPlayers.playerIndex.getPosition()].
				getFieldsName().equals(Board.trap.getFieldsName())) {
			System.out.println("Вие попаднахте на поле *** TRAP ***");
			System.out.println("Все още няма заложени капани");
			System.out.println("Искате ли да заложите капан? y/n");
			String answer = scan.next();
			if (answer.equals("y")) {
				System.out.println("Изберете капан:");
				System.out.println("1. Данъчна ревизия:");
				System.out.println("2. Развод по котешки:");
				System.out.println("3. Пропаганда:");
				System.out.println("4. Проглеждане:");
				System.out.println("5. Хазартен бос:");
			
			int trapType = scan.nextInt();
			if (trapType == 1) SetUpPlayers.playerIndex.trapInvestments(trapInvestments1);
			if (trapType == 2) SetUpPlayers.playerIndex.trapInvestments(trapInvestments2);
			if (trapType == 3) SetUpPlayers.playerIndex.trapInvestments(trapInvestments3);
			if (trapType == 4) SetUpPlayers.playerIndex.trapInvestments(trapInvestments4);
			if (trapType == 5) SetUpPlayers.playerIndex.trapInvestments(trapInvestments5);
			Board.trap.setType(trapType);
			Board.trap.setFieldsActive(false);
			SetUpPlayers.playerIndex.setProtected(true);
			
			} else {
				Game.game();
			}
			
		} 
		
		else if (!Board.trap.isFieldsActive() && Board.boardPosition[SetUpPlayers.playerIndex.getPosition()].
				getFieldsName().equals(Board.trap.getFieldsName())) {
			
			int temp = random.nextInt(30);
			if (SetUpPlayers.playerIndex.isProtected() == true && temp % 3 == 0) {
				System.out.println("Вие се спасихте от собствения си капан");
				
			} else {
			
			System.out.println("Вие попаднахте на заложен капан: " + Board.trap.getType());
			if (Board.trap.getType() == 1) SetUpPlayers.playerIndex.trapCharge(charge1);
			if (Board.trap.getType() == 2) SetUpPlayers.playerIndex.trapCharge(charge2);
			if (Board.trap.getType() == 3) SetUpPlayers.playerIndex.trapCharge(charge3);
			if (Board.trap.getType() == 4) SetUpPlayers.playerIndex.trapCharge(charge4);
			if (Board.trap.getType() == 5) SetUpPlayers.playerIndex.trapCharge(charge5);
			}
		}
	}
	
}
