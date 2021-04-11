
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Trap {

	private static Random random = new Random();
	private static String traps[] = {"1. Данъчна ревизия:",
	                                 "2. Развод по котешки:",
	                                 "3. Пропаганда:",
	                                 "4. Проглеждане:",
	                                 "5. Хазартен бос:"};
	
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
			
			int answer = JOptionPane.showConfirmDialog(SetUpPlayers.myFrame.panel, SetUpPlayers.playerIndex.getName() 
					+ " вие попаднахте на поле :"
	                + Board.boardPosition[SetUpPlayers.playerIndex.getPosition()].getFieldsName() 
	                + "\n" +"Все още няма заложени капани \n"
					+ "Искате ли да заложите капан?");
			
			if (answer == JOptionPane.YES_OPTION) {
			
			 String trap = (String)JOptionPane.showInputDialog(SetUpPlayers.myFrame.panel, "Избери капан", "Списък с капани",  
					 JOptionPane.QUESTION_MESSAGE, null, traps, traps[0]);
			
			 int trapType = 0;
		    
			if (trap.equals(traps[0])) {
				SetUpPlayers.playerIndex.trapInvestments(trapInvestments1);
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, "Парите, за тази инвестиция са: " 
				        + trapInvestments1 + " лв.");
				trapType = 1;
			}
			
			if (trap.equals(traps[1])) {
				SetUpPlayers.playerIndex.trapInvestments(trapInvestments2);
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, "Парите, за тази инвестиция са: " 
						+ trapInvestments2 + " лв.");
				trapType = 2;
			}
			if (trap.equals(traps[2])) {
				SetUpPlayers.playerIndex.trapInvestments(trapInvestments3);
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, "Парите, за тази инвестиция са: " 
						+ trapInvestments3 + " лв.");
				trapType = 3;
			}
			if (trap.equals(traps[3])) {
				SetUpPlayers.playerIndex.trapInvestments(trapInvestments4);
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, "Парите, за тази инвестиция са: " 
						+ trapInvestments4 + " лв.");
				trapType = 4;
			}
			if (trap.equals(traps[4])) {
				SetUpPlayers.playerIndex.trapInvestments(trapInvestments5);
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, "Парите, за тази инвестиция са: " 
						+ trapInvestments5 + " лв.");
				trapType = 5;
			}
		
			Board.trap.setType(trapType);
			Board.trap.setFieldsActive(false);
			SetUpPlayers.playerIndex.setProtected(true);
		   
		
			
			} else if (answer == JOptionPane.NO_OPTION){
				Game.next();
			} else if (answer == JOptionPane.CANCEL_OPTION) {
				Game.next();
			}
			
		} 
		
		else if (!Board.trap.isFieldsActive() && Board.boardPosition[SetUpPlayers.playerIndex.getPosition()].
				getFieldsName().equals(Board.trap.getFieldsName())) {
			
			int temp = random.nextInt(30);
			if (SetUpPlayers.playerIndex.isProtected() == true && temp % 3 == 0) {
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, SetUpPlayers.playerIndex.getName() 
						                      + " Вие се спасихте от собствения си капан " 
				                              + Board.trap.getFieldsName());
				
			} else {
						
			if (Board.trap.getType() == 1) {
				SetUpPlayers.playerIndex.trapCharge(charge1);
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, SetUpPlayers.playerIndex.getName() 
                        + " Вие попаднахте на заложен капан: " 
                        + Board.trap.getFieldsName() + " " + traps[0] + " "
                        + " Това ще ви струва: " + charge1 + " лв.");
			}
			if (Board.trap.getType() == 2) {
				SetUpPlayers.playerIndex.trapCharge(charge2);
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, SetUpPlayers.playerIndex.getName() 
                        + " Вие попаднахте на заложен капан: " 
                        + Board.trap.getFieldsName() + " " + traps[1] + " "
                        + " Това ще ви струва: " + charge2 + " лв.");
			}
			if (Board.trap.getType() == 3) {
				SetUpPlayers.playerIndex.trapCharge(charge3);
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, SetUpPlayers.playerIndex.getName() 
                        + " Вие попаднахте на заложен капан: " 
                        + Board.trap.getFieldsName() + " " + traps[2] + " "
                        + " Това ще ви струва: " + charge3 + " лв.");
			}
			if (Board.trap.getType() == 4) {
				SetUpPlayers.playerIndex.trapCharge(charge4);
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, SetUpPlayers.playerIndex.getName() 
                        + " Вие попаднахте на заложен капан: " 
                        + Board.trap.getFieldsName() + " " + traps[3] + " "
                        + " Това ще ви струва: " + charge4 + " лв.");
			}
			if (Board.trap.getType() == 5) {
				SetUpPlayers.playerIndex.trapCharge(charge5);
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, SetUpPlayers.playerIndex.getName() 
                        + " Вие попаднахте на заложен капан: " 
                        + Board.trap.getFieldsName() + " " + traps[4] + " "
                        + " Това ще ви струва: " + charge5 + " лв.");
			}
			
			SetUpPlayers.myFrame.textInfoMoneyLeft.setText(SetUpPlayers.playerIndex.getName() + " разполaгате с: " 
					+ String.valueOf(SetUpPlayers.playerIndex.getMoney()) + " лв.");
			
			}
		}
	}	
}
